package sintaxeabstract;

import visitor.AbstractVisitor;

public class IntType  extends Type{
	
	private Integer intType = new Integer(0);
		
	public Integer getIntType() {
		return intType;
	}

	@Override
	public Object accept(AbstractVisitor av) {
		this.accept(av);
		return null;
	}
}
