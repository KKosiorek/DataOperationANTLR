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
		WhiteSpace=1, NewLine=2, Add=3, Substract=4, Slash=5, Colon=6, Dash=7, 
		Dot=8, Data=9, Time=10;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SINGLE_SPACE", "TABULATION", "LINE_FEED", "CARRAIGE_RETURN", "WhiteSpace", 
		"NewLine", "Add", "Substract", "Slash", "Colon", "Dash", "Dot", "Data", 
		"Time"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\fy\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3"+
		"\5\3\6\3\6\6\6*\n\6\r\6\16\6+\3\6\3\6\3\7\3\7\6\7\62\n\7\r\7\16\7\63\3"+
		"\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\5\16E\n"+
		"\16\3\16\3\16\3\16\3\16\3\16\5\16L\n\16\3\16\3\16\3\16\5\16Q\n\16\3\16"+
		"\5\16T\n\16\3\16\3\16\3\16\5\16Y\n\16\3\16\3\16\3\16\5\16^\n\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16j\n\16\3\17\3\17\3\17"+
		"\3\17\5\17p\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\2\2\20\3\2\5"+
		"\2\7\2\t\2\13\3\r\4\17\5\21\6\23\7\25\b\27\t\31\n\33\13\35\f\3\2\t\3\2"+
		"\63;\3\2\63\64\3\2\62;\3\2\62\63\3\2\62\64\3\2\62\65\3\2\62\67\u0085\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2"+
		"\2\5!\3\2\2\2\7#\3\2\2\2\t%\3\2\2\2\13)\3\2\2\2\r\61\3\2\2\2\17\67\3\2"+
		"\2\2\219\3\2\2\2\23;\3\2\2\2\25=\3\2\2\2\27?\3\2\2\2\31A\3\2\2\2\33K\3"+
		"\2\2\2\35o\3\2\2\2\37 \7\"\2\2 \4\3\2\2\2!\"\7\13\2\2\"\6\3\2\2\2#$\7"+
		"\f\2\2$\b\3\2\2\2%&\7\17\2\2&\n\3\2\2\2\'*\5\3\2\2(*\5\5\3\2)\'\3\2\2"+
		"\2)(\3\2\2\2*+\3\2\2\2+)\3\2\2\2+,\3\2\2\2,-\3\2\2\2-.\b\6\2\2.\f\3\2"+
		"\2\2/\62\5\t\5\2\60\62\5\7\4\2\61/\3\2\2\2\61\60\3\2\2\2\62\63\3\2\2\2"+
		"\63\61\3\2\2\2\63\64\3\2\2\2\64\65\3\2\2\2\65\66\b\7\2\2\66\16\3\2\2\2"+
		"\678\7-\2\28\20\3\2\2\29:\7/\2\2:\22\3\2\2\2;<\7\61\2\2<\24\3\2\2\2=>"+
		"\7<\2\2>\26\3\2\2\2?@\7/\2\2@\30\3\2\2\2AB\7\60\2\2B\32\3\2\2\2CE\7\62"+
		"\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FL\t\2\2\2GH\t\3\2\2HL\t\4\2\2IJ\7\65"+
		"\2\2JL\t\5\2\2KD\3\2\2\2KG\3\2\2\2KI\3\2\2\2LP\3\2\2\2MQ\5\23\n\2NQ\5"+
		"\27\f\2OQ\5\31\r\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2QX\3\2\2\2RT\7\62\2\2"+
		"SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UY\t\2\2\2VW\7\63\2\2WY\t\6\2\2XS\3\2\2"+
		"\2XV\3\2\2\2Y]\3\2\2\2Z^\5\23\n\2[^\5\27\f\2\\^\5\31\r\2]Z\3\2\2\2][\3"+
		"\2\2\2]\\\3\2\2\2^i\3\2\2\2_j\t\2\2\2`a\t\2\2\2aj\t\4\2\2bc\t\2\2\2cd"+
		"\t\4\2\2dj\t\4\2\2ef\t\2\2\2fg\t\4\2\2gh\t\4\2\2hj\t\4\2\2i_\3\2\2\2i"+
		"`\3\2\2\2ib\3\2\2\2ie\3\2\2\2j\34\3\2\2\2kl\t\5\2\2lp\t\4\2\2mn\7\64\2"+
		"\2np\t\7\2\2ok\3\2\2\2om\3\2\2\2pq\3\2\2\2qr\5\25\13\2rs\t\b\2\2st\t\4"+
		"\2\2tu\3\2\2\2uv\5\25\13\2vw\t\b\2\2wx\t\4\2\2x\36\3\2\2\2\17\2)+\61\63"+
		"DKPSX]io\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}