// Generated from Calculette.g4 by ANTLR 4.7.2
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
	public static final int
		RULE_start = 0, RULE_forbloc = 1, RULE_branchement = 2, RULE_whilebloc = 3, 
		RULE_bloc = 4, RULE_calcul = 5, RULE_decl = 6, RULE_assignation = 7, RULE_condition = 8, 
		RULE_entree = 9, RULE_sortie = 10, RULE_instruction = 11, RULE_expression = 12, 
		RULE_conditionbasique = 13, RULE_fonction = 14, RULE_finInstruction = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "forbloc", "branchement", "whilebloc", "bloc", "calcul", "decl", 
			"assignation", "condition", "entree", "sortie", "instruction", "expression", 
			"conditionbasique", "fonction", "finInstruction"
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
			setState(32);
			calcul();
			setState(33);
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
			setState(35);
			match(T__0);
			setState(36);
			match(T__1);
			setState(37);
			((ForblocContext)_localctx).debut = assignation();
			setState(38);
			match(T__2);
			setState(39);
			((ForblocContext)_localctx).condition = condition(0);
			setState(40);
			match(T__2);
			setState(41);
			((ForblocContext)_localctx).incr = assignation();
			setState(42);
			match(T__3);
			setState(43);
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
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(T__4);
				setState(47);
				match(T__1);
				setState(48);
				((BranchementContext)_localctx).condition = condition(0);
				setState(49);
				match(T__3);
				setState(50);
				((BranchementContext)_localctx).bloc = bloc();

				            String label = getNewLabel();
				            _localctx.code += ((BranchementContext)_localctx).condition.code + "JUMPF " + label + "\n" + ((BranchementContext)_localctx).bloc.code + "LABEL " + label + "\n";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				match(T__4);
				setState(54);
				match(T__1);
				setState(55);
				((BranchementContext)_localctx).condition = condition(0);
				setState(56);
				match(T__3);
				setState(57);
				((BranchementContext)_localctx).bloc1 = bloc();
				setState(58);
				match(T__5);
				setState(59);
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
		public InstructionContext instruction;
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
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
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(T__6);
				setState(65);
				match(T__1);
				setState(66);
				((WhileblocContext)_localctx).condition = condition(0);
				setState(67);
				match(T__3);
				setState(68);
				((WhileblocContext)_localctx).bloc = bloc();
				   
				            String labeldebut = getNewLabel();
				            String labelfin = getNewLabel();
				            _localctx.code += "LABEL "+ labeldebut +"\n"+ ((WhileblocContext)_localctx).condition.code + "JUMPF "+ labelfin + "\n" + ((WhileblocContext)_localctx).bloc.code + "JUMP "+labeldebut+ "\n"+ "LABEL "+ labelfin + "\n";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(T__6);
				setState(72);
				match(T__1);
				setState(73);
				((WhileblocContext)_localctx).condition = condition(0);
				setState(74);
				match(T__3);
				setState(75);
				((WhileblocContext)_localctx).instruction = instruction();
				   
				            String labeldebut = getNewLabel();
				            String labelfin = getNewLabel();
				            _localctx.code += "LABEL "+ labeldebut +"\n"+ ((WhileblocContext)_localctx).condition.code + "JUMPF "+ labelfin + "\n" + ((WhileblocContext)_localctx).instruction.code + "JUMP "+labeldebut+ "\n"+ "LABEL "+ labelfin + "\n";
				        
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
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(80);
				match(NEWLINE);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(T__7);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					match(NEWLINE);
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(98);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(93);
				((BlocContext)_localctx).decl = decl();
				 _localctx.code += ((BlocContext)_localctx).decl.code; 
				}
				}
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(106);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(101);
					((BlocContext)_localctx).instruction = instruction();
					 _localctx.code += ((BlocContext)_localctx).instruction.code; 
					}
					} 
				}
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(109);
				match(NEWLINE);
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
			match(T__8);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					match(NEWLINE);
					}
					} 
				}
				setState(121);
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
		public FonctionContext fonction;
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
		public List<FonctionContext> fonction() {
			return getRuleContexts(FonctionContext.class);
		}
		public FonctionContext fonction(int i) {
			return getRuleContext(FonctionContext.class,i);
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
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(122);
						((CalculContext)_localctx).whilebloc = whilebloc();
						 _localctx.code += ((CalculContext)_localctx).whilebloc.code; 
						}
						} 
					}
					setState(129);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				}
				setState(135);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(130);
						((CalculContext)_localctx).bloc = bloc();
						 _localctx.code += ((CalculContext)_localctx).bloc.code; 
						}
						} 
					}
					setState(137);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TYPE) {
					{
					{
					setState(138);
					((CalculContext)_localctx).decl = decl();
					 _localctx.code += ((CalculContext)_localctx).decl.code; 
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(146);
						match(NEWLINE);
						}
						} 
					}
					setState(151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << NEWLINE) | (1L << ENTIER) | (1L << IDENTIFIANT))) != 0)) {
					{
					{
					setState(152);
					((CalculContext)_localctx).instruction = instruction();
					 _localctx.code += ((CalculContext)_localctx).instruction.code; 
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 _localctx.code += "  HALT\n"; 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(161);
						((CalculContext)_localctx).decl = decl();
						 _localctx.code += ((CalculContext)_localctx).decl.code; 
						}
						} 
					}
					setState(168);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				 _localctx.code += "   JUMP Main\n"; 
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(170);
						match(NEWLINE);
						}
						} 
					}
					setState(175);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TYPE) {
					{
					{
					setState(176);
					((CalculContext)_localctx).fonction = fonction();
					 _localctx.code += ((CalculContext)_localctx).fonction.code; 
					}
					}
					setState(183);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(184);
						match(NEWLINE);
						}
						} 
					}
					setState(189);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				 _localctx.code += "LABEL Main\n"; 
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__4) | (1L << T__6) | (1L << T__7) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << NEWLINE) | (1L << ENTIER) | (1L << IDENTIFIANT))) != 0)) {
					{
					{
					setState(191);
					((CalculContext)_localctx).instruction = instruction();
					 _localctx.code += ((CalculContext)_localctx).instruction.code; 
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				 _localctx.code += "  HALT\n"; 
				}
				break;
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
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(202);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(203);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(204);
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
				setState(207);
				((DeclContext)_localctx).TYPE = match(TYPE);
				setState(208);
				((DeclContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(209);
				match(T__9);
				setState(210);
				((DeclContext)_localctx).expression = expression(0);
				setState(211);
				finInstruction();

				            if ((((DeclContext)_localctx).TYPE!=null?((DeclContext)_localctx).TYPE.getText():null).equals("int")) {
				                tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), "int");
				                ((DeclContext)_localctx).code =  "PUSHI 0\n"+ ((DeclContext)_localctx).expression.code + "STOREG " + tablesSymboles.getVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null)).address + "\n";
				            } else {
				                tablesSymboles.addVarDecl((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null), "double");
				                ((DeclContext)_localctx).code =  "PUSHF 0\n"+ ((DeclContext)_localctx).expression.code + "STOREG " + tablesSymboles.getVar((((DeclContext)_localctx).IDENTIFIANT!=null?((DeclContext)_localctx).IDENTIFIANT.getText():null)).address + "\n";
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
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(217);
				match(T__9);
				setState(218);
				((AssignationContext)_localctx).expression = expression(0);
				  
				            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            ((AssignationContext)_localctx).code =  ((AssignationContext)_localctx).expression.code + "STOREG " + vi.address + "\n";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(221);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(222);
				match(T__10);
				setState(223);
				((AssignationContext)_localctx).expression = expression(0);

				            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            ((AssignationContext)_localctx).code =  "PUSHG " + vi.address + "\n" + ((AssignationContext)_localctx).expression.code + "ADD\n" + "STOREG " + vi.address + "\n";
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(226);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(227);
				match(T__11);
				setState(228);
				((AssignationContext)_localctx).expression = expression(0);

				            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            ((AssignationContext)_localctx).code =  "PUSHG " + vi.address + "\n" + ((AssignationContext)_localctx).expression.code + "SUB\n" + "STOREG " + vi.address + "\n";
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(232);
				match(T__12);
				setState(233);
				((AssignationContext)_localctx).expression = expression(0);

				            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            ((AssignationContext)_localctx).code =  "PUSHG " + vi.address + "\n" + ((AssignationContext)_localctx).expression.code + "MUL\n" + "STOREG " + vi.address + "\n";
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(237);
				match(T__13);
				setState(238);
				((AssignationContext)_localctx).expression = expression(0);

				            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            ((AssignationContext)_localctx).code =  "PUSHG " + vi.address + "\n" + ((AssignationContext)_localctx).expression.code + "DIV\n" + "STOREG " + vi.address + "\n";
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(241);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(242);
				match(T__14);

				            VariableInfo vi = tablesSymboles.getVar((((AssignationContext)_localctx).IDENTIFIANT!=null?((AssignationContext)_localctx).IDENTIFIANT.getText():null));
				            ((AssignationContext)_localctx).code =  "PUSHG " + vi.address + "\n" + "PUSHI 1\n" + "ADD\n" + "STOREG " + vi.address + "\n";
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(244);
				((AssignationContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(245);
				match(T__15);

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
			setState(257);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
			case T__22:
			case ENTIER:
			case IDENTIFIANT:
				{
				setState(250);
				((ConditionContext)_localctx).conditionbasique = conditionbasique();

				            ((ConditionContext)_localctx).code =  ((ConditionContext)_localctx).conditionbasique.code;
				        
				}
				break;
			case T__18:
				{
				setState(253);
				match(T__18);
				((ConditionContext)_localctx).code =  "PUSHI 1\n";
				        
				}
				break;
			case T__19:
				{
				setState(255);
				match(T__19);
				((ConditionContext)_localctx).code =  "PUSHI 0\n";
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(271);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(269);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ConditionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_condition);
						setState(259);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(260);
						match(T__16);
						}
						setState(261);
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
						setState(264);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(265);
						match(T__17);
						}
						setState(266);
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
				setState(273);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
			setState(274);
			match(T__20);
			setState(275);
			match(T__1);
			setState(276);
			((EntreeContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
			setState(277);
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
			setState(280);
			match(T__21);
			setState(281);
			match(T__1);
			setState(282);
			((SortieContext)_localctx).expression = expression(0);
			setState(283);
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
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(286);
				((InstructionContext)_localctx).expression = expression(0);
				setState(287);
				finInstruction();
				 
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).expression.code;
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				((InstructionContext)_localctx).assignation = assignation();
				setState(291);
				finInstruction();
				 
						    ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).assignation.code;
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				((InstructionContext)_localctx).entree = entree();
				setState(295);
				finInstruction();
				   
				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).entree.code;
				        
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(298);
				((InstructionContext)_localctx).sortie = sortie();
				setState(299);
				finInstruction();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).sortie.code;
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(302);
				((InstructionContext)_localctx).bloc = bloc();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).bloc.code;
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(305);
				((InstructionContext)_localctx).whilebloc = whilebloc();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).whilebloc.code;
				        
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(308);
				((InstructionContext)_localctx).branchement = branchement();

				            ((InstructionContext)_localctx).code =  ((InstructionContext)_localctx).branchement.code;
				        
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(311);
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
			setState(334);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(317);
				match(T__1);
				setState(318);
				((ExpressionContext)_localctx).c = expression(0);
				setState(319);
				match(T__3);

				            ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).c.code;
				        
				}
				break;
			case 2:
				{
				setState(322);
				match(T__22);
				setState(323);
				((ExpressionContext)_localctx).d = expression(6);

				            ((ExpressionContext)_localctx).code =  "PUSHI 0\n"+ ((ExpressionContext)_localctx).d.code + "SUB\n";
				        
				}
				break;
			case 3:
				{
				setState(326);
				((ExpressionContext)_localctx).ENTIER = match(ENTIER);

				            ((ExpressionContext)_localctx).code =  "PUSHI " + (((ExpressionContext)_localctx).ENTIER!=null?((ExpressionContext)_localctx).ENTIER.getText():null) + "\n";
				        
				}
				break;
			case 4:
				{
				setState(328);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				 
				        VariableInfo vi = tablesSymboles.getVar((((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null));            
				        ((ExpressionContext)_localctx).code =  "PUSHG "+ vi.address + "\n";
				        
				}
				break;
			case 5:
				{
				setState(330);
				((ExpressionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);
				setState(331);
				match(T__1);
				setState(332);
				match(T__3);

				            ((ExpressionContext)_localctx).code =  "CALL " + (((ExpressionContext)_localctx).IDENTIFIANT!=null?((ExpressionContext)_localctx).IDENTIFIANT.getText():null) + "\n";
				        
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(346);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(336);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(337);
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
						setState(338);
						((ExpressionContext)_localctx).b = expression(6);

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
						setState(341);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(342);
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
						setState(343);
						((ExpressionContext)_localctx).b = expression(5);

						                      if((((ExpressionContext)_localctx).op!=null?((ExpressionContext)_localctx).op.getText():null).equals("+")){ ((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "ADD\n";}
						                      else {((ExpressionContext)_localctx).code =  ((ExpressionContext)_localctx).a.code + ((ExpressionContext)_localctx).b.code + "SUB\n";}
						                  
						}
						break;
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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
			setState(366);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(351);
				((ConditionbasiqueContext)_localctx).a = expression(0);
				setState(352);
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
				setState(353);
				((ConditionbasiqueContext)_localctx).b = expression(0);

				            if((((ConditionbasiqueContext)_localctx).op!=null?((ConditionbasiqueContext)_localctx).op.getText():null).equals("==")){ ((ConditionbasiqueContext)_localctx).code =  ((ConditionbasiqueContext)_localctx).a.code + ((ConditionbasiqueContext)_localctx).b.code + "EQUAL\n";}
				            else {((ConditionbasiqueContext)_localctx).code =  ((ConditionbasiqueContext)_localctx).a.code + ((ConditionbasiqueContext)_localctx).b.code + "NEQ\n";}
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				((ConditionbasiqueContext)_localctx).a = expression(0);
				setState(357);
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
				setState(358);
				((ConditionbasiqueContext)_localctx).b = expression(0);

				            if((((ConditionbasiqueContext)_localctx).op!=null?((ConditionbasiqueContext)_localctx).op.getText():null).equals("<")){ ((ConditionbasiqueContext)_localctx).code =  ((ConditionbasiqueContext)_localctx).a.code + ((ConditionbasiqueContext)_localctx).b.code + "INF\n";}
				            else {((ConditionbasiqueContext)_localctx).code =  ((ConditionbasiqueContext)_localctx).a.code + ((ConditionbasiqueContext)_localctx).b.code + "SUP\n";}
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(361);
				((ConditionbasiqueContext)_localctx).a = expression(0);
				setState(362);
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
				setState(363);
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

	public static class FonctionContext extends ParserRuleContext {
		public String code;
		public Token TYPE;
		public Token IDENTIFIANT;
		public BlocContext bloc;
		public TerminalNode TYPE() { return getToken(CalculetteParser.TYPE, 0); }
		public TerminalNode IDENTIFIANT() { return getToken(CalculetteParser.IDENTIFIANT, 0); }
		public BlocContext bloc() {
			return getRuleContext(BlocContext.class,0);
		}
		public FonctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fonction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).enterFonction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CalculetteListener ) ((CalculetteListener)listener).exitFonction(this);
		}
	}

	public final FonctionContext fonction() throws RecognitionException {
		FonctionContext _localctx = new FonctionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fonction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(368);
			((FonctionContext)_localctx).TYPE = match(TYPE);
			setState(369);
			((FonctionContext)_localctx).IDENTIFIANT = match(IDENTIFIANT);

				    //Enregistre le type de la fonction:  
			        tablesSymboles.addFunction((((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null), (((FonctionContext)_localctx).TYPE!=null?((FonctionContext)_localctx).TYPE.getText():null));
			        ((FonctionContext)_localctx).code =  "LABEL " + (((FonctionContext)_localctx).IDENTIFIANT!=null?((FonctionContext)_localctx).IDENTIFIANT.getText():null) + "\n";
			        
			setState(371);
			match(T__1);
			setState(372);
			match(T__3);
			setState(373);
			((FonctionContext)_localctx).bloc = bloc();

			        // corps de la fonction
			        ((FonctionContext)_localctx).code =  ((FonctionContext)_localctx).bloc.code;
				    _localctx.code += "RETURN\n";  //  Return "de sécurité"      
			        
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
		enterRule(_localctx, 30, RULE_finInstruction);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(377); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(376);
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
				setState(379); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
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
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u0180\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\6\7\6T\n\6\f\6\16\6W\13"+
		"\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\3\6\3\6\7\6c\n\6\f\6\16\6f\13\6"+
		"\3\6\3\6\3\6\7\6k\n\6\f\6\16\6n\13\6\3\6\7\6q\n\6\f\6\16\6t\13\6\3\6\3"+
		"\6\7\6x\n\6\f\6\16\6{\13\6\3\7\3\7\3\7\7\7\u0080\n\7\f\7\16\7\u0083\13"+
		"\7\3\7\3\7\3\7\7\7\u0088\n\7\f\7\16\7\u008b\13\7\3\7\3\7\3\7\7\7\u0090"+
		"\n\7\f\7\16\7\u0093\13\7\3\7\7\7\u0096\n\7\f\7\16\7\u0099\13\7\3\7\3\7"+
		"\3\7\7\7\u009e\n\7\f\7\16\7\u00a1\13\7\3\7\3\7\3\7\3\7\7\7\u00a7\n\7\f"+
		"\7\16\7\u00aa\13\7\3\7\3\7\7\7\u00ae\n\7\f\7\16\7\u00b1\13\7\3\7\3\7\3"+
		"\7\7\7\u00b6\n\7\f\7\16\7\u00b9\13\7\3\7\7\7\u00bc\n\7\f\7\16\7\u00bf"+
		"\13\7\3\7\3\7\3\7\3\7\7\7\u00c5\n\7\f\7\16\7\u00c8\13\7\3\7\5\7\u00cb"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00d9\n\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00fa\n\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0104\n\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\7\n\u0110\n\n\f\n\16\n\u0113\13\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u013d\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0151\n\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u015d\n\16\f\16\16\16\u0160\13\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u0171\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\6\21"+
		"\u017c\n\21\r\21\16\21\u017d\3\21\2\4\22\32\22\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \2\b\3\2\32\33\4\2\31\31\34\34\3\2\35\37\3\2 !\3\2\"#"+
		"\4\2\5\5%%\2\u019d\2\"\3\2\2\2\4%\3\2\2\2\6@\3\2\2\2\bP\3\2\2\2\nU\3\2"+
		"\2\2\f\u00ca\3\2\2\2\16\u00d8\3\2\2\2\20\u00f9\3\2\2\2\22\u0103\3\2\2"+
		"\2\24\u0114\3\2\2\2\26\u011a\3\2\2\2\30\u013c\3\2\2\2\32\u0150\3\2\2\2"+
		"\34\u0170\3\2\2\2\36\u0172\3\2\2\2 \u017b\3\2\2\2\"#\5\f\7\2#$\7\2\2\3"+
		"$\3\3\2\2\2%&\7\3\2\2&\'\7\4\2\2\'(\5\20\t\2()\7\5\2\2)*\5\22\n\2*+\7"+
		"\5\2\2+,\5\20\t\2,-\7\6\2\2-.\5\n\6\2./\b\3\1\2/\5\3\2\2\2\60\61\7\7\2"+
		"\2\61\62\7\4\2\2\62\63\5\22\n\2\63\64\7\6\2\2\64\65\5\n\6\2\65\66\b\4"+
		"\1\2\66A\3\2\2\2\678\7\7\2\289\7\4\2\29:\5\22\n\2:;\7\6\2\2;<\5\n\6\2"+
		"<=\7\b\2\2=>\5\n\6\2>?\b\4\1\2?A\3\2\2\2@\60\3\2\2\2@\67\3\2\2\2A\7\3"+
		"\2\2\2BC\7\t\2\2CD\7\4\2\2DE\5\22\n\2EF\7\6\2\2FG\5\n\6\2GH\b\5\1\2HQ"+
		"\3\2\2\2IJ\7\t\2\2JK\7\4\2\2KL\5\22\n\2LM\7\6\2\2MN\5\30\r\2NO\b\5\1\2"+
		"OQ\3\2\2\2PB\3\2\2\2PI\3\2\2\2Q\t\3\2\2\2RT\7%\2\2SR\3\2\2\2TW\3\2\2\2"+
		"US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU\3\2\2\2X\\\7\n\2\2Y[\7%\2\2ZY\3\2\2\2"+
		"[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]d\3\2\2\2^\\\3\2\2\2_`\5\16\b\2`a\b\6"+
		"\1\2ac\3\2\2\2b_\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2el\3\2\2\2fd\3\2"+
		"\2\2gh\5\30\r\2hi\b\6\1\2ik\3\2\2\2jg\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3"+
		"\2\2\2mr\3\2\2\2nl\3\2\2\2oq\7%\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3"+
		"\2\2\2su\3\2\2\2tr\3\2\2\2uy\7\13\2\2vx\7%\2\2wv\3\2\2\2x{\3\2\2\2yw\3"+
		"\2\2\2yz\3\2\2\2z\13\3\2\2\2{y\3\2\2\2|}\5\b\5\2}~\b\7\1\2~\u0080\3\2"+
		"\2\2\177|\3\2\2\2\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3"+
		"\2\2\2\u0082\u0089\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\5\n\6\2\u0085"+
		"\u0086\b\7\1\2\u0086\u0088\3\2\2\2\u0087\u0084\3\2\2\2\u0088\u008b\3\2"+
		"\2\2\u0089\u0087\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u0091\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008c\u008d\5\16\b\2\u008d\u008e\b\7\1\2\u008e\u0090\3"+
		"\2\2\2\u008f\u008c\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0097\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\7%"+
		"\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0097"+
		"\u0098\3\2\2\2\u0098\u009f\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009b\5\30"+
		"\r\2\u009b\u009c\b\7\1\2\u009c\u009e\3\2\2\2\u009d\u009a\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u00cb\b\7\1\2\u00a3\u00a4\5\16\b\2\u00a4"+
		"\u00a5\b\7\1\2\u00a5\u00a7\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a7\u00aa\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa"+
		"\u00a8\3\2\2\2\u00ab\u00af\b\7\1\2\u00ac\u00ae\7%\2\2\u00ad\u00ac\3\2"+
		"\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b7\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3\5\36\20\2\u00b3\u00b4\b"+
		"\7\1\2\u00b4\u00b6\3\2\2\2\u00b5\u00b2\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7"+
		"\u00b5\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bd\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00ba\u00bc\7%\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd"+
		"\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2"+
		"\2\2\u00c0\u00c6\b\7\1\2\u00c1\u00c2\5\30\r\2\u00c2\u00c3\b\7\1\2\u00c3"+
		"\u00c5\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00cb\b\7\1\2\u00ca\u0081\3\2\2\2\u00ca\u00a8\3\2\2\2\u00cb\r\3\2\2\2"+
		"\u00cc\u00cd\7\'\2\2\u00cd\u00ce\7)\2\2\u00ce\u00cf\5 \21\2\u00cf\u00d0"+
		"\b\b\1\2\u00d0\u00d9\3\2\2\2\u00d1\u00d2\7\'\2\2\u00d2\u00d3\7)\2\2\u00d3"+
		"\u00d4\7\f\2\2\u00d4\u00d5\5\32\16\2\u00d5\u00d6\5 \21\2\u00d6\u00d7\b"+
		"\b\1\2\u00d7\u00d9\3\2\2\2\u00d8\u00cc\3\2\2\2\u00d8\u00d1\3\2\2\2\u00d9"+
		"\17\3\2\2\2\u00da\u00db\7)\2\2\u00db\u00dc\7\f\2\2\u00dc\u00dd\5\32\16"+
		"\2\u00dd\u00de\b\t\1\2\u00de\u00fa\3\2\2\2\u00df\u00e0\7)\2\2\u00e0\u00e1"+
		"\7\r\2\2\u00e1\u00e2\5\32\16\2\u00e2\u00e3\b\t\1\2\u00e3\u00fa\3\2\2\2"+
		"\u00e4\u00e5\7)\2\2\u00e5\u00e6\7\16\2\2\u00e6\u00e7\5\32\16\2\u00e7\u00e8"+
		"\b\t\1\2\u00e8\u00fa\3\2\2\2\u00e9\u00ea\7)\2\2\u00ea\u00eb\7\17\2\2\u00eb"+
		"\u00ec\5\32\16\2\u00ec\u00ed\b\t\1\2\u00ed\u00fa\3\2\2\2\u00ee\u00ef\7"+
		")\2\2\u00ef\u00f0\7\20\2\2\u00f0\u00f1\5\32\16\2\u00f1\u00f2\b\t\1\2\u00f2"+
		"\u00fa\3\2\2\2\u00f3\u00f4\7)\2\2\u00f4\u00f5\7\21\2\2\u00f5\u00fa\b\t"+
		"\1\2\u00f6\u00f7\7)\2\2\u00f7\u00f8\7\22\2\2\u00f8\u00fa\b\t\1\2\u00f9"+
		"\u00da\3\2\2\2\u00f9\u00df\3\2\2\2\u00f9\u00e4\3\2\2\2\u00f9\u00e9\3\2"+
		"\2\2\u00f9\u00ee\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f6\3\2\2\2\u00fa"+
		"\21\3\2\2\2\u00fb\u00fc\b\n\1\2\u00fc\u00fd\5\34\17\2\u00fd\u00fe\b\n"+
		"\1\2\u00fe\u0104\3\2\2\2\u00ff\u0100\7\25\2\2\u0100\u0104\b\n\1\2\u0101"+
		"\u0102\7\26\2\2\u0102\u0104\b\n\1\2\u0103\u00fb\3\2\2\2\u0103\u00ff\3"+
		"\2\2\2\u0103\u0101\3\2\2\2\u0104\u0111\3\2\2\2\u0105\u0106\f\7\2\2\u0106"+
		"\u0107\7\23\2\2\u0107\u0108\5\22\n\b\u0108\u0109\b\n\1\2\u0109\u0110\3"+
		"\2\2\2\u010a\u010b\f\6\2\2\u010b\u010c\7\24\2\2\u010c\u010d\5\22\n\7\u010d"+
		"\u010e\b\n\1\2\u010e\u0110\3\2\2\2\u010f\u0105\3\2\2\2\u010f\u010a\3\2"+
		"\2\2\u0110\u0113\3\2\2\2\u0111\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\23\3\2\2\2\u0113\u0111\3\2\2\2\u0114\u0115\7\27\2\2\u0115\u0116\7\4\2"+
		"\2\u0116\u0117\7)\2\2\u0117\u0118\7\6\2\2\u0118\u0119\b\13\1\2\u0119\25"+
		"\3\2\2\2\u011a\u011b\7\30\2\2\u011b\u011c\7\4\2\2\u011c\u011d\5\32\16"+
		"\2\u011d\u011e\7\6\2\2\u011e\u011f\b\f\1\2\u011f\27\3\2\2\2\u0120\u0121"+
		"\5\32\16\2\u0121\u0122\5 \21\2\u0122\u0123\b\r\1\2\u0123\u013d\3\2\2\2"+
		"\u0124\u0125\5\20\t\2\u0125\u0126\5 \21\2\u0126\u0127\b\r\1\2\u0127\u013d"+
		"\3\2\2\2\u0128\u0129\5\24\13\2\u0129\u012a\5 \21\2\u012a\u012b\b\r\1\2"+
		"\u012b\u013d\3\2\2\2\u012c\u012d\5\26\f\2\u012d\u012e\5 \21\2\u012e\u012f"+
		"\b\r\1\2\u012f\u013d\3\2\2\2\u0130\u0131\5\n\6\2\u0131\u0132\b\r\1\2\u0132"+
		"\u013d\3\2\2\2\u0133\u0134\5\b\5\2\u0134\u0135\b\r\1\2\u0135\u013d\3\2"+
		"\2\2\u0136\u0137\5\6\4\2\u0137\u0138\b\r\1\2\u0138\u013d\3\2\2\2\u0139"+
		"\u013a\5\4\3\2\u013a\u013b\b\r\1\2\u013b\u013d\3\2\2\2\u013c\u0120\3\2"+
		"\2\2\u013c\u0124\3\2\2\2\u013c\u0128\3\2\2\2\u013c\u012c\3\2\2\2\u013c"+
		"\u0130\3\2\2\2\u013c\u0133\3\2\2\2\u013c\u0136\3\2\2\2\u013c\u0139\3\2"+
		"\2\2\u013d\31\3\2\2\2\u013e\u013f\b\16\1\2\u013f\u0140\7\4\2\2\u0140\u0141"+
		"\5\32\16\2\u0141\u0142\7\6\2\2\u0142\u0143\b\16\1\2\u0143\u0151\3\2\2"+
		"\2\u0144\u0145\7\31\2\2\u0145\u0146\5\32\16\b\u0146\u0147\b\16\1\2\u0147"+
		"\u0151\3\2\2\2\u0148\u0149\7&\2\2\u0149\u0151\b\16\1\2\u014a\u014b\7)"+
		"\2\2\u014b\u0151\b\16\1\2\u014c\u014d\7)\2\2\u014d\u014e\7\4\2\2\u014e"+
		"\u014f\7\6\2\2\u014f\u0151\b\16\1\2\u0150\u013e\3\2\2\2\u0150\u0144\3"+
		"\2\2\2\u0150\u0148\3\2\2\2\u0150\u014a\3\2\2\2\u0150\u014c\3\2\2\2\u0151"+
		"\u015e\3\2\2\2\u0152\u0153\f\7\2\2\u0153\u0154\t\2\2\2\u0154\u0155\5\32"+
		"\16\b\u0155\u0156\b\16\1\2\u0156\u015d\3\2\2\2\u0157\u0158\f\6\2\2\u0158"+
		"\u0159\t\3\2\2\u0159\u015a\5\32\16\7\u015a\u015b\b\16\1\2\u015b\u015d"+
		"\3\2\2\2\u015c\u0152\3\2\2\2\u015c\u0157\3\2\2\2\u015d\u0160\3\2\2\2\u015e"+
		"\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f\33\3\2\2\2\u0160\u015e\3\2\2"+
		"\2\u0161\u0162\5\32\16\2\u0162\u0163\t\4\2\2\u0163\u0164\5\32\16\2\u0164"+
		"\u0165\b\17\1\2\u0165\u0171\3\2\2\2\u0166\u0167\5\32\16\2\u0167\u0168"+
		"\t\5\2\2\u0168\u0169\5\32\16\2\u0169\u016a\b\17\1\2\u016a\u0171\3\2\2"+
		"\2\u016b\u016c\5\32\16\2\u016c\u016d\t\6\2\2\u016d\u016e\5\32\16\2\u016e"+
		"\u016f\b\17\1\2\u016f\u0171\3\2\2\2\u0170\u0161\3\2\2\2\u0170\u0166\3"+
		"\2\2\2\u0170\u016b\3\2\2\2\u0171\35\3\2\2\2\u0172\u0173\7\'\2\2\u0173"+
		"\u0174\7)\2\2\u0174\u0175\b\20\1\2\u0175\u0176\7\4\2\2\u0176\u0177\7\6"+
		"\2\2\u0177\u0178\5\n\6\2\u0178\u0179\b\20\1\2\u0179\37\3\2\2\2\u017a\u017c"+
		"\t\7\2\2\u017b\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017b\3\2\2\2\u017d"+
		"\u017e\3\2\2\2\u017e!\3\2\2\2 @PU\\dlry\u0081\u0089\u0091\u0097\u009f"+
		"\u00a8\u00af\u00b7\u00bd\u00c6\u00ca\u00d8\u00f9\u0103\u010f\u0111\u013c"+
		"\u0150\u015c\u015e\u0170\u017d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}