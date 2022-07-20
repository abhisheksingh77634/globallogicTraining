package com.globallogic;

public class Individual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "www.google.com";
		String[] ar = s.split(".");
		String rev ="";
		for(String w:ar)
		{
			
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			System.out.println(sb);
			rev+=sb.toString()+".";
			
		}
		System.out.println(rev);

	}

}
