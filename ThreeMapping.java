import java.util.*;
public class ThreeMapping 
{
	public static void main(String args[])
	{
		Map map = new TreeMap();
		map.put("Monday", "Car");
		map.put("Tuesday", "Bike");
		map.put("Wednesday", "Bus");
		map.put("Wednesday", "Bike");
		Set set1 = map.keySet();
		Collection collection = map.values();
		Set set2 = map.entrySet();
		System.out.println(set1 + "\n" + collection + "\n" + set2);
	}

}
