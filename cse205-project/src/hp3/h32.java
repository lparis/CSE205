package hp3;

import java.util.Scanner;

public class h32 {

	public static void main(String[] args) 
	{
		double x;
		int n;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		x = in.nextDouble();
		System.out.print("Enter an exponent: ");
		n = in.nextInt();
		System.out.println(H03_32.power(x,n));
	}
}
