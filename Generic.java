package com.globallogic;



class Student<A,B,C,D,E>
{
	A p;
	B q;
	C r;
	D s;
	E t;
	
	public Student(A p, B q, C r, D s, E t) {
		super();
		this.p = p;
		this.q = q;
		this.r = r;
		this.s = s;
		this.t = t;
	}

	public void print()
	{
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(s);
		System.out.println(t);
	}
	
}
public class Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student<Integer,String,String,String,Integer> s = new Student<Integer,String,String,String,Integer>(1,"abhi","singh","m",001);
          s.print();
	}

}
