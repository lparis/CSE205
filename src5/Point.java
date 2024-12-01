// CLASS: 	H03_57
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

package hp3;

import java.lang.Comparable;

public class Point implements Comparable<Point>
{
    // A point in the Cartesian plane is located at (x, y) where x and y form the
    // coordinates of the point.
    private double mX;
    private double mY;

    // Constructor.
    public Point(double pX, double pY) 
    {
        setX(pX);
        setY(pY);
    }
    
    // Accessor method for mX.
    public double getX() 
    {
        return mX;
    }

    // Accessor method for mY.
    public double getY() 
    {
        return mY;
    }

    // Mutator method for mX.
    public void setX(double pX) 
    {
        mX = pX;
    }

    // Mutator method for mY.
    public void setY(double pY) 
    {
        mY = pY;
    }
    
    // Inherited abstract method
	@Override
	public int compareTo(Point o) 
	{
		if(((mX * mX) + (mY * mY)) > ((o.mX * o.mX) + (o.mY * o.mY)))
		{
			//o1 is greater
			return 1;
		}
		else if(((mX * mX) + (mY * mY)) < ((o.mX * o.mX) + (o.mY * o.mY)))
		{
			//o2 is greater
			return -1;
		}
		else
		{
			//both equal
			return 0;
		}
	}
}
