package inputoutput.file;
import java.io.*;

class BufferedReaderTest
{
public static void main(String args[]) throws IOException
{

BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

String name = br.readLine();

System.out.println(name);

}

}
