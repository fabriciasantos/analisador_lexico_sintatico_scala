package sintaxeabstract;

import visitor.AbstractVisitor;

public class makeScalaObject extends ScalaProgram{
	
	private Predicates predicates;
	private ScalaObject scalaObject;
	private Declaration declaration;
	private IdExp id;	
	
	public makeScalaObject(Predicates predicates, ScalaObject scalaObject) {
		this.predicates = predicates;
		this.scalaObject = scalaObject;
	}
	
	public makeScalaObject(IdExp id, Declaration declaration) {
		this.id = id;
		this.declaration = declaration;
	}
	
	public Predicates getPredicates() {
		return predicates;
	}


	public void setPredicates(Predicates predicates) {
		this.predicates = predicates;
	}


	public ScalaObject getScalaObject() {
		return scalaObject;
	}


	public void setScalaObject(ScalaObject scalaObject) {
		this.scalaObject = scalaObject;
	}


	@Override
	public Object accept(AbstractVisitor av) {
		// TODO Auto-generated method stub		
		return null;
	}

}
