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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'FSM'", "'transition'", "'->'", "'state'", "'final'", "'initial'"
    };
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=4;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int RULE_INT=6;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



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




    // $ANTLR start "entryRuleFSM"
    // InternalMyDsl.g:64:1: entryRuleFSM returns [EObject current=null] : iv_ruleFSM= ruleFSM EOF ;
    public final EObject entryRuleFSM() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFSM = null;


        try {
            // InternalMyDsl.g:64:44: (iv_ruleFSM= ruleFSM EOF )
            // InternalMyDsl.g:65:2: iv_ruleFSM= ruleFSM EOF
            {
             newCompositeNode(grammarAccess.getFSMRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFSM=ruleFSM();

            state._fsp--;

             current =iv_ruleFSM; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFSM"


    // $ANTLR start "ruleFSM"
    // InternalMyDsl.g:71:1: ruleFSM returns [EObject current=null] : ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) ( (lv_state_3_0= ruleInitialState ) ) ( (lv_state_4_0= ruleFinalState ) ) ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )* ) ;
    public final EObject ruleFSM() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_state_3_0 = null;

        EObject lv_state_4_0 = null;

        EObject lv_state_5_0 = null;

        EObject lv_transition_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) ( (lv_state_3_0= ruleInitialState ) ) ( (lv_state_4_0= ruleFinalState ) ) ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )* ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) ( (lv_state_3_0= ruleInitialState ) ) ( (lv_state_4_0= ruleFinalState ) ) ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )* )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) ( (lv_state_3_0= ruleInitialState ) ) ( (lv_state_4_0= ruleFinalState ) ) ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )* )
            // InternalMyDsl.g:79:3: () otherlv_1= 'FSM' ( (lv_name_2_0= ruleEString ) ) ( (lv_state_3_0= ruleInitialState ) ) ( (lv_state_4_0= ruleFinalState ) ) ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )*
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFSMAccess().getFSMAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFSMAccess().getFSMKeyword_1());
            		
            // InternalMyDsl.g:90:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:91:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:92:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:109:3: ( (lv_state_3_0= ruleInitialState ) )
            // InternalMyDsl.g:110:4: (lv_state_3_0= ruleInitialState )
            {
            // InternalMyDsl.g:110:4: (lv_state_3_0= ruleInitialState )
            // InternalMyDsl.g:111:5: lv_state_3_0= ruleInitialState
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getStateInitialStateParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_5);
            lv_state_3_0=ruleInitialState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					add(
            						current,
            						"state",
            						lv_state_3_0,
            						"org.xtext.example.mydsl.MyDsl.InitialState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:128:3: ( (lv_state_4_0= ruleFinalState ) )
            // InternalMyDsl.g:129:4: (lv_state_4_0= ruleFinalState )
            {
            // InternalMyDsl.g:129:4: (lv_state_4_0= ruleFinalState )
            // InternalMyDsl.g:130:5: lv_state_4_0= ruleFinalState
            {

            					newCompositeNode(grammarAccess.getFSMAccess().getStateFinalStateParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_state_4_0=ruleFinalState();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFSMRule());
            					}
            					add(
            						current,
            						"state",
            						lv_state_4_0,
            						"org.xtext.example.mydsl.MyDsl.FinalState");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:147:3: ( ( (lv_state_5_0= ruleState ) ) | ( (lv_transition_6_0= ruleTransition ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=16)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==12) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:148:4: ( (lv_state_5_0= ruleState ) )
            	    {
            	    // InternalMyDsl.g:148:4: ( (lv_state_5_0= ruleState ) )
            	    // InternalMyDsl.g:149:5: (lv_state_5_0= ruleState )
            	    {
            	    // InternalMyDsl.g:149:5: (lv_state_5_0= ruleState )
            	    // InternalMyDsl.g:150:6: lv_state_5_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getFSMAccess().getStateStateParserRuleCall_5_0_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_state_5_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFSMRule());
            	    						}
            	    						add(
            	    							current,
            	    							"state",
            	    							lv_state_5_0,
            	    							"org.xtext.example.mydsl.MyDsl.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:168:4: ( (lv_transition_6_0= ruleTransition ) )
            	    {
            	    // InternalMyDsl.g:168:4: ( (lv_transition_6_0= ruleTransition ) )
            	    // InternalMyDsl.g:169:5: (lv_transition_6_0= ruleTransition )
            	    {
            	    // InternalMyDsl.g:169:5: (lv_transition_6_0= ruleTransition )
            	    // InternalMyDsl.g:170:6: lv_transition_6_0= ruleTransition
            	    {

            	    						newCompositeNode(grammarAccess.getFSMAccess().getTransitionTransitionParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_transition_6_0=ruleTransition();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFSMRule());
            	    						}
            	    						add(
            	    							current,
            	    							"transition",
            	    							lv_transition_6_0,
            	    							"org.xtext.example.mydsl.MyDsl.Transition");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFSM"


    // $ANTLR start "entryRuleTransition"
    // InternalMyDsl.g:192:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // InternalMyDsl.g:192:51: (iv_ruleTransition= ruleTransition EOF )
            // InternalMyDsl.g:193:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // InternalMyDsl.g:199:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' ( ( ruleEString ) ) (otherlv_2= '->' ( ( ruleEString ) ) )? ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:205:2: ( (otherlv_0= 'transition' ( ( ruleEString ) ) (otherlv_2= '->' ( ( ruleEString ) ) )? ) )
            // InternalMyDsl.g:206:2: (otherlv_0= 'transition' ( ( ruleEString ) ) (otherlv_2= '->' ( ( ruleEString ) ) )? )
            {
            // InternalMyDsl.g:206:2: (otherlv_0= 'transition' ( ( ruleEString ) ) (otherlv_2= '->' ( ( ruleEString ) ) )? )
            // InternalMyDsl.g:207:3: otherlv_0= 'transition' ( ( ruleEString ) ) (otherlv_2= '->' ( ( ruleEString ) ) )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
            		
            // InternalMyDsl.g:211:3: ( ( ruleEString ) )
            // InternalMyDsl.g:212:4: ( ruleEString )
            {
            // InternalMyDsl.g:212:4: ( ruleEString )
            // InternalMyDsl.g:213:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTransitionRule());
            					}
            				

            					newCompositeNode(grammarAccess.getTransitionAccess().getInputStateCrossReference_1_0());
            				
            pushFollow(FOLLOW_7);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:227:3: (otherlv_2= '->' ( ( ruleEString ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:228:4: otherlv_2= '->' ( ( ruleEString ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getHyphenMinusGreaterThanSignKeyword_2_0());
                    			
                    // InternalMyDsl.g:232:4: ( ( ruleEString ) )
                    // InternalMyDsl.g:233:5: ( ruleEString )
                    {
                    // InternalMyDsl.g:233:5: ( ruleEString )
                    // InternalMyDsl.g:234:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTransitionRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getTransitionAccess().getOutputStateCrossReference_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRuleState"
    // InternalMyDsl.g:253:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalMyDsl.g:253:46: (iv_ruleState= ruleState EOF )
            // InternalMyDsl.g:254:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalMyDsl.g:260:1: ruleState returns [EObject current=null] : (this_State_Impl_0= ruleState_Impl | this_FinalState_1= ruleFinalState | this_InitialState_2= ruleInitialState ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        EObject this_State_Impl_0 = null;

        EObject this_FinalState_1 = null;

        EObject this_InitialState_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:266:2: ( (this_State_Impl_0= ruleState_Impl | this_FinalState_1= ruleFinalState | this_InitialState_2= ruleInitialState ) )
            // InternalMyDsl.g:267:2: (this_State_Impl_0= ruleState_Impl | this_FinalState_1= ruleFinalState | this_InitialState_2= ruleInitialState )
            {
            // InternalMyDsl.g:267:2: (this_State_Impl_0= ruleState_Impl | this_FinalState_1= ruleFinalState | this_InitialState_2= ruleInitialState )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:268:3: this_State_Impl_0= ruleState_Impl
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getState_ImplParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_State_Impl_0=ruleState_Impl();

                    state._fsp--;


                    			current = this_State_Impl_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:277:3: this_FinalState_1= ruleFinalState
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getFinalStateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FinalState_1=ruleFinalState();

                    state._fsp--;


                    			current = this_FinalState_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:286:3: this_InitialState_2= ruleInitialState
                    {

                    			newCompositeNode(grammarAccess.getStateAccess().getInitialStateParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_InitialState_2=ruleInitialState();

                    state._fsp--;


                    			current = this_InitialState_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRuleState_Impl"
    // InternalMyDsl.g:298:1: entryRuleState_Impl returns [EObject current=null] : iv_ruleState_Impl= ruleState_Impl EOF ;
    public final EObject entryRuleState_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState_Impl = null;


        try {
            // InternalMyDsl.g:298:51: (iv_ruleState_Impl= ruleState_Impl EOF )
            // InternalMyDsl.g:299:2: iv_ruleState_Impl= ruleState_Impl EOF
            {
             newCompositeNode(grammarAccess.getState_ImplRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState_Impl=ruleState_Impl();

            state._fsp--;

             current =iv_ruleState_Impl; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleState_Impl"


    // $ANTLR start "ruleState_Impl"
    // InternalMyDsl.g:305:1: ruleState_Impl returns [EObject current=null] : ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleState_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:311:2: ( ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:312:2: ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:312:2: ( () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:313:3: () otherlv_1= 'state' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:313:3: ()
            // InternalMyDsl.g:314:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getState_ImplAccess().getStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getState_ImplAccess().getStateKeyword_1());
            		
            // InternalMyDsl.g:324:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:325:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:325:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:326:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getState_ImplAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getState_ImplRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleState_Impl"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:347:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:347:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:348:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:354:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:360:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:361:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:361:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:362:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:370:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleFinalState"
    // InternalMyDsl.g:381:1: entryRuleFinalState returns [EObject current=null] : iv_ruleFinalState= ruleFinalState EOF ;
    public final EObject entryRuleFinalState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFinalState = null;


        try {
            // InternalMyDsl.g:381:51: (iv_ruleFinalState= ruleFinalState EOF )
            // InternalMyDsl.g:382:2: iv_ruleFinalState= ruleFinalState EOF
            {
             newCompositeNode(grammarAccess.getFinalStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFinalState=ruleFinalState();

            state._fsp--;

             current =iv_ruleFinalState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFinalState"


    // $ANTLR start "ruleFinalState"
    // InternalMyDsl.g:388:1: ruleFinalState returns [EObject current=null] : ( () otherlv_1= 'final' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleFinalState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:394:2: ( ( () otherlv_1= 'final' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:395:2: ( () otherlv_1= 'final' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:395:2: ( () otherlv_1= 'final' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:396:3: () otherlv_1= 'final' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:396:3: ()
            // InternalMyDsl.g:397:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getFinalStateAccess().getFinalStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getFinalStateAccess().getFinalKeyword_1());
            		
            // InternalMyDsl.g:407:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:408:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:408:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:409:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getFinalStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFinalStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFinalState"


    // $ANTLR start "entryRuleInitialState"
    // InternalMyDsl.g:430:1: entryRuleInitialState returns [EObject current=null] : iv_ruleInitialState= ruleInitialState EOF ;
    public final EObject entryRuleInitialState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitialState = null;


        try {
            // InternalMyDsl.g:430:53: (iv_ruleInitialState= ruleInitialState EOF )
            // InternalMyDsl.g:431:2: iv_ruleInitialState= ruleInitialState EOF
            {
             newCompositeNode(grammarAccess.getInitialStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitialState=ruleInitialState();

            state._fsp--;

             current =iv_ruleInitialState; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitialState"


    // $ANTLR start "ruleInitialState"
    // InternalMyDsl.g:437:1: ruleInitialState returns [EObject current=null] : ( () otherlv_1= 'initial' ( (lv_name_2_0= ruleEString ) ) ) ;
    public final EObject ruleInitialState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:443:2: ( ( () otherlv_1= 'initial' ( (lv_name_2_0= ruleEString ) ) ) )
            // InternalMyDsl.g:444:2: ( () otherlv_1= 'initial' ( (lv_name_2_0= ruleEString ) ) )
            {
            // InternalMyDsl.g:444:2: ( () otherlv_1= 'initial' ( (lv_name_2_0= ruleEString ) ) )
            // InternalMyDsl.g:445:3: () otherlv_1= 'initial' ( (lv_name_2_0= ruleEString ) )
            {
            // InternalMyDsl.g:445:3: ()
            // InternalMyDsl.g:446:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getInitialStateAccess().getInitialStateAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getInitialStateAccess().getInitialKeyword_1());
            		
            // InternalMyDsl.g:456:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:457:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:457:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:458:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getInitialStateAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getInitialStateRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitialState"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000001D002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002002L});

}