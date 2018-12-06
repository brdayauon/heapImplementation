import java.sql.SQLOutput;

public class MaxHeapInterfaceTest {
    public static void main(String[] args) {

        MaxHeapInterface<Integer> mh = new ArrayMaxHeap<Integer>();

        System.out.println(mh.isEmpty());
        mh.add(4);
        System.out.println(mh.isEmpty());
        mh.add(5);
        mh.add(3);
        mh.add(24);
        mh.removeMax();


        ((ArrayMaxHeap<Integer>) mh).printArray();

        System.out.println("The size of the arrayHeap is " + mh.getSize());
        mh.clear();
        System.out.println("Using the clear method, after using getSize and getMax should be null");
        System.out.println("The max number in the arrayHeap is " + mh.getMax());
        System.out.println("The getSize in the arrayHeap is " + mh.getSize());
        System.out.println("The isEmpty method should return true and it is: " + mh.isEmpty());

        mh.add(4);
        System.out.println("After adding 4, the  isEmpty method should return false and it is: " + mh.isEmpty());
        System.out.println("After adding 4, the size of the heap array should be 1. and it is: " + mh.getSize());
//        System.out.println("After removing 4, the size of the heap should be 0 and it is: " + mh.getSize());
        ((ArrayMaxHeap<Integer>) mh).printArray();

      //  ((ArrayMaxHeap<Integer>) mh).printArray();
    }
}
