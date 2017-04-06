// Generated from DataOperation.g4 by ANTLR 4.6

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DataOperationParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WhiteSpace=1, NewLine=2, Add=3, Substract=4, Slash=5, Colon=6, Dash=7, 
		Dot=8, Data=9, Time=10;
	public static final int
		RULE_data = 0, RULE_time = 1, RULE_dataTime = 2, RULE_expressionResultData = 3, 
		RULE_expressionResultTime = 4, RULE_expressionRoot = 5;
	public static final String[] ruleNames = {
		"data", "time", "dataTime", "expressionResultData", "expressionResultTime", 
		"expressionRoot"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'+'", null, "'/'", "':'", null, "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WhiteSpace", "NewLine", "Add", "Substract", "Slash", "Colon", "Dash", 
		"Dot", "Data", "Time"
	};
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
	public String getGrammarFileName() { return "DataOperation.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DataOperationParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DataContext extends ParserRuleContext {
		public TerminalNode Data() { return getToken(DataOperationParser.Data, 0); }
		public DataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataOperationListener ) ((DataOperationListener)listener).enterData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataOperationListener ) ((DataOperationListener)listener).exitData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataOperationVisitor ) return ((DataOperationVisitor<? extends T>)visitor).visitData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataContext data() throws RecognitionException {
		DataContext _localctx = new DataContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_data);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			match(Data);
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

	public static class TimeContext extends ParserRuleContext {
		public TerminalNode Time() { return getToken(DataOperationParser.Time, 0); }
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataOperationListener ) ((DataOperationListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataOperationListener ) ((DataOperationListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataOperationVisitor ) return ((DataOperationVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(Time);
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

	public static class DataTimeContext extends ParserRuleContext {
		public DataContext data() {
			return getRuleContext(DataContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public DataTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataOperationListener ) ((DataOperationListener)listener).enterDataTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataOperationListener ) ((DataOperationListener)listener).exitDataTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataOperationVisitor ) return ((DataOperationVisitor<? extends T>)visitor).visitDataTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTimeContext dataTime() throws RecognitionException {
		DataTimeContext _localctx = new DataTimeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_dataTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			data();
			setState(17);
			time();
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

	public static class ExpressionResultDataContext extends ParserRuleContext {
		public DataTimeContext dataTime() {
			return getRuleContext(DataTimeContext.class,0);
		}
		public TerminalNode Add() { return getToken(DataOperationParser.Add, 0); }
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TerminalNode Substract() { return getToken(DataOperationParser.Substract, 0); }
		public ExpressionResultDataContext expressionResultData() {
			return getRuleContext(ExpressionResultDataContext.class,0);
		}
		public ExpressionResultTimeContext expressionResultTime() {
			return getRuleContext(ExpressionResultTimeContext.class,0);
		}
		public ExpressionResultDataContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionResultData; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataOperationListener ) ((DataOperationListener)listener).enterExpressionResultData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataOperationListener ) ((DataOperationListener)listener).exitExpressionResultData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataOperationVisitor ) return ((DataOperationVisitor<? extends T>)visitor).visitExpressionResultData(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionResultDataContext expressionResultData() throws RecognitionException {
		return expressionResultData(0);
	}

	private ExpressionResultDataContext expressionResultData(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionResultDataContext _localctx = new ExpressionResultDataContext(_ctx, _parentState);
		ExpressionResultDataContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expressionResultData, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(20);
				dataTime();
				setState(21);
				match(Add);
				setState(22);
				time();
				}
				break;
			case 2:
				{
				setState(24);
				time();
				setState(25);
				match(Add);
				setState(26);
				dataTime();
				}
				break;
			case 3:
				{
				setState(28);
				dataTime();
				setState(29);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Substract) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(30);
				time();
				}
				break;
			case 4:
				{
				setState(32);
				time();
				setState(33);
				match(Add);
				setState(34);
				expressionResultData(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(44);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionResultDataContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionResultData);
						setState(38);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(39);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Substract) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(40);
						expressionResultTime(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionResultDataContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionResultData);
						setState(41);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(42);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Substract) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(43);
						time();
						}
						break;
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
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

	public static class ExpressionResultTimeContext extends ParserRuleContext {
		public List<DataTimeContext> dataTime() {
			return getRuleContexts(DataTimeContext.class);
		}
		public DataTimeContext dataTime(int i) {
			return getRuleContext(DataTimeContext.class,i);
		}
		public TerminalNode Substract() { return getToken(DataOperationParser.Substract, 0); }
		public List<TimeContext> time() {
			return getRuleContexts(TimeContext.class);
		}
		public TimeContext time(int i) {
			return getRuleContext(TimeContext.class,i);
		}
		public TerminalNode Add() { return getToken(DataOperationParser.Add, 0); }
		public List<ExpressionResultDataContext> expressionResultData() {
			return getRuleContexts(ExpressionResultDataContext.class);
		}
		public ExpressionResultDataContext expressionResultData(int i) {
			return getRuleContext(ExpressionResultDataContext.class,i);
		}
		public List<ExpressionResultTimeContext> expressionResultTime() {
			return getRuleContexts(ExpressionResultTimeContext.class);
		}
		public ExpressionResultTimeContext expressionResultTime(int i) {
			return getRuleContext(ExpressionResultTimeContext.class,i);
		}
		public ExpressionResultTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionResultTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataOperationListener ) ((DataOperationListener)listener).enterExpressionResultTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataOperationListener ) ((DataOperationListener)listener).exitExpressionResultTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataOperationVisitor ) return ((DataOperationVisitor<? extends T>)visitor).visitExpressionResultTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionResultTimeContext expressionResultTime() throws RecognitionException {
		return expressionResultTime(0);
	}

	private ExpressionResultTimeContext expressionResultTime(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionResultTimeContext _localctx = new ExpressionResultTimeContext(_ctx, _parentState);
		ExpressionResultTimeContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expressionResultTime, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(50);
				dataTime();
				setState(51);
				match(Substract);
				setState(52);
				dataTime();
				}
				break;
			case 2:
				{
				setState(54);
				time();
				setState(55);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Substract) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(56);
				time();
				}
				break;
			case 3:
				{
				setState(58);
				expressionResultData(0);
				setState(59);
				match(Substract);
				setState(60);
				expressionResultData(0);
				}
				break;
			case 4:
				{
				setState(62);
				expressionResultData(0);
				setState(63);
				match(Substract);
				setState(64);
				dataTime();
				}
				break;
			case 5:
				{
				setState(66);
				dataTime();
				setState(67);
				match(Substract);
				setState(68);
				expressionResultData(0);
				}
				break;
			case 6:
				{
				setState(70);
				time();
				setState(71);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Substract) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(72);
				expressionResultTime(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(82);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionResultTimeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionResultTime);
						setState(76);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(77);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Substract) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(78);
						expressionResultTime(7);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionResultTimeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionResultTime);
						setState(79);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(80);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Substract) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(81);
						time();
						}
						break;
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class ExpressionRootContext extends ParserRuleContext {
		public ExpressionResultDataContext expressionResultData() {
			return getRuleContext(ExpressionResultDataContext.class,0);
		}
		public ExpressionResultTimeContext expressionResultTime() {
			return getRuleContext(ExpressionResultTimeContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public DataTimeContext dataTime() {
			return getRuleContext(DataTimeContext.class,0);
		}
		public ExpressionRootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionRoot; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataOperationListener ) ((DataOperationListener)listener).enterExpressionRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataOperationListener ) ((DataOperationListener)listener).exitExpressionRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataOperationVisitor ) return ((DataOperationVisitor<? extends T>)visitor).visitExpressionRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionRootContext expressionRoot() throws RecognitionException {
		ExpressionRootContext _localctx = new ExpressionRootContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expressionRoot);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87);
				expressionResultData(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				expressionResultTime(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(89);
				time();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(90);
				dataTime();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expressionResultData_sempred((ExpressionResultDataContext)_localctx, predIndex);
		case 4:
			return expressionResultTime_sempred((ExpressionResultTimeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionResultData_sempred(ExpressionResultDataContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expressionResultTime_sempred(ExpressionResultTimeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\f`\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\'\n\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\7\5/\n\5\f\5\16\5\62\13\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6M\n\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6U\n\6\f\6\16\6X\13\6\3"+
		"\7\3\7\3\7\3\7\5\7^\n\7\3\7\2\4\b\n\b\2\4\6\b\n\f\2\3\3\2\5\6h\2\16\3"+
		"\2\2\2\4\20\3\2\2\2\6\22\3\2\2\2\b&\3\2\2\2\nL\3\2\2\2\f]\3\2\2\2\16\17"+
		"\7\13\2\2\17\3\3\2\2\2\20\21\7\f\2\2\21\5\3\2\2\2\22\23\5\2\2\2\23\24"+
		"\5\4\3\2\24\7\3\2\2\2\25\26\b\5\1\2\26\27\5\6\4\2\27\30\7\5\2\2\30\31"+
		"\5\4\3\2\31\'\3\2\2\2\32\33\5\4\3\2\33\34\7\5\2\2\34\35\5\6\4\2\35\'\3"+
		"\2\2\2\36\37\5\6\4\2\37 \t\2\2\2 !\5\4\3\2!\'\3\2\2\2\"#\5\4\3\2#$\7\5"+
		"\2\2$%\5\b\5\3%\'\3\2\2\2&\25\3\2\2\2&\32\3\2\2\2&\36\3\2\2\2&\"\3\2\2"+
		"\2\'\60\3\2\2\2()\f\5\2\2)*\t\2\2\2*/\5\n\6\2+,\f\4\2\2,-\t\2\2\2-/\5"+
		"\4\3\2.(\3\2\2\2.+\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\t"+
		"\3\2\2\2\62\60\3\2\2\2\63\64\b\6\1\2\64\65\5\6\4\2\65\66\7\6\2\2\66\67"+
		"\5\6\4\2\67M\3\2\2\289\5\4\3\29:\t\2\2\2:;\5\4\3\2;M\3\2\2\2<=\5\b\5\2"+
		"=>\7\6\2\2>?\5\b\5\2?M\3\2\2\2@A\5\b\5\2AB\7\6\2\2BC\5\6\4\2CM\3\2\2\2"+
		"DE\5\6\4\2EF\7\6\2\2FG\5\b\5\2GM\3\2\2\2HI\5\4\3\2IJ\t\2\2\2JK\5\n\6\3"+
		"KM\3\2\2\2L\63\3\2\2\2L8\3\2\2\2L<\3\2\2\2L@\3\2\2\2LD\3\2\2\2LH\3\2\2"+
		"\2MV\3\2\2\2NO\f\b\2\2OP\t\2\2\2PU\5\n\6\tQR\f\6\2\2RS\t\2\2\2SU\5\4\3"+
		"\2TN\3\2\2\2TQ\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\13\3\2\2\2XV\3\2"+
		"\2\2Y^\5\b\5\2Z^\5\n\6\2[^\5\4\3\2\\^\5\6\4\2]Y\3\2\2\2]Z\3\2\2\2][\3"+
		"\2\2\2]\\\3\2\2\2^\r\3\2\2\2\t&.\60LTV]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}