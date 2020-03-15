/**
 * @author lparis
 * CSE205 
 */

import java.util.ArrayList;

// The Bank class contains a collection of bank accounts.
public class Bank 
{
	// Bank accounts are stored in an ArrayList named accounts
	private ArrayList<BankAccount> accounts;
	
	// Constructs a bank with no accounts.
	public Bank()
	{
		accounts = new ArrayList<BankAccount>();
	
	}
	
	/**
	 * Method that adds an account to this bank.
	 * @param account the account to add
	 */
	public void addAccount(BankAccount account)
	{
		accounts.add(account);
	}
	
	/**
	 * Method that gets the sum of all accounts in this bank
	 * @return the sum of the balances
	 */
	public double getTotalBalance()
	{
		double total = 0;
		for (BankAccount account : accounts)
		{
			total = total + account.getBalance();
		}
		return total;
	}
	
	/**
	 * Counts the number of bank accounts whose balance is
	 * at least a given value
	 * @param atLeast the balance required to count an account
	 * @return the number of accounts having at least the given balance
	 */
	public int countBalancesAtLeast(double atLeast)
	{
		int matches = 0;
		for (BankAccount account : accounts)
		{
			if (account.getBalance() >= atLeast)
				matches++;
		}
		return matches;
	}
	
	/**
	 * Finds a bank account with a given number
	 * @param accountNumber the number to find
	 * @return the account with the given number,
	 * or null if there is no such account
	 */
	public BankAccount find(int accountNumber)
	{
		for (BankAccount account : accounts)
		{
			if (account.getAccountNumber() == accountNumber)
				return account;
		}
		return null; // No match in the entire array
	}
	
	/**
	 * Gets the bank account with the largest balance
	 * @return the account with the largest balance,
	 * or null if the bank has no accounts
	 */
	public BankAccount getMaximum()
	{
		if (accounts.size() == 0)
			return null;
		BankAccount largestYet = accounts.get(0);
		for (int i = 1; i < accounts.size(); i++)
		{
			BankAccount account = accounts.get(i);
			if (account.getBalance() > largestYet.getBalance())
				largestYet = account;
		}
		return largestYet;
	}
}