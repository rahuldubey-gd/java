package inputoutput.writer;

import java.io.FileWriter;

public class FileWriterTest {

	public static void main(String[] args)throws Exception {
		
		FileWriter fw = new FileWriter("Abc.txt");
		char ch[] = {'H','E','L','L','O'};
		fw.write(ch);
		fw.write("Hello");
		fw.write("A");
		fw.write("B");
		fw.write(100);
		
		fw.flush();
		
		System.out.println("Data Written ");
		
		

	}

}
