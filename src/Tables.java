import java.util.ArrayList;

public class Tables {

    Double[][] waterSat_Temp = {
        //70 Values

		/**Properties in Array:
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

		 //Temperature (T) [degrees C]
            {0.01,   4.,   5.,   6.,     8.,
              10.,  11.,  12.,  13.,    14.,
              15.,  16.,  17.,  18.,    19.,
              20.,  21.,  22.,  23.,    24.,
              25.,  26.,  27.,  28.,    29.,
              30.,  31.,  32.,  33.,    34.,
              35.,  36.,  38.,  40.,    45.,
              50.,  55.,  60.,  65.,    70.,
              75.,  80.,  85.,  90.,    95.,
             100., 110., 120., 130.,   140.,
             150., 160., 170., 180.,   190.,
             200., 210., 220., 230.,   240.,
             250., 260., 270., 280.,   290.,
             300., 320., 340., 360., 374.14},

            //Pressure (P) [bar]
            {0.00611, 0.00813, 0.00872, 0.00935, 0.01072,
             0.01228, 0.01312, 0.01402, 0.01497, 0.01598,
             0.01705, 0.01818, 0.01938, 0.02064, 0.02198,
             0.02339, 0.02487, 0.02645, 0.02810, 0.02985,
             0.03169, 0.03363, 0.03567, 0.03782, 0.04008,
             0.04246, 0.04496, 0.04759, 0.05034, 0.05324,
             0.05628, 0.05947, 0.06632, 0.07384, 0.09593,
              0.1235,  0.1576,  0.1994,  0.2503,  0.3119,
              0.3858,  0.4739,  0.5783,  0.7014,  0.8455,
               1.014,   1.433,   1.985,   2.701,   3.613,
               4.758,   6.178,   7.917,   10.02,   12.54,
               15.54,   19.06,   23.18,   27.95,   33.44,
               39.73,   46.88,   54.99,   64.12,   74.36,
               85.81,   112.7,   145.9,   186.5,   220.9},

            //Sat Liquid Specific Volume (vf) [m^3/kg]
            {0.0010002, 0.0010001, 0.0010001, 0.0010001, 0.0010002,
             0.0010004, 0.0010004, 0.0010005, 0.0010007, 0.0010008,
             0.0010009, 0.0010011, 0.0010012, 0.0010014, 0.0010016,
             0.0010018, 0.0010020, 0.0010022, 0.0010024, 0.0010027,
             0.0010029, 0.0010032, 0.0010035, 0.0010037, 0.0010040,
             0.0010043, 0.0010046, 0.0010050, 0.0010053, 0.0010056,
             0.0010060, 0.0010063, 0.0010071, 0.0010078, 0.0010099,
             0.0010121, 0.0010146, 0.0010172, 0.0010199, 0.0010228,
             0.0010259, 0.0010291, 0.0010325, 0.0010360, 0.0010397,
             0.0010435, 0.0010516, 0.0010603, 0.0010697, 0.0010797,
             0.0010905, 0.0011020, 0.0011143, 0.0011274, 0.0011414,
             0.0011565, 0.0011726, 0.0011900, 0.0012088, 0.0012291,
             0.0012512, 0.0012755, 0.0013023, 0.0013321, 0.0013656,
             0.0014036, 0.0014988, 0.0016379, 0.0018925, 0.003155},

            //Sat Vapor Specific Volume (vg) [m^3/kg]
            {206.136, 157.232, 147.120,  137.734,  120.917,
             106.379,  99.857,  93.784,   88.124,   82.848,
              77.926,  73.333,  69.044,   65.038,   61.293,
              57.791,  54.514,  51.447,   48.574,   45.883,
              43.360,  40.994,  38.774,   36.690,   34.733,
              32.894,  31.165,  29.540,   28.011,   26.571,
              25.216,  23.940,  21.602,   19.523,   15.258,
              12.032,   9.568,   7.671,    6.197,    5.042,
               4.131,   3.407,   2.828,    2.361,    1.982,
               1.673,   1.210,  0.8919,   0.6685,   0.5089,
              0.3928,  0.3071,  0.2428,   0.1941,   0.1565,
              0.1274,  0.1044, 0.08619,  0.07158,  0.05976,
              0.05013, 0.04221, 0.03564,  0.03017,  0.02557,
              0.02167, 0.01549, 0.01080, 0.006945, 0.003155},

            //Sat Liquid Internal Energy (uf) [kJ/kg]
            { 0.00,  16.77,  20.97,  25.19,  33.59,
             42.00,  46.20,  50.41,  54.60,  58.79,
             62.99,  67.18,  71.38,  75.57,  79.76,
             83.95,  88.14,  92.32,  96.51, 100.70,
                    104.88, 109.06, 113.25, 117.42, 121.60,
                    125.78, 129.96, 134.14, 138.32, 142.50,
                    146.67, 150.85, 159.20, 167.56, 188.44,
                    209.32, 230.21, 251.11, 272.02, 292.95,
                    313.90, 334.86, 355.84, 376.85, 397.88,
                    418.94, 461.14, 503.50, 546.02, 588.74,
                    631.68, 674.86, 718.33, 762.09, 806.19,
                    850.65, 895.53, 940.87, 986.74, 1033.2,
                    1080.4, 1128.4, 1177.4, 1227.5, 1278.9,
                    1332.0, 1444.6, 1570.3, 1725.2, 2029.6},

            //Sat Vapor Internal Engery (ug) [kJ/kg]
            {2375.3, 2380.9, 2382.3, 2383.6, 2386.4,
                    2389.2, 2390.5, 2391.9, 2393.3, 2394.7,
                    2396.1, 2397.4, 2398.8, 2400.2, 2401.6,
                    2402.9, 2404.3, 2405.7, 2407.0, 2408.4,
                    2409.8, 2411.1, 2412.5, 2413.9, 2415.2,
                    2416.6, 2418.0, 2419.3, 2420.7, 2422.0,
                    2423.4, 2424.7, 2427.4, 2430.1, 2436.8,
                    2443.5, 2450.1, 2456.6, 2463.1, 2469.6,
                    2475.9, 2482.2, 2488.4, 2494.5, 2500.6,
                    2506.5, 2518.1, 2529.3, 2539.9, 2550.0,
                    2559.5, 2568.4, 2576.5, 2583.7, 2590.0,
                    2595.3, 2599.5, 2602.4, 2603.9, 2604.0,
                    2602.4, 2599.0, 2593.7, 2586.1, 2576.0,
                    2563.0, 2525.5, 2464.6, 2351.5, 2029.6},

            //Sat Liquid Enthalpy (hf) [kJ/kg]
            { 0.01,  16.78,  20.98,  25.20,  33.60,
                    42.01,  46.20,  50.41,  54.60,  58.80,
                    62.99,  67.19,  71.38,  75.58,  79.77,
                    83.96,  88.14,  92.33,  96.52, 100.70,
                    104.89, 109.07, 113.25, 117.43, 121.61,
                    125.79, 129.97, 134.15, 138.33, 142.50,
                    146.68, 150.86, 159.21, 167.57, 188.45,
                    209.33, 230.23, 251.13, 272.06, 292.98,
                    313.93, 334.91, 355.90, 376.92, 397.96,
                    419.04, 461.30, 503.71, 546.31, 589.13,
                    632.20, 675.55, 719.21, 763.22, 807.62,
                    852.45, 897.76, 943.62, 990.12, 1037.3,
                    1085.4, 1134.4, 1184.5, 1236.0, 1289.1,
                    1344.0, 1461.5, 1594.2, 1760.5, 2099.3},

            //Sat Vapor Enthalpy (hg) [kJ/kg]
            {2501.4, 2508.7, 2510.6, 2512.4, 2516.1,
                    2519.8, 2521.6, 2523.4, 2525.3, 2527.1,
                    2528.9, 2530.8, 2532.6, 2534.4, 2536.2,
                    2538.1, 2539.9, 2541.7, 2543.5, 2545.4,
                    2547.2, 2549.0, 2550.8, 2552.6, 2554.5,
                    2556.3, 2558.1, 2559.9, 2561.7, 2563.5,
                    2565.3, 2567.1, 2570.7, 2574.3, 2583.2,
                    2592.1, 2600.9, 2609.6, 2618.3, 2626.8,
                    2635.3, 2643.7, 2651.9, 2660.1, 2668.1,
                    2676.1, 2691.5, 2706.3, 2720.5, 2733.9,
                    2746.5, 2758.1, 2768.7, 2778.2, 2786.4,
                    2793.2, 2798.5, 2802.1, 2804.0, 2803.8,
                    2801.5, 2796.6, 2789.7, 2779.6, 2766.2,
                    2749.0, 2700.1, 2622.0, 2481.0, 2099.3},

            //Sat Liquid Entropy [kJ/kg K]
            {0.0000, 0.0610, 0.0761, 0.0912, 0.1212,
                    0.1510, 0.1658, 0.1806, 0.1953, 0.2099,
                    0.2245, 0.2390, 0.2535, 0.2679, 0.2823,
                    0.2966, 0.3109, 0.3251, 0.3393, 0.3534,
                    0.3674, 0.3814, 0.3954, 0.4093, 0.4231,
                    0.4369, 0.4507, 0.4644, 0.4781, 0.4917,
                    0.5053, 0.5188, 0.5458, 0.5725, 0.6387,
                    0.7038, 0.7679, 0.8312, 0.8935, 0.9549,
                    1.0155, 1.0753, 1.1343, 1.1925, 1.2500,
                    1.3069, 1.4185, 1.5276, 1.6344, 1.7391,
                    1.8418, 1.9427, 2.0419, 2.1396, 2.2359,
                    2.3309, 2.4248, 2.5178, 2.6099, 2.7015,
                    2.7927, 2.8838, 2.9751, 3.0668, 3.1594,
                    3.2534, 3.4480, 3.6594, 3.9147, 4.4298},

            //Sat Vapor Entropy [kJ/kg K]
            {9.1562, 9.0514, 9.0257, 9.0003, 8.9501,
                    8.9008, 8.8765, 8.8524, 8.8285, 8.8048,
                    8.7814, 8.7582, 8.7351, 8.7123, 8.6897,
                    8.6672, 8.6450, 8.6229, 8.6011, 8.5794,
                    8.5580, 8.5367, 8.5156, 8.4946, 8.4739,
                    8.4533, 8.4329, 8.4127, 8.3927, 8.3728,
                    8.3531, 8.3336, 8.2950, 8.2570, 8.1648,
                    8.0763, 7.9913, 7.9096, 7.8310, 7.7553,
                    7.6824, 7.6122, 7.5445, 7.4791, 7.4159,
                    7.3549, 7.2387, 7.1296, 7.0269, 6.9299,
                    6.8379, 6.7502, 6.6663, 6.5857, 6.5079,
                    6.4323, 6.3585, 6.2861, 6.2146, 6.1437,
                    6.0730, 6.0019, 5.9301, 5.8571, 5.7821,
                    5.7045, 5.5362, 5.3357, 5.0526, 4.4298}

    };
    Double[][] waterSat_Pres = {
            //50 Values

		/**Properties in Array:
		 * 0) Pressure (P) [bar]
		 * 1) Temperature (T) [degrees C]
		 * 2) Sat Liquid Specific Volume (vf) [m^3/kg]
		 * 3) Sat Vapor Specific Volume (vg) [m^3/kg]
		 * 4) Sat Liquid Internal Energy (uf) [kJ/kg]
		 * 5) Sat Vapor Internal Engery (ug) [kJ/kg]
		 * 6) Sat Liquid Enthalpy (hf) [kJ/kg]
		 * 7) Sat Vapor Enthalpy (hg) [kJ/kg]
		 * 8) Sat Liquid Entropy (sf) [kJ/kg K]
		 * 9) Sat Vapor Entropy (sg) [kJ/kg K]
		 */

            //Pressure (P) [bar]
            {0.04, 0.06, 0.08, 0.10,  0.20,
                    0.30, 0.40, 0.50, 0.60,  0.70,
                    0.80, 0.90, 1.00, 1.50,  2.00,
                    2.50, 3.00, 3.50, 4.00,  4.50,
                    5.00, 6.00, 7.00, 8.00,  9.00,
                    10.0, 15.0, 20.0, 25.0,  30.0,
                    35.0, 40.0, 45.0, 50.0,  60.0,
                    70.0, 80.0, 90.0, 100.,  110.,
                    120., 130., 140., 150.,  160.,
                    170., 180., 190., 200., 220.9},

            //Temperature (T) [degrees C]
            {28.96, 36.16, 41.51, 45.81, 60.06,
                    69.10, 75.87, 81.33, 85.94, 89.95,
                    93.50, 96.71, 99.63, 111.4, 120.2,
                    127.4, 133.6, 138.9, 143.6, 147.9,
                    151.9, 158.9, 165.0, 170.4, 175.4,
                    179.9, 198.3, 212.4, 224.0, 233.9,
                    242.6, 250.4, 257.5, 264.0, 275.6,
                    285.9, 295.1, 303.4, 311.1, 318.2,
                    324.8, 330.9, 336.8, 342.2, 347.4,
                    352.4, 357.1, 361.5, 365.8, 374.1},

            //Sat Liquid Specific Volume (vf) [m^3/kg]
            {.0010040, .0010064, .0010084, .0010102, .0010172,
                    .0010223, .0010265, .0010300, .0010331, .0010360,
                    .0010380, .0010410, .0010432, .0010528, .0010605,
                    .0010672, .0010732, .0010786, .0010836, .0010882,
                    .0010926, .0011006, .0011080, .0011148, .0011212,
                    .0011273, .0011539, .0011767, .0011973, .0012165,
                    .0012347, .0012522, .0012692, .0012859, .0013187,
                    .0013513, .0013842, .0014178, .0014524, .0014886,
                    .0015267, .0015671, .0016107, .0016581, .0017107,
                    .0017702, .0018397, .0019243,  .002036,  .003155},

            //Sat Vapor Specific Volume (vg) [m^3/kg]
            {  34.800,   23.739,   18.103,   14.674,    7.649,
                    5.229,    3.993,    3.240,    2.732,    2.365,
                    2.087,    1.869,    1.694,    1.159,   0.8857,
                    0.7187,   0.6058,   0.5243,   0.4625,   0.4140,
                    0.3749,   0.3157,   0.2729,   0.2404,   0.2150,
                    0.1944,   0.1318,  0.09963,  0.07998,  0.06668,
                    0.05707,  0.04978,  0.04406,  0.03944,  0.03244,
                    0.02737,  0.02352,  0.02048,  0.01803,  0.01599,
                    0.01426,  0.01278,  0.01149,  0.01034, 0.009306,
                    0.008364, 0.007489, 0.006657, 0.005834, 0.003155},

            //Sat Liquid Internal Energy (uf) [kJ/kg]
            {121.45, 151.53, 173.87, 191.82, 251.38,
                    289.20, 317.53, 340.44, 359.79, 376.63,
                    391.58, 405.06, 417.36, 466.94, 504.49,
                    535.10, 561.15, 583.95, 604.31, 622.25,
                    639.68, 669.90, 696.44, 720.22, 741.83,
                    761.68, 843.16, 906.44, 959.11, 1004.8,
                    1045.4, 1082.3, 1116.2, 1147.8, 1205.4,
                    1257.6, 1305.6, 1350.5, 1393.0, 1433.7,
                    1473.0, 1511.1, 1548.6, 1585.6, 1622.7,
                    1660.2, 1698.9, 1739.9, 1785.6, 2029.6},

            //Sat Vapor Internal Engery (ug) [kJ/kg]
            {2415.2, 2425.0, 2432.2, 2437.9, 2456.7,
                    2468.4, 2477.0, 2483.9, 2489.6, 2494.5,
                    2498.8, 2502.6, 2506.1, 2519.7, 2529.5,
                    2537.2, 2543.6, 2546.9, 2553.6, 2557.6,
                    2561.2, 2567.4, 2572.5, 2576.8, 2580.5,
                    2583.6, 2594.5, 2600.3, 2603.1, 2604.1,
                    2603.7, 2602.3, 2600.1, 2597.1, 2589.7,
                    2580.5, 2569.8, 2557.8, 2544.4, 2529.8,
                    2513.7, 2496.1, 2476.8, 2455.5, 2431.7,
                    2405.0, 2374.3, 2338.1, 2293.0, 2029.6},

            //Sat Liquid Enthalpy (hf) [kJ/kg]
            {121.46, 151.53, 173.88, 191.83, 251.40,
                    289.23, 317.58, 340.49, 359.86, 376.70,
                    391.66, 405.15, 417.46, 467.11, 504.70,
                    535.37, 561.47, 584.33, 604.74, 623.25,
                    640.23, 670.56, 697.22, 721.11, 742.83,
                    762.81, 844.84, 908.79, 962.11, 1008.4,
                    1049.8, 1087.3, 1121.9, 1154.2, 1213.4,
                    1267.0, 1316.6, 1363.3, 1407.6, 1450.1,
                    1491.3, 1531.5, 1571.1, 1610.5, 1650.1,
                    1690.3, 1732.0, 1776.5, 1826.3, 2099.3},

            //Sat Vapor Enthalpy (hg) [kJ/kg]
            {2554.4, 2567.4, 2577.0, 2584.7, 2609.7,
                    2625.3, 2636.8, 2645.9, 2653.5, 2660.0,
                    2665.8, 2670.9, 2675.5, 2693.6, 2706.7,
                    2716.9, 2725.3, 2732.4, 2738.6, 2743.9,
                    2748.7, 2756.8, 2763.5, 2769.1, 2773.9,
                    2778.1, 2792.2, 2799.5, 2803.1, 2804.2,
                    2803.4, 2801.4, 2798.3, 2794.3, 2784.3,
                    2772.1, 2758.0, 2742.1, 2724.7, 2705.6,
                    2684.9, 2662.2, 2637.6, 2610.5, 2580.6,
                    2547.2, 2509.1, 2464.5, 2409.7, 2099.3},

            //Sat Liquid Entropy (sf) [kJ/kg K]
            {0.4226, 0.5210, 0.5926, 0.6493, 0.8320,
                    0.9439, 1.0259, 1.0910, 1.1453, 1.1919,
                    1.2329, 1.2695, 1.3026, 1.4336, 1.5301,
                    1.6072, 1.6718, 1.7275, 1.7766, 1.8207,
                    1.8607, 1.9312, 1.9922, 2.0462, 2.0946,
                    2.1387, 2.3150, 2.4474, 2.5547, 2.6457,
                    2.7253, 2.7964, 2.8610, 2.9202, 3.0267,
                    3.1211, 3.2068, 3.2858, 3.3596, 3.4295,
                    3.4962, 3.5606, 3.6232, 3.6848, 3.7461,
                    3.8079, 3.8715, 3.9388, 4.0139, 4.4298},

            //Sat Vapor Entropy (sg) [kJ/kg K]
            {8.4746, 8.3304, 8.2287, 8.1502, 7.9085,
                    7.7686, 7.6700, 7.5939, 7.5320, 7.4797,
                    7.4346, 7.3949, 7.3594, 7.2233, 7.1271,
                    7.0527, 6.9919, 6.9405, 6.8959, 6.8565,
                    6.8212, 6.7600, 6.7080, 6.6628, 6.6226,
                    6.5863, 6.4448, 6.3409, 6.2575, 6.1869,
                    6.1253, 6.0701, 6.0199, 5.9734, 5.8892,
                    5.8133, 5.7432, 5.6772, 5.6141, 5.5527,
                    5.4924, 5.4323, 5.3717, 5.3098, 5.2455,
                    5.1777, 5.1044, 5.0228, 4.9269, 4.4298}

    };
    Double[][][] waterSuper = {
		/**Unfinished superheated tables
		 * Ended at 15.0 bar
		 */
            {{0.06, 0.35,
                    0.70, 1.00,
                    1.50, 3.00,
                    5.00, 7.00,
                    10.0, 15.0,
                    20.0, 30.0,
                    40.0, 60.0,
                    80.0, 100.,
                    120., 140.,
                    160., 180.,
                    200., 240.,
                    280., 320.}},

            //0.06 bar
            {{36.16, 23.739, 2425.0, 2567.4,  8.3304},
                    {80.00, 27.132, 2487.3, 2650.1,  8.5804},
                    {120.0, 30.219, 2544.7, 2726.0,  8.7840},
                    {160.0, 33.302, 2602.7, 2802.5,  8.9693},
                    {200.0, 36.383, 2661.4, 2879.7,  9.1398},
                    {240.0, 39.462, 2721.0, 2957.8,  9.2982},
                    {280.0, 42.540, 2781.5, 3036.8,  9.4464},
                    {320.0, 45.618, 2843.0, 3116.7,  9.5859},
                    {360.0, 48.696, 2905.5, 3197.7,  9.7180},
                    {400.0, 51.774, 2969.0, 3279.6,  9.8435},
                    {440.0, 54.851, 3033.5, 3362.6,  9.9633},
                    {500.0, 59.467, 3132.3, 3489.1, 10.1336}},

            //0.35 bar
            {{72.69,  4.526, 2473.0, 2631.4, 7.7158},
                    {80.00,  4.625, 2483.7, 2645.6, 7.7564},
                    {120.0,  5.163, 2542.4, 2723.1, 7.9644},
                    {160.0,  5.696, 2601.2, 2800.6, 8.1519},
                    {200.0,  6.228, 2660.4, 2878.4, 8.3237},
                    {240.0,  6.758, 2720.3, 2956.8, 8.4828},
                    {280.0,  7.287, 2780.9, 3036.0, 8.6314},
                    {320.0,  7.815, 2842.5, 3116.1, 8.7712},
                    {360.0,  8.344, 2905.1, 3197.1, 8.9034},
                    {400.0,  8.872, 2968.6, 3279.2, 9.0291},
                    {440.0,  9.400, 3033.2, 3362.2, 9.1490},
                    {500.0, 10.192, 3132.1, 3488.8, 9.3194}},

            //0.70 bar
            {{89.95, 2.365, 2494.5, 2660.0, 7.4797},
                    {100.0, 2.434, 2509.7, 2680.0, 7.5341},
                    {120.0, 2.571, 2539.7, 2719.6, 7.6375},
                    {160.0, 2.841, 2599.4, 2798.2, 7.8279},
                    {200.0, 3.108, 2659.1, 2876.7, 8.0012},
                    {240.0, 3.374, 2719.3, 2955.5, 8.1611},
                    {280.0, 3.640, 2780.2, 3035.0, 8.3162},
                    {320.0, 3.905, 2842.0, 3115.3, 8.4504},
                    {360.0, 4.170, 2904.6, 3196.5, 8.5828},
                    {400.0, 4.434, 2968.2, 3278.6, 8.7086},
                    {440.0, 4.698, 3032.9, 3361.8, 8.8286},
                    {500.0, 5.095, 3131.8, 3488.5, 8.9991}},

            //1.0 bar
            {{99.63, 1.694, 2506.1, 2675.5, 7.3594},
                    {100.0, 1.696, 2506.7, 2676.2, 7.3614},
                    {120.0, 1.793, 2537.3, 2716.6, 7.4668},
                    {160.0, 1.984, 2597.8, 2796.2, 7.6597},
                    {200.0, 2.172, 2658.1, 2875.3, 7.8343},
                    {240.0, 2.359, 2718.5, 2954.5, 7.9949},
                    {280.0, 2.546, 2779.6, 3034.2, 8.1445},
                    {320.0, 2.732, 2841.5, 3114.6, 8.2849},
                    {360.0, 2.917, 2904.2, 3195.9, 8.4175},
                    {400.0, 3.103, 2967.9, 3278.2, 8.5435},
                    {440.0, 3.288, 3032.6, 3361.4, 8.6636},
                    {500.0, 3.565, 3131.6, 3488.1, 8.8342}},

            //1.5 bar
            {{111.37, 1.159, 2519.7, 2693.6, 7.2233},
                    {120.00, 1.188, 2533.3, 2711.4, 7.2693},
                    {160.00, 1.317, 2595.2, 2792.8, 7.4665},
                    {200.00, 1.444, 2656.2, 2872.9, 7.6433},
                    {240.00, 1.570, 2717.2, 2952.7, 7.8052},
                    {280.00, 1.695, 2778.6, 3032.8, 7.9555},
                    {320.00, 1.819, 2840.6, 3113.5, 8.0964},
                    {360.00, 1.943, 2903.5, 3195.0, 8.2293},
                    {400.00, 2.067, 2967.3, 3277.4, 8.3555},
                    {440.00, 2.191, 3032.1, 3360.7, 8.4757},
                    {500.00, 2.376, 3131.2, 3487.6, 8.6466},
                    {600.00, 2.685, 3301.7, 3704.3, 8.9101}},

            //3.0 bar
            {{133.55, 0.606, 2543.6, 2725.3, 6.9919},
                    {160.00, 0.651, 2587.1, 2782.3, 7.1276},
                    {200.00, 0.716, 2650.7, 2865.5, 7.3115},
                    {240.00, 0.781, 2713.1, 2947.3, 7.4774},
                    {280.00, 0.844, 2775.4, 3028.6, 7.6299},
                    {320.00, 0.907, 2838.1, 3110.1, 7.7722},
                    {360.00, 0.969, 2901.4, 3192.2, 7.9061},
                    {400.00, 1.032, 2965.6, 3275.0, 8.0330},
                    {440.00, 1.094, 3030.6, 3358.7, 8.1538},
                    {500.00, 1.187, 3130.0, 3486.0, 8.3251},
                    {600.00, 1.341, 3300.8, 3703.2, 8.5892}},

            //5.0 bar
            {{151.86, 0.3749, 2561.2, 2748.7, 6.8213},
                    {180.00, 0.4045, 2609.7, 2812.0, 6.9656},
                    {200.00, 0.4249, 2642.9, 2855.4, 7.0592},
                    {240.00, 0.4646, 2707.6, 2939.9, 7.2307},
                    {280.00, 0.5034, 2771.2, 3022.9, 7.3865},
                    {320.00, 0.5416, 2834.7, 3105.6, 7.5308},
                    {360.00, 0.5796, 2898.7, 3188.4, 7.6660},
                    {400.00, 0.6173, 2963.2, 3271.9, 7.7938},
                    {440.00, 0.6548, 3028.6, 3356.0, 7.9152},
                    {500.00, 0.7109, 3128.4, 3483.9, 8.0873},
                    {600.00, 0.8041, 3299.6, 3701.7, 8.3522},
                    {700.00, 0.8969, 3477.5, 3925.9, 8.5952}},

            //7.0 bar
            {{164.97, 0.2729, 2572.5, 2763.5, 6.7080},
                    {180.00, 0.2847, 2599.8, 2799.1, 6.7880},
                    {200.00, 0.2999, 2634.8, 2844.8, 6.8865},
                    {240.00, 0.3292, 2701.8, 2932.2, 7.0641},
                    {280.00, 0.3574, 2766.9, 3017.1, 7.2233},
                    {320.00, 0.3852, 2831.3, 3100.9, 7.3697},
                    {360.00, 0.4126, 2895.8, 3184.7, 7.5063},
                    {400.00, 0.4397, 2960.9, 3268.7, 7.6350},
                    {440.00, 0.4667, 3026.6, 3353.3, 7.7571},
                    {500.00, 0.5070, 3126.8, 3481.7, 7.9299},
                    {600.00, 0.5738, 3298.5, 3700.2, 8.1956},
                    {700.00, 0.6403, 3476.6, 3924.8, 8.4391}},

            //10.0 bar
            {{179.91, 0.1944, 2583.6, 2778.1, 6.5865},
                    {200.00, 0.2060, 2621.9, 2827.9, 6.6940},
                    {240.00, 0.2275, 2692.9, 2920.4, 6.8817},
                    {280.00, 0.2480, 2760.2, 3008.2, 7.0465},
                    {320.00, 0.2678, 2826.1, 3093.9, 7.1962},
                    {360.00, 0.2873, 2891.6, 3178.9, 7.3349},
                    {400.00, 0.3066, 2957.3, 3263.9, 7.4651},
                    {440.00, 0.3257, 3023.6, 3349.3, 7.5883},
                    {500.00, 0.3541, 3124.4, 3478.5, 7.7622},
                    {540.00, 0.3729, 3192.6, 3565.6, 7.8720},
                    {600.00, 0.4011, 3296.8, 3697.9, 8.0290},
                    {640.00, 0.4198, 3367.4, 3787.2, 8.1290}},

            //15.0 bar
            {{198.32, 0.1318, 2594.5, 2792.2, 6.4448},
                    {200.00, 0.1325, 2598.1, 2796.8, 6.4546},
                    {240.00, 0.1483, 2676.9, 2899.3, 6.6628},
                    {280.00, 0.1627, 2748.6, 2992.7, 6.8381},
                    {320.00, 0.1765, 2817.1, 3081.9, 6.9938},
                    {360.00, 0.1899, 2884.4, 3169.2, 7.1363},
                    {400.00, 0.2030, 2951.3, 3255.8, 7.2690},
                    {440.00, 0.2160, 3018.5, 3342.5, 7.3940},
                    {500.00, 0.2352, 3120.3, 3473.1, 7.5698},
                    {540.00, 0.2478, 3189.1, 3560.9, 7.6805},
                    {600.00, 0.2668, 3293.9, 3694.0, 7.8385},
                    {640.00, 0.2793, 3364.8, 3783.8, 7.9391}}
    };
    Double[][][] waterComp = {

            //25 bar
            {{25.0, 20.000, 1.0006,  83.80,  86.30, 0.2961},
                    {25.0, 40.000, 1.0067, 167.25, 169.77, 0.5715},
                    {25.0, 80.000, 1.0280, 334.29, 336.86, 1.0737},
                    {25.0, 100.00, 1.0423, 418.24, 420.85, 1.3050},
                    {25.0, 140.00, 1.0784, 587.82, 590.52, 1.7369},
                    {25.0, 180.00, 1.1261, 761.16, 763.97, 2.1375},
                    {25.0, 200.00, 1.1555,  849.9,  852.8, 2.3294},
                    {25.0, 220.00, 1.1898,  940.7,  943.7, 2.5174},
                    {25.0, 223.99, 1.1973,  959.1,  962.1, 2.5546}},

            //50 bar
            {{50.0, 20.000, 0.9995,  83.65,  88.65, 0.2956},
                    {50.0, 40.000, 1.0056, 166.95, 171.97, 0.5705},
                    {50.0, 80.000, 1.0268, 333.72, 338.85, 1.0720},
                    {50.0, 100.00, 1.0410, 417.52, 422.72, 1.3030},
                    {50.0, 140.00, 1.0768, 586.76, 592.15, 1.7343},
                    {50.0, 180.00, 1.1240, 759.63, 765.25, 2.1341},
                    {50.0, 200.00, 1.1530,  848.1,  853.9, 2.3255},
                    {50.0, 220.00, 1.1866,  938.4,  944.4, 2.5128},
                    {50.0, 263.99, 1.2859, 1147.8, 1154.2, 2.9202}},

            //75 bar
            {{75.0, 20.000, 0.9984,  83.50,  90.99, 0.2950},
                    {75.0, 40.000, 1.0045, 166.64, 174.18, 0.5696},
                    {75.0, 80.000, 1.0256, 333.15, 340.84, 1.0704},
                    {75.0, 100.00, 1.0397, 416.81, 424.62, 1.3011},
                    {75.0, 140.00, 1.0752, 585.72, 593.78, 1.7317},
                    {75.0, 180.00, 1.1219, 758.13, 766.55, 2.1308},
                    {75.0, 220.00, 1.1835,  936.2,  945.1, 2.5083},
                    {75.0, 260.00, 1.2696, 1124.4, 1134.0, 2.8763},
                    {75.0, 290.59, 1.3677, 1282.0, 1292.2, 3.1649}},

            //100 bar
            {{100., 20.000, 0.9972,  83.36,  93.33, 0.2945},
                    {100., 40.000, 1.0034, 166.35, 176.38, 0.5686},
                    {100., 80.000, 1.0245, 332.59, 342.83, 1.0688},
                    {100., 100.00, 1.0385, 416.12, 426.50, 1.2992},
                    {100., 140.00, 1.0737, 584.68, 595.42, 1.7292},
                    {100., 180.00, 1.1199, 756.65, 767.84, 2.1275},
                    {100., 220.00, 1.1805,  934.1,  945.9, 2.5039},
                    {100., 260.00, 1.2645, 1121.1, 1133.7, 2.8699},
                    {100., 311.06, 1.4524, 1393.0, 1407.6, 3.3596}},

            //150 bar
            {{150., 20.000, 0.9950,  83.06,  97.99, 0.2934},
                    {150., 40.000, 1.0013, 165.76, 180.78, 0.5666},
                    {150., 80.000, 1.0222, 331.48, 346.81, 1.0656},
                    {150., 100.00, 1.0361, 414.74, 430.28, 1.2955},
                    {150., 140.00, 1.0707, 582.66, 598.72, 1.7242},
                    {150., 180.00, 1.1159, 753.76, 770.50, 2.1210},
                    {150., 220.00, 1.1748,  929.9,  947.5, 2.4953},
                    {150., 260.00, 1.2550, 1114.6, 1133.4, 2.8576},
                    {150., 300.00, 1.3770, 1316.6, 1337.3, 3.2260},
                    {150., 342.24, 1.6581, 1585.6, 1610.5, 3.6848}},

            //200 bar
            {{200., 20.000, 0.9928,  82.77, 102.62, 0.2923},
                    {200., 40.000, 0.9992, 165.17, 185.16, 0.5646},
                    {200., 80.000, 1.0199, 330.40, 350.80, 1.0624},
                    {200., 100.00, 1.0337, 413.39, 434.06, 1.2917},
                    {200., 140.00, 1.0678, 580.69, 602.04, 1.7193},
                    {200., 180.00, 1.1120, 750.95, 773.20, 2.1147},
                    {200., 220.00, 1.1693,  925.9,  949.3, 2.4870},
                    {200., 260.00, 1.2462, 1108.6, 1133.5, 2.8459},
                    {200., 300.00, 1.3596, 1306.1, 1333.3, 3.2071},
                    {200., 365.81,  2.036, 1785.6, 1826.3, 4.0139}},

            //250 bar
            {{250., 20.0, 0.9907,  82.47, 107.24, 0.2911},
                    {250., 40.0, 0.9971, 164.60, 189.52, 0.5626},
                    {250., 100., 1.0313, 412.08, 437.85, 1.2881},
                    {250., 200., 1.1344,  834.5,  862.8, 2.2961},
                    {250., 300., 1.3442, 1296.6, 1330.2, 3.1900}},

            //300 bar
            {{300., 20.0, 0.9886,  82.17, 111.84, 0.2899},
                    {300., 40.0, 0.9951, 164.04, 193.89, 0.5607},
                    {300., 100., 1.0290, 410.78, 441.66, 1.2844},
                    {300., 200., 1.1302,  831.4,  865.3, 2.2893},
                    {300., 300., 1.3304, 1287.9, 1327.8, 3.1741}}
    };
    //Double tables[][][] = {waterSat_Temp, waterSat_Pres};

