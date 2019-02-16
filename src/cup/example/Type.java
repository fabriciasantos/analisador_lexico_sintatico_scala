package cup.example;

public abstract class Type {
	public class UnitType extends Type;
	public class IntegerType extends Type;
	public class BooleanType extends Type;
	public class StringType extends Type;
	public class SetType extends Type;
	public class ClassType(String id) extends Type;
}

