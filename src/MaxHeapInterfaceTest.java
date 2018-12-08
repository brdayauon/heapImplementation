public class MaxHeapInterfaceTest {
    public static void main(String[] args) {

        MaxHeapInterface<Integer> mh = new ArrayMaxHeap<Integer>();

        //if theres nothing in the array
        System.out.println("Test for an empty array, the isEmpty method should return true and it is: " + mh.isEmpty());
        mh.add(90);
        mh.add(80);
        mh.add(60);
        mh.add(70);
        mh.add(30);
        mh.add(20);
        mh.add(50);
        mh.add(10);
        mh.add(40);
        mh.add(85);

        System.out.println("Printing the array: ");
        ((ArrayMaxHeap<Integer>) mh).printArray();

        System.out.println("The max number in this array is: " + mh.getMax());
        mh.removeMax();

        System.out.println("Printing the array: ");
        ((ArrayMaxHeap<Integer>) mh).printArray();

        System.out.println("The max number in this array is " + mh.getMax());

        if(mh.getSize() == 9) {System.out.println("The size of the arrayHeap is " + mh.getSize());}

        mh.clear();

        System.out.println("Using the clear method, after using getSize and getMax should be null");
        System.out.println("The max number in the arrayHeap is " + mh.getMax());
        System.out.println("The getSize in the arrayHeap is " + mh.getSize());
        System.out.println("The isEmpty method should return true and it is: " + mh.isEmpty());

        mh.add(4);
        System.out.println("After adding 4, the  isEmpty method should return false and it is: " + mh.isEmpty());
        System.out.println("After adding 4, the size of the heap array should be 1. and it is: " + mh.getSize());

        System.out.println("Now removing the highest number in the array: " + mh.removeMax());
        System.out.println("After removing 4, the size of the heap should be 0 and it is: " + mh.getSize());
        ((ArrayMaxHeap<Integer>) mh).printArray();
        System.out.println("getMax() should be null bc there is nothing in the array: " + mh.getMax());

      //  ((ArrayMaxHeap<Integer>) mh).printArray();
    }
}
