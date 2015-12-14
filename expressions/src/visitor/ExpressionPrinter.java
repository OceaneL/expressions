package visitor;
import expressions.*;

public abstract class ExpressionPrinter extends Visitor {

	protected String description;

	public String print(Expression expression) {
		expression.accept(this);
		return description;
	}

	@Override
	public void visitorVariable(Variable var) {
		description = var.getName();
	}
	
	@Override
	public void visitorLiteralValue(LitteralValue val) {
		description = val.getValue()+"";
	}
	
	@Override
	public abstract void visitorBinaryExpression(BinaryExpression binaryExpression);
	
}
