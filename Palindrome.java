package com.globallogic;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String s = sc.next();
		String sb = "";
		int l=0;
		for(int i=s.length()-1;i>=0;i--)
		{
			sb=sb+s.charAt(i);
		}
		if(s.equals(sb))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palindrome");
		

	}

}
