package array;

/***
 * Learning about MultiDimensional Array
 * @author RAHUL DUBEY
 * How MultiDimenisonal array works
 */
public class ArrayMultiDimensional {

	public static void main(String[] args) {
		
		/*
		 * Way-1 int a1 [][] = new int[5][3]; System.out.println(a1[0].length);
		 * System.out.println(a1[0].length); System.out.println(a1[0].length);
		 * System.out.println(a1[0].length); System.out.println(a1[0].length);
		 */
		 
//		Way-2
		int a1 [][] = new int[5][];
		
		
		  a1[0] = new int[5];
		  a1[1] = new int[2]; 
		  a1[2] = new int[3]; 
		  a1[3] = new int[1];
		  a1[4] = new int[10];
		
		System.out.println(a1[0].length);
		System.out.println(a1[1].length);
		System.out.println(a1[2].length);
		System.out.println(a1[3].length);
		System.out.println(a1[4].length);
		
		

	}

}
