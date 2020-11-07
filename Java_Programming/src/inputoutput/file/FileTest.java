package inputoutput.file;

import java.io.File;

public class FileTest {

	public static void main(String[] args) {

		File f = new File("A");
		
		f.mkdir();
		
		System.out.println("File Created");
		

	}

}
