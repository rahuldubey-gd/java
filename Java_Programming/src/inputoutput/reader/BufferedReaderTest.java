package inputoutput.reader;

import java.io.*;

class BufferedReaderTest
{

public static void main(String args[])throws IOException
{
	File f = new File("FileReaderTest.java");
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	
	String data = "";
	data = br.readLine();
	System.out.println("1-"+data);
	data = br.readLine();
	System.out.println("2-"+data);
	data = br.readLine();
	System.out.println("2-"+data);
	while(data!=null)
	{
		data = br.readLine();
		System.out.println(data);
	}
}

}