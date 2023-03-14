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
		T__31=32, T__32=33, T__33=34, COMMENTAIRE=35, NEWLINE=36, ENTIER=37, TYPE=38, 
		MOTCLE=39, IDENTIFIANT=40, WS=41, UNMATCH=42;
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
			"T__33", "COMMENTAIRE", "NEWLINE", "ENTIER", "TYPE", "MOTCLE", "IDENTIFIANT", 
			"WS", "UNMATCH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'('", "';'", "')'", "'if'", "'else'", "'while'", "'{'", 
			"'}'", "'='", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "'!'", 
			"'&&'", "'||'", "'true'", "'false'", "'input'", "'print'", "'-'", "'*'", 
			"'/'", "'+'", "'=='", "'!='", "'<>'", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
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
		"\4\0*\u0130\6\uffff\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2"+
		"\6\7\6\2\7\7\7\2\b\7\b\2\t\7\t\2\n\7\n\2\13\7\13\2\f\7\f\2\r\7\r\2\16"+
		"\7\16\2\17\7\17\2\20\7\20\2\21\7\21\2\22\7\22\2\23\7\23\2\24\7\24\2\25"+
		"\7\25\2\26\7\26\2\27\7\27\2\30\7\30\2\31\7\31\2\32\7\32\2\33\7\33\2\34"+
		"\7\34\2\35\7\35\2\36\7\36\2\37\7\37\2 \7 \2!\7!\2\"\7\"\2#\7#\2$\7$\2"+
		"%\7%\2&\7&\2\'\7\'\2(\7(\2)\7)\1\0\1\0\1\0\1\0\1\1\1\1\1\2\1\2\1\3\1\3"+
		"\1\4\1\4\1\4\1\5\1\5\1\5\1\5\1\5\1\6\1\6\1\6\1\6\1\6\1\6\1\7\1\7\1\b\1"+
		"\b\1\t\1\t\1\n\1\n\1\n\1\13\1\13\1\13\1\f\1\f\1\f\1\r\1\r\1\r\1\16\1\16"+
		"\1\16\1\17\1\17\1\17\1\20\1\20\1\21\1\21\1\21\1\22\1\22\1\22\1\23\1\23"+
		"\1\23\1\23\1\23\1\24\1\24\1\24\1\24\1\24\1\24\1\25\1\25\1\25\1\25\1\25"+
		"\1\25\1\26\1\26\1\26\1\26\1\26\1\26\1\27\1\27\1\30\1\30\1\31\1\31\1\32"+
		"\1\32\1\33\1\33\1\33\1\34\1\34\1\34\1\35\1\35\1\35\1\36\1\36\1\37\1\37"+
		"\1 \1 \1 \1!\1!\1!\1\"\1\"\5\"\u00c2\b\"\n\"\f\"\u00c5\t\"\1\"\1\"\1\""+
		"\1\"\5\"\u00cb\b\"\n\"\f\"\u00ce\t\"\1\"\1\"\3\"\u00d2\b\"\1\"\1\"\1#"+
		"\3#\u00d7\b#\1#\1#\1$\4$\u00dc\b$\13$\f$\u00dd\1%\1%\1%\1%\1%\1%\1%\1"+
		"%\1%\3%\u00e9\b%\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1"+
		"&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1&\1"+
		"&\1&\1&\1&\1&\1&\1&\1&\1&\1&\3&\u011d\b&\1\'\1\'\5\'\u0121\b\'\n\'\f\'"+
		"\u0124\t\'\1(\4(\u0127\b(\13(\f(\u0128\1(\1(\1)\1)\1)\1)\1\u00cc\0*\1"+
		"\1\3\2\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17"+
		"\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36"+
		"=\37? A!C\"E#G$I%K&M\'O(Q)S*\1\0\4\2\0\n\n\r\r\3\0AZ__az\4\0\609AZ__a"+
		"z\2\0\t\t  \u0140\0\1\1\0\0\0\0\3\1\0\0\0\0\5\1\0\0\0\0\7\1\0\0\0\0\t"+
		"\1\0\0\0\0\13\1\0\0\0\0\r\1\0\0\0\0\17\1\0\0\0\0\21\1\0\0\0\0\23\1\0\0"+
		"\0\0\25\1\0\0\0\0\27\1\0\0\0\0\31\1\0\0\0\0\33\1\0\0\0\0\35\1\0\0\0\0"+
		"\37\1\0\0\0\0!\1\0\0\0\0#\1\0\0\0\0%\1\0\0\0\0\'\1\0\0\0\0)\1\0\0\0\0"+
		"+\1\0\0\0\0-\1\0\0\0\0/\1\0\0\0\0\61\1\0\0\0\0\63\1\0\0\0\0\65\1\0\0\0"+
		"\0\67\1\0\0\0\09\1\0\0\0\0;\1\0\0\0\0=\1\0\0\0\0?\1\0\0\0\0A\1\0\0\0\0"+
		"C\1\0\0\0\0E\1\0\0\0\0G\1\0\0\0\0I\1\0\0\0\0K\1\0\0\0\0M\1\0\0\0\0O\1"+
		"\0\0\0\0Q\1\0\0\0\0S\1\0\0\0\1U\1\0\0\0\3Y\1\0\0\0\5[\1\0\0\0\7]\1\0\0"+
		"\0\t_\1\0\0\0\13b\1\0\0\0\rg\1\0\0\0\17m\1\0\0\0\21o\1\0\0\0\23q\1\0\0"+
		"\0\25s\1\0\0\0\27v\1\0\0\0\31y\1\0\0\0\33|\1\0\0\0\35\177\1\0\0\0\37\u0082"+
		"\1\0\0\0!\u0085\1\0\0\0#\u0087\1\0\0\0%\u008a\1\0\0\0\'\u008d\1\0\0\0"+
		")\u0092\1\0\0\0+\u0098\1\0\0\0-\u009e\1\0\0\0/\u00a4\1\0\0\0\61\u00a6"+
		"\1\0\0\0\63\u00a8\1\0\0\0\65\u00aa\1\0\0\0\67\u00ac\1\0\0\09\u00af\1\0"+
		"\0\0;\u00b2\1\0\0\0=\u00b5\1\0\0\0?\u00b7\1\0\0\0A\u00b9\1\0\0\0C\u00bc"+
		"\1\0\0\0E\u00d1\1\0\0\0G\u00d6\1\0\0\0I\u00db\1\0\0\0K\u00e8\1\0\0\0M"+
		"\u011c\1\0\0\0O\u011e\1\0\0\0Q\u0126\1\0\0\0S\u012c\1\0\0\0UV\5f\0\0V"+
		"W\5o\0\0WX\5r\0\0X\2\1\0\0\0YZ\5(\0\0Z\4\1\0\0\0[\\\5;\0\0\\\6\1\0\0\0"+
		"]^\5)\0\0^\b\1\0\0\0_`\5i\0\0`a\5f\0\0a\n\1\0\0\0bc\5e\0\0cd\5l\0\0de"+
		"\5s\0\0ef\5e\0\0f\f\1\0\0\0gh\5w\0\0hi\5h\0\0ij\5i\0\0jk\5l\0\0kl\5e\0"+
		"\0l\16\1\0\0\0mn\5{\0\0n\20\1\0\0\0op\5}\0\0p\22\1\0\0\0qr\5=\0\0r\24"+
		"\1\0\0\0st\5+\0\0tu\5=\0\0u\26\1\0\0\0vw\5-\0\0wx\5=\0\0x\30\1\0\0\0y"+
		"z\5*\0\0z{\5=\0\0{\32\1\0\0\0|}\5/\0\0}~\5=\0\0~\34\1\0\0\0\177\u0080"+
		"\5+\0\0\u0080\u0081\5+\0\0\u0081\36\1\0\0\0\u0082\u0083\5-\0\0\u0083\u0084"+
		"\5-\0\0\u0084 \1\0\0\0\u0085\u0086\5!\0\0\u0086\"\1\0\0\0\u0087\u0088"+
		"\5&\0\0\u0088\u0089\5&\0\0\u0089$\1\0\0\0\u008a\u008b\5|\0\0\u008b\u008c"+
		"\5|\0\0\u008c&\1\0\0\0\u008d\u008e\5t\0\0\u008e\u008f\5r\0\0\u008f\u0090"+
		"\5u\0\0\u0090\u0091\5e\0\0\u0091(\1\0\0\0\u0092\u0093\5f\0\0\u0093\u0094"+
		"\5a\0\0\u0094\u0095\5l\0\0\u0095\u0096\5s\0\0\u0096\u0097\5e\0\0\u0097"+
		"*\1\0\0\0\u0098\u0099\5i\0\0\u0099\u009a\5n\0\0\u009a\u009b\5p\0\0\u009b"+
		"\u009c\5u\0\0\u009c\u009d\5t\0\0\u009d,\1\0\0\0\u009e\u009f\5p\0\0\u009f"+
		"\u00a0\5r\0\0\u00a0\u00a1\5i\0\0\u00a1\u00a2\5n\0\0\u00a2\u00a3\5t\0\0"+
		"\u00a3.\1\0\0\0\u00a4\u00a5\5-\0\0\u00a5\60\1\0\0\0\u00a6\u00a7\5*\0\0"+
		"\u00a7\62\1\0\0\0\u00a8\u00a9\5/\0\0\u00a9\64\1\0\0\0\u00aa\u00ab\5+\0"+
		"\0\u00ab\66\1\0\0\0\u00ac\u00ad\5=\0\0\u00ad\u00ae\5=\0\0\u00ae8\1\0\0"+
		"\0\u00af\u00b0\5!\0\0\u00b0\u00b1\5=\0\0\u00b1:\1\0\0\0\u00b2\u00b3\5"+
		"<\0\0\u00b3\u00b4\5>\0\0\u00b4<\1\0\0\0\u00b5\u00b6\5<\0\0\u00b6>\1\0"+
		"\0\0\u00b7\u00b8\5>\0\0\u00b8@\1\0\0\0\u00b9\u00ba\5<\0\0\u00ba\u00bb"+
		"\5=\0\0\u00bbB\1\0\0\0\u00bc\u00bd\5>\0\0\u00bd\u00be\5=\0\0\u00beD\1"+
		"\0\0\0\u00bf\u00c3\5%\0\0\u00c0\u00c2\b\0\0\0\u00c1\u00c0\1\0\0\0\u00c2"+
		"\u00c5\1\0\0\0\u00c3\u00c1\1\0\0\0\u00c3\u00c4\1\0\0\0\u00c4\u00d2\1\0"+
		"\0\0\u00c5\u00c3\1\0\0\0\u00c6\u00c7\5/\0\0\u00c7\u00c8\5*\0\0\u00c8\u00cc"+
		"\1\0\0\0\u00c9\u00cb\t\0\0\0\u00ca\u00c9\1\0\0\0\u00cb\u00ce\1\0\0\0\u00cc"+
		"\u00cd\1\0\0\0\u00cc\u00ca\1\0\0\0\u00cd\u00cf\1\0\0\0\u00ce\u00cc\1\0"+
		"\0\0\u00cf\u00d0\5*\0\0\u00d0\u00d2\5/\0\0\u00d1\u00bf\1\0\0\0\u00d1\u00c6"+
		"\1\0\0\0\u00d2\u00d3\1\0\0\0\u00d3\u00d4\6\"\0\0\u00d4F\1\0\0\0\u00d5"+
		"\u00d7\5\r\0\0\u00d6\u00d5\1\0\0\0\u00d6\u00d7\1\0\0\0\u00d7\u00d8\1\0"+
		"\0\0\u00d8\u00d9\5\n\0\0\u00d9H\1\0\0\0\u00da\u00dc\2\609\0\u00db\u00da"+
		"\1\0\0\0\u00dc\u00dd\1\0\0\0\u00dd\u00db\1\0\0\0\u00dd\u00de\1\0\0\0\u00de"+
		"J\1\0\0\0\u00df\u00e0\5i\0\0\u00e0\u00e1\5n\0\0\u00e1\u00e9\5t\0\0\u00e2"+
		"\u00e3\5d\0\0\u00e3\u00e4\5o\0\0\u00e4\u00e5\5u\0\0\u00e5\u00e6\5b\0\0"+
		"\u00e6\u00e7\5l\0\0\u00e7\u00e9\5e\0\0\u00e8\u00df\1\0\0\0\u00e8\u00e2"+
		"\1\0\0\0\u00e9L\1\0\0\0\u00ea\u00eb\5b\0\0\u00eb\u00ec\5r\0\0\u00ec\u00ed"+
		"\5e\0\0\u00ed\u00ee\5a\0\0\u00ee\u011d\5k\0\0\u00ef\u00f0\5c\0\0\u00f0"+
		"\u00f1\5l\0\0\u00f1\u00f2\5a\0\0\u00f2\u00f3\5s\0\0\u00f3\u011d\5s\0\0"+
		"\u00f4\u00f5\5e\0\0\u00f5\u00f6\5l\0\0\u00f6\u00f7\5s\0\0\u00f7\u011d"+
		"\5e\0\0\u00f8\u00f9\5i\0\0\u00f9\u011d\5f\0\0\u00fa\u00fb\5i\0\0\u00fb"+
		"\u00fc\5m\0\0\u00fc\u00fd\5p\0\0\u00fd\u00fe\5o\0\0\u00fe\u00ff\5r\0\0"+
		"\u00ff\u011d\5t\0\0\u0100\u0101\5p\0\0\u0101\u0102\5u\0\0\u0102\u0103"+
		"\5b\0\0\u0103\u0104\5l\0\0\u0104\u0105\5i\0\0\u0105\u011d\5c\0\0\u0106"+
		"\u0107\5s\0\0\u0107\u0108\5t\0\0\u0108\u0109\5a\0\0\u0109\u010a\5t\0\0"+
		"\u010a\u010b\5i\0\0\u010b\u011d\5c\0\0\u010c\u010d\5t\0\0\u010d\u010e"+
		"\5h\0\0\u010e\u010f\5r\0\0\u010f\u0110\5o\0\0\u0110\u0111\5w\0\0\u0111"+
		"\u011d\5s\0\0\u0112\u0113\5p\0\0\u0113\u0114\5r\0\0\u0114\u0115\5i\0\0"+
		"\u0115\u0116\5n\0\0\u0116\u011d\5t\0\0\u0117\u0118\5i\0\0\u0118\u0119"+
		"\5n\0\0\u0119\u011a\5p\0\0\u011a\u011b\5u\0\0\u011b\u011d\5t\0\0\u011c"+
		"\u00ea\1\0\0\0\u011c\u00ef\1\0\0\0\u011c\u00f4\1\0\0\0\u011c\u00f8\1\0"+
		"\0\0\u011c\u00fa\1\0\0\0\u011c\u0100\1\0\0\0\u011c\u0106\1\0\0\0\u011c"+
		"\u010c\1\0\0\0\u011c\u0112\1\0\0\0\u011c\u0117\1\0\0\0\u011dN\1\0\0\0"+
		"\u011e\u0122\7\1\0\0\u011f\u0121\7\2\0\0\u0120\u011f\1\0\0\0\u0121\u0124"+
		"\1\0\0\0\u0122\u0120\1\0\0\0\u0122\u0123\1\0\0\0\u0123P\1\0\0\0\u0124"+
		"\u0122\1\0\0\0\u0125\u0127\7\3\0\0\u0126\u0125\1\0\0\0\u0127\u0128\1\0"+
		"\0\0\u0128\u0126\1\0\0\0\u0128\u0129\1\0\0\0\u0129\u012a\1\0\0\0\u012a"+
		"\u012b\6(\0\0\u012bR\1\0\0\0\u012c\u012d\t\0\0\0\u012d\u012e\1\0\0\0\u012e"+
		"\u012f\6)\0\0\u012fT\1\0\0\0\n\0\u00c3\u00cc\u00d1\u00d6\u00dd\u00e8\u011c"+
		"\u0122\u0128\1\6\0\0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}