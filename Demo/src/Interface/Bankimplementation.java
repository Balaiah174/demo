package Interface;

import java.util.Scanner;

public class Bankimplementation implements Bank {
	int Balance = 1000000;
	int pin = 1234;

	Scanner s = new Scanner(System.in);

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		System.out.println(" Enter your Account number");
		long AccountNumber = s.nextLong();
		System.out.println("Enter your pin");
		int pincheck = s.nextInt();
		if (pin == pincheck) {
			System.out.println(" Enter money you want to withdraw");
			int withdrawlmoney = s.nextInt();
			if (Balance > withdrawlmoney) {
				Balance -= withdrawlmoney;
				System.out.println(" Your Transaction is Successfully Completed");
				System.out.println("Your current Balance is:" + Balance);
			} else if (Balance == withdrawlmoney) {
				System.out.println("you withdrawlmoney your total money");
				System.out.println("To continue Enter 1 or go Back to menu Ebnter 2");
				int Option = s.nextInt();
				if (Option == 1) {
					Balance -= withdrawlmoney;
					System.out.println(" Your Transaction is Successfully Completed");
					System.out.println("Your current Balance is:" + Balance);

				} else {
					System.exit(0);
				}

			} else {
				System.out.println("Insufficent Balance");
			}

		}else {
			System.out.println("Incorrect pin  please valid pin");
			
			
		}

	}

	@Override
	public void deposit() {
		System.out.println("Enter money to Deposit");
		int DepositintegerMoney=s.nextInt();
		System.out.println("Enter your pin");
		int pincheck=s.nextInt();
		if (pin==pincheck) {
			System.out.println("Enter money to Deposit");
			Balance+= DepositintegerMoney;
			System.out.println(" Your Transaction is Successfully Completed");
			System.out.println("Your current Balance is:" + Balance);

		}else {
			System.out.println("Incorrect pin  please valid pin");
			
			
		}

	}

	@Override
	public void checkBalance() {
		System.out.println("Enter money to Deposit");
		int DepositintegerMoney=s.nextInt();
		System.out.println("Enter your pin");
		int pincheck=s.nextInt();
		if(pin==pincheck) {
			System.out.println("Available balance is"+Balance);
			
		}else {
			System.out.println(" Incorrect pin please enter valid pin to view your current Balance");
		}

	}

	@Override
	public void exit() {
System.exit(0);

	}

}
