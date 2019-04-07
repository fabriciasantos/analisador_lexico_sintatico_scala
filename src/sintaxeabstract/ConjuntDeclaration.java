package sintaxeabstract;

import visitor.AbstractVisitor;

public class ConjuntDeclaration extends Declaration{

	private Variable variable;
	private Type type;
	private ActorStats actorStats;
	
	
	public ConjuntDeclaration(Variable variable, Type type, ActorStats actorStats) {
		super();
		this.variable = variable;
		this.type = type;
		this.actorStats = actorStats;
	}

	public Variable getVariable() {
		return variable;
	}

	public void setVariable(Variable variable) {
		this.variable = variable;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public ActorStats getActorStats() {
		return actorStats;
	}

	public void setActorStats(ActorStats actorStats) {
		this.actorStats = actorStats;
	}

	@Override
	public Object accept(AbstractVisitor av) {
		// TODO Auto-generated method stub
		this.accept(av);
		return null;
	}
}
