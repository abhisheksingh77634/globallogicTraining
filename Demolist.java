package com.globallogic;
import java.util.*;
import java.util.List;

class Employee<X,Y,Z>
{
	X id;
	Y name;
	Z salary;
	public Employee(X id, Y name, Z salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public X getId() {
		return id;
	}

	public void setId(X id) {
		this.id = id;
	}

	public Y getName() {
		return name;
	}

	public void setName(Y name) {
		this.name = name;
	}

	public Z getSalary() {
		return salary;
	}

	public void setSalary(Z salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
class Sortbyname implements Comparator<Employee>
	{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return ((String) o1.getName()).compareTo((String)o2.getName());
		}
		
	}
class SortbyId implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if((int)o1.getId() > (int)o2.getId())
		{
			return 1;
		}
		else if((int)o1.getId() < (int)o2.getId())
		{
			return -1;
		}
		
		else
			return 0;
		
		
	}
	
}
	
	
 
	

public class Demolist  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		 ArrayList<Employee> ls = new ArrayList<>();
		 
		 while(true)
		 {
		System.out.println("Press 1  to Add the employee to list");
		System.out.println("Press 2 to Delete the employee from list");
		System.out.println("Press 3 to Search the employee name");
		System.out.println("Press 4 to Update the employee value using name or name");
		System.out.println("Press 5 to Sort the data of employee");
		System.out.println("Press 6 to Provide the sum of salary of employee");
		System.out.println("Press 7 to search for highest paid salary");
		System.out.println("Press 8 to search for minimum paid salary");
		System.out.println("press 9 Print the list");
		System.out.println("Enter your choice");
		System.out.println("Enter -1 to exit");
		int a = sc.nextInt();
		if(a==-1)
		{
			break;
		}
		 
		
		
		switch(a)
		{
			case 1:
			{
				
				System.out.print("Id :");
				int id = sc.nextInt();
				System.out.println("Name :");
				String name = sc.next();
				System.out.println("Salary :");
				int salary =  sc.nextInt();
				Employee<Integer,String,Integer> e1 = new Employee<>(id,name,salary);
				ls.add(e1);
				break;
			}
			case 2:
			{
				System.out.println("Enter the employee details to Delete ");
				
				System.out.print("Name :");
				String name = sc.next();
				for(Employee b: ls)
				{
					if(b.getName().equals(name))
					{
						ls.remove(a);
					}
				}
				System.out.println("Employee data deleted");
				break;
			}
			case 3:
			{
				System.out.println("Enter the employee name you want to search");
				String name = sc.next();
				boolean f=false;
				for(Employee b:ls)
				{
					if(b.getName().equals(name))
					{
						System.out.println(b);
						f=true;
					}
				}
				if(f==true)
				System.out.println("present");
				else
					System.out.println("not present");
			    break;
			}
			case 4:
			{
				System.out.println("Enter the employee name you want to update id for");
				String name=sc.next();
				System.out.println("Enter the employee id you want to update ");
				int n =sc.nextInt();
				for(Employee b:ls)
				{
					if(b.getName().equals(name))
					{
						b.setId(n);
					}
				}
				break;
			}
			case 5:
			{
				Collections.sort(ls,new SortbyId());
			}
			case 6:
			{
				System.out.println("Sum of Salary :");
				int sum=0;
				for(Employee b:ls)
				{
					sum = sum + (int)b.getSalary();
				}
				System.out.println(sum);
				break;
			}
			case 7:
			{
				System.out.println("Highest paid salary:");
				int q = Integer.MIN_VALUE;
				for(Employee b:ls)
				{
					if((int)b.getSalary()>q)
					{
						q=(int)b.getSalary();
					}
				}
				System.out.println(q);
				break;
			}
			case 8:
			{
				System.out.println("minimum paid salary");
				int q = Integer.MAX_VALUE;
				for(Employee b:ls)
				{
					if((int)b.getSalary()<q)
					{
						q=(int)b.getSalary();
					}
				}
				System.out.println(q);
				break;
			}
			case 9:
			{
				for(Employee b:ls)
				{
					System.out.println(b);
				}
				break;
			}
		}
	}

}
}
