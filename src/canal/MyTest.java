package canal;

import java.util.Arrays;
import java.util.List;


/**
 * The MyTest class runs a test of the Lock, Boat, and other associated classes.
 * The expected output of the program is given in a comment at the bottom of this file;
 * it takes up nearly 600 lines it seemed best to do it this way.
 *
 * @author Kevin Becker
 */
public class MyTest
{
    /**
     * Builds a series of locks and levels and puts five boats into motion.
     *
     * @param args The java program arguments.
     */
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();
        // Level from the true "mile 0" to the first lock
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

/*
   0:00: The Sam Patch is arriving at Level 0-1.
   0:00: The Sam Patch[len=25'] is entering Level 0-1 for 8 minutes.
   0:02: Lil' Diamond III is arriving at Level 0-1.
   0:02: Lil' Diamond III[len=35'] is entering Level 0-1 for 7 minutes.
   0:08: The Sam Patch[len=25'] has left Level 0-1.
   0:08: The Sam Patch is arriving at Lock 1[len=328', ht=34'].
   0:08: The Sam Patch[len=25'] is entering Lock 1[len=328', ht=34'] for 17 minutes.
   0:09: Lil' Diamond III[len=35'] has left Level 0-1.
   0:09: Lil' Diamond III is arriving at Lock 1[len=328', ht=34'].
   0:25: The Sam Patch[len=25'] has left Lock 1[len=328', ht=34'].
   0:25: The Sam Patch is arriving at Level 1-2.
   0:25: Lil' Diamond III[len=35'] is entering Lock 1[len=328', ht=34'] for 18 minutes.
   0:25: The Sam Patch[len=25'] is entering Level 1-2 for 5 minutes.
   0:30: The Sam Patch[len=25'] has left Level 1-2.
   0:30: The Sam Patch is arriving at Lock 2[len=328', ht=35'].
   0:30: The Sam Patch[len=25'] is entering Lock 2[len=328', ht=35'] for 18 minutes.
   0:43: Lil' Diamond III[len=35'] has left Lock 1[len=328', ht=34'].
   0:43: Lil' Diamond III is arriving at Level 1-2.
   0:43: Lil' Diamond III[len=35'] is entering Level 1-2 for 5 minutes.
   0:48: The Sam Patch[len=25'] has left Lock 2[len=328', ht=35'].
   0:48: Lil' Diamond III[len=35'] has left Level 1-2.
   0:48: The Sam Patch is arriving at Level 2-3.
   0:48: Lil' Diamond III is arriving at Lock 2[len=328', ht=35'].
   0:48: The Sam Patch[len=25'] is entering Level 2-3 for 6 minutes.
   0:48: Lil' Diamond III[len=35'] is entering Lock 2[len=328', ht=35'] for 18 minutes.
   0:54: The Sam Patch[len=25'] has left Level 2-3.
   0:54: The Sam Patch is arriving at Lock 3[len=328', ht=35'].
   0:54: The Sam Patch[len=25'] is entering Lock 3[len=328', ht=35'] for 18 minutes.
   1:06: Lil' Diamond III[len=35'] has left Lock 2[len=328', ht=35'].
   1:06: Lil' Diamond III is arriving at Level 2-3.
   1:06: Lil' Diamond III[len=35'] is entering Level 2-3 for 6 minutes.
   1:12: Lil' Diamond III[len=35'] has left Level 2-3.
   1:12: The Sam Patch[len=25'] has left Lock 3[len=328', ht=35'].
   1:12: Lil' Diamond III is arriving at Lock 3[len=328', ht=35'].
   1:12: The Sam Patch is arriving at Level 3-4.
   1:12: Lil' Diamond III[len=35'] is entering Lock 3[len=328', ht=35'] for 18 minutes.
   1:12: The Sam Patch[len=25'] is entering Level 3-4 for 3 minutes.
   1:15: The Sam Patch[len=25'] has left Level 3-4.
   1:15: The Sam Patch is arriving at Lock 4[len=328', ht=33'].
   1:15: The Sam Patch[len=25'] is entering Lock 4[len=328', ht=33'] for 17 minutes.
   1:30: Lil' Diamond III[len=35'] has left Lock 3[len=328', ht=35'].
   1:30: Lil' Diamond III is arriving at Level 3-4.
   1:30: Lil' Diamond III[len=35'] is entering Level 3-4 for 3 minutes.
   1:32: The Sam Patch[len=25'] has left Lock 4[len=328', ht=33'].
   1:32: The Sam Patch is arriving at Level 4-5.
   1:32: The Sam Patch[len=25'] is entering Level 4-5 for 3 minutes.
   1:33: Lil' Diamond III[len=35'] has left Level 3-4.
   1:33: Lil' Diamond III is arriving at Lock 4[len=328', ht=33'].
   1:33: Lil' Diamond III[len=35'] is entering Lock 4[len=328', ht=33'] for 17 minutes.
   1:35: The Sam Patch[len=25'] has left Level 4-5.
   1:35: The Sam Patch is arriving at Lock 5[len=328', ht=33'].
   1:35: The Sam Patch[len=25'] is entering Lock 5[len=328', ht=33'] for 17 minutes.
   1:50: Lil' Diamond III[len=35'] has left Lock 4[len=328', ht=33'].
   1:50: Lil' Diamond III is arriving at Level 4-5.
   1:50: Lil' Diamond III[len=35'] is entering Level 4-5 for 3 minutes.
   1:52: The Sam Patch[len=25'] has left Lock 5[len=328', ht=33'].
   1:52: The Sam Patch is arriving at Level 5-6.
   1:52: The Sam Patch[len=25'] is entering Level 5-6 for 131 minutes.
   1:53: Lil' Diamond III[len=35'] has left Level 4-5.
   1:53: Lil' Diamond III is arriving at Lock 5[len=328', ht=33'].
   1:53: Lil' Diamond III[len=35'] is entering Lock 5[len=328', ht=33'] for 17 minutes.
   2:10: Lil' Diamond III[len=35'] has left Lock 5[len=328', ht=33'].
   2:10: Lil' Diamond III is arriving at Level 5-6.
   2:10: Lil' Diamond III[len=35'] is entering Level 5-6 for 131 minutes.
   4:03: The Sam Patch[len=25'] has left Level 5-6.
   4:03: The Sam Patch is arriving at Lock 6[len=328', ht=27'].
   4:03: The Sam Patch[len=25'] is entering Lock 6[len=328', ht=27'] for 16 minutes.
   4:19: The Sam Patch[len=25'] has left Lock 6[len=328', ht=27'].
   4:19: The Sam Patch is arriving at Level 6-7.
   4:19: The Sam Patch[len=25'] is entering Level 6-7 for 132 minutes.
   4:21: Lil' Diamond III[len=35'] has left Level 5-6.
   4:21: Lil' Diamond III is arriving at Lock 6[len=328', ht=27'].
   4:21: Lil' Diamond III[len=35'] is entering Lock 6[len=328', ht=27'] for 16 minutes.
   4:37: Lil' Diamond III[len=35'] has left Lock 6[len=328', ht=27'].
   4:37: Lil' Diamond III is arriving at Level 6-7.
   4:37: Lil' Diamond III[len=35'] is entering Level 6-7 for 132 minutes.
   6:31: The Sam Patch[len=25'] has left Level 6-7.
   6:31: The Sam Patch is arriving at Lock 7[len=328', ht=14'].
   6:31: The Sam Patch[len=25'] is entering Lock 7[len=328', ht=14'] for 12 minutes.
   6:43: The Sam Patch[len=25'] has left Lock 7[len=328', ht=14'].
   6:43: The Sam Patch is arriving at Level 7-8.
   6:43: The Sam Patch[len=25'] is entering Level 7-8 for 60 minutes.
   6:49: Lil' Diamond III[len=35'] has left Level 6-7.
   6:49: Lil' Diamond III is arriving at Lock 7[len=328', ht=14'].
   6:49: Lil' Diamond III[len=35'] is entering Lock 7[len=328', ht=14'] for 13 minutes.
   7:02: Lil' Diamond III[len=35'] has left Lock 7[len=328', ht=14'].
   7:02: Lil' Diamond III is arriving at Level 7-8.
   7:02: Lil' Diamond III[len=35'] is entering Level 7-8 for 60 minutes.
   7:43: The Sam Patch[len=25'] has left Level 7-8.
   7:43: The Sam Patch is arriving at Lock 8[len=328', ht=15'].
   7:43: The Sam Patch[len=25'] is entering Lock 8[len=328', ht=15'] for 13 minutes.
   7:56: The Sam Patch[len=25'] has left Lock 8[len=328', ht=15'].
   7:56: The Sam Patch is arriving at Level 8-9.
   7:56: The Sam Patch[len=25'] is entering Level 8-9 for 71 minutes.
   8:02: Lil' Diamond III[len=35'] has left Level 7-8.
   8:02: Lil' Diamond III is arriving at Lock 8[len=328', ht=15'].
   8:02: Lil' Diamond III[len=35'] is entering Lock 8[len=328', ht=15'] for 13 minutes.
   8:15: Lil' Diamond III[len=35'] has left Lock 8[len=328', ht=15'].
   8:15: Lil' Diamond III is arriving at Level 8-9.
   8:15: Lil' Diamond III[len=35'] is entering Level 8-9 for 71 minutes.
   8:17: Colonial Belle is arriving at Level 7-8.
   8:17: Colonial Belle[len=40'] is entering Level 7-8 for 60 minutes.
   9:07: The Sam Patch[len=25'] has left Level 8-9.
   9:07: The Sam Patch is arriving at Lock 9[len=328', ht=15'].
   9:07: The Sam Patch[len=25'] is entering Lock 9[len=328', ht=15'] for 13 minutes.
   9:17: Colonial Belle[len=40'] has left Level 7-8.
   9:17: Colonial Belle is arriving at Lock 8[len=328', ht=15'].
   9:17: Colonial Belle[len=40'] is entering Lock 8[len=328', ht=15'] for 13 minutes.
   9:20: The Sam Patch[len=25'] has left Lock 9[len=328', ht=15'].
   9:20: The Sam Patch is arriving at Level 9-10.
   9:20: The Sam Patch[len=25'] is entering Level 9-10 for 51 minutes.
   9:26: Lil' Diamond III[len=35'] has left Level 8-9.
   9:26: Lil' Diamond III is arriving at Lock 9[len=328', ht=15'].
   9:26: Lil' Diamond III[len=35'] is entering Lock 9[len=328', ht=15'] for 13 minutes.
   9:30: Colonial Belle[len=40'] has left Lock 8[len=328', ht=15'].
   9:30: Colonial Belle is arriving at Level 8-9.
   9:30: Colonial Belle[len=40'] is entering Level 8-9 for 71 minutes.
   9:39: Lil' Diamond III[len=35'] has left Lock 9[len=328', ht=15'].
   9:39: Lil' Diamond III is arriving at Level 9-10.
   9:39: Lil' Diamond III[len=35'] is entering Level 9-10 for 51 minutes.
   9:57: Urger is arriving at Level 11-12.
   9:57: Urger[len=40'] is entering Level 11-12 for 115 minutes.
  10:11: The Sam Patch[len=25'] has left Level 9-10.
  10:11: The Sam Patch is arriving at Lock 10[len=328', ht=12'].
  10:11: The Sam Patch[len=25'] is entering Lock 10[len=328', ht=12'] for 12 minutes.
  10:23: The Sam Patch[len=25'] has left Lock 10[len=328', ht=12'].
  10:23: The Sam Patch is arriving at Level 10-11.
  10:23: The Sam Patch[len=25'] is entering Level 10-11 for 51 minutes.
  10:30: Lil' Diamond III[len=35'] has left Level 9-10.
  10:30: Lil' Diamond III is arriving at Lock 10[len=328', ht=12'].
  10:30: Lil' Diamond III[len=35'] is entering Lock 10[len=328', ht=12'] for 12 minutes.
  10:41: Colonial Belle[len=40'] has left Level 8-9.
  10:41: Colonial Belle is arriving at Lock 9[len=328', ht=15'].
  10:41: Colonial Belle[len=40'] is entering Lock 9[len=328', ht=15'] for 13 minutes.
  10:42: Lil' Diamond III[len=35'] has left Lock 10[len=328', ht=12'].
  10:42: Lil' Diamond III is arriving at Level 10-11.
  10:42: Lil' Diamond III[len=35'] is entering Level 10-11 for 51 minutes.
  10:47: Carmelite II is arriving at Lock 17[len=328', ht=20'].
  10:47: Carmelite II[len=40'] is entering Lock 17[len=328', ht=20'] for 14 minutes.
  10:54: Colonial Belle[len=40'] has left Lock 9[len=328', ht=15'].
  10:54: Colonial Belle is arriving at Level 9-10.
  10:54: Colonial Belle[len=40'] is entering Level 9-10 for 51 minutes.
  11:01: Carmelite II[len=40'] has left Lock 17[len=328', ht=20'].
  11:01: Carmelite II is arriving at Level 17-18.
  11:01: Carmelite II[len=40'] is entering Level 17-18 for 142 minutes.
  11:14: The Sam Patch[len=25'] has left Level 10-11.
  11:14: The Sam Patch is arriving at Lock 11[len=328', ht=11'].
  11:14: The Sam Patch[len=25'] is entering Lock 11[len=328', ht=11'] for 12 minutes.
  11:26: The Sam Patch[len=25'] has left Lock 11[len=328', ht=11'].
  11:26: The Sam Patch is arriving at Level 11-12.
  11:26: The Sam Patch[len=25'] is entering Level 11-12 for 115 minutes.
  11:33: Lil' Diamond III[len=35'] has left Level 10-11.
  11:33: Lil' Diamond III is arriving at Lock 11[len=328', ht=11'].
  11:33: Lil' Diamond III[len=35'] is entering Lock 11[len=328', ht=11'] for 12 minutes.
  11:45: Colonial Belle[len=40'] has left Level 9-10.
  11:45: Colonial Belle is arriving at Lock 10[len=328', ht=12'].
  11:45: Colonial Belle[len=40'] is entering Lock 10[len=328', ht=12'] for 12 minutes.
  11:45: Lil' Diamond III[len=35'] has left Lock 11[len=328', ht=11'].
  11:45: Lil' Diamond III is arriving at Level 11-12.
  11:45: Lil' Diamond III[len=35'] is entering Level 11-12 for 115 minutes.
  11:52: Urger[len=40'] has left Level 11-12.
  11:52: Urger is arriving at Lock 12[len=328', ht=8'].
  11:52: Urger[len=40'] is entering Lock 12[len=328', ht=8'] for 11 minutes.
  11:57: Colonial Belle[len=40'] has left Lock 10[len=328', ht=12'].
  11:57: Colonial Belle is arriving at Level 10-11.
  11:57: Colonial Belle[len=40'] is entering Level 10-11 for 51 minutes.
  12:03: Urger[len=40'] has left Lock 12[len=328', ht=8'].
  12:03: Urger is arriving at Level 12-13.
  12:03: Urger[len=40'] is entering Level 12-13 for 94 minutes.
  12:48: Colonial Belle[len=40'] has left Level 10-11.
  12:48: Colonial Belle is arriving at Lock 11[len=328', ht=11'].
  12:48: Colonial Belle[len=40'] is entering Lock 11[len=328', ht=11'] for 12 minutes.
  13:00: Colonial Belle[len=40'] has left Lock 11[len=328', ht=11'].
  13:00: Colonial Belle is arriving at Level 11-12.
  13:00: Colonial Belle[len=40'] is entering Level 11-12 for 115 minutes.
  13:21: The Sam Patch[len=25'] has left Level 11-12.
  13:21: The Sam Patch is arriving at Lock 12[len=328', ht=8'].
  13:21: The Sam Patch[len=25'] is entering Lock 12[len=328', ht=8'] for 11 minutes.
  13:23: Carmelite II[len=40'] has left Level 17-18.
  13:23: Carmelite II is arriving at Lock 18[len=328', ht=21'].
  13:23: Carmelite II[len=40'] is entering Lock 18[len=328', ht=21'] for 14 minutes.
  13:32: The Sam Patch[len=25'] has left Lock 12[len=328', ht=8'].
  13:32: The Sam Patch is arriving at Level 12-13.
  13:32: The Sam Patch[len=25'] is entering Level 12-13 for 94 minutes.
  13:37: Carmelite II[len=40'] has left Lock 18[len=328', ht=21'].
  13:37: Carmelite II is arriving at Level 18-19.
  13:37: Carmelite II[len=40'] is entering Level 18-19 for 123 minutes.
  13:37: Urger[len=40'] has left Level 12-13.
  13:37: Urger is arriving at Lock 13[len=328', ht=8'].
  13:37: Urger[len=40'] is entering Lock 13[len=328', ht=8'] for 11 minutes.
  13:40: Lil' Diamond III[len=35'] has left Level 11-12.
  13:40: Lil' Diamond III is arriving at Lock 12[len=328', ht=8'].
  13:40: Lil' Diamond III[len=35'] is entering Lock 12[len=328', ht=8'] for 11 minutes.
  13:48: Urger[len=40'] has left Lock 13[len=328', ht=8'].
  13:48: Urger is arriving at Level 13-14.
  13:48: Urger[len=40'] is entering Level 13-14 for 40 minutes.
  13:51: Lil' Diamond III[len=35'] has left Lock 12[len=328', ht=8'].
  13:51: Lil' Diamond III is arriving at Level 12-13.
  13:51: Lil' Diamond III[len=35'] is entering Level 12-13 for 94 minutes.
  14:28: Urger[len=40'] has left Level 13-14.
  14:28: Urger is arriving at Lock 14[len=328', ht=8'].
  14:28: Urger[len=40'] is entering Lock 14[len=328', ht=8'] for 11 minutes.
  14:39: Urger[len=40'] has left Lock 14[len=328', ht=8'].
  14:39: Urger is arriving at Level 14-15.
  14:39: Urger[len=40'] is entering Level 14-15 for 81 minutes.
  14:55: Colonial Belle[len=40'] has left Level 11-12.
  14:55: Colonial Belle is arriving at Lock 12[len=328', ht=8'].
  14:55: Colonial Belle[len=40'] is entering Lock 12[len=328', ht=8'] for 11 minutes.
  15:06: Colonial Belle[len=40'] has left Lock 12[len=328', ht=8'].
  15:06: Colonial Belle is arriving at Level 12-13.
  15:06: Colonial Belle[len=40'] is entering Level 12-13 for 94 minutes.
  15:06: The Sam Patch[len=25'] has left Level 12-13.
  15:06: The Sam Patch is arriving at Lock 13[len=328', ht=8'].
  15:06: The Sam Patch[len=25'] is entering Lock 13[len=328', ht=8'] for 11 minutes.
  15:17: The Sam Patch[len=25'] has left Lock 13[len=328', ht=8'].
  15:17: The Sam Patch is arriving at Level 13-14.
  15:17: The Sam Patch[len=25'] is entering Level 13-14 for 40 minutes.
  15:25: Lil' Diamond III[len=35'] has left Level 12-13.
  15:25: Lil' Diamond III is arriving at Lock 13[len=328', ht=8'].
  15:25: Lil' Diamond III[len=35'] is entering Lock 13[len=328', ht=8'] for 11 minutes.
  15:36: Lil' Diamond III[len=35'] has left Lock 13[len=328', ht=8'].
  15:36: Lil' Diamond III is arriving at Level 13-14.
  15:36: Lil' Diamond III[len=35'] is entering Level 13-14 for 40 minutes.
  15:40: Carmelite II[len=40'] has left Level 18-19.
  15:40: Carmelite II is arriving at Lock 19[len=328', ht=16'].
  15:40: Carmelite II[len=40'] is entering Lock 19[len=328', ht=16'] for 13 minutes.
  15:53: Carmelite II[len=40'] has left Lock 19[len=328', ht=16'].
  15:53: Carmelite II is arriving at Level 19-20.
  15:53: Carmelite II[len=40'] is entering Level 19-20 for 217 minutes.
  15:57: The Sam Patch[len=25'] has left Level 13-14.
  15:57: The Sam Patch is arriving at Lock 14[len=328', ht=8'].
  15:57: The Sam Patch[len=25'] is entering Lock 14[len=328', ht=8'] for 11 minutes.
  16:00: Urger[len=40'] has left Level 14-15.
  16:00: Urger is arriving at Lock 15[len=328', ht=21'].
  16:00: Urger[len=40'] is entering Lock 15[len=328', ht=21'] for 14 minutes.
  16:08: The Sam Patch[len=25'] has left Lock 14[len=328', ht=8'].
  16:08: The Sam Patch is arriving at Level 14-15.
  16:08: The Sam Patch[len=25'] is entering Level 14-15 for 81 minutes.
  16:14: Urger[len=40'] has left Lock 15[len=328', ht=21'].
  16:14: Urger is arriving at Level 15-16.
  16:14: Urger[len=40'] is entering Level 15-16 for 96 minutes.
  16:16: Lil' Diamond III[len=35'] has left Level 13-14.
  16:16: Lil' Diamond III is arriving at Lock 14[len=328', ht=8'].
  16:16: Lil' Diamond III[len=35'] is entering Lock 14[len=328', ht=8'] for 11 minutes.
  16:27: Lil' Diamond III[len=35'] has left Lock 14[len=328', ht=8'].
  16:27: Lil' Diamond III is arriving at Level 14-15.
  16:27: Lil' Diamond III[len=35'] is entering Level 14-15 for 81 minutes.
  16:40: Colonial Belle[len=40'] has left Level 12-13.
  16:40: Colonial Belle is arriving at Lock 13[len=328', ht=8'].
  16:40: Colonial Belle[len=40'] is entering Lock 13[len=328', ht=8'] for 11 minutes.
  16:51: Colonial Belle[len=40'] has left Lock 13[len=328', ht=8'].
  16:51: Colonial Belle is arriving at Level 13-14.
  16:51: Colonial Belle[len=40'] is entering Level 13-14 for 40 minutes.
  17:29: The Sam Patch[len=25'] has left Level 14-15.
  17:29: The Sam Patch is arriving at Lock 15[len=328', ht=21'].
  17:29: The Sam Patch[len=25'] is entering Lock 15[len=328', ht=21'] for 14 minutes.
  17:31: Colonial Belle[len=40'] has left Level 13-14.
  17:31: Colonial Belle is arriving at Lock 14[len=328', ht=8'].
  17:31: Colonial Belle[len=40'] is entering Lock 14[len=328', ht=8'] for 11 minutes.
  17:42: Colonial Belle[len=40'] has left Lock 14[len=328', ht=8'].
  17:42: Colonial Belle is arriving at Level 14-15.
  17:42: Colonial Belle[len=40'] is entering Level 14-15 for 81 minutes.
  17:43: The Sam Patch[len=25'] has left Lock 15[len=328', ht=21'].
  17:43: The Sam Patch is arriving at Level 15-16.
  17:43: The Sam Patch[len=25'] is entering Level 15-16 for 96 minutes.
  17:48: Lil' Diamond III[len=35'] has left Level 14-15.
  17:48: Lil' Diamond III is arriving at Lock 15[len=328', ht=21'].
  17:48: Lil' Diamond III[len=35'] is entering Lock 15[len=328', ht=21'] for 14 minutes.
  17:50: Urger[len=40'] has left Level 15-16.
  17:50: Urger is arriving at Lock 16[len=328', ht=41'].
  17:50: Urger[len=40'] is entering Lock 16[len=328', ht=41'] for 19 minutes.
  18:02: Lil' Diamond III[len=35'] has left Lock 15[len=328', ht=21'].
  18:02: Lil' Diamond III is arriving at Level 15-16.
  18:02: Lil' Diamond III[len=35'] is entering Level 15-16 for 96 minutes.
  18:09: Urger[len=40'] has left Lock 16[len=328', ht=41'].
  18:09: Urger is arriving at Level 16-17.
  18:09: Urger[len=40'] is entering Level 16-17 for 50 minutes.
  18:59: Urger[len=40'] has left Level 16-17.
  18:59: Urger is arriving at Lock 17[len=328', ht=20'].
  18:59: Urger[len=40'] is entering Lock 17[len=328', ht=20'] for 14 minutes.
  19:03: Colonial Belle[len=40'] has left Level 14-15.
  19:03: Colonial Belle is arriving at Lock 15[len=328', ht=21'].
  19:03: Colonial Belle[len=40'] is entering Lock 15[len=328', ht=21'] for 14 minutes.
  19:13: Urger[len=40'] has left Lock 17[len=328', ht=20'].
  19:13: Urger is arriving at Level 17-18.
  19:13: Urger[len=40'] is entering Level 17-18 for 142 minutes.
  19:17: Colonial Belle[len=40'] has left Lock 15[len=328', ht=21'].
  19:17: Colonial Belle is arriving at Level 15-16.
  19:17: Colonial Belle[len=40'] is entering Level 15-16 for 96 minutes.
  19:19: The Sam Patch[len=25'] has left Level 15-16.
  19:19: The Sam Patch is arriving at Lock 16[len=328', ht=41'].
  19:19: The Sam Patch[len=25'] is entering Lock 16[len=328', ht=41'] for 19 minutes.
  19:30: Carmelite II[len=40'] has left Level 19-20.
  19:30: Carmelite II is arriving at Lock 20[len=328', ht=25'].
  19:30: Carmelite II[len=40'] is entering Lock 20[len=328', ht=25'] for 15 minutes.
  19:38: The Sam Patch[len=25'] has left Lock 16[len=328', ht=41'].
  19:38: The Sam Patch is arriving at Level 16-17.
  19:38: The Sam Patch[len=25'] is entering Level 16-17 for 50 minutes.
  19:38: Lil' Diamond III[len=35'] has left Level 15-16.
  19:38: Lil' Diamond III is arriving at Lock 16[len=328', ht=41'].
  19:38: Lil' Diamond III[len=35'] is entering Lock 16[len=328', ht=41'] for 19 minutes.
  19:45: Carmelite II[len=40'] has left Lock 20[len=328', ht=25'].
  19:45: Carmelite II is arriving at Level 20-21.
  19:45: Carmelite II[len=40'] is entering Level 20-21 for 16 minutes.
  19:57: Lil' Diamond III[len=35'] has left Lock 16[len=328', ht=41'].
  19:57: Lil' Diamond III is arriving at Level 16-17.
  19:57: Lil' Diamond III[len=35'] is entering Level 16-17 for 50 minutes.
  20:01: Carmelite II[len=40'] has left Level 20-21.
  20:01: Carmelite II is arriving at Lock 21[len=328', ht=25'].
  20:01: Carmelite II[len=40'] is entering Lock 21[len=328', ht=25'] for 15 minutes.
  20:16: Carmelite II[len=40'] has left Lock 21[len=328', ht=25'].
  20:16: Carmelite II is arriving at Level 21-22.
  20:16: Carmelite II[len=40'] is entering Level 21-22 for 347 minutes.
  20:28: The Sam Patch[len=25'] has left Level 16-17.
  20:28: The Sam Patch is arriving at Lock 17[len=328', ht=20'].
  20:28: The Sam Patch[len=25'] is entering Lock 17[len=328', ht=20'] for 14 minutes.
  20:42: The Sam Patch[len=25'] has left Lock 17[len=328', ht=20'].
  20:42: The Sam Patch is arriving at Level 17-18.
  20:42: The Sam Patch[len=25'] is entering Level 17-18 for 142 minutes.
  20:47: Lil' Diamond III[len=35'] has left Level 16-17.
  20:47: Lil' Diamond III is arriving at Lock 17[len=328', ht=20'].
  20:47: Lil' Diamond III[len=35'] is entering Lock 17[len=328', ht=20'] for 14 minutes.
  20:53: Colonial Belle[len=40'] has left Level 15-16.
  20:53: Colonial Belle is arriving at Lock 16[len=328', ht=41'].
  20:53: Colonial Belle[len=40'] is entering Lock 16[len=328', ht=41'] for 19 minutes.
  21:01: Lil' Diamond III[len=35'] has left Lock 17[len=328', ht=20'].
  21:01: Lil' Diamond III is arriving at Level 17-18.
  21:01: Lil' Diamond III[len=35'] is entering Level 17-18 for 142 minutes.
  21:12: Colonial Belle[len=40'] has left Lock 16[len=328', ht=41'].
  21:12: Colonial Belle is arriving at Level 16-17.
  21:12: Colonial Belle[len=40'] is entering Level 16-17 for 50 minutes.
  21:35: Urger[len=40'] has left Level 17-18.
  21:35: Urger is arriving at Lock 18[len=328', ht=21'].
  21:35: Urger[len=40'] is entering Lock 18[len=328', ht=21'] for 14 minutes.
  21:49: Urger[len=40'] has left Lock 18[len=328', ht=21'].
  21:49: Urger is arriving at Level 18-19.
  21:49: Urger[len=40'] is entering Level 18-19 for 123 minutes.
  22:02: Colonial Belle[len=40'] has left Level 16-17.
  22:02: Colonial Belle is arriving at Lock 17[len=328', ht=20'].
  22:02: Colonial Belle[len=40'] is entering Lock 17[len=328', ht=20'] for 14 minutes.
  22:16: Colonial Belle[len=40'] has left Lock 17[len=328', ht=20'].
  22:16: Colonial Belle is arriving at Level 17-18.
  22:16: Colonial Belle[len=40'] is entering Level 17-18 for 142 minutes.
  23:04: The Sam Patch[len=25'] has left Level 17-18.
  23:04: The Sam Patch is arriving at Lock 18[len=328', ht=21'].
  23:04: The Sam Patch[len=25'] is entering Lock 18[len=328', ht=21'] for 14 minutes.
  23:18: The Sam Patch[len=25'] has left Lock 18[len=328', ht=21'].
  23:18: The Sam Patch is arriving at Level 18-19.
  23:18: The Sam Patch[len=25'] is entering Level 18-19 for 123 minutes.
  23:23: Lil' Diamond III[len=35'] has left Level 17-18.
  23:23: Lil' Diamond III is arriving at Lock 18[len=328', ht=21'].
  23:23: Lil' Diamond III[len=35'] is entering Lock 18[len=328', ht=21'] for 14 minutes.
  23:37: Lil' Diamond III[len=35'] has left Lock 18[len=328', ht=21'].
  23:37: Lil' Diamond III is arriving at Level 18-19.
  23:37: Lil' Diamond III[len=35'] is entering Level 18-19 for 123 minutes.
  23:52: Urger[len=40'] has left Level 18-19.
  23:52: Urger is arriving at Lock 19[len=328', ht=16'].
  23:52: Urger[len=40'] is entering Lock 19[len=328', ht=16'] for 13 minutes.
  24:05: Urger[len=40'] has left Lock 19[len=328', ht=16'].
  24:05: Urger is arriving at Level 19-20.
  24:05: Urger[len=40'] is entering Level 19-20 for 217 minutes.
  24:38: Colonial Belle[len=40'] has left Level 17-18.
  24:38: Colonial Belle is arriving at Lock 18[len=328', ht=21'].
  24:38: Colonial Belle[len=40'] is entering Lock 18[len=328', ht=21'] for 14 minutes.
  24:52: Colonial Belle[len=40'] has left Lock 18[len=328', ht=21'].
  24:52: Colonial Belle is arriving at Level 18-19.
  24:52: Colonial Belle[len=40'] is entering Level 18-19 for 123 minutes.
  25:21: The Sam Patch[len=25'] has left Level 18-19.
  25:21: The Sam Patch is arriving at Lock 19[len=328', ht=16'].
  25:21: The Sam Patch[len=25'] is entering Lock 19[len=328', ht=16'] for 13 minutes.
  25:34: The Sam Patch[len=25'] has left Lock 19[len=328', ht=16'].
  25:34: The Sam Patch is arriving at Level 19-20.
  25:34: The Sam Patch[len=25'] is entering Level 19-20 for 217 minutes.
  25:40: Lil' Diamond III[len=35'] has left Level 18-19.
  25:40: Lil' Diamond III is arriving at Lock 19[len=328', ht=16'].
  25:40: Lil' Diamond III[len=35'] is entering Lock 19[len=328', ht=16'] for 13 minutes.
  25:53: Lil' Diamond III[len=35'] has left Lock 19[len=328', ht=16'].
  25:53: Lil' Diamond III is arriving at Level 19-20.
  25:53: Lil' Diamond III[len=35'] is entering Level 19-20 for 217 minutes.
  26:03: Carmelite II[len=40'] has left Level 21-22.
  26:03: Carmelite II has ended its trip.
  26:55: Colonial Belle[len=40'] has left Level 18-19.
  26:55: Colonial Belle is arriving at Lock 19[len=328', ht=16'].
  26:55: Colonial Belle[len=40'] is entering Lock 19[len=328', ht=16'] for 13 minutes.
  27:08: Colonial Belle[len=40'] has left Lock 19[len=328', ht=16'].
  27:08: Colonial Belle is arriving at Level 19-20.
  27:08: Colonial Belle[len=40'] is entering Level 19-20 for 217 minutes.
  27:42: Urger[len=40'] has left Level 19-20.
  27:42: Urger is arriving at Lock 20[len=328', ht=25'].
  27:42: Urger[len=40'] is entering Lock 20[len=328', ht=25'] for 15 minutes.
  27:57: Urger[len=40'] has left Lock 20[len=328', ht=25'].
  27:57: Urger is arriving at Level 20-21.
  27:57: Urger[len=40'] is entering Level 20-21 for 16 minutes.
  28:13: Urger[len=40'] has left Level 20-21.
  28:13: Urger is arriving at Lock 21[len=328', ht=25'].
  28:13: Urger[len=40'] is entering Lock 21[len=328', ht=25'] for 15 minutes.
  28:28: Urger[len=40'] has left Lock 21[len=328', ht=25'].
  28:28: Urger is arriving at Level 21-22.
  28:28: Urger[len=40'] is entering Level 21-22 for 347 minutes.
  29:11: The Sam Patch[len=25'] has left Level 19-20.
  29:11: The Sam Patch is arriving at Lock 20[len=328', ht=25'].
  29:11: The Sam Patch[len=25'] is entering Lock 20[len=328', ht=25'] for 15 minutes.
  29:26: The Sam Patch[len=25'] has left Lock 20[len=328', ht=25'].
  29:26: The Sam Patch is arriving at Level 20-21.
  29:26: The Sam Patch[len=25'] is entering Level 20-21 for 16 minutes.
  29:30: Lil' Diamond III[len=35'] has left Level 19-20.
  29:30: Lil' Diamond III is arriving at Lock 20[len=328', ht=25'].
  29:30: Lil' Diamond III[len=35'] is entering Lock 20[len=328', ht=25'] for 15 minutes.
  29:42: The Sam Patch[len=25'] has left Level 20-21.
  29:42: The Sam Patch is arriving at Lock 21[len=328', ht=25'].
  29:42: The Sam Patch[len=25'] is entering Lock 21[len=328', ht=25'] for 15 minutes.
  29:45: Lil' Diamond III[len=35'] has left Lock 20[len=328', ht=25'].
  29:45: Lil' Diamond III is arriving at Level 20-21.
  29:45: Lil' Diamond III[len=35'] is entering Level 20-21 for 16 minutes.
  29:57: The Sam Patch[len=25'] has left Lock 21[len=328', ht=25'].
  29:57: The Sam Patch is arriving at Level 21-22.
  29:57: The Sam Patch[len=25'] is entering Level 21-22 for 347 minutes.
  30:01: Lil' Diamond III[len=35'] has left Level 20-21.
  30:01: Lil' Diamond III is arriving at Lock 21[len=328', ht=25'].
  30:01: Lil' Diamond III[len=35'] is entering Lock 21[len=328', ht=25'] for 15 minutes.
  30:16: Lil' Diamond III[len=35'] has left Lock 21[len=328', ht=25'].
  30:16: Lil' Diamond III is arriving at Level 21-22.
  30:16: Lil' Diamond III[len=35'] is entering Level 21-22 for 347 minutes.
  30:45: Colonial Belle[len=40'] has left Level 19-20.
  30:45: Colonial Belle is arriving at Lock 20[len=328', ht=25'].
  30:45: Colonial Belle[len=40'] is entering Lock 20[len=328', ht=25'] for 15 minutes.
  31:00: Colonial Belle[len=40'] has left Lock 20[len=328', ht=25'].
  31:00: Colonial Belle is arriving at Level 20-21.
  31:00: Colonial Belle[len=40'] is entering Level 20-21 for 16 minutes.
  31:16: Colonial Belle[len=40'] has left Level 20-21.
  31:16: Colonial Belle is arriving at Lock 21[len=328', ht=25'].
  31:16: Colonial Belle[len=40'] is entering Lock 21[len=328', ht=25'] for 15 minutes.
  31:31: Colonial Belle[len=40'] has left Lock 21[len=328', ht=25'].
  31:31: Colonial Belle is arriving at Level 21-22.
  31:31: Colonial Belle[len=40'] is entering Level 21-22 for 347 minutes.
  34:15: Urger[len=40'] has left Level 21-22.
  34:15: Urger has ended its trip.
  35:44: The Sam Patch[len=25'] has left Level 21-22.
  35:44: The Sam Patch is arriving at Lock 22[len=328', ht=7'].
  35:44: The Sam Patch[len=25'] is entering Lock 22[len=328', ht=7'] for 11 minutes.
  35:55: The Sam Patch[len=25'] has left Lock 22[len=328', ht=7'].
  35:55: The Sam Patch is arriving at Level 22-23.
  35:55: The Sam Patch[len=25'] is entering Level 22-23 for 225 minutes.
  36:03: Lil' Diamond III[len=35'] has left Level 21-22.
  36:03: Lil' Diamond III is arriving at Lock 22[len=328', ht=7'].
  36:03: Lil' Diamond III[len=35'] is entering Lock 22[len=328', ht=7'] for 11 minutes.
  36:14: Lil' Diamond III[len=35'] has left Lock 22[len=328', ht=7'].
  36:14: Lil' Diamond III is arriving at Level 22-23.
  36:14: Lil' Diamond III[len=35'] is entering Level 22-23 for 225 minutes.
  37:18: Colonial Belle[len=40'] has left Level 21-22.
  37:18: Colonial Belle is arriving at Lock 22[len=328', ht=7'].
  37:18: Colonial Belle[len=40'] is entering Lock 22[len=328', ht=7'] for 11 minutes.
  37:29: Colonial Belle[len=40'] has left Lock 22[len=328', ht=7'].
  37:29: Colonial Belle is arriving at Level 22-23.
  37:29: Colonial Belle[len=40'] is entering Level 22-23 for 225 minutes.
  39:40: The Sam Patch[len=25'] has left Level 22-23.
  39:40: The Sam Patch is arriving at Lock 23[len=328', ht=11'].
  39:40: The Sam Patch[len=25'] is entering Lock 23[len=328', ht=11'] for 12 minutes.
  39:52: The Sam Patch[len=25'] has left Lock 23[len=328', ht=11'].
  39:52: The Sam Patch is arriving at Level 23-24.
  39:52: The Sam Patch[len=25'] is entering Level 23-24 for 368 minutes.
  39:59: Lil' Diamond III[len=35'] has left Level 22-23.
  39:59: Lil' Diamond III is arriving at Lock 23[len=328', ht=11'].
  39:59: Lil' Diamond III[len=35'] is entering Lock 23[len=328', ht=11'] for 12 minutes.
  40:11: Lil' Diamond III[len=35'] has left Lock 23[len=328', ht=11'].
  40:11: Lil' Diamond III is arriving at Level 23-24.
  40:11: Lil' Diamond III[len=35'] is entering Level 23-24 for 368 minutes.
  41:14: Colonial Belle[len=40'] has left Level 22-23.
  41:14: Colonial Belle is arriving at Lock 23[len=328', ht=11'].
  41:14: Colonial Belle[len=40'] is entering Lock 23[len=328', ht=11'] for 12 minutes.
  41:26: Colonial Belle[len=40'] has left Lock 23[len=328', ht=11'].
  41:26: Colonial Belle is arriving at Level 23-24.
  41:26: Colonial Belle[len=40'] is entering Level 23-24 for 368 minutes.
  46:00: The Sam Patch[len=25'] has left Level 23-24.
  46:00: The Sam Patch is arriving at Lock 24[len=328', ht=6'].
  46:00: The Sam Patch[len=25'] is entering Lock 24[len=328', ht=6'] for 10 minutes.
  46:10: The Sam Patch[len=25'] has left Lock 24[len=328', ht=6'].
  46:10: The Sam Patch is arriving at Level 24-25.
  46:10: The Sam Patch[len=25'] is entering Level 24-25 for 70 minutes.
  46:19: Lil' Diamond III[len=35'] has left Level 23-24.
  46:19: Lil' Diamond III is arriving at Lock 24[len=328', ht=6'].
  46:19: Lil' Diamond III[len=35'] is entering Lock 24[len=328', ht=6'] for 11 minutes.
  46:30: Lil' Diamond III[len=35'] has left Lock 24[len=328', ht=6'].
  46:30: Lil' Diamond III is arriving at Level 24-25.
  46:30: Lil' Diamond III[len=35'] is entering Level 24-25 for 70 minutes.
  47:20: The Sam Patch[len=25'] has left Level 24-25.
  47:20: The Sam Patch is arriving at Lock 25[len=328', ht=6'].
  47:20: The Sam Patch[len=25'] is entering Lock 25[len=328', ht=6'] for 10 minutes.
  47:30: The Sam Patch[len=25'] has left Lock 25[len=328', ht=6'].
  47:30: The Sam Patch is arriving at Level 25-26.
  47:30: The Sam Patch[len=25'] is entering Level 25-26 for 145 minutes.
  47:34: Colonial Belle[len=40'] has left Level 23-24.
  47:34: Colonial Belle is arriving at Lock 24[len=328', ht=6'].
  47:34: Colonial Belle[len=40'] is entering Lock 24[len=328', ht=6'] for 11 minutes.
  47:40: Lil' Diamond III[len=35'] has left Level 24-25.
  47:40: Lil' Diamond III is arriving at Lock 25[len=328', ht=6'].
  47:40: Lil' Diamond III[len=35'] is entering Lock 25[len=328', ht=6'] for 11 minutes.
  47:45: Colonial Belle[len=40'] has left Lock 24[len=328', ht=6'].
  47:45: Colonial Belle is arriving at Level 24-25.
  47:45: Colonial Belle[len=40'] is entering Level 24-25 for 70 minutes.
  47:51: Lil' Diamond III[len=35'] has left Lock 25[len=328', ht=6'].
  47:51: Lil' Diamond III is arriving at Level 25-26.
  47:51: Lil' Diamond III[len=35'] is entering Level 25-26 for 145 minutes.
  48:55: Colonial Belle[len=40'] has left Level 24-25.
  48:55: Colonial Belle is arriving at Lock 25[len=328', ht=6'].
  48:55: Colonial Belle[len=40'] is entering Lock 25[len=328', ht=6'] for 11 minutes.
  49:06: Colonial Belle[len=40'] has left Lock 25[len=328', ht=6'].
  49:06: Colonial Belle is arriving at Level 25-26.
  49:06: Colonial Belle[len=40'] is entering Level 25-26 for 145 minutes.
  49:55: The Sam Patch[len=25'] has left Level 25-26.
  49:55: The Sam Patch is arriving at Lock 26[len=328', ht=13'].
  49:55: The Sam Patch[len=25'] is entering Lock 26[len=328', ht=13'] for 12 minutes.
  50:07: The Sam Patch[len=25'] has left Lock 26[len=328', ht=13'].
  50:07: The Sam Patch is arriving at Level 26-27.
  50:07: The Sam Patch[len=25'] is entering Level 26-27 for 15 minutes.
  50:16: Lil' Diamond III[len=35'] has left Level 25-26.
  50:16: Lil' Diamond III is arriving at Lock 26[len=328', ht=13'].
  50:16: Lil' Diamond III[len=35'] is entering Lock 26[len=328', ht=13'] for 12 minutes.
  50:22: The Sam Patch[len=25'] has left Level 26-27.
  50:22: The Sam Patch is arriving at Lock 27[len=328', ht=20'].
  50:22: The Sam Patch[len=25'] is entering Lock 27[len=328', ht=20'] for 14 minutes.
  50:28: Lil' Diamond III[len=35'] has left Lock 26[len=328', ht=13'].
  50:28: Lil' Diamond III is arriving at Level 26-27.
  50:28: Lil' Diamond III[len=35'] is entering Level 26-27 for 15 minutes.
  50:36: The Sam Patch[len=25'] has left Lock 27[len=328', ht=20'].
  50:36: The Sam Patch is arriving at Level 27-28.
  50:36: The Sam Patch[len=25'] is entering Level 27-28 for 48 minutes.
  50:43: Lil' Diamond III[len=35'] has left Level 26-27.
  50:43: Lil' Diamond III is arriving at Lock 27[len=328', ht=20'].
  50:43: Lil' Diamond III[len=35'] is entering Lock 27[len=328', ht=20'] for 14 minutes.
  50:57: Lil' Diamond III[len=35'] has left Lock 27[len=328', ht=20'].
  50:57: Lil' Diamond III is arriving at Level 27-28.
  50:57: Lil' Diamond III[len=35'] is entering Level 27-28 for 48 minutes.
  51:24: The Sam Patch[len=25'] has left Level 27-28.
  51:24: The Sam Patch is arriving at Lock 28[len=328', ht=12'].
  51:24: The Sam Patch[len=25'] is entering Lock 28[len=328', ht=12'] for 12 minutes.
  51:31: Colonial Belle[len=40'] has left Level 25-26.
  51:31: Colonial Belle is arriving at Lock 26[len=328', ht=13'].
  51:31: Colonial Belle[len=40'] is entering Lock 26[len=328', ht=13'] for 12 minutes.
  51:36: The Sam Patch[len=25'] has left Lock 28[len=328', ht=12'].
  51:36: The Sam Patch is arriving at Level 28-29.
  51:36: The Sam Patch[len=25'] is entering Level 28-29 for 117 minutes.
  51:43: Colonial Belle[len=40'] has left Lock 26[len=328', ht=13'].
  51:43: Colonial Belle is arriving at Level 26-27.
  51:43: Colonial Belle[len=40'] is entering Level 26-27 for 15 minutes.
  51:45: Lil' Diamond III[len=35'] has left Level 27-28.
  51:45: Lil' Diamond III is arriving at Lock 28[len=328', ht=12'].
  51:45: Lil' Diamond III[len=35'] is entering Lock 28[len=328', ht=12'] for 12 minutes.
  51:57: Lil' Diamond III[len=35'] has left Lock 28[len=328', ht=12'].
  51:57: Lil' Diamond III is arriving at Level 28-29.
  51:57: Lil' Diamond III[len=35'] is entering Level 28-29 for 117 minutes.
  51:58: Colonial Belle[len=40'] has left Level 26-27.
  51:58: Colonial Belle is arriving at Lock 27[len=328', ht=20'].
  51:58: Colonial Belle[len=40'] is entering Lock 27[len=328', ht=20'] for 14 minutes.
  52:12: Colonial Belle[len=40'] has left Lock 27[len=328', ht=20'].
  52:12: Colonial Belle is arriving at Level 27-28.
  52:12: Colonial Belle[len=40'] is entering Level 27-28 for 48 minutes.
  53:00: Colonial Belle[len=40'] has left Level 27-28.
  53:00: Colonial Belle is arriving at Lock 28[len=328', ht=12'].
  53:00: Colonial Belle[len=40'] is entering Lock 28[len=328', ht=12'] for 12 minutes.
  53:12: Colonial Belle[len=40'] has left Lock 28[len=328', ht=12'].
  53:12: Colonial Belle is arriving at Level 28-29.
  53:12: Colonial Belle[len=40'] is entering Level 28-29 for 117 minutes.
  53:33: The Sam Patch[len=25'] has left Level 28-29.
  53:33: The Sam Patch is arriving at Lock 29[len=328', ht=16'].
  53:33: The Sam Patch[len=25'] is entering Lock 29[len=328', ht=16'] for 13 minutes.
  53:46: The Sam Patch[len=25'] has left Lock 29[len=328', ht=16'].
  53:46: The Sam Patch is arriving at Level 29-30.
  53:46: The Sam Patch[len=25'] is entering Level 29-30 for 36 minutes.
  53:54: Lil' Diamond III[len=35'] has left Level 28-29.
  53:54: Lil' Diamond III is arriving at Lock 29[len=328', ht=16'].
  53:54: Lil' Diamond III[len=35'] is entering Lock 29[len=328', ht=16'] for 13 minutes.
  54:07: Lil' Diamond III[len=35'] has left Lock 29[len=328', ht=16'].
  54:07: Lil' Diamond III is arriving at Level 29-30.
  54:07: Lil' Diamond III[len=35'] is entering Level 29-30 for 36 minutes.
  54:22: The Sam Patch[len=25'] has left Level 29-30.
  54:22: The Sam Patch is arriving at Lock 30[len=328', ht=16'].
  54:22: The Sam Patch[len=25'] is entering Lock 30[len=328', ht=16'] for 13 minutes.
  54:35: The Sam Patch[len=25'] has left Lock 30[len=328', ht=16'].
  54:35: The Sam Patch is arriving at Level 30-31.
  54:35: The Sam Patch[len=25'] is entering Level 30-31 for 193 minutes.
  54:43: Lil' Diamond III[len=35'] has left Level 29-30.
  54:43: Lil' Diamond III is arriving at Lock 30[len=328', ht=16'].
  54:43: Lil' Diamond III[len=35'] is entering Lock 30[len=328', ht=16'] for 13 minutes.
  54:56: Lil' Diamond III[len=35'] has left Lock 30[len=328', ht=16'].
  54:56: Lil' Diamond III is arriving at Level 30-31.
  54:56: Lil' Diamond III[len=35'] is entering Level 30-31 for 193 minutes.
  55:09: Colonial Belle[len=40'] has left Level 28-29.
  55:09: Colonial Belle is arriving at Lock 29[len=328', ht=16'].
  55:09: Colonial Belle[len=40'] is entering Lock 29[len=328', ht=16'] for 13 minutes.
  55:22: Colonial Belle[len=40'] has left Lock 29[len=328', ht=16'].
  55:22: Colonial Belle is arriving at Level 29-30.
  55:22: Colonial Belle[len=40'] is entering Level 29-30 for 36 minutes.
  55:58: Colonial Belle[len=40'] has left Level 29-30.
  55:58: Colonial Belle is arriving at Lock 30[len=328', ht=16'].
  55:58: Colonial Belle[len=40'] is entering Lock 30[len=328', ht=16'] for 13 minutes.
  56:11: Colonial Belle[len=40'] has left Lock 30[len=328', ht=16'].
  56:11: Colonial Belle is arriving at Level 30-31.
  56:11: Colonial Belle[len=40'] is entering Level 30-31 for 193 minutes.
  57:48: The Sam Patch[len=25'] has left Level 30-31.
  57:48: The Sam Patch is arriving at Lock 31[len=328', ht=25'].
  57:48: The Sam Patch[len=25'] is entering Lock 31[len=328', ht=25'] for 15 minutes.
  58:03: The Sam Patch[len=25'] has left Lock 31[len=328', ht=25'].
  58:03: The Sam Patch is arriving at Level 31-32.
  58:03: The Sam Patch[len=25'] is entering Level 31-32 for 15 minutes.
  58:09: Lil' Diamond III[len=35'] has left Level 30-31.
  58:09: Lil' Diamond III is arriving at Lock 31[len=328', ht=25'].
  58:09: Lil' Diamond III[len=35'] is entering Lock 31[len=328', ht=25'] for 15 minutes.
  58:18: The Sam Patch[len=25'] has left Level 31-32.
  58:18: The Sam Patch is arriving at Lock 32[len=328', ht=25'].
  58:18: The Sam Patch[len=25'] is entering Lock 32[len=328', ht=25'] for 15 minutes.
  58:24: Lil' Diamond III[len=35'] has left Lock 31[len=328', ht=25'].
  58:24: Lil' Diamond III is arriving at Level 31-32.
  58:24: Lil' Diamond III[len=35'] is entering Level 31-32 for 15 minutes.
  58:33: The Sam Patch[len=25'] has left Lock 32[len=328', ht=25'].
  58:33: The Sam Patch is arriving at Level 32-33.
  58:33: The Sam Patch[len=25'] is entering Level 32-33 for 771 minutes.
  58:39: Lil' Diamond III[len=35'] has left Level 31-32.
  58:39: Lil' Diamond III is arriving at Lock 32[len=328', ht=25'].
  58:39: Lil' Diamond III[len=35'] is entering Lock 32[len=328', ht=25'] for 15 minutes.
  58:54: Lil' Diamond III[len=35'] has left Lock 32[len=328', ht=25'].
  58:54: Lil' Diamond III is arriving at Level 32-33.
  58:54: Lil' Diamond III[len=35'] is entering Level 32-33 for 771 minutes.
  59:24: Colonial Belle[len=40'] has left Level 30-31.
  59:24: Colonial Belle is arriving at Lock 31[len=328', ht=25'].
  59:24: Colonial Belle[len=40'] is entering Lock 31[len=328', ht=25'] for 15 minutes.
  59:39: Colonial Belle[len=40'] has left Lock 31[len=328', ht=25'].
  59:39: Colonial Belle is arriving at Level 31-32.
  59:39: Colonial Belle[len=40'] is entering Level 31-32 for 15 minutes.
  59:54: Colonial Belle[len=40'] has left Level 31-32.
  59:54: Colonial Belle is arriving at Lock 32[len=328', ht=25'].
  59:54: Colonial Belle[len=40'] is entering Lock 32[len=328', ht=25'] for 15 minutes.
  60:09: Colonial Belle[len=40'] has left Lock 32[len=328', ht=25'].
  60:09: Colonial Belle is arriving at Level 32-33.
  60:09: Colonial Belle[len=40'] is entering Level 32-33 for 771 minutes.
  71:24: The Sam Patch[len=25'] has left Level 32-33.
  71:24: The Sam Patch is arriving at Lock 33[len=328', ht=25'].
  71:24: The Sam Patch[len=25'] is entering Lock 33[len=328', ht=25'] for 15 minutes.
  71:39: The Sam Patch[len=25'] has left Lock 33[len=328', ht=25'].
  71:39: The Sam Patch has ended its trip.
  71:45: Lil' Diamond III[len=35'] has left Level 32-33.
  71:45: Lil' Diamond III is arriving at Lock 33[len=328', ht=25'].
  71:45: Lil' Diamond III[len=35'] is entering Lock 33[len=328', ht=25'] for 15 minutes.
  72:00: Lil' Diamond III[len=35'] has left Lock 33[len=328', ht=25'].
  72:00: Lil' Diamond III has ended its trip.
  73:00: Colonial Belle[len=40'] has left Level 32-33.
  73:00: Colonial Belle is arriving at Lock 33[len=328', ht=25'].
  73:00: Colonial Belle[len=40'] is entering Lock 33[len=328', ht=25'] for 15 minutes.
  73:15: Colonial Belle[len=40'] has left Lock 33[len=328', ht=25'].
  73:15: Colonial Belle has ended its trip.
  73:15: All five boats have finished their cruise. This took 7 real-time minutes.
 */
