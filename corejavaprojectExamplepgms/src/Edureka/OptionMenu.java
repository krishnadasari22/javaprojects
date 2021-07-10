package Edureka;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class OptionMenu extends Account {
	Scanner  menuInput=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	HashMap<Integer,Integer>data=new HashMap<Integer,Integer>();
/*validate Login Information*/
	public void getLogin()throws IOException{
		int x=1;
		do {
			try {
				data.put(9876543, 9876);
				data.put(8989898, 1890);
				System.out.println("Welcome to ATM project!");
				System.out.print("Enter customer number");
				setCustomerNumber(menuInput.nextInt());
				System.out.print("Enter pin number");
				setPinNumber(menuInput.nextInt());
				
			}catch(Exception e) {
				System.out.println("\n"+"Invalid Character(s).only numbers."+"\n");
				x=2;
			}
			for(Entry<Integer,Integer>entry:data.entrySet()) {
				if(entry.getKey()==getCustomerNumber()&&entry.getValue()==pinNumber) {
					getAccountType();
				}
			}
			System.out.println("Wrong customer number or pin number."+"\n");
			
		}while (x==1);
			
		}
	/*Display account type menu section*/
	public void getAccountType() {
		System.out.println("select the account you wwant to access: ");
		System.out.println("Type1:-checking Account");
		System.out.println("Type2:-saving Account");
		System.out.println("Type3:-Exit");
		System.out.println("Choice: ");
		selection =menuInput.nextInt();
		switch(selection) {
		case 1:
			getChecking1();
			break;
		case 2:
			getsavingBalance();
			break;
		case 3:
			System.out.println("Thank you for using this ATM,bye.");
			break;
			default:
				System.out.println("\n"+"Invalid Code."+"\n");
				getAccountType();
		}
	}
/*Default checking Account menu with selection*/
	public void getChecking1() {
		System.out.println("checking Account");
		System.out.println("Type 1-view balance");
		System.out.println("Type 2:withdraw funds");
		System.out.println("Type 3-Deposit Funds");
		System.out.println("Type 4-Exit");
		System.out.println("Choice: ");
		selection=menuInput.nextInt();
		switch (selection) {
		case 1:
			getChecking1();
			break;
		case 2:
			getsavingBalance();
			break;
		case 3:
			System.out.println("Thank you for using this ATM bye.");
			break;
		default:
			System.out.println("\n"+"Invalid choice."+"\n");
			getAccountType();
		}
	}
	/*Display checking Account with selection*/
	public void getChecking11() {
		System.out.println("Checkinh Account");
		System.out.println("Type 1-View Balance");
		System.out.println("Type 2-Withdraw Funds");
		System.out.println("Type 3-Deposit Funds");
		System.out.println("Type 4-Exit");
		System.out.println("Choice: ");
		selection =menuInput.nextInt();
		switch(selection) {
		case 1:
			System.out.println("Checking Account balance:"+moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
		case 3:
			System.out.println("Thank you for using this ATM,bye.");
			break;
		default:
			System.out.println("\n"+"Invalid Choice"+"\n");
			getAccountType();
		}
	}
	/*Display checking Account menu with selection*/
	public void getChecking() {
		System.out.println("Checking Account");
		System.out.println("Type 1-view balance");
		System.out.println("Type 2-Withdraw Funds");
		System.out.println("Type 3-Deposit Funds");
		System.out.println("Type 4-Exit");
		System.out.println("Choice: ");
		selection =menuInput.nextInt();
		switch(selection) {
		case 1:
			System.out.println("Checking Account Balance:"+moneyFormat.format(getCheckingBalance()));
			getAccountType();
			break;
		case 2:
			getCheckingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getCheckingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thank you for using this ATM bye.");
			break;
		default:
			System.out.println("\n"+"Invalid choice."+"\n");
			getChecking1();
	}
}
/*Display saving Account menu with selection*/
public void getAccountType1() {
	System.out.println("Checking Account");
	System.out.println("Type 1-view Balance");
	System.out.println("Type 2-withdraw Funds");
	System.out.println("Type 3-Deposit Funds");
	System.out.println("Type 4-Exit");
	System.out.println("Choice: ");
	selection =menuInput.nextInt();
	switch(selection) {
	case 1:
		System.out.println("Saving Account  Balance:"+moneyFormat.format(getsavingBalance()));
		getAccountType();
		break;
	case 2:
		getSavingWithdrawInput();
		getAccountType();
		break;
	case 3:
		getSavingDepositInput();
		getAccountType();
		break;
	case 4:
		System.out.println("Thanl you for using this ATM, bye.");
		break;
	default:
		System.out.println("\n"+"Invalid Code"+"\n");
		getsavingBalance();
	}
	
}
int selection;
}