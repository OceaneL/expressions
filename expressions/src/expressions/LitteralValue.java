package expressions;

import visitor.Visitor;

public class LitteralValue implements AtomicExpression {
	protected int value;

	public int getValue() {
		return value;
	}

	public LitteralValue(int value) {
		super();
		this.value = value;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visitorLiteralValue(this);
	}	

}
