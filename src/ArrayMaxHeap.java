public class ArrayMaxHeap<T extends Comparable<? super T>> implements MaxHeapInterface<T> {

    private T[] array;
    private int lastIndex;
    private int sizeOfArray;

    public ArrayMaxHeap() {
        array = (T[]) (new Object[25]);
    }

    public void maxHeapify(T[] array, int index) {
        if (index > sizeOfArray / 2) return;
       int largest = index;
       int leftChildIndex = 2 * index;
       int rightChildIndex = (2 * index) + 1;

        if ((leftChildIndex <= sizeOfArray) && (array[leftChildIndex].compareTo(array[rightChildIndex]) < 0))
            largest = leftChildIndex;
        if ((rightChildIndex <= sizeOfArray) && (array[rightChildIndex].compareTo(array[leftChildIndex]) > 0))
        largest = rightChildIndex;
        if (largest != index)
        swap(index , largest);
        maxHeapify(array, largest);
    }

    private void maxUpHeap(T[] array, int index) {
        while (index > 1 && (array[index / 2].compareTo(array[index]) < 0)) {
            swap( (index / 2),index);
            index = index / 2;
        }
    }

     public void buildMaxHeap(T[] array) {
         int size = sizeOfArray;
         for(int index = (size /2); index == 1; index-- )
         maxHeapify(array, index);
     }

    /**
     * Adds a new entry to this heap.
     *
     * @param newEntry An object to be added.
     */
    public void add(T newEntry) {

        int parent = (size-1)/2;

        array[size + 1] = newEntry;
        size++;
    }

    /**
     * Removes and returns the largest item in this heap.
     *
     * @return Either the largest object in the heap or,
     * if the heap is empty before the operation, null.
     */
    public T removeMax() {
        if(isEmpty()) return null;
        else
        {
            array[1] = array[size];
            size--;
            return array[1];
        }
    }

    private void swap( int firstIndex, int secondIndex){
        T temp = array[firstIndex];
        array[firstIndex] = array [secondIndex];
        array[secondIndex] = temp;
    }

    /**
     * Retrieves the largest item in this heap.
     *
     * @return Either the largest object in the heap or,
     * if the heap is empty, null.
     */
    public T getMax() {
        if(isEmpty()) return null;
        else
            return array[1];
    }

    /**
     * Detects whether this heap is empty.
     *
     * @return True if the heap is empty, or false otherwise.
     */
    public boolean isEmpty() {
        return (size == 0);
    }

    /**
     * Gets the size of this heap.
     *
     * @return The number of entries currently in the heap.
     */
    public int getSize() {
        return size;
    }

    /**
     * Removes all entries from this heap.
     */
    public void clear() {
        for(int i = 1; i <= size; i++)
        {
            array[i] = null;
            --size;
        }
    }

}
