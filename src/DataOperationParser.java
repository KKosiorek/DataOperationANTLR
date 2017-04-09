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
		T__0=1, WhiteSpace=2, NewLine=3, Add=4, Substract=5, Slash=6, Colon=7, 
		Dash=8, Dot=9, Data=10, Time=11, Timespan=12;
	public static final int
		RULE_timeSpan = 0, RULE_dataTime = 1, RULE_expressionResultData = 2, RULE_expressionResultDataRightERT = 3, 
		RULE_expressionResultTime = 4, RULE_expressionRoot = 5;
	public static final String[] ruleNames = {
		"timeSpan", "dataTime", "expressionResultData", "expressionResultDataRightERT", 
		"expressionResultTime", "expressionRoot"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'|'", null, null, "'+'", null, "'/'", "':'", null, "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "WhiteSpace", "NewLine", "Add", "Substract", "Slash", "Colon", 
		"Dash", "Dot", "Data", "Time", "Timespan"
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
	public static class TimeSpanContext extends ParserRuleContext {
		public TerminalNode Time() { return getToken(DataOperationParser.Time, 0); }
		public TerminalNode Timespan() { return getToken(DataOperationParser.Timespan, 0); }
		public TimeSpanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeSpan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataOperationListener ) ((DataOperationListener)listener).enterTimeSpan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataOperationListener ) ((DataOperationListener)listener).exitTimeSpan(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataOperationVisitor ) return ((DataOperationVisitor<? extends T>)visitor).visitTimeSpan(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeSpanContext timeSpan() throws RecognitionException {
		TimeSpanContext _localctx = new TimeSpanContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_timeSpan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			_la = _input.LA(1);
			if ( !(_la==Time || _la==Timespan) ) {
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

	public static class DataTimeContext extends ParserRuleContext {
		public TerminalNode Data() { return getToken(DataOperationParser.Data, 0); }
		public TerminalNode Time() { return getToken(DataOperationParser.Time, 0); }
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
		enterRule(_localctx, 2, RULE_dataTime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			match(Data);
			{
			setState(15);
			match(T__0);
			}
			setState(16);
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

	public static class ExpressionResultDataContext extends ParserRuleContext {
		public Token op;
		public TimeSpanContext timeSpan() {
			return getRuleContext(TimeSpanContext.class,0);
		}
		public DataTimeContext dataTime() {
			return getRuleContext(DataTimeContext.class,0);
		}
		public TerminalNode Add() { return getToken(DataOperationParser.Add, 0); }
		public ExpressionResultDataContext expressionResultData() {
			return getRuleContext(ExpressionResultDataContext.class,0);
		}
		public TerminalNode Substract() { return getToken(DataOperationParser.Substract, 0); }
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expressionResultData, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(19);
				timeSpan();
				setState(20);
				((ExpressionResultDataContext)_localctx).op = match(Add);
				setState(21);
				dataTime();
				}
				break;
			case 2:
				{
				setState(23);
				timeSpan();
				setState(24);
				((ExpressionResultDataContext)_localctx).op = match(Add);
				setState(25);
				expressionResultData(5);
				}
				break;
			case 3:
				{
				setState(27);
				dataTime();
				setState(28);
				((ExpressionResultDataContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Substract) ) {
					((ExpressionResultDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(29);
				timeSpan();
				}
				break;
			case 4:
				{
				setState(31);
				dataTime();
				setState(32);
				((ExpressionResultDataContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Substract) ) {
					((ExpressionResultDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(33);
				expressionResultTime(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(45);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(43);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionResultDataContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionResultData);
						setState(37);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(38);
						((ExpressionResultDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Substract) ) {
							((ExpressionResultDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(39);
						timeSpan();
						}
						break;
					case 2:
						{
						_localctx = new ExpressionResultDataContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionResultData);
						setState(40);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(41);
						((ExpressionResultDataContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Substract) ) {
							((ExpressionResultDataContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(42);
						expressionResultTime(0);
						}
						break;
					}
					} 
				}
				setState(47);
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

	public static class ExpressionResultDataRightERTContext extends ParserRuleContext {
		public Token op;
		public ExpressionResultTimeContext expressionResultTime() {
			return getRuleContext(ExpressionResultTimeContext.class,0);
		}
		public DataTimeContext dataTime() {
			return getRuleContext(DataTimeContext.class,0);
		}
		public TerminalNode Add() { return getToken(DataOperationParser.Add, 0); }
		public ExpressionResultDataContext expressionResultData() {
			return getRuleContext(ExpressionResultDataContext.class,0);
		}
		public ExpressionResultDataRightERTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionResultDataRightERT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DataOperationListener ) ((DataOperationListener)listener).enterExpressionResultDataRightERT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DataOperationListener ) ((DataOperationListener)listener).exitExpressionResultDataRightERT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DataOperationVisitor ) return ((DataOperationVisitor<? extends T>)visitor).visitExpressionResultDataRightERT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionResultDataRightERTContext expressionResultDataRightERT() throws RecognitionException {
		ExpressionResultDataRightERTContext _localctx = new ExpressionResultDataRightERTContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expressionResultDataRightERT);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				expressionResultTime(0);
				setState(49);
				((ExpressionResultDataRightERTContext)_localctx).op = match(Add);
				setState(50);
				dataTime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(52);
				expressionResultTime(0);
				setState(53);
				((ExpressionResultDataRightERTContext)_localctx).op = match(Add);
				setState(54);
				expressionResultData(0);
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

	public static class ExpressionResultTimeContext extends ParserRuleContext {
		public Token op;
		public List<DataTimeContext> dataTime() {
			return getRuleContexts(DataTimeContext.class);
		}
		public DataTimeContext dataTime(int i) {
			return getRuleContext(DataTimeContext.class,i);
		}
		public List<TerminalNode> Substract() { return getTokens(DataOperationParser.Substract); }
		public TerminalNode Substract(int i) {
			return getToken(DataOperationParser.Substract, i);
		}
		public List<ExpressionResultDataContext> expressionResultData() {
			return getRuleContexts(ExpressionResultDataContext.class);
		}
		public ExpressionResultDataContext expressionResultData(int i) {
			return getRuleContext(ExpressionResultDataContext.class,i);
		}
		public List<TimeSpanContext> timeSpan() {
			return getRuleContexts(TimeSpanContext.class);
		}
		public TimeSpanContext timeSpan(int i) {
			return getRuleContext(TimeSpanContext.class,i);
		}
		public List<TerminalNode> Add() { return getTokens(DataOperationParser.Add); }
		public TerminalNode Add(int i) {
			return getToken(DataOperationParser.Add, i);
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
			setState(86);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(59);
				dataTime();
				setState(60);
				((ExpressionResultTimeContext)_localctx).op = match(Substract);
				setState(61);
				dataTime();
				}
				break;
			case 2:
				{
				setState(63);
				dataTime();
				setState(64);
				((ExpressionResultTimeContext)_localctx).op = match(Substract);
				setState(65);
				expressionResultData(0);
				}
				break;
			case 3:
				{
				setState(67);
				expressionResultData(0);
				setState(68);
				((ExpressionResultTimeContext)_localctx).op = match(Substract);
				setState(69);
				dataTime();
				}
				break;
			case 4:
				{
				setState(71);
				expressionResultData(0);
				setState(72);
				((ExpressionResultTimeContext)_localctx).op = match(Substract);
				setState(73);
				expressionResultData(0);
				}
				break;
			case 5:
				{
				setState(75);
				timeSpan();
				setState(76);
				((ExpressionResultTimeContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Substract) ) {
					((ExpressionResultTimeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(77);
				timeSpan();
				}
				break;
			case 6:
				{
				setState(79);
				timeSpan();
				setState(80);
				((ExpressionResultTimeContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Substract) ) {
					((ExpressionResultTimeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(81);
				expressionResultTime(0);
				setState(82);
				expressionResultTime(0);
				setState(83);
				((ExpressionResultTimeContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Substract) ) {
					((ExpressionResultTimeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(84);
				expressionResultTime(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpressionResultTimeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expressionResultTime);
					setState(88);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(89);
					((ExpressionResultTimeContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==Add || _la==Substract) ) {
						((ExpressionResultTimeContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(90);
					timeSpan();
					}
					} 
				}
				setState(95);
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
		public ExpressionResultDataRightERTContext expressionResultDataRightERT() {
			return getRuleContext(ExpressionResultDataRightERTContext.class,0);
		}
		public ExpressionResultTimeContext expressionResultTime() {
			return getRuleContext(ExpressionResultTimeContext.class,0);
		}
		public DataTimeContext dataTime() {
			return getRuleContext(DataTimeContext.class,0);
		}
		public TimeSpanContext timeSpan() {
			return getRuleContext(TimeSpanContext.class,0);
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
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				expressionResultData(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				expressionResultDataRightERT();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				expressionResultTime(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				dataTime();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				timeSpan();
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
		case 2:
			return expressionResultData_sempred((ExpressionResultDataContext)_localctx, predIndex);
		case 4:
			return expressionResultTime_sempred((ExpressionResultTimeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expressionResultData_sempred(ExpressionResultDataContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean expressionResultTime_sempred(ExpressionResultTimeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\16j\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4&\n\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4.\n\4\f\4\16\4\61\13\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5;\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6Y\n\6"+
		"\3\6\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6\3\7\3\7\3\7\3\7\3\7\5\7h\n\7\3\7"+
		"\2\4\6\n\b\2\4\6\b\n\f\2\4\3\2\r\16\3\2\6\7s\2\16\3\2\2\2\4\20\3\2\2\2"+
		"\6%\3\2\2\2\b:\3\2\2\2\nX\3\2\2\2\fg\3\2\2\2\16\17\t\2\2\2\17\3\3\2\2"+
		"\2\20\21\7\f\2\2\21\22\7\3\2\2\22\23\7\r\2\2\23\5\3\2\2\2\24\25\b\4\1"+
		"\2\25\26\5\2\2\2\26\27\7\6\2\2\27\30\5\4\3\2\30&\3\2\2\2\31\32\5\2\2\2"+
		"\32\33\7\6\2\2\33\34\5\6\4\7\34&\3\2\2\2\35\36\5\4\3\2\36\37\t\3\2\2\37"+
		" \5\2\2\2 &\3\2\2\2!\"\5\4\3\2\"#\t\3\2\2#$\5\n\6\2$&\3\2\2\2%\24\3\2"+
		"\2\2%\31\3\2\2\2%\35\3\2\2\2%!\3\2\2\2&/\3\2\2\2\'(\f\4\2\2()\t\3\2\2"+
		").\5\2\2\2*+\f\3\2\2+,\t\3\2\2,.\5\n\6\2-\'\3\2\2\2-*\3\2\2\2.\61\3\2"+
		"\2\2/-\3\2\2\2/\60\3\2\2\2\60\7\3\2\2\2\61/\3\2\2\2\62\63\5\n\6\2\63\64"+
		"\7\6\2\2\64\65\5\4\3\2\65;\3\2\2\2\66\67\5\n\6\2\678\7\6\2\289\5\6\4\2"+
		"9;\3\2\2\2:\62\3\2\2\2:\66\3\2\2\2;\t\3\2\2\2<=\b\6\1\2=>\5\4\3\2>?\7"+
		"\7\2\2?@\5\4\3\2@Y\3\2\2\2AB\5\4\3\2BC\7\7\2\2CD\5\6\4\2DY\3\2\2\2EF\5"+
		"\6\4\2FG\7\7\2\2GH\5\4\3\2HY\3\2\2\2IJ\5\6\4\2JK\7\7\2\2KL\5\6\4\2LY\3"+
		"\2\2\2MN\5\2\2\2NO\t\3\2\2OP\5\2\2\2PY\3\2\2\2QR\5\2\2\2RS\t\3\2\2ST\5"+
		"\n\6\2TU\5\n\6\2UV\t\3\2\2VW\5\n\6\3WY\3\2\2\2X<\3\2\2\2XA\3\2\2\2XE\3"+
		"\2\2\2XI\3\2\2\2XM\3\2\2\2XQ\3\2\2\2Y_\3\2\2\2Z[\f\4\2\2[\\\t\3\2\2\\"+
		"^\5\2\2\2]Z\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\13\3\2\2\2a_\3\2\2"+
		"\2bh\5\6\4\2ch\5\b\5\2dh\5\n\6\2eh\5\4\3\2fh\5\2\2\2gb\3\2\2\2gc\3\2\2"+
		"\2gd\3\2\2\2ge\3\2\2\2gf\3\2\2\2h\r\3\2\2\2\t%-/:X_g";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}