package com.globallogic;


//Write a program to check if the word 'orange' is present in the "This is orange juice".


public class Orangepresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="This is Orange juice";
		String[] ar =s.split(" ");
		for(int i=0;i<ar.length;i++)
		{
			String s1=ar[i];
			if(!s1.equals("Orange"))
			{
				continue;
			}
			else
				System.out.print("Orange is present");
			break;
		}
		
		
	}

}
