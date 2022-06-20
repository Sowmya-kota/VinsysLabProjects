class Person
{
	String name = "sowmya";
     int id;
}
public class Employee extends Person
{
public static void main(String args[])
{
	Employee e1 = new Employee();
	System.out.println(e1.name);
	System.out.println(e1.id);
}
}

