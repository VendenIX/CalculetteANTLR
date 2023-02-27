// Generated from java-escape by ANTLR 4.11.1
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
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, COMMENTAIRE=33, NEWLINE=34, ENTIER=35, TYPE=36, MOTCLE=37, IDENTIFIANT=38, 
		WS=39, UNMATCH=40;
	public static final int
		RULE_start = 0, RULE_forbloc = 1, RULE_branchement = 2, RULE_whilebloc = 3, 
		RULE_bloc = 4, RULE_calcul = 5, RULE_decl = 6, RULE_assignation = 7, RULE_condition = 8, 
		RULE_entree = 9, RULE_sortie = 10, RULE_instruction = 11, RULE_expression = 12, 
		RULE_conditionbasique = 13, RULE_finInstruction = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "forbloc", "branchement", "whilebloc", "bloc", "calcul", "decl", 
			"assignation", "condition", "entree", "sortie", "instruction", "expression", 
			"conditionbasique", "finInstruction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'for'", "'('", "';'", "')'", "'if'", "'else'", "'while'", "'{'", 
			"'}'", "'='", "'+='", "'-='", "'*='", "'/='", "'++'", "'&&'", "'||'", 
			"'true'", "'false'", "'input'", "'print'", "'-'", "'*'", "'/'", "'+'", 
			"'=='", "'!='", "'<>'", "'<'", "'>'", "'<='", "'>='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "COMMENTAIRE", 
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

	@Override
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    private TablesSymboles tablesSymboles = new TablesSymboles();
	    private int _cur_label = 1;
	    /** générateur de nom d'étiquettes pour les boucles, pour whilebloc*/
	    private String getNewLabel() { return "Label" +(_cur_label++); }
	    // ...
	        
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
			setState(30);
			calcul();
			setState(31);
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
	public static class ForblocContext extends ParserRuleContext {
		public String code;
		public AssignationContext debut;
		public ConditionContext condition;
		public AssignationContext incr;
		public BlocContext bloc;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public List<AssignationContext> assignation() {
			return getRuleContexts(AssignationContext.class);
		}
		public AssignationContext assignation(int i) {
			return getRuleContext(AssignationContext.class,i);
		}
		public ForblocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forbloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterForbloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitForbloc(this);
		}
	}

	public final ForblocContext forbloc() throws RecognitionException {
		ForblocContext _localctx = new ForblocContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_forbloc);
		 ((ForblocContext)_localctx).code =  new String(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(T__0);
			setState(34);
			match(T__1);
			setState(35);
			((ForblocContext)_localctx).debut = assignation();
			setState(36);
			match(T__2);
			setState(37);
			((ForblocContext)_localctx).condition = condition(0);
			setState(38);
			match(T__2);
			setState(39);
			((ForblocContext)_localctx).incr = assignation();
			setState(40);
			match(T__3);
			setState(41);
			((ForblocContext)_localctx).bloc = bloc();

			            String labeldebut = getNewLabel();
			            String labelfin = getNewLabel();
			            _localctx.code += ((ForblocContext)_localctx).debut.code + "LABEL "+ labeldebut +"\n"+ ((ForblocContext)_localctx).condition.code + "JUMPF "+ labelfin + "\n" + ((ForblocContext)_localctx).bloc.code + ((ForblocContext)_localctx).incr.code + "JUMP "+labeldebut+ "\n"+ "LABEL "+ labelfin + "\n";
			        
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
	public static class BranchementContext extends ParserRuleContext {
		public String code;
		public ConditionContext condition;
		public BlocContext bloc;
		public BlocContext bloc1;
		public BlocContext bloc2;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public List<BlocContext> bloc() {
			return getRuleContexts(BlocContext.class);
		}
		public BlocContext bloc(int i) {
			return getRuleContext(BlocContext.class,i);
		}
		public BranchementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterBranchement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitBranchement(this);
		}
	}

	public final BranchementContext branchement() throws RecognitionException {
		BranchementContext _localctx = new BranchementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_branchement);
		 ((BranchementContext)_localctx).code =  new String(); 
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				match(T__4);
				setState(45);
				match(T__1);
				setState(46);
				((BranchementContext)_localctx).condition = condition(0);
				setState(47);
				match(T__3);
				setState(48);
				((BranchementContext)_localctx).bloc = bloc();

				            String label = getNewLabel();
				            _localctx.code += ((BranchementContext)_localctx).condition.code + "JUMPF " + label + "\n" + ((BranchementContext)_localctx).bloc.code + "LABEL " + label + "\n";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				match(T__4);
				setState(52);
				match(T__1);
				setState(53);
				((BranchementContext)_localctx).condition = condition(0);
				setState(54);
				match(T__3);
				setState(55);
				((BranchementContext)_localctx).bloc1 = bloc();
				setState(56);
				match(T__5);
				setState(57);
				((BranchementContext)_localctx).bloc2 = bloc();

				            String label1 = getNewLabel();
				            String label2 = getNewLabel();
				            _localctx.code += ((BranchementContext)_localctx).condition.code + "JUMPF " + label1 + "\n" + ((BranchementContext)_localctx).bloc1.code + "JUMP " + label2 + "\n" + "LABEL " + label1 + "\n" + ((BranchementContext)_localctx).bloc2.code + "LABEL " + label2 + "\n";
				        
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
	public static class WhileblocContext extends ParserRuleContext {
		public String code;
		public ConditionContext condition;
		public BlocContext bloc;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public WhileblocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilebloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterWhilebloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitWhilebloc(this);
		}
	}

	public final WhileblocContext whilebloc() throws RecognitionException {
		WhileblocContext _localctx = new WhileblocContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whilebloc);
		 ((WhileblocContext)_localctx).code =  new String(); 
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(T__6);
			setState(63);
			match(T__1);
			setState(64);
			((WhileblocContext)_localctx).condition = condition(0);
			setState(65);
			match(T__3);
			setState(66);
			((WhileblocContext)_localctx).bloc = bloc();
			   
			            String labeldebut = getNewLabel();
			            String labelfin = getNewLabel();
			            _localctx.code += "LABEL "+ labeldebut +"\n"+ ((WhileblocContext)_localctx).condition.code + "JUMPF "+ labelfin + "\n" + ((WhileblocContext)_localctx).bloc.code + "JUMP "+labeldebut+ "\n"+ "LABEL "+ labelfin + "\n";
			        
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
	public static class BlocContext extends ParserRuleContext {
		public String code;
		public DeclContext decl;
		public InstructionContext instruction;
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public List<DeclContext> decl() {
			return getRuleContexts(DeclContext.class);
		}
		public DeclContext decl(int i) {
			return getRuleContext(DeclContext.class,i);
		}
		public List<InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public BlocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterBloc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitBloc(this);
		}
	}

	public final BlocContext bloc() throws RecognitionException {
		BlocContext _localctx = new BlocContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloc);
		 ((BlocContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(69);
				match(NEWLINE);
				}
				}
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			match(T__7);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(76);
					match(NEWLINE);
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(82);
				((BlocContext)_localctx).decl = decl();
				 _localctx.code += ((BlocContext)_localctx).decl.code; 
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					((BlocContext)_localctx).instruction = instruction();
					 _localctx.code += ((BlocContext)_localctx).instruction.code; 
					}
					} 
				}
				setState(97);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(98);
				match(NEWLINE);
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(T__8);
			setState(108);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(105);
					match(NEWLINE);
					}
					} 
				}
				setState(110);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
	public static class CalculContext extends ParserRuleContext {
		public String code;
		public WhileblocContext whilebloc;
		public BlocContext bloc;
		public DeclContext decl;
		public InstructionContext instruction;
		public List<WhileblocContext> whilebloc() {
			return getRuleContexts(WhileblocContext.class);
		}
		public WhileblocContext whilebloc(int i) {
			return getRuleContext(WhileblocContext.class,i);
		}
		public List<BlocContext> bloc() {
			return getRuleContexts(BlocContext.class);
		}
		public BlocContext bloc(int i) {
			return getRuleContext(BlocContext.class,i);
		}
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
		enterRule(_localctx, 10, RULE_calcul);
		 ((CalculContext)_localctx).code =  new String(); 
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					((CalculContext)_localctx).whilebloc = whilebloc();
					 _localctx.code += ((CalculContext)_localctx).whilebloc.code; 
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(119);
					((CalculContext)_localctx).bloc = bloc();
					 _localctx.code += ((CalculContext)_localctx).bloc.code; 
					}
					} 
				}
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(127);
				((CalculContext)_localctx).decl = decl();
				 _localctx.code += ((CalculContext)_localctx).decl.code; 
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(138);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(135);
					match(NEWLINE);
					}
					} 
				}
				setState(140);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((_la) & ~0x3f) == 0 && ((1L << _la) & 326424854950L) != 0) {
				{
				{
				setState(141);
				((CalculContext)_localctx).instruction = instruction();
				 _localctx.code += ((CalculContext)_localctx).instruction.code; 
				}
				}
				setState(148);
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
		enterRule(_localctx, 12, RULE_decl);
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(152);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(153);
				finInstruction();

				            if ((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("int")) {
				                ((DeclContext)_localctx).code =  "PUSHI 0\n";
				                tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), "int");
				            } else {
				                ((DeclContext)_localctx).code =  "PUSHF 0\n";
				                tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), "double");
				            }
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(157);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(158);
				match(T__9);
				setState(159);
				((DeclContext)_localctx).expression = expression(0);
				setState(160);
				finInstruction();

				            if ((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("int")) {
				                tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), "int");
				                ((DeclContext)_localctx).code =  "PUSHI 0 "+ ((DeclContext)_localctx).expression.code + "STOREG " + tablesSymboles.getVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null)).address + "\n";
				            } else {
				                tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), "double");
				                ((DeclContext)_localctx).code =  "PUSHF 0 "+ ((DeclContext)_localctx).expression.code + "STOREG " + tablesSymboles.getVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null)).address + "\n";
				            }
				        
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
	public static class AssignationContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public ExpressionContext expression;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FinInstructionContext finInstruction() {
			return getRuleContext(FinInstructionContext.class,0);
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
		enterRule(_localctx, 14, RULE_assignation);
		try {
			setState(195);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(166);
				match(T__9);
				setState(167);
				((AssignationContext)_localctx).expression = expression(0);
				  
				            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expression.code + "STOREG " + vi.address + "\n";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(170);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(171);
				match(T__10);
				setState(172);
				((AssignationContext)_localctx).expression = expression(0);

				            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            ((AssignationContext)_localctx).code =  "PUSHG " + vi.address + "\n" + ((AssignationContext)_localctx).expression.code + "ADD\n" + "STOREG " + vi.address + "\n";
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(176);
				match(T__11);
				setState(177);
				((AssignationContext)_localctx).expression = expression(0);

				            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            ((AssignationContext)_localctx).code =  "PUSHG " + vi.address + "\n" + ((AssignationContext)_localctx).expression.code + "SUB\n" + "STOREG " + vi.address + "\n";
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(181);
				match(T__12);
				setState(182);
				((AssignationContext)_localctx).expression = expression(0);

				            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            ((AssignationContext)_localctx).code =  "PUSHG " + vi.address + "\n" + ((AssignationContext)_localctx).expression.code + "MUL\n" + "STOREG " + vi.address + "\n";
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(185);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(186);
				match(T__13);
				setState(187);
				((AssignationContext)_localctx).expression = expression(0);

				            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            ((AssignationContext)_localctx).code =  "PUSHG " + vi.address + "\n" + ((AssignationContext)_localctx).expression.code + "DIV\n" + "STOREG " + vi.address + "\n";
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(190);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(191);
				match(T__14);
				setState(192);
				finInstruction();

				            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            ((AssignationContext)_localctx).code =  "PUSHG " + vi.address + "\n" + "PUSHI 1\n" + "ADD\n" + "STOREG " + vi.address + "\n";
				        
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
	public static class ConditionContext extends ParserRuleContext {
		public String code;
		public ConditionContext a;
		public ConditionbasiqueContext conditionbasique;
		public ConditionContext b;
		public ConditionbasiqueContext conditionbasique() {
			return getRuleContext(ConditionbasiqueContext.class,0);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
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
		return condition(0);
	}

	private ConditionContext condition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ConditionContext _localctx = new ConditionContext(_ctx, _parentState);
		ConditionContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_condition, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__21:
			case ENTIER:
			case IDENTIFIANT:
				{
				setState(198);
				((ConditionContext)_localctx).conditionbasique = conditionbasique();

				            ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).conditionbasique.code;
				        
				}
				break;
			case T__17:
				{
				setState(201);
				match(T__17);
				((ConditionContext)_localctx).code =  "PUSHI 1\n";
				        
				}
				break;
			case T__18:
				{
				setState(203);
				match(T__18);
				((ConditionContext)_localctx).code =  "PUSHI 0\n";
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(219);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(217);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(207);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(208);
						match(T__15);
						}
						setState(209);
						((ConditionContext)_localctx).b = condition(6);

						                      if(((ConditionContext)_localctx).a.code.equals("PUSHI 1\n") && ((ConditionContext)_localctx).b.code.equals("PUSHI 1\n")){ ((ConditionContext)_localctx).code =  "PUSHI 1\n";}
						                      else if(((ConditionContext)_localctx).a.code.equals("PUSHI 1\n") && ((ConditionContext)_localctx).b.code.equals("PUSHI 0\n")){ ((ConditionContext)_localctx).code =  "PUSHI 0\n";}
						                      else if(((ConditionContext)_localctx).a.code.equals("PUSHI 0\n") && ((ConditionContext)_localctx).b.code.equals("PUSHI 1\n")){ ((ConditionContext)_localctx).code =  "PUSHI 0\n";}
						                      else if(((ConditionContext)_localctx).a.code.equals("PUSHI 0\n") && ((ConditionContext)_localctx).b.code.equals("PUSHI 0\n")){ ((ConditionContext)_localctx).code =  "PUSHI 0\n";}
						                  
						}
						break;
					case 2:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(212);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(213);
						match(T__16);
						}
						setState(214);
						((ConditionContext)_localctx).b = condition(5);

						                      if(((ConditionContext)_localctx).a.code.equals("PUSHI 1\n") && ((ConditionContext)_localctx).b.code.equals("PUSHI 1\n")){ ((ConditionContext)_localctx).code =  "PUSHI 1\n";}
						                      else if(((ConditionContext)_localctx).a.code.equals("PUSHI 1\n") && ((ConditionContext)_localctx).b.code.equals("PUSHI 0\n")){ ((ConditionContext)_localctx).code =  "PUSHI 1\n";}
						                      else if(((ConditionContext)_localctx).a.code.equals("PUSHI 0\n") && ((ConditionContext)_localctx).b.code.equals("PUSHI 1\n")){ ((ConditionContext)_localctx).code =  "PUSHI 1\n";}
						                      else if(((ConditionContext)_localctx).a.code.equals("PUSHI 0\n") && ((ConditionContext)_localctx).b.code.equals("PUSHI 0\n")){ ((ConditionContext)_localctx).code =  "PUSHI 0\n";}
						                  
						}
						break;
					}
					} 
				}
				setState(221);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
		enterRule(_localctx, 18, RULE_entree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__19);
			setState(223);
			match(T__1);
			setState(224);
			((EntreeContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(225);
			match(T__3);

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
		enterRule(_localctx, 20, RULE_sortie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(T__20);
			setState(229);
			match(T__1);
			setState(230);
			((SortieContext)_localctx).expression = expression(0);
			setState(231);
			match(T__3);

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
		public BlocContext bloc;
		public WhileblocContext whilebloc;
		public BranchementContext branchement;
		public ForblocContext forbloc;
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
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public WhileblocContext whilebloc() {
			return getRuleContext(WhileblocContext.class,0);
		}
		public BranchementContext branchement() {
			return getRuleContext(BranchementContext.class,0);
		}
		public ForblocContext forbloc() {
			return getRuleContext(ForblocContext.class,0);
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
		enterRule(_localctx, 22, RULE_instruction);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				((InstructionContext)_localctx).expression = expression(0);
				setState(235);
				finInstruction();
				 
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				((InstructionContext)_localctx).assignation = assignation();
				setState(239);
				finInstruction();
				 
						    ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).assignation.code;
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(242);
				((InstructionContext)_localctx).entree = entree();
				setState(243);
				finInstruction();
				   
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).entree.code;
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(246);
				((InstructionContext)_localctx).sortie = sortie();
				setState(247);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).sortie.code;
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				((InstructionContext)_localctx).bloc = bloc();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).bloc.code;
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(253);
				((InstructionContext)_localctx).whilebloc = whilebloc();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).whilebloc.code;
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(256);
				((InstructionContext)_localctx).branchement = branchement();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).branchement.code;
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(259);
				((InstructionContext)_localctx).forbloc = forbloc();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).forbloc.code;
				        
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(265);
				match(T__1);
				setState(266);
				((ExpressionContext)_localctx).c = expression(0);
				setState(267);
				match(T__3);

				            ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).c.code;
				        
				}
				break;
			case T__21:
				{
				setState(270);
				match(T__21);
				setState(271);
				((ExpressionContext)_localctx).d = expression(5);

				            ((ExpressionContext)_localctx).code =  "PUSHI 0\n"+ ((ExpressionContext)_localctx).d.code + "SUB\n";
				        
				}
				break;
			case ENTIER:
				{
				setState(274);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);

				            ((ExpressionContext)_localctx).code =  "PUSHI " + (((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null) + "\n";
				        
				}
				break;
			case IDENTIFIANT:
				{
				setState(276);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				 
				        VariableInfo vi = tablesSymboles.getVar((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));            
				        ((ExpressionContext)_localctx).code =  "PUSHG "+ vi.address + "\n";
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(292);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(290);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(280);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(281);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__23) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(282);
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
						setState(285);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(286);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__24) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(287);
						((ExpressionContext)_localctx).b = expression(4);

						                      if((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).equals("+")){ ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "ADD\n";}
						                      else {((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "SUB\n";}
						                  
						}
						break;
					}
					} 
				}
				setState(294);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
	public static class ConditionbasiqueContext extends ParserRuleContext {
		public String code;
		public ExpressionContext a;
		public Token op;
		public ExpressionContext b;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ConditionbasiqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionbasique; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterConditionbasique(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitConditionbasique(this);
		}
	}

	public final ConditionbasiqueContext conditionbasique() throws RecognitionException {
		ConditionbasiqueContext _localctx = new ConditionbasiqueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionbasique);
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(295);
				((ConditionbasiqueContext)_localctx).a = expression(0);
				setState(296);
				((ConditionbasiqueContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0) ) {
					((ConditionbasiqueContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(297);
				((ConditionbasiqueContext)_localctx).b = expression(0);

				            if((((ConditionbasiqueContext)_localctx).op!=null?((ConditionbasiqueContext)_localctx).op.getText():null).equals("==")){ ((ConditionbasiqueContext)_localctx).code =  ((ConditionbasiqueContext)_localctx).a.code + ((ConditionbasiqueContext)_localctx).b.code + "EQUAL\n";}
				            else {((ConditionbasiqueContext)_localctx).code =  ((ConditionbasiqueContext)_localctx).a.code + ((ConditionbasiqueContext)_localctx).b.code + "NEQ\n";}
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				((ConditionbasiqueContext)_localctx).a = expression(0);
				setState(301);
				((ConditionbasiqueContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__28 || _la==T__29) ) {
					((ConditionbasiqueContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(302);
				((ConditionbasiqueContext)_localctx).b = expression(0);

				            if((((ConditionbasiqueContext)_localctx).op!=null?((ConditionbasiqueContext)_localctx).op.getText():null).equals("<")){ ((ConditionbasiqueContext)_localctx).code =  ((ConditionbasiqueContext)_localctx).a.code + ((ConditionbasiqueContext)_localctx).b.code + "INF\n";}
				            else {((ConditionbasiqueContext)_localctx).code =  ((ConditionbasiqueContext)_localctx).a.code + ((ConditionbasiqueContext)_localctx).b.code + "SUP\n";}
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(305);
				((ConditionbasiqueContext)_localctx).a = expression(0);
				setState(306);
				((ConditionbasiqueContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__30 || _la==T__31) ) {
					((ConditionbasiqueContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(307);
				((ConditionbasiqueContext)_localctx).b = expression(0);

				            if((((ConditionbasiqueContext)_localctx).op!=null?((ConditionbasiqueContext)_localctx).op.getText():null).equals("<=")){ ((ConditionbasiqueContext)_localctx).code =  ((ConditionbasiqueContext)_localctx).a.code + ((ConditionbasiqueContext)_localctx).b.code + "INFEQ\n";}
				            else {((ConditionbasiqueContext)_localctx).code =  ((ConditionbasiqueContext)_localctx).a.code + ((ConditionbasiqueContext)_localctx).b.code + "SUPEQ\n";}
				        
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
		enterRule(_localctx, 28, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(312);
					_la = _input.LA(1);
					if ( !(_la==T__2 || _la==NEWLINE) ) {
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
				setState(315); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		case 8:
			return condition_sempred((ConditionContext)_localctx, predIndex);
		case 12:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 4);
		case 3:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001(\u013e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002=\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0005\u0004G\b\u0004\n\u0004\f\u0004J\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004N\b\u0004\n\u0004\f\u0004Q\t\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004V\b\u0004\n\u0004\f\u0004"+
		"Y\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004^\b\u0004\n\u0004"+
		"\f\u0004a\t\u0004\u0001\u0004\u0005\u0004d\b\u0004\n\u0004\f\u0004g\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004k\b\u0004\n\u0004\f\u0004n\t"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005s\b\u0005\n\u0005"+
		"\f\u0005v\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005{\b\u0005"+
		"\n\u0005\f\u0005~\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u0083\b\u0005\n\u0005\f\u0005\u0086\t\u0005\u0001\u0005\u0005\u0005\u0089"+
		"\b\u0005\n\u0005\f\u0005\u008c\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u0091\b\u0005\n\u0005\f\u0005\u0094\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00a4\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u00c4\b\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ce\b\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\b\u00da\b\b\n\b\f\b\u00dd\t\b\u0001\t\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0107\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0117\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u0123"+
		"\b\f\n\f\f\f\u0126\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u0137\b\r\u0001\u000e\u0004\u000e\u013a\b\u000e\u000b\u000e"+
		"\f\u000e\u013b\u0001\u000e\u0000\u0002\u0010\u0018\u000f\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0006"+
		"\u0001\u0000\u0017\u0018\u0002\u0000\u0016\u0016\u0019\u0019\u0001\u0000"+
		"\u001a\u001c\u0001\u0000\u001d\u001e\u0001\u0000\u001f \u0002\u0000\u0003"+
		"\u0003\"\"\u0153\u0000\u001e\u0001\u0000\u0000\u0000\u0002!\u0001\u0000"+
		"\u0000\u0000\u0004<\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000\u0000"+
		"\bH\u0001\u0000\u0000\u0000\nt\u0001\u0000\u0000\u0000\f\u00a3\u0001\u0000"+
		"\u0000\u0000\u000e\u00c3\u0001\u0000\u0000\u0000\u0010\u00cd\u0001\u0000"+
		"\u0000\u0000\u0012\u00de\u0001\u0000\u0000\u0000\u0014\u00e4\u0001\u0000"+
		"\u0000\u0000\u0016\u0106\u0001\u0000\u0000\u0000\u0018\u0116\u0001\u0000"+
		"\u0000\u0000\u001a\u0136\u0001\u0000\u0000\u0000\u001c\u0139\u0001\u0000"+
		"\u0000\u0000\u001e\u001f\u0003\n\u0005\u0000\u001f \u0005\u0000\u0000"+
		"\u0001 \u0001\u0001\u0000\u0000\u0000!\"\u0005\u0001\u0000\u0000\"#\u0005"+
		"\u0002\u0000\u0000#$\u0003\u000e\u0007\u0000$%\u0005\u0003\u0000\u0000"+
		"%&\u0003\u0010\b\u0000&\'\u0005\u0003\u0000\u0000\'(\u0003\u000e\u0007"+
		"\u0000()\u0005\u0004\u0000\u0000)*\u0003\b\u0004\u0000*+\u0006\u0001\uffff"+
		"\uffff\u0000+\u0003\u0001\u0000\u0000\u0000,-\u0005\u0005\u0000\u0000"+
		"-.\u0005\u0002\u0000\u0000./\u0003\u0010\b\u0000/0\u0005\u0004\u0000\u0000"+
		"01\u0003\b\u0004\u000012\u0006\u0002\uffff\uffff\u00002=\u0001\u0000\u0000"+
		"\u000034\u0005\u0005\u0000\u000045\u0005\u0002\u0000\u000056\u0003\u0010"+
		"\b\u000067\u0005\u0004\u0000\u000078\u0003\b\u0004\u000089\u0005\u0006"+
		"\u0000\u00009:\u0003\b\u0004\u0000:;\u0006\u0002\uffff\uffff\u0000;=\u0001"+
		"\u0000\u0000\u0000<,\u0001\u0000\u0000\u0000<3\u0001\u0000\u0000\u0000"+
		"=\u0005\u0001\u0000\u0000\u0000>?\u0005\u0007\u0000\u0000?@\u0005\u0002"+
		"\u0000\u0000@A\u0003\u0010\b\u0000AB\u0005\u0004\u0000\u0000BC\u0003\b"+
		"\u0004\u0000CD\u0006\u0003\uffff\uffff\u0000D\u0007\u0001\u0000\u0000"+
		"\u0000EG\u0005\"\u0000\u0000FE\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000"+
		"\u0000\u0000JH\u0001\u0000\u0000\u0000KO\u0005\b\u0000\u0000LN\u0005\""+
		"\u0000\u0000ML\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001"+
		"\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PW\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000RS\u0003\f\u0006\u0000ST\u0006\u0004\uffff\uffff"+
		"\u0000TV\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000VY\u0001\u0000"+
		"\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X_\u0001"+
		"\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Z[\u0003\u0016\u000b\u0000"+
		"[\\\u0006\u0004\uffff\uffff\u0000\\^\u0001\u0000\u0000\u0000]Z\u0001\u0000"+
		"\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001"+
		"\u0000\u0000\u0000`e\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"bd\u0005\"\u0000\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000hl\u0005\t\u0000\u0000ik\u0005\"\u0000"+
		"\u0000ji\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000lj\u0001\u0000"+
		"\u0000\u0000lm\u0001\u0000\u0000\u0000m\t\u0001\u0000\u0000\u0000nl\u0001"+
		"\u0000\u0000\u0000op\u0003\u0006\u0003\u0000pq\u0006\u0005\uffff\uffff"+
		"\u0000qs\u0001\u0000\u0000\u0000ro\u0001\u0000\u0000\u0000sv\u0001\u0000"+
		"\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000u|\u0001"+
		"\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000wx\u0003\b\u0004\u0000xy\u0006"+
		"\u0005\uffff\uffff\u0000y{\u0001\u0000\u0000\u0000zw\u0001\u0000\u0000"+
		"\u0000{~\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\u0084\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0003\f\u0006\u0000\u0080\u0081\u0006\u0005\uffff\uffff\u0000"+
		"\u0081\u0083\u0001\u0000\u0000\u0000\u0082\u007f\u0001\u0000\u0000\u0000"+
		"\u0083\u0086\u0001\u0000\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000"+
		"\u0084\u0085\u0001\u0000\u0000\u0000\u0085\u008a\u0001\u0000\u0000\u0000"+
		"\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u0089\u0005\"\u0000\u0000\u0088"+
		"\u0087\u0001\u0000\u0000\u0000\u0089\u008c\u0001\u0000\u0000\u0000\u008a"+
		"\u0088\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b"+
		"\u0092\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d"+
		"\u008e\u0003\u0016\u000b\u0000\u008e\u008f\u0006\u0005\uffff\uffff\u0000"+
		"\u008f\u0091\u0001\u0000\u0000\u0000\u0090\u008d\u0001\u0000\u0000\u0000"+
		"\u0091\u0094\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000"+
		"\u0094\u0092\u0001\u0000\u0000\u0000\u0095\u0096\u0006\u0005\uffff\uffff"+
		"\u0000\u0096\u000b\u0001\u0000\u0000\u0000\u0097\u0098\u0005$\u0000\u0000"+
		"\u0098\u0099\u0005&\u0000\u0000\u0099\u009a\u0003\u001c\u000e\u0000\u009a"+
		"\u009b\u0006\u0006\uffff\uffff\u0000\u009b\u00a4\u0001\u0000\u0000\u0000"+
		"\u009c\u009d\u0005$\u0000\u0000\u009d\u009e\u0005&\u0000\u0000\u009e\u009f"+
		"\u0005\n\u0000\u0000\u009f\u00a0\u0003\u0018\f\u0000\u00a0\u00a1\u0003"+
		"\u001c\u000e\u0000\u00a1\u00a2\u0006\u0006\uffff\uffff\u0000\u00a2\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a3\u0097\u0001\u0000\u0000\u0000\u00a3\u009c"+
		"\u0001\u0000\u0000\u0000\u00a4\r\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005"+
		"&\u0000\u0000\u00a6\u00a7\u0005\n\u0000\u0000\u00a7\u00a8\u0003\u0018"+
		"\f\u0000\u00a8\u00a9\u0006\u0007\uffff\uffff\u0000\u00a9\u00c4\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0005&\u0000\u0000\u00ab\u00ac\u0005\u000b\u0000"+
		"\u0000\u00ac\u00ad\u0003\u0018\f\u0000\u00ad\u00ae\u0006\u0007\uffff\uffff"+
		"\u0000\u00ae\u00c4\u0001\u0000\u0000\u0000\u00af\u00b0\u0005&\u0000\u0000"+
		"\u00b0\u00b1\u0005\f\u0000\u0000\u00b1\u00b2\u0003\u0018\f\u0000\u00b2"+
		"\u00b3\u0006\u0007\uffff\uffff\u0000\u00b3\u00c4\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0005&\u0000\u0000\u00b5\u00b6\u0005\r\u0000\u0000\u00b6"+
		"\u00b7\u0003\u0018\f\u0000\u00b7\u00b8\u0006\u0007\uffff\uffff\u0000\u00b8"+
		"\u00c4\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005&\u0000\u0000\u00ba\u00bb"+
		"\u0005\u000e\u0000\u0000\u00bb\u00bc\u0003\u0018\f\u0000\u00bc\u00bd\u0006"+
		"\u0007\uffff\uffff\u0000\u00bd\u00c4\u0001\u0000\u0000\u0000\u00be\u00bf"+
		"\u0005&\u0000\u0000\u00bf\u00c0\u0005\u000f\u0000\u0000\u00c0\u00c1\u0003"+
		"\u001c\u000e\u0000\u00c1\u00c2\u0006\u0007\uffff\uffff\u0000\u00c2\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c3\u00a5\u0001\u0000\u0000\u0000\u00c3\u00aa"+
		"\u0001\u0000\u0000\u0000\u00c3\u00af\u0001\u0000\u0000\u0000\u00c3\u00b4"+
		"\u0001\u0000\u0000\u0000\u00c3\u00b9\u0001\u0000\u0000\u0000\u00c3\u00be"+
		"\u0001\u0000\u0000\u0000\u00c4\u000f\u0001\u0000\u0000\u0000\u00c5\u00c6"+
		"\u0006\b\uffff\uffff\u0000\u00c6\u00c7\u0003\u001a\r\u0000\u00c7\u00c8"+
		"\u0006\b\uffff\uffff\u0000\u00c8\u00ce\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0005\u0012\u0000\u0000\u00ca\u00ce\u0006\b\uffff\uffff\u0000\u00cb\u00cc"+
		"\u0005\u0013\u0000\u0000\u00cc\u00ce\u0006\b\uffff\uffff\u0000\u00cd\u00c5"+
		"\u0001\u0000\u0000\u0000\u00cd\u00c9\u0001\u0000\u0000\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00ce\u00db\u0001\u0000\u0000\u0000\u00cf\u00d0"+
		"\n\u0005\u0000\u0000\u00d0\u00d1\u0005\u0010\u0000\u0000\u00d1\u00d2\u0003"+
		"\u0010\b\u0006\u00d2\u00d3\u0006\b\uffff\uffff\u0000\u00d3\u00da\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\n\u0004\u0000\u0000\u00d5\u00d6\u0005\u0011"+
		"\u0000\u0000\u00d6\u00d7\u0003\u0010\b\u0005\u00d7\u00d8\u0006\b\uffff"+
		"\uffff\u0000\u00d8\u00da\u0001\u0000\u0000\u0000\u00d9\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d9\u00d4\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000"+
		"\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000"+
		"\u0000\u0000\u00dc\u0011\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000"+
		"\u0000\u0000\u00de\u00df\u0005\u0014\u0000\u0000\u00df\u00e0\u0005\u0002"+
		"\u0000\u0000\u00e0\u00e1\u0005&\u0000\u0000\u00e1\u00e2\u0005\u0004\u0000"+
		"\u0000\u00e2\u00e3\u0006\t\uffff\uffff\u0000\u00e3\u0013\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0005\u0015\u0000\u0000\u00e5\u00e6\u0005\u0002\u0000"+
		"\u0000\u00e6\u00e7\u0003\u0018\f\u0000\u00e7\u00e8\u0005\u0004\u0000\u0000"+
		"\u00e8\u00e9\u0006\n\uffff\uffff\u0000\u00e9\u0015\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0003\u0018\f\u0000\u00eb\u00ec\u0003\u001c\u000e\u0000\u00ec"+
		"\u00ed\u0006\u000b\uffff\uffff\u0000\u00ed\u0107\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ef\u0003\u000e\u0007\u0000\u00ef\u00f0\u0003\u001c\u000e\u0000"+
		"\u00f0\u00f1\u0006\u000b\uffff\uffff\u0000\u00f1\u0107\u0001\u0000\u0000"+
		"\u0000\u00f2\u00f3\u0003\u0012\t\u0000\u00f3\u00f4\u0003\u001c\u000e\u0000"+
		"\u00f4\u00f5\u0006\u000b\uffff\uffff\u0000\u00f5\u0107\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f7\u0003\u0014\n\u0000\u00f7\u00f8\u0003\u001c\u000e\u0000"+
		"\u00f8\u00f9\u0006\u000b\uffff\uffff\u0000\u00f9\u0107\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0003\b\u0004\u0000\u00fb\u00fc\u0006\u000b\uffff\uffff"+
		"\u0000\u00fc\u0107\u0001\u0000\u0000\u0000\u00fd\u00fe\u0003\u0006\u0003"+
		"\u0000\u00fe\u00ff\u0006\u000b\uffff\uffff\u0000\u00ff\u0107\u0001\u0000"+
		"\u0000\u0000\u0100\u0101\u0003\u0004\u0002\u0000\u0101\u0102\u0006\u000b"+
		"\uffff\uffff\u0000\u0102\u0107\u0001\u0000\u0000\u0000\u0103\u0104\u0003"+
		"\u0002\u0001\u0000\u0104\u0105\u0006\u000b\uffff\uffff\u0000\u0105\u0107"+
		"\u0001\u0000\u0000\u0000\u0106\u00ea\u0001\u0000\u0000\u0000\u0106\u00ee"+
		"\u0001\u0000\u0000\u0000\u0106\u00f2\u0001\u0000\u0000\u0000\u0106\u00f6"+
		"\u0001\u0000\u0000\u0000\u0106\u00fa\u0001\u0000\u0000\u0000\u0106\u00fd"+
		"\u0001\u0000\u0000\u0000\u0106\u0100\u0001\u0000\u0000\u0000\u0106\u0103"+
		"\u0001\u0000\u0000\u0000\u0107\u0017\u0001\u0000\u0000\u0000\u0108\u0109"+
		"\u0006\f\uffff\uffff\u0000\u0109\u010a\u0005\u0002\u0000\u0000\u010a\u010b"+
		"\u0003\u0018\f\u0000\u010b\u010c\u0005\u0004\u0000\u0000\u010c\u010d\u0006"+
		"\f\uffff\uffff\u0000\u010d\u0117\u0001\u0000\u0000\u0000\u010e\u010f\u0005"+
		"\u0016\u0000\u0000\u010f\u0110\u0003\u0018\f\u0005\u0110\u0111\u0006\f"+
		"\uffff\uffff\u0000\u0111\u0117\u0001\u0000\u0000\u0000\u0112\u0113\u0005"+
		"#\u0000\u0000\u0113\u0117\u0006\f\uffff\uffff\u0000\u0114\u0115\u0005"+
		"&\u0000\u0000\u0115\u0117\u0006\f\uffff\uffff\u0000\u0116\u0108\u0001"+
		"\u0000\u0000\u0000\u0116\u010e\u0001\u0000\u0000\u0000\u0116\u0112\u0001"+
		"\u0000\u0000\u0000\u0116\u0114\u0001\u0000\u0000\u0000\u0117\u0124\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\n\u0004\u0000\u0000\u0119\u011a\u0007\u0000"+
		"\u0000\u0000\u011a\u011b\u0003\u0018\f\u0005\u011b\u011c\u0006\f\uffff"+
		"\uffff\u0000\u011c\u0123\u0001\u0000\u0000\u0000\u011d\u011e\n\u0003\u0000"+
		"\u0000\u011e\u011f\u0007\u0001\u0000\u0000\u011f\u0120\u0003\u0018\f\u0004"+
		"\u0120\u0121\u0006\f\uffff\uffff\u0000\u0121\u0123\u0001\u0000\u0000\u0000"+
		"\u0122\u0118\u0001\u0000\u0000\u0000\u0122\u011d\u0001\u0000\u0000\u0000"+
		"\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000"+
		"\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0019\u0001\u0000\u0000\u0000"+
		"\u0126\u0124\u0001\u0000\u0000\u0000\u0127\u0128\u0003\u0018\f\u0000\u0128"+
		"\u0129\u0007\u0002\u0000\u0000\u0129\u012a\u0003\u0018\f\u0000\u012a\u012b"+
		"\u0006\r\uffff\uffff\u0000\u012b\u0137\u0001\u0000\u0000\u0000\u012c\u012d"+
		"\u0003\u0018\f\u0000\u012d\u012e\u0007\u0003\u0000\u0000\u012e\u012f\u0003"+
		"\u0018\f\u0000\u012f\u0130\u0006\r\uffff\uffff\u0000\u0130\u0137\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0003\u0018\f\u0000\u0132\u0133\u0007\u0004"+
		"\u0000\u0000\u0133\u0134\u0003\u0018\f\u0000\u0134\u0135\u0006\r\uffff"+
		"\uffff\u0000\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0127\u0001\u0000"+
		"\u0000\u0000\u0136\u012c\u0001\u0000\u0000\u0000\u0136\u0131\u0001\u0000"+
		"\u0000\u0000\u0137\u001b\u0001\u0000\u0000\u0000\u0138\u013a\u0007\u0005"+
		"\u0000\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000"+
		"\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000"+
		"\u0000\u0000\u013c\u001d\u0001\u0000\u0000\u0000\u0017<HOW_elt|\u0084"+
		"\u008a\u0092\u00a3\u00c3\u00cd\u00d9\u00db\u0106\u0116\u0122\u0124\u0136"+
		"\u013b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}