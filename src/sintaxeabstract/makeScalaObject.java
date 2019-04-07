package sintaxeabstract;

import visitor.AbstractVisitor;

public class makeScalaObject extends ScalaProgram{

	private ScalaObject scalaObjecto;
	private Predicates predicates;
	
	public makeScalaObject (ScalaObject so, Predicates ps){
		this.predicates = ps;
		this.scalaObjecto = so;
	}
	
	public Predicates getPredicates() {
		return predicates;
	}

	public void setPredicates(Predicates predicates) {
		this.predicates = predicates;
	}

	public void setScalaObjecto(ScalaObject scalaObjecto) {
		this.scalaObjecto = scalaObjecto;
	}

	public ScalaObject getScalaObjecto() {
		return scalaObjecto;
	}

	public void ScalaObject(ScalaObject scalaObjecto) {
		this.scalaObjecto = scalaObjecto;
	}

	@Override
	public Object accept(AbstractVisitor av) {
		this.accept(av);
		return null;
	}

}
