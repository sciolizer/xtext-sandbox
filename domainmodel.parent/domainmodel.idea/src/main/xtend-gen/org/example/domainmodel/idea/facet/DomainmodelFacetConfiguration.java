/**
 * generated by Xtext 2.9.1
 */
package org.example.domainmodel.idea.facet;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.components.StoragePathMacros;
import com.intellij.openapi.components.StorageScheme;
import org.eclipse.xtext.idea.facet.AbstractFacetConfiguration;
import org.eclipse.xtext.idea.facet.GeneratorConfigurationState;

@State(name = "org.example.domainmodel.DomainmodelGenerator", storages = { @Storage(id = "default", file = StoragePathMacros.PROJECT_FILE), @Storage(id = "dir", file = (StoragePathMacros.PROJECT_CONFIG_DIR + "/DomainmodelGeneratorConfig.xml"), scheme = StorageScheme.DIRECTORY_BASED) })
@SuppressWarnings("all")
public class DomainmodelFacetConfiguration extends AbstractFacetConfiguration implements PersistentStateComponent<GeneratorConfigurationState> {
}
