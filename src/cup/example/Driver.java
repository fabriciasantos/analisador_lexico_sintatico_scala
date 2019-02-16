package cup.example;

import java_cup.runtime.*;

class Driver {

	public static void main(String[] args) throws Exception {
		Lexer lexer = new Lexer(System.in);
		//Parser parser = new Parser();
		//parser.parse();
		System.out.println("Iniciou o analisador");		
		Symbol symb = lexer.next_token();
		while (symb.sym != sym.EOF) {
			System.out.println("Simbolo: " + symb.value + " | Lexico: " + sym.terminalNames[symb.sym]);
			symb = lexer.next_token();
		}
	}
	
}