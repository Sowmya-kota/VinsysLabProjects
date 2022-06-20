//T(oC) = ((T(oF) - 32)× 5)/9 - formula
import java.util.*;
public class Question3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 double Celsius;
		 double Fahrenheit = 0.0; 
		 Celsius = (Fahrenheit - 32.0) * 5.0 / 9.0;
		 System.out.println("Enter the fahrenheit value");
		 Fahrenheit = input.nextDouble();
		 System.out.printf("The celsious value %2f is %2.2f " , Fahrenheit, Celsius);
	}
}

