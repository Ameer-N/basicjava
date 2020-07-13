package practice2;

import java.util.Scanner;

public class SavingAccount {
	private double balance;
	private int interestRate;
	private int accountNo;
	public SavingAccount(double balance,int interestRate,int accountNo) {
		setBalance(balance);
		setInterestRate(interestRate);
		setAccountNo(accountNo);
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	@Override
	public String toString() {
		return "\nbalance=Rs"+balance+",interest="+interestRate+"%,accountnumber="+accountNo;
	}
	public void withDrawal(double amount) {
		if(amount > balance) {
			System.out.println("Error! balance amount is not sufficient to take the mentioned amount.");
		}
		else {
			System.out.println("successfully withdrawn"+amount);
			 balance-=amount;
		}
	}
	public void calculateInterest()  {
	   double interest =(balance*interestRate*1)/100;
	   System.out.println("simple interest for one year :"+interest);
	}
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    SavingAccount acc = new SavingAccount(20000,12,100);
    System.out.print("enter amount to be withdrawal: ");
    double amount =scan.nextDouble();
    System.out.println(acc);
    acc.withDrawal(amount);
    System.out.println(acc);
    acc.calculateInterest();
    scan.close();
	}
}
