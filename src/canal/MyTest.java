package canal;

import java.util.Arrays;
import java.util.List;

public class MyTest
{
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();
        // Level from the beginning to the first lock
        CanalSegment level0_1  = new Level( "0-1",  3326 );

        // Lock E2 Waterford
        CanalSegment lock1  = new Lock( 1 , 328, 34 );

        CanalSegment level1_2  = new Level( "1-2",  2429 );

        // Lock E3 Waterford
        CanalSegment lock2  = new Lock( 2 , 328, 35 );

        CanalSegment level2_3  = new Level( "2-3",  2693 );

        // Lock E4 Waterford
        CanalSegment lock3  = new Lock( 3 , 328, 35 );

        CanalSegment level3_4  = new Level( "3-4",  1426 );

        // Lock E5 Waterford
        CanalSegment lock4  = new Lock( 4 , 328, 33 );

        CanalSegment level4_5  = new Level( "4-5",  1478 );

        // Lock E6 Crescent
        CanalSegment lock5  = new Lock( 5 , 328, 33 );

        CanalSegment level5_6  = new Level( "5-6",  57658 );

        // Lock E7 Vischer Ferry
        CanalSegment lock6  = new Lock( 6 , 328, 27 );

        CanalSegment level6_7  = new Level( "6-7",  57921 );

        // Lock E8 Scotia
        CanalSegment lock7  = new Lock( 7 , 328, 14 );

        CanalSegment level7_8  = new Level( "7-8",  26559 );

        // Lock E9 Rotterdam
        CanalSegment lock8  = new Lock( 8 , 328, 15 );

        CanalSegment level8_9  = new Level( "8-9",  31416 );

        // Lock E10 Cranesville
        CanalSegment lock9  = new Lock( 9 , 328, 15 );

        CanalSegment level9_10  = new Level( "9-10",  22545 );

        // Lock E11 Amsterdam
        CanalSegment lock10  = new Lock( 10 , 328, 12 );

        CanalSegment level10_11  = new Level( "10-11",  22335 );

        // Lock E12 Tribes Hill
        CanalSegment lock11  = new Lock( 11 , 328, 11 );

        CanalSegment level11_12  = new Level( "11-12",  50688 );

        // Lock E13 Yosts
        CanalSegment lock12  = new Lock( 12 , 328, 8 );

        CanalSegment level12_13  = new Level( "12-13",  41342 );

        // Lock E14 Canajoharie
        CanalSegment lock13  = new Lock( 13 , 328, 8 );

        CanalSegment level13_14  = new Level( "13-14",  17688 );

        // Lock E15 Fort Plain
        CanalSegment lock14  = new Lock( 14 , 328, 8 );

        CanalSegment level14_15  = new Level( "14-15",  35482 );

        // Lock E16 St. Johnsville
        CanalSegment lock15  = new Lock( 15 , 328, 21 );

        CanalSegment level15_16  = new Level( "15-16",  42081 );

        // Lock E17 Little Falls
        CanalSegment lock16  = new Lock( 16 , 328, 41 );

        CanalSegment level16_17  = new Level( "16-17",  22176 );

        // Lock E18 Jacksonburg
        CanalSegment lock17  = new Lock( 17 , 328, 20 );

        CanalSegment level17_18  = new Level( "17-18",  62568 );

        // Lock E19 Frankfort
        CanalSegment lock18  = new Lock( 18 , 328, 21 );

        CanalSegment level18_19  = new Level( "18-19",  54279 );

        // Lock E20 Whitesboro
        CanalSegment lock19  = new Lock( 19 , 328, 16 );

        CanalSegment level19_20  = new Level( "19-20",  95568 );

        // Lock E21 New London
        CanalSegment lock20  = new Lock( 20 , 328, 25 );

        CanalSegment level20_21  = new Level( "20-21",  6969 );

        // Lock E22 New London
        CanalSegment lock21  = new Lock( 21 , 328, 25 );

        CanalSegment level21_22  = new Level( "21-22",  152645 );

        // Lock E23 Brewerton
        CanalSegment lock22  = new Lock( 22 , 328, 7 );

        CanalSegment level22_23  = new Level( "22-23",  99106 );

        // Lock E24 Baldwinsville
        CanalSegment lock23  = new Lock( 23 , 328, 11 );

        CanalSegment level23_24  = new Level( "23-24",  162043 );

        // Lock E25 May's Point
        CanalSegment lock24  = new Lock( 24 , 328, 6 );

        CanalSegment level24_25  = new Level( "24-25",  30782 );

        // Lock E26 Clyde
        CanalSegment lock25  = new Lock( 25 , 328, 6 );

