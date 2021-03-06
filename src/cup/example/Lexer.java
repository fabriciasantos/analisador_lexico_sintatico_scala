/* The following code was generated by JFlex 1.3.5 on 25/02/19 19:33 */

package cup.example;
import java_cup.runtime.ComplexSymbolFactory;
import java_cup.runtime.ComplexSymbolFactory.Location;
import java_cup.runtime.Symbol;
import java.lang.*;
import java.io.InputStreamReader;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.3.5
 * on 25/02/19 19:33 from the specification file
 * <tt>file:/E:/analisador_lexico_sintatico_scala/lexer.jflex</tt>
 */
public class Lexer implements sym, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  final public static int YYEOF = -1;

  /** initial size of the lookahead buffer */
  final private static int YY_BUFFERSIZE = 16384;

  /** lexical states */
  final public static int CODESEG = 1;
  final public static int YYINITIAL = 0;

  /** 
   * Translates characters to character classes
   */
  final private static String yycmap_packed = 
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\23\2\0"+
    "\1\26\1\25\1\21\1\11\1\17\1\20\1\13\1\4\1\34\1\5"+
    "\1\33\1\12\1\6\11\7\1\14\1\15\1\30\1\31\1\32\1\0"+
    "\1\27\1\10\1\57\6\10\1\56\11\10\1\60\1\10\1\72\5\10"+
    "\1\37\1\0\1\40\1\0\1\24\1\0\1\55\1\66\1\63\1\50"+
    "\1\43\1\42\1\61\1\47\1\41\1\67\1\10\1\44\1\64\1\16"+
    "\1\51\1\65\1\10\1\53\1\45\1\52\1\54\1\62\1\46\1\70"+
    "\1\71\1\10\1\35\1\22\1\36\uff82\0";

  /** 
   * Translates characters to character classes
   */
  final private static char [] yycmap = yy_unpack_cmap(yycmap_packed);

  /** 
   * Translates a state to a row index in the transition table
   */
  final private static int yy_rowMap [] = { 
        0,    59,   118,   177,   118,   118,   236,   118,   295,   354, 
      413,   472,   531,   118,   590,   118,   118,   649,   708,   767, 
      118,   118,   118,   118,   826,   885,   944,   118,   118,   118, 
      118,   118,   118,  1003,  1062,  1121,  1180,  1239,  1298,  1357, 
     1416,  1475,  1534,  1593,  1652,  1711,  1770,  1829,  1888,   118, 
     1947,  2006,   118,   118,  2065,  2124,   118,   118,   118,   118, 
     2183,   118,   118,   354,  2242,  2301,  2360,  2419,  2478,  2537, 
     2596,   354,  2655,  2714,  2773,  2832,  2891,  2950,  3009,  3068, 
     3127,  3186,  3245,  3304,  3363,  3422,  3481,  3540,  3599,   118, 
      354,  3658,   118,  3717,  3776,  3835,  3894,  3953,  4012,   354, 
     4071,  4130,  4189,  4248,   354,  4307,  4366,   354,  4425,   354, 
     4484,   354,   354,  4543,  4602,  4661,  4720,   354,  4779,  4838, 
     4897,   354,  4956,  5015,  5074,   354,  5133,  5192,  5251,  5310, 
     5369,  5428,  5487,   354,   354,  5546,   354,  5605,  5664,   354, 
     5723,   354,   354,   354,   354,  5782,  5841,   354,   354,  5900, 
     5959,   354,  6018,   354,  6077,   354,   354,   354
  };

  /** 
   * The packed transition table of the DFA (part 0)
   */
  final private static String yy_packed0 = 
    "\1\3\1\4\2\5\1\6\1\7\1\10\1\11\1\12"+
    "\1\3\1\13\1\14\1\15\1\16\1\17\1\20\1\21"+
    "\1\22\1\23\1\24\1\25\1\26\1\27\1\30\1\31"+
    "\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41"+
    "\1\42\1\43\1\44\2\12\1\45\1\12\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\12"+
    "\1\57\1\60\6\12\1\61\73\3\75\0\1\5\75\0"+
    "\1\62\73\0\2\11\71\0\4\12\4\0\1\12\5\0"+
    "\1\12\14\0\32\12\12\0\1\63\1\64\71\0\1\65"+
    "\111\0\1\66\47\0\4\12\4\0\1\12\5\0\1\12"+
    "\14\0\2\12\1\67\10\12\1\70\16\12\21\0\1\71"+
    "\73\0\1\72\101\0\1\73\72\0\1\74\72\0\1\75"+
    "\1\76\71\0\1\77\47\0\4\12\4\0\1\12\5\0"+
    "\1\12\14\0\1\12\1\100\21\12\1\101\6\12\6\0"+
    "\4\12\4\0\1\12\5\0\1\12\14\0\14\12\1\102"+
    "\15\12\6\0\4\12\4\0\1\103\5\0\1\12\14\0"+
    "\3\12\1\104\23\12\1\105\2\12\6\0\4\12\4\0"+
    "\1\12\5\0\1\12\14\0\6\12\1\106\23\12\6\0"+
    "\4\12\4\0\1\12\5\0\1\12\14\0\2\12\1\107"+
    "\5\12\1\110\21\12\6\0\4\12\4\0\1\12\5\0"+
    "\1\12\14\0\25\12\1\111\4\12\6\0\4\12\4\0"+
    "\1\12\5\0\1\12\14\0\12\12\1\112\17\12\6\0"+
    "\4\12\4\0\1\12\5\0\1\12\14\0\2\12\1\113"+
    "\27\12\6\0\4\12\4\0\1\114\5\0\1\12\14\0"+
    "\32\12\6\0\4\12\4\0\1\12\5\0\1\12\14\0"+
    "\3\12\1\115\6\12\1\116\7\12\1\117\7\12\6\0"+
    "\4\12\4\0\1\120\5\0\1\12\14\0\32\12\6\0"+
    "\4\12\4\0\1\12\5\0\1\12\14\0\10\12\1\121"+
    "\21\12\6\0\4\12\4\0\1\12\5\0\1\12\14\0"+
    "\2\12\1\122\6\12\1\123\20\12\6\0\4\12\4\0"+
    "\1\12\5\0\1\12\14\0\14\12\1\124\15\12\6\0"+
    "\4\12\4\0\1\12\5\0\1\12\14\0\3\12\1\125"+
    "\10\12\1\126\15\12\6\0\4\12\4\0\1\127\5\0"+
    "\1\12\14\0\32\12\1\63\1\4\1\5\70\63\13\130"+
    "\1\131\1\132\56\130\6\0\4\12\4\0\1\12\5\0"+
    "\1\12\14\0\5\12\1\133\24\12\6\0\4\12\4\0"+
    "\1\12\5\0\1\12\14\0\3\12\1\134\26\12\31\0"+
    "\1\135\47\0\4\12\4\0\1\12\5\0\1\12\14\0"+
    "\24\12\1\136\5\12\6\0\4\12\4\0\1\12\5\0"+
    "\1\12\14\0\3\12\1\137\26\12\6\0\4\12\4\0"+
    "\1\12\5\0\1\12\14\0\4\12\1\140\25\12\6\0"+
    "\4\12\4\0\1\12\5\0\1\12\14\0\4\12\1\141"+
    "\25\12\6\0\4\12\4\0\1\12\5\0\1\12\14\0"+
    "\11\12\1\142\20\12\6\0\4\12\4\0\1\12\5\0"+
    "\1\12\14\0\1\143\31\12\6\0\4\12\4\0\1\12"+
    "\5\0\1\12\14\0\1\12\1\144\30\12\6\0\4\12"+
    "\4\0\1\12\5\0\1\12\14\0\26\12\1\145\3\12"+
    "\6\0\4\12\4\0\1\12\5\0\1\12\14\0\13\12"+
    "\1\146\16\12\6\0\4\12\4\0\1\12\5\0\1\12"+
    "\14\0\14\12\1\147\15\12\6\0\4\12\4\0\1\12"+
    "\5\0\1\12\14\0\11\12\1\150\20\12\6\0\4\12"+
    "\4\0\1\12\5\0\1\12\14\0\3\12\1\151\26\12"+
    "\6\0\4\12\4\0\1\12\5\0\1\12\14\0\12\12"+
    "\1\152\17\12\6\0\4\12\4\0\1\12\5\0\1\12"+
    "\14\0\11\12\1\153\20\12\6\0\4\12\4\0\1\12"+
    "\5\0\1\12\14\0\11\12\1\154\20\12\6\0\4\12"+
    "\4\0\1\12\5\0\1\12\14\0\10\12\1\155\21\12"+
    "\6\0\4\12\4\0\1\12\5\0\1\12\14\0\11\12"+
    "\1\156\20\12\6\0\4\12\4\0\1\12\5\0\1\12"+
    "\14\0\12\12\1\157\17\12\6\0\4\12\4\0\1\12"+
    "\5\0\1\12\14\0\3\12\1\160\6\12\1\161\17\12"+
    "\6\0\4\12\4\0\1\12\5\0\1\12\14\0\14\12"+
    "\1\162\15\12\6\0\4\12\4\0\1\12\5\0\1\12"+
    "\14\0\4\12\1\163\25\12\6\0\4\12\4\0\1\12"+
    "\5\0\1\12\14\0\1\164\31\12\13\130\1\165\57\130"+
    "\12\0\1\5\1\131\65\0\4\12\4\0\1\12\5\0"+
    "\1\12\14\0\3\12\1\166\26\12\6\0\4\12\4\0"+
    "\1\12\5\0\1\12\14\0\10\12\1\167\21\12\6\0"+
    "\4\12\4\0\1\12\5\0\1\12\14\0\4\12\1\170"+
    "\25\12\6\0\4\12\4\0\1\12\5\0\1\12\14\0"+
    "\13\12\1\171\16\12\6\0\4\12\4\0\1\12\5\0"+
    "\1\12\14\0\2\12\1\172\27\12\6\0\4\12\4\0"+
    "\1\12\5\0\1\12\14\0\2\12\1\173\27\12\6\0"+
    "\4\12\4\0\1\12\5\0\1\12\14\0\3\12\1\174"+
    "\26\12\6\0\4\12\4\0\1\12\5\0\1\12\14\0"+
    "\2\12\1\175\27\12\6\0\4\12\4\0\1\12\5\0"+
    "\1\12\14\0\2\12\1\176\27\12\6\0\4\12\4\0"+
    "\1\12\5\0\1\12\14\0\22\12\1\177\7\12\6\0"+
    "\4\12\4\0\1\12\5\0\1\12\14\0\1\200\31\12"+
    "\6\0\4\12\4\0\1\12\5\0\1\12\14\0\14\12"+
    "\1\201\15\12\6\0\4\12\4\0\1\12\5\0\1\12"+
    "\14\0\10\12\1\202\21\12\6\0\4\12\4\0\1\12"+
    "\5\0\1\12\14\0\3\12\1\203\26\12\6\0\4\12"+
    "\4\0\1\12\5\0\1\12\14\0\1\204\31\12\6\0"+
    "\4\12\4\0\1\12\5\0\1\12\14\0\4\12\1\205"+
    "\25\12\6\0\4\12\4\0\1\12\5\0\1\12\14\0"+
    "\2\12\1\206\27\12\6\0\4\12\4\0\1\12\5\0"+
    "\1\12\14\0\11\12\1\207\20\12\12\130\1\5\1\165"+
    "\57\130\6\0\4\12\4\0\1\12\5\0\1\12\14\0"+
    "\12\12\1\210\17\12\6\0\4\12\4\0\1\12\5\0"+
    "\1\12\14\0\2\12\1\211\27\12\6\0\4\12\4\0"+
    "\1\12\5\0\1\12\14\0\12\12\1\212\17\12\6\0"+
    "\4\12\4\0\1\213\5\0\1\12\14\0\32\12\6\0"+
    "\4\12\4\0\1\12\5\0\1\12\14\0\2\12\1\214"+
    "\27\12\6\0\4\12\4\0\1\12\5\0\1\12\14\0"+
    "\22\12\1\215\7\12\6\0\4\12\4\0\1\12\5\0"+
    "\1\12\14\0\11\12\1\216\20\12\6\0\4\12\4\0"+
    "\1\12\5\0\1\12\14\0\3\12\1\217\26\12\6\0"+
    "\4\12\4\0\1\12\5\0\1\12\14\0\30\12\1\220"+
    "\1\12\6\0\4\12\4\0\1\12\5\0\1\12\14\0"+
    "\12\12\1\221\17\12\6\0\4\12\4\0\1\12\5\0"+
    "\1\12\14\0\2\12\1\222\27\12\6\0\4\12\4\0"+
    "\1\223\5\0\1\12\14\0\32\12\6\0\4\12\4\0"+
    "\1\12\5\0\1\12\14\0\4\12\1\224\25\12\6\0"+
    "\4\12\4\0\1\12\5\0\1\12\14\0\11\12\1\225"+
    "\20\12\6\0\4\12\4\0\1\12\5\0\1\12\14\0"+
    "\1\226\31\12\6\0\4\12\4\0\1\12\5\0\1\12"+
    "\14\0\7\12\1\227\22\12\6\0\4\12\4\0\1\12"+
    "\5\0\1\12\14\0\11\12\1\230\20\12\6\0\4\12"+
    "\4\0\1\12\5\0\1\12\14\0\14\12\1\231\15\12"+
    "\6\0\4\12\4\0\1\12\5\0\1\12\14\0\20\12"+
    "\1\232\11\12\6\0\4\12\4\0\1\233\5\0\1\12"+
    "\14\0\32\12\6\0\4\12\4\0\1\12\5\0\1\12"+
    "\14\0\4\12\1\234\25\12\6\0\4\12\4\0\1\235"+
    "\5\0\1\12\14\0\32\12\6\0\4\12\4\0\1\12"+
    "\5\0\1\12\14\0\20\12\1\236\11\12";

  /** 
   * The transition table of the DFA
   */
  final private static int yytrans [] = yy_unpack();


  /* error codes */
  final private static int YY_UNKNOWN_ERROR = 0;
  final private static int YY_ILLEGAL_STATE = 1;
  final private static int YY_NO_MATCH = 2;
  final private static int YY_PUSHBACK_2BIG = 3;

  /* error messages for the codes above */
  final private static String YY_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Internal error: unknown state",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * YY_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private final static byte YY_ATTRIBUTE[] = {
     0,  0,  9,  1,  9,  9,  1,  9,  1,  1,  1,  1,  1,  9,  1,  9, 
     9,  1,  1,  1,  9,  9,  9,  9,  1,  1,  1,  9,  9,  9,  9,  9, 
     9,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  9,  0,  0,  9,  9,  1,  1,  9,  9,  9,  9,  1,  9,  9,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  0,  0,  9,  1,  1,  9,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  0,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1, 
     1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1,  1
  };

  /** the input device */
  private java.io.Reader yy_reader;

  /** the current state of the DFA */
  private int yy_state;

  /** the current lexical state */
  private int yy_lexical_state = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char yy_buffer[] = new char[YY_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int yy_markedPos;

  /** the textposition at the last state to be included in yytext */
  private int yy_pushbackPos;

  /** the current text position in the buffer */
  private int yy_currentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int yy_startRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int yy_endRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn; 

  /** 
   * yy_atBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean yy_atBOL = true;

  /** yy_atEOF == true <=> the scanner is at the EOF */
  private boolean yy_atEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean yy_eof_done;

  /* user code: */
	

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


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.yy_reader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the split, compressed DFA transition table.
   *
   * @return the unpacked transition table
   */
  private static int [] yy_unpack() {
    int [] trans = new int[6136];
    int offset = 0;
    offset = yy_unpack(yy_packed0, offset, trans);
    return trans;
  }

  /** 
   * Unpacks the compressed DFA transition table.
   *
   * @param packed   the packed transition table
   * @return         the index of the last entry
   */
  private static int yy_unpack(String packed, int offset, int [] trans) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do trans[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] yy_unpack_cmap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 152) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   IOException  if any I/O-Error occurs
   */
  private boolean yy_refill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (yy_startRead > 0) {
      System.arraycopy(yy_buffer, yy_startRead, 
                       yy_buffer, 0, 
                       yy_endRead-yy_startRead);

      /* translate stored positions */
      yy_endRead-= yy_startRead;
      yy_currentPos-= yy_startRead;
      yy_markedPos-= yy_startRead;
      yy_pushbackPos-= yy_startRead;
      yy_startRead = 0;
    }

    /* is the buffer big enough? */
    if (yy_currentPos >= yy_buffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[yy_currentPos*2];
      System.arraycopy(yy_buffer, 0, newBuffer, 0, yy_buffer.length);
      yy_buffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = yy_reader.read(yy_buffer, yy_endRead, 
                                            yy_buffer.length-yy_endRead);

    if (numRead < 0) {
      return true;
    }
    else {
      yy_endRead+= numRead;  
      return false;
    }
  }


  /**
   * Closes the input stream.
   */
  final public void yyclose() throws java.io.IOException {
    yy_atEOF = true;            /* indicate end of file */
    yy_endRead = yy_startRead;  /* invalidate buffer    */

    if (yy_reader != null)
      yy_reader.close();
  }


  /**
   * Closes the current stream, and resets the
   * scanner to read from a new input stream.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>YY_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  final public void yyreset(java.io.Reader reader) throws java.io.IOException {
    yyclose();
    yy_reader = reader;
    yy_atBOL  = true;
    yy_atEOF  = false;
    yy_endRead = yy_startRead = 0;
    yy_currentPos = yy_markedPos = yy_pushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    yy_lexical_state = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  final public int yystate() {
    return yy_lexical_state;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  final public void yybegin(int newState) {
    yy_lexical_state = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  final public String yytext() {
    return new String( yy_buffer, yy_startRead, yy_markedPos-yy_startRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  final public char yycharat(int pos) {
    return yy_buffer[yy_startRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  final public int yylength() {
    return yy_markedPos-yy_startRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void yy_ScanError(int errorCode) {
    String message;
    try {
      message = YY_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = YY_ERROR_MSG[YY_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  private void yypushback(int number)  {
    if ( number > yylength() )
      yy_ScanError(YY_PUSHBACK_2BIG);

    yy_markedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void yy_do_eof() throws java.io.IOException {
    if (!yy_eof_done) {
      yy_eof_done = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int yy_input;
    int yy_action;

    // cached fields:
    int yy_currentPos_l;
    int yy_startRead_l;
    int yy_markedPos_l;
    int yy_endRead_l = yy_endRead;
    char [] yy_buffer_l = yy_buffer;
    char [] yycmap_l = yycmap;

    int [] yytrans_l = yytrans;
    int [] yy_rowMap_l = yy_rowMap;
    byte [] yy_attr_l = YY_ATTRIBUTE;

    while (true) {
      yy_markedPos_l = yy_markedPos;

      yychar+= yy_markedPos_l-yy_startRead;

      boolean yy_r = false;
      for (yy_currentPos_l = yy_startRead; yy_currentPos_l < yy_markedPos_l;
                                                             yy_currentPos_l++) {
        switch (yy_buffer_l[yy_currentPos_l]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          yy_r = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          yy_r = true;
          break;
        case '\n':
          if (yy_r)
            yy_r = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          yy_r = false;
          yycolumn++;
        }
      }

      if (yy_r) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean yy_peek;
        if (yy_markedPos_l < yy_endRead_l)
          yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        else if (yy_atEOF)
          yy_peek = false;
        else {
          boolean eof = yy_refill();
          yy_markedPos_l = yy_markedPos;
          yy_buffer_l = yy_buffer;
          if (eof) 
            yy_peek = false;
          else 
            yy_peek = yy_buffer_l[yy_markedPos_l] == '\n';
        }
        if (yy_peek) yyline--;
      }
      yy_action = -1;

      yy_startRead_l = yy_currentPos_l = yy_currentPos = 
                       yy_startRead = yy_markedPos_l;

      yy_state = yy_lexical_state;


      yy_forAction: {
        while (true) {

          if (yy_currentPos_l < yy_endRead_l)
            yy_input = yy_buffer_l[yy_currentPos_l++];
          else if (yy_atEOF) {
            yy_input = YYEOF;
            break yy_forAction;
          }
          else {
            // store back cached positions
            yy_currentPos  = yy_currentPos_l;
            yy_markedPos   = yy_markedPos_l;
            boolean eof = yy_refill();
            // get translated positions and possibly new buffer
            yy_currentPos_l  = yy_currentPos;
            yy_markedPos_l   = yy_markedPos;
            yy_buffer_l      = yy_buffer;
            yy_endRead_l     = yy_endRead;
            if (eof) {
              yy_input = YYEOF;
              break yy_forAction;
            }
            else {
              yy_input = yy_buffer_l[yy_currentPos_l++];
            }
          }
          int yy_next = yytrans_l[ yy_rowMap_l[yy_state] + yycmap_l[yy_input] ];
          if (yy_next == -1) break yy_forAction;
          yy_state = yy_next;

          int yy_attributes = yy_attr_l[yy_state];
          if ( (yy_attributes & 1) == 1 ) {
            yy_action = yy_state; 
            yy_markedPos_l = yy_currentPos_l; 
            if ( (yy_attributes & 8) == 8 ) break yy_forAction;
          }

        }
      }

      // store back cached position
      yy_markedPos = yy_markedPos_l;

      switch (yy_action) {

        case 71: 
          {  return symbolFactory.newSymbol("DO", DO);  }
        case 159: break;
        case 68: 
          {  return symbolFactory.newSymbol("EX", EX);  }
        case 160: break;
        case 63: 
          {  return symbolFactory.newSymbol("IF", IF);  }
        case 161: break;
        case 24: 
          {  return symbolFactory.newSymbol("LT", LT);  }
        case 162: break;
        case 25: 
          {  return symbolFactory.newSymbol("EQ", EQ);  }
        case 163: break;
        case 26: 
          {  return symbolFactory.newSymbol("GT", GT);  }
        case 164: break;
        case 7: 
        case 8: 
          {  return symbolFactory.newSymbol("NUMBER", NUMBER, Integer.parseInt(yytext()));  }
        case 165: break;
        case 9: 
        case 33: 
        case 34: 
        case 35: 
        case 36: 
        case 37: 
        case 38: 
        case 39: 
        case 40: 
        case 41: 
        case 42: 
        case 43: 
        case 44: 
        case 45: 
        case 46: 
        case 47: 
        case 48: 
        case 54: 
        case 55: 
        case 64: 
        case 65: 
        case 66: 
        case 67: 
        case 69: 
        case 70: 
        case 72: 
        case 73: 
        case 74: 
        case 75: 
        case 76: 
        case 77: 
        case 78: 
        case 79: 
        case 80: 
        case 81: 
        case 82: 
        case 83: 
        case 84: 
        case 85: 
        case 86: 
        case 91: 
        case 93: 
        case 94: 
        case 95: 
        case 96: 
        case 97: 
        case 98: 
        case 100: 
        case 101: 
        case 102: 
        case 103: 
        case 105: 
        case 108: 
        case 110: 
        case 113: 
        case 114: 
        case 115: 
        case 118: 
        case 119: 
        case 120: 
        case 122: 
        case 123: 
        case 124: 
        case 126: 
        case 127: 
        case 128: 
        case 129: 
        case 130: 
        case 131: 
        case 132: 
        case 135: 
        case 137: 
        case 138: 
        case 140: 
        case 145: 
        case 146: 
        case 149: 
        case 150: 
        case 152: 
        case 154: 
          {  return symbolFactory.newSymbol("ID", ID, new String(yytext()));  }
        case 166: break;
        case 29: 
          {  return symbolFactory.newSymbol("LCURLYBRACKET", LCURLYBRACKET);  }
        case 167: break;
        case 30: 
          {  return symbolFactory.newSymbol("RCURLYBRACKET", RCURLYBRACKET);  }
        case 168: break;
        case 3: 
        case 4: 
          {                                }
        case 169: break;
        case 156: 
          {  return symbolFactory.newSymbol("BOOLEAN", BOOLEAN);  }
        case 170: break;
        case 155: 
          {  return symbolFactory.newSymbol("EXTENDS", EXTENDS);  }
        case 171: break;
        case 147: 
          {  return symbolFactory.newSymbol("CLASS", CLASS);  }
        case 172: break;
        case 144: 
          {  return symbolFactory.newSymbol("ACTOR", ACTOR);  }
        case 173: break;
        case 143: 
          {  return symbolFactory.newSymbol("ARRAY", ARRAY);  }
        case 174: break;
        case 142: 
          {  return symbolFactory.newSymbol("UNTIL", UNTIL);  }
        case 175: break;
        case 141: 
          {  return symbolFactory.newSymbol("REACT", REACT);  }
        case 176: break;
        case 139: 
          {  return symbolFactory.newSymbol("WHILE", WHILE);  }
        case 177: break;
        case 136: 
          {  return symbolFactory.newSymbol("FALSE", FALSE);  }
        case 178: break;
        case 12: 
          {  return symbolFactory.newSymbol("COLON", COLON);  }
        case 179: break;
        case 6: 
          {  return symbolFactory.newSymbol("MINUS", MINUS);  }
        case 180: break;
        case 11: 
          {  return symbolFactory.newSymbol("TIMES", TIMES);  }
        case 181: break;
        case 28: 
          {  return symbolFactory.newSymbol("COMMA", COMMA);  }
        case 182: break;
        case 53: 
          {  return symbolFactory.newSymbol("COLEQ", COLEQ);  }
        case 183: break;
        case 2: 
        case 17: 
        case 18: 
          {  emit_warning("Unrecognized character '" +yytext()+"' -- ignored");  }
        case 184: break;
        case 49: 
          {  return symbolFactory.newSymbol("MINUSMINUS", MINUSMINUS);  }
        case 185: break;
        case 112: 
          {  return symbolFactory.newSymbol("VAR", VAR);  }
        case 186: break;
        case 111: 
          {  return symbolFactory.newSymbol("VAL", VAL);  }
        case 187: break;
        case 109: 
          {  return symbolFactory.newSymbol("SET", SET);  }
        case 188: break;
        case 107: 
          {  return symbolFactory.newSymbol("INT", INT);  }
        case 189: break;
        case 106: 
          {  return symbolFactory.newSymbol("ACT", ACT);  }
        case 190: break;
        case 104: 
          {  return symbolFactory.newSymbol("ALL", ALL);  }
        case 191: break;
        case 99: 
          {  return symbolFactory.newSymbol("DEF", DEF);  }
        case 192: break;
        case 90: 
          {  return symbolFactory.newSymbol("NEW", NEW);  }
        case 193: break;
        case 62: 
          {  return symbolFactory.newSymbol("GEQ", GEQ);  }
        case 194: break;
        case 21: 
          {  return symbolFactory.newSymbol("MOD", MOD);  }
        case 195: break;
        case 19: 
          {  return symbolFactory.newSymbol("NOT", NOT);  }
        case 196: break;
        case 10: 
          {  return symbolFactory.newSymbol("DIV", DIV);  }
        case 197: break;
        case 27: 
          {  return symbolFactory.newSymbol("DOT", DOT);  }
        case 198: break;
        case 56: 
          {  return symbolFactory.newSymbol("AND", AND);  }
        case 199: break;
        case 57: 
          {  return symbolFactory.newSymbol("OR", AND);  }
        case 200: break;
        case 58: 
          {  return symbolFactory.newSymbol("NEQ", NEQ);  }
        case 201: break;
        case 59: 
          {  return symbolFactory.newSymbol("LEQ", LEQ);  }
        case 202: break;
        case 157: 
          {  return symbolFactory.newSymbol("ENSURING", ENSURING);  }
        case 203: break;
        case 61: 
          {  return symbolFactory.newSymbol("DOUBLEARROW", DOUBLEARROW);  }
        case 204: break;
        case 134: 
          {  return symbolFactory.newSymbol("UNIT", UNIT);  }
        case 205: break;
        case 133: 
          {  return symbolFactory.newSymbol("CASE", CASE);  }
        case 206: break;
        case 125: 
          {  return symbolFactory.newSymbol("TRUE", TRUE);  }
        case 207: break;
        case 121: 
          {  return symbolFactory.newSymbol("ELSE", ELSE);  }
        case 208: break;
        case 117: 
          {  return symbolFactory.newSymbol("NULL", NULL);  }
        case 209: break;
        case 13: 
          {  return symbolFactory.newSymbol("SEMI", SEMI);  }
        case 210: break;
        case 5: 
          {  return symbolFactory.newSymbol("PLUS", PLUS);  }
        case 211: break;
        case 60: 
          {  return symbolFactory.newSymbol("EQEQ", EQEQ);  }
        case 212: break;
        case 20: 
          {  return symbolFactory.newSymbol("UNDERLINE", UNDERLINE);  }
        case 213: break;
        case 153: 
          {  return symbolFactory.newSymbol("STRING", STRING);  }
        case 214: break;
        case 151: 
          {  return symbolFactory.newSymbol("OBJECT", OBJECT);  }
        case 215: break;
        case 148: 
          {  return symbolFactory.newSymbol("IMPORT", IMPORT);  }
        case 216: break;
        case 92: 
          {  return symbolFactory.newSymbol("EQEQEQ", EQEQEQ);  }
        case 217: break;
        case 89: 
          {  return symbolFactory.newSymbol("LANNOT", LANNOT);  }
        case 218: break;
        case 22: 
          {  return symbolFactory.newSymbol("DOLLAR", DOLLAR);  }
        case 219: break;
        case 16: 
          {  return symbolFactory.newSymbol("RPAREN", RPAREN);  }
        case 220: break;
        case 15: 
          {  return symbolFactory.newSymbol("LPAREN", LPAREN);  }
        case 221: break;
        case 14: 
          {  return symbolFactory.newSymbol("UMINUS", UMINUS);  }
        case 222: break;
        case 23: 
          {  return symbolFactory.newSymbol("ATSIGN", ATSIGN);  }
        case 223: break;
        case 52: 
          {  return symbolFactory.newSymbol("RANNOT", RANNOT);  }
        case 224: break;
        case 32: 
          {  return symbolFactory.newSymbol("RSQUAREBRACKET", RSQUAREBRACKET);  }
        case 225: break;
        case 31: 
          {  return symbolFactory.newSymbol("LSQUAREBRACKET", LSQUAREBRACKET);  }
        case 226: break;
        default: 
          if (yy_input == YYEOF && yy_startRead == yy_currentPos) {
            yy_atEOF = true;
            yy_do_eof();
              {     return symbolFactory.newSymbol("EOF",sym.EOF);
 }
          } 
          else {
            yy_ScanError(YY_NO_MATCH);
          }
      }
    }
  }


}
