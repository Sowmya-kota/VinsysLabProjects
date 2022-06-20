import java.util.Scanner;
public class Question5
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		int num2 =0 ;
	
		System.out.printf("Enter First  Number: \n \n");
		num1 = input.nextInt();
		
		System.out.printf("Enter Second  Number: \n \n");
		num2 = input.nextInt();

		System.out.println("Sum is " + (num1 + num2));
		System.out.println("Product is " + ( num1 * num2));
		System.out.println("Difference is " + (num1 - num2));
		System.out.println("Quotient is " + (num1 / num2));	
	}

}
