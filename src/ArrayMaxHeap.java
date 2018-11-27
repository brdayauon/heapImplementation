public class ArrayMaxHeap<T extends Comparable<? super T>> implements MaxHeapInterface<T> {

    private T[] heap;
    private int lastIndex;


    /**
     * Adds a new entry to this heap.
     *
     * @param newEntry An object to be added.
     */
    public void add(T newEntry) {

    }

    /**
     * Removes and returns the largest item in this heap.
     *
     * @return Either the largest object in the heap or,
     * if the heap is empty before the operation, null.
     */
    public T removeMax() {
        return null;
    }

    /**
     * Retrieves the largest item in this heap.
     *
     * @return Either the largest object in the heap or,
     * if the heap is empty, null.
     */
    public T getMax() {
        return null;
    }

    /**
     * Detects whether this heap is empty.
     *
     * @return True if the heap is empty, or false otherwise.
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * Gets the size of this heap.
     *
     * @return The number of entries currently in the heap.
     */
    public int getSize() {
        return 0;
    }

    /**
     * Removes all entries from this heap.
     */
    public void clear() {

    }
}
