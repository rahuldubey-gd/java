package inputoutput.outputstream;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamTest {

	public static void main(String[] args) throws IOException {
		
		OutputStreamWriter osr = new OutputStreamWriter(System.out);
		
		char ch[] = {'a','b','d'};
		osr.write("ABC");
		osr.write("Hello");
		osr.write(100);
		osr.write(ch);
		osr.flush();

	}

}
