/**
 * @author lbparis
 * CSE205
 */
public class BankAccount {
	
	private int accountNumber;
	private double balance;

	/**
	 * Constructs a bank account record with a zero balance
	 * @param anAccountNumber the account number for this account
	 */
	public BankAccount(int anAccountNumber) 
	{
		accountNumber = anAccountNumber;
		balance = 0;
	}
	
	/**
	 * Constructs a bank account record with a given balance
	 * @param anAccountNumber the account number for this account
	 * @param initialBalance the initial balance
	 */
	public BankAccount(int anAccountNumber, double initialBalance) 
	{
		accountNumber = anAccountNumber;
		balance = initialBalance;
	}
	
	/**
	 * Get the account number of this bank account record
	 * @return accountNumber; 
	 */
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	/**
	 * Deposits money into the bank account
	 * @param amount the amount to deposit
	 */
	public void deposit(double amount)
	{
		double newBalance = balance + amount;
		balance = newBalance;
	}
	
	/**
	 * Get the current balance of the account
	 * @return balance
	 */
	public double getBalance()
	{
		return balance;
	}
}
