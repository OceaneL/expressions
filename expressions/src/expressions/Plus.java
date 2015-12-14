package expressions;

public class Plus extends BinaryExpression {

	public Plus(Expression leftExpression, Expression rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	public String getSymbole() {
		return "+";
	}

	@Override
	public int compute(int a, int b) {
		return a+b;
	}

}
