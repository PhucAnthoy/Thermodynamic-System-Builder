package Model;

/*
 * This class should only communicate with Tables.java and any block classes
 */
/**
 * Methods used to fix the state of a thermodynamic system
 * Currently this class will only work for water
 *
 * @author Anthony Tran
 * @since 2017-09-18
 */
public class FixState {

    /**
     * This enum will be what state types are possible for a flow
     */
    enum StateType {
        SATURATED, SUPERHEATED, COMPRESSED;


    }

    /**
     * This method checks which state type the user input belongs to
     * Depending on which state, there are different tables used and different requirements to fix the state
     * Please list the arguments in order of their index. It just makes coding this a bit easier
     * In other words, please have firstIndex < secondIndex
     *
     * @param firstProperty     This is the first user given value
     * @param firstIndex        This is the index of the first value
     * @param secondProperty    This is the second user given value
     * @param secondIndex       This is the index of the second value
     * @return the type of state that the flow is currently in
     */
    //Right now it returns a boolean, but when finished should return StateType
    public boolean checkSaturation(Double firstProperty, Tables.Index firstIndex, Double secondProperty, Tables.Index secondIndex) {
        //This bit of code ensures that the method was given two different properties and that they were ordered
        //I don't know if this is how I should be using exceptions
        if (firstIndex.equals(secondIndex)) {
            System.out.println("Can you fucking not?");
            throw new IllegalArgumentException("cannot use same property type");
        } else if (firstIndex.index > secondIndex.index) {
            System.out.println("fucking put the properties in order pls");
            throw new IllegalArgumentException("this isn't the right exception, but I just needed to stop the code");
        }

        //This checks the state of the flow using code specific to the combination of properties given
        switch (firstIndex) {
            //Checking for temperature and pressure is easy as both pull the saturated state values
            //and compare them to the second property given
            case TEMPERATURE:
                Double[] state = pullSaturatedState(firstProperty, firstIndex);
                switch (secondIndex) {
                    //If the second state was pressure, then if pressure equals the value from the saturated state,
                    //then the state is in saturation, else the state is either superheated or compressed
                    case PRESSURE:
                        if (state[1].equals(secondProperty)) {
                            //saturated
                            return true;
                        } else {
                            //need to check if superheated or compressed
                            System.out.println("idk what to do here");
                        }
                        break;
                    //For all properties that aren't pressure, if they are within range of the values listed in the table,
                    //then the state is saturated. Else, if lower, state is superheated, if higher, state is compressed
                    default:
                        int saturatedIndex = 2 * (secondIndex.index - 1);
                        Double saturatedLiquid = state[saturatedIndex];
                        Double saturatedVapor = state[saturatedIndex + 1];
                        if (secondProperty < saturatedLiquid) {
                            //superheated
                        } else if (secondProperty > saturatedVapor) {
                            //compressed
                        } else {
                            //saturated
                        }
                        break;
                }
                break;
            //I'm lazy. Read comments for the previous case and switch temperature and pressure
            case PRESSURE:
                state = pullSaturatedState(firstProperty, firstIndex);
                switch (secondIndex) {
                    case TEMPERATURE:
                        //This should never happen, but in case it does
                        throw new IllegalStateException("properties should be listed in order");
                    default:
                        int saturatedIndex = 2 * (secondIndex.index - 1);
                        Double saturatedLiquid = state[saturatedIndex];
                        Double saturatedVapor = state[saturatedIndex + 1];
                        if (secondProperty < saturatedLiquid) {
                            //superheated
                        } else if (secondProperty > saturatedVapor) {
                            //compressed
                        } else {
                            //saturated
                        }
                        break;
                }
            case SPECIFIC_VOLUME:
            case INTERNAL_ENERGY:
            case ENTHALPY:
            case ENTROPY:
                //I actually can't remember a way to fix the state with these.
                //I'll add it if I ever remember
                break;
            default:
                throw new IllegalStateException("something other than the properties in the Index enum was used");
        }
        return false;
    }

    /**
     * This method pulls property values when the state is in the saturated range
     * This actually doesn't work with any property other than temperature and pressure right now
     *
     * @param property This must be either temperature or pressure
     * @param propertyIndex 0 for temperature, 1 for pressure
     * @return an ArrayList(Double) containing property values at the specified state
     */
    public Double[] pullSaturatedState(Double property, Tables.Index propertyIndex) {
        int index = propertyIndex.index;

        if (index > 1) {
            throw new IllegalArgumentException("sorry, this can only use temp and pres right now");
        }

        //This will contain the final values to be returned
        Double[] state = new Double[10];

        //Goes through every value in the table and checks with the given value
        for (int i = 0; i < Tables.WATER_SATURATED[index].length; i++) {
            Double currentValue = Tables.WATER_SATURATED[index][i];

            //When given value equals the current value, state will be given values at that state
            if (property.equals(currentValue)) {
                for (int j = 0; j < 10; j++) {
                    state[j] = Tables.WATER_SATURATED[j][i];
                }
                break;

            //When the given value is not between any value on the table, throw an exception
            } else if (property < Tables.WATER_SATURATED[index][0] || property > Tables.WATER_SATURATED[index][119]) {
                throw new IllegalStateException("property value and index should not have been passed to this method");

            //When the table value is now higher than the given value, grab the states above and below the given
            } else if (property < currentValue) {
                Double[] below = new Double[10];
                for (int j = 0; j < 10; j++) {
                    state[j] = Tables.WATER_SATURATED[j][i];
                    below[j] = Tables.WATER_SATURATED[j][i-1];
                }

                //Calculates the factor for linear interpolation, and passes the factor and states to linearInterpolation
                Double factor = (property - currentValue) / (Tables.WATER_SATURATED[index][i-1] - currentValue);
                state = linearInterpolation(factor, state, below);
                break;
            }
        }
        return state;
    }

    /**
     * This method is used whenever the state property data was not tabulated,
     * i.e whenever the table doesn't have the exact value you have
     *
     * Basically, represents the higher and lower arrays as two points on a graph
     * The argument factor is like the slope, and this method finds a point along the line
     * that include the property used to calculate the factor
     *
     * @param factor This is the basically the slope used.
     *               Used in the form (propertyGiven - stateHigher) / (stateLower - stateHigher)
     * @param higher ArrayList containing values of the state above the given value
     * @param lower  ArrayList containing values of the state below the given value
     * @return ArrayList containing values of the state at the given value
     */
    public Double[] linearInterpolation(Double factor, Double[] higher, Double[] lower) {
        if (higher.length != lower.length) {
            throw new IllegalArgumentException("size mismatch between the provided states");
        }
        Double[] result = new Double[higher.length];
        for (int i = 0; i < higher.length; i++) {
            Double interpolated = higher[i] + factor * (lower[i] - higher[i]);
            result[i] = interpolated;
        }
        return result;
    }

  /**
  // * This was just for testing purposes
  // *
    public static void main(String[] args) {
        FixState test = new FixState();
        Double[] high = {1.,2.,3.};
        Double[] low = {4.,5.};

        for (Double x: test.pullSaturatedState(0.0, 0)) {
            System.out.println(x);
        }

    }//*/
}

