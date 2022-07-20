package com.globallogic;

//Write a program to find out the largest and smallest word in the string "This is an umbrella".

public class LargestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a Umbrella";
		String s2="";
		int l1=Integer.MIN_VALUE;
		String[] ar = s.split(" ");
		for(int i=0;i<ar.length;i++)
		{
			String s1=ar[i];
			int l=s1.length();
			if(l>l1)
			{
				s2=s1;
				l1=l;
			}
		}
		System.out.println("Largest word is "+s2+" length "+ l1);
		
		int l3=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++)
		{
			String a=ar[i];
			int n=a.length();
			if(n<l3)
			{
				s2=a;
				l3=n;
			}
		}
		System.out.println("Smallest word is "+ s2 +" length "+l3);

	}

}
