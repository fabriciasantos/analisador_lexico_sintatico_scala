package sintaxeabstract;

import visitor.AbstractVisitor;

public abstract class ParamClause {
	public abstract Object accept(AbstractVisitor av);
}
