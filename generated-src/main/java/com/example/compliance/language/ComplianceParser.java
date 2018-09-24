// Generated from com/example/compliance/language/Compliance.g4 by ANTLR 4.7.1

package com.example.compliance.language;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ComplianceParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		VERSION_NUMBER=1, K_VERSION=2, K_NAME=3, K_DESCRIPTION=4, K_TYPE=5, K_CONTROL=6, 
		STRING=7, NEWLINE=8, WS=9, UNEXPECTED_CHAR=10;
	public static final int
		RULE_error = 0, RULE_document = 1, RULE_compliance_object = 2, RULE_compliance_version = 3, 
		RULE_version_number_value = 4, RULE_compliance_meta = 5, RULE_compliance_meta_name = 6, 
		RULE_compliance_meta_description = 7, RULE_compliance_meta_type = 8, RULE_compliance_meta_name_value = 9, 
		RULE_compliance_meta_description_value = 10, RULE_compliance_meta_type_value = 11, 
		RULE_compliance_control = 12, RULE_compliance_control_ctrl = 13, RULE_compliance_control_ctrl_value = 14, 
		RULE_compliance_control_description = 15, RULE_compliance_control_description_value = 16;
	public static final String[] ruleNames = {
		"error", "document", "compliance_object", "compliance_version", "version_number_value", 
		"compliance_meta", "compliance_meta_name", "compliance_meta_description", 
		"compliance_meta_type", "compliance_meta_name_value", "compliance_meta_description_value", 
		"compliance_meta_type_value", "compliance_control", "compliance_control_ctrl", 
		"compliance_control_ctrl_value", "compliance_control_description", "compliance_control_description_value"
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

	@Override
	public String getGrammarFileName() { return "Compliance.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ComplianceParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(ComplianceParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).exitError(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);

			     throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null));
			   
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

	public static class DocumentContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ComplianceParser.EOF, 0); }
		public Compliance_objectContext compliance_object() {
			return getRuleContext(Compliance_objectContext.class,0);
		}
		public ErrorContext error() {
			return getRuleContext(ErrorContext.class,0);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).enterDocument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).exitDocument(this);
		}
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EOF:
			case K_VERSION:
				{
				setState(37);
				compliance_object();
				}
				break;
			case UNEXPECTED_CHAR:
				{
				setState(38);
				error();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(41);
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

	public static class Compliance_objectContext extends ParserRuleContext {
		public Compliance_versionContext compliance_version() {
			return getRuleContext(Compliance_versionContext.class,0);
		}
		public Compliance_metaContext compliance_meta() {
			return getRuleContext(Compliance_metaContext.class,0);
		}
		public List<Compliance_controlContext> compliance_control() {
			return getRuleContexts(Compliance_controlContext.class);
		}
		public Compliance_controlContext compliance_control(int i) {
			return getRuleContext(Compliance_controlContext.class,i);
		}
		public Compliance_objectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compliance_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).enterCompliance_object(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).exitCompliance_object(this);
		}
	}

	public final Compliance_objectContext compliance_object() throws RecognitionException {
		Compliance_objectContext _localctx = new Compliance_objectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_compliance_object);
		int _la;
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case K_VERSION:
				enterOuterAlt(_localctx, 1);
				{
				setState(43);
				compliance_version();
				setState(44);
				compliance_meta();
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(45);
					compliance_control();
					}
					}
					setState(48); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==K_CONTROL );
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Compliance_versionContext extends ParserRuleContext {
		public TerminalNode K_VERSION() { return getToken(ComplianceParser.K_VERSION, 0); }
		public Version_number_valueContext version_number_value() {
			return getRuleContext(Version_number_valueContext.class,0);
		}
		public Compliance_versionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compliance_version; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).enterCompliance_version(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).exitCompliance_version(this);
		}
	}

	public final Compliance_versionContext compliance_version() throws RecognitionException {
		Compliance_versionContext _localctx = new Compliance_versionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_compliance_version);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(53);
			match(K_VERSION);
			setState(54);
			version_number_value();
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

	public static class Version_number_valueContext extends ParserRuleContext {
		public TerminalNode VERSION_NUMBER() { return getToken(ComplianceParser.VERSION_NUMBER, 0); }
		public Version_number_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_version_number_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).enterVersion_number_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).exitVersion_number_value(this);
		}
	}

	public final Version_number_valueContext version_number_value() throws RecognitionException {
		Version_number_valueContext _localctx = new Version_number_valueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_version_number_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(VERSION_NUMBER);
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

	public static class Compliance_metaContext extends ParserRuleContext {
		public Compliance_meta_nameContext compliance_meta_name() {
			return getRuleContext(Compliance_meta_nameContext.class,0);
		}
		public Compliance_meta_descriptionContext compliance_meta_description() {
			return getRuleContext(Compliance_meta_descriptionContext.class,0);
		}
		public Compliance_meta_typeContext compliance_meta_type() {
			return getRuleContext(Compliance_meta_typeContext.class,0);
		}
		public Compliance_metaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compliance_meta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).enterCompliance_meta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).exitCompliance_meta(this);
		}
	}

	public final Compliance_metaContext compliance_meta() throws RecognitionException {
		Compliance_metaContext _localctx = new Compliance_metaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_compliance_meta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			compliance_meta_name();
			setState(59);
			compliance_meta_description();
			setState(60);
			compliance_meta_type();
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

	public static class Compliance_meta_nameContext extends ParserRuleContext {
		public TerminalNode K_NAME() { return getToken(ComplianceParser.K_NAME, 0); }
		public Compliance_meta_name_valueContext compliance_meta_name_value() {
			return getRuleContext(Compliance_meta_name_valueContext.class,0);
		}
		public Compliance_meta_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compliance_meta_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).enterCompliance_meta_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).exitCompliance_meta_name(this);
		}
	}

	public final Compliance_meta_nameContext compliance_meta_name() throws RecognitionException {
		Compliance_meta_nameContext _localctx = new Compliance_meta_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_compliance_meta_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(62);
			match(K_NAME);
			setState(63);
			compliance_meta_name_value();
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

	public static class Compliance_meta_descriptionContext extends ParserRuleContext {
		public TerminalNode K_DESCRIPTION() { return getToken(ComplianceParser.K_DESCRIPTION, 0); }
		public Compliance_meta_description_valueContext compliance_meta_description_value() {
			return getRuleContext(Compliance_meta_description_valueContext.class,0);
		}
		public Compliance_meta_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compliance_meta_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).enterCompliance_meta_description(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).exitCompliance_meta_description(this);
		}
	}

	public final Compliance_meta_descriptionContext compliance_meta_description() throws RecognitionException {
		Compliance_meta_descriptionContext _localctx = new Compliance_meta_descriptionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_compliance_meta_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(65);
			match(K_DESCRIPTION);
			setState(66);
			compliance_meta_description_value();
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

	public static class Compliance_meta_typeContext extends ParserRuleContext {
		public TerminalNode K_TYPE() { return getToken(ComplianceParser.K_TYPE, 0); }
		public Compliance_meta_type_valueContext compliance_meta_type_value() {
			return getRuleContext(Compliance_meta_type_valueContext.class,0);
		}
		public Compliance_meta_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compliance_meta_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).enterCompliance_meta_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).exitCompliance_meta_type(this);
		}
	}

	public final Compliance_meta_typeContext compliance_meta_type() throws RecognitionException {
		Compliance_meta_typeContext _localctx = new Compliance_meta_typeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compliance_meta_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(68);
			match(K_TYPE);
			setState(69);
			compliance_meta_type_value();
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

	public static class Compliance_meta_name_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ComplianceParser.STRING, 0); }
		public Compliance_meta_name_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compliance_meta_name_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).enterCompliance_meta_name_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).exitCompliance_meta_name_value(this);
		}
	}

	public final Compliance_meta_name_valueContext compliance_meta_name_value() throws RecognitionException {
		Compliance_meta_name_valueContext _localctx = new Compliance_meta_name_valueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compliance_meta_name_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(STRING);
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

	public static class Compliance_meta_description_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ComplianceParser.STRING, 0); }
		public Compliance_meta_description_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compliance_meta_description_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).enterCompliance_meta_description_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).exitCompliance_meta_description_value(this);
		}
	}

	public final Compliance_meta_description_valueContext compliance_meta_description_value() throws RecognitionException {
		Compliance_meta_description_valueContext _localctx = new Compliance_meta_description_valueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compliance_meta_description_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(STRING);
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

	public static class Compliance_meta_type_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ComplianceParser.STRING, 0); }
		public Compliance_meta_type_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compliance_meta_type_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).enterCompliance_meta_type_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).exitCompliance_meta_type_value(this);
		}
	}

	public final Compliance_meta_type_valueContext compliance_meta_type_value() throws RecognitionException {
		Compliance_meta_type_valueContext _localctx = new Compliance_meta_type_valueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compliance_meta_type_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(STRING);
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

	public static class Compliance_controlContext extends ParserRuleContext {
		public Compliance_control_ctrlContext compliance_control_ctrl() {
			return getRuleContext(Compliance_control_ctrlContext.class,0);
		}
		public Compliance_control_descriptionContext compliance_control_description() {
			return getRuleContext(Compliance_control_descriptionContext.class,0);
		}
		public Compliance_controlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compliance_control; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).enterCompliance_control(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).exitCompliance_control(this);
		}
	}

	public final Compliance_controlContext compliance_control() throws RecognitionException {
		Compliance_controlContext _localctx = new Compliance_controlContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_compliance_control);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(77);
			compliance_control_ctrl();
			setState(78);
			compliance_control_description();
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

	public static class Compliance_control_ctrlContext extends ParserRuleContext {
		public TerminalNode K_CONTROL() { return getToken(ComplianceParser.K_CONTROL, 0); }
		public Compliance_control_ctrl_valueContext compliance_control_ctrl_value() {
			return getRuleContext(Compliance_control_ctrl_valueContext.class,0);
		}
		public Compliance_control_ctrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compliance_control_ctrl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).enterCompliance_control_ctrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).exitCompliance_control_ctrl(this);
		}
	}

	public final Compliance_control_ctrlContext compliance_control_ctrl() throws RecognitionException {
		Compliance_control_ctrlContext _localctx = new Compliance_control_ctrlContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_compliance_control_ctrl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(80);
			match(K_CONTROL);
			setState(81);
			compliance_control_ctrl_value();
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

	public static class Compliance_control_ctrl_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ComplianceParser.STRING, 0); }
		public Compliance_control_ctrl_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compliance_control_ctrl_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).enterCompliance_control_ctrl_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).exitCompliance_control_ctrl_value(this);
		}
	}

	public final Compliance_control_ctrl_valueContext compliance_control_ctrl_value() throws RecognitionException {
		Compliance_control_ctrl_valueContext _localctx = new Compliance_control_ctrl_valueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compliance_control_ctrl_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(STRING);
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

	public static class Compliance_control_descriptionContext extends ParserRuleContext {
		public TerminalNode K_DESCRIPTION() { return getToken(ComplianceParser.K_DESCRIPTION, 0); }
		public Compliance_control_description_valueContext compliance_control_description_value() {
			return getRuleContext(Compliance_control_description_valueContext.class,0);
		}
		public Compliance_control_descriptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compliance_control_description; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).enterCompliance_control_description(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).exitCompliance_control_description(this);
		}
	}

	public final Compliance_control_descriptionContext compliance_control_description() throws RecognitionException {
		Compliance_control_descriptionContext _localctx = new Compliance_control_descriptionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_compliance_control_description);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(85);
			match(K_DESCRIPTION);
			setState(86);
			compliance_control_description_value();
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

	public static class Compliance_control_description_valueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(ComplianceParser.STRING, 0); }
		public Compliance_control_description_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compliance_control_description_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).enterCompliance_control_description_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ComplianceListener ) ((ComplianceListener)listener).exitCompliance_control_description_value(this);
		}
	}

	public final Compliance_control_description_valueContext compliance_control_description_value() throws RecognitionException {
		Compliance_control_description_valueContext _localctx = new Compliance_control_description_valueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_compliance_control_description_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(STRING);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\f]\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\3\2\3"+
		"\2\3\2\3\3\3\3\5\3*\n\3\3\3\3\3\3\4\3\4\3\4\6\4\61\n\4\r\4\16\4\62\3\4"+
		"\5\4\66\n\4\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\2\2\23\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"\2\2\2N\2$\3\2\2\2\4)\3\2\2\2\6\65\3\2\2\2\b\67\3\2"+
		"\2\2\n:\3\2\2\2\f<\3\2\2\2\16@\3\2\2\2\20C\3\2\2\2\22F\3\2\2\2\24I\3\2"+
		"\2\2\26K\3\2\2\2\30M\3\2\2\2\32O\3\2\2\2\34R\3\2\2\2\36U\3\2\2\2 W\3\2"+
		"\2\2\"Z\3\2\2\2$%\7\f\2\2%&\b\2\1\2&\3\3\2\2\2\'*\5\6\4\2(*\5\2\2\2)\'"+
		"\3\2\2\2)(\3\2\2\2*+\3\2\2\2+,\7\2\2\3,\5\3\2\2\2-.\5\b\5\2.\60\5\f\7"+
		"\2/\61\5\32\16\2\60/\3\2\2\2\61\62\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2"+
		"\63\66\3\2\2\2\64\66\3\2\2\2\65-\3\2\2\2\65\64\3\2\2\2\66\7\3\2\2\2\67"+
		"8\7\4\2\289\5\n\6\29\t\3\2\2\2:;\7\3\2\2;\13\3\2\2\2<=\5\16\b\2=>\5\20"+
		"\t\2>?\5\22\n\2?\r\3\2\2\2@A\7\5\2\2AB\5\24\13\2B\17\3\2\2\2CD\7\6\2\2"+
		"DE\5\26\f\2E\21\3\2\2\2FG\7\7\2\2GH\5\30\r\2H\23\3\2\2\2IJ\7\t\2\2J\25"+
		"\3\2\2\2KL\7\t\2\2L\27\3\2\2\2MN\7\t\2\2N\31\3\2\2\2OP\5\34\17\2PQ\5 "+
		"\21\2Q\33\3\2\2\2RS\7\b\2\2ST\5\36\20\2T\35\3\2\2\2UV\7\t\2\2V\37\3\2"+
		"\2\2WX\7\6\2\2XY\5\"\22\2Y!\3\2\2\2Z[\7\t\2\2[#\3\2\2\2\5)\62\65";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}