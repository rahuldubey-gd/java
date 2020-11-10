package inputoutput.writer;

import java.io.*;


class PrintStreamTest 
{

public static void main(String args[])throws IOException
{

File f = new File("P.txt");

PrintStream ps = new PrintStream(f);

ps.print("Rahul");
ps.println(" Dubey");
ps.println(10);
ps.println(99.99f);
ps.println(22.22);
ps.println(true);
ps.println(10101001010101l);
ps.println('A');
ps.println(125);

ps.close();


}

}