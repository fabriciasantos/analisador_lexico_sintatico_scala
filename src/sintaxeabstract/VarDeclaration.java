package sintaxeabstract;

import visitor.AbstractVisitor;

public abstract class VarDeclaration {
	public abstract Object accept(AbstractVisitor av);
}
