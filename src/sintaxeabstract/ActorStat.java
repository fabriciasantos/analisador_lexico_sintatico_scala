package sintaxeabstract;

import visitor.AbstractVisitor;

public abstract class ActorStat {
	public abstract Object accept(AbstractVisitor av);

}
