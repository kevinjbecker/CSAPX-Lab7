package canal;

/**
 * A stretch of canal that is actually a lock, guarded by a lockmaster
 * In this simulation, locks are one-way, and always follow this process
 * (important for timing).
 * <ol>
 *     <li>It is assumed that the water level in the lock is ready.</li>
 *     <li>Lock gates on entry side open. (Assume 0 time.)</li>
 *     <li>Boat enters. (Contributes to computed time.)</li>
 *     <li>Lock gates on entry side close. (Assume 0 time.)</li>
 *     <li>Lock chamber drains or fills. (Contributes to computed time.)</li>
 *     <li>Lock gates on exit side open. (Assume 0 time.)</li>
 *     <li>Boat leaves. (Contributes to computed time.)</li>
 *     <li>Lock gates on exit side close. (Assume 0 time.)</li>
 * </ol>
 *
 * @author Kevin Becker
 */
public class Lock implements CanalSegment
{
    /** the guard of this lock to keep our lock running smooth and one boat at a time.  */
    private LockMaster guard;
    /** the number of the lock. */
    private int num;
    /** the length of the lock. */
    private int length;
    /** the depth of the lock (the amount of water we need to switch levels). */
    private int depth;
    /** the boolean if we are available or not. */
    private boolean available;

    /**
     * Create lock and set parameters for identification and time calculations.
     * @param num integer num of lock (assumed unique)
     * @param length length of lock chamber in feet
     * @param depth difference, in feet, of water level between filled
     *              and drained states
     */
    public Lock( int num, int length, int depth )
    {
        // sets the fields
        this.guard = new LockMaster( this );
        this.num = num;
        this.length = length;
        this.depth = depth;
        this.available = true;
    }

    /**
     * Give a description of this lock for meaningful log messages
     * @return a string of the format
     *   <code>Lock <i>num</i> [len=<i>length</i>',ht=<i>height</i>']</code>
     */
    @Override
    public String toString()
    {
        return "Lock " + num + "[len=" + length + "', ht=" + depth + "']";
    }

    /**
     * Get the LockMaster for this lock. It should return the same one every
     * time.
     * @return this lock's LockMaster
     */
    @Override
    public CanalSegmentGuard getGuard()
    {
        return this.guard;
    }

    /**
     * Compute time in minutes for a boat to get through this lock.
     * Contributions to the time are given in this class's documentation.
     * Speeds are set in constants in the {@link Utilities} class.
     * All units are minutes.
     * @param boatLength length of boat in feet
     * @return the total time it takes to get the boat through this lock,
     * from when the bow enters the entry gate to when the stern leaves
     * the exit gate.
     */
    @Override
    public float computeTime( int boatLength )
    {
        // the amount it times for the boat to move through the lock
        float movementThroughLock = (boatLength + this.length) / Utilities.BOAT_LOCK_SPEED;

        // the time it takes to fill the lock
        float waterRiseTime = (this.depth*2) / Utilities.UP_DOWN_SPEED;

        // return the sum of the time it takes to travel as well as rise in the lock
        return movementThroughLock + waterRiseTime;
    }

    /**
     * Is this lock unoccupied? (Used by LockMaster)
     * @return true iff there is no boat in the lock.
     */
    public boolean isAvailable()
    {
        return available;
    }

    /**
     * Set the available state to true.
     */
    public void leave()
    {
        available = true;
    }

    /**
     * Set the available state to false.
     */
    public void enter()
    {
        available = false;
    }
}
