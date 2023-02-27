// Generated from /home/romain/Documents/P_R_O_J_E_C_T_S/CalculetteANTLR/Calculette.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculetteParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

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

	@Override
	public String getGrammarFileName() { return "Calculette.g4"; }

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

	public static class StartContext extends ParserRuleContext {
		public CalculContext calcul() {
			return getRuleContext(CalculContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CalculetteParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << NEWLINE) | (1L << ENTIER) | (1L << IDENTIFIANT))) != 0)) {
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
	}

	public final AssignationContext assignation() throws RecognitionException {
		AssignationContext _localctx = new AssignationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assignation);
		try {
			setState(200);
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
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(195);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(196);
				match(T__15);
				setState(197);
				finInstruction();

				            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            ((AssignationContext)_localctx).code =  "PUSHG " + vi.address + "\n" + "PUSHI 1\n" + "SUB\n" + "STOREG " + vi.address + "\n";
				        
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
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__22:
			case ENTIER:
			case IDENTIFIANT:
				{
				setState(203);
				((ConditionContext)_localctx).conditionbasique = conditionbasique();

				            ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).conditionbasique.code;
				        
				}
				break;
			case T__18:
				{
				setState(206);
				match(T__18);
				((ConditionContext)_localctx).code =  "PUSHI 1\n";
				        
				}
				break;
			case T__19:
				{
				setState(208);
				match(T__19);
				((ConditionContext)_localctx).code =  "PUSHI 0\n";
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(224);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(222);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(212);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(213);
						match(T__16);
						}
						setState(214);
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
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(217);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(218);
						match(T__17);
						}
						setState(219);
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
				setState(226);
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

	public static class EntreeContext extends ParserRuleContext {
		public String code;
		public Token IDENTIFIANT;
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public EntreeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entree; }
	}

	public final EntreeContext entree() throws RecognitionException {
		EntreeContext _localctx = new EntreeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_entree);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(T__20);
			setState(228);
			match(T__1);
			setState(229);
			((EntreeContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(230);
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
	}

	public final SortieContext sortie() throws RecognitionException {
		SortieContext _localctx = new SortieContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sortie);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(T__21);
			setState(234);
			match(T__1);
			setState(235);
			((SortieContext)_localctx).expression = expression(0);
			setState(236);
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
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_instruction);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(239);
				((InstructionContext)_localctx).expression = expression(0);
				setState(240);
				finInstruction();
				 
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				((InstructionContext)_localctx).assignation = assignation();
				setState(244);
				finInstruction();
				 
						    ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).assignation.code;
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(247);
				((InstructionContext)_localctx).entree = entree();
				setState(248);
				finInstruction();
				   
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).entree.code;
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				((InstructionContext)_localctx).sortie = sortie();
				setState(252);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).sortie.code;
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(255);
				((InstructionContext)_localctx).bloc = bloc();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).bloc.code;
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(258);
				((InstructionContext)_localctx).whilebloc = whilebloc();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).whilebloc.code;
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(261);
				((InstructionContext)_localctx).branchement = branchement();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).branchement.code;
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(264);
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
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				{
				setState(270);
				match(T__1);
				setState(271);
				((ExpressionContext)_localctx).c = expression(0);
				setState(272);
				match(T__3);

				            ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).c.code;
				        
				}
				break;
			case T__22:
				{
				setState(275);
				match(T__22);
				setState(276);
				((ExpressionContext)_localctx).d = expression(5);

				            ((ExpressionContext)_localctx).code =  "PUSHI 0\n"+ ((ExpressionContext)_localctx).d.code + "SUB\n";
				        
				}
				break;
			case ENTIER:
				{
				setState(279);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);

				            ((ExpressionContext)_localctx).code =  "PUSHI " + (((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null) + "\n";
				        
				}
				break;
			case IDENTIFIANT:
				{
				setState(281);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				 
				        VariableInfo vi = tablesSymboles.getVar((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));            
				        ((ExpressionContext)_localctx).code =  "PUSHG "+ vi.address + "\n";
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(297);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(295);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(285);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(286);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(287);
						((ExpressionContext)_localctx).b = expression(5);

						                      if((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).equals("*")){ ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "MUL\n";}
						                      else {((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "DIV\n";}
						                  
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(290);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(291);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__22 || _la==T__25) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(292);
						((ExpressionContext)_localctx).b = expression(4);

						                      if((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).equals("+")){ ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "ADD\n";}
						                      else {((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "SUB\n";}
						                  
						}
						break;
					}
					} 
				}
				setState(299);
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
	}

	public final ConditionbasiqueContext conditionbasique() throws RecognitionException {
		ConditionbasiqueContext _localctx = new ConditionbasiqueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditionbasique);
		int _la;
		try {
			setState(315);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(300);
				((ConditionbasiqueContext)_localctx).a = expression(0);
				setState(301);
				((ConditionbasiqueContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__27) | (1L << T__28))) != 0)) ) {
					((ConditionbasiqueContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(302);
				((ConditionbasiqueContext)_localctx).b = expression(0);

				            if((((ConditionbasiqueContext)_localctx).op!=null?((ConditionbasiqueContext)_localctx).op.getText():null).equals("==")){ ((ConditionbasiqueContext)_localctx).code =  ((ConditionbasiqueContext)_localctx).a.code + ((ConditionbasiqueContext)_localctx).b.code + "EQUAL\n";}
				            else {((ConditionbasiqueContext)_localctx).code =  ((ConditionbasiqueContext)_localctx).a.code + ((ConditionbasiqueContext)_localctx).b.code + "NEQ\n";}
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				((ConditionbasiqueContext)_localctx).a = expression(0);
				setState(306);
				((ConditionbasiqueContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__29 || _la==T__30) ) {
					((ConditionbasiqueContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(307);
				((ConditionbasiqueContext)_localctx).b = expression(0);

				            if((((ConditionbasiqueContext)_localctx).op!=null?((ConditionbasiqueContext)_localctx).op.getText():null).equals("<")){ ((ConditionbasiqueContext)_localctx).code =  ((ConditionbasiqueContext)_localctx).a.code + ((ConditionbasiqueContext)_localctx).b.code + "INF\n";}
				            else {((ConditionbasiqueContext)_localctx).code =  ((ConditionbasiqueContext)_localctx).a.code + ((ConditionbasiqueContext)_localctx).b.code + "SUP\n";}
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				((ConditionbasiqueContext)_localctx).a = expression(0);
				setState(311);
				((ConditionbasiqueContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__31 || _la==T__32) ) {
					((ConditionbasiqueContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(312);
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

	public static class FinInstructionContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(CalculetteParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(CalculetteParser.NEWLINE, i);
		}
		public FinInstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finInstruction; }
	}

	public final FinInstructionContext finInstruction() throws RecognitionException {
		FinInstructionContext _localctx = new FinInstructionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(318); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(317);
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
				setState(320); 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0145\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\7\6I\n\6\f\6\16\6L\13\6\3\6\3\6\7\6P\n\6\f\6\16\6S\13\6\3\6\3\6\3\6"+
		"\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\3\6\7\6`\n\6\f\6\16\6c\13\6\3\6\7\6f"+
		"\n\6\f\6\16\6i\13\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\7\3\7\3\7\7\7u\n"+
		"\7\f\7\16\7x\13\7\3\7\3\7\3\7\7\7}\n\7\f\7\16\7\u0080\13\7\3\7\3\7\3\7"+
		"\7\7\u0085\n\7\f\7\16\7\u0088\13\7\3\7\7\7\u008b\n\7\f\7\16\7\u008e\13"+
		"\7\3\7\3\7\3\7\7\7\u0093\n\7\f\7\16\7\u0096\13\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a6\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00cb\n\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00d5\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\7\n\u00e1\n\n\f\n\16\n\u00e4\13\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u010e\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\5\16\u011e\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\7\16\u012a\n\16\f\16\16\16\u012d\13\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u013e\n\17"+
		"\3\20\6\20\u0141\n\20\r\20\16\20\u0142\3\20\2\4\22\32\21\2\4\6\b\n\f\16"+
		"\20\22\24\26\30\32\34\36\2\b\3\2\32\33\4\2\31\31\34\34\3\2\35\37\3\2 "+
		"!\3\2\"#\4\2\5\5%%\2\u015b\2 \3\2\2\2\4#\3\2\2\2\6>\3\2\2\2\b@\3\2\2\2"+
		"\nJ\3\2\2\2\fv\3\2\2\2\16\u00a5\3\2\2\2\20\u00ca\3\2\2\2\22\u00d4\3\2"+
		"\2\2\24\u00e5\3\2\2\2\26\u00eb\3\2\2\2\30\u010d\3\2\2\2\32\u011d\3\2\2"+
		"\2\34\u013d\3\2\2\2\36\u0140\3\2\2\2 !\5\f\7\2!\"\7\2\2\3\"\3\3\2\2\2"+
		"#$\7\3\2\2$%\7\4\2\2%&\5\20\t\2&\'\7\5\2\2\'(\5\22\n\2()\7\5\2\2)*\5\20"+
		"\t\2*+\7\6\2\2+,\5\n\6\2,-\b\3\1\2-\5\3\2\2\2./\7\7\2\2/\60\7\4\2\2\60"+
		"\61\5\22\n\2\61\62\7\6\2\2\62\63\5\n\6\2\63\64\b\4\1\2\64?\3\2\2\2\65"+
		"\66\7\7\2\2\66\67\7\4\2\2\678\5\22\n\289\7\6\2\29:\5\n\6\2:;\7\b\2\2;"+
		"<\5\n\6\2<=\b\4\1\2=?\3\2\2\2>.\3\2\2\2>\65\3\2\2\2?\7\3\2\2\2@A\7\t\2"+
		"\2AB\7\4\2\2BC\5\22\n\2CD\7\6\2\2DE\5\n\6\2EF\b\5\1\2F\t\3\2\2\2GI\7%"+
		"\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MQ\7\n"+
		"\2\2NP\7%\2\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RY\3\2\2\2SQ\3\2"+
		"\2\2TU\5\16\b\2UV\b\6\1\2VX\3\2\2\2WT\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3"+
		"\2\2\2Za\3\2\2\2[Y\3\2\2\2\\]\5\30\r\2]^\b\6\1\2^`\3\2\2\2_\\\3\2\2\2"+
		"`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bg\3\2\2\2ca\3\2\2\2df\7%\2\2ed\3\2\2\2"+
		"fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jn\7\13\2\2km\7%\2\2"+
		"lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2o\13\3\2\2\2pn\3\2\2\2qr\5\b\5"+
		"\2rs\b\7\1\2su\3\2\2\2tq\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w~\3\2\2"+
		"\2xv\3\2\2\2yz\5\n\6\2z{\b\7\1\2{}\3\2\2\2|y\3\2\2\2}\u0080\3\2\2\2~|"+
		"\3\2\2\2~\177\3\2\2\2\177\u0086\3\2\2\2\u0080~\3\2\2\2\u0081\u0082\5\16"+
		"\b\2\u0082\u0083\b\7\1\2\u0083\u0085\3\2\2\2\u0084\u0081\3\2\2\2\u0085"+
		"\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u008c\3\2"+
		"\2\2\u0088\u0086\3\2\2\2\u0089\u008b\7%\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0094\3\2"+
		"\2\2\u008e\u008c\3\2\2\2\u008f\u0090\5\30\r\2\u0090\u0091\b\7\1\2\u0091"+
		"\u0093\3\2\2\2\u0092\u008f\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0098\b\7\1\2\u0098\r\3\2\2\2\u0099\u009a\7\'\2\2\u009a\u009b\7)\2\2"+
		"\u009b\u009c\5\36\20\2\u009c\u009d\b\b\1\2\u009d\u00a6\3\2\2\2\u009e\u009f"+
		"\7\'\2\2\u009f\u00a0\7)\2\2\u00a0\u00a1\7\f\2\2\u00a1\u00a2\5\32\16\2"+
		"\u00a2\u00a3\5\36\20\2\u00a3\u00a4\b\b\1\2\u00a4\u00a6\3\2\2\2\u00a5\u0099"+
		"\3\2\2\2\u00a5\u009e\3\2\2\2\u00a6\17\3\2\2\2\u00a7\u00a8\7)\2\2\u00a8"+
		"\u00a9\7\f\2\2\u00a9\u00aa\5\32\16\2\u00aa\u00ab\b\t\1\2\u00ab\u00cb\3"+
		"\2\2\2\u00ac\u00ad\7)\2\2\u00ad\u00ae\7\r\2\2\u00ae\u00af\5\32\16\2\u00af"+
		"\u00b0\b\t\1\2\u00b0\u00cb\3\2\2\2\u00b1\u00b2\7)\2\2\u00b2\u00b3\7\16"+
		"\2\2\u00b3\u00b4\5\32\16\2\u00b4\u00b5\b\t\1\2\u00b5\u00cb\3\2\2\2\u00b6"+
		"\u00b7\7)\2\2\u00b7\u00b8\7\17\2\2\u00b8\u00b9\5\32\16\2\u00b9\u00ba\b"+
		"\t\1\2\u00ba\u00cb\3\2\2\2\u00bb\u00bc\7)\2\2\u00bc\u00bd\7\20\2\2\u00bd"+
		"\u00be\5\32\16\2\u00be\u00bf\b\t\1\2\u00bf\u00cb\3\2\2\2\u00c0\u00c1\7"+
		")\2\2\u00c1\u00c2\7\21\2\2\u00c2\u00c3\5\36\20\2\u00c3\u00c4\b\t\1\2\u00c4"+
		"\u00cb\3\2\2\2\u00c5\u00c6\7)\2\2\u00c6\u00c7\7\22\2\2\u00c7\u00c8\5\36"+
		"\20\2\u00c8\u00c9\b\t\1\2\u00c9\u00cb\3\2\2\2\u00ca\u00a7\3\2\2\2\u00ca"+
		"\u00ac\3\2\2\2\u00ca\u00b1\3\2\2\2\u00ca\u00b6\3\2\2\2\u00ca\u00bb\3\2"+
		"\2\2\u00ca\u00c0\3\2\2\2\u00ca\u00c5\3\2\2\2\u00cb\21\3\2\2\2\u00cc\u00cd"+
		"\b\n\1\2\u00cd\u00ce\5\34\17\2\u00ce\u00cf\b\n\1\2\u00cf\u00d5\3\2\2\2"+
		"\u00d0\u00d1\7\25\2\2\u00d1\u00d5\b\n\1\2\u00d2\u00d3\7\26\2\2\u00d3\u00d5"+
		"\b\n\1\2\u00d4\u00cc\3\2\2\2\u00d4\u00d0\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5"+
		"\u00e2\3\2\2\2\u00d6\u00d7\f\7\2\2\u00d7\u00d8\7\23\2\2\u00d8\u00d9\5"+
		"\22\n\b\u00d9\u00da\b\n\1\2\u00da\u00e1\3\2\2\2\u00db\u00dc\f\6\2\2\u00dc"+
		"\u00dd\7\24\2\2\u00dd\u00de\5\22\n\7\u00de\u00df\b\n\1\2\u00df\u00e1\3"+
		"\2\2\2\u00e0\u00d6\3\2\2\2\u00e0\u00db\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\23\3\2\2\2\u00e4\u00e2\3\2\2"+
		"\2\u00e5\u00e6\7\27\2\2\u00e6\u00e7\7\4\2\2\u00e7\u00e8\7)\2\2\u00e8\u00e9"+
		"\7\6\2\2\u00e9\u00ea\b\13\1\2\u00ea\25\3\2\2\2\u00eb\u00ec\7\30\2\2\u00ec"+
		"\u00ed\7\4\2\2\u00ed\u00ee\5\32\16\2\u00ee\u00ef\7\6\2\2\u00ef\u00f0\b"+
		"\f\1\2\u00f0\27\3\2\2\2\u00f1\u00f2\5\32\16\2\u00f2\u00f3\5\36\20\2\u00f3"+
		"\u00f4\b\r\1\2\u00f4\u010e\3\2\2\2\u00f5\u00f6\5\20\t\2\u00f6\u00f7\5"+
		"\36\20\2\u00f7\u00f8\b\r\1\2\u00f8\u010e\3\2\2\2\u00f9\u00fa\5\24\13\2"+
		"\u00fa\u00fb\5\36\20\2\u00fb\u00fc\b\r\1\2\u00fc\u010e\3\2\2\2\u00fd\u00fe"+
		"\5\26\f\2\u00fe\u00ff\5\36\20\2\u00ff\u0100\b\r\1\2\u0100\u010e\3\2\2"+
		"\2\u0101\u0102\5\n\6\2\u0102\u0103\b\r\1\2\u0103\u010e\3\2\2\2\u0104\u0105"+
		"\5\b\5\2\u0105\u0106\b\r\1\2\u0106\u010e\3\2\2\2\u0107\u0108\5\6\4\2\u0108"+
		"\u0109\b\r\1\2\u0109\u010e\3\2\2\2\u010a\u010b\5\4\3\2\u010b\u010c\b\r"+
		"\1\2\u010c\u010e\3\2\2\2\u010d\u00f1\3\2\2\2\u010d\u00f5\3\2\2\2\u010d"+
		"\u00f9\3\2\2\2\u010d\u00fd\3\2\2\2\u010d\u0101\3\2\2\2\u010d\u0104\3\2"+
		"\2\2\u010d\u0107\3\2\2\2\u010d\u010a\3\2\2\2\u010e\31\3\2\2\2\u010f\u0110"+
		"\b\16\1\2\u0110\u0111\7\4\2\2\u0111\u0112\5\32\16\2\u0112\u0113\7\6\2"+
		"\2\u0113\u0114\b\16\1\2\u0114\u011e\3\2\2\2\u0115\u0116\7\31\2\2\u0116"+
		"\u0117\5\32\16\7\u0117\u0118\b\16\1\2\u0118\u011e\3\2\2\2\u0119\u011a"+
		"\7&\2\2\u011a\u011e\b\16\1\2\u011b\u011c\7)\2\2\u011c\u011e\b\16\1\2\u011d"+
		"\u010f\3\2\2\2\u011d\u0115\3\2\2\2\u011d\u0119\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011e\u012b\3\2\2\2\u011f\u0120\f\6\2\2\u0120\u0121\t\2\2\2\u0121"+
		"\u0122\5\32\16\7\u0122\u0123\b\16\1\2\u0123\u012a\3\2\2\2\u0124\u0125"+
		"\f\5\2\2\u0125\u0126\t\3\2\2\u0126\u0127\5\32\16\6\u0127\u0128\b\16\1"+
		"\2\u0128\u012a\3\2\2\2\u0129\u011f\3\2\2\2\u0129\u0124\3\2\2\2\u012a\u012d"+
		"\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\33\3\2\2\2\u012d"+
		"\u012b\3\2\2\2\u012e\u012f\5\32\16\2\u012f\u0130\t\4\2\2\u0130\u0131\5"+
		"\32\16\2\u0131\u0132\b\17\1\2\u0132\u013e\3\2\2\2\u0133\u0134\5\32\16"+
		"\2\u0134\u0135\t\5\2\2\u0135\u0136\5\32\16\2\u0136\u0137\b\17\1\2\u0137"+
		"\u013e\3\2\2\2\u0138\u0139\5\32\16\2\u0139\u013a\t\6\2\2\u013a\u013b\5"+
		"\32\16\2\u013b\u013c\b\17\1\2\u013c\u013e\3\2\2\2\u013d\u012e\3\2\2\2"+
		"\u013d\u0133\3\2\2\2\u013d\u0138\3\2\2\2\u013e\35\3\2\2\2\u013f\u0141"+
		"\t\7\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\37\3\2\2\2\31>JQYagnv~\u0086\u008c\u0094\u00a5\u00ca"+
		"\u00d4\u00e0\u00e2\u010d\u011d\u0129\u012b\u013d\u0142";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}