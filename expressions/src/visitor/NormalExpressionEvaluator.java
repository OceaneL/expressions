package visitor;

import expressions.Variable;

public class NormalExpressionEvaluator extends ExpressionEvaluator {

	@Override
	public void visitorVariable(Variable var) {
		value = env.getValue(var);
	}


}
