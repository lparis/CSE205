// CLASS: Operator
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

package project4;

/**
 * Operator is the superclass of all binary and unary operators.
 * 
 * Operator is the abstract superclass of all binary and unary operators, 
 * i.e., it is the superclass of BinaryOperator and UnaryOperator. 
 * Implement the class using the UML class diagram as a guide. 
 * Note that all of the non-constructor methods are abstract, 
 * i.e., none of them are implemented in Operator.
 */

public abstract class Operator
{
	public Operator()
	{
		// Constructor
	}
	
	public abstract boolean isBinaryOperator();
	{
		// Abstract method
	}
	
	public abstract int precedence();
	
	public abstract int stackPrecedence();
}
