/*
 * power() is a recursive method, where
 * x^n = x * x^n-1 | 2 * 2^2-1 = 2 * 2^1 = 4
 * x^0 = 1
*/

package module4;
import java.util.Scanner;

public class RecursionSimple 
{
	public static void main(String[] args) 
	{
		double x;
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		x = in.nextDouble();
		System.out.print("Enter an exponent: ");
		n = in.nextInt();
		System.out.println("Answer: " + power(x,n));
		in.close();
	}
	
	public static double power(double x, int n)
	{
		if (x == 0)
			return 0; 								// if the number is 0, result is always 0 because x * 0 = 0
		else if (n == 0)
			return 1; 								// if the exponent is 0, result is 1 because x^0 = 1
		else if (n > 0)
			return (x * power(x, n - 1)); 			// recursive call 1 to power() method
		else
			return ((1 / x) * power(x, n + 1)); 	// recursive call 2 to power() method
	}
}
