package org.example.domainmodel.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import org.example.domainmodel.idea.lang.DomainmodelElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.example.domainmodel.services.DomainmodelGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalDomainmodelParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'{'", "'}'", "'.'", "'import'", "'.*'", "'datatype'", "'entity'", "'extends'", "'many'", "':'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public PsiInternalDomainmodelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalDomainmodelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalDomainmodelParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalDomainmodel.g"; }



    	protected DomainmodelGrammarAccess grammarAccess;

    	protected DomainmodelElementTypeProvider elementTypeProvider;

    	public PsiInternalDomainmodelParser(PsiBuilder builder, TokenStream input, DomainmodelElementTypeProvider elementTypeProvider, DomainmodelGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Domainmodel";
    	}




    // $ANTLR start "entryRuleDomainmodel"
    // PsiInternalDomainmodel.g:52:1: entryRuleDomainmodel returns [Boolean current=false] : iv_ruleDomainmodel= ruleDomainmodel EOF ;
    public final Boolean entryRuleDomainmodel() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDomainmodel = null;


        try {
            // PsiInternalDomainmodel.g:52:53: (iv_ruleDomainmodel= ruleDomainmodel EOF )
            // PsiInternalDomainmodel.g:53:2: iv_ruleDomainmodel= ruleDomainmodel EOF
            {
             markComposite(elementTypeProvider.getDomainmodelElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleDomainmodel=ruleDomainmodel();

            state._fsp--;

             current =iv_ruleDomainmodel; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDomainmodel"


    // $ANTLR start "ruleDomainmodel"
    // PsiInternalDomainmodel.g:59:1: ruleDomainmodel returns [Boolean current=false] : ( (lv_elements_0_0= ruleAbstractElement ) )* ;
    public final Boolean ruleDomainmodel() throws RecognitionException {
        Boolean current = false;

        Boolean lv_elements_0_0 = null;


        try {
            // PsiInternalDomainmodel.g:60:1: ( ( (lv_elements_0_0= ruleAbstractElement ) )* )
            // PsiInternalDomainmodel.g:61:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            {
            // PsiInternalDomainmodel.g:61:2: ( (lv_elements_0_0= ruleAbstractElement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11||LA1_0==15||(LA1_0>=17 && LA1_0<=18)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalDomainmodel.g:62:3: (lv_elements_0_0= ruleAbstractElement )
            	    {
            	    // PsiInternalDomainmodel.g:62:3: (lv_elements_0_0= ruleAbstractElement )
            	    // PsiInternalDomainmodel.g:63:4: lv_elements_0_0= ruleAbstractElement
            	    {

            	    				markComposite(elementTypeProvider.getDomainmodel_ElementsAbstractElementParserRuleCall_0ElementType());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_elements_0_0=ruleAbstractElement();

            	    state._fsp--;


            	    				doneComposite();
            	    				if(!current) {
            	    					associateWithSemanticElement();
            	    					current = true;
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
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDomainmodel"


    // $ANTLR start "entryRulePackageDeclaration"
    // PsiInternalDomainmodel.g:79:1: entryRulePackageDeclaration returns [Boolean current=false] : iv_rulePackageDeclaration= rulePackageDeclaration EOF ;
    public final Boolean entryRulePackageDeclaration() throws RecognitionException {
        Boolean current = false;

        Boolean iv_rulePackageDeclaration = null;


        try {
            // PsiInternalDomainmodel.g:79:60: (iv_rulePackageDeclaration= rulePackageDeclaration EOF )
            // PsiInternalDomainmodel.g:80:2: iv_rulePackageDeclaration= rulePackageDeclaration EOF
            {
             markComposite(elementTypeProvider.getPackageDeclarationElementType()); 
            pushFollow(FOLLOW_1);
            iv_rulePackageDeclaration=rulePackageDeclaration();

            state._fsp--;

             current =iv_rulePackageDeclaration; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePackageDeclaration"


    // $ANTLR start "rulePackageDeclaration"
    // PsiInternalDomainmodel.g:86:1: rulePackageDeclaration returns [Boolean current=false] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) ;
    public final Boolean rulePackageDeclaration() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Boolean lv_name_1_0 = null;

        Boolean lv_elements_3_0 = null;


        try {
            // PsiInternalDomainmodel.g:87:1: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' ) )
            // PsiInternalDomainmodel.g:88:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            {
            // PsiInternalDomainmodel.g:88:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}' )
            // PsiInternalDomainmodel.g:89:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) otherlv_2= '{' ( (lv_elements_3_0= ruleAbstractElement ) )* otherlv_4= '}'
            {

            			markLeaf(elementTypeProvider.getPackageDeclaration_PackageKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalDomainmodel.g:96:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // PsiInternalDomainmodel.g:97:4: (lv_name_1_0= ruleQualifiedName )
            {
            // PsiInternalDomainmodel.g:97:4: (lv_name_1_0= ruleQualifiedName )
            // PsiInternalDomainmodel.g:98:5: lv_name_1_0= ruleQualifiedName
            {

            					markComposite(elementTypeProvider.getPackageDeclaration_NameQualifiedNameParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_5);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getPackageDeclaration_LeftCurlyBracketKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalDomainmodel.g:118:3: ( (lv_elements_3_0= ruleAbstractElement ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==15||(LA2_0>=17 && LA2_0<=18)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PsiInternalDomainmodel.g:119:4: (lv_elements_3_0= ruleAbstractElement )
            	    {
            	    // PsiInternalDomainmodel.g:119:4: (lv_elements_3_0= ruleAbstractElement )
            	    // PsiInternalDomainmodel.g:120:5: lv_elements_3_0= ruleAbstractElement
            	    {

            	    					markComposite(elementTypeProvider.getPackageDeclaration_ElementsAbstractElementParserRuleCall_3_0ElementType());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_elements_3_0=ruleAbstractElement();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getPackageDeclaration_RightCurlyBracketKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			doneLeaf(otherlv_4);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePackageDeclaration"


    // $ANTLR start "entryRuleAbstractElement"
    // PsiInternalDomainmodel.g:144:1: entryRuleAbstractElement returns [Boolean current=false] : iv_ruleAbstractElement= ruleAbstractElement EOF ;
    public final Boolean entryRuleAbstractElement() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAbstractElement = null;


        try {
            // PsiInternalDomainmodel.g:144:57: (iv_ruleAbstractElement= ruleAbstractElement EOF )
            // PsiInternalDomainmodel.g:145:2: iv_ruleAbstractElement= ruleAbstractElement EOF
            {
             markComposite(elementTypeProvider.getAbstractElementElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleAbstractElement=ruleAbstractElement();

            state._fsp--;

             current =iv_ruleAbstractElement; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // PsiInternalDomainmodel.g:151:1: ruleAbstractElement returns [Boolean current=false] : (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport ) ;
    public final Boolean ruleAbstractElement() throws RecognitionException {
        Boolean current = false;

        Boolean this_PackageDeclaration_0 = null;

        Boolean this_Type_1 = null;

        Boolean this_Import_2 = null;


        try {
            // PsiInternalDomainmodel.g:152:1: ( (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport ) )
            // PsiInternalDomainmodel.g:153:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport )
            {
            // PsiInternalDomainmodel.g:153:2: (this_PackageDeclaration_0= rulePackageDeclaration | this_Type_1= ruleType | this_Import_2= ruleImport )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 17:
            case 18:
                {
                alt3=2;
                }
                break;
            case 15:
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
                    // PsiInternalDomainmodel.g:154:3: this_PackageDeclaration_0= rulePackageDeclaration
                    {

                    			markComposite(elementTypeProvider.getAbstractElement_PackageDeclarationParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_PackageDeclaration_0=rulePackageDeclaration();

                    state._fsp--;


                    			current = this_PackageDeclaration_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalDomainmodel.g:163:3: this_Type_1= ruleType
                    {

                    			markComposite(elementTypeProvider.getAbstractElement_TypeParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Type_1=ruleType();

                    state._fsp--;


                    			current = this_Type_1;
                    			doneComposite();
                    		

                    }
                    break;
                case 3 :
                    // PsiInternalDomainmodel.g:172:3: this_Import_2= ruleImport
                    {

                    			markComposite(elementTypeProvider.getAbstractElement_ImportParserRuleCall_2ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Import_2=ruleImport();

                    state._fsp--;


                    			current = this_Import_2;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleQualifiedName"
    // PsiInternalDomainmodel.g:184:1: entryRuleQualifiedName returns [Boolean current=false] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final Boolean entryRuleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedName = null;


        try {
            // PsiInternalDomainmodel.g:184:55: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // PsiInternalDomainmodel.g:185:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             markComposite(elementTypeProvider.getQualifiedNameElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // PsiInternalDomainmodel.g:191:1: ruleQualifiedName returns [Boolean current=false] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final Boolean ruleQualifiedName() throws RecognitionException {
        Boolean current = false;

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

        try {
            // PsiInternalDomainmodel.g:192:1: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // PsiInternalDomainmodel.g:193:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // PsiInternalDomainmodel.g:193:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // PsiInternalDomainmodel.g:194:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {

            			markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_0ElementType());
            		
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			doneLeaf(this_ID_0);
            		
            // PsiInternalDomainmodel.g:201:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // PsiInternalDomainmodel.g:202:4: kw= '.' this_ID_2= RULE_ID
            	    {

            	    				markLeaf(elementTypeProvider.getQualifiedName_FullStopKeyword_1_0ElementType());
            	    			
            	    kw=(Token)match(input,14,FOLLOW_4); 

            	    				doneLeaf(kw);
            	    			

            	    				markLeaf(elementTypeProvider.getQualifiedName_IDTerminalRuleCall_1_1ElementType());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				doneLeaf(this_ID_2);
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleImport"
    // PsiInternalDomainmodel.g:221:1: entryRuleImport returns [Boolean current=false] : iv_ruleImport= ruleImport EOF ;
    public final Boolean entryRuleImport() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleImport = null;


        try {
            // PsiInternalDomainmodel.g:221:48: (iv_ruleImport= ruleImport EOF )
            // PsiInternalDomainmodel.g:222:2: iv_ruleImport= ruleImport EOF
            {
             markComposite(elementTypeProvider.getImportElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // PsiInternalDomainmodel.g:228:1: ruleImport returns [Boolean current=false] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final Boolean ruleImport() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Boolean lv_importedNamespace_1_0 = null;


        try {
            // PsiInternalDomainmodel.g:229:1: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // PsiInternalDomainmodel.g:230:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // PsiInternalDomainmodel.g:230:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // PsiInternalDomainmodel.g:231:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {

            			markLeaf(elementTypeProvider.getImport_ImportKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalDomainmodel.g:238:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // PsiInternalDomainmodel.g:239:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // PsiInternalDomainmodel.g:239:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // PsiInternalDomainmodel.g:240:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					markComposite(elementTypeProvider.getImport_ImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0ElementType());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // PsiInternalDomainmodel.g:257:1: entryRuleQualifiedNameWithWildcard returns [Boolean current=false] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final Boolean entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleQualifiedNameWithWildcard = null;


        try {
            // PsiInternalDomainmodel.g:257:67: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // PsiInternalDomainmodel.g:258:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             markComposite(elementTypeProvider.getQualifiedNameWithWildcardElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // PsiInternalDomainmodel.g:264:1: ruleQualifiedNameWithWildcard returns [Boolean current=false] : ( ruleQualifiedName (kw= '.*' )? ) ;
    public final Boolean ruleQualifiedNameWithWildcard() throws RecognitionException {
        Boolean current = false;

        Token kw=null;

        try {
            // PsiInternalDomainmodel.g:265:1: ( ( ruleQualifiedName (kw= '.*' )? ) )
            // PsiInternalDomainmodel.g:266:2: ( ruleQualifiedName (kw= '.*' )? )
            {
            // PsiInternalDomainmodel.g:266:2: ( ruleQualifiedName (kw= '.*' )? )
            // PsiInternalDomainmodel.g:267:3: ruleQualifiedName (kw= '.*' )?
            {

            			markComposite(elementTypeProvider.getQualifiedNameWithWildcard_QualifiedNameParserRuleCall_0ElementType());
            		
            pushFollow(FOLLOW_8);
            ruleQualifiedName();

            state._fsp--;


            			doneComposite();
            		
            // PsiInternalDomainmodel.g:274:3: (kw= '.*' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // PsiInternalDomainmodel.g:275:4: kw= '.*'
                    {

                    				markLeaf(elementTypeProvider.getQualifiedNameWithWildcard_FullStopAsteriskKeyword_1ElementType());
                    			
                    kw=(Token)match(input,16,FOLLOW_2); 

                    				doneLeaf(kw);
                    			

                    }
                    break;

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleType"
    // PsiInternalDomainmodel.g:287:1: entryRuleType returns [Boolean current=false] : iv_ruleType= ruleType EOF ;
    public final Boolean entryRuleType() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleType = null;


        try {
            // PsiInternalDomainmodel.g:287:46: (iv_ruleType= ruleType EOF )
            // PsiInternalDomainmodel.g:288:2: iv_ruleType= ruleType EOF
            {
             markComposite(elementTypeProvider.getTypeElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // PsiInternalDomainmodel.g:294:1: ruleType returns [Boolean current=false] : (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) ;
    public final Boolean ruleType() throws RecognitionException {
        Boolean current = false;

        Boolean this_DataType_0 = null;

        Boolean this_Entity_1 = null;


        try {
            // PsiInternalDomainmodel.g:295:1: ( (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity ) )
            // PsiInternalDomainmodel.g:296:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            {
            // PsiInternalDomainmodel.g:296:2: (this_DataType_0= ruleDataType | this_Entity_1= ruleEntity )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // PsiInternalDomainmodel.g:297:3: this_DataType_0= ruleDataType
                    {

                    			markComposite(elementTypeProvider.getType_DataTypeParserRuleCall_0ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_DataType_0=ruleDataType();

                    state._fsp--;


                    			current = this_DataType_0;
                    			doneComposite();
                    		

                    }
                    break;
                case 2 :
                    // PsiInternalDomainmodel.g:306:3: this_Entity_1= ruleEntity
                    {

                    			markComposite(elementTypeProvider.getType_EntityParserRuleCall_1ElementType());
                    		
                    pushFollow(FOLLOW_2);
                    this_Entity_1=ruleEntity();

                    state._fsp--;


                    			current = this_Entity_1;
                    			doneComposite();
                    		

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleDataType"
    // PsiInternalDomainmodel.g:318:1: entryRuleDataType returns [Boolean current=false] : iv_ruleDataType= ruleDataType EOF ;
    public final Boolean entryRuleDataType() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDataType = null;


        try {
            // PsiInternalDomainmodel.g:318:50: (iv_ruleDataType= ruleDataType EOF )
            // PsiInternalDomainmodel.g:319:2: iv_ruleDataType= ruleDataType EOF
            {
             markComposite(elementTypeProvider.getDataTypeElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleDataType=ruleDataType();

            state._fsp--;

             current =iv_ruleDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataType"


    // $ANTLR start "ruleDataType"
    // PsiInternalDomainmodel.g:325:1: ruleDataType returns [Boolean current=false] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final Boolean ruleDataType() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;

        try {
            // PsiInternalDomainmodel.g:326:1: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) ) )
            // PsiInternalDomainmodel.g:327:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // PsiInternalDomainmodel.g:327:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) )
            // PsiInternalDomainmodel.g:328:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) )
            {

            			markLeaf(elementTypeProvider.getDataType_DatatypeKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,17,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalDomainmodel.g:335:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalDomainmodel.g:336:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalDomainmodel.g:336:4: (lv_name_1_0= RULE_ID )
            // PsiInternalDomainmodel.g:337:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getDataType_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataType"


    // $ANTLR start "entryRuleEntity"
    // PsiInternalDomainmodel.g:356:1: entryRuleEntity returns [Boolean current=false] : iv_ruleEntity= ruleEntity EOF ;
    public final Boolean entryRuleEntity() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleEntity = null;


        try {
            // PsiInternalDomainmodel.g:356:48: (iv_ruleEntity= ruleEntity EOF )
            // PsiInternalDomainmodel.g:357:2: iv_ruleEntity= ruleEntity EOF
            {
             markComposite(elementTypeProvider.getEntityElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // PsiInternalDomainmodel.g:363:1: ruleEntity returns [Boolean current=false] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) ;
    public final Boolean ruleEntity() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Boolean lv_features_5_0 = null;


        try {
            // PsiInternalDomainmodel.g:364:1: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' ) )
            // PsiInternalDomainmodel.g:365:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            {
            // PsiInternalDomainmodel.g:365:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}' )
            // PsiInternalDomainmodel.g:366:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )? otherlv_4= '{' ( (lv_features_5_0= ruleFeature ) )* otherlv_6= '}'
            {

            			markLeaf(elementTypeProvider.getEntity_EntityKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,18,FOLLOW_4); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalDomainmodel.g:373:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalDomainmodel.g:374:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalDomainmodel.g:374:4: (lv_name_1_0= RULE_ID )
            // PsiInternalDomainmodel.g:375:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getEntity_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }

            // PsiInternalDomainmodel.g:390:3: (otherlv_2= 'extends' ( ( ruleQualifiedName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // PsiInternalDomainmodel.g:391:4: otherlv_2= 'extends' ( ( ruleQualifiedName ) )
                    {

                    				markLeaf(elementTypeProvider.getEntity_ExtendsKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,19,FOLLOW_4); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalDomainmodel.g:398:4: ( ( ruleQualifiedName ) )
                    // PsiInternalDomainmodel.g:399:5: ( ruleQualifiedName )
                    {
                    // PsiInternalDomainmodel.g:399:5: ( ruleQualifiedName )
                    // PsiInternalDomainmodel.g:400:6: ruleQualifiedName
                    {

                    						if (!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						markComposite(elementTypeProvider.getEntity_SuperTypeEntityCrossReference_2_1_0ElementType());
                    					
                    pushFollow(FOLLOW_5);
                    ruleQualifiedName();

                    state._fsp--;


                    						doneComposite();
                    					

                    }


                    }


                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getEntity_LeftCurlyBracketKeyword_3ElementType());
            		
            otherlv_4=(Token)match(input,12,FOLLOW_10); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalDomainmodel.g:423:3: ( (lv_features_5_0= ruleFeature ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID||LA8_0==20) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // PsiInternalDomainmodel.g:424:4: (lv_features_5_0= ruleFeature )
            	    {
            	    // PsiInternalDomainmodel.g:424:4: (lv_features_5_0= ruleFeature )
            	    // PsiInternalDomainmodel.g:425:5: lv_features_5_0= ruleFeature
            	    {

            	    					markComposite(elementTypeProvider.getEntity_FeaturesFeatureParserRuleCall_4_0ElementType());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_features_5_0=ruleFeature();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getEntity_RightCurlyBracketKeyword_5ElementType());
            		
            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			doneLeaf(otherlv_6);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleFeature"
    // PsiInternalDomainmodel.g:449:1: entryRuleFeature returns [Boolean current=false] : iv_ruleFeature= ruleFeature EOF ;
    public final Boolean entryRuleFeature() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFeature = null;


        try {
            // PsiInternalDomainmodel.g:449:49: (iv_ruleFeature= ruleFeature EOF )
            // PsiInternalDomainmodel.g:450:2: iv_ruleFeature= ruleFeature EOF
            {
             markComposite(elementTypeProvider.getFeatureElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleFeature=ruleFeature();

            state._fsp--;

             current =iv_ruleFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFeature"


    // $ANTLR start "ruleFeature"
    // PsiInternalDomainmodel.g:456:1: ruleFeature returns [Boolean current=false] : ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) ;
    public final Boolean ruleFeature() throws RecognitionException {
        Boolean current = false;

        Token lv_many_0_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

        try {
            // PsiInternalDomainmodel.g:457:1: ( ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) ) )
            // PsiInternalDomainmodel.g:458:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            {
            // PsiInternalDomainmodel.g:458:2: ( ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) ) )
            // PsiInternalDomainmodel.g:459:3: ( (lv_many_0_0= 'many' ) )? ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( ( ruleQualifiedName ) )
            {
            // PsiInternalDomainmodel.g:459:3: ( (lv_many_0_0= 'many' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // PsiInternalDomainmodel.g:460:4: (lv_many_0_0= 'many' )
                    {
                    // PsiInternalDomainmodel.g:460:4: (lv_many_0_0= 'many' )
                    // PsiInternalDomainmodel.g:461:5: lv_many_0_0= 'many'
                    {

                    					markLeaf(elementTypeProvider.getFeature_ManyManyKeyword_0_0ElementType());
                    				
                    lv_many_0_0=(Token)match(input,20,FOLLOW_4); 

                    					doneLeaf(lv_many_0_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }
                    break;

            }

            // PsiInternalDomainmodel.g:476:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalDomainmodel.g:477:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalDomainmodel.g:477:4: (lv_name_1_0= RULE_ID )
            // PsiInternalDomainmodel.g:478:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getFeature_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getFeature_ColonKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,21,FOLLOW_4); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalDomainmodel.g:500:3: ( ( ruleQualifiedName ) )
            // PsiInternalDomainmodel.g:501:4: ( ruleQualifiedName )
            {
            // PsiInternalDomainmodel.g:501:4: ( ruleQualifiedName )
            // PsiInternalDomainmodel.g:502:5: ruleQualifiedName
            {

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					markComposite(elementTypeProvider.getFeature_TypeTypeCrossReference_3_0ElementType());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					doneComposite();
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFeature"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000068802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000006A800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000081000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000102010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});

}