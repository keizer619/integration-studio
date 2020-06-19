/**
 * Generated with Acceleo
 */
package org.wso2.developerstudio.eclipse.gmf.esb.providers;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.context.PropertiesEditingContext;

import org.eclipse.emf.eef.runtime.impl.utils.EEFUtils;

import org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider;

import org.eclipse.emf.eef.runtime.providers.impl.PropertiesEditingProviderImpl;

import org.eclipse.jface.viewers.IFilter;

import org.wso2.developerstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.developerstudio.eclipse.gmf.esb.InboundEndpoint;

import org.wso2.developerstudio.eclipse.gmf.esb.components.InboundEndpointPropertiesEditionComponent;

/**
 * 
 * 
 */
public class InboundEndpointPropertiesEditionProvider extends PropertiesEditingProviderImpl {

    /**
     * Constructor without provider for super types.
     */
    public InboundEndpointPropertiesEditionProvider() {
        super();
    }

    /**
     * Constructor with providers for super types.
     * 
     * @param superProviders providers to use for super types.
     */
    public InboundEndpointPropertiesEditionProvider(List<PropertiesEditingProvider> superProviders) {
        super(superProviders);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext)
     * 
     */
    public boolean provides(PropertiesEditingContext editingContext) {
        return (editingContext.getEObject() instanceof InboundEndpoint)
                && (EsbPackage.Literals.INBOUND_ENDPOINT == editingContext.getEObject().eClass());
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
     *      java.lang.String)
     * 
     */
    public boolean provides(PropertiesEditingContext editingContext, String part) {
        return (editingContext.getEObject() instanceof InboundEndpoint)
                && (InboundEndpointPropertiesEditionComponent.BASE_PART.equals(part));
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
     *      java.lang.Class)
     * 
     */
    @SuppressWarnings("rawtypes")
    public boolean provides(PropertiesEditingContext editingContext, java.lang.Class refinement) {
        return (editingContext.getEObject() instanceof InboundEndpoint)
                && (refinement == InboundEndpointPropertiesEditionComponent.class);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#provides(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
     *      java.lang.String, java.lang.Class)
     * 
     */
    @SuppressWarnings("rawtypes")
    public boolean provides(PropertiesEditingContext editingContext, String part, java.lang.Class refinement) {
        return (editingContext.getEObject() instanceof InboundEndpoint)
                && ((InboundEndpointPropertiesEditionComponent.BASE_PART.equals(part)
                        && refinement == InboundEndpointPropertiesEditionComponent.class));
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
     *      java.lang.String)
     * 
     */
    public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext,
            String mode) {
        if (editingContext.getEObject() instanceof InboundEndpoint) {
            return new InboundEndpointPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
        }
        return super.getPropertiesEditingComponent(editingContext, mode);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
     *      java.lang.String, java.lang.String)
     * 
     */
    public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext,
            String mode, String part) {
        if (editingContext.getEObject() instanceof InboundEndpoint) {
            if (InboundEndpointPropertiesEditionComponent.BASE_PART.equals(part))
                return new InboundEndpointPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
        }
        return super.getPropertiesEditingComponent(editingContext, mode, part);
    }

    /**
     * {@inheritDoc}
     * 
     * @see org.eclipse.emf.eef.runtime.providers.PropertiesEditingProvider#getPropertiesEditingComponent(org.eclipse.emf.eef.runtime.context.PropertiesEditingContext,
     *      java.lang.String, java.lang.String, java.lang.Class)
     */
    @SuppressWarnings("rawtypes")
    public IPropertiesEditionComponent getPropertiesEditingComponent(PropertiesEditingContext editingContext,
            String mode, String part, java.lang.Class refinement) {
        if (editingContext.getEObject() instanceof InboundEndpoint) {
            if (InboundEndpointPropertiesEditionComponent.BASE_PART.equals(part)
                    && refinement == InboundEndpointPropertiesEditionComponent.class)
                return new InboundEndpointPropertiesEditionComponent(editingContext, editingContext.getEObject(), mode);
        }
        return super.getPropertiesEditingComponent(editingContext, mode, part, refinement);
    }

    /**
     * Provides the filter used by the plugin.xml to assign part forms.
     */
    public static class EditionFilter implements IFilter {

        /**
         * {@inheritDoc}
         * 
         * @see org.eclipse.jface.viewers.IFilter#select(java.lang.Object)
         */
        public boolean select(Object toTest) {
            EObject eObj = EEFUtils.resolveSemanticObject(toTest);
            return eObj != null && EsbPackage.Literals.INBOUND_ENDPOINT == eObj.eClass();
        }

    }

}
