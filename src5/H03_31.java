package hp3;

public class H03_31 
{
	public static int sum1toN(int n)
	{
		if (n > 0)
			return n + sum1toN(n - 1);
		else
			return 0;
	}
}
//	public static int sum1toN(int n)
//	{
//		if(n == 0)
//		{
//			return 0;
//		}
//		return n + sum1toN(n - 1);	
//	}
//}
