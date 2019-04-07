package sintaxeabstract;

import visitor.AbstractVisitor;

public class makeObjectScalaTwo extends ScalaObject{

	private IdExp idExp;
	private Declarations declarations;
	
	
	public makeObjectScalaTwo(IdExp idExp, Declarations declarations) {
		this.idExp = idExp;
		this.declarations = declarations;
	}


	public IdExp getIdExp() {
		return idExp;
	}

	public void setIdExp(IdExp idExp) {
		this.idExp = idExp;
	}



	public Declarations getDeclarations() {
		return declarations;
	}



	public void setDeclarations(Declarations declarations) {
		this.declarations = declarations;
	}

	@Override
	public Object accept(AbstractVisitor av) {
		// TODO Auto-generated method stub
		this.accept(av);
		return null;
	}
	

}
