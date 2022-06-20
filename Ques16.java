import java.io.*;
import java.util.*;
class DateClass
{
    private int month;
    private int date;
    private int year;
    public DateClass(int smonth,int sdate,int syear)
    {
        month=smonth;
        year=syear;
        date=sdate;
    }
    public void setMon(int smonth)
    {
        if(smonth>12)
        {
            System.out.println("Invalid month");
        }
        else
        {
            month=smonth;
        }
    }
    public void setDate(int sdate)
    {
        if(sdate>31)
        {
            System.out.println("Invalid date");
        }
        else
        {
            date=sdate;
        }
    }
    public void setYear(int syear)
    {
        year=syear;
    }
    public int getYear()
    {
        return year;
    }
    public int getDate()
    {
        return date;
    }
    public int getMonth()
    {
        return month;
    }
    public void displaydmy()
    {
        System.out.printf("%d/ %d/ %d",date,month,year);
    }
}
public class DateTest 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        DateClass d = new DateClass(11,9,2000);
        System.out.println("Enter the month");
        int myMonth = in.nextInt();
        d.setMon(myMonth);
        System.out.println("Enter the date");
        int myDate = in.nextInt();
        d.setDate(myDate);
        System.out.println("Enter the year");
        int myYear = in.nextInt();
        d.setYear(myYear);
        d.displaydmy();
    }
}