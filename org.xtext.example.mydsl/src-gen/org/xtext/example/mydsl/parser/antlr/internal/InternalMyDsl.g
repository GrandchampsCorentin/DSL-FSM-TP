/*
 * generated by Xtext 2.14.0
 */
grammar InternalMyDsl;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

}

@parser::members {

 	private MyDslGrammarAccess grammarAccess;

    public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "FSM";
   	}

   	@Override
   	protected MyDslGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleFSM
entryRuleFSM returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFSMRule()); }
	iv_ruleFSM=ruleFSM
	{ $current=$iv_ruleFSM.current; }
	EOF;

// Rule FSM
ruleFSM returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFSMAccess().getFSMAction_0(),
					$current);
			}
		)
		otherlv_1='FSM'
		{
			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getFSMKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFSMRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFSMAccess().getStateInitialStateParserRuleCall_3_0());
				}
				lv_state_3_0=ruleInitialState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFSMRule());
					}
					add(
						$current,
						"state",
						lv_state_3_0,
						"org.xtext.example.mydsl.MyDsl.InitialState");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getFSMAccess().getStateFinalStateParserRuleCall_4_0());
				}
				lv_state_4_0=ruleFinalState
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFSMRule());
					}
					add(
						$current,
						"state",
						lv_state_4_0,
						"org.xtext.example.mydsl.MyDsl.FinalState");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_5_0_0());
					}
					lv_state_5_0=ruleState
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFSMRule());
						}
						add(
							$current,
							"state",
							lv_state_5_0,
							"org.xtext.example.mydsl.MyDsl.State");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				(
					{
						newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_5_1_0());
					}
					lv_transition_6_0=ruleTransition
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFSMRule());
						}
						add(
							$current,
							"transition",
							lv_transition_6_0,
							"org.xtext.example.mydsl.MyDsl.Transition");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleTransition
entryRuleTransition returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTransitionRule()); }
	iv_ruleTransition=ruleTransition
	{ $current=$iv_ruleTransition.current; }
	EOF;

// Rule Transition
ruleTransition returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='transition'
		{
			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTransitionRule());
					}
				}
				{
					newCompositeNode(grammarAccess.getTransitionAccess().getInputStateCrossReference_1_0());
				}
				ruleEString
				{
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_2='->'
			{
				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getTransitionRule());
						}
					}
					{
						newCompositeNode(grammarAccess.getTransitionAccess().getOutputStateCrossReference_2_1_0());
					}
					ruleEString
					{
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getStateAccess().getState_ImplParserRuleCall_0());
		}
		this_State_Impl_0=ruleState_Impl
		{
			$current = $this_State_Impl_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStateAccess().getFinalStateParserRuleCall_1());
		}
		this_FinalState_1=ruleFinalState
		{
			$current = $this_FinalState_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getStateAccess().getInitialStateParserRuleCall_2());
		}
		this_InitialState_2=ruleInitialState
		{
			$current = $this_InitialState_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleState_Impl
entryRuleState_Impl returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getState_ImplRule()); }
	iv_ruleState_Impl=ruleState_Impl
	{ $current=$iv_ruleState_Impl.current; }
	EOF;

// Rule State_Impl
ruleState_Impl returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getState_ImplAccess().getStateAction_0(),
					$current);
			}
		)
		otherlv_1='state'
		{
			newLeafNode(otherlv_1, grammarAccess.getState_ImplAccess().getStateKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getState_ImplAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getState_ImplRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleEString
entryRuleEString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getEStringRule()); }
	iv_ruleEString=ruleEString
	{ $current=$iv_ruleEString.current.getText(); }
	EOF;

// Rule EString
ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_ID_1=RULE_ID
		{
			$current.merge(this_ID_1);
		}
		{
			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleFinalState
entryRuleFinalState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFinalStateRule()); }
	iv_ruleFinalState=ruleFinalState
	{ $current=$iv_ruleFinalState.current; }
	EOF;

// Rule FinalState
ruleFinalState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getFinalStateAccess().getFinalStateAction_0(),
					$current);
			}
		)
		otherlv_1='final'
		{
			newLeafNode(otherlv_1, grammarAccess.getFinalStateAccess().getFinalKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getFinalStateAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getFinalStateRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleInitialState
entryRuleInitialState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInitialStateRule()); }
	iv_ruleInitialState=ruleInitialState
	{ $current=$iv_ruleInitialState.current; }
	EOF;

// Rule InitialState
ruleInitialState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInitialStateAccess().getInitialStateAction_0(),
					$current);
			}
		)
		otherlv_1='initial'
		{
			newLeafNode(otherlv_1, grammarAccess.getInitialStateAccess().getInitialKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInitialStateAccess().getNameEStringParserRuleCall_2_0());
				}
				lv_name_2_0=ruleEString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInitialStateRule());
					}
					set(
						$current,
						"name",
						lv_name_2_0,
						"org.xtext.example.mydsl.MyDsl.EString");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
