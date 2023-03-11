package oopsday3.atm.menu;
import oopsday3.atm.exceptions.InsufficentFundsException;

public interface BankingIface2 {
	public abstract double withdraw(double amount,int actno) throws InsufficentFundsException;
	public abstract  double deposit(double amount,int actno);//throws NegativeAmountException;
	public abstract double balanceEnquiry(int actno);
}
