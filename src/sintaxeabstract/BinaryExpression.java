package sintaxeabstract;

import visitor.AbstractVisitor;

public abstract class BinaryExpression {
	public abstract Object accept(AbstractVisitor av);
}
