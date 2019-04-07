package sintaxeabstract;

import visitor.AbstractVisitor;

public abstract class Type {
	public abstract Object accept(AbstractVisitor av);
}
