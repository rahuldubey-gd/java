package inputoutput.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamImplementation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		int a = 1;
		//System.out.println(a);
		//System.out.println(isr.read());
		//int b = isr.read();
		while(a!=0)
		{
			System.out.println( "Enter Data");
			a = isr.read();
			System.out.println(a);
		}
		
		isr.close();
	}

}
