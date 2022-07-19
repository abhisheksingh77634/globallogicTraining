package com.globallogic;
//Java program for swapping two numbers
import java.util.*;
public class Swapping {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int t;
		System.out.print("Enter the no to swap");
		int a=sc.nextInt();
		int b=sc.nextInt();
		t=a;
		a=b;
		b=t;
		System.out.print("After Swapping no. are "+a+" and "+b);
		
		
	}

}
