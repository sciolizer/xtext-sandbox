/*
 * generated by Xtext 2.9.1
 */
package org.example.domainmodel.idea

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.example.domainmodel.DomainmodelRuntimeModule
import org.example.domainmodel.DomainmodelStandaloneSetupGenerated

class DomainmodelStandaloneSetupIdea extends DomainmodelStandaloneSetupGenerated {
	override createInjector() {
		val runtimeModule = new DomainmodelRuntimeModule()
		val ideaModule = new DomainmodelIdeaModule()
		val mergedModule = Modules2.mixin(runtimeModule, ideaModule)
		return Guice.createInjector(mergedModule)
	}
}