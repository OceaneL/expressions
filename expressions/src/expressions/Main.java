package expressions;

import environnement.Environnement;
import visitor.ExpressionEvaluator;
import visitor.ExpressionPrinter;
import visitor.ExpressionValueDefault;
import visitor.InfixeExpressionPrinter;
import visitor.NormalExpressionEvaluator;
import visitor.PostfixeExpressionPrinter;

public class Main {
	public static void main(String[] args) {
		Variable x = new Variable("X");
		Variable y = new Variable("y");
		Expression e = new Times(new Plus(x, new LitteralValue(5)), new Minus(y, new LitteralValue(3)));
		ExpressionPrinter printer = new InfixeExpressionPrinter();
		System.out.println(printer.print(e));
		ExpressionPrinter printer2 = new PostfixeExpressionPrinter();
		System.out.println(printer2.print(e));
		Environnement env = new Environnement();
		env.setValue(x, 2);
		env.setValue(y, 4);
		ExpressionEvaluator evaluator1 = new ExpressionValueDefault();
		System.out.println(evaluator1.evalue(e, env));
		ExpressionEvaluator evaluator2 = new NormalExpressionEvaluator();
		System.out.println(evaluator2.evalue(e, env));
	}
}
