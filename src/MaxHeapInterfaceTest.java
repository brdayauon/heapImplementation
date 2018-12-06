public class MaxHeapInterfaceTest {
    public static void main(String []args){

        MaxHeapInterface<Integer> mh = new ArrayMaxHeap<Integer>();

        System.out.println(mh.isEmpty());
        mh.add(4);
        System.out.println(mh.isEmpty());

        ((ArrayMaxHeap<Integer>) mh).printArray();
        mh.add(5);
        System.out.println(mh.getSize());

    }
}
