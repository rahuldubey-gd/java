package string;

public class StringConcat {

	public static void main(String[] args) {
		
		String s1 = "abc";
		String s2 = " abcxyz ";
		
		System.out.println((s1+s2).hashCode());
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.concat("asdfghjkkjhgf"));
		System.out.println(s2.charAt(3));
		System.out.println(s2.contains("xyzgh"));
		System.out.println(s2.length());
		s2 = s2.trim();
		System.out.println(s2.length());
		System.out.println(s2.substring(1, 5));
		String s = "A,B,C,D,E,F,G,H";
		
		System.out.println(s);
		
		String[] sr = s.split(",");
		
		for(String s5:sr) {
			System.out.println(s5);
		}

	}

}
