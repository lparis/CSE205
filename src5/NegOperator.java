// CLASS: 	NegOperator
// AUTHOR:	Lorenzo Paris, lbparis, lbparis@asu.edu

/*
 * Implements the negation operator, which is a unary operator. 
 * Complete the code in this file by using the AddOperator class as an example. 
 * Note, however, that negation is a unary operator so it only has one operand.
 */
package project4;

/**
 * Represents the negation operator which is a specific type of unary operator.
 */
public class NegOperator extends UnaryOperator 
{

    public NegOperator() 
    {
    	// Empty constructor
    }
    
    /**
     * Called to evaluate the operator.
     */
    public Operand evaluate(Operand pOperand) 
    {
		return null;
	}

    /**
     * Returns the normal precedence level of this operator.
     */
    @Override
	public int precedence() 
	{
		return 0;
	}

    /**
     * Returns the precedence level of this operator when on it is on the operator stack.
     */
    @Override
	public int stackPrecedence() 
	{
		return 0;
	}
}