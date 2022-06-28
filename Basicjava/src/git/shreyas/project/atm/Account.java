package git.shreyas.project.atm;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
	
	private int CustomerNumber;
	private int CustomerPin;
	private double checkingBalance = 0;
	private double savingBalance = 0;
	
	Scanner input = new Scanner(System.in);
	DecimalFormat moneyformat = new DecimalFormat("'$'###,##0.00");
	
	
	public int getCustomerNumber() {
		return CustomerNumber;
	}
	public int setCustomerNumber(int customerNumber) {
		this.CustomerNumber = customerNumber;
		return customerNumber;
	}
	public int getCustomerPin() {
		return CustomerPin;
	}
	public int setCustomerPin(int customerPin) {
		this.CustomerPin = customerPin;
		return customerPin;
	}
	public double getCheckingBalance() {
		return checkingBalance;
	}
	
	public double getSavingBalance() {
		return savingBalance;
	}
	
	//Checking withdraw
	public double calcCheckingWithdraw(double amount) {
		checkingBalance = checkingBalance - amount;
		return checkingBalance;
	}
	
	//Saving Withdraw
	public double calcSavingWithdraw(double amount) {
		savingBalance = savingBalance - amount;
		return savingBalance;
	}
	
	//Checking Deposit
	public double calcCheckingDeposit(double amount) {
		checkingBalance = checkingBalance + amount;
		return checkingBalance;
	}
		
	//Saving Deposit
	public double calcSavingDeposit(double amount) {
		savingBalance = savingBalance + amount;
		return savingBalance;
	}
	
	public void getCheckingWithdrawInput() {
		System.out.println("Checking Account Balance: " + moneyformat.format(checkingBalance));
		System.out.println("Amount you want to withdraw from Checking Account: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance - amount) >= 0) {
			calcCheckingWithdraw(amount);
			System.out.println("New Checking Balance: " + moneyformat.format(checkingBalance));
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}
	
	public void getSavingWithdrawInput() {
		System.out.println("Saving Account Balance: " + moneyformat.format(savingBalance));
		System.out.println("Amount you want to withdraw from Checking Account: ");
		double amount = input.nextDouble();
		
		if ((savingBalance - amount) >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("New Saving Balance: " + moneyformat.format(savingBalance));
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}
	
	public void getCheckingDepositInput() {
		System.out.println("Checking Account Balance: " + moneyformat.format(checkingBalance));
		System.out.println("Amount you want to Deposit into Checking Account: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance + amount) >= 0) {
			calcCheckingDeposit(amount);
			System.out.println("New Checking Balance: " + moneyformat.format(checkingBalance));
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}
	
	public void getSavingDepositInput() {
		System.out.println("Saving Account Balance: " + moneyformat.format(savingBalance));
		System.out.println("Amount you want to Deposit into Saving Account: ");
		double amount = input.nextDouble();
		
		if ((checkingBalance + amount) >= 0) {
			calcSavingDeposit(amount);
			System.out.println("New Saving Balance: " + moneyformat.format(savingBalance));
		} else {
			System.out.println("Balance cannot be negative." + "\n");
		}
	}

}
