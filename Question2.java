import java.util.Scanner;
public class Question2 
{

	public static void main (String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		 
		 int number1;
		 int number2;
		 int number3;
		 System.out.println("Enter the First Number");
		 number1 = input.nextInt();
		 System.out.println("Enter the Second Number");
		 number2 = input.nextInt();
		 System.out.println("Enter the Third Number");
		 number3 = input.nextInt();
		 System.out.printf("The product of three number is %d:", number1 * number2 * number3);
	}
}
		
