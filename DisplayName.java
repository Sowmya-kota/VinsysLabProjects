import java.util.Scanner;
class Name 
{
	String name;
	Name(String name)
	{
		this.name=name;
	}
	public void display()
	{
		System.out.println(name);		
    }
}
public class DisplayName
{
	public static void main(String args[])
	{
		String s;
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		Name myname=new Name(s);
		myname.display();
		sc.close();
		
	}
}
