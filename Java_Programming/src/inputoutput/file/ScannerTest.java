package inputoutput.file;
import java.util.Scanner;
class ScannerTest
{

public static void main(String args[])
{

Scanner sc = new Scanner(System.in);

float f = sc.nextFloat();
boolean b = sc.nextBoolean();

System.out.println("Float :"+f);
System.out.println("Boolean :"+b);


}


}