<<<<<<< HEAD
// Generated from java-escape by ANTLR 4.11.1
=======
// Generated from Calculette.g4 by ANTLR 4.12.0
>>>>>>> gireg
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CalculetteParser extends Parser {
<<<<<<< HEAD
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }
=======
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }
>>>>>>> gireg

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
<<<<<<< HEAD
		T__9=10, COMMENTAIRE=11, NEWLINE=12, ENTIER=13, TYPE=14, MOTCLE=15, IDENTIFIANT=16, 
		WS=17, UNMATCH=18;
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_decl = 2, RULE_assignation = 3, 
		RULE_entree = 4, RULE_sortie = 5, RULE_instruction = 6, RULE_expression = 7, 
		RULE_finInstruction = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calcul", "decl", "assignation", "entree", "sortie", "instruction", 
			"expression", "finInstruction"
=======
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, NEWLINE=19, ENTIER=20, TYPE=21, MOTCLE=22, IDENTIFIANT=23, WS=24, 
		UNMATCH=25;
	public static final int
		RULE_start = 0, RULE_calcul = 1, RULE_decl = 2, RULE_assignation = 3, 
		RULE_condition = 4, RULE_entree = 5, RULE_sortie = 6, RULE_instruction = 7, 
		RULE_expression = 8, RULE_finInstruction = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "calcul", "decl", "assignation", "condition", "entree", "sortie", 
			"instruction", "expression", "finInstruction"
>>>>>>> gireg
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
<<<<<<< HEAD
			null, "'='", "'input'", "'('", "')'", "'print'", "'-'", "'*'", "'/'", 
			"'+'", "';'"
=======
			null, "'='", "'=='", "'!='", "'<'", "'<='", "'>'", "'>='", "'true'", 
			"'false'", "'input'", "'('", "')'", "'print'", "'-'", "'*'", "'/'", "'+'", 
			"';'"
>>>>>>> gireg
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
<<<<<<< HEAD
			null, null, null, null, null, null, null, null, null, null, null, "COMMENTAIRE", 
			"NEWLINE", "ENTIER", "TYPE", "MOTCLE", "IDENTIFIANT", "WS", "UNMATCH"
=======
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "NEWLINE", "ENTIER", "TYPE", 
			"MOTCLE", "IDENTIFIANT", "WS", "UNMATCH"
>>>>>>> gireg
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   private TablesSymboles tablesSymboles = new TablesSymboles();
	        
	public CalculetteParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public CalculContext calcul() {
			return getRuleContext(CalculContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalculetteParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(18);
			calcul();
			setState(19);
=======
			setState(20);
			calcul();
			setState(21);
>>>>>>> gireg
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalculContext extends ParserRuleContext {
		public String code;
		public DeclContext decl;
		public InstructionContext instruction;
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public CalculContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcul; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterCalcul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitCalcul(this);
		}
	}

	public final CalculContext calcul() throws RecognitionException {
		CalculContext _localctx = new CalculContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_calcul);
		 ((CalculContext)_localctx).code =  new String(); 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(26);
=======
			setState(28);
>>>>>>> gireg
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
<<<<<<< HEAD
				setState(21);
=======
				setState(23);
>>>>>>> gireg
				((CalculContext)_localctx).decl = decl();
				 _localctx.code += ((CalculContext)_localctx).decl.code; 
				}
				}
