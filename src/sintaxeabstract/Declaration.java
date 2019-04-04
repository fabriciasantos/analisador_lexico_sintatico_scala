package sintaxeabstract;

import visitor.AbstractVisitor;

public abstract class Declaration {
	public abstract Object accept(AbstractVisitor av);

}
