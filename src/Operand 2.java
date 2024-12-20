// CLASS: Operand
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

package project4;

/**
 * An operand is a numeric value represented as a Double.
 */

public class Operand
{
	private Double mValue;
	
	public Operand(Double pValue)
	{
		// Constructor
	}
	
	public Double getValue()
	{
		return mValue;
	}
	
	public void setValue(Double pValue)
	{
		pValue = mValue;
	}
}