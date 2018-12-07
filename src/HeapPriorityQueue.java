public class HeapPriorityQueue<T extends Comparable<? super T>> implements PriorityQueueInterface<T> {

    private MaxHeapInterface<T>  priorityheap = new ArrayMaxHeap<T>(){};
    private T[] arrayHeap;
    private int lastIndex;
    private int sizeOfArray;

    /**
     * Adds a new entry to this priority queue.
     *
     * @param newEntry An object to be added.
     */
    public void add(T newEntry) {
        priorityheap.add(newEntry);
    }

    /**
     * Removes and returns the entry having the highest priority.
     *
     * @return Either the object having the highest priority or,
     * if the priority queue is empty before the operation, null.
     */
    public T remove() {
        return priorityheap.removeMax();
    }

    /**
     * Retrieves the entry having the highest priority.
     *
     * @return Either the object having the highest priority or,
     * if the priority queue is empty, null.
     */
    public T peek() {
        return priorityheap.getMax();
    }

    /**
     * Detects whether this priority queue is empty.
     *
     * @return True if the priority queue is empty, or false otherwise.
     */
    public boolean isEmpty() {
        return priorityheap.isEmpty();
    }

    /**
     * Gets the size of this priority queue.
     *
     * @return The number of entries currently in the priority queue.
     */
    public int getSize() {
        return priorityheap.getSize();
    }

    /**
     * Removes all entries from this priority queue.
     */
    public void clear() {
        priorityheap.clear();
    }

    public void printArray(){
        for(int i = 1; i <= sizeOfArray; i++){
            System.out.println(arrayHeap[i]);
        }
    }
}
