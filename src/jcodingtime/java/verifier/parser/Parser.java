package verifier.parser;

import org.apache.log4j.Logger;
import verifier.enter.InputData;

/* Generated By:JavaCC: Do not edit this line. Parser.java */
public class Parser implements ParserConstants {
  final static Logger logger = Logger.getLogger(InputData.class);

  public static void main(String[] args) throws ParseException
    {
        try
        {
            Parser parser = new Parser(System.in);
            parser.Program();
        }
        catch(ParseException e)
        {
          logger.error(e.getMessage());
        }
    }

  static final public void Program() throws ParseException {
    signatures();
    method();
  }

  static final public void signatures() throws ParseException {
    jj_consume_token(AT);
    jj_consume_token(JCODINGTIME);
    jj_consume_token(AT);
    jj_consume_token(INPUT);
    jj_consume_token(LPAREN);
    jj_consume_token(DIGIT);
    jj_consume_token(COMMA);
    jj_consume_token(DIGIT);
    jj_consume_token(RPAREN);
    jj_consume_token(AT);
    jj_consume_token(OUTPUT);
    jj_consume_token(INTEGER);
  }

  static final public void method() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case PRIVATE:
    case PROTECTED:
    case PUBLIC:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PUBLIC:
        jj_consume_token(PUBLIC);
        break;
      case PRIVATE:
        jj_consume_token(PRIVATE);
        break;
      case PROTECTED:
        jj_consume_token(PROTECTED);
        break;
      default:
        jj_la1[0] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case STATIC:
        jj_consume_token(STATIC);
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INT:
          jj_consume_token(INT);
          break;
        case FLOAT:
          jj_consume_token(FLOAT);
          break;
        case CHAR:
          jj_consume_token(CHAR);
          break;
        case BOOLEAN:
          jj_consume_token(BOOLEAN);
          break;
        case DOUBLE:
          jj_consume_token(DOUBLE);
          break;
        case VOID:
          jj_consume_token(VOID);
          break;
        default:
          jj_la1[1] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      case BOOLEAN:
      case CHAR:
      case DOUBLE:
      case FLOAT:
      case INT:
      case VOID:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INT:
          jj_consume_token(INT);
          break;
        case FLOAT:
          jj_consume_token(FLOAT);
          break;
        case CHAR:
          jj_consume_token(CHAR);
          break;
        case BOOLEAN:
          jj_consume_token(BOOLEAN);
          break;
        case DOUBLE:
          jj_consume_token(DOUBLE);
          break;
        case VOID:
          jj_consume_token(VOID);
          break;
        default:
          jj_la1[2] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
      default:
        jj_la1[3] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    case STATIC:
    case VOID:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case STATIC:
        jj_consume_token(STATIC);
        jj_consume_token(VOID);
        break;
      case VOID:
        jj_consume_token(VOID);
        break;
      default:
        jj_la1[4] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[5] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(IDENTIFIER);
    jj_consume_token(LPAREN);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
      jj_consume_token(INT);
      break;
    case FLOAT:
      jj_consume_token(FLOAT);
      break;
    case CHAR:
      jj_consume_token(CHAR);
      break;
    case BOOLEAN:
      jj_consume_token(BOOLEAN);
      break;
    case DOUBLE:
      jj_consume_token(DOUBLE);
      break;
    default:
      jj_la1[6] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(IDENTIFIER);
    jj_consume_token(COMMA);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
      jj_consume_token(INT);
      break;
    case FLOAT:
      jj_consume_token(FLOAT);
      break;
    case CHAR:
      jj_consume_token(CHAR);
      break;
    case BOOLEAN:
      jj_consume_token(BOOLEAN);
      break;
    case DOUBLE:
      jj_consume_token(DOUBLE);
      break;
    default:
      jj_la1[7] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    jj_consume_token(IDENTIFIER);
    jj_consume_token(RPAREN);
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public ParserTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[8];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static private int[] jj_la1_2;
  static private int[] jj_la1_3;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
      jj_la1_init_2();
      jj_la1_init_3();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x21000000,0x21000000,0x21000000,0x0,0x0,0x21000000,0x21000000,};
   }
   private static void jj_la1_init_2() {
      jj_la1_2 = new int[] {0x7000000,0x20408,0x20408,0x20020408,0x20000000,0x27000000,0x20408,0x20408,};
   }
   private static void jj_la1_init_3() {
      jj_la1_3 = new int[] {0x0,0x100,0x100,0x100,0x100,0x100,0x0,0x0,};
   }

  /** Constructor with InputStream. */
  public Parser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Parser(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Parser(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new ParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Parser(ParserTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(ParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 8; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[125];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 8; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
          if ((jj_la1_2[i] & (1<<j)) != 0) {
            la1tokens[64+j] = true;
          }
          if ((jj_la1_3[i] & (1<<j)) != 0) {
            la1tokens[96+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 125; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
