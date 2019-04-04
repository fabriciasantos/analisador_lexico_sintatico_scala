package sintaxeabstract;

import visitor.AbstractVisitor;

public abstract class Variable {
	public abstract Object accept(AbstractVisitor av);
}
