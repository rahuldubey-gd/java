package practical_1;

public class Program_3 {
/**
 * Program 3: Write a program to display all primitive type variables. Also display your name in the last line.
 * Goal: learning the primitive types and assigning values to them.
 * extQ: Justify the following statement in the context of Java.
 * “ boolean can be true (Non-zero) or false(Zero) ”

 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Primitive Data Types
		char ch = 'A';
		boolean bool= true;
		byte b = 123;
		short s = 213;
		int i = 12345;
		long l = 1234567890l;
		float f = 12.45f;
		double d = 1234.3456;
		
		System.out.println("Data Type : Charcter - "+ch+"     "+Character.SIZE/8+"-byte  Size");
		System.out.println("Data Type : Boolean - "+bool+"     "+"-Don't have predefined size.");
		System.out.println("Data Type : Byte - "+b+"     "+Byte.SIZE/8+"-byte  Size");
		System.out.println("Data Type : Short - "+s+"     "+Short.SIZE/8+"-byte  Size");
		System.out.println("Data Type : Integer - "+i+"     "+Integer.SIZE/8+"-byte  Size");
		System.out.println("Data Type : Long - "+l+"     "+Long.SIZE+"-byte  Size");
		System.out.println("Data Type : Float - "+f+"     "+Float.SIZE+"-byte  Size");
		System.out.println("Data Type : Double - "+d+"     "+Double.SIZE+"-byte  Size");		
		//boolean bb = 1;
		/**
		 * You can't store 0/1 in boolean data type
		 * Mismatch data type error will be there.
		 */
	}

}
