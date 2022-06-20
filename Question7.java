import java.util.Scanner;
public class Question7
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int bigger = 0;
		int smaller = 0;
	
		System.out.printf("Enter First  Number: \n \n");
		num1 = input.nextInt();
		
		System.out.printf("Enter Second  Number: \n \n");
		num2 = input.nextInt();
		
		System.out.printf("Enter Third  Number: \n \n");
		num3 = input.nextInt();
		
		bigger = num1 > num2 ? num1 : num2; 
		bigger = bigger > num3 ? bigger : num3;
		
		smaller = num1 < num2 ? num1 : num2; 
		smaller = smaller < num3 ? smaller : num3;

		System.out.printf("Sum = %d\n", num1+num2+num3);
		System.out.printf("Average = %d\n", (num1+num2+num3)/3);
		System.out.printf("Product = %d\n", num1*num2*num3);
		System.out.printf("Biggest = %d\n", bigger);
		System.out.printf("Smallest = %d\n", smaller); 
	}

}
