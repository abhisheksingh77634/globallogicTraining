package com.globallogic;
import java.util.*;

//hierarchical inheritence



class A1 {
	int a;
	String b;
	
	A1(int a, String b)
	{
		this.a=a;
		this.b=b;
	}
	public void printA1()
	{
	System.out.println(a+" "+b+" Class A");
	}
}

class B1 extends A1 {
	
		B1(int a, String b) {
		super(a, b);
		
	}

		public void printB1()
		{
			System.out.println(a+" "+b+" Class B");
		}
	}
class C1 extends A1{
	C1(int a, String b) {
		super(a, b);
		
	}

	public void printC1()
	{
		System.out.println(a+" "+b+" Class C");
	}
}
	


public class hierarchicalinherit {
	public static void main(String[] args)
	{
		C1 ob = new C1(1,"abc");
		B1 b1 = new B1(2,"DEF");
		ob.printA1();
		b1.printA1();
	}

}
