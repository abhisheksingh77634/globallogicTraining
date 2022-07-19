package com.globallogic;
import java.util.*;

//Write a program to vote system if age is > 18 allow to cast a vote

public class Vote
{
public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter your age :");
	int age=sc.nextInt();
	if(age>=18)
	{
		System.out.println("Allowed to Cast Vote");
	}
	else
		System.out.println("Not Allowed to Cast Vote");
	}

}
