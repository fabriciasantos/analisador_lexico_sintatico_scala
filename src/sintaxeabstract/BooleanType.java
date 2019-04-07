package sintaxeabstract;

import visitor.AbstractVisitor;

public class BooleanType extends Type{
	
	private Boolean BoolType = new Boolean(null);

	
	public boolean getBoolType() {
		return BoolType;
	}

	@Override
	public Object accept(AbstractVisitor av) {
		// TODO Auto-generated method stub
		this.accept(av);
		return null;
	}
	
	
}
