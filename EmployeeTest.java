import java.io.*;
class Employee
{
  private String firstname;
  private String lastname;
  private double salary;
  
  public Employee(String fname, String lname,double sal)
  {
	  if(fname != null) firstname=fname;
	  if(lname != null) lastname=lname;
	  if(sal >0.0)
	  {
		  salary = sal;
	  }
	  else
	  {
		  salary = 0.0;
	  }
  }
  public String getFirstName()
  {
	  return firstname;
  }
  public String getLastName()
  {
	  return lastname;
  }
  public Double getSalary()
  {
	  return salary;
  }
  public void setFirstName(String fName)
  {
	  if (fName != null)
	  firstname = fName;
  }
  public void setLastName(String lName)
  {
	  if(lName != null)
	  lastname = lName;
  }
  public void setSalary(double sal)
  {
	  if(sal >0.0)
	  {
		  salary = sal;
	  }
	  else
	  {
		  salary = 0.0;
	  }
  }
}
public class  EmployeeTest
{
	public static void main(String args[])
	{
		Employee employee1=new Employee ("Sowmya", "Kota", 50000.00);
		Employee employee2=new Employee ("Sampath", "Sam", 80000.00);
		
		 System.out.printf("\nYearly Salary \n");
		System.out.printf("\nNO:\t NAME\t\t\tYEARLY SALARY\n");
		
		System.out.printf("1:\t %s %s\t\t$%.2f\n", employee1.getFirstName(),employee1.getLastName(), employee1.getSalary());
		System.out.printf("2:\t %s %s\t\t$%.2f\n", employee2.getFirstName(),employee2.getLastName(), employee2.getSalary());
        
		 employee1.setSalary( (.1*employee1.getSalary())+employee1.getSalary());
		 employee2.setSalary( (.1*employee2.getSalary())+employee2.getSalary());

		 System.out.printf("\n10 Percent Salary Raised!! \n");
		 System.out.printf("\nNO:\t NAME\t\t\tYEARLY SALARY\n");
		
		 System.out.printf("1:\t %s %s\t\t$%.2f\n", employee1.getFirstName(),employee1.getLastName(), employee1.getSalary());
		 System.out.printf("2:\t %s %s\t\t$%.2f\n", employee2.getFirstName(),employee2.getLastName(), employee2.getSalary());
		 }
}