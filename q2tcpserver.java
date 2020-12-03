import java.util.*;
import java.io.*;
import java.net.*;

public class q2tcpserver
{
	public static void main(String args[]) throws IOException
	{
		ServerSocket ss=new ServerSocket(1234);
		Socket ds=ss.accept();
		BufferedReader br=new BufferedReader(new InputStreamReader(ds.getInputStream()));
		String es;
		es=br.readLine();
		int num=Integer.parseInt(es);
		System.out.println("Square "+(num*num));		
	}
}

/*
output
100
*/