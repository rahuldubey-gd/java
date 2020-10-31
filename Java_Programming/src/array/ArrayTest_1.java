package array;

public class ArrayTest_1 {

	public static void main(String[] args) {
		
		// ** Array Creation ** //
		int a1 [] = new int[10]; // Way -1 Creating an Array with size of 10 
		// ** Array Creation - Declaration - Initilization **
		int a2 [] = {1,2,3,4,5,6,7,8,9,10}; // Way -2 Creating Array with values 
		// ** Array Declaration 
		int a3[]; // Way-3 Creating an Array with declaration process
		a3 = new int[10];
		
		String s1 [] = new String[10];
		s1[0] = "Rahul";
		System.out.println(s1[0]);
		
		a1[0] = 1010;
		a1[1] = 11;
		a1[2] = 33;
		a1[3] = 33;
		a1[4] = 44;
		a1[5] = 55;
		a1[6] = 66;
		a1[7] = 77;
		a1[8] = 88;
		a1[9] = 99;
		
		System.out.println(a1);
		System.out.println(a2+" Length Of Array - "+a2.length);
		System.out.println(a3);
		
		for(int i =0;i<a2.length;i++)
		{
			System.out.println("a2: "+a2[i]);
			a3[i] = a2[i];
			System.out.println("a1: "+a1[i]);
			System.out.println("a3: "+a3[i]);
		}

	}

}
