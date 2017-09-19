package Model;

import java.util.ArrayList;

/**
 * Methods used to fix the state of a thermodynamic system
 *
 * @author Anthony Tran
 * @since 2017-09-18
 */
public class FixState {
    private enum TableNames {
        WATER_SATURATED_TEMPERATURE, WATER_SATURATED_PRESSURE, WATER_SUPERHEATED, WATER_COMPRESSED;
    }

    /**
     * This method pulls property values when the state is in the saturated range
     *
     * @param property This must be either temperature or pressure
     * @param index 0 for temperature, 1 for pressure
     * @return an ArrayList(Double) containing property values at the specified state
     */
    public ArrayList<Double> pullSaturatedState(Double property, int index) {
        return new ArrayList<Double>();
    }

    public ArrayList<Double> linearInterpolation() {
        return new ArrayList<Double>();
    }
}

