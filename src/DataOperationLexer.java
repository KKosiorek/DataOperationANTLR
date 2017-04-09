// Generated from DataOperation.g4 by ANTLR 4.6
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DataOperationLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WhiteSpace=2, NewLine=3, Add=4, Substract=5, Slash=6, Colon=7, 
		Dash=8, Dot=9, Data=10, Time=11, Timespan=12;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "SINGLE_SPACE", "TABULATION", "LINE_FEED", "CARRAIGE_RETURN", 
		"WhiteSpace", "NewLine", "Add", "Substract", "Slash", "Colon", "Dash", 
		"Dot", "Data", "Time", "Timespan"
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


	public DataOperationLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DataOperation.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\16\u0091\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\6\7\60\n\7\r\7\16\7\61\3\7"+
		"\3\7\3\b\3\b\6\b8\n\b\r\b\16\b9\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\16\3\16\3\17\5\17K\n\17\3\17\3\17\3\17\3\17\3\17\5\17R"+
		"\n\17\3\17\3\17\3\17\5\17W\n\17\3\17\5\17Z\n\17\3\17\3\17\3\17\5\17_\n"+
		"\17\3\17\3\17\3\17\5\17d\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\5\17p\n\17\3\20\3\20\3\20\3\20\5\20v\n\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u0083\n\21\f\21\16\21\u0086"+
		"\13\21\5\21\u0088\n\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\2\2\22"+
		"\3\3\5\2\7\2\t\2\13\2\r\4\17\5\21\6\23\7\25\b\27\t\31\n\33\13\35\f\37"+
		"\r!\16\3\2\t\3\2\63;\3\2\63\64\3\2\62;\3\2\62\63\3\2\62\64\3\2\62\65\3"+
		"\2\62\67\u009f\2\3\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7\'\3\2\2\2\t)\3\2"+
		"\2\2\13+\3\2\2\2\r/\3\2\2\2\17\67\3\2\2\2\21=\3\2\2\2\23?\3\2\2\2\25A"+
		"\3\2\2\2\27C\3\2\2\2\31E\3\2\2\2\33G\3\2\2\2\35Q\3\2\2\2\37u\3\2\2\2!"+
		"\u0087\3\2\2\2#$\7~\2\2$\4\3\2\2\2%&\7\"\2\2&\6\3\2\2\2\'(\7\13\2\2(\b"+
		"\3\2\2\2)*\7\f\2\2*\n\3\2\2\2+,\7\17\2\2,\f\3\2\2\2-\60\5\5\3\2.\60\5"+
		"\7\4\2/-\3\2\2\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62"+
		"\63\3\2\2\2\63\64\b\7\2\2\64\16\3\2\2\2\658\5\13\6\2\668\5\t\5\2\67\65"+
		"\3\2\2\2\67\66\3\2\2\289\3\2\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\b\b"+
		"\2\2<\20\3\2\2\2=>\7-\2\2>\22\3\2\2\2?@\7/\2\2@\24\3\2\2\2AB\7\61\2\2"+
		"B\26\3\2\2\2CD\7<\2\2D\30\3\2\2\2EF\7/\2\2F\32\3\2\2\2GH\7\60\2\2H\34"+
		"\3\2\2\2IK\7\62\2\2JI\3\2\2\2JK\3\2\2\2KL\3\2\2\2LR\t\2\2\2MN\t\3\2\2"+
		"NR\t\4\2\2OP\7\65\2\2PR\t\5\2\2QJ\3\2\2\2QM\3\2\2\2QO\3\2\2\2RV\3\2\2"+
		"\2SW\5\25\13\2TW\5\31\r\2UW\5\33\16\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W^"+
		"\3\2\2\2XZ\7\62\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[_\t\2\2\2\\]\7\63\2"+
		"\2]_\t\6\2\2^Y\3\2\2\2^\\\3\2\2\2_c\3\2\2\2`d\5\25\13\2ad\5\31\r\2bd\5"+
		"\33\16\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2do\3\2\2\2ep\t\2\2\2fg\t\2\2\2g"+
		"p\t\4\2\2hi\t\2\2\2ij\t\4\2\2jp\t\4\2\2kl\t\2\2\2lm\t\4\2\2mn\t\4\2\2"+
		"np\t\4\2\2oe\3\2\2\2of\3\2\2\2oh\3\2\2\2ok\3\2\2\2p\36\3\2\2\2qr\t\5\2"+
		"\2rv\t\4\2\2st\7\64\2\2tv\t\7\2\2uq\3\2\2\2us\3\2\2\2vw\3\2\2\2wx\5\27"+
		"\f\2xy\t\b\2\2yz\t\4\2\2z{\3\2\2\2{|\5\27\f\2|}\t\b\2\2}~\t\4\2\2~ \3"+
		"\2\2\2\177\u0088\7\62\2\2\u0080\u0084\t\2\2\2\u0081\u0083\t\4\2\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0087\177\3\2\2\2\u0087\u0080"+
		"\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008a\5\27\f\2\u008a\u008b\t\b\2\2"+
		"\u008b\u008c\t\4\2\2\u008c\u008d\3\2\2\2\u008d\u008e\5\27\f\2\u008e\u008f"+
		"\t\b\2\2\u008f\u0090\t\4\2\2\u0090\"\3\2\2\2\21\2/\61\679JQVY^cou\u0084"+
		"\u0087\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}