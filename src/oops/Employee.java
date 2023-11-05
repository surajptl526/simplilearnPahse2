package oops;

public class Employee {
	public String Name;
	public int EmpId;
	private int Salary;
	
	public void  Display() {
		System.out.println("Name of the employee is " + Name);
		System.out.println("Id Of the employee is " + EmpId);
		System.out.println("Salary of Employee is " +Salary);
	}
	
	public void SetSalary(int sal) {
		
		this.Salary =sal;
		
	}
	
	public Employee() {
		System.out.println(("Inside Default cons"));
	}
	
	public Employee(String Name1,int EmpId1,int Salary1) {
		System.out.println("Inside param cons");
		
		this.Name= Name1;
		this.EmpId= EmpId1;
		this.Salary =Salary1;
		
		
	}

}
