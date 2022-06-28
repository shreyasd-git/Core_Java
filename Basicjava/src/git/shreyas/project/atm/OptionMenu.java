package git.shreyas.project.atm;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Scanner;

import org.omg.CORBA.PUBLIC_MEMBER;

public class OptionMenu extends Account{
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
	
	public void getLogin() {
		int x = 1;
		do {
			try {
				data.put(445789, 1234);
				data.put(254889, 4567);
				
				System.out.println("Welcome to ATM");
				System.out.println("Enter your Account Number");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.println("Enter your Pin Number: ");
				setCustomerPin(menuInput.nextInt());
			} catch (Exception e) {
				System.out.println("\n" + "Invalid Characters. Only Numbers." + "\n");
				//x = 2;
			}
			int cn = getCustomerNumber();
			int pn = getCustomerPin();
			if(data.containsKey(cn) && data.get(cn) == pn) {
				getAccountType();
			}else
				System.out.println("\n" + "Wrong Customer Number or Pin Number" + "\n");
		}while(x == 1);
	}


	public void getAccountType() {
	System.out.println("Select the Account you Want to Access");
	System.out.println(" Type 1 : Checking Account ");
	System.out.println(" Type 2 : Saving Account ");
	System.out.println(" Type 3 : Exit ");
	System.out.println(" Choice: ");
	
	int selection = menuInput.nextInt();
	
	switch (selection) {
	case 1:
		getChecking();
		break;
		
	case 2: 
		getSaving();
		break;
	}
	}
	
	public void getChecking() {
	System.out.println("Checking Account: ");
	System.out.println(" Type 1 : View Balance ");
	System.out.println(" Type 2 : Withdraw Funds ");
	System.out.println(" Type 3 : Deposit Funds ");
	System.out.println(" Type 4 : Exit ");
	
	int selection = menuInput.nextInt();
	
	switch (selection) {
	case 1: 
		System.out.println("Checking Account Balance: " +  moneyFormat.format(getCheckingBalance()));
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
		System.out.println(" Thankyou for Visiting ATM! ");
		break;
		
	default:
		System.out.println(" Invalid Type ");
		getChecking();
	}
	
}
	
	public void getSaving() {
	System.out.println(" Saving Account: ");
	System.out.println(" Type 1 : View Balance ");
	System.out.println(" Type 2 : Withdraw Funds ");
	System.out.println(" Type 3 : Deposit Funds ");
	System.out.println(" Type 4 : Exit ");
	
	int selection = menuInput.nextInt();
	
	switch (selection) {
	case 1: 
		System.out.println("Saving Account Balance: " +  moneyFormat.format(getSavingBalance()));
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
		System.out.println(" Thankyou for Visiting ATM! ");
		break;
		
	default:
		System.out.println(" Invalid Type ");
		getChecking();
	}
	
}	
	
}
