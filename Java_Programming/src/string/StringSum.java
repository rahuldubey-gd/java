package string;

public class StringSum {

	public static void main(String[] args) {
		
		String s = "12345";
		
		int sum = 0;
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			
			// System.out.println((int)ch);
			int a = Character.getNumericValue(ch);
			sum = sum + a;
		}
		System.out.println(" Sum "+sum);

	}

}
