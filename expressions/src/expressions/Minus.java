package expressions;

public class Minus extends BinaryExpression {

	public Minus(Expression leftExpression, Expression rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	public String getSymbole() {
		return "-";
	}

	@Override
	public int compute(int a, int b) {
		return a-b;
	}

}
