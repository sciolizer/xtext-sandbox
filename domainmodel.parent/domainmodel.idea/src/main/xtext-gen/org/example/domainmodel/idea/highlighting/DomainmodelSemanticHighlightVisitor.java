/*
 * generated by Xtext 2.9.1
 */
package org.example.domainmodel.idea.highlighting;

import org.eclipse.xtext.idea.highlighting.SemanticHighlightVisitor;
import org.example.domainmodel.idea.lang.DomainmodelLanguage;

public class DomainmodelSemanticHighlightVisitor extends SemanticHighlightVisitor {
	public DomainmodelSemanticHighlightVisitor() {
		DomainmodelLanguage.INSTANCE.injectMembers(this);
	}
}
