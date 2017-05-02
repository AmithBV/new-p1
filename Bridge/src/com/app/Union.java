package com.app;

import java.util.Arrays;
import java.util.Scanner;

public class Union {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int[] i1=new int[5];
		int[] i2=new int[5];
		
		System.out.println("enter elements for 1st array");
		for(int i=0;i<i1.length;i++)
		{
			i1[i]=scn.nextInt();
		}
		
		System.out.println(Arrays.toString(i1));


		/*for(int i=0;i<i1.length;i++)
		{
			System.out.print(i1[i]);
		}
		System.out.println();
		
		*/
		System.out.println("enter elements for 2nd array");
		for(int i=0;i<i2.length;i++)
		{
			i2[i]=scn.nextInt();
		}
		
		System.out.println(Arrays.toString(i2));

		
		/*for(int i=0;i<i2.length;i++)
		{
			System.out.println(i2[i]);
		}
		*/
		
		
		int[] u=new int[i1.length+i2.length];
		
		System.out.println(u.length);
		for(int i=0;i<i1.length;i++)
		{
			u[i]=i1[i];
		}
		
		
		
		
		int j=i1.length;
		for(int i=0;i<i2.length;i++)		
		{
			for(int k=0;k<i1.length;k++)
			{
				if(i2[i]!=i1[k])
				{
					u[j]=i2[i];
					
				}
			}
			j++;
		}
		
		int c=0;
		for(int i=0;i<u.length;i++)
		{
			for(int l=i+1;l<u.length;l++)
			{
				
				if(u[i]==u[l])
				{
					c++;
					
					int k=l;
					while(k<u.length-1)
					{
						u[k]=u[k+1];
						k++;
						
					}
					k--;
					
				}
			}
				
		}
		
		System.out.println(Arrays.toString(u));

		
			
		

		/*	
		for(int i=0;i<u.length;i++)
		{
			System.out.println(u[i]);
		}*/
		
	}

}
