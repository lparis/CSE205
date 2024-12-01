package hp3;

public class H03_61_Test 
{
	public static void main(String[] args) 
	{
		Point p1=new Point(1,0);
		Point p2=new Point(0,1);
		Point p3=new Point(2,0);
		int res=p1.compareTo(p2);
		
		if(res==0)
		{
			System.out.println("P1 and P2 are equal from origin");
		}
		
		if(p3.compareTo(p2)==1)
		{
			System.out.println("P3 is larger");
		}
	}
}
