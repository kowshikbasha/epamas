package epam.task2;

import java.util.Scanner;

public class year {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of the chocalates");
		int n=sc.nextInt();
		System.out.println("enter the weights of chocoaltes");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the number of the sweets");
		int n1=sc.nextInt();
		System.out.println("enter the weights of sweets");
		int b[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println("enter the how much amount of weight you want");
		int we=sc.nextInt();
		Chocolates c=new Chocolates();
		sweets s=new sweets();
		int chocolatesweight=c.weight(a,we);
		int sweetsweight=s.weight(b,we);
		System.out.println(chocolatesweight+" "+sweetsweight);
		System.out.println("enter the start and last value");
		int st=sc.nextInt();
		int l=sc.nextInt();
		c.sortindex(a, st, l);
		c.sortindex(b,st,l);
		
		
      
	}

}
