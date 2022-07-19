package com.globallogic;
import java.util.*;
 class Emp {
	
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", roll=" + roll + "]";
	}
	
	public Emp(int id, String name, int roll) {
		super();
		this.id = id;
		this.name = name;
		this.roll = roll;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}

	int id;
	String name;
	int roll;

}
public class Objectarr{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Emp[] e = new Emp[5];
		System.out.println("Enter the emp details");
		for(int i=0;i<5;i++)
		{
			int id=sc.nextInt();
			 String name=sc.next();
			int roll=sc.nextInt();
			Emp e1=new Emp(id,name,roll);
			e[i]=e1;
		}
		
		for(Emp ee:e)
		{
			System.out.println(ee);
		}
	}
}

