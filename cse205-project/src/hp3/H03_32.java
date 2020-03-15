package hp3;

public class H03_32 
{
	// x^n = x * x^n-1
	// x^0 = 1
	public static double power(double x, int n)
	{
		if (x == 0)
			// if the number is 0, result is always 0 because x * 0 = 0
			return 0;
		else if (n == 0)
			// if the exponent is 0, result is 1 because x^0 = 1
			return 1;
		else if (n > 0)
			// recursive 1
			return (x * power(x, n - 1));
		else
			// recursive 2
			return ((1 / x) * power(x, n + 1));
	}
}