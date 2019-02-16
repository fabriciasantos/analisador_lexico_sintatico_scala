package cup.example;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;

%%

%class Lexer
%implements sym
%public
%unicode
%line
%column
%cup
%char


%{
	

    public Lexer(ComplexSymbolFactory sf, java.io.InputStream is){
		this(is);
        symbolFactory = sf;
    }
	public Lexer(ComplexSymbolFactory sf, java.io.Reader reader){
		this(reader);
        symbolFactory = sf;
    }
    
    private StringBuffer sb;
    private ComplexSymbolFactory symbolFactory = new ComplexSymbolFactory();
    private int csline,cscolumn;

    public Symbol symbol(String name, int code){
		return symbolFactory.newSymbol(name, code,
						new Location(yyline+1,yycolumn+1, yychar), // -yylength()
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength())
				);
    }
    public Symbol symbol(String name, int code, String lexem){
	return symbolFactory.newSymbol(name, code, 
						new Location(yyline+1, yycolumn +1, yychar), 
						new Location(yyline+1,yycolumn+yylength(), yychar+yylength()), lexem);
    }
    
    protected void emit_warning(String message){
    	System.out.println("scanner warning: " + message + " at : 2 "+ 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
    
    protected void emit_error(String message){
    	System.out.println("scanner error: " + message + " at : 2" + 
    			(yyline+1) + " " + (yycolumn+1) + " " + yychar);
    }
%}

Newline    = \r | \n | \r\n
Whitespace = [ \t\f] | {Newline}
InputCharacter = [^\r\n]

Sign           = "+" | "-"
IntLiteral     = (0 | [1-9][0-9]*)
/*IntLiteral     = {Sign}? (0 | [1-9][0-9]*)*/
Identifier     = [a-zA-Z][a-zA-Z0-9_']* 




/* comments */
Comment = {TraditionalComment} | {EndOfLineComment}

TraditionalComment = "/*" [^*:] ~"*/" | "/*" "*"+ "/"
EndOfLineComment = "//" {InputCharacter}* {Newline}


/* ident = ([:jletter:] | "_" ) ([:jletterdigit:] | [:jletter:] | "_" )* */


%eofval{
    return symbolFactory.newSymbol("EOF",sym.EOF);
%eofval}

%state CODESEG

%%  

<YYINITIAL> {

  {Whitespace} 	{                              }
  {Comment}	   	{  }
  ";"          	{ return symbolFactory.newSymbol("SEMI", SEMI); }
  "+"          	{ return symbolFactory.newSymbol("PLUS", PLUS); }
  "-"          	{ return symbolFactory.newSymbol("MINUS", MINUS); }
  "*"          	{ return symbolFactory.newSymbol("TIMES", TIMES); }
  "n"          	{ return symbolFactory.newSymbol("UMINUS", UMINUS); }
  "("          	{ return symbolFactory.newSymbol("LPAREN", LPAREN); }
  ")"          	{ return symbolFactory.newSymbol("RPAREN", RPAREN); }
  "&&"         	{ return symbolFactory.newSymbol("AND", AND); } 
  "||"          { return symbolFactory.newSymbol("OR", AND); } 
  "!"           { return symbolFactory.newSymbol("NOT", NOT); }
  "--"         	{ return symbolFactory.newSymbol("MINUSMINUS", MINUSMINUS); }
  "_"          	{ return symbolFactory.newSymbol("UNDERLINE", UNDERLINE); }
  "/"          	{ return symbolFactory.newSymbol("DIV", DIV); }
  "/*:"			{ return symbolFactory.newSymbol("LANNOT", LANNOT); }	
  "*/"			{ return symbolFactory.newSymbol("RANNOT", RANNOT); }
  "%"           { return symbolFactory.newSymbol("MOD", MOD); }
  "$"           { return symbolFactory.newSymbol("DOLLAR", DOLLAR); }
  "@"           { return symbolFactory.newSymbol("ATSIGN", ATSIGN); }  
  "<="          { return symbolFactory.newSymbol("LEQ", LEQ); }
  "=>"          { return symbolFactory.newSymbol("DOUBLEARROW", DOUBLEARROW); }  
  "<"           { return symbolFactory.newSymbol("LT", LT); }
  ">="          { return symbolFactory.newSymbol("GEQ", GEQ); }
  ">"           { return symbolFactory.newSymbol("GT", GT); }
  "="           { return symbolFactory.newSymbol("EQ", EQ); }
  "!="          { return symbolFactory.newSymbol("NEQ", NEQ); }
  "=="          { return symbolFactory.newSymbol("EQEQ", EQEQ); }
  "==="         { return symbolFactory.newSymbol("EQEQEQ", EQEQEQ); }  
  ":="          { return symbolFactory.newSymbol("COLEQ", COLEQ); } 
  "."           { return symbolFactory.newSymbol("DOT", DOT); }
  ","           { return symbolFactory.newSymbol("COMMA", COMMA); }
  ":"           { return symbolFactory.newSymbol("COLON", COLON); }
  "{"           { return symbolFactory.newSymbol("LCURLYBRACKET", LCURLYBRACKET); }
  "}"           { return symbolFactory.newSymbol("RCURLYBRACKET", RCURLYBRACKET); }
  "["           { return symbolFactory.newSymbol("LSQUAREBRACKET", LSQUAREBRACKET); }
  "]"           { return symbolFactory.newSymbol("RSQUAREBRACKET", RSQUAREBRACKET); } 
  "if"          { return symbolFactory.newSymbol("IF", IF); }
  "else"        { return symbolFactory.newSymbol("ELSE", ELSE); }
  "while"       { return symbolFactory.newSymbol("WHILE", WHILE); }
  "do"          { return symbolFactory.newSymbol("DO", DO); }
  "true"        { return symbolFactory.newSymbol("TRUE", TRUE); }
  "false"       { return symbolFactory.newSymbol("FALSE", FALSE); }
  "null"        { return symbolFactory.newSymbol("NULL", NULL); }
  "Int"         { return symbolFactory.newSymbol("INT", INT); }
  "Boolean"     { return symbolFactory.newSymbol("BOOLEAN", BOOLEAN); }  
  "String"      { return symbolFactory.newSymbol("STRING", STRING); }  
  "new"         { return symbolFactory.newSymbol("NEW", NEW); }
  "var"         { return symbolFactory.newSymbol("VAR", VAR); }
  "val"         { return symbolFactory.newSymbol("VAL", VAL); }
  "def"         { return symbolFactory.newSymbol("DEF", DEF); }
  "case"        { return symbolFactory.newSymbol("CASE", CASE); }
  "import"      { return symbolFactory.newSymbol("IMPORT", IMPORT); }
  "class"		{ return symbolFactory.newSymbol("CLASS", CLASS); }
  "object"		{ return symbolFactory.newSymbol("OBJECT", OBJECT); }
  "extends"		{ return symbolFactory.newSymbol("EXTENDS", EXTENDS); }  
  "until"	    { return symbolFactory.newSymbol("UNTIL", UNTIL); } 
  "loop"  		{ return symbolFactory.newSymbol("LOOP", LOOP); }  
  "array"		{ return symbolFactory.newSymbol("ARRAY", ARRAY); }
  "Unit"        { return symbolFactory.newSymbol("UNIT", UNIT); }
  "Set"         { return symbolFactory.newSymbol("SET", SET); }
  
  {IntLiteral}  { return symbolFactory.newSymbol("NUMBER", NUMBER, Integer.parseInt(yytext())); }
  {Identifier}  { return symbolFactory.newSymbol("ID", ID, new String(yytext())); } 
    
}

// error fallback
.|\n          { emit_warning("Unrecognized character '" +yytext()+"' -- ignored"); }
