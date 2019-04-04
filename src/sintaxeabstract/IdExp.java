package sintaxeabstract;

import visitor.AbstractVisitor;

public class IdExp extends Expr{
	
	private String id;
	
	public IdExp(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public Object accept(AbstractVisitor av) {
		// TODO Auto-generated method stub
		return null;
	}

}
