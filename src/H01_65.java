// CLASS: 	H01_31
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

public class H01_65 
{
	// Private int instance variable named mX
	private int mX;
	
	// Private int class variable named mY initialized to 0
	private int mY = 0;
	
	// Private int class constant named A that is equivalent to 100 
	private static final int A = 100;
	
	// Public int class constant named B that is equivalent to 200;
	public static final int B = 200;
	
	// Public default constructor that calls H01_65(int) to initialize mX to -1
	public H01_65() 
	{
		this(-1);
	}
	
	// Public constructor that has one int input parameter named pX that calls setX() to initialize mX to pX;
	public H01_65(int pX)
	{
		setX(pX);
	}
	
	// public getter for mX
	public int getX()
	{
		return mX;
	}
	
	// public setter for pX
	public void setX(int pX)
	{
		mX = pX;
	}
	
	// public getter for mY
	public int getY()
	{
		return mY;
	}
	
	// Public setter for pY
	public void setY(int pY)
	{
		mY = pY;
	}

}
