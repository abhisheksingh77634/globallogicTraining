package com.globallogic;

 class ppolymorph {
	public void work() {
		System.out.println("I am doing Person Work");
	}
	public void work(int hours) {
		System.out.println("I am doing Person Work "+hours);
	}
	public String work(int hours,String work) {
		System.out.println("I am doing Person Work "+hours +" "+work);
		return work;
	}
}

class School extends ppolymorph {
	public void work() {
		System.out.println("I am doing the School Work");
	}
}
class Office extends ppolymorph {
	public void work() {
		System.out.println("I am doing the office Work");
	}
}

public class polymorph {

	public static void main(String[] args) {
 
		//9-10
		ppolymorph ravinder=new ppolymorph();
		//call the person class work method
		ravinder.work(8,"work");
		
		//10 to 1 pm
		ravinder=new School();
		//call the school class work method
		ravinder.work();
		
		//5 to 9
		ravinder=new Office();
		ravinder.work();
	}
}


