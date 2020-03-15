package hp3;

public class h31 
{
	public static void main(String[] args) 
	{
		int n = 2;
		System.out.println("Number:\t\t" + n);
		System.out.print("Loop:\t\t");
		System.out.println(sum1toN(n));
		System.out.print("Recursion:\t");
		System.out.println(H03_31.sum1toN(n));
	}
	
	public static int sum1toN(int n) 
	{
		int sum = 0;
//		System.out.println(sum);
		for (int i = 1; i <= n; ++i)
		{
//			System.out.println("Iteration: " + i + " | " + "Result: " + i);
			sum += i;
		}
		return sum;
	}
}