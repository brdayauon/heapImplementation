
public class PriorityQueueInterfaceTest {
    public static void main(String[]args){

        PriorityQueueInterface<Integer> pq = new HeapPriorityQueue<>();

        pq.add(15);
        System.out.println("After adding 15, the  isEmpty method should return false and it is: " + pq.isEmpty());
        pq.add(78);
        pq.add(30);
        pq.add(10);
        pq.add(8);
        pq.add(35);

        if(pq.peek() == 78) System.out.println("peek works");
        else System.out.println("peek does not work.");
        if(pq.remove() == 78) System.out.println("remove works");

       if(pq.remove() == 35) System.out.println("remove works for sure");

        System.out.println(pq.peek()); //peek does not work after removal

        if(pq.getSize() == 6){
            System.out.println("The get size works and it is " + pq.getSize());
            System.out.println("getSize() works.");
        }

        pq.clear();
        if(pq.getSize() == 0){ System.out.println("The clear() works."); }
        else
            System.out.println("The clear{} did not work.");

        if(pq.isEmpty()) System.out.println("isEmpty() works");
        else System.out.println("isEmpty() does not work.");

        if(pq.peek() == null) System.out.println("peek() works");
        else System.out.println("peek() does not work.");

    }
}
