package com.globallogic;
import java.util.*;

//write a program to give the color code and print the color name 

public class Colorcode {
	public static void main(String[] args)
	{
        
		Scanner sc=new Scanner(System.in);
		System.out.print("Input the no :");
		int c=sc.nextInt();
		if(c==1)
		{
			System.out.print("Blue");
			
		}
		else if(c==2)
		{
			System.out.print("Black");
			
		}
		else if(c==3)
		{
			System.out.print("Green");
		}
		else
			System.out.print("Invalid Input");
	}

}
