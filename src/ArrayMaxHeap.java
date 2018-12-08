public class ArrayMaxHeap<T extends Comparable<? super T>> implements MaxHeapInterface<T> {

    private T[] arrayHeap;
    private int sizeOfArray;

    public ArrayMaxHeap() {
        arrayHeap = (T[])(new Comparable[2]);
        sizeOfArray = 0;
    }

    public void maxHeapify(T[] array, int index) {
        if (index > arrayHeap.length / 2) return;

       int largest = index;
       int leftChildIndex = 2 * index;
       int rightChildIndex = (2 * index) + 1;

        if ((leftChildIndex <= sizeOfArray) && array[leftChildIndex].compareTo(array[largest]) > 0){
            largest = leftChildIndex;}
        if ((rightChildIndex <= sizeOfArray) && array[rightChildIndex].compareTo(array[largest]) > 0){
        largest = rightChildIndex;}

        if (largest != index) {
            swap(index , largest);
            maxHeapify(array, largest);
        }

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
        if(sizeOfArray == arrayHeap.length-1){
            increaseStacksz();
        }
      arrayHeap[sizeOfArray+1] = newEntry;
        sizeOfArray++;
        maxUpHeap(arrayHeap, sizeOfArray);
    }

    /**
     * Removes and returns the largest item in this heap.
     *
     * @return Either the largest object in the heap or,
     * if the heap is empty before the operation, null.
     */
    public T removeMax() {
        T max = null;
        if(isEmpty()) return null;
        else if (sizeOfArray == 1) {
            arrayHeap[1] = null;
            sizeOfArray--;
        }
        else
        {
            max = arrayHeap[1];
            arrayHeap[1] = arrayHeap[sizeOfArray];
            sizeOfArray--;
            maxHeapify(arrayHeap, 1);
        }

        return max;
    }

    private void swap( int firstIndex, int secondIndex){
        T temp = arrayHeap[firstIndex];
        arrayHeap[firstIndex] = arrayHeap [secondIndex];
        arrayHeap[secondIndex] = temp;
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
            return arrayHeap[1];
    }

    /**
     * Detects whether this heap is empty.
     *
     * @return True if the heap is empty, or false otherwise.
     */
    public boolean isEmpty() {
        return (sizeOfArray == 0);
    }

    /**
     * Gets the size of this heap.
     *
     * @return The number of entries currently in the heap.
     */
    public int getSize() {
        return sizeOfArray;
    }

    /**
     * Removes all entries from this heap.
     */
    public void clear() {
        for(int i = 1; i <= sizeOfArray; i++)
        {
            arrayHeap[i] = null;
        }
        sizeOfArray = 0;
    }

    public void printArray(){
        for(int i = 1; i <= sizeOfArray; i++){
            System.out.println(arrayHeap[i]);
        }
    }

    private void increaseStacksz(){
        T[] temp = (T[]) new Comparable [arrayHeap.length * 2];

        for (int i = 1; i <= sizeOfArray; i++){
            temp[i] = arrayHeap[i];
        }
        arrayHeap = temp;
    }

}
