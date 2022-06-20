class Add
{
	int a = 19,b=10;
	public void addsum() 
	{
		int sum = a+b;
		System.out.println(sum);
	}
}
class Mainly
{
	public static void main (String args[])
	{
		Add a = new Add();
		a.addsum();
	}
}