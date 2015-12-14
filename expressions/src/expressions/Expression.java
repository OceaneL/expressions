package expressions;

import visitor.Visitor;

public interface Expression {
	public abstract void accept(Visitor visitor);
}
