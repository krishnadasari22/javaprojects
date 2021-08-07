package Edureka;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
Scanner input=new Scanner(System.in);
DecimalFormat=new DecimalFormat("'$'###,##0.00");
/*Set the customer number*/
public int setCustomerNumber(int customerNumber) {
	this.customerNumber=customerNumber;
	return customerNumber;
	/*Get the customer Number*/
	  public int getCustomerNumber1()
	  {
		  return customerNumber;
	  }
	  /*Get the customer Number*/
	  public int getCustomerNumber() {
		  return customerNumber;
	  }
	  /*Set the pin number*/
	  public int PinNumber(int PinNumber) {
		  this.pinNumber=PinNumber;
		  return pinNumber;
	  }
	  /*get the pin number*/
	  public int getPinNumber() {
		  return pinNumber;
	  }/*Get checking Account balance*/
	  public double getCheckingBalance() {
		  return checkingBalance;
	  }
	  /*Get savings account balance*/
	  public double getsavingsBalance() {
		  return savingBalance;
		  
	  }
	  /*calculate checking Account balance*/
	  public double calcCheckingWithdraw(double amount) {
		  checkingBalance=(checkingBalance-amount);
		  return checkingBalance;
	  }
	  /*calculate savings account withdrawal*/
	  public double calcSavingsWithdraw(double amount) {
		  savingBalance=(savingBalance-amount);
		  return savingBalance;
	  }
	  /*calculate saving account deposit*/
	  public double calcSavingaDeposit(double amount) {
		  savingBalance=(savingBalance+amount);
		  return savingBalance;
	  }
	  /*customer checking Account withdraw input*/
	  public void getCheckingWithdrawInput() {
		  System.out.println("checking account balance: "+moneyFormat.format(checkingBalance));
		  System.out.println("Amount you want to withdraw from checkingAccount: ");
		  double amount=input.nextDouble();
		  if((checkingBalance-amount)>=0) {
			  calcCheckingWithdraw(amount);
			  System.out.println("New Checking account Balance: "+moneyFormat.format(checkingBalance));
		  }else {
			  System.out.println("Balance cannot be Negative."+"\n");
		  }
	  }
	  /*customer savings account withdraw input*/
	  public void getSavingWithdrawInput() {
		  System.out.println("savings account balance: "+moneyFormat.format(checkingBalance));
		  System.out.println("Amount you want to withdraw frim savings account: ");
		  double amount=input.nextDouble();
		  if((savingBalance-amount) >=0){
			  calcCheckingWithdraw(amount);
			  System.out.println("New Saving Account balance: " +savingBalance+"\n");
		  }else {
			  System.out.println("Balance cannot be negative."+"\n");
		  }
	  }
	  /*customer checking Account Deposit input*/
	  public void getCheckingDepositInput() {
		  System.out.println("Checking Account Balance: "+moneyFormat.format(savingBalance));
		  System.out.println("Amount you want to deposit from checking Account: ");
		  double amount=input.nextDouble();
		  if((checkingBalance+amount)>=0) {
			  calcCheckingDeposit(amount);
			  System.out.println("New checking Account balance: "+moneyFormat.(checkingBalance));
		  }else {
			  System.out.println("Balance cannot be negative."+"\n");
		  }
	  }
	  /*customer savingAccount Deposit input*/
	  public void setSavingsDepositInput() {
		  System.out.println("Saving Account Balane: "+moneyFormat.format(savingBalance));
		  System.out.println("Amount  you want to deposit from savings Account: ");
		  double amount=input.nextDouble();
		  if((savingBalance+amount)>=0) {
			  calcSavingaDeposit(amount);
			  System.out.println("New saving account balance: "+moneyFormat.format(savingBalance));
		  }else {
			  System.out.println("Balance cannot be negative."+"\n");
		  }
	  }
	  private int customerNumber;
	  private int pinNumber;
	  private double checkingBalance;
	  private double savingBalance;
}
}
