package com.globallogic;
import java.util.*;
public class MyByte {

	public static void main(String[] args) {
		
				
				//created the primitive  class variable
				byte b=10;
				
				//created the Byte class object from primitive variable
				Byte b1=new Byte(b);
				
				
				System.out.println(Byte.MIN_VALUE);
				System.out.println(Byte.MAX_VALUE);
				//get double value of byte
				System.out.println("double value"+b1.doubleValue());
				
				System.out.println("float value "+b1.floatValue());
				
				Byte newb=new Byte((byte)11);
				//if
			Integer i=new Integer(11);
				System.out.println(Integer.MIN_VALUE);
				System.out.println(Integer.MAX_VALUE);
				
				//convert Integer to binary
				System.out.println(Integer.toBinaryString(i));
				
				////convert the Integer value to String
				System.out.println(Integer.toString(b));
				//find the max of two number
				System.out.println(Integer.max(10, 11));
				
				//minimum of two number
				System.out.println(Integer.min(11, 10));

				System.out.println(i.compareTo(10));
				
				Character c=new Character('A');
				System.out.println(c.charValue());
				
				System.out.println(c.toLowerCase('A'));
				
				System.out.println(c.toUpperCase('S'));

	}

}
