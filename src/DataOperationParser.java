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
		Dot=8, Data=9, Time=10, Timespan=11;
	public static final int
		RULE_timeSpan = 0, RULE_dataTime = 1, RULE_expressionResultData = 2, RULE_expressionResultDataRightERT = 3, 
		RULE_expressionResultTime = 4, RULE_expressionRoot = 5;
	public static final String[] ruleNames = {
		"timeSpan", "dataTime", "expressionResultData", "expressionResultDataRightERT", 
		"expressionResultTime", "expressionRoot"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'+'", null, "'/'", "':'", null, "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WhiteSpace", "NewLine", "Add", "Substract", "Slash", "Colon", "Dash", 
		"Dot", "Data", "Time", "Timespan"
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
			setState(15);
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
		public TimeSpanContext timeSpan() {
			return getRuleContext(TimeSpanContext.class,0);
		}
		public TerminalNode Add() { return getToken(DataOperationParser.Add, 0); }
		public DataTimeContext dataTime() {
			return getRuleContext(DataTimeContext.class,0);
		}
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
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(18);
				timeSpan();
				setState(19);
				match(Add);
				setState(20);
				dataTime();
				}
				break;
			case 2:
				{
				setState(22);
				timeSpan();
				setState(23);
				match(Add);
				setState(24);
				expressionResultData(5);
				}
				break;
			case 3:
				{
				setState(26);
				dataTime();
				setState(27);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Substract) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(28);
				timeSpan();
				}
				break;
			case 4:
				{
				setState(30);
				dataTime();
				setState(31);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Substract) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(32);
				expressionResultTime(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(42);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionResultDataContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionResultData);
						setState(36);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(37);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Substract) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(38);
						timeSpan();
						}
						break;
					case 2:
						{
						_localctx = new ExpressionResultDataContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expressionResultData);
						setState(39);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(40);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Substract) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(41);
						expressionResultTime(0);
						}
						break;
					}
					} 
				}
				setState(46);
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
		public ExpressionResultTimeContext expressionResultTime() {
			return getRuleContext(ExpressionResultTimeContext.class,0);
		}
		public TerminalNode Add() { return getToken(DataOperationParser.Add, 0); }
		public DataTimeContext dataTime() {
			return getRuleContext(DataTimeContext.class,0);
		}
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
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				expressionResultTime(0);
				setState(48);
				match(Add);
				setState(49);
				dataTime();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				expressionResultTime(0);
				setState(52);
				match(Add);
				setState(53);
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(58);
				dataTime();
				setState(59);
				match(Substract);
				setState(60);
				dataTime();
				}
				break;
			case 2:
				{
				setState(62);
				dataTime();
				setState(63);
				match(Substract);
				setState(64);
				expressionResultData(0);
				}
				break;
			case 3:
				{
				setState(66);
				expressionResultData(0);
				setState(67);
				match(Substract);
				setState(68);
				dataTime();
				}
				break;
			case 4:
				{
				setState(70);
				expressionResultData(0);
				setState(71);
				match(Substract);
				setState(72);
				expressionResultData(0);
				}
				break;
			case 5:
				{
				setState(74);
				timeSpan();
				setState(75);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Substract) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(76);
				timeSpan();
				}
				break;
			case 6:
				{
				setState(78);
				timeSpan();
				setState(79);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Substract) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(80);
				expressionResultTime(0);
				setState(81);
				expressionResultTime(0);
				setState(82);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Substract) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(83);
				expressionResultTime(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(92);
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
					setState(87);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(88);
					_la = _input.LA(1);
					if ( !(_la==Add || _la==Substract) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(89);
					timeSpan();
					}
					} 
				}
				setState(94);
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
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				expressionResultData(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				expressionResultDataRightERT();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				expressionResultTime(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				dataTime();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\ri\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4%\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\7\4-\n\4\f\4\16\4\60\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5:\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6X\n\6\3\6"+
		"\3\6\3\6\7\6]\n\6\f\6\16\6`\13\6\3\7\3\7\3\7\3\7\3\7\5\7g\n\7\3\7\2\4"+
		"\6\n\b\2\4\6\b\n\f\2\4\3\2\f\r\3\2\5\6r\2\16\3\2\2\2\4\20\3\2\2\2\6$\3"+
		"\2\2\2\b9\3\2\2\2\nW\3\2\2\2\ff\3\2\2\2\16\17\t\2\2\2\17\3\3\2\2\2\20"+
		"\21\7\13\2\2\21\22\7\f\2\2\22\5\3\2\2\2\23\24\b\4\1\2\24\25\5\2\2\2\25"+
		"\26\7\5\2\2\26\27\5\4\3\2\27%\3\2\2\2\30\31\5\2\2\2\31\32\7\5\2\2\32\33"+
		"\5\6\4\7\33%\3\2\2\2\34\35\5\4\3\2\35\36\t\3\2\2\36\37\5\2\2\2\37%\3\2"+
		"\2\2 !\5\4\3\2!\"\t\3\2\2\"#\5\n\6\2#%\3\2\2\2$\23\3\2\2\2$\30\3\2\2\2"+
		"$\34\3\2\2\2$ \3\2\2\2%.\3\2\2\2&\'\f\4\2\2\'(\t\3\2\2(-\5\2\2\2)*\f\3"+
		"\2\2*+\t\3\2\2+-\5\n\6\2,&\3\2\2\2,)\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3"+
		"\2\2\2/\7\3\2\2\2\60.\3\2\2\2\61\62\5\n\6\2\62\63\7\5\2\2\63\64\5\4\3"+
		"\2\64:\3\2\2\2\65\66\5\n\6\2\66\67\7\5\2\2\678\5\6\4\28:\3\2\2\29\61\3"+
		"\2\2\29\65\3\2\2\2:\t\3\2\2\2;<\b\6\1\2<=\5\4\3\2=>\7\6\2\2>?\5\4\3\2"+
		"?X\3\2\2\2@A\5\4\3\2AB\7\6\2\2BC\5\6\4\2CX\3\2\2\2DE\5\6\4\2EF\7\6\2\2"+
		"FG\5\4\3\2GX\3\2\2\2HI\5\6\4\2IJ\7\6\2\2JK\5\6\4\2KX\3\2\2\2LM\5\2\2\2"+
		"MN\t\3\2\2NO\5\2\2\2OX\3\2\2\2PQ\5\2\2\2QR\t\3\2\2RS\5\n\6\2ST\5\n\6\2"+
		"TU\t\3\2\2UV\5\n\6\3VX\3\2\2\2W;\3\2\2\2W@\3\2\2\2WD\3\2\2\2WH\3\2\2\2"+
		"WL\3\2\2\2WP\3\2\2\2X^\3\2\2\2YZ\f\4\2\2Z[\t\3\2\2[]\5\2\2\2\\Y\3\2\2"+
		"\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\13\3\2\2\2`^\3\2\2\2ag\5\6\4\2bg\5"+
		"\b\5\2cg\5\n\6\2dg\5\4\3\2eg\5\2\2\2fa\3\2\2\2fb\3\2\2\2fc\3\2\2\2fd\3"+
		"\2\2\2fe\3\2\2\2g\r\3\2\2\2\t$,.9W^f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}