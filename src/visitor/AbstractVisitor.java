package visitor;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.BooleanType;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.IntType;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringType;

import sintaxeabstract.ConjuntDeclaration;
import sintaxeabstract.DeclarationList;
import sintaxeabstract.IdExp;
import sintaxeabstract.makeObjectScalaTwo;
import sintaxeabstract.makeScalaObject;

public abstract class AbstractVisitor {
	public abstract Object visit(BooleanType bType);
	public abstract Object visit(DeclarationList dsList);
	public abstract Object visit(IdExp idExp);
	public abstract Object visit(IntType intType);
	public abstract Object visit(makeObjectScalaTwo makeObject);
	public abstract Object visit(makeScalaObject makeScala);
	public abstract Object visit(StringType stringType);
	public abstract Object visit (ConjuntDeclaration conjutVariable);
}
