package sintaxeabstract;

import visitor.AbstractVisitor;

public abstract class Expr {
	public abstract Object accept(AbstractVisitor av);
}
