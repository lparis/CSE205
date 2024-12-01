// CLASS: 	H03_31.java
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

package homework3;

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
