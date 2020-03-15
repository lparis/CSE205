import java.util.ArrayList;

/**
 * @author lparis
 *
 */
public class ArrayListTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Constructs an new array list named "accounts" that can hold BankAccount objects.
		ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
		// Adds account to the end.
		accounts.add(new BankAccount(1001, 100.01));
		accounts.add(new BankAccount(1015, 200.02));
		accounts.add(new BankAccount(1729, 300.03));
		accounts.add(1, new BankAccount(1008, 400.04));
		accounts.remove(0);
		
		System.out.println("Size: " + accounts.size());
		System.out.println("Expected: 3");
		BankAccount first = accounts.get(0);
		System.out.println("First account number: " + first.getAccountNumber());
		System.out.println("Expected: 1008");
		BankAccount last = accounts.get(accounts.size() - 1);
		System.out.println("Last account numbrer: " + last.getAccountNumber());
		System.out.println("Expected: 1729");
		
		//System.out.println("Balance: " + accounts.)

	}

}
