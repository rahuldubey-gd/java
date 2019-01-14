package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class ArayListImplementation {

	public static void main(String[] args) {
	
		Scanner sc =new Scanner(System.in);
		String n = sc.nextLine();
		
		ArrayList al = new ArrayList();
		ArrayList al1 = new ArrayList();
		
		al.add(n);
		al.add("Hari");
		al.add("Om");
		al.add(10);
		al.add(-12.085);
		
		System.out.println(al);

		al1.add("Webtek");
		al1.add("Rahul");
		
		al1.addAll(al);
		
		System.out.println(al1);
	}
	
}
