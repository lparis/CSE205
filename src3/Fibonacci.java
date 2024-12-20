package module6;

import java.util.Scanner;

public class Fibonacci 
{	
	public static void main(String[] args) 
	{
		int MAX = 48;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of Fibonaccis you want: ");
		int num = in.nextInt();
		if (num > 48)
		{
			System.out.println("The max is 48");
			fib(MAX);
		}
		else
			fib(num);
		in.close();
	}
	
	public static void fib(int n)
	{
		Queue q = new Queue();
		q.enqueue(0);
		q.enqueue(1);
		
		for (int i = 0; i < n; i++) 
		{
			int a = q.dequeue();
			int b = q.dequeue();
			q.enqueue(b);
			q.enqueue(a + b);
			System.out.println(i + 1 + " Fib is \t" + a + " ");
		}
	}  
}
