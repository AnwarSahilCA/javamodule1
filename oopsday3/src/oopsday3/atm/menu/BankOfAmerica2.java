package oopsday3.atm.menu;
import oopsday3.atm.exceptions.*;

public class BankOfAmerica2 implements BankingIface2 {
	private Account[] accounts = new Account[5];
	private int accountIndex = 0;

	public BankOfAmerica2() {

	}

	public BankOfAmerica2(Account[] accounts) {
		this.accounts = accounts;
	}

	@Override
	public double withdraw(double amount, int actno) throws InsufficentFundsException {
		// TODO Auto-generated method stub
//		for(int i-0;i<accounts.length;i++)
//		
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno) {
				if(accounts[i].getBalance()<amount)
				{
					throw new InsufficentFundsException("Insufficient funds");
				}
				tempBal = accounts[i].getBalance();
				tempBal -= amount;
				accounts[i].setBalance(tempBal);
				break;
			}
		}
		return tempBal;
	}

	@Override
	public double deposit(double amount, int actno) {
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno) {
				tempBal = accounts[i].getBalance();
				tempBal += amount;
				accounts[i].setBalance(tempBal);
				break;
			}
		}
		// TODO Auto-generated method stub
		return tempBal;
	}

	@Override
	public double balanceEnquiry(int actno) {
		double tempBal = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno) {
				tempBal= accounts[i].getBalance();
				break;
			}
		// TODO Auto-generated method stub
		
	}
		return tempBal;
	}

	public Account[] getAccounts() {
		return accounts;
	}

	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}

	public void addAccount(Account account) {
		if (this.accountIndex < accounts.length)
			accounts[this.accountIndex++] = account;
		else
			System.out.println("operation not allowed");
	}
	public void displayAccount(int actno) {
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getActno() == actno) {

				System.out.println(accounts[i].getActno());
				System.out.println(accounts[i].getName());
				System.out.println(accounts[i].getActType());
				System.out.println(accounts[i].getBalance());
				break;
			
		}
	}

	}
}
