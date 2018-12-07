
public class PriorityQueueInterfaceTest {
    public static void main(String[]args){

        PriorityQueueInterface<Integer> pq = new HeapPriorityQueue<>();

        if(pq.isEmpty() == true){ System.out.println("Test for an empty array, the isEmpty method should return true and it is: " + pq.isEmpty());}
        pq.add(68);
        System.out.println("After adding 4, the  isEmpty method should return false and it is: " + pq.isEmpty());
        pq.add(15);
        pq.add(40);
        pq.add(10);
        pq.add(8);
        pq.add(35);

        if(pq.getSize() == 6){ System.out.println("The get size works and it is " + pq.getSize());}



        System.out.println(pq.isEmpty());
        System.out.println("Printing the array: ");
        ((HeapPriorityQueue<Integer>) pq).printArray();


    }
}