        CanalSegment level25_26  = new Level( "25-26",  63624 );

        // Lock E27 Lyons
        CanalSegment lock26  = new Lock( 26 , 328, 13 );

        CanalSegment level26_27  = new Level( "26-27",  6759 );

        // Lock E28A Lyons
        CanalSegment lock27  = new Lock( 27 , 328, 20 );

        CanalSegment level27_28  = new Level( "27-28",  21014 );

        // Lock E28B Newark
        CanalSegment lock28  = new Lock( 28 , 328, 12 );

        CanalSegment level28_29  = new Level( "28-29",  51691 );

        // Lock E29 Palmyra
        CanalSegment lock29  = new Lock( 29 , 328, 16 );

        CanalSegment level29_30  = new Level( "29-30",  15735 );

        // Lock E30 Macedon
        CanalSegment lock30  = new Lock( 30 , 328, 16 );

        CanalSegment level30_31  = new Level( "30-31",  85113 );

        // Lock E32 Pittsford
        CanalSegment lock31  = new Lock( 31 , 328, 25 );

        CanalSegment level31_32  = new Level( "31-32",  6653 );

                // Lock E33 Rochester
        CanalSegment lock32  = new Lock( 32 , 328, 25 );

        CanalSegment level32_33  = new Level( "32-33",  339398 );

        // Lock E34-35 Lockport
        CanalSegment lock33  = new Lock( 33 , 328, 25 );



        List< CanalSegment > fullCanalRoute =
                Arrays.asList( level0_1, lock1, level1_2, lock2, level2_3, lock3, level3_4, lock4, level4_5, lock5,
                        level5_6, lock6, level6_7, lock7, level7_8, lock8, level8_9, lock9, level9_10, lock10,
                        level10_11, lock11, level11_12, lock12, level12_13, lock13, level13_14, lock14, level14_15,
                        lock15, level15_16, lock16, level16_17, lock17, level17_18, lock18, level18_19, lock19,
                        level19_20, lock20, level20_21, lock21, level21_22, lock22, level22_23, lock23, level23_24,
                        lock24, level24_25, lock25, level25_26, lock26, level26_27, lock27, level27_28, lock28,
                        level28_29, lock29, level29_30, lock30, level30_31, lock31, level31_32, lock32, level32_33, lock33 );

        List< CanalSegment > partialRoute1 =
                Arrays.asList( level7_8, lock8, level8_9, lock9, level9_10, lock10,
                        level10_11, lock11, level11_12, lock12, level12_13, lock13, level13_14, lock14, level14_15,
                        lock15, level15_16, lock16, level16_17, lock17, level17_18, lock18, level18_19, lock19,
                        level19_20, lock20, level20_21, lock21, level21_22, lock22, level22_23, lock23, level23_24,
                        lock24, level24_25, lock25, level25_26, lock26, level26_27, lock27, level27_28, lock28,
                        level28_29, lock29, level29_30, lock30, level30_31, lock31, level31_32, lock32, level32_33, lock33 );

        List< CanalSegment > partialRoute2 =
                Arrays.asList( level11_12, lock12, level12_13, lock13, level13_14, lock14, level14_15, lock15,
                        level15_16, lock16, level16_17, lock17, level17_18, lock18, level18_19, lock19, level19_20,
                        lock20, level20_21, lock21, level21_22 );

        List< CanalSegment > partialRoute3 =
                Arrays.asList( lock17, level17_18, lock18, level18_19, lock19, level19_20, lock20, level20_21, lock21, level21_22 );

        // five boats to travel at certain points around our canal
        Boat b1 = new Boat( "The Sam Patch", 25, fullCanalRoute );
        Boat b2 = new Boat( "Lil' Diamond III", 35, fullCanalRoute );
        Boat b3 = new Boat( "Colonial Belle", 40, partialRoute1 );
        Boat b4 = new Boat( "Urger", 40, partialRoute2 );
        Boat b5 = new Boat( "Carmelite II", 40, partialRoute3 );

        b1.start();
        Utilities.sleep( 2 );
        b2.start();
        Utilities.sleep( 495 );
        b3.start();
        Utilities.sleep(100);
        b4.start();
        Utilities.sleep(50);
        b5.start();

        try {
            b1.join();
            b2.join();
            b3.join();
            b4.join();
            b5.join();
        }
        catch( InterruptedException ie ) {
            assert false: "Thread interrupted.";
        }

        long endTime = System.nanoTime();

        long totalElapsedTimeMinutes = ((endTime - startTime) / 1000000000) / 60;
        Utilities.log("All five boats have finished their cruise. This took " + totalElapsedTimeMinutes + " real-time minutes.");
    }
}
