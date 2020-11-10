package inputoutput.writer;

import java.io.*;

class FileOutputStreamTest
{
public static void main(String args[])throws IOException
{

FileOutputStream fos = new FileOutputStream("FileInputStreamTest.txt");



fos.write('a');


fos.close();

}
}
