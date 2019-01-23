package cup.example;

import java_cup.runtime.*;

class Driver {

	public static void main(String[] args) throws Exception {
		Lexer lexer = new Lexer(System.in);
		Parser parser = new Parser();
		parser.parse();
	}
	
}