<<<<<<< HEAD
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
=======
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
>>>>>>> gireg
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
<<<<<<< HEAD
				setState(29);
				match(NEWLINE);
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 73836L) != 0) {
				{
				{
				setState(35);
=======
				setState(31);
				match(NEWLINE);
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9464832L) != 0)) {
				{
				{
				setState(37);
>>>>>>> gireg
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
<<<<<<< HEAD
				setState(42);
=======
				setState(44);
>>>>>>> gireg
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			 _localctx.code += "  HALT\n"; 
			}
			_ctx.stop = _input.LT(-1);
			 System.out.println(_localctx.code); 
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclContext extends ParserRuleContext {
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public ExpressionContext expression;
		public TerminalNode TYPE() { return getToken(CalculetteParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl);
		try {
<<<<<<< HEAD
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(46);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(47);
				finInstruction();

				            if ((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("int")){
				                ((DeclContext)_localctx).code =  "PUSHI 0\n";
				                tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),"int");
				            }
				            else {
				                ((DeclContext)_localctx).code =  "PUSHI 0\n";
				                tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),"double");
				            }
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(51);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(52);
				match(T__0);
				setState(53);
				((DeclContext)_localctx).expression = expression(0);
				setState(54);
				finInstruction();

				            if ((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("int")){
				                ((DeclContext)_localctx).code =  "PUSHI 0\n" + ((DeclContext)_localctx).expression.code + "\n";
				                tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),"int");
				            }
				            else {
				                ((DeclContext)_localctx).code =  "PUSHI 0\n" + ((DeclContext)_localctx).expression.code + "\n";
				                tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),"double");
				            }
				        
				}
				break;
=======
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			((DeclContext)_localctx).TYPE = match(TYPE);
			setState(48);
			((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(49);
			finInstruction();

			            if ((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("int")){
			                ((DeclContext)_localctx).code =  "PUSHI 0\n";
			                tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),"int");
			            }
			            else {
			                ((DeclContext)_localctx).code =  "PUSHI 0\n";
			                tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null),"double");
			            }
			        
