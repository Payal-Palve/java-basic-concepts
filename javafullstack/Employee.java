package javafullstack;

public class Employee {
	//cameCase
	
	private long employeeId;
	private String employeeName;
	private double employeeSalary;
	private String employeeEmail;
	private long employeePhone;
	
	//default constructor
	public Employee()
	{
		System.out.println("default constructor");
	}

	//parameterised constructor
	public Employee(long employeeId,String employeeName,double employeeSalary,String employeeEmail,long employeePhone)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
		this.employeeEmail=employeeEmail;
		this.employeePhone=employeePhone;
	}
	void salaryCheck()
	{
		System.out.println("anuual income"+ this.employeeSalary*12);
	}
	void displayEmployeeDetails()
	{
		System.out.println(this.employeeId+" "+this.employeeName+" "+ this.employeeEmail+" "+ this.employeeSalary+" "+this.employeePhone);;
	}

 public class MainEmployee{
	 public static void main(String[]args) {
		Employee emp1=new Employee(23,"payal",56000,"payal@gmail.com",90220239);
		
		
		emp1.displayEmployeeDetails();
		
		
		emp1.salaryCheck();
		 
	}
 }
}