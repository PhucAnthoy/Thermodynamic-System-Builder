package Model;

import com.sun.tools.javac.util.Name;

import java.util.ArrayList;

/**
 * Methods used to fix the state of a thermodynamic system
 *
 * @author Anthony Tran
 * @since 2017-09-18
 */
public class FixState {

    public void checkSaturation() {

    }

    /**
     * This method pulls property values when the state is in the saturated range
     *
     * @param property This must be either temperature or pressure
     * @param index 0 for temperature, 1 for pressure
     * @return an ArrayList(Double) containing property values at the specified state
     */
    public Double[] pullSaturatedState(Double property, int index) {
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
            } else if (property < Tables.WATER_SATURATED[index][0] || property > Tables.WATER_SATURATED[index][119]) {
                //throw something;
                break;
            } else if (property < currentValue) {
                Double[] temporary = new Double[10];
                for (int j = 0; j < 10; j++) {
                    state[j] = Tables.WATER_SATURATED[j][i];
                    temporary[j] = Tables.WATER_SATURATED[j][i-1];
                }
                Double factor = (property - currentValue) / (Tables.WATER_SATURATED[index][i-1] - currentValue);
                state = linearInterpolation(factor, state, temporary);
                break;
            }
        }
        return state;
    }

    /**
     * This method is used whenever the state property data was not tabulated,
     * i.e whenever the table doesn't have the exact value you have
     *
     * @param factor This is the basically the slope used.
     *               Used in the form (propertyGiven - stateHigher) / (stateLower - stateHigher)
     * @param higher ArrayList containing values of the state above the given value
     * @param lower  ArrayList containing values of the state below the given value
     * @return ArrayList containing values of the state at the given value
     */
    public Double[] linearInterpolation(Double factor, Double[] higher, Double[] lower) {
        if (higher.length != lower.length) {
            throw new IllegalArgumentException();
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

        for (Double x: test.linearInterpolation(12., high, low)) {
            System.out.println(x);
        }

    }//*/
}

