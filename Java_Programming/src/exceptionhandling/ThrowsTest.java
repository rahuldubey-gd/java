package exceptionhandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowsTest {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Before File Open");
		
		FileWriter fw = new FileWriter(new File("A.txt"));
		File f = new File("A.txt");
		
		
		System.out.println("After file Open");
		

	}

}
