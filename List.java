package com.globallogic;

//Create List of Student and perform the below operation : Add the data ,delete ,update ,remove , sort the list and print
import java.util.ArrayList;
import java.util.Collections;
public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ls = new ArrayList<String>();
		ls.add("abc");
		ls.add("ghe");
		ls.add("def");
		ls.add("lmn");
		ls.add("ijk");
		System.out.println("list :"+ls);
		ls.remove("def");
		System.out.println("remove "+ls);
		Collections.sort(ls);
		System.out.println("sort "+ls);
		ls.add(1,"xyz");
		System.out.println("update "+ls);
		ls.set(0, "qrs");
		System.out.println("update "+ls);
		
		
		
	}

}
