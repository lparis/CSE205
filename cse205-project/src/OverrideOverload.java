
public class OverrideOverload {

	public static void main(String[] args) 
	{
		OverrideOverload test = new OverrideOverload(); 
	}
	
	public class Super 
	{
		public void aMethod(int pX, int pY) 
		{
			System.out.println("Super.aMethod(int, int)");
		}
	}
	
	public class Sub extends Super 
	{
		public void aMethod(int pX, double pY) 
		{ 
			System.out.println("Sub.aMethod(int, double"); 
		}
	}
	
	public class OverideOverload 
	{
		Super sup = new Super();
		Sub sub = new Sub();
		//sub.aMethod(10, 20);
	}
}
