package collection.list;

import java.util.LinkedList;

public class LinkedListImplementation {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		LinkedList ll1 = new LinkedList();
		
		ll.add("Hari");
		ll.add("Om");
		ll.add(10);
		ll.add(-12.085);
		
		System.out.println(ll);

		ll1.add("Webtek");
		ll1.add("Rahul");
		
		ll1.addAll(ll);
		
		System.out.println(ll1);


	}

}
