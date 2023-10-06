// Generated from C:/Users/hoooc/IdeaProjects/lab4_syntax_recognition/src/parser/Cmm.g4 by ANTLR 4.13.1
package parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CmmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ONE_LINE_COMMENT=1, MULTI_LINE_COMMENT=2, WS=3, IF=4, ELSE=5, WHILE=6, 
		VOID=7, MAIN=8, WRITE=9, STRUCT=10, INT=11, DOUBLE=12, CHAR=13, READ=14, 
		RETURN=15, ASSIGN=16, LBRACE=17, RBRACE=18, LPAREN=19, RPAREN=20, LBRACKET=21, 
		RBRACKET=22, SEMI=23, COMMA=24, ADD=25, SUB=26, MUL=27, DIV=28, MOD=29, 
		GT=30, GTE=31, LT=32, LTE=33, NEQ=34, EQ=35, AND=36, OR=37, NOT=38, DOT=39, 
		ID=40, CHAR_CONSTANT=41, DOUBLE_CONSTANT=42, INT_CONSTANT=43;
	public static final int
		RULE_program = 0, RULE_varDeclaration = 1, RULE_idList = 2, RULE_arrayDimensions = 3, 
		RULE_functionDeclaration = 4, RULE_mainFunction = 5, RULE_structDeclaration = 6, 
		RULE_fieldDeclaration = 7, RULE_block = 8, RULE_blockStatement = 9, RULE_statement = 10, 
		RULE_ifStatement = 11, RULE_assignment = 12, RULE_whileStatement = 13, 
		RULE_returnStatement = 14, RULE_writeStatement = 15, RULE_readStatement = 16, 
		RULE_functionCall = 17, RULE_expr = 18, RULE_exprList = 19, RULE_paramList = 20, 
		RULE_param = 21, RULE_type = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "varDeclaration", "idList", "arrayDimensions", "functionDeclaration", 
			"mainFunction", "structDeclaration", "fieldDeclaration", "block", "blockStatement", 
			"statement", "ifStatement", "assignment", "whileStatement", "returnStatement", 
			"writeStatement", "readStatement", "functionCall", "expr", "exprList", 
			"paramList", "param", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'if'", "'else'", "'while'", "'void'", "'main'", 
			"'write'", "'struct'", "'int'", "'double'", "'char'", "'read'", "'return'", 
			"'='", "'{'", "'}'", "'('", "')'", "'['", "']'", "';'", "','", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'>'", "'>='", "'<'", "'<='", "'!='", "'=='", 
			"'&&'", "'||'", "'!'", "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ONE_LINE_COMMENT", "MULTI_LINE_COMMENT", "WS", "IF", "ELSE", "WHILE", 
			"VOID", "MAIN", "WRITE", "STRUCT", "INT", "DOUBLE", "CHAR", "READ", "RETURN", 
			"ASSIGN", "LBRACE", "RBRACE", "LPAREN", "RPAREN", "LBRACKET", "RBRACKET", 
			"SEMI", "COMMA", "ADD", "SUB", "MUL", "DIV", "MOD", "GT", "GTE", "LT", 
			"LTE", "NEQ", "EQ", "AND", "OR", "NOT", "DOT", "ID", "CHAR_CONSTANT", 
			"DOUBLE_CONSTANT", "INT_CONSTANT"
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
	public String getGrammarFileName() { return "Cmm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CmmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public MainFunctionContext mainFunction() {
			return getRuleContext(MainFunctionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CmmParser.EOF, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(49);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(46);
						varDeclaration();
						}
						break;
					case 2:
						{
						setState(47);
						functionDeclaration();
						}
						break;
					case 3:
						{
						setState(48);
						structDeclaration();
						}
						break;
					}
					} 
				}
				setState(53);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(54);
			mainFunction();
			setState(55);
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
	public static class VarDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayDimensionsContext arrayDimensions() {
			return getRuleContext(ArrayDimensionsContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public IdListContext idList() {
			return getRuleContext(IdListContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varDeclaration);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				type();
				setState(58);
				arrayDimensions();
				setState(59);
				match(ID);
				setState(60);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				type();
				setState(63);
				idList();
				setState(64);
				match(SEMI);
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
	public static class IdListContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public IdListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIdList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIdList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIdList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdListContext idList() throws RecognitionException {
		IdListContext _localctx = new IdListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_idList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(ID);
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(69);
				match(COMMA);
				setState(70);
				match(ID);
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ArrayDimensionsContext extends ParserRuleContext {
		public List<TerminalNode> LBRACKET() { return getTokens(CmmParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CmmParser.LBRACKET, i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(CmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(CmmParser.INT_CONSTANT, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CmmParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CmmParser.RBRACKET, i);
		}
		public ArrayDimensionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayDimensions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterArrayDimensions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitArrayDimensions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitArrayDimensions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayDimensionsContext arrayDimensions() throws RecognitionException {
		ArrayDimensionsContext _localctx = new ArrayDimensionsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_arrayDimensions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				match(LBRACKET);
				setState(77);
				match(INT_CONSTANT);
				setState(78);
				match(RBRACKET);
				}
				}
				setState(81); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==LBRACKET );
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParamListContext paramList() {
			return getRuleContext(ParamListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			type();
			setState(84);
			match(ID);
			setState(85);
			match(LPAREN);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511642240L) != 0)) {
				{
				setState(86);
				paramList();
				}
			}

			setState(89);
			match(RPAREN);
			setState(90);
			block();
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
	public static class MainFunctionContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(CmmParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MainFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterMainFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitMainFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitMainFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainFunctionContext mainFunction() throws RecognitionException {
		MainFunctionContext _localctx = new MainFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mainFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(VOID);
			setState(93);
			match(MAIN);
			setState(94);
			match(LPAREN);
			setState(95);
			match(RPAREN);
			setState(96);
			block();
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
	public static class StructDeclarationContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(CmmParser.STRUCT, 0); }
		public TerminalNode LBRACE() { return getToken(CmmParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CmmParser.RBRACE, 0); }
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(STRUCT);
			setState(99);
			match(LBRACE);
			setState(101); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(100);
				fieldDeclaration();
				}
				}
				setState(103); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511643264L) != 0) );
			setState(105);
			match(RBRACE);
			setState(106);
			match(ID);
			setState(107);
			match(SEMI);
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
	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public List<TerminalNode> LBRACKET() { return getTokens(CmmParser.LBRACKET); }
		public TerminalNode LBRACKET(int i) {
			return getToken(CmmParser.LBRACKET, i);
		}
		public List<TerminalNode> INT_CONSTANT() { return getTokens(CmmParser.INT_CONSTANT); }
		public TerminalNode INT_CONSTANT(int i) {
			return getToken(CmmParser.INT_CONSTANT, i);
		}
		public List<TerminalNode> RBRACKET() { return getTokens(CmmParser.RBRACKET); }
		public TerminalNode RBRACKET(int i) {
			return getToken(CmmParser.RBRACKET, i);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFieldDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldDeclaration);
		int _la;
		try {
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VOID:
			case INT:
			case DOUBLE:
			case CHAR:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				type();
				setState(110);
				match(ID);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACKET) {
					{
					{
					setState(111);
					match(LBRACKET);
					setState(112);
					match(INT_CONSTANT);
					setState(113);
					match(RBRACKET);
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(SEMI);
				}
				break;
			case STRUCT:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				structDeclaration();
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
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CmmParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CmmParser.RBRACE, 0); }
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_block);
		int _la;
		try {
			setState(133);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(LBRACE);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16767552912080L) != 0)) {
					{
					{
					setState(125);
					blockStatement();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				match(RBRACE);
				}
				break;
			case IF:
			case WHILE:
			case VOID:
			case WRITE:
			case INT:
			case DOUBLE:
			case CHAR:
			case READ:
			case RETURN:
			case LPAREN:
			case NOT:
			case ID:
			case CHAR_CONSTANT:
			case DOUBLE_CONSTANT:
			case INT_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				statement();
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
	public static class BlockStatementContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitBlockStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_blockStatement);
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				statement();
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
	public static class StatementContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public WriteStatementContext writeStatement() {
			return getRuleContext(WriteStatementContext.class,0);
		}
		public ReadStatementContext readStatement() {
			return getRuleContext(ReadStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				varDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(141);
				ifStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				whileStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				returnStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(144);
				writeStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				readStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(146);
				functionCall();
				setState(147);
				match(SEMI);
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
	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CmmParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CmmParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(IF);
			setState(152);
			match(LPAREN);
			setState(153);
			expr(0);
			setState(154);
			match(RPAREN);
			setState(155);
			block();
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(156);
				match(ELSE);
				setState(157);
				block();
				}
				break;
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
	public static class AssignmentContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASSIGN() { return getToken(CmmParser.ASSIGN, 0); }
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			expr(0);
			setState(161);
			match(ASSIGN);
			setState(162);
			expr(0);
			setState(163);
			match(SEMI);
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
	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(CmmParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(WHILE);
			setState(166);
			match(LPAREN);
			setState(167);
			expr(0);
			setState(168);
			match(RPAREN);
			setState(169);
			block();
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CmmParser.RETURN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(RETURN);
			setState(172);
			expr(0);
			setState(173);
			match(SEMI);
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
	public static class WriteStatementContext extends ParserRuleContext {
		public TerminalNode WRITE() { return getToken(CmmParser.WRITE, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public WriteStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_writeStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterWriteStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitWriteStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitWriteStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WriteStatementContext writeStatement() throws RecognitionException {
		WriteStatementContext _localctx = new WriteStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_writeStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(WRITE);
			setState(176);
			exprList();
			setState(177);
			match(SEMI);
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
	public static class ReadStatementContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(CmmParser.READ, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(CmmParser.SEMI, 0); }
		public ReadStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterReadStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitReadStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitReadStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReadStatementContext readStatement() throws RecognitionException {
		ReadStatementContext _localctx = new ReadStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_readStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(READ);
			setState(180);
			exprList();
			setState(181);
			match(SEMI);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(ID);
			setState(184);
			match(LPAREN);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16767552847872L) != 0)) {
				{
				setState(185);
				exprList();
				}
			}

			setState(188);
			match(RPAREN);
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
	public static class ExprContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(CmmParser.INT_CONSTANT, 0); }
		public TerminalNode DOUBLE_CONSTANT() { return getToken(CmmParser.DOUBLE_CONSTANT, 0); }
		public TerminalNode CHAR_CONSTANT() { return getToken(CmmParser.CHAR_CONSTANT, 0); }
		public List<TerminalNode> ID() { return getTokens(CmmParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CmmParser.ID, i);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode DOT() { return getToken(CmmParser.DOT, 0); }
		public TerminalNode LPAREN() { return getToken(CmmParser.LPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(CmmParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(CmmParser.NOT, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode MUL() { return getToken(CmmParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(CmmParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(CmmParser.MOD, 0); }
		public TerminalNode ADD() { return getToken(CmmParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(CmmParser.SUB, 0); }
		public TerminalNode LT() { return getToken(CmmParser.LT, 0); }
		public TerminalNode LTE() { return getToken(CmmParser.LTE, 0); }
		public TerminalNode GT() { return getToken(CmmParser.GT, 0); }
		public TerminalNode GTE() { return getToken(CmmParser.GTE, 0); }
		public TerminalNode EQ() { return getToken(CmmParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(CmmParser.NEQ, 0); }
		public TerminalNode AND() { return getToken(CmmParser.AND, 0); }
		public TerminalNode OR() { return getToken(CmmParser.OR, 0); }
		public TerminalNode LBRACKET() { return getToken(CmmParser.LBRACKET, 0); }
		public TerminalNode RBRACKET() { return getToken(CmmParser.RBRACKET, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(191);
				match(INT_CONSTANT);
				}
				break;
			case 2:
				{
				setState(192);
				match(DOUBLE_CONSTANT);
				}
				break;
			case 3:
				{
				setState(193);
				match(CHAR_CONSTANT);
				}
				break;
			case 4:
				{
				setState(194);
				match(ID);
				}
				break;
			case 5:
				{
				setState(195);
				functionCall();
				}
				break;
			case 6:
				{
				setState(196);
				match(ID);
				setState(197);
				match(DOT);
				setState(198);
				match(ID);
				}
				break;
			case 7:
				{
				setState(199);
				match(LPAREN);
				setState(200);
				expr(0);
				setState(201);
				match(RPAREN);
				}
				break;
			case 8:
				{
				setState(203);
				match(NOT);
				setState(204);
				expr(16);
				}
				break;
			case 9:
				{
				setState(205);
				match(LPAREN);
				setState(206);
				type();
				setState(207);
				match(RPAREN);
				setState(208);
				expr(15);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(258);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(256);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(212);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(213);
						match(MUL);
						setState(214);
						expr(15);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(215);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(216);
						match(DIV);
						setState(217);
						expr(14);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(218);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(219);
						match(MOD);
						setState(220);
						expr(13);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(221);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(222);
						match(ADD);
						setState(223);
						expr(12);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(224);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(225);
						match(SUB);
						setState(226);
						expr(11);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(227);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(228);
						match(LT);
						setState(229);
						expr(10);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(230);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(231);
						match(LTE);
						setState(232);
						expr(9);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(233);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(234);
						match(GT);
						setState(235);
						expr(8);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(237);
						match(GTE);
						setState(238);
						expr(7);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(239);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(240);
						match(EQ);
						setState(241);
						expr(6);
						}
						break;
					case 11:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(242);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(243);
						match(NEQ);
						setState(244);
						expr(5);
						}
						break;
					case 12:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(245);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(246);
						match(AND);
						setState(247);
						expr(4);
						}
						break;
					case 13:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(248);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(249);
						match(OR);
						setState(250);
						expr(3);
						}
						break;
					case 14:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(252);
						match(LBRACKET);
						setState(253);
						expr(0);
						setState(254);
						match(RBRACKET);
						}
						break;
					}
					} 
				}
				setState(260);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
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
	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			expr(0);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(262);
				match(COMMA);
				setState(263);
				expr(0);
				}
				}
				setState(268);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ParamListContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CmmParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CmmParser.COMMA, i);
		}
		public ParamListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterParamList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitParamList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitParamList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamListContext paramList() throws RecognitionException {
		ParamListContext _localctx = new ParamListContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_paramList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			param();
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(270);
				match(COMMA);
				setState(271);
				param();
				}
				}
				setState(276);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ParamContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitParam(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitParam(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			type();
			setState(278);
			match(ID);
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
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(CmmParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(CmmParser.DOUBLE, 0); }
		public TerminalNode CHAR() { return getToken(CmmParser.CHAR, 0); }
		public TerminalNode VOID() { return getToken(CmmParser.VOID, 0); }
		public TerminalNode ID() { return getToken(CmmParser.ID, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CmmListener ) ((CmmListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CmmVisitor ) return ((CmmVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099511642240L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 18:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001+\u011b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"2\b\u0000\n\u0000\f\u00005\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001C\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002H\b\u0002\n\u0002\f\u0002K\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0004\u0003P\b\u0003\u000b\u0003"+
		"\f\u0003Q\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"X\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0004\u0006f\b\u0006\u000b\u0006\f\u0006g\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007s\b\u0007\n\u0007\f\u0007v\t\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0003\u0007{\b\u0007\u0001\b\u0001\b\u0005"+
		"\b\u007f\b\b\n\b\f\b\u0082\t\b\u0001\b\u0001\b\u0003\b\u0086\b\b\u0001"+
		"\t\u0001\t\u0003\t\u008a\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0096\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u009f\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00bb\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u00d3\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u0101\b\u0012"+
		"\n\u0012\f\u0012\u0104\t\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u0109\b\u0013\n\u0013\f\u0013\u010c\t\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0111\b\u0014\n\u0014\f\u0014\u0114\t\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0000"+
		"\u0001$\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0001\u0003\u0000\u0007\u0007\u000b"+
		"\r((\u0131\u00003\u0001\u0000\u0000\u0000\u0002B\u0001\u0000\u0000\u0000"+
		"\u0004D\u0001\u0000\u0000\u0000\u0006O\u0001\u0000\u0000\u0000\bS\u0001"+
		"\u0000\u0000\u0000\n\\\u0001\u0000\u0000\u0000\fb\u0001\u0000\u0000\u0000"+
		"\u000ez\u0001\u0000\u0000\u0000\u0010\u0085\u0001\u0000\u0000\u0000\u0012"+
		"\u0089\u0001\u0000\u0000\u0000\u0014\u0095\u0001\u0000\u0000\u0000\u0016"+
		"\u0097\u0001\u0000\u0000\u0000\u0018\u00a0\u0001\u0000\u0000\u0000\u001a"+
		"\u00a5\u0001\u0000\u0000\u0000\u001c\u00ab\u0001\u0000\u0000\u0000\u001e"+
		"\u00af\u0001\u0000\u0000\u0000 \u00b3\u0001\u0000\u0000\u0000\"\u00b7"+
		"\u0001\u0000\u0000\u0000$\u00d2\u0001\u0000\u0000\u0000&\u0105\u0001\u0000"+
		"\u0000\u0000(\u010d\u0001\u0000\u0000\u0000*\u0115\u0001\u0000\u0000\u0000"+
		",\u0118\u0001\u0000\u0000\u0000.2\u0003\u0002\u0001\u0000/2\u0003\b\u0004"+
		"\u000002\u0003\f\u0006\u00001.\u0001\u0000\u0000\u00001/\u0001\u0000\u0000"+
		"\u000010\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000046\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000067\u0003\n\u0005\u000078\u0005\u0000\u0000\u00018\u0001"+
		"\u0001\u0000\u0000\u00009:\u0003,\u0016\u0000:;\u0003\u0006\u0003\u0000"+
		";<\u0005(\u0000\u0000<=\u0005\u0017\u0000\u0000=C\u0001\u0000\u0000\u0000"+
		">?\u0003,\u0016\u0000?@\u0003\u0004\u0002\u0000@A\u0005\u0017\u0000\u0000"+
		"AC\u0001\u0000\u0000\u0000B9\u0001\u0000\u0000\u0000B>\u0001\u0000\u0000"+
		"\u0000C\u0003\u0001\u0000\u0000\u0000DI\u0005(\u0000\u0000EF\u0005\u0018"+
		"\u0000\u0000FH\u0005(\u0000\u0000GE\u0001\u0000\u0000\u0000HK\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000J\u0005"+
		"\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LM\u0005\u0015\u0000"+
		"\u0000MN\u0005+\u0000\u0000NP\u0005\u0016\u0000\u0000OL\u0001\u0000\u0000"+
		"\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000R\u0007\u0001\u0000\u0000\u0000ST\u0003,\u0016\u0000TU\u0005"+
		"(\u0000\u0000UW\u0005\u0013\u0000\u0000VX\u0003(\u0014\u0000WV\u0001\u0000"+
		"\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000\u0000YZ\u0005"+
		"\u0014\u0000\u0000Z[\u0003\u0010\b\u0000[\t\u0001\u0000\u0000\u0000\\"+
		"]\u0005\u0007\u0000\u0000]^\u0005\b\u0000\u0000^_\u0005\u0013\u0000\u0000"+
		"_`\u0005\u0014\u0000\u0000`a\u0003\u0010\b\u0000a\u000b\u0001\u0000\u0000"+
		"\u0000bc\u0005\n\u0000\u0000ce\u0005\u0011\u0000\u0000df\u0003\u000e\u0007"+
		"\u0000ed\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000ge\u0001\u0000"+
		"\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ij\u0005"+
		"\u0012\u0000\u0000jk\u0005(\u0000\u0000kl\u0005\u0017\u0000\u0000l\r\u0001"+
		"\u0000\u0000\u0000mn\u0003,\u0016\u0000nt\u0005(\u0000\u0000op\u0005\u0015"+
		"\u0000\u0000pq\u0005+\u0000\u0000qs\u0005\u0016\u0000\u0000ro\u0001\u0000"+
		"\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"wx\u0005\u0017\u0000\u0000x{\u0001\u0000\u0000\u0000y{\u0003\f\u0006\u0000"+
		"zm\u0001\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000{\u000f\u0001\u0000"+
		"\u0000\u0000|\u0080\u0005\u0011\u0000\u0000}\u007f\u0003\u0012\t\u0000"+
		"~}\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000\u0080~"+
		"\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u0083"+
		"\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0086"+
		"\u0005\u0012\u0000\u0000\u0084\u0086\u0003\u0014\n\u0000\u0085|\u0001"+
		"\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000\u0086\u0011\u0001"+
		"\u0000\u0000\u0000\u0087\u008a\u0003\u0002\u0001\u0000\u0088\u008a\u0003"+
		"\u0014\n\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u0089\u0088\u0001\u0000"+
		"\u0000\u0000\u008a\u0013\u0001\u0000\u0000\u0000\u008b\u0096\u0003\u0002"+
		"\u0001\u0000\u008c\u0096\u0003\u0018\f\u0000\u008d\u0096\u0003\u0016\u000b"+
		"\u0000\u008e\u0096\u0003\u001a\r\u0000\u008f\u0096\u0003\u001c\u000e\u0000"+
		"\u0090\u0096\u0003\u001e\u000f\u0000\u0091\u0096\u0003 \u0010\u0000\u0092"+
		"\u0093\u0003\"\u0011\u0000\u0093\u0094\u0005\u0017\u0000\u0000\u0094\u0096"+
		"\u0001\u0000\u0000\u0000\u0095\u008b\u0001\u0000\u0000\u0000\u0095\u008c"+
		"\u0001\u0000\u0000\u0000\u0095\u008d\u0001\u0000\u0000\u0000\u0095\u008e"+
		"\u0001\u0000\u0000\u0000\u0095\u008f\u0001\u0000\u0000\u0000\u0095\u0090"+
		"\u0001\u0000\u0000\u0000\u0095\u0091\u0001\u0000\u0000\u0000\u0095\u0092"+
		"\u0001\u0000\u0000\u0000\u0096\u0015\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005\u0004\u0000\u0000\u0098\u0099\u0005\u0013\u0000\u0000\u0099\u009a"+
		"\u0003$\u0012\u0000\u009a\u009b\u0005\u0014\u0000\u0000\u009b\u009e\u0003"+
		"\u0010\b\u0000\u009c\u009d\u0005\u0005\u0000\u0000\u009d\u009f\u0003\u0010"+
		"\b\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000"+
		"\u0000\u009f\u0017\u0001\u0000\u0000\u0000\u00a0\u00a1\u0003$\u0012\u0000"+
		"\u00a1\u00a2\u0005\u0010\u0000\u0000\u00a2\u00a3\u0003$\u0012\u0000\u00a3"+
		"\u00a4\u0005\u0017\u0000\u0000\u00a4\u0019\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0005\u0006\u0000\u0000\u00a6\u00a7\u0005\u0013\u0000\u0000\u00a7"+
		"\u00a8\u0003$\u0012\u0000\u00a8\u00a9\u0005\u0014\u0000\u0000\u00a9\u00aa"+
		"\u0003\u0010\b\u0000\u00aa\u001b\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005"+
		"\u000f\u0000\u0000\u00ac\u00ad\u0003$\u0012\u0000\u00ad\u00ae\u0005\u0017"+
		"\u0000\u0000\u00ae\u001d\u0001\u0000\u0000\u0000\u00af\u00b0\u0005\t\u0000"+
		"\u0000\u00b0\u00b1\u0003&\u0013\u0000\u00b1\u00b2\u0005\u0017\u0000\u0000"+
		"\u00b2\u001f\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u000e\u0000\u0000"+
		"\u00b4\u00b5\u0003&\u0013\u0000\u00b5\u00b6\u0005\u0017\u0000\u0000\u00b6"+
		"!\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005(\u0000\u0000\u00b8\u00ba\u0005"+
		"\u0013\u0000\u0000\u00b9\u00bb\u0003&\u0013\u0000\u00ba\u00b9\u0001\u0000"+
		"\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bc\u00bd\u0005\u0014\u0000\u0000\u00bd#\u0001\u0000\u0000"+
		"\u0000\u00be\u00bf\u0006\u0012\uffff\uffff\u0000\u00bf\u00d3\u0005+\u0000"+
		"\u0000\u00c0\u00d3\u0005*\u0000\u0000\u00c1\u00d3\u0005)\u0000\u0000\u00c2"+
		"\u00d3\u0005(\u0000\u0000\u00c3\u00d3\u0003\"\u0011\u0000\u00c4\u00c5"+
		"\u0005(\u0000\u0000\u00c5\u00c6\u0005\'\u0000\u0000\u00c6\u00d3\u0005"+
		"(\u0000\u0000\u00c7\u00c8\u0005\u0013\u0000\u0000\u00c8\u00c9\u0003$\u0012"+
		"\u0000\u00c9\u00ca\u0005\u0014\u0000\u0000\u00ca\u00d3\u0001\u0000\u0000"+
		"\u0000\u00cb\u00cc\u0005&\u0000\u0000\u00cc\u00d3\u0003$\u0012\u0010\u00cd"+
		"\u00ce\u0005\u0013\u0000\u0000\u00ce\u00cf\u0003,\u0016\u0000\u00cf\u00d0"+
		"\u0005\u0014\u0000\u0000\u00d0\u00d1\u0003$\u0012\u000f\u00d1\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d2\u00be\u0001\u0000\u0000\u0000\u00d2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00c1\u0001\u0000\u0000\u0000\u00d2\u00c2\u0001"+
		"\u0000\u0000\u0000\u00d2\u00c3\u0001\u0000\u0000\u0000\u00d2\u00c4\u0001"+
		"\u0000\u0000\u0000\u00d2\u00c7\u0001\u0000\u0000\u0000\u00d2\u00cb\u0001"+
		"\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000\u0000\u0000\u00d3\u0102\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d5\n\u000e\u0000\u0000\u00d5\u00d6\u0005\u001b"+
		"\u0000\u0000\u00d6\u0101\u0003$\u0012\u000f\u00d7\u00d8\n\r\u0000\u0000"+
		"\u00d8\u00d9\u0005\u001c\u0000\u0000\u00d9\u0101\u0003$\u0012\u000e\u00da"+
		"\u00db\n\f\u0000\u0000\u00db\u00dc\u0005\u001d\u0000\u0000\u00dc\u0101"+
		"\u0003$\u0012\r\u00dd\u00de\n\u000b\u0000\u0000\u00de\u00df\u0005\u0019"+
		"\u0000\u0000\u00df\u0101\u0003$\u0012\f\u00e0\u00e1\n\n\u0000\u0000\u00e1"+
		"\u00e2\u0005\u001a\u0000\u0000\u00e2\u0101\u0003$\u0012\u000b\u00e3\u00e4"+
		"\n\t\u0000\u0000\u00e4\u00e5\u0005 \u0000\u0000\u00e5\u0101\u0003$\u0012"+
		"\n\u00e6\u00e7\n\b\u0000\u0000\u00e7\u00e8\u0005!\u0000\u0000\u00e8\u0101"+
		"\u0003$\u0012\t\u00e9\u00ea\n\u0007\u0000\u0000\u00ea\u00eb\u0005\u001e"+
		"\u0000\u0000\u00eb\u0101\u0003$\u0012\b\u00ec\u00ed\n\u0006\u0000\u0000"+
		"\u00ed\u00ee\u0005\u001f\u0000\u0000\u00ee\u0101\u0003$\u0012\u0007\u00ef"+
		"\u00f0\n\u0005\u0000\u0000\u00f0\u00f1\u0005#\u0000\u0000\u00f1\u0101"+
		"\u0003$\u0012\u0006\u00f2\u00f3\n\u0004\u0000\u0000\u00f3\u00f4\u0005"+
		"\"\u0000\u0000\u00f4\u0101\u0003$\u0012\u0005\u00f5\u00f6\n\u0003\u0000"+
		"\u0000\u00f6\u00f7\u0005$\u0000\u0000\u00f7\u0101\u0003$\u0012\u0004\u00f8"+
		"\u00f9\n\u0002\u0000\u0000\u00f9\u00fa\u0005%\u0000\u0000\u00fa\u0101"+
		"\u0003$\u0012\u0003\u00fb\u00fc\n\u0001\u0000\u0000\u00fc\u00fd\u0005"+
		"\u0015\u0000\u0000\u00fd\u00fe\u0003$\u0012\u0000\u00fe\u00ff\u0005\u0016"+
		"\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00d4\u0001\u0000"+
		"\u0000\u0000\u0100\u00d7\u0001\u0000\u0000\u0000\u0100\u00da\u0001\u0000"+
		"\u0000\u0000\u0100\u00dd\u0001\u0000\u0000\u0000\u0100\u00e0\u0001\u0000"+
		"\u0000\u0000\u0100\u00e3\u0001\u0000\u0000\u0000\u0100\u00e6\u0001\u0000"+
		"\u0000\u0000\u0100\u00e9\u0001\u0000\u0000\u0000\u0100\u00ec\u0001\u0000"+
		"\u0000\u0000\u0100\u00ef\u0001\u0000\u0000\u0000\u0100\u00f2\u0001\u0000"+
		"\u0000\u0000\u0100\u00f5\u0001\u0000\u0000\u0000\u0100\u00f8\u0001\u0000"+
		"\u0000\u0000\u0100\u00fb\u0001\u0000\u0000\u0000\u0101\u0104\u0001\u0000"+
		"\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000"+
		"\u0000\u0000\u0103%\u0001\u0000\u0000\u0000\u0104\u0102\u0001\u0000\u0000"+
		"\u0000\u0105\u010a\u0003$\u0012\u0000\u0106\u0107\u0005\u0018\u0000\u0000"+
		"\u0107\u0109\u0003$\u0012\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109"+
		"\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0001\u0000\u0000\u0000\u010b\'\u0001\u0000\u0000\u0000\u010c\u010a"+
		"\u0001\u0000\u0000\u0000\u010d\u0112\u0003*\u0015\u0000\u010e\u010f\u0005"+
		"\u0018\u0000\u0000\u010f\u0111\u0003*\u0015\u0000\u0110\u010e\u0001\u0000"+
		"\u0000\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112\u0110\u0001\u0000"+
		"\u0000\u0000\u0112\u0113\u0001\u0000\u0000\u0000\u0113)\u0001\u0000\u0000"+
		"\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0115\u0116\u0003,\u0016\u0000"+
		"\u0116\u0117\u0005(\u0000\u0000\u0117+\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0007\u0000\u0000\u0000\u0119-\u0001\u0000\u0000\u0000\u001413BIQWgt"+
		"z\u0080\u0085\u0089\u0095\u009e\u00ba\u00d2\u0100\u0102\u010a\u0112";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}