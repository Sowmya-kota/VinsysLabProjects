class Car
{
    int speed;
    double regularprice;
    String color;
    public Car(int Speed,double regularprice,String color)
    {
        this.speed=Speed;
        this.regularprice=regularprice;
        this.color=color;
    }
    double getSalePrice()
    {
        return regularprice;
    }
}
class Truck extends Car
{
    private int weight;
    public Truck(int Speed,double regularprice,String color,int weight)
    {
        super(Speed, regularprice, color);
        this.weight=weight;
    }
    public double getSalePrice()
    {
        if(weight>2000)
        {
            return (super.getSalePrice()-(0.1*super.getSalePrice()));
        }
        else
        {
            return (super.getSalePrice()-(0.2*super.getSalePrice()));
        }
    }

}
class Ford extends Car
{
	private int year;
	private int manufacturerDiscount;
	public Ford(int speed,double regularPrice,String color,int year,int manufacturerDiscount)
	{
		super(speed,regularPrice,color);
		this.year=year;
		this.manufacturerDiscount=manufacturerDiscount;
	}
	public double getSalePrice()
	{
		return (super.getSalePrice()-manufacturerDiscount);
	}
}
class Sedan extends Car
{
	private int length;
	public Sedan(int speed,double regularPrice,String color,int length)
	{
		super(speed,regularPrice,color);
		this.length=length;
	}
	public double getSalePrice()
	{
		if(length>20)
		{
			return super.getSalePrice()-(0.05*super.getSalePrice());
		}
		else
		{
			return super.getSalePrice()-(0.1*super.getSalePrice());
		}
	}
}
public class MyOwnAutoShop
{
	int speed;
	double regularPrice;
	String color;
	int year;
	int manufacturerDiscount;
	public static void main(String args[])
	{
		Sedan mySedan = new Sedan(160,2000,"Red",10);
		Ford myFord1 = new Ford(156,4452.0,"Black",2005,10);
		Ford myFord2 = new Ford(155,5000.0,"Pink",1998,5);
		Car myCar = new Car(555,56856.0,"Red");
		System.out.println("My Sedan price is "+myFord1.getSalePrice());
		System.out.println("My Ford 1 price is "+myFord2.getSalePrice());
		System.out.println("My Car price is "+myCar.getSalePrice());
	}
}