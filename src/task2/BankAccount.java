package task2;

import java.util.Scanner;

public class BankAccount {

	double CurrentBalance;

	public void deposit(double amount) {
		if (amount > 0) {
			CurrentBalance = CurrentBalance + amount;
			System.out.println("Amount Successfully Deposited");
		} else {
			System.out.println("Deposite Amount Should be greater than 0");
		}
	}

	public void withdrawal(double amount) {
		if (CurrentBalance > amount && amount > 0) {
			CurrentBalance = CurrentBalance - amount;
			System.out.println(amount + " Rupees Withdrawal Successfully");
		} else {
			System.err.println("Insufficient Amount.");
		}
	}

	public void display() {
		System.out.println(CurrentBalance);
	}

	public static void main(String[] args) {
		System.out.println("*************Welcome To BankAccount*************");
		BankAccount bankAccount = new BankAccount();
		Scanner sc = new Scanner(System.in);
		double amount;
		int option;
		boolean logout = false;
		while (logout == false) {
			System.out.println("1. Check Balance");
			System.out.println("2. Deposite");
			System.out.println("3. Withdrawal");
			System.out.println("4. Exit");
			option = sc.nextInt();
			switch (option) {
			case 1:
				bankAccount.display();
				break;

			case 2:
				System.out.println("Enter Amount");
				amount = sc.nextInt();
				bankAccount.deposit(amount);
				break;

			case 3:
				System.out.println("Enter Amount");
				amount = sc.nextInt();
				bankAccount.withdrawal(amount);
				break;

			case 4:
				logout = true;
				System.out.println("Logout Successfully");
				break;

			default:
				System.out.println("Invalid Option");
				break;

			}
		}
	}
}
