package sintaxeabstract;

import java.util.ArrayList;
import java.util.List;

import visitor.AbstractVisitor;

public class DeclarationList extends Declaration {

	private Declaration declaration;
	private List<Declaration> list = new ArrayList();

	public DeclarationList(Declaration d) {
		this.declaration = d;
	}

	public List<Declaration> getDeclaration() {
		return list;
		
	}

	public void setDeclaration(Declaration d) {
		list.add(d);
	}
		

	@Override
	public Object accept(AbstractVisitor av) {
		this.accept(av);
		return null;
	}

}
