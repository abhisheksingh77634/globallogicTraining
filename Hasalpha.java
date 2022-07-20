package com.globallogic;

public class Hasalpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "umbrella";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='e')
			{
				System.out.print("e is present");
				break;
			}
		}
	}

}
