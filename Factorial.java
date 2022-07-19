package com.globallogic;

//Java program to calculate a Factorial of a number
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the No");
		int n=sc.nextInt();
		int fact=1;
		for(int i=n;i>0;i--)
		{
			fact*=i;
		}
		System.out.print("Factorial of "+n+" is "+fact);
	}
	

}
