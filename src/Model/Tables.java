package Model;

import java.util.ArrayList;

/*
 * This class will be just hardcoded values for experimental data
 * Currently has methods that retrieve data and compute state values
 */

/**
 * Tabulated data for various states of water
 *
 * @author Anthony Tran
 * @since 2017-09-16 (this is a lie)
 */
public class Tables {
    /*
     * Standard property indexing will be as follows:
     *
     * 1) Temperature
     * 2) Pressure
     * 3) Specific Volume
     * 4) Internal Energy
     * 5) Enthalpy
     * 6) Entropy
     */

    /**
     * Combination of the water saturated tables
     */
    protected static final Double[][] WATER_SATURATED = {
            /* Properties in Array:
             * 0) Temperature (T) [degrees C]
             * 1) Pressure (P) [bar]
             * 2) Sat Liquid Specific Volume (vf) [m^3/kg]
             * 3) Sat Vapor Specific Volume (vg) [m^3/kg]
             * 4) Sat Liquid Internal Energy (uf) [kJ/kg]
             * 5) Sat Vapor Internal Engery (ug) [kJ/kg]
             * 6) Sat Liquid Enthalpy (hf) [kJ/kg]
             * 7) Sat Vapor Enthalpy (hg) [kJ/kg]
             * 8) Sat Liquid Entropy (sf) [kJ/kg K]
             * 9) Sat Vapor Entropy (sg) [kJ/kg K]
            */

            //Temperature
            {0.01,   4.0,   5.0,   6.0,   8.0,
             10.0,  11.0,  12.0,  13.0,  14.0,
             15.0,  16.0,  17.0,  18.0,  19.0,
             20.0,  21.0,  22.0,  23.0,  24.0,
             25.0,  26.0,  27.0,  28.0, 28.96,

             29.0,  30.0,  31.0,  32.0,  33.0,
             34.0,  35.0,  36.0, 36.16,  38.0,
             40.0, 41.51,  45.0, 45.81,  50.0,
             55.0,  60.0, 60.06,  65.0,  69.1,
             70.0,  75.0, 75.87,  80.0, 81.33,

             85.0, 85.94, 89.95,  90.0,  93.5,
             95.0, 96.71, 99.63, 100.0, 110.0,
            111.4, 120.0, 120.2, 127.4, 130.0,
            133.6, 138.9, 140.0, 143.6, 147.9,
            150.0, 151.9, 158.9, 160.0, 165.0,

            170.0, 170.4, 175.4, 179.9, 180.0,
            190.0, 198.3, 200.0, 210.0, 212.4,
            220.0, 224.0, 230.0, 233.9, 240.0,
            242.6, 250.0, 250.4, 257.5, 260.0,
            264.0, 270.0, 275.6, 280.0, 285.9,

            290.0, 295.1, 300.0, 303.4, 311.1,
            318.2, 320.0, 324.8, 330.9, 336.8,
            340.0, 342.2, 347.4, 352.4, 357.1,
            360.0, 361.5, 365.8, 374.1, 374.14},

            //Pressure
            {0.00611, 0.00813, 0.00872, 0.00935, 0.01072,
             0.01228, 0.01312, 0.01402, 0.01497, 0.01598,
             0.01705, 0.01818, 0.01938, 0.02064, 0.02198,
             0.02339, 0.02487, 0.02645,  0.0281, 0.02985,
             0.03169, 0.03363, 0.03567, 0.03782,    0.04,

             0.04008, 0.04246, 0.04496, 0.04759, 0.05034,
             0.05324, 0.05628, 0.05947,    0.06, 0.06632,
             0.07384,    0.08, 0.09593,     0.1,  0.1235,
              0.1576,  0.1994,     0.2,  0.2503,     0.3,
              0.3119,  0.3858,     0.4,  0.4739,     0.5,

              0.5783,     0.6,     0.7,  0.7014,     0.8,
              0.8455,     0.9,     1.0,   1.014,   1.433,
                 1.5,   1.985,     2.0,     2.5,   2.701,
                 3.0,     3.5,   3.613,     4.0,     4.5,
               4.758,     5.0,     6.0,   6.178,     7.0,

               7.917,     8.0,     9.0,    10.0,   10.02,
               12.54,    15.0,   15.54,   19.06,    20.0,
               23.18,    25.0,   27.95,    30.0,   33.44,
                35.0,   39.73,    40.0,    45.0,   46.88,
                50.0,   54.99,    60.0,   64.12,    70.0,

               74.36,    80.0,   85.81,    90.0,   100.0,
               110.0,   112.7,   120.0,   130.0,   140.0,
               145.9,   150.0,   160.0,   170.0,   180.0,
               186.5,   190.0,   200.0,   220.9,   220.9},

            //Saturated Liquid Specific Volume
            {0.0010002, 0.0010001, 0.0010001, 0.0010001, 0.0010002,
             0.0010004, 0.0010004, 0.0010005, 0.0010007, 0.0010008,
             0.0010009, 0.0010011, 0.0010012, 0.0010014, 0.0010016,
             0.0010018, 0.0010020, 0.0010022, 0.0010024, 0.0010027,
             0.0010029, 0.0010032, 0.0010035, 0.0010037, 0.0010040,

             0.0010040, 0.0010043, 0.0010046, 0.0010050, 0.0010053,
             0.0010056, 0.0010060, 0.0010063, 0.0010064, 0.0010071,
             0.0010078, 0.0010084, 0.0010099, 0.0010102, 0.0010121,
             0.0010146, 0.0010172, 0.0010172, 0.0010199, 0.0010223,
             0.0010228, 0.0010259, 0.0010265, 0.0010291, 0.0010300,

             0.0010325, 0.0010331, 0.0010360, 0.0010360, 0.0010380,
             0.0010397, 0.0010410, 0.0010432, 0.0010435, 0.0010516,
             0.0010528, 0.0010603, 0.0010605, 0.0010672, 0.0010697,
             0.0010732, 0.0010786, 0.0010797, 0.0010836, 0.0010882,
             0.0010905, 0.0010926, 0.0011006, 0.0011020, 0.0011080,

             0.0011143, 0.0011148, 0.0011212, 0.0011273, 0.0011274,
             0.0011414, 0.0011539, 0.0011565, 0.0011726, 0.0011767,
             0.0011900, 0.0011973, 0.0012088, 0.0012165, 0.0012291,
             0.0012347, 0.0012512, 0.0012522, 0.0012692, 0.0012755,
             0.0012859, 0.0013023, 0.0013187, 0.0013321, 0.0013513,

             0.0013656, 0.0013842, 0.0014036, 0.0014178, 0.0014524,
             0.0014886, 0.0014988, 0.0015267, 0.0015671, 0.0016107,
             0.0016379, 0.0016581, 0.0017107, 0.0017702, 0.0018397,
             0.0018925, 0.0019243, 0.0020360, 0.0031550, 0.0031550},

            //Saturated Vapor Specific Volume
            {206.136,  157.232,   147.12,  137.734,  120.917,
             106.379,   99.857,   93.784,   88.124,   82.848,
              77.926,   73.333,   69.044,   65.038,   61.293,
              57.791,   54.514,   51.447,   48.574,   45.883,
               43.36,   40.994,   38.774,    36.69,     34.8,
              34.733,   32.894,   31.165,    29.54,   28.011,
              26.571,   25.216,    23.94,   23.739,   21.602,
              19.523,   18.103,   15.258,   14.674,   12.032,
               9.568,    7.671,    7.649,    6.197,    5.229,
               5.042,    4.131,    3.993,    3.407,     3.24,
               2.828,    2.732,    2.365,    2.361,    2.087,
               1.982,    1.869,    1.694,    1.673,     1.21,
               1.159,   0.8919,   0.8857,   0.7187,   0.6685,
              0.6058,   0.5243,   0.5089,   0.4625,    0.414,
              0.3928,   0.3749,   0.3157,   0.3071,   0.2729,
              0.2428,   0.2404,    0.215,   0.1944,   0.1941,
              0.1565,   0.1318,   0.1274,   0.1044,  0.09963,
             0.08619,  0.07998,  0.07158,  0.06668,  0.05976,
             0.05707,  0.05013,  0.04978,  0.04406,  0.04221,
             0.03944,  0.03564,  0.03244,  0.03017,  0.02737,
             0.02557,  0.02352,  0.02167,  0.02048,  0.01803,
             0.01599,  0.01549,  0.01426,  0.01278,  0.01149,
              0.0108,  0.01034, 0.009306, 0.008364, 0.007489,
            0.006945, 0.006657, 0.005834, 0.003155, 0.003155},

            //Saturated Liquid Internal Energy
            {  0.0,  16.77,  20.97,  25.19,  33.59,
              42.0,   46.2,  50.41,   54.6,  58.79,
             62.99,  67.18,  71.38,  75.57,  79.76,
             83.95,  88.14,  92.32,  96.51,  100.7,
            104.88, 109.06, 113.25, 117.42, 121.45,

             121.6, 125.78, 129.96, 134.14, 138.32,
             142.5, 146.67, 150.85, 151.53,  159.2,
            167.56, 173.87, 188.44, 191.82, 209.32,
            230.21, 251.11, 251.38, 272.02,  289.2,
            292.95,  313.9, 317.53, 334.86, 340.44,

            355.84, 359.79, 376.63, 376.85, 391.58,
            397.88, 405.06, 417.36, 418.94, 461.14,
            466.94,  503.5, 504.49,  535.1, 546.02,
            561.15, 583.95, 588.74, 604.31, 622.25,
            631.68, 639.68,  669.9, 674.86, 696.44,

            718.33, 720.22, 741.83, 761.68, 762.09,
            806.19, 843.16, 850.65, 895.53, 906.44,
            940.87, 959.11, 986.74, 1004.8, 1033.2,
            1045.4, 1080.4, 1082.3, 1116.2, 1128.4,
            1147.8, 1177.4, 1205.4, 1227.5, 1257.6,

            1278.9, 1305.6, 1332.0, 1350.5, 1393.0,
            1433.7, 1444.6, 1473.0, 1511.1, 1548.6,
            1570.3, 1585.6, 1622.7, 1660.2, 1698.9,
            1725.2, 1739.9, 1785.6, 2029.6, 2029.6},

            //Saturated Vapor Internal Energy
            {2375.3, 2380.9, 2382.3, 2383.6, 2386.4,
             2389.2, 2390.5, 2391.9, 2393.3, 2394.7,
             2396.1, 2397.4, 2398.8, 2400.2, 2401.6,
             2402.9, 2404.3, 2405.7, 2407.0, 2408.4,
             2409.8, 2411.1, 2412.5, 2413.9, 2415.2,

             2415.2, 2416.6, 2418.0, 2419.3, 2420.7,
             2422.0, 2423.4, 2424.7, 2425.0, 2427.4,
             2430.1, 2432.2, 2436.8, 2437.9, 2443.5,
             2450.1, 2456.6, 2456.7, 2463.1, 2468.4,
             2469.6, 2475.9, 2477.0, 2482.2, 2483.9,

             2488.4, 2489.6, 2494.5, 2494.5, 2498.8,
             2500.6, 2502.6, 2506.1, 2506.5, 2518.1,
             2519.7, 2529.3, 2529.5, 2537.2, 2539.9,
             2543.6, 2546.9, 2550.0, 2553.6, 2557.6,
             2559.5, 2561.2, 2567.4, 2568.4, 2572.5,

             2576.5, 2576.8, 2580.5, 2583.6, 2583.7,
             2590.0, 2594.5, 2595.3, 2599.5, 2600.3,
             2602.4, 2603.1, 2603.9, 2604.1, 2604.0,
             2603.7, 2602.4, 2602.3, 2600.1, 2599.0,
             2597.1, 2593.7, 2589.7, 2586.1, 2580.5,

             2576.0, 2569.8, 2563.0, 2557.8, 2544.4,
             2529.8, 2525.5, 2513.7, 2496.1, 2476.8,
             2464.6, 2455.5, 2431.7, 2405.0, 2374.3,
             2351.5, 2338.1, 2293.0, 2029.6, 2029.6},

            //Saturated Liquid Enthalpy
            { 0.01,  16.78,  20.98,   25.2,   33.6,
             42.01,   46.2,  50.41,   54.6,   58.8,
             62.99,  67.19,  71.38,  75.58,  79.77,
             83.96,  88.14,  92.33,  96.52,  100.7,
            104.89, 109.07, 113.25, 117.43, 121.46,

            121.61, 125.79, 129.97, 134.15, 138.33,
             142.5, 146.68, 150.86, 151.53, 159.21,
            167.57, 173.88, 188.45, 191.83, 209.33,
            230.23, 251.13,  251.4, 272.06, 289.23,
            292.98, 313.93, 317.58, 334.91, 340.49,

             355.9, 359.86,  376.7, 376.92, 391.66,
            397.96, 405.15, 417.46, 419.04,  461.3,
            467.11, 503.71,  504.7, 535.37, 546.31,
            561.47, 584.33, 589.13, 604.74, 623.25,
             632.2, 640.23, 670.56, 675.55, 697.22,

            719.21, 721.11, 742.83, 762.81, 763.22,
            807.62, 844.84, 852.45, 897.76, 908.79,
            943.62, 962.11, 990.12, 1008.4, 1037.3,
            1049.8, 1085.4, 1087.3, 1121.9, 1134.4,
            1154.2, 1184.5, 1213.4, 1236.0, 1267.0,

            1289.1, 1316.6, 1344.0, 1363.3, 1407.6,
            1450.1, 1461.5, 1491.3, 1531.5, 1571.1,
            1594.2, 1610.5, 1650.1, 1690.3, 1732.0,
            1760.5, 1776.5, 1826.3, 2099.3, 2099.3},

            //Saturated Vapor Enthalpy
            {2501.4, 2508.7, 2510.6, 2512.4, 2516.1,
             2519.8, 2521.6, 2523.4, 2525.3, 2527.1,
             2528.9, 2530.8, 2532.6, 2534.4, 2536.2,
             2538.1, 2539.9, 2541.7, 2543.5, 2545.4,
             2547.2, 2549.0, 2550.8, 2552.6, 2554.4,

             2554.5, 2556.3, 2558.1, 2559.9, 2561.7,
             2563.5, 2565.3, 2567.1, 2567.4, 2570.7,
             2574.3, 2577.0, 2583.2, 2584.7, 2592.1,
             2600.9, 2609.6, 2609.7, 2618.3, 2625.3,
             2626.8, 2635.3, 2636.8, 2643.7, 2645.9,

             2651.9, 2653.5, 2660.0, 2660.1, 2665.8,
             2668.1, 2670.9, 2675.5, 2676.1, 2691.5,
             2693.6, 2706.3, 2706.7, 2716.9, 2720.5,
             2725.3, 2732.4, 2733.9, 2738.6, 2743.9,
             2746.5, 2748.7, 2756.8, 2758.1, 2763.5,

             2768.7, 2769.1, 2773.9, 2778.1, 2778.2,
             2786.4, 2792.2, 2793.2, 2798.5, 2799.5,
             2802.1, 2803.1, 2804.0, 2804.2, 2803.8,
             2803.4, 2801.5, 2801.4, 2798.3, 2796.6,
             2794.3, 2789.7, 2784.3, 2779.6, 2772.1,

             2766.2, 2758.0, 2749.0, 2742.1, 2724.7,
             2705.6, 2700.1, 2684.9, 2662.2, 2637.6,
             2622.0, 2610.5, 2580.6, 2547.2, 2509.1,
             2481.0, 2464.5, 2409.7, 2099.3, 2099.3},

            //Saturated Liquid Entropy
            {  0.0,  0.061, 0.0761, 0.0912, 0.1212,
             0.151, 0.1658, 0.1806, 0.1953, 0.2099,
            0.2245,  0.239, 0.2535, 0.2679, 0.2823,
            0.2966, 0.3109, 0.3251, 0.3393, 0.3534,
            0.3674, 0.3814, 0.3954, 0.4093, 0.4226,

            0.4231, 0.4369, 0.4507, 0.4644, 0.4781,
            0.4917, 0.5053, 0.5188,  0.521, 0.5458,
            0.5725, 0.5926, 0.6387, 0.6493, 0.7038,
            0.7679, 0.8312,  0.832, 0.8935, 0.9439,
            0.9549, 1.0155, 1.0259, 1.0753,  1.091,

            1.1343, 1.1453, 1.1919, 1.1925, 1.2329,
              1.25, 1.2695, 1.3026, 1.3069, 1.4185,
            1.4336, 1.5276, 1.5301, 1.6072, 1.6344,
            1.6718, 1.7275, 1.7391, 1.7766, 1.8207,
            1.8418, 1.8607, 1.9312, 1.9427, 1.9922,

            2.0419, 2.0462, 2.0946, 2.1387, 2.1396,
            2.2359,  2.315, 2.3309, 2.4248, 2.4474,
            2.5178, 2.5547, 2.6099, 2.6457, 2.7015,
            2.7253, 2.7927, 2.7964,  2.861, 2.8838,
            2.9202, 2.9751, 3.0267, 3.0668, 3.1211,

            3.1594, 3.2068, 3.2534, 3.2858, 3.3596,
            3.4295,  3.448, 3.4962, 3.5606, 3.6232,
            3.6594, 3.6848, 3.7461, 3.8079, 3.8715,
            3.9147, 3.9388, 4.0139, 4.4298, 4.4298},

            //Saturated Vapor Entropy
            {9.1562, 9.0514, 9.0257, 9.0003, 8.9501,
             8.9008, 8.8765, 8.8524, 8.8285, 8.8048,
             8.7814, 8.7582, 8.7351, 8.7123, 8.6897,
             8.6672,  8.645, 8.6229, 8.6011, 8.5794,
              8.558, 8.5367, 8.5156, 8.4946, 8.4746,
             8.4739, 8.4533, 8.4329, 8.4127, 8.3927,
             8.3728, 8.3531, 8.3336, 8.3304,  8.295,
              8.257, 8.2287, 8.1648, 8.1502, 8.0763,
             7.9913, 7.9096, 7.9085,  7.831, 7.7686,
             7.7553, 7.6824,   7.67, 7.6122, 7.5939,
             7.5445,  7.532, 7.4797, 7.4791, 7.4346,
             7.4159, 7.3949, 7.3594, 7.3549, 7.2387,
             7.2233, 7.1296, 7.1271, 7.0527, 7.0269,
             6.9919, 6.9405, 6.9299, 6.8959, 6.8565,
             6.8379, 6.8212,   6.76, 6.7502,  6.708,
             6.6663, 6.6628, 6.6226, 6.5863, 6.5857,
             6.5079, 6.4448, 6.4323, 6.3585, 6.3409,
             6.2861, 6.2575, 6.2146, 6.1869, 6.1437,
             6.1253,  6.073, 6.0701, 6.0199, 6.0019,
             5.9734, 5.9301, 5.8892, 5.8571, 5.8133,
             5.7821, 5.7432, 5.7045, 5.6772, 5.6141,
             5.5527, 5.5362, 5.4924, 5.4323, 5.3717,
             5.3357, 5.3098, 5.2455, 5.1777, 5.1044,
             5.0526, 5.0228, 4.9269, 4.4298, 4.4298}
    };

