package collections;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class MyDeque {
	
	public static void main(String[] args) {
		
		Deque dq = new LinkedList<Integer>();
		dq.add(1);
		dq.addFirst(2);
		dq.addLast(3);
		System.out.println(dq.offer(4));
		System.out.println(dq.peek());
		System.out.println(dq.peekFirst());
		System.out.println(dq.peekLast());
		System.out.println("Size: "+dq.size());
		System.out.println("Element Popped: "+dq.pop());
		dq.push(7);
		Iterator<Integer> it = dq.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
