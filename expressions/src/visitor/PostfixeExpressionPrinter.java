package visitor;

import expressions.BinaryExpression;

public class PostfixeExpressionPrinter extends ExpressionPrinter {

	@Override
	public void visitorBinaryExpression(BinaryExpression binaryExpression) {
		binaryExpression.getLeftExpression().accept(this);
		String leftDescription = description;
		binaryExpression.getRigthExpression().accept(this);
		String rigthDescription = description;
		description = leftDescription+" "+rigthDescription+binaryExpression.getSymbole();
	}

}
