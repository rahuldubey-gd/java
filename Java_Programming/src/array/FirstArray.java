package array;

public class FirstArray {

	String name = "RAHUL";
	int id = 10;
	public static void main(String[] args) {
		
		int arr[] = new int[5];// Array should not be negative:- Exception in thread "main" java.lang.NegativeArraySizeException
		System.out.println(arr);
		
		/*
		[I@15db9742
		[I :- name of the Class
		15db9742 :- Hexadecimal : hash-code of the object 
		*/
		
		FirstArray f = new FirstArray();
		System.out.println(f);
		//System.out.println("Mine"+(f.getClass().getName())+"@"+Integer.toHexString((f.hashCode())));
		System.out.println(f.hashCode());
		//Minearray.FirstArray@6d06d69c

	}
	
	public String toString()
	{
		return name+"   "+id;
	}
	

}
