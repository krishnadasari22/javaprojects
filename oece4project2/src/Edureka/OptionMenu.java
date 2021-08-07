package Edureka;
/*Main class*/
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
public class OptionMenu extends Account{
        Scanner menuInput=new Scanner(System.in);
        DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
        		HashMap<Integer,Integer>data=new HashMap<Integer,Integer>();
        /*validate login Information customer number and pin number*/
        public void getLogin()throws IOException{
        	int x=1;
        	do {
        		try {
        			data.put(9876543, 9876);
        			data.put(8989989, 1890);
        			System.out.println("Welcome to the ATM Project!");
        			System.out.print("Enter  customer Number");
        			setCustomerNumber(menuInput.nextInt());
        			System.out.print("Enter pin number: ");
        			setPinNumber(menuInput.nextInt());
        		}catch(Exception e) {
        			System.out.println("\n"+"Invalid character(s).Only numbers."+"\n");
        			x=2;
        		}
        		 for(Entry<Integer,Integer>entry: data.entrySet()) {
        			 if(entry.getKey()==getCustomerNumber()&&entry.getValue()==getPinNumber()) {
        	getAccountType();
        	
        }
        		 }
        		 System.out.println("\n" + "Wrong customer number Or Pin Number."+"\n");
        	}while(x==1);
        }
        private void setPinNumber(int nextInt) {
			// TODO Auto-generated method stub
			
		}
		/*Display Account type menu with selection*/
        public void getAccountType() {
        	System.out.println("Select the Account  you want to access: ");
        	System.out.println("Type-1 checking Account");
        	System.out.println("Type-2 Savings Account");
        	System.out.println("Type-3 Exit");
        	System.out.print("choice: ");
        	selection=menuInput.nextInt();
        	switch (selection) {
        	case 1:
        		getChecking();
        		break;
        	case 2:
        		getSaving();
        		break;
        	case 3:
        		System.out.println("Thank you for Using this ATM, bye.");
        		break;
        		default:
        			System.out.println("\n"+"Invalid Choice."+"\n");
        			getAccountType();
        	}
        }
        private void getSaving() {
			// TODO Auto-generated method stub
			
		}
		/*Display Checking account menu with selections*/
        public void getChecking() {
        	System.out.println("Checking Account: ");
        	System.out.println("Type 1:view balance");
        	System.out.println("Type 2:withdraw funds");
        	System.out.println("Type 3:Deposit");
        	System.out.println("Type 4:Exit");
        	System.out.println("Choice: ");
        	selection=menuInput.nextInt();
        	switch (selection) {
        	case 1:
        		System.out.println("checking Account balance: "+moneyFormat.format(getCheckingBalance()));
        		getAccountType();
        		break;
        	case 2:
                 getCheckingWithdrawInput();
                 getAccountType();
                 break;
        	case 4:
        		System.out.println("Thank you for using this ATM bye.");
        		break;
        		default:
        			System.out.println("\n"+"Invalid choice."+"\n");
        			getChecking();
        	}
        }
        /*Display savings Account*/
        public void savingsAccount() {
        	System.out.println("savings account");
        	System.out.println("Tupe 1:view  bakance");
        	System.out.println("Type 2:Withdraw funds");
        	System.out.println("Type 3:Deposit Funds");
        	System.out.println("Type 4:Exit");
        	System.out.println("Choice: ");
        	selection=menuInput.nextInt();
        	switch (selection) {
        	case 1:
        		System.out.println("Savings Account Balance: "+moneyFormat.format(getSavingBankAccount));
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
        		System.out.println("Thank you for using this ATM bye.");
        		break;
        		default:
        			System.out.println("\n"+"Invalid choice."+"\n");
        			getSaving();
        	}
        }
        private void getSavingDepositInput() {
			// TODO Auto-generated method stub
			
		}
		int selection;
	}

