// CLASS: Rectangle (Rectangle.java)

// Represents a Rectangle that can be drawn on a graphical window. */

public class Rectangle 
{
    private int mHeight;
    private int mWidth;
    private int mX;
    private int mY;

    // Default constructor. Initializes all instance variables to 0 by calling the second
    
    public Rectangle() 
    { 
    	this(0, 0, 0, 0);
    }

    // Second constructor
    public Rectangle(int pX, int pY, int pWidth, int pHeight) 
    { 
    	setX(pX);
        setY(pY);
        setWidth(pWidth);
        setHeight(pHeight);
    }
    // Accessor method for the mHeight data member.
    public int getHeight() 
    {
    	return mHeight;
    }
    // Accessor method for the mWidth data member.
    public int getWidth() 
    {
    	return mWidth;
    }
    
    // Accessor method for the mX data member.
    public int getX() 
    {
    	return mX;
    }
       
    // Accessor method for the mY data member.
    public int getY() 
    {
    	return mY;
    }

    // Moves this Rectangle to a new location.
    public void move(int pNewX, int pNewY) 
    { 
    	setX(pNewX);
        setY(pNewY);
    }
        
    // Change the size of this Rectangle.
    public void resize(int pNewWidth, int pNewHeight) 
    { 
    	setWidth(pNewWidth);
        setHeight(pNewHeight);
    }
        // Mutator method for the mHeight data member. */
        public void setHeight(int pNewHeight) 
        { 
        	mHeight = pNewHeight;
        }
        
        // Mutator method for the mWidth data member. */
        public void setWidth(int pNewWidth) 
        { 
        	mWidth = pNewWidth;
        }
        
        // Mutator method for the mX data member.
        public void setX(int pNewX) 
        { 
        	mX = pNewX;
        }
        
        // Mutator method for the mY data member.
        public void setY(int pNewY) 
        { 
        	mY = pNewY;
        } 
 }

       
