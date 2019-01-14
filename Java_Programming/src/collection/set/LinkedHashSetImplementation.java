package collection.set;

import java.util.LinkedHashSet;

public class LinkedHashSetImplementation {

	public static void main(String[] args) {
		
		LinkedHashSet hs = new LinkedHashSet();
		
		
		hs.add("hari");
		hs.add("om");		
		hs.add("abc");
		hs.add("rahul");
		hs.add("rahul");
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);

	}

}
