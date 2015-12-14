package visitor;


import expressions.BinaryExpression;
import expressions.LitteralValue;
import expressions.Variable;

public abstract class Visitor {

	public abstract void visitorVariable(Variable var);

	public abstract void visitorLiteralValue(LitteralValue val);
	
	public abstract void visitorBinaryExpression(BinaryExpression binaryExpression);
}
