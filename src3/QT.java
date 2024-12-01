package module6;

// Prints first n Fibonacci numbers

public class QT 
{
	static int length = 3;
	
	public static void main(String[] args) 
	{
		fib(length);
	}
	
	public static void fib(int n)
	{
		Queue q = new Queue();
		q.enqueue(0);
		System.out.println("Enque = " + q);
		q.enqueue(1);
		System.out.println("Enque = " + q);
		
		for (int i = 0; i < n; i++) 
		{
			System.out.println("-For Loop-");
			// Remove first number in from the queue and assign to a (a = 0)
			System.out.println("Dque first in and assign to a");
			int a = q.dequeue();
			System.out.println("a = " + a);
			System.out.println("Queue = " + q);
			// Remove second number in from the queue and assign to b (b = 1)
			System.out.println("Dque next in and assign to b");			
			int b = q.dequeue();
			System.out.println("b = " + b);
			System.out.println("Queue = " + q);
			// Add b to the queue; queue = 1
			System.out.println("Add b to Queue");
			q.enqueue(b);
			System.out.println("Queue = " + q);
			// Add a + b to the queue; queue = 1, 2 (1 + 1)
			System.out.println("Add a + b to the Queue");
			q.enqueue(a + b);
			System.out.println("Queue = " + q);
			System.out.println("a = " + a + " ");
		}
	}  
}