    //Just reads off the given line of the water tables
    public ArrayList<Double> getWaterSat(int i) {
        ArrayList<Double> values = new ArrayList<Double>();
        for(int j = 0; j < 10; j++) {
            values.add(waterSat_Temp[j][i]);
        }
        return values;
    }

    //My attempt at writing a method to fix the state
    public ArrayList<Double> fixTemp_Water(Double temp, int index, Double prop) {
        ArrayList<Double> state = new ArrayList<>();

        //This could probably be written better
        //Finds the line equal to (no interpolation)  or right above the line needed (interpolation)
        int i = 0;
        while(temp > waterSat_Temp[0][i]) {
            i++;
            if(i > 70) {
                break;
            }
        }

        //Strips data from the water tables into an ArrayList called state
        for(int j = 0; j < 10; j++) {
            state.add(waterSat_Temp[j][i]);
        }

        //Finds the proper data, i.e. interpolates maybe
        ArrayList<Double> satState = state;
        if (!state.get(0).equals(temp)) {
            //Grabs the line right below the line needed
            ArrayList<Double> stateX = new ArrayList<Double>();
            for(int j = 0; j < 10; j++) {
                stateX.add(waterSat_Temp[j][i-1]);
            }

            //Throws all these arrays into a grinder. Spits out interpolated data, i.e. data in between the lines with respect to the given value
            satState = linearInterpolation(0, temp, stateX, state);

            //just remnants from debugging
            System.out.println(state);
            System.out.println(stateX);
        }

        //Finds quality. Needed to see which table to move to next
        Double quality = findQuality(satState.get(2 * (index - 1) - 1), prop, satState.get(2 * (index - 1)));

		/*Creates a new ArrayList, this will have 6 entries
		 * 0) Temperature
		 * 1) Pressure
		 * 2) Specific Volume
		 * 3) Internal Energy
		 * 4) Enthalpy
		 * 5) Entropy
		 */
        ArrayList<Double> fixedState = new ArrayList<>();
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

    public ArrayList<Double> fixPres_Water(Double pres) {
        ArrayList<Double> state = new ArrayList<>();
        int i = 0;
        while(pres > waterSat_Pres[0][i]) {
            i++;
        }
        for(int j = 0; j < 10; j++) {
            state.add(waterSat_Pres[j][i]);
        }
        ArrayList<Double> satState = state;
        if (state.get(0) != pres) {
            ArrayList<Double> stateX = new ArrayList<>();
            for(int j = 0; j < 10; j++) {
                stateX.add(waterSat_Pres[j][i-1]);
            }
            satState = linearInterpolation(0, pres, stateX, state);
            System.out.println(state);
            System.out.println(stateX);
        }
        //return getWaterSat(1);
        return satState;
    }

    public ArrayList<Double> fixComp_Water(Double temp, int index, Double prop) {
        ArrayList<Double> filler = new ArrayList<Double>();
        if((temp >= 20) && (temp <= 365.81)) {
            for(int i = 0; i < 8; i++) {
                int j = 0;
                ArrayList<Double> compState = new ArrayList<Double>();
                ArrayList<Double> compStateX = new ArrayList<Double>();
                while (temp > waterComp[i][j][1]) {
                    if((j + 1) == waterComp[i].length) {
                        for(Double value: waterComp[i][j]) {
                            compState.add(value);
                        }
                        break;
                    }
                    j++;
                }
                ArrayList<Double> firstInterpState = compState;
                if(temp != waterComp[i][j][2]) {
                    for(Double value: waterComp[i][j-1]) {
                        compStateX.add(value);
                    }
                    firstInterpState = linearInterpolation(1, temp, compStateX, compState);
                }


                //if()
            }
        }
        return filler;
    }

    public ArrayList<Double> linearInterpolation(Integer index, Double point, ArrayList<Double> props1, ArrayList<Double> props2) {
        ArrayList<Double> adjusted = new ArrayList<>();
        int i = 0;
        Double adjustment = (point - props1.get(index))/(props2.get(index)-props1.get(index));
        for(Double value: props1) {
            adjusted.add(value + (adjustment * (props2.get(i++) - value)));
        }
        System.out.println(adjusted);
        return adjusted;
    }

    public Double findQuality(Double liquid, Double point, Double vapor) {
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
    }

}

class TempRow {

