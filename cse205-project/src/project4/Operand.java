// CLASS: Operand
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

package project4;

/**
 * An operand is a numeric value represented as a Double.
 * Implement the class using the UML class diagram as a guide.
 */

public class Operand
{
	private Double mValue;
	
	public Operand(Double pValue)
	{
		// Constructor
	}
	
	// Accessor method
	public Double getValue()
	{
		return mValue;
	}
	
	// Mutator method
	public void setValue(Double pValue)
	{
		pValue = mValue;
	}
}