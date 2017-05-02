package com.app;

import java.util.Scanner;

public class Disarium {
	
	
	public static int count(int i1)
	{
		int c=0;
		
		while(i1>0)
		{
			c++;
			i1=i1/10;
		}
		return c;
	}
	
	public static int pow(int n,int p)
	{
		int pw=1;
		
		while(p>0)
		{
			pw=pw*n;
			p--;
			
		}
		return pw;
	}
	

	public static void main(String[] args) {
		int sum=0,temp=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=scn.nextInt();
		
		int c=count(num);
		
		
		while(num>9)
		{
			 temp=num;
			
			while(num>0)
			{
				int r=num%10;
				sum=sum+pow(r,c);
				num=num/10;
				c--;
			}
		}
		if(sum==temp)
			System.out.println("The given num is Disarium");
		else
			System.out.println("not Disarium");
		
	

	}

}
