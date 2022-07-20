package com.globallogic;
import java.util.Scanner;

public class Userstring {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer("");
		System.out.println("Enter the string buffer");
		str = str.append(sc.nextLine());
		System.out.println(str);
	}

}
