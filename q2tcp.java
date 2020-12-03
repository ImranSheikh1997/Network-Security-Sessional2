import java.util.*;
import java.io.*;
import java.net.*;

public class q2tcp
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		Socket ds=new Socket("127.0.0.1",1233);
		DataOutputStream dos=new DataOutputStream(ds.getOutputStream());
		int num;
		System.out.println("Enter Number to Sqaure: ");
		num=sc.nextInt();
		String s=num+"";
		dos.writeBytes(s+"\n");	
		System.out.println("Number : "+num+" sent to Firewall!");
	}
	
	
}


/*
output

Enter Number to Sqaure:
10
Number : 10 sent to Firewall!

*/