    /**
     * Currently in progress of restructuring the superheated water table
     */
    protected static final Double[][] WATER_SUPER = {
            //Temperature
            {36.16, 80.00, 120.0, 160.0, 200.0, 240.0, 280.0, 320.0, 360.0, 400.0, 440.0, 500.0,
             72.69, 80.00, 120.0, 160.0, 200.0, 240.0, 280.0, 320.0, 360.0, 400.0, 440.0, 500.0,
             89.95, 100.0, 120.0, 160.0, 200.0, 240.0, 280.0, 320.0, 360.0, 400.0, 440.0, 500.0,
             99.63, 100.0, 120.0, 160.0, 200.0, 240.0, 280.0, 320.0, 360.0, 400.0, 440.0, 500.0,
            111.37, 120.0, 160.0, 200.0, 240.0, 280.0, 320.0, 360.0, 400.0, 440.0, 500.0, 600.0,
            133.55,        160.0, 200.0, 240.0, 280.0, 320.0, 360.0, 400.0, 440.0, 500.0, 600.0,
            151.86, 180.0, 200.0, 240.0, 280.0, 320.0, 360.0, 400.0, 440.0, 500.0, 600.0, 700.0,
            164.97, 180.0, 200.0, 240.0, 280.0, 320.0, 360.0, 400.0, 440.0, 500.0, 600.0, 700.0,
            179.91, 200.0, 240.0, 280.0, 320.0, 360.0, 400.0, 440.0, 500.0, 540.0, 600.0, 700.0,
            198.32, 200.0, 240.0, 280.0, 320.0, 360.0, 400.0, 440.0, 500.0, 540.0, 600.0, 700.0,
            212.42, 240.0, 280.0, 320.0, 360.0, 400.0, 440.0, 500.0, 540.0, 600.0, 640.0, 700.0,
            233.90, 240.0, 280.0, 320.0, 360.0, 400.0, 440.0, 500.0, 540.0, 600.0, 640.0, 700.0,
            250.40, 280.0, 320.0, 360.0, 400.0, 440.0, 500.0, 540.0, 600.0, 640.0, 700.0, 740.0,
            275.64, 280.0, 320.0, 360.0, 400.0, 440.0, 500.0, 540.0, 600.0, 640.0, 700.0, 740.0,
            295.06, 320.0, 360.0, 400.0, 440.0, 480.0, 520.0, 560.0, 600.0, 640.0, 700.0, 740.0,
            311.06, 320.0, 360.0, 400.0, 440.0, 480.0, 520.0, 560.0, 600.0, 640.0, 700.0, 740.0,
            324.75, 360.0, 400.0, 440.0, 480.0, 520.0, 560.0, 600.0, 640.0, 700.0, 740.0,
            336.75, 360.0, 400.0, 440.0, 480.0, 520.0, 560.0, 600.0, 640.0, 700.0, 740.0,
            347.44, 360.0, 400.0, 440.0, 480.0, 520.0, 560.0, 600.0, 640.0, 700.0, 740.0,
            357.06, 360.0, 400.0, 440.0, 480.0, 520.0, 560.0, 600.0, 640.0, 700.0, 740.0,
            365.81, 400.0, 440.0, 480.0, 520.0, 560.0, 600.0, 640.0, 700.0, 740.0, 800.0,
                    400.0, 440.0, 480.0, 520.0, 560.0, 600.0, 640.0, 700.0, 740.0, 800.0,
                    400.0, 440.0, 480.0, 520.0, 560.0, 600.0, 640.0, 700.0, 740.0, 800.0, 900.0,
                    400.0, 440.0, 480.0, 520.0, 560.0, 600.0, 640.0, 700.0, 740.0, 800.0, 900.0}
    };

