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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, COMMENTAIRE=36, NEWLINE=37, ENTIER=38, 
		TYPE=39, MOTCLE=40, IDENTIFIANT=41, WS=42, UNMATCH=43;
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
			"T__33", "T__34", "COMMENTAIRE", "NEWLINE", "ENTIER", "TYPE", "MOTCLE", 
			"IDENTIFIANT", "WS", "UNMATCH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'('", "';'", "')'", "'if'", "'else'", "'while'", "'{'", 
			"'}'", "'='", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'!'", 
			"'&&'", "'||'", "'true'", "'false'", "'input'", "'print'", "'-'", "'*'", 
			"'/'", "'+'", "'=='", "'!='", "'<>'", "'<'", "'>'", "'<='", "'>='", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"COMMENTAIRE", "NEWLINE", "ENTIER", "TYPE", "MOTCLE", "IDENTIFIANT", 
			"WS", "UNMATCH"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2-\u0136\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3"+
		"\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$"+
		"\3%\3%\7%\u00c8\n%\f%\16%\u00cb\13%\3%\3%\3%\3%\7%\u00d1\n%\f%\16%\u00d4"+
		"\13%\3%\3%\5%\u00d8\n%\3%\3%\3&\5&\u00dd\n&\3&\3&\3\'\6\'\u00e2\n\'\r"+
		"\'\16\'\u00e3\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u00ef\n(\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u0123"+
		"\n)\3*\3*\7*\u0127\n*\f*\16*\u012a\13*\3+\6+\u012d\n+\r+\16+\u012e\3+"+
		"\3+\3,\3,\3,\3,\3\u00d2\2-\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-\3\2\6\4\2\f\f"+
		"\17\17\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\2\u0146\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\3Y\3\2\2\2\5]\3\2\2\2\7_\3\2\2\2\ta\3\2\2\2\13c\3\2\2\2\rf\3\2\2"+
		"\2\17k\3\2\2\2\21q\3\2\2\2\23s\3\2\2\2\25u\3\2\2\2\27w\3\2\2\2\31z\3\2"+
		"\2\2\33}\3\2\2\2\35\u0080\3\2\2\2\37\u0083\3\2\2\2!\u0086\3\2\2\2#\u0089"+
		"\3\2\2\2%\u008b\3\2\2\2\'\u008e\3\2\2\2)\u0091\3\2\2\2+\u0096\3\2\2\2"+
		"-\u009c\3\2\2\2/\u00a2\3\2\2\2\61\u00a8\3\2\2\2\63\u00aa\3\2\2\2\65\u00ac"+
		"\3\2\2\2\67\u00ae\3\2\2\29\u00b0\3\2\2\2;\u00b3\3\2\2\2=\u00b6\3\2\2\2"+
		"?\u00b9\3\2\2\2A\u00bb\3\2\2\2C\u00bd\3\2\2\2E\u00c0\3\2\2\2G\u00c3\3"+
		"\2\2\2I\u00d7\3\2\2\2K\u00dc\3\2\2\2M\u00e1\3\2\2\2O\u00ee\3\2\2\2Q\u0122"+
		"\3\2\2\2S\u0124\3\2\2\2U\u012c\3\2\2\2W\u0132\3\2\2\2YZ\7h\2\2Z[\7q\2"+
		"\2[\\\7t\2\2\\\4\3\2\2\2]^\7*\2\2^\6\3\2\2\2_`\7=\2\2`\b\3\2\2\2ab\7+"+
		"\2\2b\n\3\2\2\2cd\7k\2\2de\7h\2\2e\f\3\2\2\2fg\7g\2\2gh\7n\2\2hi\7u\2"+
		"\2ij\7g\2\2j\16\3\2\2\2kl\7y\2\2lm\7j\2\2mn\7k\2\2no\7n\2\2op\7g\2\2p"+
		"\20\3\2\2\2qr\7}\2\2r\22\3\2\2\2st\7\177\2\2t\24\3\2\2\2uv\7?\2\2v\26"+
		"\3\2\2\2wx\7-\2\2xy\7?\2\2y\30\3\2\2\2z{\7/\2\2{|\7?\2\2|\32\3\2\2\2}"+
		"~\7,\2\2~\177\7?\2\2\177\34\3\2\2\2\u0080\u0081\7\61\2\2\u0081\u0082\7"+
		"?\2\2\u0082\36\3\2\2\2\u0083\u0084\7-\2\2\u0084\u0085\7-\2\2\u0085 \3"+
		"\2\2\2\u0086\u0087\7/\2\2\u0087\u0088\7/\2\2\u0088\"\3\2\2\2\u0089\u008a"+
		"\7#\2\2\u008a$\3\2\2\2\u008b\u008c\7(\2\2\u008c\u008d\7(\2\2\u008d&\3"+
		"\2\2\2\u008e\u008f\7~\2\2\u008f\u0090\7~\2\2\u0090(\3\2\2\2\u0091\u0092"+
		"\7v\2\2\u0092\u0093\7t\2\2\u0093\u0094\7w\2\2\u0094\u0095\7g\2\2\u0095"+
		"*\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098\7c\2\2\u0098\u0099\7n\2\2\u0099"+
		"\u009a\7u\2\2\u009a\u009b\7g\2\2\u009b,\3\2\2\2\u009c\u009d\7k\2\2\u009d"+
		"\u009e\7p\2\2\u009e\u009f\7r\2\2\u009f\u00a0\7w\2\2\u00a0\u00a1\7v\2\2"+
		"\u00a1.\3\2\2\2\u00a2\u00a3\7r\2\2\u00a3\u00a4\7t\2\2\u00a4\u00a5\7k\2"+
		"\2\u00a5\u00a6\7p\2\2\u00a6\u00a7\7v\2\2\u00a7\60\3\2\2\2\u00a8\u00a9"+
		"\7/\2\2\u00a9\62\3\2\2\2\u00aa\u00ab\7,\2\2\u00ab\64\3\2\2\2\u00ac\u00ad"+
		"\7\61\2\2\u00ad\66\3\2\2\2\u00ae\u00af\7-\2\2\u00af8\3\2\2\2\u00b0\u00b1"+
		"\7?\2\2\u00b1\u00b2\7?\2\2\u00b2:\3\2\2\2\u00b3\u00b4\7#\2\2\u00b4\u00b5"+
		"\7?\2\2\u00b5<\3\2\2\2\u00b6\u00b7\7>\2\2\u00b7\u00b8\7@\2\2\u00b8>\3"+
		"\2\2\2\u00b9\u00ba\7>\2\2\u00ba@\3\2\2\2\u00bb\u00bc\7@\2\2\u00bcB\3\2"+
		"\2\2\u00bd\u00be\7>\2\2\u00be\u00bf\7?\2\2\u00bfD\3\2\2\2\u00c0\u00c1"+
		"\7@\2\2\u00c1\u00c2\7?\2\2\u00c2F\3\2\2\2\u00c3\u00c4\7.\2\2\u00c4H\3"+
		"\2\2\2\u00c5\u00c9\7\'\2\2\u00c6\u00c8\n\2\2\2\u00c7\u00c6\3\2\2\2\u00c8"+
		"\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00d8\3\2"+
		"\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7\61\2\2\u00cd\u00ce\7,\2\2\u00ce"+
		"\u00d2\3\2\2\2\u00cf\u00d1\13\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d4\3"+
		"\2\2\2\u00d2\u00d3\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d5\u00d6\7,\2\2\u00d6\u00d8\7\61\2\2\u00d7\u00c5\3\2"+
		"\2\2\u00d7\u00cc\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\b%\2\2\u00da"+
		"J\3\2\2\2\u00db\u00dd\7\17\2\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2"+
		"\u00dd\u00de\3\2\2\2\u00de\u00df\7\f\2\2\u00dfL\3\2\2\2\u00e0\u00e2\4"+
		"\62;\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3"+
		"\u00e4\3\2\2\2\u00e4N\3\2\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7p\2\2\u00e7"+
		"\u00ef\7v\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7w\2\2"+
		"\u00eb\u00ec\7d\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ef\7g\2\2\u00ee\u00e5"+
		"\3\2\2\2\u00ee\u00e8\3\2\2\2\u00efP\3\2\2\2\u00f0\u00f1\7d\2\2\u00f1\u00f2"+
		"\7t\2\2\u00f2\u00f3\7g\2\2\u00f3\u00f4\7c\2\2\u00f4\u0123\7m\2\2\u00f5"+
		"\u00f6\7e\2\2\u00f6\u00f7\7n\2\2\u00f7\u00f8\7c\2\2\u00f8\u00f9\7u\2\2"+
		"\u00f9\u0123\7u\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7n\2\2\u00fc\u00fd"+
		"\7u\2\2\u00fd\u0123\7g\2\2\u00fe\u00ff\7k\2\2\u00ff\u0123\7h\2\2\u0100"+
		"\u0101\7k\2\2\u0101\u0102\7o\2\2\u0102\u0103\7r\2\2\u0103\u0104\7q\2\2"+
		"\u0104\u0105\7t\2\2\u0105\u0123\7v\2\2\u0106\u0107\7r\2\2\u0107\u0108"+
		"\7w\2\2\u0108\u0109\7d\2\2\u0109\u010a\7n\2\2\u010a\u010b\7k\2\2\u010b"+
		"\u0123\7e\2\2\u010c\u010d\7u\2\2\u010d\u010e\7v\2\2\u010e\u010f\7c\2\2"+
		"\u010f\u0110\7v\2\2\u0110\u0111\7k\2\2\u0111\u0123\7e\2\2\u0112\u0113"+
		"\7v\2\2\u0113\u0114\7j\2\2\u0114\u0115\7t\2\2\u0115\u0116\7q\2\2\u0116"+
		"\u0117\7y\2\2\u0117\u0123\7u\2\2\u0118\u0119\7r\2\2\u0119\u011a\7t\2\2"+
		"\u011a\u011b\7k\2\2\u011b\u011c\7p\2\2\u011c\u0123\7v\2\2\u011d\u011e"+
		"\7k\2\2\u011e\u011f\7p\2\2\u011f\u0120\7r\2\2\u0120\u0121\7w\2\2\u0121"+
		"\u0123\7v\2\2\u0122\u00f0\3\2\2\2\u0122\u00f5\3\2\2\2\u0122\u00fa\3\2"+
		"\2\2\u0122\u00fe\3\2\2\2\u0122\u0100\3\2\2\2\u0122\u0106\3\2\2\2\u0122"+
		"\u010c\3\2\2\2\u0122\u0112\3\2\2\2\u0122\u0118\3\2\2\2\u0122\u011d\3\2"+
		"\2\2\u0123R\3\2\2\2\u0124\u0128\t\3\2\2\u0125\u0127\t\4\2\2\u0126\u0125"+
		"\3\2\2\2\u0127\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129"+
		"T\3\2\2\2\u012a\u0128\3\2\2\2\u012b\u012d\t\5\2\2\u012c\u012b\3\2\2\2"+
		"\u012d\u012e\3\2\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130"+
		"\3\2\2\2\u0130\u0131\b+\2\2\u0131V\3\2\2\2\u0132\u0133\13\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0135\b,\2\2\u0135X\3\2\2\2\f\2\u00c9\u00d2\u00d7"+
		"\u00dc\u00e3\u00ee\u0122\u0128\u012e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}