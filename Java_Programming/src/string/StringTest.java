package string;

public class StringTest {

	public static void main(String[] args) {
		
		StringTest s1 = new StringTest();
		StringTest s2 = new StringTest();
		StringTest s3 = new StringTest();
		
		/*
		 * System.out.println(s1.hashCode()); System.out.println(s2.hashCode());
		 * System.out.println(s3.hashCode());
		 */
		
		String a1 = "abc";
		String a2 = "abc";
		String a3 = "abc";
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		Integer i3 = new Integer(10);
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		
		a1 = "xyz";
		a2 = "pqr";
		a3 = "mno";
		
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		
		a2 = "xyz";
		System.out.println(a2.hashCode());
	}

}
