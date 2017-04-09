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
		Dot=8, Data=9, Time=10, Timespan=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SINGLE_SPACE", "TABULATION", "LINE_FEED", "CARRAIGE_RETURN", "WhiteSpace", 
		"NewLine", "Add", "Substract", "Slash", "Colon", "Dash", "Dot", "Data", 
		"Time", "Timespan"
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\r\u008d\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\6\6,\n\6\r\6\16\6-\3\6\3\6\3\7\3\7\6\7\64\n\7\r"+
		"\7\16\7\65\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\5\16G\n\16\3\16\3\16\3\16\3\16\3\16\5\16N\n\16\3\16\3\16\3\16\5\16"+
		"S\n\16\3\16\5\16V\n\16\3\16\3\16\3\16\5\16[\n\16\3\16\3\16\3\16\5\16`"+
		"\n\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16l\n\16\3\17"+
		"\3\17\3\17\3\17\5\17r\n\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\7\20\177\n\20\f\20\16\20\u0082\13\20\5\20\u0084\n\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\2\2\21\3\2\5\2\7\2\t\2\13\3\r\4\17\5"+
		"\21\6\23\7\25\b\27\t\31\n\33\13\35\f\37\r\3\2\t\3\2\63;\3\2\63\64\3\2"+
		"\62;\3\2\62\63\3\2\62\64\3\2\62\65\3\2\62\67\u009b\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\3!\3\2\2\2\5#\3"+
		"\2\2\2\7%\3\2\2\2\t\'\3\2\2\2\13+\3\2\2\2\r\63\3\2\2\2\179\3\2\2\2\21"+
		";\3\2\2\2\23=\3\2\2\2\25?\3\2\2\2\27A\3\2\2\2\31C\3\2\2\2\33M\3\2\2\2"+
		"\35q\3\2\2\2\37\u0083\3\2\2\2!\"\7\"\2\2\"\4\3\2\2\2#$\7\13\2\2$\6\3\2"+
		"\2\2%&\7\f\2\2&\b\3\2\2\2\'(\7\17\2\2(\n\3\2\2\2),\5\3\2\2*,\5\5\3\2+"+
		")\3\2\2\2+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\b\6\2"+
		"\2\60\f\3\2\2\2\61\64\5\t\5\2\62\64\5\7\4\2\63\61\3\2\2\2\63\62\3\2\2"+
		"\2\64\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\678\b\7\2\2"+
		"8\16\3\2\2\29:\7-\2\2:\20\3\2\2\2;<\7/\2\2<\22\3\2\2\2=>\7\61\2\2>\24"+
		"\3\2\2\2?@\7<\2\2@\26\3\2\2\2AB\7/\2\2B\30\3\2\2\2CD\7\60\2\2D\32\3\2"+
		"\2\2EG\7\62\2\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HN\t\2\2\2IJ\t\3\2\2JN\t"+
		"\4\2\2KL\7\65\2\2LN\t\5\2\2MF\3\2\2\2MI\3\2\2\2MK\3\2\2\2NR\3\2\2\2OS"+
		"\5\23\n\2PS\5\27\f\2QS\5\31\r\2RO\3\2\2\2RP\3\2\2\2RQ\3\2\2\2SZ\3\2\2"+
		"\2TV\7\62\2\2UT\3\2\2\2UV\3\2\2\2VW\3\2\2\2W[\t\2\2\2XY\7\63\2\2Y[\t\6"+
		"\2\2ZU\3\2\2\2ZX\3\2\2\2[_\3\2\2\2\\`\5\23\n\2]`\5\27\f\2^`\5\31\r\2_"+
		"\\\3\2\2\2_]\3\2\2\2_^\3\2\2\2`k\3\2\2\2al\t\2\2\2bc\t\2\2\2cl\t\4\2\2"+
		"de\t\2\2\2ef\t\4\2\2fl\t\4\2\2gh\t\2\2\2hi\t\4\2\2ij\t\4\2\2jl\t\4\2\2"+
		"ka\3\2\2\2kb\3\2\2\2kd\3\2\2\2kg\3\2\2\2l\34\3\2\2\2mn\t\5\2\2nr\t\4\2"+
		"\2op\7\64\2\2pr\t\7\2\2qm\3\2\2\2qo\3\2\2\2rs\3\2\2\2st\5\25\13\2tu\t"+
		"\b\2\2uv\t\4\2\2vw\3\2\2\2wx\5\25\13\2xy\t\b\2\2yz\t\4\2\2z\36\3\2\2\2"+
		"{\u0084\7\62\2\2|\u0080\t\2\2\2}\177\t\4\2\2~}\3\2\2\2\177\u0082\3\2\2"+
		"\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083{\3\2\2\2\u0083|\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"+
		"\5\25\13\2\u0086\u0087\t\b\2\2\u0087\u0088\t\4\2\2\u0088\u0089\3\2\2\2"+
		"\u0089\u008a\5\25\13\2\u008a\u008b\t\b\2\2\u008b\u008c\t\4\2\2\u008c "+
		"\3\2\2\2\21\2+-\63\65FMRUZ_kq\u0080\u0083\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}