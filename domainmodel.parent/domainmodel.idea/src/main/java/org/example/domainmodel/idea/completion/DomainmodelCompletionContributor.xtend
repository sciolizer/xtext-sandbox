/*
 * generated by Xtext 2.9.1
 */
package org.example.domainmodel.idea.completion

import org.eclipse.xtext.idea.lang.AbstractXtextLanguage
import org.example.domainmodel.idea.lang.DomainmodelLanguage

class DomainmodelCompletionContributor extends AbstractDomainmodelCompletionContributor {
	new() {
		this(DomainmodelLanguage.INSTANCE)
	}
	
	new(AbstractXtextLanguage lang) {
		super(lang)
		//custom rules here
	}
}
