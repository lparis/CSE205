import java.text.DecimalFormat;

// Class InterestRates calculates simple interest rates demonstrating method overloading
public class InterestRates 
{
	// Method calculateInterest() takes 2 ints
	public static void calculateInterest(int bal, int rate)
	{
		int interest;
		interest = bal * rate / 100;
		System.out.println("Simple interest on $" + bal + " at " + rate + "% is $" + interest + ".");
	}
	
	// Method calculateInterest() takes 2 doubles
	public static void calculateInterest(double bal, double rate)
	{
				
		double interest;
		// interest = bal * rate / 100;
		interest = Math.round(bal * rate) / 100;
		System.out.println("Simple interest on $" + bal + " at " + rate + "% is $" + interest + ".");
	}

	public static void main(String[] args) 
	{
		// Call calculateInterest(int, int)
		calculateInterest(1000, 10);
		
		// Call calculateInterest(double, double)
		calculateInterest(1050.55, 9.5);
	}
}
