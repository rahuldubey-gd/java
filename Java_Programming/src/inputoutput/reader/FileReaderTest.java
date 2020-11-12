package inputoutput.reader;

import java.io.*;

public class FileReaderTest
{
public static void main(String args[])throws Exception
{
	
	File f = new File("FileReaderTest.java");

	FileReader fr = new FileReader(f);
	
	int data = 0;
	data = fr.read();
	System.out.print((char)data);

/*
	while(data!=-1)
	{
		data = fr.read();
		System.out.print((char)data);
	}
*/
}
}
