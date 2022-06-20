import java.util.Scanner;
public class Question12 
{
   public static double average(int grades[], int max )
   {
   int sum=0;
   double average = 0.0;
   for(int i=1;i<max;i++)
   {
	   sum+=grades[i];
	   average=sum/(i);
   }
   return average;  
}
public static void main(String args[])
{
	Scanner input=new Scanner(System.in);
	int i,grades[];
	grades=new int[20];
	
	for(i=0;i<20;i++)
	{
		System.out.printf("Enter Grades: ");
		grades[i]=input.nextInt();
		if(grades[i]==-1)
			break;
	}
	System.out.printf("%.2f", average(grades, i-1));
}
}