    /**
     * Reformatted the compressed water table to adhere to the standardize property index
     */
    protected static final Double[][] WATER_COMPRESSED = {
            //Temperature
            {20.0, 40.0,  80.0, 100.0, 140.0, 180.0, 200.0, 220.0, 223.99,
             20.0, 40.0,  80.0, 100.0, 140.0, 180.0, 200.0, 220.0, 263.99,
             20.0, 40.0,  80.0, 100.0, 140.0, 180.0, 220.0, 260.0, 290.59,
             20.0, 40.0,  80.0, 100.0, 140.0, 180.0, 220.0, 260.0, 311.06,
             20.0, 40.0,  80.0, 100.0, 140.0, 180.0, 220.0, 260.0, 300.00, 342.24,
             20.0, 40.0,  80.0, 100.0, 140.0, 180.0, 220.0, 260.0, 300.00, 365.81,
             20.0, 40.0, 100.0, 200.0, 300.0,
             20.0, 40.0, 100.0, 200.0, 300.0},

            //Pressure
            {25.0,  25.0,  25.0,  25.0,  25.0,  25.0,  25.0,  25.0,  25.0,
             50.0,  50.0,  50.0,  50.0,  50.0,  50.0,  50.0,  50.0,  50.0,
             75.0,  75.0,  75.0,  75.0,  75.0,  75.0,  75.0,  75.0,  75.0,
            100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0, 100.0,
            150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0, 150.0,
            200.0, 200.0, 200.0, 200.0, 200.0, 200.0, 200.0, 200.0, 200.0, 200.0,
            250.0, 250.0, 250.0, 250.0, 250.0,
            300.0, 300.0, 300.0, 300.0, 300.0},

            //Specific Volume
            {0.0010006, 0.0010067, 0.0010280, 0.0010423, 0.0010784, 0.0011261, 0.0011555, 0.0011898, 0.0011973,
             0.0009995, 0.0010056, 0.0010268, 0.0010410, 0.0010768, 0.0011240, 0.0011530, 0.0011866, 0.0012859,
             0.0009984, 0.0010045, 0.0010256, 0.0010397, 0.0010752, 0.0011219, 0.0011835, 0.0012696, 0.0013677,
             0.0009972, 0.0010034, 0.0010245, 0.0010385, 0.0010737, 0.0011199, 0.0011805, 0.0012645, 0.0014524,
             0.0009950, 0.0010013, 0.0010222, 0.0010361, 0.0010707, 0.0011159, 0.0011748, 0.0012550, 0.0013770, 0.0016581,
             0.0009928, 0.0009992, 0.0010199, 0.0010337, 0.0010678, 0.0011120, 0.0011693, 0.0012462, 0.0013596, 0.0020360,
             0.0009907, 0.0009971, 0.0010313, 0.0011344, 0.0013442,
             0.0009886, 0.0009951, 0.0010290, 0.0011302, 0.0013304},

            //Internal Energy
            {83.80, 167.25, 334.29, 418.24, 587.82, 761.16, 849.9,  940.7,  959.1,
             83.65, 166.95, 333.72, 417.52, 586.76, 759.63, 848.1,  938.4, 1147.8,
             83.50, 166.64, 333.15, 416.81, 585.72, 758.13, 936.2, 1124.4, 1282.0,
             83.36, 166.35, 332.59, 416.12, 584.68, 756.65, 934.1, 1121.1, 1393.0,
             83.06, 165.76, 331.48, 414.74, 582.66, 753.76, 929.9, 1114.6, 1316.6, 1585.6,
             82.77, 165.17, 330.40, 413.39, 580.69, 750.95, 925.9, 1108.6, 1306.1, 1785.6,
             82.47, 164.60, 412.08, 834.50, 1296.6,
             82.17, 164.04, 410.78, 831.40, 1287.9},

            //Enthalpy
            {86.30, 169.77, 336.86, 420.85,  590.52, 763.97, 852.8,  943.7,  962.1,
             88.65, 171.97, 338.85, 422.72,  592.15, 765.25, 853.9,  944.4, 1154.2,
             90.99, 174.18, 340.84, 424.62,  593.78, 766.55, 945.1, 1134.0, 1292.2,
             93.33, 176.38, 342.83, 426.50,  595.42, 767.84, 945.9, 1133.7, 1407.6,
             97.99, 180.78, 346.81, 430.28,  598.72, 770.50, 947.5, 1133.4, 1337.3, 1610.5,
            102.62, 185.16, 350.80, 434.06,  602.04, 773.20, 949.3, 1133.5, 1333.3, 1826.3,
            107.24, 189.52, 437.85, 862.80, 1330.20,
            111.84, 193.89, 441.66, 865.30, 1327.80},

            //Entropy
            {0.2961, 0.5715, 1.0737, 1.3050, 1.7369, 2.1375, 2.3294, 2.5174, 2.5546,
             0.2956, 0.5705, 1.0720, 1.3030, 1.7343, 2.1341, 2.3255, 2.5128, 2.9202,
             0.2950, 0.5696, 1.0704, 1.3011, 1.7317, 2.1308, 2.5083, 2.8763, 3.1649,
             0.2945, 0.5686, 1.0688, 1.2992, 1.7292, 2.1275, 2.5039, 2.8699, 3.3596,
             0.2934, 0.5666, 1.0656, 1.2955, 1.7242, 2.1210, 2.4953, 2.8576, 3.2260, 3.6848,
             0.2923, 0.5646, 1.0624, 1.2917, 1.7193, 2.1147, 2.4870, 2.8459, 3.2071, 4.0139,
             0.2911, 0.5626, 1.2881, 2.2961, 3.1900,
             0.2899, 0.5607, 1.2844, 2.2893, 3.1741}
    };


