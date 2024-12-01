package hp3;

public class H03_35 
{
	public static String reverse(String str)
	{
		if (str.isEmpty())
			return " ";
		else
			return reverse(str.substring(1)) + str.charAt(0);
	}
}
