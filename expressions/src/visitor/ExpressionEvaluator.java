package visitor;

import environnement.Environnement;
import expressions.BinaryExpression;
import expressions.Expression;
import expressions.LitteralValue;

public abstract class ExpressionEvaluator extends Visitor {
	
	protected Environnement env;
	protected int value;
		
	public int evalue(Expression expression,Environnement env){
		this.env = env;
		expression.accept(this);
		return value;
	}

	@Override
	public void visitorLiteralValue(LitteralValue val) {
		value = val.getValue();
	}

	@Override
	public void visitorBinaryExpression(BinaryExpression binaryExpression) {
		binaryExpression.getLeftExpression().accept(this);
        int leftValue = value;
        binaryExpression.getRigthExpression().accept(this);
        int rightValue = value;
        value = binaryExpression.compute(leftValue, rightValue);
	}
	
}
