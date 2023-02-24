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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, NEWLINE=9, 
		ENTIER=10, TYPE=11, MOTCLE=12, IDENTIFIANT=13, WS=14, UNMATCH=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "NEWLINE", 
			"ENTIER", "TYPE", "MOTCLE", "IDENTIFIANT", "WS", "UNMATCH"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'('", "')'", "'-'", "'*'", "'/'", "'+'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "NEWLINE", "ENTIER", 
			"TYPE", "MOTCLE", "IDENTIFIANT", "WS", "UNMATCH"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\21\u0082\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\5\n\63\n\n\3\n\3"+
		"\n\3\13\6\138\n\13\r\13\16\139\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"E\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\ro\n\r\3\16\3\16\7\16s\n\16\f\16\16\16v\13"+
		"\16\3\17\6\17y\n\17\r\17\16\17z\3\17\3\17\3\20\3\20\3\20\3\20\2\2\21\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21\3\2\5\5\2C\\aac|\6\2\62;C\\aac|\4\2\13\13\"\"\2\u008d\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3\2\2\2\7%\3\2\2"+
		"\2\t\'\3\2\2\2\13)\3\2\2\2\r+\3\2\2\2\17-\3\2\2\2\21/\3\2\2\2\23\62\3"+
		"\2\2\2\25\67\3\2\2\2\27D\3\2\2\2\31n\3\2\2\2\33p\3\2\2\2\35x\3\2\2\2\37"+
		"~\3\2\2\2!\"\7?\2\2\"\4\3\2\2\2#$\7*\2\2$\6\3\2\2\2%&\7+\2\2&\b\3\2\2"+
		"\2\'(\7/\2\2(\n\3\2\2\2)*\7,\2\2*\f\3\2\2\2+,\7\61\2\2,\16\3\2\2\2-.\7"+
		"-\2\2.\20\3\2\2\2/\60\7=\2\2\60\22\3\2\2\2\61\63\7\17\2\2\62\61\3\2\2"+
		"\2\62\63\3\2\2\2\63\64\3\2\2\2\64\65\7\f\2\2\65\24\3\2\2\2\668\4\62;\2"+
		"\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:\26\3\2\2\2;<\7k\2\2<="+
		"\7p\2\2=E\7v\2\2>?\7f\2\2?@\7q\2\2@A\7w\2\2AB\7d\2\2BC\7n\2\2CE\7g\2\2"+
		"D;\3\2\2\2D>\3\2\2\2E\30\3\2\2\2FG\7d\2\2GH\7t\2\2HI\7g\2\2IJ\7c\2\2J"+
		"o\7m\2\2KL\7e\2\2LM\7n\2\2MN\7c\2\2NO\7u\2\2Oo\7u\2\2PQ\7g\2\2QR\7n\2"+
		"\2RS\7u\2\2So\7g\2\2TU\7k\2\2Uo\7h\2\2VW\7k\2\2WX\7o\2\2XY\7r\2\2YZ\7"+
		"q\2\2Z[\7t\2\2[o\7v\2\2\\]\7r\2\2]^\7w\2\2^_\7d\2\2_`\7n\2\2`a\7k\2\2"+
		"ao\7e\2\2bc\7u\2\2cd\7v\2\2de\7c\2\2ef\7v\2\2fg\7k\2\2go\7e\2\2hi\7v\2"+
		"\2ij\7j\2\2jk\7t\2\2kl\7q\2\2lm\7y\2\2mo\7u\2\2nF\3\2\2\2nK\3\2\2\2nP"+
		"\3\2\2\2nT\3\2\2\2nV\3\2\2\2n\\\3\2\2\2nb\3\2\2\2nh\3\2\2\2o\32\3\2\2"+
		"\2pt\t\2\2\2qs\t\3\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2u\34\3\2"+
		"\2\2vt\3\2\2\2wy\t\4\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2"+
		"\2\2|}\b\17\2\2}\36\3\2\2\2~\177\13\2\2\2\177\u0080\3\2\2\2\u0080\u0081"+
		"\b\20\2\2\u0081 \3\2\2\2\t\2\629Dntz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}