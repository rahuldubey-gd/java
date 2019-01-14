package networking;

import java.net.*;
import java.io.*;

class Server
{

public static void main(String args[])throws Exception
{
	//Creating Server
	//
	ServerSocket ss = new ServerSocket(9999);
	
	System.out.println("Server Started....");
	
	Socket sc = ss.accept();

	System.out.println("Ready to Chat.....");
	

	DataOutputStream dos = new DataOutputStream(sc.getOutputStream());
	DataInputStream dis = new DataInputStream(sc.getInputStream());

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	String msgFromServer = "";
	String msgFromClient = "";
	
	while(!msgFromServer.equals("exit()"))
	{
		
		msgFromServer = br.readLine();
		dos.writeUTF(msgFromServer);
		
		msgFromClient = dis.readUTF();
		System.out.println("Client :-"+msgFromClient);
	
	}

}
}