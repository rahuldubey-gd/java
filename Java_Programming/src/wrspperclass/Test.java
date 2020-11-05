package wrspperclass;

public class Test {

	public static void main(String[] args) {
		
		int i = 10;
		
		Integer i1 = new Integer(i);
		
		Integer i2 = new Integer(10);
		Integer i3 = new Integer("10");
		
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		
		System.out.println(i1.equals(i2));
		System.out.println(i2.equals(i3));
		System.out.println(i3.equals(i1));

	}

}
