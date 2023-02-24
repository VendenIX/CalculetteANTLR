// Generated from /home/romain/Documents/P_R_O_J_E_C_T_S/CalculetteANTLR/Calculette.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculetteLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u009c\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\5\fC\n\f\3\f\3"+
		"\f\3\r\6\rH\n\r\r\r\16\rI\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\5\16U\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0089\n\17\3\20"+
		"\3\20\7\20\u008d\n\20\f\20\16\20\u0090\13\20\3\21\6\21\u0093\n\21\r\21"+
		"\16\21\u0094\3\21\3\21\3\22\3\22\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\5\5"+
		"\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\2\u00a9\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5\'\3\2"+
		"\2\2\7-\3\2\2\2\t/\3\2\2\2\13\61\3\2\2\2\r\67\3\2\2\2\179\3\2\2\2\21;"+
		"\3\2\2\2\23=\3\2\2\2\25?\3\2\2\2\27B\3\2\2\2\31G\3\2\2\2\33T\3\2\2\2\35"+
		"\u0088\3\2\2\2\37\u008a\3\2\2\2!\u0092\3\2\2\2#\u0098\3\2\2\2%&\7?\2\2"+
		"&\4\3\2\2\2\'(\7k\2\2()\7p\2\2)*\7r\2\2*+\7w\2\2+,\7v\2\2,\6\3\2\2\2-"+
		".\7*\2\2.\b\3\2\2\2/\60\7+\2\2\60\n\3\2\2\2\61\62\7r\2\2\62\63\7t\2\2"+
		"\63\64\7k\2\2\64\65\7p\2\2\65\66\7v\2\2\66\f\3\2\2\2\678\7/\2\28\16\3"+
		"\2\2\29:\7,\2\2:\20\3\2\2\2;<\7\61\2\2<\22\3\2\2\2=>\7-\2\2>\24\3\2\2"+
		"\2?@\7=\2\2@\26\3\2\2\2AC\7\17\2\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\f"+
		"\2\2E\30\3\2\2\2FH\4\62;\2GF\3\2\2\2HI\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\32"+
		"\3\2\2\2KL\7k\2\2LM\7p\2\2MU\7v\2\2NO\7f\2\2OP\7q\2\2PQ\7w\2\2QR\7d\2"+
		"\2RS\7n\2\2SU\7g\2\2TK\3\2\2\2TN\3\2\2\2U\34\3\2\2\2VW\7d\2\2WX\7t\2\2"+
		"XY\7g\2\2YZ\7c\2\2Z\u0089\7m\2\2[\\\7e\2\2\\]\7n\2\2]^\7c\2\2^_\7u\2\2"+
		"_\u0089\7u\2\2`a\7g\2\2ab\7n\2\2bc\7u\2\2c\u0089\7g\2\2de\7k\2\2e\u0089"+
		"\7h\2\2fg\7k\2\2gh\7o\2\2hi\7r\2\2ij\7q\2\2jk\7t\2\2k\u0089\7v\2\2lm\7"+
		"r\2\2mn\7w\2\2no\7d\2\2op\7n\2\2pq\7k\2\2q\u0089\7e\2\2rs\7u\2\2st\7v"+
		"\2\2tu\7c\2\2uv\7v\2\2vw\7k\2\2w\u0089\7e\2\2xy\7v\2\2yz\7j\2\2z{\7t\2"+
		"\2{|\7q\2\2|}\7y\2\2}\u0089\7u\2\2~\177\7r\2\2\177\u0080\7t\2\2\u0080"+
		"\u0081\7k\2\2\u0081\u0082\7p\2\2\u0082\u0089\7v\2\2\u0083\u0084\7k\2\2"+
		"\u0084\u0085\7p\2\2\u0085\u0086\7r\2\2\u0086\u0087\7w\2\2\u0087\u0089"+
		"\7v\2\2\u0088V\3\2\2\2\u0088[\3\2\2\2\u0088`\3\2\2\2\u0088d\3\2\2\2\u0088"+
		"f\3\2\2\2\u0088l\3\2\2\2\u0088r\3\2\2\2\u0088x\3\2\2\2\u0088~\3\2\2\2"+
		"\u0088\u0083\3\2\2\2\u0089\36\3\2\2\2\u008a\u008e\t\2\2\2\u008b\u008d"+
		"\t\3\2\2\u008c\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f \3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0093\t\4\2\2"+
		"\u0092\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097\b\21\2\2\u0097\"\3\2\2\2\u0098"+
		"\u0099\13\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\b\22\2\2\u009b$\3\2\2"+
		"\2\t\2BIT\u0088\u008e\u0094\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}