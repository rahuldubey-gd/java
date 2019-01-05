package array;

public class SecondArray {

	public static void main(String[] args) {

		boolean arr[][] = new boolean[5][3];
		
		//System.out.println(arr);
		SecondArray s = new SecondArray();
		s.arrayInitilization();
	}
	
	
	void arrayInitilization()
	{
		int []a = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;
		
		int b[] = {1,2,3,4,5,6,7,8,9,10};
		String name[] = {"Hariom", "Mayank", "Chetu", "Suraj"};
		
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		
		
	}

}
