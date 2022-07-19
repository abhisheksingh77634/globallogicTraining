package com.globallogic;
import java.util.Scanner;

//Java Program to reverse the letters present in the given String

public class Reversestring {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a string :");
		String s=sc.nextLine();
		String s1="";
		char c;
		for(int i=0;i<s.length();i++)
		{
			c=s.charAt(i);
			s1=c+s1;
		}
		System.out.print(s1);
	}
	

}
