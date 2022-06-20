import java.util.Scanner;
class Fibo
{
	public static void calculateFibbo(int n, int a , int b)
	{
		int c,i;
		System.out.print(a + " " + b + " ");
		for(i=2;i<n;i++)
		{
		c=a+b;
		System.out.print(c + " ");
		a=b;
		b=c;
		}
	}
}

class Fibonacci
{
 public static void main(String args[])
 {
	 int a=0,b=1;
	 Scanner sc=new Scanner(System.in);
	 System.out.print("Enter the no of terms in fibonacci: ");
	 int n=sc.nextInt();
	 Fibo obj=new Fibo();
	 obj.calculateFibbo(n,a,b);
}
}