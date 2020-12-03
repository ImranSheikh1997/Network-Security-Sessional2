import java.util.*;
import java.io.*;
import java.net.*;

public class q2tcpfirewall
{
	public static void main(String args[]) throws IOException
	{
		ServerSocket ss=new ServerSocket(1233);
		Socket ds=ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(ds.getInputStream()));
		String s=br.readLine();
		int num;
		num=Integer.parseInt(s);
		System.out.println("Number successfully received: "+num);
		Socket sk1=new Socket("127.0.0.1",1234);
		DataOutputStream dos=new DataOutputStream(sk1.getOutputStream());
		if(num<100)
		{
			dos.writeBytes(num+"\n");	
			System.out.println("Number successfully sent as it is valid: "+num);		
		}
		else
		{
			System.out.println("Number "+num+" Not Sent!");
			System.out.println("Error ");
		}		
	}
	
}
/*
output
java q2tcpfirewall
Number successfully received: 10
*/
