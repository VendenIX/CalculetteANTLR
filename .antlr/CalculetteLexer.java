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
		T__9=10, COMMENTAIRE=11, NEWLINE=12, ENTIER=13, TYPE=14, MOTCLE=15, IDENTIFIANT=16, 
		WS=17, UNMATCH=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "COMMENTAIRE", "NEWLINE", "ENTIER", "TYPE", "MOTCLE", "IDENTIFIANT", 
			"WS", "UNMATCH"
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
			null, null, null, null, null, null, null, null, null, null, null, "COMMENTAIRE", 
			"NEWLINE", "ENTIER", "TYPE", "MOTCLE", "IDENTIFIANT", "WS", "UNMATCH"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00b4\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\7"+
		"\fF\n\f\f\f\16\fI\13\f\3\f\3\f\3\f\3\f\7\fO\n\f\f\f\16\fR\13\f\3\f\3\f"+
		"\5\fV\n\f\3\f\3\f\3\r\5\r[\n\r\3\r\3\r\3\16\6\16`\n\16\r\16\16\16a\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17m\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\5\20\u00a1\n\20\3\21\3\21\7\21\u00a5\n\21\f\21\16"+
		"\21\u00a8\13\21\3\22\6\22\u00ab\n\22\r\22\16\22\u00ac\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3P\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\3\2\6\4\2\f\f\17\17\5\2C\\aac|"+
		"\6\2\62;C\\aac|\4\2\13\13\"\"\2\u00c4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\3\'\3\2\2\2\5)\3"+
		"\2\2\2\7/\3\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21"+
		"=\3\2\2\2\23?\3\2\2\2\25A\3\2\2\2\27U\3\2\2\2\31Z\3\2\2\2\33_\3\2\2\2"+
		"\35l\3\2\2\2\37\u00a0\3\2\2\2!\u00a2\3\2\2\2#\u00aa\3\2\2\2%\u00b0\3\2"+
		"\2\2\'(\7?\2\2(\4\3\2\2\2)*\7k\2\2*+\7p\2\2+,\7r\2\2,-\7w\2\2-.\7v\2\2"+
		".\6\3\2\2\2/\60\7*\2\2\60\b\3\2\2\2\61\62\7+\2\2\62\n\3\2\2\2\63\64\7"+
		"r\2\2\64\65\7t\2\2\65\66\7k\2\2\66\67\7p\2\2\678\7v\2\28\f\3\2\2\29:\7"+
		"/\2\2:\16\3\2\2\2;<\7,\2\2<\20\3\2\2\2=>\7\61\2\2>\22\3\2\2\2?@\7-\2\2"+
		"@\24\3\2\2\2AB\7=\2\2B\26\3\2\2\2CG\7\'\2\2DF\n\2\2\2ED\3\2\2\2FI\3\2"+
		"\2\2GE\3\2\2\2GH\3\2\2\2HV\3\2\2\2IG\3\2\2\2JK\7\61\2\2KL\7,\2\2LP\3\2"+
		"\2\2MO\13\2\2\2NM\3\2\2\2OR\3\2\2\2PQ\3\2\2\2PN\3\2\2\2QS\3\2\2\2RP\3"+
		"\2\2\2ST\7,\2\2TV\7\61\2\2UC\3\2\2\2UJ\3\2\2\2VW\3\2\2\2WX\b\f\2\2X\30"+
		"\3\2\2\2Y[\7\17\2\2ZY\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\]\7\f\2\2]\32\3\2"+
		"\2\2^`\4\62;\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\34\3\2\2\2cd\7"+
		"k\2\2de\7p\2\2em\7v\2\2fg\7f\2\2gh\7q\2\2hi\7w\2\2ij\7d\2\2jk\7n\2\2k"+
		"m\7g\2\2lc\3\2\2\2lf\3\2\2\2m\36\3\2\2\2no\7d\2\2op\7t\2\2pq\7g\2\2qr"+
		"\7c\2\2r\u00a1\7m\2\2st\7e\2\2tu\7n\2\2uv\7c\2\2vw\7u\2\2w\u00a1\7u\2"+
		"\2xy\7g\2\2yz\7n\2\2z{\7u\2\2{\u00a1\7g\2\2|}\7k\2\2}\u00a1\7h\2\2~\177"+
		"\7k\2\2\177\u0080\7o\2\2\u0080\u0081\7r\2\2\u0081\u0082\7q\2\2\u0082\u0083"+
		"\7t\2\2\u0083\u00a1\7v\2\2\u0084\u0085\7r\2\2\u0085\u0086\7w\2\2\u0086"+
		"\u0087\7d\2\2\u0087\u0088\7n\2\2\u0088\u0089\7k\2\2\u0089\u00a1\7e\2\2"+
		"\u008a\u008b\7u\2\2\u008b\u008c\7v\2\2\u008c\u008d\7c\2\2\u008d\u008e"+
		"\7v\2\2\u008e\u008f\7k\2\2\u008f\u00a1\7e\2\2\u0090\u0091\7v\2\2\u0091"+
		"\u0092\7j\2\2\u0092\u0093\7t\2\2\u0093\u0094\7q\2\2\u0094\u0095\7y\2\2"+
		"\u0095\u00a1\7u\2\2\u0096\u0097\7r\2\2\u0097\u0098\7t\2\2\u0098\u0099"+
		"\7k\2\2\u0099\u009a\7p\2\2\u009a\u00a1\7v\2\2\u009b\u009c\7k\2\2\u009c"+
		"\u009d\7p\2\2\u009d\u009e\7r\2\2\u009e\u009f\7w\2\2\u009f\u00a1\7v\2\2"+
		"\u00a0n\3\2\2\2\u00a0s\3\2\2\2\u00a0x\3\2\2\2\u00a0|\3\2\2\2\u00a0~\3"+
		"\2\2\2\u00a0\u0084\3\2\2\2\u00a0\u008a\3\2\2\2\u00a0\u0090\3\2\2\2\u00a0"+
		"\u0096\3\2\2\2\u00a0\u009b\3\2\2\2\u00a1 \3\2\2\2\u00a2\u00a6\t\3\2\2"+
		"\u00a3\u00a5\t\4\2\2\u00a4\u00a3\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\u00ab\t\5\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00aa\3\2"+
		"\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00af\b\22\2\2\u00af"+
		"$\3\2\2\2\u00b0\u00b1\13\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\b\23\2"+
		"\2\u00b3&\3\2\2\2\f\2GPUZal\u00a0\u00a6\u00ac\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}