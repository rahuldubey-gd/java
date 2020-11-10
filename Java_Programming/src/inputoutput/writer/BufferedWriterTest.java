package inputoutput.writer;

import java.io.*;

class BufferedWriterTest
{

public static void main(String args[])throws IOException
{

File f = new File("B.txt");

FileWriter fw = new FileWriter(f);

BufferedWriter bw = new BufferedWriter(fw);

bw.write('J');
bw.write('I');
bw.write(10);
bw.newLine();
bw.write('T');
bw.write('E');
bw.newLine();
bw.write('N');
bw.write('D');
bw.newLine();
bw.write('R');
bw.write('A');
bw.write("A");

bw.close();
fw.close();

}

}