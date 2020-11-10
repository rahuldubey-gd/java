package inputoutput.writer;

import java.io.*;

class FileInputStreamTest
{
public static void main(String args[])throws IOException
{

FileInputStream fis = new FileInputStream("FileInputStreamTest.java");

int data = 1;

while(data!=-1)
{
data = fis.read();

System.out.print((char)data);
}

fis.close();

}
}
