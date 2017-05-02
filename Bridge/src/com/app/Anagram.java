package com.app;

import java.util.Scanner;

public class Anagram {
	
	
	
	public static String space(String s1){
		
		char[] c1=s1.toCharArray();
		s1="";
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]!=' ')
				s1=s1+c1[i];
			
		}
		return s1;
		
		
	}
//	kjaghdhaskj
	
	public  static String toLow(String s1)
	{
		char[] c1=s1.toCharArray();
		s1="";
		
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]>=65 && c1[i]<=90)
			{
				s1=s1+(char)(c1[i]+32);
			}
			else{
			s1=s1+c1[i];
			}
		}
		return s1;
	}
	
	/*public static String dup(String s1)
	{
		
	}*/
	
	public static Boolean compare(String s1,String s2)
	{
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		
		for(int i=0;i<c1.length;i++)
		{
			if(c1[i]!=c2[i])
			{
				return false;
			}
		}
		return true;
	}
	
	
	public static String sort(String s1)
	{
		char[] c1=s1.toCharArray();
		s1="";
		
		for(int i=0;i<c1.length;i++)
		{
			for(int j=i+1;j<c1.length;j++)
			{
				if(c1[i]<c1[j])
				{
					char c=c1[i];
					c1[i]=c1[j];
					c1[j]=c;
			
				}
				
			}
			s1=s1+c1[i];
			
		}
		return s1;

	}


	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter the 1st String");
		String s1=scn.next();
		
		System.out.println("enter the 2nd String");
		String s2=scn.next();
		
		String s3=space(s1);
		String s4=space(s2);
		
		/*System.out.println(s3);
		System.out.println(s4);*/
		
		if(s3.length()!=s4.length())
		{
			System.out.println("not Anagram");
		}
		
		String s5=toLow(s3);
		String s6=toLow(s4);
		
		/*System.out.println(s5);
		System.out.println(s6);*/
		
		String s7=sort(s5);
		String s8=sort(s6);
		
		/*
		System.out.println(s7);
		System.out.println(s8);*/
		
		Boolean b=compare(s7, s8);
		
		if(b)
			System.out.println("Anagram");
		else
			System.out.println("not Anagram");
		
		
	

	}

}
