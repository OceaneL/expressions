package expressions;

import visitor.Visitor;

public abstract class BinaryExpression implements Expression {
	Expression leftExpression;
	Expression rightExpression;

	public Expression getLeftExpression() {
		return leftExpression;
	}

	public Expression getRigthExpression() {
		return rightExpression;
	}

	public BinaryExpression(Expression leftExpression, Expression rightExpression) {
		super();
		this.leftExpression = leftExpression;
		this.rightExpression = rightExpression;
	}

	@Override
	public void accept(Visitor visitor)  {
		visitor.visitorBinaryExpression(this);
	}

	public abstract String getSymbole();
	public abstract int compute(int a, int b);
	
}
