package networking;

import java.net.*;
import java.io.*;
class Client
{

public static void main(String args[])throws Exception
{

Socket sc = new Socket("localhost",9999);

System.out.println("Client Started.....");

System.out.println("server is Connected......");


	DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
	DataInputStream dis = new DataInputStream(sc.getInputStream());

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String msgFromServer = "";
	String msgFromClient = "";
	
	while(!msgFromServer.equals("exit()"))
	{
		
		msgFromServer = dis.readUTF();
		System.out.println("Server :-"+msgFromServer);

		msgFromClient = br.readLine();
		dos.writeUTF(msgFromClient);
		
	}

}



}