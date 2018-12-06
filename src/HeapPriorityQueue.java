public class HeapPriorityQueue<T extends Comparable<? super T>> implements PriorityQueueInterface<T> {

    private MaxHeapInterface<T>  x = new ArrayMaxHeap<T>(){};
    private T[] array;
    private int lastIndex;
    private int size;

    /**
     * Adds a new entry to this priority queue.
     *
     * @param newEntry An object to be added.
     */
    public void add(T newEntry) {
        x.add(newEntry);
    }

    /**
     * Removes and returns the entry having the highest priority.
     *
     * @return Either the object having the highest priority or,
     * if the priority queue is empty before the operation, null.
     */
    public T remove() {
        return x.removeMax();
    }

    /**
     * Retrieves the entry having the highest priority.
     *
     * @return Either the object having the highest priority or,
     * if the priority queue is empty, null.
     */
    public T peek() {
        return x.getMax();
    }

    /**
     * Detects whether this priority queue is empty.
     *
     * @return True if the priority queue is empty, or false otherwise.
     */
    public boolean isEmpty() {
        return x.isEmpty();
    }

    /**
     * Gets the size of this priority queue.
     *
     * @return The number of entries currently in the priority queue.
     */
    public int getSize() {
        return x.getSize();
    }

    /**
     * Removes all entries from this priority queue.
     */
    public void clear() {
        x.clear();
    }
}
