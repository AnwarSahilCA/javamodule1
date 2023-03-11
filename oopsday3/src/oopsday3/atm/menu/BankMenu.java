package oopsday3.atm.menu;
import java.util.Scanner;

import oopsday3.atm.exceptions.InsufficentFundsException;
public class BankMenu{
BankOfAmerica2 boa=new BankOfAmerica2();

public BankMenu() {
	Account a1 =new Account(101,"John Doe","savings",500);
	Account a2 =new Account(102,"Jone Doe","savings",700);
	Account a3 =new Account(103,"Jason Doe","savings",850);
	Account a4 =new Account(104,"Jane Doe","savings",250);
	Account a5 =new Account(105,"Jonas Doe","savings",650);
	boa.addAccount(a1);
	boa.addAccount(a2);
	boa.addAccount(a3);
	boa.addAccount(a4);
	boa.addAccount(a5);

}
public void menu() throws InsufficentFundsException/*throws NegativeAmountException*/ {
	Scanner scanner=new Scanner(System.in);
int choice =0;
	loop:do {
		System.out.println("Enter");
		choice=scanner.nextInt();
		switch(choice)
		{
		case 1:{
			System.out.println("Account added");
			int actno=scanner.nextInt();
			boa.displayAccount(actno);
			
			
			break;
		}
		case 2:{
			System.out.println("ENter actNo");
			int actno=scanner.nextInt();
			System.out.println("ENter amount to deposit");
			int amount=scanner.nextInt();

			double balance=boa.deposit(amount, actno);
			System.out.println(balance);
			break;
			
		}
		case 3:{
			System.out.println("ENter actno");
			int actno=scanner.nextInt();
			System.out.println("Enter amount");
			double amt=scanner.nextInt();
			try {
				System.out.println("BAlance="+ boa.withdraw(amt, actno));
			} catch (InsufficentFundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		case 4:{
			System.out.println("ENter actno");
			int actno=scanner.nextInt();
			System.out.println("BAlance="+ boa.balanceEnquiry(actno));
			
			break;
			
		}
		case 5:{
			break loop;
		}
		}
		
		
	}while(choice!=5);
}
}






