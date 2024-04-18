package JavaCollection;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.offer(5);
        pq.offer(3);
        pq.offer(2);
        pq.offer(1);
        pq.offer(9);

        System.out.println("elements in ascending order: ");
        while(!pq.isEmpty()){
            System.out.println(pq.poll() + " ");
            System.out.println("-----------");
            System.out.println(pq.peek() + " ");
        }
    }
}
