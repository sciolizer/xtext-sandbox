/**
 * generated by Xtext 2.9.1
 */
package org.example.domainmodel.idea;

import com.google.inject.Injector;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.idea.extensions.EcoreGlobalRegistries;
import org.example.domainmodel.idea.DomainmodelStandaloneSetupIdea;

@SuppressWarnings("all")
public class DomainmodelIdeaSetup implements ISetup {
  @Override
  public Injector createInjectorAndDoEMFRegistration() {
    Injector _xblockexpression = null;
    {
      EcoreGlobalRegistries.ensureInitialized();
      DomainmodelStandaloneSetupIdea _domainmodelStandaloneSetupIdea = new DomainmodelStandaloneSetupIdea();
      _xblockexpression = _domainmodelStandaloneSetupIdea.createInjector();
    }
    return _xblockexpression;
  }
}
