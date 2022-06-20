
public class Grades 
{
	public static void main(String args[])
	{
		int marks = 70;
		char grade;
	    if(marks > 90)
	    {
      		System.out.println(" O ");
		}
	    if(marks > 80 && marks <= 90)
	    {
	    	System.out.println(" A ");
	    }
	    if(marks > 70 && marks <= 80)
	    {
	    	System.out.println(" B ");
	    }
	    if(marks > 60 && marks <= 70)
	    {
	    	System.out.println(" C ");
	    }
	    if(marks >= 50 && marks <= 60)
	    {
	    	System.out.println(" D ");
	    }
	    if(marks < 40)
	    {
	    	System.out.println(" F ");
	    }		
	}
}
