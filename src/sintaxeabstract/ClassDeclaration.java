package sintaxeabstract;

import visitor.AbstractVisitor;

public abstract class ClassDeclaration {
	public abstract Object accept(AbstractVisitor av);
}
