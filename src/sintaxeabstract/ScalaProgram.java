package sintaxeabstract;

import visitor.AbstractVisitor;

public abstract class ScalaProgram {
	public abstract Object accept(AbstractVisitor av);
}
