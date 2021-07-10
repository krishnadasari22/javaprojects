package Edureka;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input=new Scanner(System.in);
    DecimalFormat  moneyFormat=new DecimalFormat("'$' ###,##0.00");
    /*set the customer number*/
    public int setCustomerNumber(int  customerNumber) {
    	this.customerNumber=customerNumber;
    	return customerNumber;
    }
    /*Get the customer number*/
    public int getCustomerNumber() {
    	return customerNumber;
    }
    /* Set the pin number*/
    public int setPinNumber(int pinNumber) {
    	this.pinNumber=pinNumber;
    	return pinNumber;
    }
    /* Get the pin number*/
    public int getPinNumber() {
    	return pinNumber;
    }
    /* Get checking account balance*/
    public double getCheckingBalance() {
    	return checkingBalance;
    }
    /* Get saving Account Balance*/
    public double getsavingBalance() {
    	return savingBalance;
    }
    /* calculating checking  account withdrawl*/
    public double calcCheckingWithdraw(double amount) {
    	checkingBalance=(checkingBalance-amount);
    	return checkingBalance;
    }
    /* calculate saving Account withdrawl*/
    public double calcSavingWithdraw(double amount) {
    	savingBalance=(savingBalance-amount);
    	return  savingBalance;
    }

/* calculate  checking Account Deposit*/
public double calcCheckingDeposit(double amount) {
	checkingBalance=(checkingBalance+amount);
	return checkingBalance;
}
/* calculate saving Account Deposit*/
public double calcSavingDeposit(double amount) {
	savingBalance=(savingBalance+amount);
	return savingBalance;
}
/*customer checking Account withdraw Input*/
public void getCheckingWithdrawInput() {
	System.out.println("Checking Account Balance: "+ moneyFormat.format(checkingBalance));
	System.out.print("Account  you want to withdraw from checking Account: ");
	double amount=input.nextDouble();
	if((checkingBalance-amount)-amount >=0){
		calcCheckingWithdraw(amount);
		Object checkBalance = null;
		System.out.println("New Checking Account Blance:"+moneyFormat.format(checkBalance));
	}else {
		System.out.println("Balance cannot be negative."+"\n");
	}
}
/* Customer saving Account Withdraw Input*/
public void getSavingWithdrawInput() {
	System.out.println("Saving Account Balance:"+moneyFormat.format(savingBalance));
	System.out.print("Account  you want to withdraw from saving Account: ");
	double amount=input.nextDouble();
	if((savingBalance-amount)>=0) {
		calcSavingWithdraw(amount);
		System.out.println("New saving account balance: "+savingBalance+"\n");
	}else {
		System.out.println("Balance cannot be negative."+"\n");
	}
}
/* Customer checking Account Deposit*/
public void getCheckingDepositInput() {
	System.out.println("checking Account balance:"+moneyFormat.format(checkingBalance));
	System.out.print("Amount  you want to deposit from checking Account");
	double amount=input.nextDouble();
	if((checkingBalance + amount)>=0) {
		calcCheckingDeposit(amount);
		System.out.println("New checking Account Balance: "+moneyFormat.format(checkingBalance));
	}else {
		System.out.println("Balance cannot be negative."+"\n");
	}
}
/*customer saving Account Deposit input*/
public void getSavingDepositInput() {
	System.out.println("saving Account Balance:"+moneyFormat.format(savingBalance));
	System.out.print("Amount you want to deposit from saving Account: ");
	double amount=input.nextDouble();
	if((savingBalance+amount)>=0) {
		calcSavingDeposit(amount);
		System.out.println("New saving Account balance:"+moneyFormat.format(savingBalance));
	}else {
		System.out.println("Balance cannot be negative."+"\n");
	}
}
private int customerNumber;
protected int pinNumber;
private double checkingBalance=0;
private double savingBalance=0;
}