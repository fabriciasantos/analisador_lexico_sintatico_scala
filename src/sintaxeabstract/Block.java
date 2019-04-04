package sintaxeabstract;

import visitor.AbstractVisitor;

public abstract class Block {
	public abstract Object accept(AbstractVisitor av);
}
