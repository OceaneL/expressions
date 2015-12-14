package visitor;

import expressions.Variable;

public class ExpressionValueDefault extends ExpressionEvaluator {

	@Override
	public void visitorVariable(Variable var) {
		Integer val = env.getValue(var);
		if (val == null)
			value = 0;
		else value = val;
	}
	
	


}