    double temp;
    double pressure;
    double specificVolumeSatLiquid;
    double specificVolumeSatVapor;
    double internalEnergySatLiquid;
    double internalEnergySatVapor;
    double enthalpySatLiquid;
    double enthalpySatVapor;
    double entropySatLiquid;
    double entropySatVapor;

    TempRow(double temp, double pressure, double specificVolumeSatLiquid, double specificVolumeSatVapor,
            double internalEnergySatLiquid, double internalEnergySatVapor, double enthalpySatLiquid,
            double enthalpySatVapor, double entropySatLiquid, double entropySatVapor) {
        this.temp = temp;
        this.pressure = pressure;
        this.specificVolumeSatLiquid = specificVolumeSatLiquid;
        this.specificVolumeSatVapor = specificVolumeSatVapor;
        this.internalEnergySatLiquid = internalEnergySatLiquid;
        this.internalEnergySatVapor = internalEnergySatVapor;
        this.enthalpySatLiquid = enthalpySatLiquid;
        this.enthalpySatVapor = enthalpySatVapor;
        this.entropySatLiquid = entropySatLiquid;
        this.entropySatVapor = entropySatVapor;

    }

    TempRow lookUpByTemp(double temp, ArrayList<TempRow> arr) {

        TempRow toReturn = new TempRow(0,0,0,0,0,0,0,0,0,0);

        for(int i = 0; i < arr.size(); i++) {
            if (arr.get(i).temp == temp) {
                toReturn = arr.get(i);
            }
        }

        return toReturn;

    }

}
