package expressions;

public class Times extends BinaryExpression {

	public Times(Expression leftExpression, Expression rightExpression) {
		super(leftExpression, rightExpression);
	}

	@Override
	public String getSymbole() {
		return "*";
	}

	@Override
	public int compute(int a, int b) {
		return a*b;
	}

}