    /*
     * Nothing below works anymore, so everything is commented now
     *
    /**
     * I have learned that this method is retarded. I can just call the array instead
     * @param i
     * @return
     */
    //Just reads off the given line of the water tables
    /*public ArrayList<Double> getWaterSat(int i) {
        ArrayList<Double> values = new ArrayList<>();
        for(int j = 0; j < 10; j++) {
            values.add(WATER_SATURATED_TEMPERATURE[j][i]);
        }
        return values;
    }

    /**
     * I honestly do not know how any of the methods below work anymore
     */

    //My attempt at writing a method to fix the state, i.e. calculating the properties at a given time
    /*public ArrayList<Double> fixTemp_Water(Double temp, int index, Double prop) {
        ArrayList<Double> state = new ArrayList<>();

        //This could probably be written better
        //Finds the line equal to (no interpolation)  or right above the line needed (interpolation)
        int i = 0;
        while(temp > WATER_SATURATED_TEMPERATURE[0][i]) {
            i++;
            if(i > 70) {
                break;
            }
        }

        //Strips data from the water tables into an ArrayList called state
        for(int j = 0; j < 10; j++) {
            state.add(WATER_SATURATED_TEMPERATURE[j][i]);
        }

        //Finds the proper data, i.e. interpolates maybe
        ArrayList<Double> satState = state;
        if (!state.get(0).equals(temp)) {
            //Grabs the line right below the line needed
            ArrayList<Double> stateX = new ArrayList<Double>();
            for(int j = 0; j < 10; j++) {
                stateX.add(WATER_SATURATED_TEMPERATURE[j][i-1]);
            }

            //Throws all these arrays into a grinder. Spits out interpolated data, i.e. data in between the lines with respect to the given value
            satState = linearInterpolation(0, temp, stateX, state);

            //just remnants from debugging
            System.out.println(state);
            System.out.println(stateX);
        }

        //Finds quality. Needed to see which table to move to next
        Double quality = findQuality(satState.get(2 * (index - 1) - 1), prop, satState.get(2 * (index - 1)));

		/**Creates a new ArrayList, this will have 6 entries
		 * 0) Temperature
		 * 1) Pressure
		 * 2) Specific Volume
		 * 3) Internal Energy
		 * 4) Enthalpy
		 * 5) Entropy
		 */
        /*ArrayList<Double> fixedState = new ArrayList<>();
        fixedState.add(temp);
        fixedState.add(satState.get(1));
        for(i = 1; i < 5; i++) {
            Double value = satState.get(2 * i + 1) + quality * (satState.get(2 * i) - satState.get(2 * i));
            fixedState.add(value);
        }

        if(quality < 0) {
            //compressed liquid
            fixComp_Water(temp, index, prop);
            System.out.println("I can't do non-sat rn");
        }
        if(quality > 1) {
            //superheated vapor
            System.out.println("I can't do non-sat rn");
        }
        //return getWaterSat(1);
        return fixedState;
    }

    /**
     * Attempt to fix the state using the WATER_SATURATED_PRESSURE table
     * Will most likely be totally rewritten
     *
     * @param pres the water pressure at this state
     * @return array with all state property values
     */
    /*public ArrayList<Double> fixPres_Water(Double pres) {
        ArrayList<Double> state = new ArrayList<>();
        int i = 0;
        while(pres > WATER_SATURATED_PRESSURE[0][i]) {
            i++;
        }
        for(int j = 0; j < 10; j++) {
            state.add(WATER_SATURATED_PRESSURE[j][i]);
        }
        ArrayList<Double> satState = state;
        if (state.get(0) != pres) {
            ArrayList<Double> stateX = new ArrayList<>();
            for(int j = 0; j < 10; j++) {
                stateX.add(WATER_SATURATED_PRESSURE[j][i-1]);
            }
            satState = linearInterpolation(0, pres, stateX, state);
            System.out.println(state);
            System.out.println(stateX);
        }
        //return getWaterSat(1);
        return satState;
    }

    /**
     * Attempt to fix the state using compressed water table
     * Will be rewritten at a later point
     *
     * @param temp temperature of the water at this state
     * @param index index of the property used to fix the state
     * @param prop value of the second property at this state
     * @return array with all state property values
     * @deprecated reformatted the compressed water tables
     */
    /*public ArrayList<Double> fixComp_Water(Double temp, int index, Double prop) {
        ArrayList<Double> filler = new ArrayList<>();
        if((temp >= 20) && (temp <= 365.81)) {
            for(int i = 0; i < 8; i++) {
                int j = 0;
                ArrayList<Double> compState = new ArrayList<>();
                ArrayList<Double> compStateX = new ArrayList<>();
                /*while (temp > WATER_COMPRESSED[i][j][1]) {
                    if((j + 1) == WATER_COMPRESSED[i].length) {
                        for(Double value: WATER_COMPRESSED[i][j]) {
                            compState.add(value);
                        }
                        break;
                    }
                    j++;
                }
                ArrayList<Double> firstInterpState = compState;
                if(temp != WATER_COMPRESSED[i][j][2]) {
                    for(Double value: WATER_COMPRESSED[i][j-1]) {
                        compStateX.add(value);
                    }
                    firstInterpState = linearInterpolation(1, temp, compStateX, compState);
                }


                //if()
            }
        }
        return filler;
    }

    /**
     * Uses two different tabulated states and a property value in between and calculates the other values in the middle
     *
     * @param index index of the property used to interpolate
     * @param point the value of the property used to interpolate
     * @param props1 state values below the point
     * @param props2 state values above the point
     * @return state values at the point
     */
    /*public ArrayList<Double> linearInterpolation(Integer index, Double point, ArrayList<Double> props1, ArrayList<Double> props2) {
        ArrayList<Double> adjusted = new ArrayList<>();
        int i = 0;
        Double adjustment = (point - props1.get(index))/(props2.get(index)-props1.get(index));
        for(Double value: props1) {
            adjusted.add(value + (adjustment * (props2.get(i++) - value)));
        }
        System.out.println(adjusted);
        return adjusted;
    }

    /**
     * Calculates the quality of water at the point
     *
     * @param liquid property value at saturated liquid state
     * @param point property value of the current state
     * @param vapor property value at the saturated vapor state
     * @return returns the quality of the water in decimal form
     */
    /*public Double findQuality(Double liquid, Double point, Double vapor) {
        Double quality = (point - liquid)/(vapor - liquid);
        return quality;
    }

    public static void main(String[] args) {
        Tables sat = new Tables();
        for(Double val: sat.getWaterSat(5)) {
            System.out.println(val);
        }
        System.out.println(sat.fixTemp_Water(10.5, 3, 75.));
        System.out.println();
		/*for(Double val: sat.waterSuper[0][0]) {
			System.out.println(val);
		}*/
    //}

}