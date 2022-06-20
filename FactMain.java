import java.util.Scanner;
class Fact
{
	public static void calculateFact(int n)
	{
		int fact=1;
		for(int i=n;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
}

class FactMain
{
 public static void main(String args[])
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the no whose factorial is to be calculated: ");
	 int n=sc.nextInt();
	 Fact obj=new Fact();
	 obj.calculateFact(n);
}
}
