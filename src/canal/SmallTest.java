package canal;

import java.util.Arrays;
import java.util.List;

/**
 * A test program for the canal system simulation.
 * Note that in order to keep simulation times reasonable the distances
 * between locks are made atypically short.
 * <br>
 *     Here is a sample run. Times, of course, will vary slightly each time.
 *
 <pre>
 0:00: Geddes arriving at Lock 1[len=40',ht=30']
 0:00: Geddes[len=25'] is entering Lock 1[len=40',ht=30'] for 9 minutes.
 0:01: Hawley arriving at Lock 1[len=40',ht=30']
 0:09: Geddes[len=25'] has left Lock 1[len=40',ht=30']
 0:09: Hawley[len=35'] is entering Lock 1[len=40',ht=30'] for 9 minutes.
 0:09: Geddes arriving at Level 1-to-2
 0:09: Geddes[len=25'] is entering Level 1-to-2 for 23 minutes.
 0:11: Clinton arriving at Level 1-to-2
 0:11: Clinton[len=40'] is entering Level 1-to-2 for 23 minutes.
 0:18: Hawley[len=35'] has left Lock 1[len=40',ht=30']
 0:18: Hawley arriving at Level 1-to-2
 0:18: Hawley[len=35'] is entering Level 1-to-2 for 23 minutes.
 0:32: Geddes[len=25'] has left Level 1-to-2
 0:32: Geddes arriving at Lock 2[len=50',ht=20']
 0:32: Geddes[len=25'] is entering Lock 2[len=50',ht=20'] for 7 minutes.
 0:34: Clinton[len=40'] has left Level 1-to-2
 0:34: Clinton arriving at Lock 2[len=50',ht=20']
 0:39: Geddes[len=25'] has left Lock 2[len=50',ht=20']
 0:39: Clinton[len=40'] is entering Lock 2[len=50',ht=20'] for 7 minutes.
 0:39: Geddes has ended its trip.
 0:41: Hawley[len=35'] has left Level 1-to-2
 0:41: Hawley arriving at Lock 2[len=50',ht=20']
 0:46: Clinton[len=40'] has left Lock 2[len=50',ht=20']
 0:46: Clinton has ended its trip.
 0:46: Hawley[len=35'] is entering Lock 2[len=50',ht=20'] for 7 minutes.
 0:53: Hawley[len=35'] has left Lock 2[len=50',ht=20']
 0:53: Hawley has ended its trip.
 </pre>
 */
public class SmallTest {

    /**
     * Create a canal system consisting of just two locks with a level
     * in between. Two boats run the entire length of the canal, and
     * a third skips the first lock.
     * @param args not used
     */
    public static void main( String[] args ) {
        // CanalSegment lock1 = new Lock( 1, 40, 30 );

        // List< CanalSegment > fullCanalRoute = Arrays.asList( lock1 );

        // Boat b1 = new Boat( "Geddes", 25, fullCanalRoute );

        // b1.start();
        smallTest();
    }

    private static void smallTest() {
        CanalSegment lock1 = new Lock( 1, 40, 30 );
        CanalSegment level1_2 = new Level( "1-to-2", 10000 );
        CanalSegment lock2 = new Lock( 2, 50, 20 );

        List< CanalSegment > fullCanalRoute =
                Arrays.asList( lock1, level1_2, lock2 );

        List< CanalSegment > partialRoute =
                Arrays.asList( level1_2, lock2 );

        Boat b1 = new Boat( "Geddes", 25, fullCanalRoute );
        Boat b2 = new Boat( "Hawley", 35, fullCanalRoute );
        Boat b3 = new Boat( "Clinton", 40, partialRoute );

        b1.start();
        Utilities.sleep( 1 );
        b2.start();
        Utilities.sleep( 10 );
        b3.start();

        try {
            b1.join();
            b2.join();
            b3.join();
        }
        catch( InterruptedException ie ) {
            assert false: "Thread interrupted.";
        }
    }
}
