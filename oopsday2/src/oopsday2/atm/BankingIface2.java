package oopsday2.atm;

import oopsday2.atm.exceptions.InsufficientFundsException;

public interface BankingIface2 {
	public abstract double withdraw(double amount,int actno) throws InsufficientFundsException;;
	public abstract  double deposit(double amount,int actno); //throws NegativeAmountException;
	public abstract double balanceEnquiry(int actno);
}
