// Generated from com/example/compliance/language/Compliance.g4 by ANTLR 4.7.1

package com.example.compliance.language;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ComplianceLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VERSION_NUMBER=1, K_VERSION=2, K_NAME=3, K_DESCRIPTION=4, K_TYPE=5, K_CONTROL=6, 
		STRING=7, NEWLINE=8, WS=9, UNEXPECTED_CHAR=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VERSION_NUMBER", "K_VERSION", "K_NAME", "K_DESCRIPTION", "K_TYPE", "K_CONTROL", 
		"STRING", "DOT", "COLON", "DBL_QUOTE", "DIGIT", "A", "B", "C", "D", "E", 
		"F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", 
		"T", "U", "V", "W", "X", "Y", "Z", "LOWERCASE", "UPPERCASE", "NEWLINE", 
		"WS", "UNEXPECTED_CHAR"
	};

	private static final String[] _LITERAL_NAMES = {
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "VERSION_NUMBER", "K_VERSION", "K_NAME", "K_DESCRIPTION", "K_TYPE", 
		"K_CONTROL", "STRING", "NEWLINE", "WS", "UNEXPECTED_CHAR"
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


	public ComplianceLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Compliance.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\f\u00eb\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\6\2Y\n\2\r\2\16\2Z\3\2\3\2\6\2_\n\2\r\2\16\2`\7\2c\n\2\f\2\16\2f\13"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\b\u0098\n\b\f"+
		"\b\16\b\u009b\13\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3"+
		"$\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\5)\u00e0\n)\3)\3)\3)\3)\3*\3*\3*\3*\3+"+
		"\3+\3\u0099\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\2\25\2\27\2\31\2"+
		"\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\2=\2"+
		"?\2A\2C\2E\2G\2I\2K\2M\2O\2Q\nS\13U\f\3\2!\4\2\"\"//\3\2\62;\4\2CCcc\4"+
		"\2DDdd\4\2EEee\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLl"+
		"l\4\2MMmm\4\2NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2"+
		"UUuu\4\2VVvv\4\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\3\2c|\3"+
		"\2C\\\5\2\13\f\17\17\"\"\2\u00d2\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2"+
		"\2U\3\2\2\2\3X\3\2\2\2\5g\3\2\2\2\7p\3\2\2\2\tv\3\2\2\2\13\u0083\3\2\2"+
		"\2\r\u0089\3\2\2\2\17\u0092\3\2\2\2\21\u009e\3\2\2\2\23\u00a0\3\2\2\2"+
		"\25\u00a2\3\2\2\2\27\u00a4\3\2\2\2\31\u00a6\3\2\2\2\33\u00a8\3\2\2\2\35"+
		"\u00aa\3\2\2\2\37\u00ac\3\2\2\2!\u00ae\3\2\2\2#\u00b0\3\2\2\2%\u00b2\3"+
		"\2\2\2\'\u00b4\3\2\2\2)\u00b6\3\2\2\2+\u00b8\3\2\2\2-\u00ba\3\2\2\2/\u00bc"+
		"\3\2\2\2\61\u00be\3\2\2\2\63\u00c0\3\2\2\2\65\u00c2\3\2\2\2\67\u00c4\3"+
		"\2\2\29\u00c6\3\2\2\2;\u00c8\3\2\2\2=\u00ca\3\2\2\2?\u00cc\3\2\2\2A\u00ce"+
		"\3\2\2\2C\u00d0\3\2\2\2E\u00d2\3\2\2\2G\u00d4\3\2\2\2I\u00d6\3\2\2\2K"+
		"\u00d8\3\2\2\2M\u00da\3\2\2\2O\u00dc\3\2\2\2Q\u00df\3\2\2\2S\u00e5\3\2"+
		"\2\2U\u00e9\3\2\2\2WY\5\27\f\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2"+
		"[d\3\2\2\2\\^\5\21\t\2]_\5\27\f\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2"+
		"\2\2ac\3\2\2\2b\\\3\2\2\2cf\3\2\2\2db\3\2\2\2de\3\2\2\2e\4\3\2\2\2fd\3"+
		"\2\2\2gh\5C\"\2hi\5!\21\2ij\5;\36\2jk\5=\37\2kl\5)\25\2lm\5\65\33\2mn"+
		"\5\63\32\2no\5\23\n\2o\6\3\2\2\2pq\5\63\32\2qr\5\31\r\2rs\5\61\31\2st"+
		"\5!\21\2tu\5\23\n\2u\b\3\2\2\2vw\5\37\20\2wx\5!\21\2xy\5=\37\2yz\5\35"+
		"\17\2z{\5;\36\2{|\5)\25\2|}\5\67\34\2}~\5? \2~\177\5)\25\2\177\u0080\5"+
		"\65\33\2\u0080\u0081\5\63\32\2\u0081\u0082\5\23\n\2\u0082\n\3\2\2\2\u0083"+
		"\u0084\5? \2\u0084\u0085\5I%\2\u0085\u0086\5\67\34\2\u0086\u0087\5!\21"+
		"\2\u0087\u0088\5\23\n\2\u0088\f\3\2\2\2\u0089\u008a\5\35\17\2\u008a\u008b"+
		"\5\65\33\2\u008b\u008c\5\63\32\2\u008c\u008d\5? \2\u008d\u008e\5;\36\2"+
		"\u008e\u008f\5\65\33\2\u008f\u0090\5/\30\2\u0090\u0091\5\23\n\2\u0091"+
		"\16\3\2\2\2\u0092\u0099\5\25\13\2\u0093\u0098\5O(\2\u0094\u0098\5M\'\2"+
		"\u0095\u0098\t\2\2\2\u0096\u0098\5\27\f\2\u0097\u0093\3\2\2\2\u0097\u0094"+
		"\3\2\2\2\u0097\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u0098\u009b\3\2\2\2\u0099"+
		"\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a\u009c\3\2\2\2\u009b\u0099\3\2"+
		"\2\2\u009c\u009d\5\25\13\2\u009d\20\3\2\2\2\u009e\u009f\7\60\2\2\u009f"+
		"\22\3\2\2\2\u00a0\u00a1\7<\2\2\u00a1\24\3\2\2\2\u00a2\u00a3\7$\2\2\u00a3"+
		"\26\3\2\2\2\u00a4\u00a5\t\3\2\2\u00a5\30\3\2\2\2\u00a6\u00a7\t\4\2\2\u00a7"+
		"\32\3\2\2\2\u00a8\u00a9\t\5\2\2\u00a9\34\3\2\2\2\u00aa\u00ab\t\6\2\2\u00ab"+
		"\36\3\2\2\2\u00ac\u00ad\t\7\2\2\u00ad \3\2\2\2\u00ae\u00af\t\b\2\2\u00af"+
		"\"\3\2\2\2\u00b0\u00b1\t\t\2\2\u00b1$\3\2\2\2\u00b2\u00b3\t\n\2\2\u00b3"+
		"&\3\2\2\2\u00b4\u00b5\t\13\2\2\u00b5(\3\2\2\2\u00b6\u00b7\t\f\2\2\u00b7"+
		"*\3\2\2\2\u00b8\u00b9\t\r\2\2\u00b9,\3\2\2\2\u00ba\u00bb\t\16\2\2\u00bb"+
		".\3\2\2\2\u00bc\u00bd\t\17\2\2\u00bd\60\3\2\2\2\u00be\u00bf\t\20\2\2\u00bf"+
		"\62\3\2\2\2\u00c0\u00c1\t\21\2\2\u00c1\64\3\2\2\2\u00c2\u00c3\t\22\2\2"+
		"\u00c3\66\3\2\2\2\u00c4\u00c5\t\23\2\2\u00c58\3\2\2\2\u00c6\u00c7\t\24"+
		"\2\2\u00c7:\3\2\2\2\u00c8\u00c9\t\25\2\2\u00c9<\3\2\2\2\u00ca\u00cb\t"+
		"\26\2\2\u00cb>\3\2\2\2\u00cc\u00cd\t\27\2\2\u00cd@\3\2\2\2\u00ce\u00cf"+
		"\t\30\2\2\u00cfB\3\2\2\2\u00d0\u00d1\t\31\2\2\u00d1D\3\2\2\2\u00d2\u00d3"+
		"\t\32\2\2\u00d3F\3\2\2\2\u00d4\u00d5\t\33\2\2\u00d5H\3\2\2\2\u00d6\u00d7"+
		"\t\34\2\2\u00d7J\3\2\2\2\u00d8\u00d9\t\35\2\2\u00d9L\3\2\2\2\u00da\u00db"+
		"\t\36\2\2\u00dbN\3\2\2\2\u00dc\u00dd\t\37\2\2\u00ddP\3\2\2\2\u00de\u00e0"+
		"\7\17\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2"+
		"\u00e1\u00e2\7\f\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e4\b)\2\2\u00e4R\3\2"+
		"\2\2\u00e5\u00e6\t \2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\b*\2\2\u00e8T"+
		"\3\2\2\2\u00e9\u00ea\13\2\2\2\u00eaV\3\2\2\2\t\2Z`d\u0097\u0099\u00df"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}