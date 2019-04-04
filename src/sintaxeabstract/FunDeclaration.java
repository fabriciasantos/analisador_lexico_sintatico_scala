package sintaxeabstract;

import visitor.AbstractVisitor;

public abstract class FunDeclaration {
	public abstract Object accept(AbstractVisitor av);
}
