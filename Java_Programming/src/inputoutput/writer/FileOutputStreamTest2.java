package inputoutput.writer;

import java.io.*;

class FileOutputStreamTest2
{
public static void main(String args[])throws IOException
{

FileInputStream fis = new FileInputStream("FileOutputStreamTest2.java");

FileOutputStream fos = new FileOutputStream("FileOutputStreamTest.txt");


int data = 0;

while(data!=-1)
{
	data = fis.read();
	System.out.print((char)data);
	fos.write(data);
}

fos.close();
fis.close();

}
}