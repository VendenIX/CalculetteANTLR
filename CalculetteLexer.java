// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculetteLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NEWLINE=11, ENTIER=12, TYPE=13, MOTCLE=14, IDENTIFIANT=15, WS=16, 
		UNMATCH=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "NEWLINE", "ENTIER", "TYPE", "MOTCLE", "IDENTIFIANT", "WS", "UNMATCH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'input'", "'('", "')'", "'print'", "'-'", "'*'", "'/'", 
			"'+'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "NEWLINE", 
			"ENTIER", "TYPE", "MOTCLE", "IDENTIFIANT", "WS", "UNMATCH"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	   private TablesSymboles tablesSymboles = new TablesSymboles();
	        

	public CalculetteLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculette.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0011\u009a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0003\nA\b\n\u0001\n\u0001\n\u0001\u000b\u0004\u000b"+
		"F\b\u000b\u000b\u000b\f\u000bG\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0003\fS\b\f\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0003\r\u0087\b\r\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u008b\b\u000e\n\u000e\f\u000e\u008e\t\u000e\u0001\u000f\u0004\u000f\u0091"+
		"\b\u000f\u000b\u000f\f\u000f\u0092\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0000\u0000\u0011\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011\u0001\u0000\u0003\u0003\u0000AZ__az\u0004\u000009AZ__az\u0002"+
		"\u0000\t\t  \u00a7\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003"+
		"%\u0001\u0000\u0000\u0000\u0005+\u0001\u0000\u0000\u0000\u0007-\u0001"+
		"\u0000\u0000\u0000\t/\u0001\u0000\u0000\u0000\u000b5\u0001\u0000\u0000"+
		"\u0000\r7\u0001\u0000\u0000\u0000\u000f9\u0001\u0000\u0000\u0000\u0011"+
		";\u0001\u0000\u0000\u0000\u0013=\u0001\u0000\u0000\u0000\u0015@\u0001"+
		"\u0000\u0000\u0000\u0017E\u0001\u0000\u0000\u0000\u0019R\u0001\u0000\u0000"+
		"\u0000\u001b\u0086\u0001\u0000\u0000\u0000\u001d\u0088\u0001\u0000\u0000"+
		"\u0000\u001f\u0090\u0001\u0000\u0000\u0000!\u0096\u0001\u0000\u0000\u0000"+
		"#$\u0005=\u0000\u0000$\u0002\u0001\u0000\u0000\u0000%&\u0005i\u0000\u0000"+
		"&\'\u0005n\u0000\u0000\'(\u0005p\u0000\u0000()\u0005u\u0000\u0000)*\u0005"+
		"t\u0000\u0000*\u0004\u0001\u0000\u0000\u0000+,\u0005(\u0000\u0000,\u0006"+
		"\u0001\u0000\u0000\u0000-.\u0005)\u0000\u0000.\b\u0001\u0000\u0000\u0000"+
		"/0\u0005p\u0000\u000001\u0005r\u0000\u000012\u0005i\u0000\u000023\u0005"+
		"n\u0000\u000034\u0005t\u0000\u00004\n\u0001\u0000\u0000\u000056\u0005"+
		"-\u0000\u00006\f\u0001\u0000\u0000\u000078\u0005*\u0000\u00008\u000e\u0001"+
		"\u0000\u0000\u00009:\u0005/\u0000\u0000:\u0010\u0001\u0000\u0000\u0000"+
		";<\u0005+\u0000\u0000<\u0012\u0001\u0000\u0000\u0000=>\u0005;\u0000\u0000"+
		">\u0014\u0001\u0000\u0000\u0000?A\u0005\r\u0000\u0000@?\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0005\n\u0000"+
		"\u0000C\u0016\u0001\u0000\u0000\u0000DF\u000209\u0000ED\u0001\u0000\u0000"+
		"\u0000FG\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000GH\u0001\u0000"+
		"\u0000\u0000H\u0018\u0001\u0000\u0000\u0000IJ\u0005i\u0000\u0000JK\u0005"+
		"n\u0000\u0000KS\u0005t\u0000\u0000LM\u0005d\u0000\u0000MN\u0005o\u0000"+
		"\u0000NO\u0005u\u0000\u0000OP\u0005b\u0000\u0000PQ\u0005l\u0000\u0000"+
		"QS\u0005e\u0000\u0000RI\u0001\u0000\u0000\u0000RL\u0001\u0000\u0000\u0000"+
		"S\u001a\u0001\u0000\u0000\u0000TU\u0005b\u0000\u0000UV\u0005r\u0000\u0000"+
		"VW\u0005e\u0000\u0000WX\u0005a\u0000\u0000X\u0087\u0005k\u0000\u0000Y"+
		"Z\u0005c\u0000\u0000Z[\u0005l\u0000\u0000[\\\u0005a\u0000\u0000\\]\u0005"+
		"s\u0000\u0000]\u0087\u0005s\u0000\u0000^_\u0005e\u0000\u0000_`\u0005l"+
		"\u0000\u0000`a\u0005s\u0000\u0000a\u0087\u0005e\u0000\u0000bc\u0005i\u0000"+
		"\u0000c\u0087\u0005f\u0000\u0000de\u0005i\u0000\u0000ef\u0005m\u0000\u0000"+
		"fg\u0005p\u0000\u0000gh\u0005o\u0000\u0000hi\u0005r\u0000\u0000i\u0087"+
		"\u0005t\u0000\u0000jk\u0005p\u0000\u0000kl\u0005u\u0000\u0000lm\u0005"+
		"b\u0000\u0000mn\u0005l\u0000\u0000no\u0005i\u0000\u0000o\u0087\u0005c"+
		"\u0000\u0000pq\u0005s\u0000\u0000qr\u0005t\u0000\u0000rs\u0005a\u0000"+
		"\u0000st\u0005t\u0000\u0000tu\u0005i\u0000\u0000u\u0087\u0005c\u0000\u0000"+
		"vw\u0005t\u0000\u0000wx\u0005h\u0000\u0000xy\u0005r\u0000\u0000yz\u0005"+
		"o\u0000\u0000z{\u0005w\u0000\u0000{\u0087\u0005s\u0000\u0000|}\u0005p"+
		"\u0000\u0000}~\u0005r\u0000\u0000~\u007f\u0005i\u0000\u0000\u007f\u0080"+
		"\u0005n\u0000\u0000\u0080\u0087\u0005t\u0000\u0000\u0081\u0082\u0005i"+
		"\u0000\u0000\u0082\u0083\u0005n\u0000\u0000\u0083\u0084\u0005p\u0000\u0000"+
		"\u0084\u0085\u0005u\u0000\u0000\u0085\u0087\u0005t\u0000\u0000\u0086T"+
		"\u0001\u0000\u0000\u0000\u0086Y\u0001\u0000\u0000\u0000\u0086^\u0001\u0000"+
		"\u0000\u0000\u0086b\u0001\u0000\u0000\u0000\u0086d\u0001\u0000\u0000\u0000"+
		"\u0086j\u0001\u0000\u0000\u0000\u0086p\u0001\u0000\u0000\u0000\u0086v"+
		"\u0001\u0000\u0000\u0000\u0086|\u0001\u0000\u0000\u0000\u0086\u0081\u0001"+
		"\u0000\u0000\u0000\u0087\u001c\u0001\u0000\u0000\u0000\u0088\u008c\u0007"+
		"\u0000\u0000\u0000\u0089\u008b\u0007\u0001\u0000\u0000\u008a\u0089\u0001"+
		"\u0000\u0000\u0000\u008b\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u001e\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008f\u0091\u0007"+
		"\u0002\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0006"+
		"\u000f\u0000\u0000\u0095 \u0001\u0000\u0000\u0000\u0096\u0097\t\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0006\u0010"+
		"\u0000\u0000\u0099\"\u0001\u0000\u0000\u0000\u0007\u0000@GR\u0086\u008c"+
		"\u0092\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}