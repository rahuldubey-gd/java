package array;

public class GettingArrayClassName {

	public static void main(String[] args) {
		
		GettingArrayClassName g = new GettingArrayClassName();
		
		int a1 [] = new int[2147483647]; // array size should be in Integer Format
		byte b [] = new byte[5];
		String s[][] = new String[2][3];
		float f [][][] = new float[2][3][3];
		boolean b1 [][][][] = new boolean[2][3][4][5];
 		
		ArrayTest a = new ArrayTest();
		
		System.out.println(g.getClass().getName()); //  I Will Return name of Class
		System.out.println(a.getClass().getName());
		
		System.out.println("Integer Array "+a1.getClass().getName());
		System.out.println("Byte Array  "+b.getClass().getName());
		System.out.println("String array  "+s.getClass().getName());
		System.out.println("Float Array  "+f.getClass().getName());
		System.out.println("Boolean array "+b1.getClass().getName());
		
		
		
	}

}
