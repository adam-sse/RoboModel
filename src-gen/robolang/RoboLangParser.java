// Generated from RoboLang.g4 by ANTLR 4.4
package robolang;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class RoboLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__54=1, T__53=2, T__52=3, T__51=4, T__50=5, T__49=6, T__48=7, T__47=8, 
		T__46=9, T__45=10, T__44=11, T__43=12, T__42=13, T__41=14, T__40=15, T__39=16, 
		T__38=17, T__37=18, T__36=19, T__35=20, T__34=21, T__33=22, T__32=23, 
		T__31=24, T__30=25, T__29=26, T__28=27, T__27=28, T__26=29, T__25=30, 
		T__24=31, T__23=32, T__22=33, T__21=34, T__20=35, T__19=36, T__18=37, 
		T__17=38, T__16=39, T__15=40, T__14=41, T__13=42, T__12=43, T__11=44, 
		T__10=45, T__9=46, T__8=47, T__7=48, T__6=49, T__5=50, T__4=51, T__3=52, 
		T__2=53, T__1=54, T__0=55, NUMBER=56, ID=57, WHITESPACE=58;
	public static final String[] tokenNames = {
		"<INVALID>", "'name'", "'set'", "'!='", "'while'", "'{'", "'&&'", "'S3'", 
		"'Left'", "'='", "'S4'", "'A'", "'Right'", "'('", "'RedMode'", "'right'", 
		"'false'", "'ColorSensor'", "'mode'", "'>='", "'backward'", "'S2'", "'<'", 
		"'type'", "'D'", "'+'", "'/'", "'true'", "'AmbientMode'", "'||'", "';'", 
		"'Medium'", "'}'", "'if'", "'S1'", "'<='", "'C'", "'setup'", "'ColorIdMode'", 
		"'*'", "'Large'", "'left'", "'Sensor'", "'port'", "':'", "'=='", "'forward'", 
		"'>'", "'until'", "'!'", "'speed'", "'B'", "'program'", "')'", "'reverse'", 
		"'-'", "NUMBER", "ID", "WHITESPACE"
	};
	public static final int
		RULE_robot = 0, RULE_setup = 1, RULE_motor = 2, RULE_sensor = 3, RULE_program = 4, 
		RULE_command = 5, RULE_drive = 6, RULE_turn = 7, RULE_branch = 8, RULE_assignment = 9, 
		RULE_expr = 10, RULE_condition = 11;
	public static final String[] ruleNames = {
		"robot", "setup", "motor", "sensor", "program", "command", "drive", "turn", 
		"branch", "assignment", "expr", "condition"
	};

	@Override
	public String getGrammarFileName() { return "RoboLang.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RoboLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class RobotContext extends ParserRuleContext {
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public SetupContext setup() {
			return getRuleContext(SetupContext.class,0);
		}
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public RobotContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_robot; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitRobot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RobotContext robot() throws RecognitionException {
		RobotContext _localctx = new RobotContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_robot);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24); setup();
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25); program();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 );
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

	public static class SetupContext extends ParserRuleContext {
		public MotorContext right;
		public MotorContext left;
		public MotorContext motor(int i) {
			return getRuleContext(MotorContext.class,i);
		}
		public List<SensorContext> sensor() {
			return getRuleContexts(SensorContext.class);
		}
		public List<MotorContext> motor() {
			return getRuleContexts(MotorContext.class);
		}
		public SensorContext sensor(int i) {
			return getRuleContext(SensorContext.class,i);
		}
		public SetupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setup; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitSetup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetupContext setup() throws RecognitionException {
		SetupContext _localctx = new SetupContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_setup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); match(T__18);
			setState(31); match(T__50);
			setState(32); match(T__43);
			setState(33); match(T__11);
			setState(34); ((SetupContext)_localctx).right = motor();
			setState(35); match(T__47);
			setState(36); match(T__11);
			setState(37); ((SetupContext)_localctx).left = motor();
			setState(41);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(38); sensor();
				}
				}
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(44); match(T__23);
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

	public static class MotorContext extends ParserRuleContext {
		public Token port;
		public Token type;
		public Token speed;
		public Token reverse;
		public TerminalNode NUMBER() { return getToken(RoboLangParser.NUMBER, 0); }
		public MotorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_motor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitMotor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MotorContext motor() throws RecognitionException {
		MotorContext _localctx = new MotorContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_motor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); match(T__50);
			setState(47); match(T__12);
			setState(48); match(T__11);
			setState(49);
			((MotorContext)_localctx).port = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__31) | (1L << T__19) | (1L << T__4))) != 0)) ) {
				((MotorContext)_localctx).port = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(50); match(T__32);
			setState(51); match(T__11);
			setState(52);
			((MotorContext)_localctx).type = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__15) ) {
				((MotorContext)_localctx).type = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(53); match(T__5);
			setState(54); match(T__11);
			setState(55); ((MotorContext)_localctx).speed = match(NUMBER);
			setState(59);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(56); match(T__1);
				setState(57); match(T__11);
				setState(58);
				((MotorContext)_localctx).reverse = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__39 || _la==T__28) ) {
					((MotorContext)_localctx).reverse = (Token)_errHandler.recoverInline(this);
				}
				consume();
				}
			}

			setState(61); match(T__23);
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

	public static class SensorContext extends ParserRuleContext {
		public Token port;
		public Token type;
		public Token modus;
		public Token name;
		public TerminalNode ID() { return getToken(RoboLangParser.ID, 0); }
		public SensorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sensor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitSensor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SensorContext sensor() throws RecognitionException {
		SensorContext _localctx = new SensorContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sensor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63); match(T__13);
			setState(64); match(T__11);
			setState(65); match(T__50);
			setState(66); match(T__12);
			setState(67); match(T__11);
			setState(68);
			((SensorContext)_localctx).port = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__48) | (1L << T__45) | (1L << T__34) | (1L << T__21))) != 0)) ) {
				((SensorContext)_localctx).port = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(69); match(T__32);
			setState(70); match(T__11);
			setState(71); ((SensorContext)_localctx).type = match(T__38);
			setState(72); match(T__37);
			setState(73); match(T__11);
			setState(74);
			((SensorContext)_localctx).modus = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__27) | (1L << T__17))) != 0)) ) {
				((SensorContext)_localctx).modus = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(75); match(T__54);
			setState(76); match(T__11);
			setState(77); ((SensorContext)_localctx).name = match(ID);
			setState(78); match(T__23);
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

	public static class ProgramContext extends ParserRuleContext {
		public Token name;
		public TerminalNode ID() { return getToken(RoboLangParser.ID, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80); match(T__3);
			setState(81); ((ProgramContext)_localctx).name = match(ID);
			setState(82); match(T__50);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__53) | (1L << T__51) | (1L << T__40) | (1L << T__35) | (1L << T__22) | (1L << T__14) | (1L << T__9))) != 0)) {
				{
				{
				setState(83); command();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(89); match(T__23);
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

	public static class CommandContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TurnContext turn() {
			return getRuleContext(TurnContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public DriveContext drive() {
			return getRuleContext(DriveContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_command);
		try {
			setState(95);
			switch (_input.LA(1)) {
			case T__35:
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(91); drive();
				}
				break;
			case T__40:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(92); turn();
				}
				break;
			case T__51:
			case T__22:
				enterOuterAlt(_localctx, 3);
				{
				setState(93); branch();
				}
				break;
			case T__53:
				enterOuterAlt(_localctx, 4);
				{
				setState(94); assignment();
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

	public static class DriveContext extends ParserRuleContext {
		public Token direction;
		public ExprContext distance;
		public ConditionContext until;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public DriveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drive; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitDrive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DriveContext drive() throws RecognitionException {
		DriveContext _localctx = new DriveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_drive);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			((DriveContext)_localctx).direction = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__9) ) {
				((DriveContext)_localctx).direction = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(101);
			switch (_input.LA(1)) {
			case T__42:
			case T__0:
			case NUMBER:
			case ID:
				{
				{
				setState(98); ((DriveContext)_localctx).distance = expr(0);
				}
				}
				break;
			case T__7:
				{
				{
				setState(99); match(T__7);
				setState(100); ((DriveContext)_localctx).until = condition(0);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(103); match(T__25);
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

	public static class TurnContext extends ParserRuleContext {
		public Token direction;
		public ExprContext amount;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TurnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitTurn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TurnContext turn() throws RecognitionException {
		TurnContext _localctx = new TurnContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_turn);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			((TurnContext)_localctx).direction = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__40 || _la==T__14) ) {
				((TurnContext)_localctx).direction = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(106); ((TurnContext)_localctx).amount = expr(0);
			setState(107); match(T__25);
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

	public static class BranchContext extends ParserRuleContext {
		public Token kind;
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitBranch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_branch);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((BranchContext)_localctx).kind = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==T__51 || _la==T__22) ) {
				((BranchContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(110); match(T__42);
			setState(111); condition(0);
			setState(112); match(T__2);
			setState(113); match(T__50);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__53) | (1L << T__51) | (1L << T__40) | (1L << T__35) | (1L << T__22) | (1L << T__14) | (1L << T__9))) != 0)) {
				{
				{
				setState(114); command();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120); match(T__23);
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

	public static class AssignmentContext extends ParserRuleContext {
		public Token variable;
		public ExprContext value;
		public TerminalNode ID() { return getToken(RoboLangParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122); match(T__53);
			setState(123); ((AssignmentContext)_localctx).variable = match(ID);
			setState(124); match(T__46);
			setState(125); ((AssignmentContext)_localctx).value = expr(0);
			setState(126); match(T__25);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public ExprContext bracketed;
		public Token value;
		public Token variable;
		public TerminalNode ID() { return getToken(RoboLangParser.ID, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode NUMBER() { return getToken(RoboLangParser.NUMBER, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitExpr(this);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(129); ((ExprContext)_localctx).op = match(T__0);
				setState(130); ((ExprContext)_localctx).right = expr(3);
				}
				break;
			case T__42:
				{
				setState(131); match(T__42);
				setState(132); ((ExprContext)_localctx).bracketed = expr(0);
				setState(133); match(T__2);
				}
				break;
			case NUMBER:
				{
				setState(135); ((ExprContext)_localctx).value = match(NUMBER);
				}
				break;
			case ID:
				{
				setState(136); ((ExprContext)_localctx).variable = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExprContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(139);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(140);
					((ExprContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__29) | (1L << T__16) | (1L << T__0))) != 0)) ) {
						((ExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(141); ((ExprContext)_localctx).right = expr(5);
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext left;
		public Token op;
		public ConditionContext right;
		public ConditionContext bracketed;
		public ExprContext lExpr;
		public Token comparison;
		public ExprContext rExpr;
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RoboLangVisitor ) return ((RoboLangVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_condition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(148); ((ConditionContext)_localctx).op = match(T__6);
				setState(149); ((ConditionContext)_localctx).right = condition(2);
				}
				break;
			case 2:
				{
				setState(150); match(T__42);
				setState(151); ((ConditionContext)_localctx).bracketed = condition(0);
				setState(152); match(T__2);
				}
				break;
			case 3:
				{
				setState(154); ((ConditionContext)_localctx).lExpr = expr(0);
				setState(155);
				((ConditionContext)_localctx).comparison = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__52) | (1L << T__36) | (1L << T__33) | (1L << T__20) | (1L << T__10) | (1L << T__8))) != 0)) ) {
					((ConditionContext)_localctx).comparison = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(156); ((ConditionContext)_localctx).rExpr = expr(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(_parentctx, _parentState);
					_localctx.left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_condition);
					setState(160);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(161);
					((ConditionContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__49 || _la==T__26) ) {
						((ConditionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					consume();
					setState(162); ((ConditionContext)_localctx).right = condition(4);
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 10: return expr_sempred((ExprContext)_localctx, predIndex);
		case 11: return condition_sempred((ConditionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condition_sempred(ConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1: return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3<\u00ab\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3*\n\3\f\3\16\3-\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4>\n\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6W\n"+
		"\6\f\6\16\6Z\13\6\3\6\3\6\3\7\3\7\3\7\3\7\5\7b\n\7\3\b\3\b\3\b\3\b\5\b"+
		"h\n\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\nv\n\n\f\n\16"+
		"\ny\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\5\f\u008c\n\f\3\f\3\f\3\f\7\f\u0091\n\f\f\f\16\f\u0094\13"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00a1\n\r\3\r\3\r\3"+
		"\r\7\r\u00a6\n\r\f\r\16\r\u00a9\13\r\3\r\2\4\26\30\16\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\2\r\6\2\r\r\32\32&&\65\65\4\2!!**\4\2\22\22\35\35\6\2\t\t"+
		"\f\f\27\27$$\5\2\20\20\36\36((\4\2\26\26\60\60\4\2\21\21++\4\2\6\6##\5"+
		"\2\33\34))99\b\2\5\5\25\25\30\30%%//\61\61\4\2\b\b\37\37\u00ae\2\32\3"+
		"\2\2\2\4 \3\2\2\2\6\60\3\2\2\2\bA\3\2\2\2\nR\3\2\2\2\fa\3\2\2\2\16c\3"+
		"\2\2\2\20k\3\2\2\2\22o\3\2\2\2\24|\3\2\2\2\26\u008b\3\2\2\2\30\u00a0\3"+
		"\2\2\2\32\34\5\4\3\2\33\35\5\n\6\2\34\33\3\2\2\2\35\36\3\2\2\2\36\34\3"+
		"\2\2\2\36\37\3\2\2\2\37\3\3\2\2\2 !\7\'\2\2!\"\7\7\2\2\"#\7\16\2\2#$\7"+
		".\2\2$%\5\6\4\2%&\7\n\2\2&\'\7.\2\2\'+\5\6\4\2(*\5\b\5\2)(\3\2\2\2*-\3"+
		"\2\2\2+)\3\2\2\2+,\3\2\2\2,.\3\2\2\2-+\3\2\2\2./\7\"\2\2/\5\3\2\2\2\60"+
		"\61\7\7\2\2\61\62\7-\2\2\62\63\7.\2\2\63\64\t\2\2\2\64\65\7\31\2\2\65"+
		"\66\7.\2\2\66\67\t\3\2\2\678\7\64\2\289\7.\2\29=\7:\2\2:;\78\2\2;<\7."+
		"\2\2<>\t\4\2\2=:\3\2\2\2=>\3\2\2\2>?\3\2\2\2?@\7\"\2\2@\7\3\2\2\2AB\7"+
		",\2\2BC\7.\2\2CD\7\7\2\2DE\7-\2\2EF\7.\2\2FG\t\5\2\2GH\7\31\2\2HI\7.\2"+
		"\2IJ\7\23\2\2JK\7\24\2\2KL\7.\2\2LM\t\6\2\2MN\7\3\2\2NO\7.\2\2OP\7;\2"+
		"\2PQ\7\"\2\2Q\t\3\2\2\2RS\7\66\2\2ST\7;\2\2TX\7\7\2\2UW\5\f\7\2VU\3\2"+
		"\2\2WZ\3\2\2\2XV\3\2\2\2XY\3\2\2\2Y[\3\2\2\2ZX\3\2\2\2[\\\7\"\2\2\\\13"+
		"\3\2\2\2]b\5\16\b\2^b\5\20\t\2_b\5\22\n\2`b\5\24\13\2a]\3\2\2\2a^\3\2"+
		"\2\2a_\3\2\2\2a`\3\2\2\2b\r\3\2\2\2cg\t\7\2\2dh\5\26\f\2ef\7\62\2\2fh"+
		"\5\30\r\2gd\3\2\2\2ge\3\2\2\2hi\3\2\2\2ij\7 \2\2j\17\3\2\2\2kl\t\b\2\2"+
		"lm\5\26\f\2mn\7 \2\2n\21\3\2\2\2op\t\t\2\2pq\7\17\2\2qr\5\30\r\2rs\7\67"+
		"\2\2sw\7\7\2\2tv\5\f\7\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2"+
		"\2\2yw\3\2\2\2z{\7\"\2\2{\23\3\2\2\2|}\7\4\2\2}~\7;\2\2~\177\7\13\2\2"+
		"\177\u0080\5\26\f\2\u0080\u0081\7 \2\2\u0081\25\3\2\2\2\u0082\u0083\b"+
		"\f\1\2\u0083\u0084\79\2\2\u0084\u008c\5\26\f\5\u0085\u0086\7\17\2\2\u0086"+
		"\u0087\5\26\f\2\u0087\u0088\7\67\2\2\u0088\u008c\3\2\2\2\u0089\u008c\7"+
		":\2\2\u008a\u008c\7;\2\2\u008b\u0082\3\2\2\2\u008b\u0085\3\2\2\2\u008b"+
		"\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u0092\3\2\2\2\u008d\u008e\f\6"+
		"\2\2\u008e\u008f\t\n\2\2\u008f\u0091\5\26\f\7\u0090\u008d\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\27\3\2\2"+
		"\2\u0094\u0092\3\2\2\2\u0095\u0096\b\r\1\2\u0096\u0097\7\63\2\2\u0097"+
		"\u00a1\5\30\r\4\u0098\u0099\7\17\2\2\u0099\u009a\5\30\r\2\u009a\u009b"+
		"\7\67\2\2\u009b\u00a1\3\2\2\2\u009c\u009d\5\26\f\2\u009d\u009e\t\13\2"+
		"\2\u009e\u009f\5\26\f\2\u009f\u00a1\3\2\2\2\u00a0\u0095\3\2\2\2\u00a0"+
		"\u0098\3\2\2\2\u00a0\u009c\3\2\2\2\u00a1\u00a7\3\2\2\2\u00a2\u00a3\f\5"+
		"\2\2\u00a3\u00a4\t\f\2\2\u00a4\u00a6\5\30\r\6\u00a5\u00a2\3\2\2\2\u00a6"+
		"\u00a9\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\31\3\2\2"+
		"\2\u00a9\u00a7\3\2\2\2\r\36+=Xagw\u008b\u0092\u00a0\u00a7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}