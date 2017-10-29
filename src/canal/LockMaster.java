package canal;

import java.util.LinkedList;
import java.util.Queue;

/**
 * A {@link CanalSegmentGuard} for a {@link Lock}.
 * This guard only allows one boat into its lock at a time.
 * Note that locks are unidirectional, as is the entire canal
 * system at this time.
 *
 * @author Kevin Becker
 */
public class LockMaster implements CanalSegmentGuard {

    /** the lock we are guarding */
    private Lock canalLock;

    /** the queue for each boat */
    private Queue<Integer> queue = new LinkedList<>();

    private int idCount = 0;

    /**
     * Create a LockMaster. Admission ID system is initialized.
     * @param canalLock the lock to which this LockMaster is assigned
     */
    public LockMaster( Lock canalLock )
    {
        this.canalLock = canalLock;
    }

    /**
     * A {@link Boat} calls this to announce its desire to enter the lock.
     * The LockMaster picks a unique ID and puts it in its internal
     * queue of IDs of boats that are waiting. The ID is returned so that
     * it can be referenced by the Boat when calling
     * {@link LockMaster#waitForTurn(int, String)}. No access permission
     * is granted at this point.
     * <br>
     * Implementation Note<br>
     * This design was chosen over enqueueing the boats directly because
     * it can get confusing when threads, which cause contention for
     * resources, are the very things stored in the shared resource.
     *
     * @return some unique value greater than {@link CanalSegmentGuard#NO_BOAT}
     */
    @Override
    public synchronized int requestEntryToSegment()
    {
        queue.add(++idCount);
        return idCount;
    }

    /**
     * The boat calls this method to indicate its willingness to be blocked
     * until the LockMaster's lock is available. The method returns when
     * the lock is empty and the boatID has been in the LockMaster's queue
     * more than any other (FIFO behavior). For an implementation possibility,
     * see {@link Queue#peek()}.
     *
     * @param boatID the ID of the calling boat given to it by an earlier
     *               call to {@link CanalSegmentGuard#requestEntryToSegment()}
     * @param goingInMsg the message to print (via {@link Utilities#log(String)}
     *                   once the boat has been allowed in to this
     *                   LockMaster's canal
     */
    @Override
    public synchronized void waitForTurn( int boatID, String goingInMsg )
    {
        while (!canalLock.isAvailable() && boatID != queue.peek())
        {
            try
            {
                wait();
            }
            catch (InterruptedException e)
            {
                // nothing needs to happen
            }
        }

        canalLock.enter();
        Utilities.log( goingInMsg );
    }

    /**
     * The boat announces that its time in this LockMaster's lock is over and
     * it has left.
     *
     * @rit.pre It is this boat that was most recently allowed to go in via
     *          {@link #waitForTurn(int, String)}.
     * @rit.post Either the LockMaster's lock is empty or another boat has
     *           just entered.
     * @param goingOutMsg the
     *                   message to print (via {@link Utilities#log(String)}
     *                   once the boat has been allowed in to this guard's
     */
    @Override
    public synchronized void leavingSegment( String goingOutMsg )
    {
        queue.poll();
        canalLock.leave();
        notifyAll();
        Utilities.log( goingOutMsg );
    }

}
