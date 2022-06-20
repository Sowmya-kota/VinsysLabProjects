import java.io.*;
import java.util.*;
class SavingsAccount 
{
    private static double annualInterestRate;
    private double savingsBalance;
    public SavingsAccount()
    {
        annualInterestRate=0.0;
        savingsBalance=0.0;
    }
    public SavingsAccount(double intRate, double savBal)
    {
        annualInterestRate=intRate;
        savingsBalance=savBal;
    }
    public double calculateMonthlyInterest()
    {
        double intRate = (savingsBalance*annualInterestRate)/12;
        savingsBalance = savingsBalance+intRate;
        return intRate;
    }
    public static void modifyInterestRate(double newInterestRate)
    {
        annualInterestRate=newInterestRate;
    }
    public void setSavingsBalance(double newBal)
    {
        savingsBalance=newBal;
    }
    public double getSavingsBalance()
    {
        return savingsBalance;
    }
    public double getannualInterestRate()
    {
        return annualInterestRate;
    }
}
public class SavingsAccountTest 
{
    public static void main(String[] args) 
    {
        SavingsAccount sa1 = new SavingsAccount();
        SavingsAccount sa2 = new SavingsAccount();
        sa1.setSavingsBalance(2000.00);
        sa2.setSavingsBalance(3000.00);
        SavingsAccount.modifyInterestRate(0.04);
        
        System.out.printf("New balance for savings account 1 is %.2f\n",sa1.getSavingsBalance());
        System.out.printf("New balance for savings account 2 is %.2f\n",sa2.getSavingsBalance());
        SavingsAccount.modifyInterestRate(0.05);
        
        sa1.calculateMonthlyInterest();
        sa2.calculateMonthlyInterest();
        
        System.out.printf("New balance for savings account 1 is %.2f\n",sa1.getSavingsBalance());
        System.out.printf("New balance for savings account 2 is %.2f\n",sa2.getSavingsBalance());
    }
}
