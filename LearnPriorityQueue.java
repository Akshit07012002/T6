package trimester6;

import java.util.*;

public class LearnPriorityQueue {
	
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); //MAX HEAP
		
		pq.offer(1);
		pq.offer(3);
		pq.offer(2);
		
		System.out.println(pq);
		
		System.out.println("Poll : "+pq.poll());
		System.out.println(pq);
		
		System.out.println("Poll : "+pq.poll());
		System.out.println(pq);
		
		System.out.println("Poll : "+pq.poll());
		System.out.println(pq);
			        
	}

}
