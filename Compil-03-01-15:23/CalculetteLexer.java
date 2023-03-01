// Generated from Calculette.g4 by ANTLR 4.7.2
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
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, COMMENTAIRE=34, NEWLINE=35, ENTIER=36, TYPE=37, MOTCLE=38, 
		IDENTIFIANT=39, WS=40, UNMATCH=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "T__31", "T__32", 
			"COMMENTAIRE", "NEWLINE", "ENTIER", "TYPE", "MOTCLE", "IDENTIFIANT", 
			"WS", "UNMATCH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'('", "';'", "')'", "'if'", "'else'", "'while'", "'{'", 
			"'}'", "'='", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'&&'", 
			"'||'", "'true'", "'false'", "'input'", "'print'", "'-'", "'*'", "'/'", 
			"'+'", "'=='", "'!='", "'<>'", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "COMMENTAIRE", 
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
	    private int _cur_label = 1;
	    /** générateur de nom d'étiquettes pour les boucles, pour whilebloc*/
	    private String getNewLabel() { return "Label" +(_cur_label++); }
	    // ...
	        

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u012e\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\7#\u00c0\n#\f#\16"+
		"#\u00c3\13#\3#\3#\3#\3#\7#\u00c9\n#\f#\16#\u00cc\13#\3#\3#\5#\u00d0\n"+
		"#\3#\3#\3$\5$\u00d5\n$\3$\3$\3%\6%\u00da\n%\r%\16%\u00db\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\5&\u00e7\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\3\'\5\'\u011b\n\'\3(\3(\7(\u011f\n(\f(\16(\u0122\13(\3)\6"+
		")\u0125\n)\r)\16)\u0126\3)\3)\3*\3*\3*\3*\3\u00ca\2+\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'"+
		"M(O)Q*S+\3\2\6\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\2"+
		"\u013e\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2"+
		"\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3"+
		"\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2"+
		"\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2"+
		"/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2"+
		"G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3"+
		"\2\2\2\3U\3\2\2\2\5Y\3\2\2\2\7[\3\2\2\2\t]\3\2\2\2\13_\3\2\2\2\rb\3\2"+
		"\2\2\17g\3\2\2\2\21m\3\2\2\2\23o\3\2\2\2\25q\3\2\2\2\27s\3\2\2\2\31v\3"+
		"\2\2\2\33y\3\2\2\2\35|\3\2\2\2\37\177\3\2\2\2!\u0082\3\2\2\2#\u0085\3"+
		"\2\2\2%\u0088\3\2\2\2\'\u008b\3\2\2\2)\u0090\3\2\2\2+\u0096\3\2\2\2-\u009c"+
		"\3\2\2\2/\u00a2\3\2\2\2\61\u00a4\3\2\2\2\63\u00a6\3\2\2\2\65\u00a8\3\2"+
		"\2\2\67\u00aa\3\2\2\29\u00ad\3\2\2\2;\u00b0\3\2\2\2=\u00b3\3\2\2\2?\u00b5"+
		"\3\2\2\2A\u00b7\3\2\2\2C\u00ba\3\2\2\2E\u00cf\3\2\2\2G\u00d4\3\2\2\2I"+
		"\u00d9\3\2\2\2K\u00e6\3\2\2\2M\u011a\3\2\2\2O\u011c\3\2\2\2Q\u0124\3\2"+
		"\2\2S\u012a\3\2\2\2UV\7h\2\2VW\7q\2\2WX\7t\2\2X\4\3\2\2\2YZ\7*\2\2Z\6"+
		"\3\2\2\2[\\\7=\2\2\\\b\3\2\2\2]^\7+\2\2^\n\3\2\2\2_`\7k\2\2`a\7h\2\2a"+
		"\f\3\2\2\2bc\7g\2\2cd\7n\2\2de\7u\2\2ef\7g\2\2f\16\3\2\2\2gh\7y\2\2hi"+
		"\7j\2\2ij\7k\2\2jk\7n\2\2kl\7g\2\2l\20\3\2\2\2mn\7}\2\2n\22\3\2\2\2op"+
		"\7\177\2\2p\24\3\2\2\2qr\7?\2\2r\26\3\2\2\2st\7-\2\2tu\7?\2\2u\30\3\2"+
		"\2\2vw\7/\2\2wx\7?\2\2x\32\3\2\2\2yz\7,\2\2z{\7?\2\2{\34\3\2\2\2|}\7\61"+
		"\2\2}~\7?\2\2~\36\3\2\2\2\177\u0080\7-\2\2\u0080\u0081\7-\2\2\u0081 \3"+
		"\2\2\2\u0082\u0083\7/\2\2\u0083\u0084\7/\2\2\u0084\"\3\2\2\2\u0085\u0086"+
		"\7(\2\2\u0086\u0087\7(\2\2\u0087$\3\2\2\2\u0088\u0089\7~\2\2\u0089\u008a"+
		"\7~\2\2\u008a&\3\2\2\2\u008b\u008c\7v\2\2\u008c\u008d\7t\2\2\u008d\u008e"+
		"\7w\2\2\u008e\u008f\7g\2\2\u008f(\3\2\2\2\u0090\u0091\7h\2\2\u0091\u0092"+
		"\7c\2\2\u0092\u0093\7n\2\2\u0093\u0094\7u\2\2\u0094\u0095\7g\2\2\u0095"+
		"*\3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p\2\2\u0098\u0099\7r\2\2\u0099"+
		"\u009a\7w\2\2\u009a\u009b\7v\2\2\u009b,\3\2\2\2\u009c\u009d\7r\2\2\u009d"+
		"\u009e\7t\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7p\2\2\u00a0\u00a1\7v\2\2"+
		"\u00a1.\3\2\2\2\u00a2\u00a3\7/\2\2\u00a3\60\3\2\2\2\u00a4\u00a5\7,\2\2"+
		"\u00a5\62\3\2\2\2\u00a6\u00a7\7\61\2\2\u00a7\64\3\2\2\2\u00a8\u00a9\7"+
		"-\2\2\u00a9\66\3\2\2\2\u00aa\u00ab\7?\2\2\u00ab\u00ac\7?\2\2\u00ac8\3"+
		"\2\2\2\u00ad\u00ae\7#\2\2\u00ae\u00af\7?\2\2\u00af:\3\2\2\2\u00b0\u00b1"+
		"\7>\2\2\u00b1\u00b2\7@\2\2\u00b2<\3\2\2\2\u00b3\u00b4\7>\2\2\u00b4>\3"+
		"\2\2\2\u00b5\u00b6\7@\2\2\u00b6@\3\2\2\2\u00b7\u00b8\7>\2\2\u00b8\u00b9"+
		"\7?\2\2\u00b9B\3\2\2\2\u00ba\u00bb\7@\2\2\u00bb\u00bc\7?\2\2\u00bcD\3"+
		"\2\2\2\u00bd\u00c1\7\'\2\2\u00be\u00c0\n\2\2\2\u00bf\u00be\3\2\2\2\u00c0"+
		"\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00d0\3\2"+
		"\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5\7\61\2\2\u00c5\u00c6\7,\2\2\u00c6"+
		"\u00ca\3\2\2\2\u00c7\u00c9\13\2\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3"+
		"\2\2\2\u00ca\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00ce\7,\2\2\u00ce\u00d0\7\61\2\2\u00cf\u00bd\3\2"+
		"\2\2\u00cf\u00c4\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d2\b#\2\2\u00d2"+
		"F\3\2\2\2\u00d3\u00d5\7\17\2\2\u00d4\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2"+
		"\u00d5\u00d6\3\2\2\2\u00d6\u00d7\7\f\2\2\u00d7H\3\2\2\2\u00d8\u00da\4"+
		"\62;\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dcJ\3\2\2\2\u00dd\u00de\7k\2\2\u00de\u00df\7p\2\2\u00df"+
		"\u00e7\7v\2\2\u00e0\u00e1\7f\2\2\u00e1\u00e2\7q\2\2\u00e2\u00e3\7w\2\2"+
		"\u00e3\u00e4\7d\2\2\u00e4\u00e5\7n\2\2\u00e5\u00e7\7g\2\2\u00e6\u00dd"+
		"\3\2\2\2\u00e6\u00e0\3\2\2\2\u00e7L\3\2\2\2\u00e8\u00e9\7d\2\2\u00e9\u00ea"+
		"\7t\2\2\u00ea\u00eb\7g\2\2\u00eb\u00ec\7c\2\2\u00ec\u011b\7m\2\2\u00ed"+
		"\u00ee\7e\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7c\2\2\u00f0\u00f1\7u\2\2"+
		"\u00f1\u011b\7u\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7n\2\2\u00f4\u00f5"+
		"\7u\2\2\u00f5\u011b\7g\2\2\u00f6\u00f7\7k\2\2\u00f7\u011b\7h\2\2\u00f8"+
		"\u00f9\7k\2\2\u00f9\u00fa\7o\2\2\u00fa\u00fb\7r\2\2\u00fb\u00fc\7q\2\2"+
		"\u00fc\u00fd\7t\2\2\u00fd\u011b\7v\2\2\u00fe\u00ff\7r\2\2\u00ff\u0100"+
		"\7w\2\2\u0100\u0101\7d\2\2\u0101\u0102\7n\2\2\u0102\u0103\7k\2\2\u0103"+
		"\u011b\7e\2\2\u0104\u0105\7u\2\2\u0105\u0106\7v\2\2\u0106\u0107\7c\2\2"+
		"\u0107\u0108\7v\2\2\u0108\u0109\7k\2\2\u0109\u011b\7e\2\2\u010a\u010b"+
		"\7v\2\2\u010b\u010c\7j\2\2\u010c\u010d\7t\2\2\u010d\u010e\7q\2\2\u010e"+
		"\u010f\7y\2\2\u010f\u011b\7u\2\2\u0110\u0111\7r\2\2\u0111\u0112\7t\2\2"+
		"\u0112\u0113\7k\2\2\u0113\u0114\7p\2\2\u0114\u011b\7v\2\2\u0115\u0116"+
		"\7k\2\2\u0116\u0117\7p\2\2\u0117\u0118\7r\2\2\u0118\u0119\7w\2\2\u0119"+
		"\u011b\7v\2\2\u011a\u00e8\3\2\2\2\u011a\u00ed\3\2\2\2\u011a\u00f2\3\2"+
		"\2\2\u011a\u00f6\3\2\2\2\u011a\u00f8\3\2\2\2\u011a\u00fe\3\2\2\2\u011a"+
		"\u0104\3\2\2\2\u011a\u010a\3\2\2\2\u011a\u0110\3\2\2\2\u011a\u0115\3\2"+
		"\2\2\u011bN\3\2\2\2\u011c\u0120\t\3\2\2\u011d\u011f\t\4\2\2\u011e\u011d"+
		"\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"P\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0125\t\5\2\2\u0124\u0123\3\2\2\2"+
		"\u0125\u0126\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128\u0129\b)\2\2\u0129R\3\2\2\2\u012a\u012b\13\2\2\2\u012b"+
		"\u012c\3\2\2\2\u012c\u012d\b*\2\2\u012dT\3\2\2\2\f\2\u00c1\u00ca\u00cf"+
		"\u00d4\u00db\u00e6\u011a\u0120\u0126\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}