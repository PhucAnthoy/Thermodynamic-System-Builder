package Model;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Hoyin, ignore this class. I just used it to combine some tables
 */
public class CombineTables {
    public static void main(String[] args) {
        ArrayList<ArrayList<Double>> newTable = new ArrayList<>();
        ArrayList<Double> temperature;
        ArrayList<Double> pressure;
        ArrayList<Double> name = new ArrayList<>();
        //ArrayList<Double> test = new ArrayList<>();
        boolean flag = true;
        int x = 0;
        int y = 0;
        int z = 9;

        while(flag) {
            Double temp = Tables.WATER_SATURATED_TEMPERATURE[0][x];
            Double pres = Tables.WATER_SATURATED_PRESSURE[1][y];

            if (temp < pres) {
                temp = Tables.WATER_SATURATED_TEMPERATURE[z][x];
                name.add(temp);
                x++;
            } else {
                pres = Tables.WATER_SATURATED_PRESSURE[z][y];
                name.add(pres);
                y++;
            }
            if (x >= 70) {
                while (y < 50) {
                    pres = Tables.WATER_SATURATED_PRESSURE[z][y];
                    name.add(pres);
                    y++;
                }
                flag = false;
            } else if (y >= 50) {
                while (x < 70) {
                    temp = Tables.WATER_SATURATED_TEMPERATURE[z][x];
                    name.add(temp);
                    x++;
                }
                flag = false;
            }
        }

        System.out.println(name.size());
        System.out.println(name);
        Collections.sort(name);
        System.out.println(name);
    }
}
