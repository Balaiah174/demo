package Interface;

import java.util.Scanner;

public class user {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Bankimplementation b = new Bankimplementation();
		System.out.println("Plese inset your ATM card ");
		System.out.println(" Ater successfully inserting card press continue (1) to continue the Transaction ");
		System.out.println(" press  2 to  Exit");
		int input =s.nextInt();
		if (input==1) {
		while (true) {
			System.out.println("----------------------WELCOME TO SBI BANK---------------- ");
			System.out.println("Please Select your Transaction");
			System.out.println(" 1.Withdraw");
			System.out.println(" 2.Deposit");
			System.out.println(" 3.CheckBalance ");
			System.out.println("  4.Exit");
			int Choice = s.nextInt();
			switch (Choice) {
			case 1:
				b.withdraw();
				break;
			case 2:
				b.deposit();
				break;
			case 3:
				b.checkBalance();
				break;
			default:
				System.out.println("Select valid Tansaction");

			}
			System.out.println("-----------Thank you for visiting----------");
		}
		}
		else {
			System.out.println(0);
		}
	}

}