>>>>>>> gireg
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignationContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public ExpressionContext expression;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterAssignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitAssignation(this);
		}
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignation);
		try {
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(59);
			((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(60);
			match(T__0);
			setState(61);
=======
			setState(52);
			((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(53);
			match(T__0);
			setState(54);
>>>>>>> gireg
			((AssignationContext)_localctx).expression = expression(0);
			  
			            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
			            ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expression.code + "STOREG " + vi.address + "\n";
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
<<<<<<< HEAD
=======
	public static class ConditionContext extends ParserRuleContext {
		public String code;
		public ExpressionContext g;
		public Token op;
		public ExpressionContext d;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		int _la;
		try {
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__13:
			case ENTIER:
			case IDENTIFIANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				((ConditionContext)_localctx).g = expression(0);
				setState(58);
				((ConditionContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 252L) != 0)) ) {
					((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(59);
				((ConditionContext)_localctx).d = expression(0);
				((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).g.code + ((ConditionContext)_localctx).d.code + ((((ConditionContext)_localctx).op!=null?((ConditionContext)_localctx).op.getText():null))+ "\n";
				        
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__7);
				((ConditionContext)_localctx).code =  "PUSHI 1\n";
				        
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(T__8);
				((ConditionContext)_localctx).code =  "PUSHI 0\n";
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
>>>>>>> gireg
	public static class EntreeContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public EntreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entree; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterEntree(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitEntree(this);
		}
	}

	public final EntreeContext entree() throws RecognitionException {
		EntreeContext _localctx = new EntreeContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 8, RULE_entree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(T__1);
			setState(65);
			match(T__2);
			setState(66);
			((EntreeContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(67);
			match(T__3);
=======
		enterRule(_localctx, 10, RULE_entree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__9);
			setState(69);
			match(T__10);
			setState(70);
			((EntreeContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(71);
			match(T__11);
>>>>>>> gireg

			            VariableInfo vi = tablesSymboles.getVar((((EntreeContext)_localctx).IDENTIFIANT!=null?((EntreeContext)_localctx).IDENTIFIANT.getText():null));
			            if (vi.type == "int"){
			                ((EntreeContext)_localctx).code =  "READ\n" + "STOREG " + vi.address + "\n";
			            }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SortieContext extends ParserRuleContext {
		public String code;
		public ExpressionContext expression;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SortieContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortie; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterSortie(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitSortie(this);
		}
	}

	public final SortieContext sortie() throws RecognitionException {
		SortieContext _localctx = new SortieContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 10, RULE_sortie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__4);
			setState(71);
			match(T__2);
			setState(72);
			((SortieContext)_localctx).expression = expression(0);
			setState(73);
			match(T__3);
=======
		enterRule(_localctx, 12, RULE_sortie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(T__12);
			setState(75);
			match(T__10);
			setState(76);
			((SortieContext)_localctx).expression = expression(0);
			setState(77);
			match(T__11);
>>>>>>> gireg

			           ((SortieContext)_localctx).code =  ((SortieContext)_localctx).expression.code +"WRITE\nPOP \n";
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionContext extends ParserRuleContext {
		public String code;
		public ExpressionContext expression;
		public AssignationContext assignation;
		public EntreeContext entree;
		public SortieContext sortie;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
		}
		public AssignationContext assignation() {
			return getRuleContext(AssignationContext.class,0);
		}
		public EntreeContext entree() {
			return getRuleContext(EntreeContext.class,0);
		}
		public SortieContext sortie() {
			return getRuleContext(SortieContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitInstruction(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 12, RULE_instruction);
		try {
			setState(92);
=======
		enterRule(_localctx, 14, RULE_instruction);
		try {
			setState(96);
>>>>>>> gireg
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
<<<<<<< HEAD
				setState(76);
				((InstructionContext)_localctx).expression = expression(0);
				setState(77);
=======
				setState(80);
				((InstructionContext)_localctx).expression = expression(0);
				setState(81);
>>>>>>> gireg
				finInstruction();
				 
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
<<<<<<< HEAD
				setState(80);
				((InstructionContext)_localctx).assignation = assignation();
				setState(81);
=======
				setState(84);
				((InstructionContext)_localctx).assignation = assignation();
				setState(85);
>>>>>>> gireg
				finInstruction();
				 
						    ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).assignation.code;
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
<<<<<<< HEAD
				setState(84);
				((InstructionContext)_localctx).entree = entree();
				setState(85);
=======
				setState(88);
				((InstructionContext)_localctx).entree = entree();
				setState(89);
>>>>>>> gireg
				finInstruction();
				   
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).entree.code;
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
<<<<<<< HEAD
				setState(88);
				((InstructionContext)_localctx).sortie = sortie();
				setState(89);
=======
				setState(92);
				((InstructionContext)_localctx).sortie = sortie();
				setState(93);
>>>>>>> gireg
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).sortie.code;
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public String code;
		public ExpressionContext a;
		public ExpressionContext c;
		public ExpressionContext d;
		public Token ENTIER;
		public Token IDENTIFIANT;
		public Token op;
		public ExpressionContext b;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ENTIER() { return getToken(CalculetteParser.ENTIER, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
<<<<<<< HEAD
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
=======
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expression, _p);
>>>>>>> gireg
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				{
				setState(95);
				match(T__2);
				setState(96);
				((ExpressionContext)_localctx).c = expression(0);
				setState(97);
				match(T__3);
=======
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				setState(99);
				match(T__10);
				setState(100);
				((ExpressionContext)_localctx).c = expression(0);
				setState(101);
				match(T__11);
>>>>>>> gireg

				            ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).c.code;
				        
				}
				break;
<<<<<<< HEAD
			case T__5:
				{
				setState(100);
				match(T__5);
				setState(101);
=======
			case T__13:
				{
				setState(104);
				match(T__13);
				setState(105);
>>>>>>> gireg
				((ExpressionContext)_localctx).d = expression(5);

				            ((ExpressionContext)_localctx).code =  "PUSHI 0\n"+ ((ExpressionContext)_localctx).d.code + "SUB\n";
				        
				}
				break;
			case ENTIER:
				{
<<<<<<< HEAD
				setState(104);
=======
				setState(108);
>>>>>>> gireg
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);

				            ((ExpressionContext)_localctx).code =  "PUSHI " + (((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null) + "\n";
				        
				}
				break;
			case IDENTIFIANT:
				{
<<<<<<< HEAD
				setState(106);
=======
				setState(110);
>>>>>>> gireg
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				 
				        VariableInfo vi = tablesSymboles.getVar((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));            
				        ((ExpressionContext)_localctx).code =  "PUSHG "+ vi.address + "\n";
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
<<<<<<< HEAD
			setState(122);
=======
			setState(126);
>>>>>>> gireg
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
<<<<<<< HEAD
					setState(120);
=======
					setState(124);
>>>>>>> gireg
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
<<<<<<< HEAD
						setState(110);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(111);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__6 || _la==T__7) ) {
=======
						setState(114);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(115);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__15) ) {
>>>>>>> gireg
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
<<<<<<< HEAD
						setState(112);
=======
						setState(116);
>>>>>>> gireg
						((ExpressionContext)_localctx).b = expression(5);

						                      if((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).equals("*")){ ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "MUL\n";}
						                      else {((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "DIV\n";}
						                  
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
<<<<<<< HEAD
						setState(115);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(116);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__8) ) {
=======
						setState(119);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(120);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__13 || _la==T__16) ) {
>>>>>>> gireg
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
<<<<<<< HEAD
						setState(117);
=======
						setState(121);
>>>>>>> gireg
						((ExpressionContext)_localctx).b = expression(4);

						                      if((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).equals("+")){ ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "ADD\n";}
						                      else {((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "SUB\n";}
						                  
						}
						break;
					}
					} 
				}
<<<<<<< HEAD
				setState(124);
=======
				setState(128);
>>>>>>> gireg
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FinInstructionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public FinInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finInstruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterFinInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitFinInstruction(this);
		}
	}

	public final FinInstructionContext finInstruction() throws RecognitionException {
		FinInstructionContext _localctx = new FinInstructionContext(_ctx, getState());
<<<<<<< HEAD
		enterRule(_localctx, 16, RULE_finInstruction);
=======
		enterRule(_localctx, 18, RULE_finInstruction);
>>>>>>> gireg
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
<<<<<<< HEAD
			setState(126); 
=======
			setState(130); 
>>>>>>> gireg
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
<<<<<<< HEAD
					setState(125);
					_la = _input.LA(1);
					if ( !(_la==T__9 || _la==NEWLINE) ) {
=======
					setState(129);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==NEWLINE) ) {
>>>>>>> gireg
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
<<<<<<< HEAD
				setState(128); 
=======
				setState(132); 
>>>>>>> gireg
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
<<<<<<< HEAD
		case 7:
=======
		case 8:
>>>>>>> gireg
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
<<<<<<< HEAD
		"\u0004\u0001\u0012\u0083\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0005\u0001\u0019\b\u0001\n\u0001\f\u0001\u001c\t\u0001"+
		"\u0001\u0001\u0005\u0001\u001f\b\u0001\n\u0001\f\u0001\"\t\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\'\b\u0001\n\u0001\f\u0001*"+
		"\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002:\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006]\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007m\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007y\b\u0007\n\u0007\f\u0007|\t\u0007\u0001\b\u0004\b\u007f\b\b\u000b"+
		"\b\f\b\u0080\u0001\b\u0000\u0001\u000e\t\u0000\u0002\u0004\u0006\b\n\f"+
		"\u000e\u0010\u0000\u0003\u0001\u0000\u0007\b\u0002\u0000\u0006\u0006\t"+
		"\t\u0002\u0000\n\n\f\f\u0086\u0000\u0012\u0001\u0000\u0000\u0000\u0002"+
		"\u001a\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006;\u0001"+
		"\u0000\u0000\u0000\b@\u0001\u0000\u0000\u0000\nF\u0001\u0000\u0000\u0000"+
		"\f\\\u0001\u0000\u0000\u0000\u000el\u0001\u0000\u0000\u0000\u0010~\u0001"+
		"\u0000\u0000\u0000\u0012\u0013\u0003\u0002\u0001\u0000\u0013\u0014\u0005"+
		"\u0000\u0000\u0001\u0014\u0001\u0001\u0000\u0000\u0000\u0015\u0016\u0003"+
		"\u0004\u0002\u0000\u0016\u0017\u0006\u0001\uffff\uffff\u0000\u0017\u0019"+
		"\u0001\u0000\u0000\u0000\u0018\u0015\u0001\u0000\u0000\u0000\u0019\u001c"+
		"\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b"+
		"\u0001\u0000\u0000\u0000\u001b \u0001\u0000\u0000\u0000\u001c\u001a\u0001"+
		"\u0000\u0000\u0000\u001d\u001f\u0005\f\u0000\u0000\u001e\u001d\u0001\u0000"+
		"\u0000\u0000\u001f\"\u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000"+
		"\u0000 !\u0001\u0000\u0000\u0000!(\u0001\u0000\u0000\u0000\" \u0001\u0000"+
		"\u0000\u0000#$\u0003\f\u0006\u0000$%\u0006\u0001\uffff\uffff\u0000%\'"+
		"\u0001\u0000\u0000\u0000&#\u0001\u0000\u0000\u0000\'*\u0001\u0000\u0000"+
		"\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)+\u0001\u0000"+
		"\u0000\u0000*(\u0001\u0000\u0000\u0000+,\u0006\u0001\uffff\uffff\u0000"+
		",\u0003\u0001\u0000\u0000\u0000-.\u0005\u000e\u0000\u0000./\u0005\u0010"+
		"\u0000\u0000/0\u0003\u0010\b\u000001\u0006\u0002\uffff\uffff\u00001:\u0001"+
		"\u0000\u0000\u000023\u0005\u000e\u0000\u000034\u0005\u0010\u0000\u0000"+
		"45\u0005\u0001\u0000\u000056\u0003\u000e\u0007\u000067\u0003\u0010\b\u0000"+
		"78\u0006\u0002\uffff\uffff\u00008:\u0001\u0000\u0000\u00009-\u0001\u0000"+
		"\u0000\u000092\u0001\u0000\u0000\u0000:\u0005\u0001\u0000\u0000\u0000"+
		";<\u0005\u0010\u0000\u0000<=\u0005\u0001\u0000\u0000=>\u0003\u000e\u0007"+
		"\u0000>?\u0006\u0003\uffff\uffff\u0000?\u0007\u0001\u0000\u0000\u0000"+
		"@A\u0005\u0002\u0000\u0000AB\u0005\u0003\u0000\u0000BC\u0005\u0010\u0000"+
		"\u0000CD\u0005\u0004\u0000\u0000DE\u0006\u0004\uffff\uffff\u0000E\t\u0001"+
		"\u0000\u0000\u0000FG\u0005\u0005\u0000\u0000GH\u0005\u0003\u0000\u0000"+
		"HI\u0003\u000e\u0007\u0000IJ\u0005\u0004\u0000\u0000JK\u0006\u0005\uffff"+
		"\uffff\u0000K\u000b\u0001\u0000\u0000\u0000LM\u0003\u000e\u0007\u0000"+
		"MN\u0003\u0010\b\u0000NO\u0006\u0006\uffff\uffff\u0000O]\u0001\u0000\u0000"+
		"\u0000PQ\u0003\u0006\u0003\u0000QR\u0003\u0010\b\u0000RS\u0006\u0006\uffff"+
		"\uffff\u0000S]\u0001\u0000\u0000\u0000TU\u0003\b\u0004\u0000UV\u0003\u0010"+
		"\b\u0000VW\u0006\u0006\uffff\uffff\u0000W]\u0001\u0000\u0000\u0000XY\u0003"+
		"\n\u0005\u0000YZ\u0003\u0010\b\u0000Z[\u0006\u0006\uffff\uffff\u0000["+
		"]\u0001\u0000\u0000\u0000\\L\u0001\u0000\u0000\u0000\\P\u0001\u0000\u0000"+
		"\u0000\\T\u0001\u0000\u0000\u0000\\X\u0001\u0000\u0000\u0000]\r\u0001"+
		"\u0000\u0000\u0000^_\u0006\u0007\uffff\uffff\u0000_`\u0005\u0003\u0000"+
		"\u0000`a\u0003\u000e\u0007\u0000ab\u0005\u0004\u0000\u0000bc\u0006\u0007"+
		"\uffff\uffff\u0000cm\u0001\u0000\u0000\u0000de\u0005\u0006\u0000\u0000"+
		"ef\u0003\u000e\u0007\u0005fg\u0006\u0007\uffff\uffff\u0000gm\u0001\u0000"+
		"\u0000\u0000hi\u0005\r\u0000\u0000im\u0006\u0007\uffff\uffff\u0000jk\u0005"+
		"\u0010\u0000\u0000km\u0006\u0007\uffff\uffff\u0000l^\u0001\u0000\u0000"+
		"\u0000ld\u0001\u0000\u0000\u0000lh\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000mz\u0001\u0000\u0000\u0000no\n\u0004\u0000\u0000op\u0007\u0000"+
		"\u0000\u0000pq\u0003\u000e\u0007\u0005qr\u0006\u0007\uffff\uffff\u0000"+
		"ry\u0001\u0000\u0000\u0000st\n\u0003\u0000\u0000tu\u0007\u0001\u0000\u0000"+
		"uv\u0003\u000e\u0007\u0004vw\u0006\u0007\uffff\uffff\u0000wy\u0001\u0000"+
		"\u0000\u0000xn\u0001\u0000\u0000\u0000xs\u0001\u0000\u0000\u0000y|\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{\u000f\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}\u007f\u0007"+
		"\u0002\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u0080\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000"+
		"\u0081\u0011\u0001\u0000\u0000\u0000\t\u001a (9\\lxz\u0080";
=======
		"\u0004\u0001\u0019\u0087\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u001b\b\u0001\n\u0001\f\u0001"+
		"\u001e\t\u0001\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001$\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001)\b\u0001\n\u0001\f\u0001"+
		",\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004C\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007a\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bq\b\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\b}\b\b\n\b\f\b\u0080\t\b\u0001\t\u0004\t\u0083\b\t\u000b\t\f\t\u0084"+
		"\u0001\t\u0000\u0001\u0010\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0000\u0004\u0001\u0000\u0002\u0007\u0001\u0000\u000f\u0010\u0002"+
		"\u0000\u000e\u000e\u0011\u0011\u0001\u0000\u0012\u0013\u008a\u0000\u0014"+
		"\u0001\u0000\u0000\u0000\u0002\u001c\u0001\u0000\u0000\u0000\u0004/\u0001"+
		"\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000\bB\u0001\u0000\u0000"+
		"\u0000\nD\u0001\u0000\u0000\u0000\fJ\u0001\u0000\u0000\u0000\u000e`\u0001"+
		"\u0000\u0000\u0000\u0010p\u0001\u0000\u0000\u0000\u0012\u0082\u0001\u0000"+
		"\u0000\u0000\u0014\u0015\u0003\u0002\u0001\u0000\u0015\u0016\u0005\u0000"+
		"\u0000\u0001\u0016\u0001\u0001\u0000\u0000\u0000\u0017\u0018\u0003\u0004"+
		"\u0002\u0000\u0018\u0019\u0006\u0001\uffff\uffff\u0000\u0019\u001b\u0001"+
		"\u0000\u0000\u0000\u001a\u0017\u0001\u0000\u0000\u0000\u001b\u001e\u0001"+
		"\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\"\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000"+
		"\u0000\u0000\u001f!\u0005\u0013\u0000\u0000 \u001f\u0001\u0000\u0000\u0000"+
		"!$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#*\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%&\u0003\u000e"+
		"\u0007\u0000&\'\u0006\u0001\uffff\uffff\u0000\')\u0001\u0000\u0000\u0000"+
		"(%\u0001\u0000\u0000\u0000),\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000\u0000,*\u0001\u0000"+
		"\u0000\u0000-.\u0006\u0001\uffff\uffff\u0000.\u0003\u0001\u0000\u0000"+
		"\u0000/0\u0005\u0015\u0000\u000001\u0005\u0017\u0000\u000012\u0003\u0012"+
		"\t\u000023\u0006\u0002\uffff\uffff\u00003\u0005\u0001\u0000\u0000\u0000"+
		"45\u0005\u0017\u0000\u000056\u0005\u0001\u0000\u000067\u0003\u0010\b\u0000"+
		"78\u0006\u0003\uffff\uffff\u00008\u0007\u0001\u0000\u0000\u00009:\u0003"+
		"\u0010\b\u0000:;\u0007\u0000\u0000\u0000;<\u0003\u0010\b\u0000<=\u0006"+
		"\u0004\uffff\uffff\u0000=C\u0001\u0000\u0000\u0000>?\u0005\b\u0000\u0000"+
		"?C\u0006\u0004\uffff\uffff\u0000@A\u0005\t\u0000\u0000AC\u0006\u0004\uffff"+
		"\uffff\u0000B9\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000C\t\u0001\u0000\u0000\u0000DE\u0005\n\u0000\u0000EF"+
		"\u0005\u000b\u0000\u0000FG\u0005\u0017\u0000\u0000GH\u0005\f\u0000\u0000"+
		"HI\u0006\u0005\uffff\uffff\u0000I\u000b\u0001\u0000\u0000\u0000JK\u0005"+
		"\r\u0000\u0000KL\u0005\u000b\u0000\u0000LM\u0003\u0010\b\u0000MN\u0005"+
		"\f\u0000\u0000NO\u0006\u0006\uffff\uffff\u0000O\r\u0001\u0000\u0000\u0000"+
		"PQ\u0003\u0010\b\u0000QR\u0003\u0012\t\u0000RS\u0006\u0007\uffff\uffff"+
		"\u0000Sa\u0001\u0000\u0000\u0000TU\u0003\u0006\u0003\u0000UV\u0003\u0012"+
		"\t\u0000VW\u0006\u0007\uffff\uffff\u0000Wa\u0001\u0000\u0000\u0000XY\u0003"+
		"\n\u0005\u0000YZ\u0003\u0012\t\u0000Z[\u0006\u0007\uffff\uffff\u0000["+
		"a\u0001\u0000\u0000\u0000\\]\u0003\f\u0006\u0000]^\u0003\u0012\t\u0000"+
		"^_\u0006\u0007\uffff\uffff\u0000_a\u0001\u0000\u0000\u0000`P\u0001\u0000"+
		"\u0000\u0000`T\u0001\u0000\u0000\u0000`X\u0001\u0000\u0000\u0000`\\\u0001"+
		"\u0000\u0000\u0000a\u000f\u0001\u0000\u0000\u0000bc\u0006\b\uffff\uffff"+
		"\u0000cd\u0005\u000b\u0000\u0000de\u0003\u0010\b\u0000ef\u0005\f\u0000"+
		"\u0000fg\u0006\b\uffff\uffff\u0000gq\u0001\u0000\u0000\u0000hi\u0005\u000e"+
		"\u0000\u0000ij\u0003\u0010\b\u0005jk\u0006\b\uffff\uffff\u0000kq\u0001"+
		"\u0000\u0000\u0000lm\u0005\u0014\u0000\u0000mq\u0006\b\uffff\uffff\u0000"+
		"no\u0005\u0017\u0000\u0000oq\u0006\b\uffff\uffff\u0000pb\u0001\u0000\u0000"+
		"\u0000ph\u0001\u0000\u0000\u0000pl\u0001\u0000\u0000\u0000pn\u0001\u0000"+
		"\u0000\u0000q~\u0001\u0000\u0000\u0000rs\n\u0004\u0000\u0000st\u0007\u0001"+
		"\u0000\u0000tu\u0003\u0010\b\u0005uv\u0006\b\uffff\uffff\u0000v}\u0001"+
		"\u0000\u0000\u0000wx\n\u0003\u0000\u0000xy\u0007\u0002\u0000\u0000yz\u0003"+
		"\u0010\b\u0004z{\u0006\b\uffff\uffff\u0000{}\u0001\u0000\u0000\u0000|"+
		"r\u0001\u0000\u0000\u0000|w\u0001\u0000\u0000\u0000}\u0080\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0011\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081"+
		"\u0083\u0007\u0003\u0000\u0000\u0082\u0081\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0001\u0000\u0000\u0000\u0085\u0013\u0001\u0000\u0000\u0000\t\u001c"+
		"\"*B`p|~\u0084";
>>>>>>> gireg
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}