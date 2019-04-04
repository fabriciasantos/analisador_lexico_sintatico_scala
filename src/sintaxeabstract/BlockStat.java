package sintaxeabstract;

import visitor.AbstractVisitor;

public abstract class BlockStat {
	public abstract Object accept(AbstractVisitor av);
}
