package sintaxeabstract;

import visitor.AbstractVisitor;

public class StringType extends Type{

	private String stringType = new String();
	
	public String getStringType() {
		return stringType;
	}

	@Override
	public Object accept(AbstractVisitor av) {
		// TODO Auto-generated method stub
		this.accept(av);
		return null;
	}

}
