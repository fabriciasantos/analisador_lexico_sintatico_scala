package sintaxeabstract;

import visitor.AbstractVisitor;

public abstract class ScalaObject {
	public abstract Object accept(AbstractVisitor av);
}
