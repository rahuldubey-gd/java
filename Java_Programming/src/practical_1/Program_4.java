package practical_1;

public class Program_4 {
/**
 *  Write a program to print java features. Enumerate features using index variable.
 *  There should be at-least 10 features.
 *  Sample:
 *  1. Java is compiled as well as interpreted
 *  2. Java is robust and secure.
 *  ..... so on.
 * @param args
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String features [] = new String[10];
		features[0]="Open Source";
		features[1]="Portable";
		features[2]="Object Oriented Programming";
		features[3]="Secure";
		features[4]="Robust";
		features[5]="Multithreaded";
		features[6]="Distributed";
		features[7]="Architecture Neutral";
		features[8]="High Performnace";
		features[9]="High Level Lang.";
		int a= 1;
		for(int i=0;i<=9;i++)
		{
			
			System.out.println("Feature:-"+(i+1)+" :"+features[i]);
			a++;
		}

	}

}
