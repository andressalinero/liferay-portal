/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.kernel.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Portlet}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Portlet
 * @generated
 */
@ProviderType
public class PortletWrapper implements Portlet, ModelWrapper<Portlet> {
	public PortletWrapper(Portlet portlet) {
		_portlet = portlet;
	}

	@Override
	public Class<?> getModelClass() {
		return Portlet.class;
	}

	@Override
	public String getModelClassName() {
		return Portlet.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mvccVersion", getMvccVersion());
		attributes.put("id", getId());
		attributes.put("companyId", getCompanyId());
		attributes.put("portletId", getPortletId());
		attributes.put("roles", getRoles());
		attributes.put("active", isActive());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mvccVersion = (Long)attributes.get("mvccVersion");

		if (mvccVersion != null) {
			setMvccVersion(mvccVersion);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		String portletId = (String)attributes.get("portletId");

		if (portletId != null) {
			setPortletId(portletId);
		}

		String roles = (String)attributes.get("roles");

		if (roles != null) {
			setRoles(roles);
		}

		Boolean active = (Boolean)attributes.get("active");

		if (active != null) {
			setActive(active);
		}
	}

	/**
	* Adds an application type.
	*
	* @param applicationType an application type
	*/
	@Override
	public void addApplicationType(
		com.liferay.portal.kernel.application.type.ApplicationType applicationType) {
		_portlet.addApplicationType(applicationType);
	}

	/**
	* Adds a processing event.
	*/
	@Override
	public void addProcessingEvent(
		com.liferay.portal.kernel.xml.QName processingEvent) {
		_portlet.addProcessingEvent(processingEvent);
	}

	/**
	* Adds a public render parameter.
	*
	* @param publicRenderParameter a public render parameter
	*/
	@Override
	public void addPublicRenderParameter(
		PublicRenderParameter publicRenderParameter) {
		_portlet.addPublicRenderParameter(publicRenderParameter);
	}

	/**
	* Adds a publishing event.
	*/
	@Override
	public void addPublishingEvent(
		com.liferay.portal.kernel.xml.QName publishingEvent) {
		_portlet.addPublishingEvent(publishingEvent);
	}

	/**
	* Adds a scheduler entry.
	*/
	@Override
	public void addSchedulerEntry(
		com.liferay.portal.kernel.scheduler.SchedulerEntry schedulerEntry) {
		_portlet.addSchedulerEntry(schedulerEntry);
	}

	@Override
	public Object clone() {
		return new PortletWrapper((Portlet)_portlet.clone());
	}

	@Override
	public int compareTo(Portlet portlet) {
		return _portlet.compareTo(portlet);
	}

	/**
	* Returns the action timeout of the portlet.
	*
	* @return the action timeout of the portlet
	*/
	@Override
	public int getActionTimeout() {
		return _portlet.getActionTimeout();
	}

	/**
	* Returns <code>true</code> if an action URL for this portlet should cause
	* an auto redirect.
	*
	* @return <code>true</code> if an action URL for this portlet should cause
	an auto redirect
	*/
	@Override
	public boolean getActionURLRedirect() {
		return _portlet.getActionURLRedirect();
	}

	/**
	* Returns the active of this portlet.
	*
	* @return the active of this portlet
	*/
	@Override
	public boolean getActive() {
		return _portlet.getActive();
	}

	/**
	* Returns <code>true</code> if default resources for the portlet are added
	* to a page.
	*
	* @return <code>true</code> if default resources for the portlet are added
	to a page
	*/
	@Override
	public boolean getAddDefaultResource() {
		return _portlet.getAddDefaultResource();
	}

	/**
	* Returns <code>true</code> if the portlet can be displayed via Ajax.
	*
	* @return <code>true</code> if the portlet can be displayed via Ajax
	*/
	@Override
	public boolean getAjaxable() {
		return _portlet.getAjaxable();
	}

	/**
	* Returns the portlet modes of the portlet.
	*
	* @return the portlet modes of the portlet
	*/
	@Override
	public java.util.Set<String> getAllPortletModes() {
		return _portlet.getAllPortletModes();
	}

	/**
	* Returns the window states of the portlet.
	*
	* @return the window states of the portlet
	*/
	@Override
	public java.util.Set<String> getAllWindowStates() {
		return _portlet.getAllWindowStates();
	}

	/**
	* Returns the application types of the portlet.
	*
	* @return the application types of the portlet
	*/
	@Override
	public java.util.Set<com.liferay.portal.kernel.application.type.ApplicationType> getApplicationTypes() {
		return _portlet.getApplicationTypes();
	}

	/**
	* Returns the names of the classes that represent asset types associated
	* with the portlet.
	*
	* @return the names of the classes that represent asset types associated
	with the portlet
	*/
	@Override
	public java.util.List<String> getAssetRendererFactoryClasses() {
		return _portlet.getAssetRendererFactoryClasses();
	}

	/**
	* Returns the asset type instances of the portlet.
	*
	* @return the asset type instances of the portlet
	*/
	@Override
	public java.util.List<com.liferay.asset.kernel.model.AssetRendererFactory<?>> getAssetRendererFactoryInstances() {
		return _portlet.getAssetRendererFactoryInstances();
	}

	/**
	* Returns the names of the classes that represent atom collection adapters
	* associated with the portlet.
	*
	* @return the names of the classes that represent atom collection adapters
	associated with the portlet
	*/
	@Override
	public java.util.List<String> getAtomCollectionAdapterClasses() {
		return _portlet.getAtomCollectionAdapterClasses();
	}

	/**
	* Returns the atom collection adapter instances of the portlet.
	*
	* @return the atom collection adapter instances of the portlet
	*/
	@Override
	public java.util.List<com.liferay.portal.kernel.atom.AtomCollectionAdapter<?>> getAtomCollectionAdapterInstances() {
		return _portlet.getAtomCollectionAdapterInstances();
	}

	/**
	* Returns the names of the parameters that will be automatically propagated
	* through the portlet.
	*
	* @return the names of the parameters that will be automatically propagated
	through the portlet
	*/
	@Override
	public java.util.Set<String> getAutopropagatedParameters() {
		return _portlet.getAutopropagatedParameters();
	}

	/**
	* Returns <code>true</code> if the portlet is found in a WAR file.
	*
	* @param portletId the cloned instance portlet ID
	* @return a cloned instance of the portlet
	*/
	@Override
	public Portlet getClonedInstance(String portletId) {
		return _portlet.getClonedInstance(portletId);
	}

	/**
	* Returns the company ID of this portlet.
	*
	* @return the company ID of this portlet
	*/
	@Override
	public long getCompanyId() {
		return _portlet.getCompanyId();
	}

	/**
	* Returns the configuration action class of the portlet.
	*
	* @return the configuration action class of the portlet
	*/
	@Override
	public String getConfigurationActionClass() {
		return _portlet.getConfigurationActionClass();
	}

	/**
	* Returns the configuration action instance of the portlet.
	*
	* @return the configuration action instance of the portlet
	*/
	@Override
	public com.liferay.portal.kernel.portlet.ConfigurationAction getConfigurationActionInstance() {
		return _portlet.getConfigurationActionInstance();
	}

	/**
	* Returns the servlet context name of the portlet.
	*
	* @return the servlet context name of the portlet
	*/
	@Override
	public String getContextName() {
		return _portlet.getContextName();
	}

	/**
	* Returns the servlet context path of the portlet.
	*
	* @return the servlet context path of the portlet
	*/
	@Override
	public String getContextPath() {
		return _portlet.getContextPath();
	}

	/**
	* Returns the name of the category of the Control Panel where the portlet
	* will be shown.
	*
	* @return the name of the category of the Control Panel where the portlet
	will be shown
	*/
	@Override
	public String getControlPanelEntryCategory() {
		return _portlet.getControlPanelEntryCategory();
	}

	/**
	* Returns the name of the class that will control when the portlet will be
	* shown in the Control Panel.
	*
	* @return the name of the class that will control when the portlet will be
	shown in the Control Panel
	*/
	@Override
	public String getControlPanelEntryClass() {
		return _portlet.getControlPanelEntryClass();
	}

	/**
	* Returns an instance of the class that will control when the portlet will
	* be shown in the Control Panel.
	*
	* @return the instance of the class that will control when the portlet will
	be shown in the Control Panel
	*/
	@Override
	public com.liferay.portal.kernel.portlet.ControlPanelEntry getControlPanelEntryInstance() {
		return _portlet.getControlPanelEntryInstance();
	}

	/**
	* Returns the relative weight of the portlet with respect to the other
	* portlets in the same category of the Control Panel.
	*
	* @return the relative weight of the portlet with respect to the other
	portlets in the same category of the Control Panel
	*/
	@Override
	public double getControlPanelEntryWeight() {
		return _portlet.getControlPanelEntryWeight();
	}

	/**
	* Returns the name of the CSS class that will be injected in the DIV that
	* wraps this portlet.
	*
	* @return the name of the CSS class that will be injected in the DIV that
	wraps this portlet
	*/
	@Override
	public String getCssClassWrapper() {
		return _portlet.getCssClassWrapper();
	}

	/**
	* Returns the names of the classes that represent custom attribute displays
	* associated with the portlet.
	*
	* @return the names of the classes that represent asset types associated
	with the portlet
	*/
	@Override
	public java.util.List<String> getCustomAttributesDisplayClasses() {
		return _portlet.getCustomAttributesDisplayClasses();
	}

	/**
	* Returns the custom attribute display instances of the portlet.
	*
	* @return the custom attribute display instances of the portlet
	*/
	@Override
	public java.util.List<com.liferay.expando.kernel.model.CustomAttributesDisplay> getCustomAttributesDisplayInstances() {
		return _portlet.getCustomAttributesDisplayInstances();
	}

	/**
	* Get the default plugin settings of the portlet.
	*
	* @return the plugin settings
	*/
	@Override
	public PluginSetting getDefaultPluginSetting() {
		return _portlet.getDefaultPluginSetting();
	}

	/**
	* Returns the default preferences of the portlet.
	*
	* @return the default preferences of the portlet
	*/
	@Override
	public String getDefaultPreferences() {
		return _portlet.getDefaultPreferences();
	}

	/**
	* Returns the display name of the portlet.
	*
	* @return the display name of the portlet
	*/
	@Override
	public String getDisplayName() {
		return _portlet.getDisplayName();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _portlet.getExpandoBridge();
	}

	/**
	* Returns expiration cache of the portlet.
	*
	* @return expiration cache of the portlet
	*/
	@Override
	public Integer getExpCache() {
		return _portlet.getExpCache();
	}

	/**
	* Returns the Facebook integration method of the portlet.
	*
	* @return the Facebook integration method of the portlet
	* @deprecated As of 7.0.0, with no direct replacement
	*/
	@Deprecated
	@Override
	public String getFacebookIntegration() {
		return _portlet.getFacebookIntegration();
	}

	/**
	* Returns a list of CSS files that will be referenced from the page's
	* footer relative to the portal's context path.
	*
	* @return a list of CSS files that will be referenced from the page's
	footer relative to the portal's context path
	*/
	@Override
	public java.util.List<String> getFooterPortalCss() {
		return _portlet.getFooterPortalCss();
	}

	/**
	* Returns a list of JavaScript files that will be referenced from the
	* page's footer relative to the portal's context path.
	*
	* @return a list of JavaScript files that will be referenced from the
	page's footer relative to the portal's context path
	*/
	@Override
	public java.util.List<String> getFooterPortalJavaScript() {
		return _portlet.getFooterPortalJavaScript();
	}

	/**
	* Returns a list of CSS files that will be referenced from the page's
	* footer relative to the portlet's context path.
	*
	* @return a list of CSS files that will be referenced from the page's
	footer relative to the portlet's context path
	*/
	@Override
	public java.util.List<String> getFooterPortletCss() {
		return _portlet.getFooterPortletCss();
	}

	/**
	* Returns a list of JavaScript files that will be referenced from the
	* page's footer relative to the portlet's context path.
	*
	* @return a list of JavaScript files that will be referenced from the
	page's footer relative to the portlet's context path
	*/
	@Override
	public java.util.List<String> getFooterPortletJavaScript() {
		return _portlet.getFooterPortletJavaScript();
	}

	/**
	* Returns the name of the friendly URL mapper class of the portlet.
	*
	* @return the name of the friendly URL mapper class of the portlet
	*/
	@Override
	public String getFriendlyURLMapperClass() {
		return _portlet.getFriendlyURLMapperClass();
	}

	/**
	* Returns the friendly URL mapper instance of the portlet.
	*
	* @return the friendly URL mapper instance of the portlet
	*/
	@Override
	public com.liferay.portal.kernel.portlet.FriendlyURLMapper getFriendlyURLMapperInstance() {
		return _portlet.getFriendlyURLMapperInstance();
	}

	/**
	* Returns the name of the friendly URL mapping of the portlet.
	*
	* @return the name of the friendly URL mapping of the portlet
	*/
	@Override
	public String getFriendlyURLMapping() {
		return _portlet.getFriendlyURLMapping();
	}

	/**
	* Returns the class loader resource path to the friendly URL routes of the
	* portlet.
	*
	* @return the class loader resource path to the friendly URL routes of the
	portlet
	*/
	@Override
	public String getFriendlyURLRoutes() {
		return _portlet.getFriendlyURLRoutes();
	}

	/**
	* Returns a list of CSS files that will be referenced from the page's
	* header relative to the portal's context path.
	*
	* @return a list of CSS files that will be referenced from the page's
	header relative to the portal's context path
	*/
	@Override
	public java.util.List<String> getHeaderPortalCss() {
		return _portlet.getHeaderPortalCss();
	}

	/**
	* Returns a list of JavaScript files that will be referenced from the
	* page's header relative to the portal's context path.
	*
	* @return a list of JavaScript files that will be referenced from the
	page's header relative to the portal's context path
	*/
	@Override
	public java.util.List<String> getHeaderPortalJavaScript() {
		return _portlet.getHeaderPortalJavaScript();
	}

	/**
	* Returns a list of CSS files that will be referenced from the page's
	* header relative to the portlet's context path.
	*
	* @return a list of CSS files that will be referenced from the page's
	header relative to the portlet's context path
	*/
	@Override
	public java.util.List<String> getHeaderPortletCss() {
		return _portlet.getHeaderPortletCss();
	}

	/**
	* Returns a list of JavaScript files that will be referenced from the
	* page's header relative to the portlet's context path.
	*
	* @return a list of JavaScript files that will be referenced from the
	page's header relative to the portlet's context path
	*/
	@Override
	public java.util.List<String> getHeaderPortletJavaScript() {
		return _portlet.getHeaderPortletJavaScript();
	}

	/**
	* Returns the icon of the portlet.
	*
	* @return the icon of the portlet
	*/
	@Override
	public String getIcon() {
		return _portlet.getIcon();
	}

	/**
	* Returns the ID of this portlet.
	*
	* @return the ID of this portlet
	*/
	@Override
	public long getId() {
		return _portlet.getId();
	}

	/**
	* Returns <code>true</code> to include the portlet and make it available to
	* be made active.
	*
	* @return <code>true</code> to include the portlet and make it available to
	be made active
	*/
	@Override
	public boolean getInclude() {
		return _portlet.getInclude();
	}

	/**
	* Returns the names of the classes that represent indexers associated with
	* the portlet.
	*
	* @return the names of the classes that represent indexers associated with
	the portlet
	*/
	@Override
	public java.util.List<String> getIndexerClasses() {
		return _portlet.getIndexerClasses();
	}

	/**
	* Returns the indexer instances of the portlet.
	*
	* @return the indexer instances of the portlet
	*/
	@Override
	public java.util.List<com.liferay.portal.kernel.search.Indexer<?>> getIndexerInstances() {
		return _portlet.getIndexerInstances();
	}

	/**
	* Returns the init parameters of the portlet.
	*
	* @return init parameters of the portlet
	*/
	@Override
	public Map<String, String> getInitParams() {
		return _portlet.getInitParams();
	}

	/**
	* Returns <code>true</code> if the portlet can be added multiple times to a
	* layout.
	*
	* @return <code>true</code> if the portlet can be added multiple times to a
	layout
	*/
	@Override
	public boolean getInstanceable() {
		return _portlet.getInstanceable();
	}

	/**
	* Returns the instance ID of the portlet.
	*
	* @return the instance ID of the portlet
	*/
	@Override
	public String getInstanceId() {
		return _portlet.getInstanceId();
	}

	/**
	* Returns <code>true</code> to allow the portlet to be cached within the
	* layout.
	*
	* @return <code>true</code> if the portlet can be cached within the layout
	*/
	@Override
	public boolean getLayoutCacheable() {
		return _portlet.getLayoutCacheable();
	}

	/**
	* Returns <code>true</code> if the portlet goes into the maximized state
	* when the user goes into the edit mode.
	*
	* @return <code>true</code> if the portlet goes into the maximized state
	when the user goes into the edit mode
	*/
	@Override
	public boolean getMaximizeEdit() {
		return _portlet.getMaximizeEdit();
	}

	/**
	* Returns <code>true</code> if the portlet goes into the maximized state
	* when the user goes into the help mode.
	*
	* @return <code>true</code> if the portlet goes into the maximized state
	when the user goes into the help mode
	*/
	@Override
	public boolean getMaximizeHelp() {
		return _portlet.getMaximizeHelp();
	}

	/**
	* Returns the maximum size of buffered bytes before storing occurs.
	*
	* @return the maximum size of buffered bytes before storing occurs
	*/
	@Override
	public int getMultipartFileSizeThreshold() {
		return _portlet.getMultipartFileSizeThreshold();
	}

	/**
	* Returns the directory for storing uploaded files.
	*
	* @return the directory for storing uploaded files
	*/
	@Override
	public String getMultipartLocation() {
		return _portlet.getMultipartLocation();
	}

	/**
	* Returns the maximum number of bytes permitted for an uploaded file.
	*
	* @return the maximum number of bytes permitted for an uploaded file
	*/
	@Override
	public long getMultipartMaxFileSize() {
		return _portlet.getMultipartMaxFileSize();
	}

	/**
	* Returns the maximum number of bytes permitted for a multipart request.
	*
	* @return the maximum number of bytes permitted for a multipart request
	*/
	@Override
	public long getMultipartMaxRequestSize() {
		return _portlet.getMultipartMaxRequestSize();
	}

	/**
	* Returns the mvcc version of this portlet.
	*
	* @return the mvcc version of this portlet
	*/
	@Override
	public long getMvccVersion() {
		return _portlet.getMvccVersion();
	}

	/**
	* Returns the name of the open search class of the portlet.
	*
	* @return the name of the open search class of the portlet
	*/
	@Override
	public String getOpenSearchClass() {
		return _portlet.getOpenSearchClass();
	}

	/**
	* Returns the indexer instance of the portlet.
	*
	* @return the indexer instance of the portlet
	*/
	@Override
	public com.liferay.portal.kernel.search.OpenSearch getOpenSearchInstance() {
		return _portlet.getOpenSearchInstance();
	}

	/**
	* Returns the parent struts path of the portlet.
	*
	* @return the parent struts path of the portlet.
	*/
	@Override
	public String getParentStrutsPath() {
		return _portlet.getParentStrutsPath();
	}

	/**
	* Returns the name of the permission propagator class of the portlet.
	*
	* @return the name of the permission propagator class of the portlet
	*/
	@Override
	public String getPermissionPropagatorClass() {
		return _portlet.getPermissionPropagatorClass();
	}

	/**
	* Returns the permission propagator instance of the portlet.
	*
	* @return the permission propagator instance of the portlet
	*/
	@Override
	public com.liferay.portal.kernel.security.permission.PermissionPropagator getPermissionPropagatorInstance() {
		return _portlet.getPermissionPropagatorInstance();
	}

	/**
	* Returns the plugin ID of the portlet.
	*
	* @return the plugin ID of the portlet
	*/
	@Override
	public String getPluginId() {
		return _portlet.getPluginId();
	}

	/**
	* Returns this portlet's plugin package.
	*
	* @return this portlet's plugin package
	*/
	@Override
	public com.liferay.portal.kernel.plugin.PluginPackage getPluginPackage() {
		return _portlet.getPluginPackage();
	}

	/**
	* Returns the plugin type of the portlet.
	*
	* @return the plugin type of the portlet
	*/
	@Override
	public String getPluginType() {
		return _portlet.getPluginType();
	}

	/**
	* Returns the name of the poller processor class of the portlet.
	*
	* @return the name of the poller processor class of the portlet
	*/
	@Override
	public String getPollerProcessorClass() {
		return _portlet.getPollerProcessorClass();
	}

	/**
	* Returns the poller processor instance of the portlet.
	*
	* @return the poller processor instance of the portlet
	*/
	@Override
	public com.liferay.portal.kernel.poller.PollerProcessor getPollerProcessorInstance() {
		return _portlet.getPollerProcessorInstance();
	}

	/**
	* Returns the name of the POP message listener class of the portlet.
	*
	* @return the name of the POP message listener class of the portlet
	*/
	@Override
	public String getPopMessageListenerClass() {
		return _portlet.getPopMessageListenerClass();
	}

	/**
	* Returns the POP message listener instance of the portlet.
	*
	* @return the POP message listener instance of the portlet
	*/
	@Override
	public com.liferay.portal.kernel.pop.MessageListener getPopMessageListenerInstance() {
		return _portlet.getPopMessageListenerInstance();
	}

	/**
	* Returns <code>true</code> if the portlet goes into the pop up state when
	* the user goes into the print mode.
	*
	* @return <code>true</code> if the portlet goes into the pop up state when
	the user goes into the print mode
	*/
	@Override
	public boolean getPopUpPrint() {
		return _portlet.getPopUpPrint();
	}

	/**
	* Returns this portlet's application.
	*
	* @return this portlet's application
	*/
	@Override
	public PortletApp getPortletApp() {
		return _portlet.getPortletApp();
	}

	/**
	* Returns the name of the portlet class of the portlet.
	*
	* @return the name of the portlet class of the portlet
	*/
	@Override
	public String getPortletClass() {
		return _portlet.getPortletClass();
	}

	/**
	* Returns the name of the portlet data handler class of the portlet.
	*
	* @return the name of the portlet data handler class of the portlet
	*/
	@Override
	public String getPortletDataHandlerClass() {
		return _portlet.getPortletDataHandlerClass();
	}

	/**
	* Returns the portlet data handler instance of the portlet.
	*
	* @return the portlet data handler instance of the portlet
	*/
	@Override
	public com.liferay.exportimport.kernel.lar.PortletDataHandler getPortletDataHandlerInstance() {
		return _portlet.getPortletDataHandlerInstance();
	}

	/**
	* Returns the filters of the portlet.
	*
	* @return filters of the portlet
	*/
	@Override
	public Map<String, PortletFilter> getPortletFilters() {
		return _portlet.getPortletFilters();
	}

	/**
	* Returns the portlet ID of this portlet.
	*
	* @return the portlet ID of this portlet
	*/
	@Override
	public String getPortletId() {
		return _portlet.getPortletId();
	}

	/**
	* Returns the portlet info of the portlet.
	*
	* @return portlet info of the portlet
	*/
	@Override
	public PortletInfo getPortletInfo() {
		return _portlet.getPortletInfo();
	}

	/**
	* Returns the name of the portlet layout listener class of the portlet.
	*
	* @return the name of the portlet layout listener class of the portlet
	*/
	@Override
	public String getPortletLayoutListenerClass() {
		return _portlet.getPortletLayoutListenerClass();
	}

	/**
	* Returns the portlet layout listener instance of the portlet.
	*
	* @return the portlet layout listener instance of the portlet
	*/
	@Override
	public com.liferay.portal.kernel.portlet.PortletLayoutListener getPortletLayoutListenerInstance() {
		return _portlet.getPortletLayoutListenerInstance();
	}

	/**
	* Returns the portlet modes of the portlet.
	*
	* @return portlet modes of the portlet
	*/
	@Override
	public Map<String, java.util.Set<String>> getPortletModes() {
		return _portlet.getPortletModes();
	}

	/**
	* Returns the name of the portlet.
	*
	* @return the display name of the portlet
	*/
	@Override
	public String getPortletName() {
		return _portlet.getPortletName();
	}

	/**
	* Returns the name of the portlet URL class of the portlet.
	*
	* @return the name of the portlet URL class of the portlet
	*/
	@Override
	public String getPortletURLClass() {
		return _portlet.getPortletURLClass();
	}

	/**
	* Returns <code>true</code> if preferences are shared across the entire
	* company.
	*
	* @return <code>true</code> if preferences are shared across the entire
	company
	*/
	@Override
	public boolean getPreferencesCompanyWide() {
		return _portlet.getPreferencesCompanyWide();
	}

	/**
	* Returns <code>true</code> if preferences are owned by the group when the
	* portlet is shown in a group layout. Returns <code>false</code> if
	* preferences are owned by the user at all times.
	*
	* @return <code>true</code> if preferences are owned by the group when the
	portlet is shown in a group layout; <code>false</code> if
	preferences are owned by the user at all times.
	*/
	@Override
	public boolean getPreferencesOwnedByGroup() {
		return _portlet.getPreferencesOwnedByGroup();
	}

	/**
	* Returns <code>true</code> if preferences are unique per layout.
	*
	* @return <code>true</code> if preferences are unique per layout
	*/
	@Override
	public boolean getPreferencesUniquePerLayout() {
		return _portlet.getPreferencesUniquePerLayout();
	}

	/**
	* Returns the name of the preferences validator class of the portlet.
	*
	* @return the name of the preferences validator class of the portlet
	*/
	@Override
	public String getPreferencesValidator() {
		return _portlet.getPreferencesValidator();
	}

	/**
	* Returns the primary key of this portlet.
	*
	* @return the primary key of this portlet
	*/
	@Override
	public long getPrimaryKey() {
		return _portlet.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _portlet.getPrimaryKeyObj();
	}

	/**
	* Returns <code>true</code> if the portlet does not share request
	* attributes with the portal or portlets from another WAR.
	*
	* @return <code>true</code> if the portlet does not share request
	attributes with the portal or portlets from another WAR
	*/
	@Override
	public boolean getPrivateRequestAttributes() {
		return _portlet.getPrivateRequestAttributes();
	}

	/**
	* Returns <code>true</code> if the portlet does not share session
	* attributes with the portal.
	*
	* @return <code>true</code> if the portlet does not share session
	attributes with the portal
	*/
	@Override
	public boolean getPrivateSessionAttributes() {
		return _portlet.getPrivateSessionAttributes();
	}

	/**
	* Returns the processing event from a namespace URI and a local part.
	*
	* @param uri the namespace URI
	* @param localPart the local part
	* @return the processing event from a namespace URI and a local part
	*/
	@Override
	public com.liferay.portal.kernel.xml.QName getProcessingEvent(String uri,
		String localPart) {
		return _portlet.getProcessingEvent(uri, localPart);
	}

	/**
	* Returns the processing events of the portlet.
	*
	* @return the processing events of the portlet
	*/
	@Override
	public java.util.Set<com.liferay.portal.kernel.xml.QName> getProcessingEvents() {
		return _portlet.getProcessingEvents();
	}

	/**
	* Returns the public render parameter from an identifier.
	*
	* @param identifier the identifier
	* @return the public render parameter from an identifier
	*/
	@Override
	public PublicRenderParameter getPublicRenderParameter(String identifier) {
		return _portlet.getPublicRenderParameter(identifier);
	}

	/**
	* Returns the spublic render parameter from a namespace URI and a local
	* part.
	*
	* @param uri the namespace URI
	* @param localPart the local part
	* @return the spublic render parameter from a namespace URI and a local
	part
	*/
	@Override
	public PublicRenderParameter getPublicRenderParameter(String uri,
		String localPart) {
		return _portlet.getPublicRenderParameter(uri, localPart);
	}

	/**
	* Returns the public render parameters of the portlet.
	*
	* @return the public render parameters of the portlet
	*/
	@Override
	public java.util.Set<PublicRenderParameter> getPublicRenderParameters() {
		return _portlet.getPublicRenderParameters();
	}

	/**
	* Returns the publishing events of the portlet.
	*
	* @return the publishing events of the portlet
	*/
	@Override
	public java.util.Set<com.liferay.portal.kernel.xml.QName> getPublishingEvents() {
		return _portlet.getPublishingEvents();
	}

	/**
	* Returns <code>true</code> if the portlet is ready to be used.
	*
	* @return <code>true</code> if the portlet is ready to be used
	*/
	@Override
	public boolean getReady() {
		return _portlet.getReady();
	}

	/**
	* Returns the render timeout of the portlet.
	*
	* @return the render timeout of the portlet
	*/
	@Override
	public int getRenderTimeout() {
		return _portlet.getRenderTimeout();
	}

	/**
	* Returns the render weight of the portlet.
	*
	* @return the render weight of the portlet
	*/
	@Override
	public int getRenderWeight() {
		return _portlet.getRenderWeight();
	}

	/**
	* Returns the resource bundle of the portlet.
	*
	* @return resource bundle of the portlet
	*/
	@Override
	public String getResourceBundle() {
		return _portlet.getResourceBundle();
	}

	/**
	* Returns <code>true</code> if the portlet restores to the current view
	* from the maximized state.
	*
	* @return <code>true</code> if the portlet restores to the current view
	from the maximized state
	*/
	@Override
	public boolean getRestoreCurrentView() {
		return _portlet.getRestoreCurrentView();
	}

	/**
	* Returns the role mappers of the portlet.
	*
	* @return role mappers of the portlet
	*/
	@Override
	public Map<String, String> getRoleMappers() {
		return _portlet.getRoleMappers();
	}

	/**
	* Returns the roles of this portlet.
	*
	* @return the roles of this portlet
	*/
	@Override
	public String getRoles() {
		return _portlet.getRoles();
	}

	/**
	* Returns an array of required roles of the portlet.
	*
	* @return an array of required roles of the portlet
	*/
	@Override
	public String[] getRolesArray() {
		return _portlet.getRolesArray();
	}

	/**
	* Returns the root portlet of this portlet instance.
	*
	* @return the root portlet of this portlet instance
	*/
	@Override
	public Portlet getRootPortlet() {
		return _portlet.getRootPortlet();
	}

	/**
	* Returns the root portlet ID of the portlet.
	*
	* @return the root portlet ID of the portlet
	*/
	@Override
	public String getRootPortletId() {
		return _portlet.getRootPortletId();
	}

	/**
	* Returns the scheduler entries of the portlet.
	*
	* @return the scheduler entries of the portlet
	*/
	@Override
	public java.util.List<com.liferay.portal.kernel.scheduler.SchedulerEntry> getSchedulerEntries() {
		return _portlet.getSchedulerEntries();
	}

	/**
	* Returns <code>true</code> if the portlet supports scoping of data.
	*
	* @return <code>true</code> if the portlet supports scoping of data
	*/
	@Override
	public boolean getScopeable() {
		return _portlet.getScopeable();
	}

	/**
	* Returns <code>true</code> if users are shown that they do not have access
	* to the portlet.
	*
	* @return <code>true</code> if users are shown that they do not have access
	to the portlet
	*/
	@Override
	public boolean getShowPortletAccessDenied() {
		return _portlet.getShowPortletAccessDenied();
	}

	/**
	* Returns <code>true</code> if users are shown that the portlet is
	* inactive.
	*
	* @return <code>true</code> if users are shown that the portlet is inactive
	*/
	@Override
	public boolean getShowPortletInactive() {
		return _portlet.getShowPortletInactive();
	}

	/**
	* Returns <code>true</code> if the portlet uses Single Page Application.
	*
	* @return <code>true</code> if the portlet uses Single Page Application
	*/
	@Override
	public boolean getSinglePageApplication() {
		return _portlet.getSinglePageApplication();
	}

	/**
	* Returns the names of the classes that represent social activity
	* interpreters associated with the portlet.
	*
	* @return the names of the classes that represent social activity
	interpreters associated with the portlet
	*/
	@Override
	public java.util.List<String> getSocialActivityInterpreterClasses() {
		return _portlet.getSocialActivityInterpreterClasses();
	}

	/**
	* Returns the social activity interpreter instances of the portlet.
	*
	* @return the social activity interpreter instances of the portlet
	*/
	@Override
	public java.util.List<com.liferay.social.kernel.model.SocialActivityInterpreter> getSocialActivityInterpreterInstances() {
		return _portlet.getSocialActivityInterpreterInstances();
	}

	/**
	* Returns the name of the social request interpreter class of the portlet.
	*
	* @return the name of the social request interpreter class of the portlet
	*/
	@Override
	public String getSocialRequestInterpreterClass() {
		return _portlet.getSocialRequestInterpreterClass();
	}

	/**
	* Returns the name of the social request interpreter instance of the
	* portlet.
	*
	* @return the name of the social request interpreter instance of the
	portlet
	*/
	@Override
	public com.liferay.social.kernel.model.SocialRequestInterpreter getSocialRequestInterpreterInstance() {
		return _portlet.getSocialRequestInterpreterInstance();
	}

	/**
	* Returns the names of the classes that represent staged model data
	* handlers associated with the portlet.
	*
	* @return the names of the classes that represent staged model data
	handlers associated with the portlet
	*/
	@Override
	public java.util.List<String> getStagedModelDataHandlerClasses() {
		return _portlet.getStagedModelDataHandlerClasses();
	}

	/**
	* Returns the staged model data handler instances of the portlet.
	*
	* @return the staged model data handler instances of the portlet
	*/
	@Override
	public java.util.List<com.liferay.exportimport.kernel.lar.StagedModelDataHandler<?>> getStagedModelDataHandlerInstances() {
		return _portlet.getStagedModelDataHandlerInstances();
	}

	/**
	* Returns <code>true</code> if the portlet is a static portlet that is
	* cannot be moved.
	*
	* @return <code>true</code> if the portlet is a static portlet that is
	cannot be moved
	*/
	@Override
	public boolean getStatic() {
		return _portlet.getStatic();
	}

	/**
	* Returns <code>true</code> if the portlet is a static portlet at the end
	* of a list of portlets.
	*
	* @return <code>true</code> if the portlet is a static portlet at the end
	of a list of portlets
	*/
	@Override
	public boolean getStaticEnd() {
		return _portlet.getStaticEnd();
	}

	/**
	* Returns the path for static resources served by this portlet.
	*
	* @return the path for static resources served by this portlet
	*/
	@Override
	public String getStaticResourcePath() {
		return _portlet.getStaticResourcePath();
	}

	/**
	* Returns <code>true</code> if the portlet is a static portlet at the start
	* of a list of portlets.
	*
	* @return <code>true</code> if the portlet is a static portlet at the start
	of a list of portlets
	*/
	@Override
	public boolean getStaticStart() {
		return _portlet.getStaticStart();
	}

	/**
	* Returns the struts path of the portlet.
	*
	* @return the struts path of the portlet
	*/
	@Override
	public String getStrutsPath() {
		return _portlet.getStrutsPath();
	}

	/**
	* Returns the supported locales of the portlet.
	*
	* @return the supported locales of the portlet
	*/
	@Override
	public java.util.Set<String> getSupportedLocales() {
		return _portlet.getSupportedLocales();
	}

	/**
	* Returns <code>true</code> if the portlet is a system portlet that a user
	* cannot manually add to their page.
	*
	* @return <code>true</code> if the portlet is a system portlet that a user
	cannot manually add to their page
	*/
	@Override
	public boolean getSystem() {
		return _portlet.getSystem();
	}

	/**
	* Returns the name of the template handler class of the portlet.
	*
	* @return the name of the template handler class of the portlet
	*/
	@Override
	public String getTemplateHandlerClass() {
		return _portlet.getTemplateHandlerClass();
	}

	/**
	* Returns the template handler instance of the portlet.
	*
	* @return the template handler instance of the portlet
	*/
	@Override
	public com.liferay.portal.kernel.template.TemplateHandler getTemplateHandlerInstance() {
		return _portlet.getTemplateHandlerInstance();
	}

	/**
	* Returns the timestamp of the portlet.
	*
	* @return the timestamp of the portlet
	*/
	@Override
	public long getTimestamp() {
		return _portlet.getTimestamp();
	}

	/**
	* Returns the names of the classes that represent trash handlers associated
	* with the portlet.
	*
	* @return the names of the classes that represent trash handlers associated
	with the portlet
	*/
	@Override
	public java.util.List<String> getTrashHandlerClasses() {
		return _portlet.getTrashHandlerClasses();
	}

	/**
	* Returns the trash handler instances of the portlet.
	*
	* @return the trash handler instances of the portlet
	*/
	@Override
	public java.util.List<com.liferay.portal.kernel.trash.TrashHandler> getTrashHandlerInstances() {
		return _portlet.getTrashHandlerInstances();
	}

	/**
	* Returns <code>true</code> if the portlet is an undeployed portlet.
	*
	* @return <code>true</code> if the portlet is a placeholder of an
	undeployed portlet
	*/
	@Override
	public boolean getUndeployedPortlet() {
		return _portlet.getUndeployedPortlet();
	}

	/**
	* Returns the unlinked roles of the portlet.
	*
	* @return unlinked roles of the portlet
	*/
	@Override
	public java.util.Set<String> getUnlinkedRoles() {
		return _portlet.getUnlinkedRoles();
	}

	/**
	* Returns the name of the URL encoder class of the portlet.
	*
	* @return the name of the URL encoder class of the portlet
	*/
	@Override
	public String getURLEncoderClass() {
		return _portlet.getURLEncoderClass();
	}

	/**
	* Returns the URL encoder instance of the portlet.
	*
	* @return the URL encoder instance of the portlet
	*/
	@Override
	public com.liferay.portal.kernel.servlet.URLEncoder getURLEncoderInstance() {
		return _portlet.getURLEncoderInstance();
	}

	/**
	* Returns <code>true</code> if the portlet uses the default template.
	*
	* @return <code>true</code> if the portlet uses the default template
	*/
	@Override
	public boolean getUseDefaultTemplate() {
		return _portlet.getUseDefaultTemplate();
	}

	/**
	* Returns the user ID of the portlet. This only applies when the portlet is
	* added by a user in a customizable layout.
	*
	* @return the user ID of the portlet
	*/
	@Override
	public long getUserId() {
		return _portlet.getUserId();
	}

	/**
	* Returns the class loader resource path to the use notification
	* definitions of the portlet.
	*
	* @return the class loader resource path to the use notification
	definitions of the portlet
	*/
	@Override
	public String getUserNotificationDefinitions() {
		return _portlet.getUserNotificationDefinitions();
	}

	/**
	* Returns the names of the classes that represent user notification
	* handlers associated with the portlet.
	*
	* @return the names of the classes that represent user notification
	handlers associated with the portlet
	*/
	@Override
	public java.util.List<String> getUserNotificationHandlerClasses() {
		return _portlet.getUserNotificationHandlerClasses();
	}

	/**
	* Returns the user notification handler instances of the portlet.
	*
	* @return the user notification handler instances of the portlet
	*/
	@Override
	public java.util.List<com.liferay.portal.kernel.notifications.UserNotificationHandler> getUserNotificationHandlerInstances() {
		return _portlet.getUserNotificationHandlerInstances();
	}

	/**
	* Returns the user principal strategy of the portlet.
	*
	* @return the user principal strategy of the portlet
	*/
	@Override
	public String getUserPrincipalStrategy() {
		return _portlet.getUserPrincipalStrategy();
	}

	/**
	* Returns the virtual path of the portlet.
	*
	* @return the virtual path of the portlet
	*/
	@Override
	public String getVirtualPath() {
		return _portlet.getVirtualPath();
	}

	/**
	* Returns the name of the WebDAV storage class of the portlet.
	*
	* @return the name of the WebDAV storage class of the portlet
	*/
	@Override
	public String getWebDAVStorageClass() {
		return _portlet.getWebDAVStorageClass();
	}

	/**
	* Returns the name of the WebDAV storage instance of the portlet.
	*
	* @return the name of the WebDAV storage instance of the portlet
	*/
	@Override
	public com.liferay.portal.kernel.webdav.WebDAVStorage getWebDAVStorageInstance() {
		return _portlet.getWebDAVStorageInstance();
	}

	/**
	* Returns the name of the WebDAV storage token of the portlet.
	*
	* @return the name of the WebDAV storage token of the portlet
	*/
	@Override
	public String getWebDAVStorageToken() {
		return _portlet.getWebDAVStorageToken();
	}

	/**
	* Returns the window states of the portlet.
	*
	* @return window states of the portlet
	*/
	@Override
	public Map<String, java.util.Set<String>> getWindowStates() {
		return _portlet.getWindowStates();
	}

	/**
	* Returns the names of the classes that represent workflow handlers
	* associated with the portlet.
	*
	* @return the names of the classes that represent workflow handlers
	associated with the portlet
	*/
	@Override
	public java.util.List<String> getWorkflowHandlerClasses() {
		return _portlet.getWorkflowHandlerClasses();
	}

	/**
	* Returns the workflow handler instances of the portlet.
	*
	* @return the workflow handler instances of the portlet
	*/
	@Override
	public java.util.List<com.liferay.portal.kernel.workflow.WorkflowHandler<?>> getWorkflowHandlerInstances() {
		return _portlet.getWorkflowHandlerInstances();
	}

	/**
	* Returns the name of the XML-RPC method class of the portlet.
	*
	* @return the name of the XML-RPC method class of the portlet
	*/
	@Override
	public String getXmlRpcMethodClass() {
		return _portlet.getXmlRpcMethodClass();
	}

	/**
	* Returns the name of the XML-RPC method instance of the portlet.
	*
	* @return the name of the XML-RPC method instance of the portlet
	*/
	@Override
	public com.liferay.portal.kernel.xmlrpc.Method getXmlRpcMethodInstance() {
		return _portlet.getXmlRpcMethodInstance();
	}

	/**
	* Returns <code>true</code> if the user has the permission to add the
	* portlet to a layout.
	*
	* @param userId the primary key of the user
	* @return <code>true</code> if the user has the permission to add the
	portlet to a layout
	*/
	@Override
	public boolean hasAddPortletPermission(long userId) {
		return _portlet.hasAddPortletPermission(userId);
	}

	@Override
	public boolean hasFooterPortalCss() {
		return _portlet.hasFooterPortalCss();
	}

	@Override
	public boolean hasFooterPortalJavaScript() {
		return _portlet.hasFooterPortalJavaScript();
	}

	@Override
	public boolean hasFooterPortletCss() {
		return _portlet.hasFooterPortletCss();
	}

	@Override
	public boolean hasFooterPortletJavaScript() {
		return _portlet.hasFooterPortletJavaScript();
	}

	@Override
	public int hashCode() {
		return _portlet.hashCode();
	}

	@Override
	public boolean hasHeaderPortalCss() {
		return _portlet.hasHeaderPortalCss();
	}

	@Override
	public boolean hasHeaderPortalJavaScript() {
		return _portlet.hasHeaderPortalJavaScript();
	}

	@Override
	public boolean hasHeaderPortletCss() {
		return _portlet.hasHeaderPortletCss();
	}

	@Override
	public boolean hasHeaderPortletJavaScript() {
		return _portlet.hasHeaderPortletJavaScript();
	}

	/**
	* Returns <code>true</code> if the portlet supports more than one mime
	* type.
	*
	* @return <code>true</code> if the portlet supports more than one mime type
	*/
	@Override
	public boolean hasMultipleMimeTypes() {
		return _portlet.hasMultipleMimeTypes();
	}

	/**
	* Returns <code>true</code> if the portlet supports the specified mime type
	* and portlet mode.
	*
	* @param mimeType the mime type
	* @param portletMode the portlet mode
	* @return <code>true</code> if the portlet supports the specified mime type
	and portlet mode
	*/
	@Override
	public boolean hasPortletMode(String mimeType,
		javax.portlet.PortletMode portletMode) {
		return _portlet.hasPortletMode(mimeType, portletMode);
	}

	/**
	* Returns <code>true</code> if the portlet has a role with the specified
	* name.
	*
	* @param roleName the role name
	* @return <code>true</code> if the portlet has a role with the specified
	name
	*/
	@Override
	public boolean hasRoleWithName(String roleName) {
		return _portlet.hasRoleWithName(roleName);
	}

	/**
	* Returns <code>true</code> if the portlet supports the specified mime type
	* and window state.
	*
	* @param mimeType the mime type
	* @param windowState the window state
	* @return <code>true</code> if the portlet supports the specified mime type
	and window state
	*/
	@Override
	public boolean hasWindowState(String mimeType,
		javax.portlet.WindowState windowState) {
		return _portlet.hasWindowState(mimeType, windowState);
	}

	/**
	* Returns <code>true</code> if an action URL for this portlet should cause
	* an auto redirect.
	*
	* @return <code>true</code> if an action URL for this portlet should cause
	an auto redirect
	*/
	@Override
	public boolean isActionURLRedirect() {
		return _portlet.isActionURLRedirect();
	}

	/**
	* Returns <code>true</code> if this portlet is active.
	*
	* @return <code>true</code> if this portlet is active; <code>false</code> otherwise
	*/
	@Override
	public boolean isActive() {
		return _portlet.isActive();
	}

	/**
	* Returns <code>true</code> if default resources for the portlet are added
	* to a page.
	*
	* @return <code>true</code> if default resources for the portlet are added
	to a page
	*/
	@Override
	public boolean isAddDefaultResource() {
		return _portlet.isAddDefaultResource();
	}

	/**
	* Returns <code>true</code> if the portlet can be displayed via Ajax.
	*
	* @return <code>true</code> if the portlet can be displayed via Ajax
	*/
	@Override
	public boolean isAjaxable() {
		return _portlet.isAjaxable();
	}

	/**
	* Returns <code>true</code> if the portlet supports asynchronous processing
	* in resource requests.
	*
	* @return <code>true</code> if the portlet supports asynchrounous
	processing in resource requests
	*/
	@Override
	public boolean isAsyncSupported() {
		return _portlet.isAsyncSupported();
	}

	@Override
	public boolean isCachedModel() {
		return _portlet.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _portlet.isEscapedModel();
	}

	@Override
	public boolean isFullPageDisplayable() {
		return _portlet.isFullPageDisplayable();
	}

	/**
	* Returns <code>true</code> to include the portlet and make it available to
	* be made active.
	*
	* @return <code>true</code> to include the portlet and make it available to
	be made active
	*/
	@Override
	public boolean isInclude() {
		return _portlet.isInclude();
	}

	/**
	* Returns <code>true</code> if the portlet can be added multiple times to a
	* layout.
	*
	* @return <code>true</code> if the portlet can be added multiple times to a
	layout
	*/
	@Override
	public boolean isInstanceable() {
		return _portlet.isInstanceable();
	}

	/**
	* Returns <code>true</code> to allow the portlet to be cached within the
	* layout.
	*
	* @return <code>true</code> if the portlet can be cached within the layout
	*/
	@Override
	public boolean isLayoutCacheable() {
		return _portlet.isLayoutCacheable();
	}

	/**
	* Returns <code>true</code> if the portlet goes into the maximized state
	* when the user goes into the edit mode.
	*
	* @return <code>true</code> if the portlet goes into the maximized state
	when the user goes into the edit mode
	*/
	@Override
	public boolean isMaximizeEdit() {
		return _portlet.isMaximizeEdit();
	}

	/**
	* Returns <code>true</code> if the portlet goes into the maximized state
	* when the user goes into the help mode.
	*
	* @return <code>true</code> if the portlet goes into the maximized state
	when the user goes into the help mode
	*/
	@Override
	public boolean isMaximizeHelp() {
		return _portlet.isMaximizeHelp();
	}

	@Override
	public boolean isNew() {
		return _portlet.isNew();
	}

	/**
	* Returns <code>true</code> if the portlet goes into the pop up state when
	* the user goes into the print mode.
	*
	* @return <code>true</code> if the portlet goes into the pop up state when
	the user goes into the print mode
	*/
	@Override
	public boolean isPopUpPrint() {
		return _portlet.isPopUpPrint();
	}

	/**
	* Returns <code>true</code> if preferences are shared across the entire
	* company.
	*
	* @return <code>true</code> if preferences are shared across the entire
	company
	*/
	@Override
	public boolean isPreferencesCompanyWide() {
		return _portlet.isPreferencesCompanyWide();
	}

	/**
	* Returns <code>true</code> if preferences are owned by the group when the
	* portlet is shown in a group layout. Returns <code>false</code> if
	* preferences are owned by the user at all times.
	*
	* @return <code>true</code> if preferences are owned by the group when the
	portlet is shown in a group layout; <code>false</code> if
	preferences are owned by the user at all times.
	*/
	@Override
	public boolean isPreferencesOwnedByGroup() {
		return _portlet.isPreferencesOwnedByGroup();
	}

	/**
	* Returns <code>true</code> if preferences are unique per layout.
	*
	* @return <code>true</code> if preferences are unique per layout
	*/
	@Override
	public boolean isPreferencesUniquePerLayout() {
		return _portlet.isPreferencesUniquePerLayout();
	}

	/**
	* Returns <code>true</code> if the portlet does not share request
	* attributes with the portal or portlets from another WAR.
	*
	* @return <code>true</code> if the portlet does not share request
	attributes with the portal or portlets from another WAR
	*/
	@Override
	public boolean isPrivateRequestAttributes() {
		return _portlet.isPrivateRequestAttributes();
	}

	/**
	* Returns <code>true</code> if the portlet does not share session
	* attributes with the portal.
	*
	* @return <code>true</code> if the portlet does not share session
	attributes with the portal
	*/
	@Override
	public boolean isPrivateSessionAttributes() {
		return _portlet.isPrivateSessionAttributes();
	}

	/**
	* Returns <code>true</code> if the portlet is ready to be used.
	*
	* @return <code>true</code> if the portlet is ready to be used
	*/
	@Override
	public boolean isReady() {
		return _portlet.isReady();
	}

	/**
	* Returns <code>true</code> if the portlet will only process namespaced
	* parameters.
	*
	* @return <code>true</code> if the portlet will only process namespaced
	parameters
	*/
	@Override
	public boolean isRequiresNamespacedParameters() {
		return _portlet.isRequiresNamespacedParameters();
	}

	/**
	* Returns <code>true</code> if the portlet restores to the current view
	* from the maximized state.
	*
	* @return <code>true</code> if the portlet restores to the current view
	from the maximized state
	*/
	@Override
	public boolean isRestoreCurrentView() {
		return _portlet.isRestoreCurrentView();
	}

	/**
	* Returns <code>true</code> if the portlet supports scoping of data.
	*
	* @return <code>true</code> if the portlet supports scoping of data
	*/
	@Override
	public boolean isScopeable() {
		return _portlet.isScopeable();
	}

	/**
	* Returns <code>true</code> if users are shown that they do not have access
	* to the portlet.
	*
	* @return <code>true</code> if users are shown that they do not have access
	to the portlet
	*/
	@Override
	public boolean isShowPortletAccessDenied() {
		return _portlet.isShowPortletAccessDenied();
	}

	/**
	* Returns <code>true</code> if users are shown that the portlet is
	* inactive.
	*
	* @return <code>true</code> if users are shown that the portlet is inactive
	*/
	@Override
	public boolean isShowPortletInactive() {
		return _portlet.isShowPortletInactive();
	}

	/**
	* Returns <code>true</code> if the portlet uses Single Page Application.
	*
	* @return <code>true</code> if the portlet uses Single Page Application
	*/
	@Override
	public boolean isSinglePageApplication() {
		return _portlet.isSinglePageApplication();
	}

	/**
	* Returns <code>true</code> if the portlet is a static portlet that is
	* cannot be moved.
	*
	* @return <code>true</code> if the portlet is a static portlet that is
	cannot be moved
	*/
	@Override
	public boolean isStatic() {
		return _portlet.isStatic();
	}

	/**
	* Returns <code>true</code> if the portlet is a static portlet at the end
	* of a list of portlets.
	*
	* @return <code>true</code> if the portlet is a static portlet at the end
	of a list of portlets
	*/
	@Override
	public boolean isStaticEnd() {
		return _portlet.isStaticEnd();
	}

	/**
	* Returns <code>true</code> if the portlet is a static portlet at the start
	* of a list of portlets.
	*
	* @return <code>true</code> if the portlet is a static portlet at the start
	of a list of portlets
	*/
	@Override
	public boolean isStaticStart() {
		return _portlet.isStaticStart();
	}

	/**
	* Returns <code>true</code> if the portlet is a system portlet that a user
	* cannot manually add to their page.
	*
	* @return <code>true</code> if the portlet is a system portlet that a user
	cannot manually add to their page
	*/
	@Override
	public boolean isSystem() {
		return _portlet.isSystem();
	}

	/**
	* Returns <code>true</code> if the portlet is an undeployed portlet.
	*
	* @return <code>true</code> if the portlet is a placeholder of an
	undeployed portlet
	*/
	@Override
	public boolean isUndeployedPortlet() {
		return _portlet.isUndeployedPortlet();
	}

	/**
	* Returns <code>true</code> if the portlet uses the default template.
	*
	* @return <code>true</code> if the portlet uses the default template
	*/
	@Override
	public boolean isUseDefaultTemplate() {
		return _portlet.isUseDefaultTemplate();
	}

	/**
	* Link the role names set in portlet.xml with the Liferay roles set in
	* liferay-portlet.xml.
	*/
	@Override
	public void linkRoles() {
		_portlet.linkRoles();
	}

	@Override
	public void persist() {
		_portlet.persist();
	}

	/**
	* Sets the action timeout of the portlet.
	*
	* @param actionTimeout the action timeout of the portlet
	*/
	@Override
	public void setActionTimeout(int actionTimeout) {
		_portlet.setActionTimeout(actionTimeout);
	}

	/**
	* Set to <code>true</code> if an action URL for this portlet should cause
	* an auto redirect.
	*
	* @param actionURLRedirect boolean value for whether an action URL for this
	portlet should cause an auto redirect
	*/
	@Override
	public void setActionURLRedirect(boolean actionURLRedirect) {
		_portlet.setActionURLRedirect(actionURLRedirect);
	}

	/**
	* Sets whether this portlet is active.
	*
	* @param active the active of this portlet
	*/
	@Override
	public void setActive(boolean active) {
		_portlet.setActive(active);
	}

	/**
	* Set to <code>true</code> if default resources for the portlet are added
	* to a page.
	*
	* @param addDefaultResource boolean value for whether or not default
	resources for the portlet are added to a page
	*/
	@Override
	public void setAddDefaultResource(boolean addDefaultResource) {
		_portlet.setAddDefaultResource(addDefaultResource);
	}

	/**
	* Set to <code>true</code> if the portlet can be displayed via Ajax.
	*
	* @param ajaxable boolean value for whether the portlet can be displayed
	via Ajax
	*/
	@Override
	public void setAjaxable(boolean ajaxable) {
		_portlet.setAjaxable(ajaxable);
	}

	/**
	* Sets the application types of the portlet.
	*
	* @param applicationTypes the application types of the portlet
	*/
	@Override
	public void setApplicationTypes(
		java.util.Set<com.liferay.portal.kernel.application.type.ApplicationType> applicationTypes) {
		_portlet.setApplicationTypes(applicationTypes);
	}

	/**
	* Sets the names of the classes that represent asset types associated with
	* the portlet.
	*
	* @param assetRendererFactoryClasses the names of the classes that
	represent asset types associated with the portlet
	*/
	@Override
	public void setAssetRendererFactoryClasses(
		java.util.List<String> assetRendererFactoryClasses) {
		_portlet.setAssetRendererFactoryClasses(assetRendererFactoryClasses);
	}

	/**
	* Set to <code>true</code> if the portlet supports asynchronous processing
	* in resource requests.
	*
	* @param asyncSupported boolean value for whether the portlet supports
	asynchronous processing in resource requests
	*/
	@Override
	public void setAsyncSupported(boolean asyncSupported) {
		_portlet.setAsyncSupported(asyncSupported);
	}

	/**
	* Sets the names of the classes that represent atom collection adapters
	* associated with the portlet.
	*
	* @param atomCollectionAdapterClasses the names of the classes that
	represent atom collection adapters associated with the portlet
	*/
	@Override
	public void setAtomCollectionAdapterClasses(
		java.util.List<String> atomCollectionAdapterClasses) {
		_portlet.setAtomCollectionAdapterClasses(atomCollectionAdapterClasses);
	}

	/**
	* Sets the names of the parameters that will be automatically propagated
	* through the portlet.
	*
	* @param autopropagatedParameters the names of the parameters that will be
	automatically propagated through the portlet
	*/
	@Override
	public void setAutopropagatedParameters(
		java.util.Set<String> autopropagatedParameters) {
		_portlet.setAutopropagatedParameters(autopropagatedParameters);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_portlet.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this portlet.
	*
	* @param companyId the company ID of this portlet
	*/
	@Override
	public void setCompanyId(long companyId) {
		_portlet.setCompanyId(companyId);
	}

	/**
	* Sets the configuration action class of the portlet.
	*
	* @param configurationActionClass the configuration action class of the
	portlet
	*/
	@Override
	public void setConfigurationActionClass(String configurationActionClass) {
		_portlet.setConfigurationActionClass(configurationActionClass);
	}

	/**
	* Set the name of the category of the Control Panel where the portlet will
	* be shown.
	*
	* @param controlPanelEntryCategory the name of the category of the Control
	Panel where the portlet will be shown
	*/
	@Override
	public void setControlPanelEntryCategory(String controlPanelEntryCategory) {
		_portlet.setControlPanelEntryCategory(controlPanelEntryCategory);
	}

	/**
	* Sets the name of the class that will control when the portlet will be
	* shown in the Control Panel.
	*
	* @param controlPanelEntryClass the name of the class that will control
	when the portlet will be shown in the Control Panel
	*/
	@Override
	public void setControlPanelEntryClass(String controlPanelEntryClass) {
		_portlet.setControlPanelEntryClass(controlPanelEntryClass);
	}

	/**
	* Sets the relative weight of the portlet with respect to the other
	* portlets in the same category of the Control Panel.
	*
	* @param controlPanelEntryWeight the relative weight of the portlet with
	respect to the other portlets in the same category of the Control
	Panel
	*/
	@Override
	public void setControlPanelEntryWeight(double controlPanelEntryWeight) {
		_portlet.setControlPanelEntryWeight(controlPanelEntryWeight);
	}

	/**
	* Sets the name of the CSS class that will be injected in the DIV that
	* wraps this portlet.
	*
	* @param cssClassWrapper the name of the CSS class that will be injected in
	the DIV that wraps this portlet
	*/
	@Override
	public void setCssClassWrapper(String cssClassWrapper) {
		_portlet.setCssClassWrapper(cssClassWrapper);
	}

	/**
	* Sets the names of the classes that represent custom attribute displays
	* associated with the portlet.
	*
	* @param customAttributesDisplayClasses the names of the classes that
	represent custom attribute displays associated with the portlet
	*/
	@Override
	public void setCustomAttributesDisplayClasses(
		java.util.List<String> customAttributesDisplayClasses) {
		_portlet.setCustomAttributesDisplayClasses(customAttributesDisplayClasses);
	}

	/**
	* Sets the default plugin settings of the portlet.
	*
	* @param pluginSetting the plugin setting
	*/
	@Override
	public void setDefaultPluginSetting(PluginSetting pluginSetting) {
		_portlet.setDefaultPluginSetting(pluginSetting);
	}

	/**
	* Sets the default preferences of the portlet.
	*
	* @param defaultPreferences the default preferences of the portlet
	*/
	@Override
	public void setDefaultPreferences(String defaultPreferences) {
		_portlet.setDefaultPreferences(defaultPreferences);
	}

	/**
	* Sets the display name of the portlet.
	*
	* @param displayName the display name of the portlet
	*/
	@Override
	public void setDisplayName(String displayName) {
		_portlet.setDisplayName(displayName);
	}

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel) {
		_portlet.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_portlet.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_portlet.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets expiration cache of the portlet.
	*
	* @param expCache expiration cache of the portlet
	*/
	@Override
	public void setExpCache(Integer expCache) {
		_portlet.setExpCache(expCache);
	}

	/**
	* Sets the Facebook integration method of the portlet.
	*
	* @param facebookIntegration the Facebook integration method of the
	portlet
	* @deprecated As of 7.0.0, with no direct replacement
	*/
	@Deprecated
	@Override
	public void setFacebookIntegration(String facebookIntegration) {
		_portlet.setFacebookIntegration(facebookIntegration);
	}

	/**
	* Sets a list of CSS files that will be referenced from the page's footer
	* relative to the portal's context path.
	*
	* @param footerPortalCss a list of CSS files that will be referenced from
	the page's footer relative to the portal's context path
	*/
	@Override
	public void setFooterPortalCss(java.util.List<String> footerPortalCss) {
		_portlet.setFooterPortalCss(footerPortalCss);
	}

	/**
	* Sets a list of JavaScript files that will be referenced from the page's
	* footer relative to the portal's context path.
	*
	* @param footerPortalJavaScript a list of JavaScript files that will be
	referenced from the page's footer relative to the portal's context
	path
	*/
	@Override
	public void setFooterPortalJavaScript(
		java.util.List<String> footerPortalJavaScript) {
		_portlet.setFooterPortalJavaScript(footerPortalJavaScript);
	}

	/**
	* Sets a list of CSS files that will be referenced from the page's footer
	* relative to the portlet's context path.
	*
	* @param footerPortletCss a list of CSS files that will be referenced from
	the page's footer relative to the portlet's context path
	*/
	@Override
	public void setFooterPortletCss(java.util.List<String> footerPortletCss) {
		_portlet.setFooterPortletCss(footerPortletCss);
	}

	/**
	* Sets a list of JavaScript files that will be referenced from the page's
	* footer relative to the portlet's context path.
	*
	* @param footerPortletJavaScript a list of JavaScript files that will be
	referenced from the page's footer relative to the portlet's
	context path
	*/
	@Override
	public void setFooterPortletJavaScript(
		java.util.List<String> footerPortletJavaScript) {
		_portlet.setFooterPortletJavaScript(footerPortletJavaScript);
	}

	/**
	* Sets the name of the friendly URL mapper class of the portlet.
	*
	* @param friendlyURLMapperClass the name of the friendly URL mapper class
	of the portlet
	*/
	@Override
	public void setFriendlyURLMapperClass(String friendlyURLMapperClass) {
		_portlet.setFriendlyURLMapperClass(friendlyURLMapperClass);
	}

	/**
	* Sets the name of the friendly URL mapping of the portlet.
	*
	* @param friendlyURLMapping the name of the friendly URL mapping of the
	portlet
	*/
	@Override
	public void setFriendlyURLMapping(String friendlyURLMapping) {
		_portlet.setFriendlyURLMapping(friendlyURLMapping);
	}

	/**
	* Sets the class loader resource path to the friendly URL routes of the
	* portlet.
	*
	* @param friendlyURLRoutes the class loader resource path to the friendly
	URL routes of the portlet
	*/
	@Override
	public void setFriendlyURLRoutes(String friendlyURLRoutes) {
		_portlet.setFriendlyURLRoutes(friendlyURLRoutes);
	}

	/**
	* Sets a list of CSS files that will be referenced from the page's header
	* relative to the portal's context path.
	*
	* @param headerPortalCss a list of CSS files that will be referenced from
	the page's header relative to the portal's context path
	*/
	@Override
	public void setHeaderPortalCss(java.util.List<String> headerPortalCss) {
		_portlet.setHeaderPortalCss(headerPortalCss);
	}

	/**
	* Sets a list of JavaScript files that will be referenced from the page's
	* header relative to the portal's context path.
	*
	* @param headerPortalJavaScript a list of JavaScript files that will be
	referenced from the page's header relative to the portal's context
	path
	*/
	@Override
	public void setHeaderPortalJavaScript(
		java.util.List<String> headerPortalJavaScript) {
		_portlet.setHeaderPortalJavaScript(headerPortalJavaScript);
	}

	/**
	* Sets a list of CSS files that will be referenced from the page's header
	* relative to the portlet's context path.
	*
	* @param headerPortletCss a list of CSS files that will be referenced from
	the page's header relative to the portlet's context path
	*/
	@Override
	public void setHeaderPortletCss(java.util.List<String> headerPortletCss) {
		_portlet.setHeaderPortletCss(headerPortletCss);
	}

	/**
	* Sets a list of JavaScript files that will be referenced from the page's
	* header relative to the portlet's context path.
	*
	* @param headerPortletJavaScript a list of JavaScript files that will be
	referenced from the page's header relative to the portlet's
	context path
	*/
	@Override
	public void setHeaderPortletJavaScript(
		java.util.List<String> headerPortletJavaScript) {
		_portlet.setHeaderPortletJavaScript(headerPortletJavaScript);
	}

	/**
	* Sets the icon of the portlet.
	*
	* @param icon the icon of the portlet
	*/
	@Override
	public void setIcon(String icon) {
		_portlet.setIcon(icon);
	}

	/**
	* Sets the ID of this portlet.
	*
	* @param id the ID of this portlet
	*/
	@Override
	public void setId(long id) {
		_portlet.setId(id);
	}

	/**
	* Set to <code>true</code> to include the portlet and make it available to
	* be made active.
	*
	* @param include boolean value for whether to include the portlet and make
	it available to be made active
	*/
	@Override
	public void setInclude(boolean include) {
		_portlet.setInclude(include);
	}

	/**
	* Sets the names of the classes that represent indexers associated with the
	* portlet.
	*
	* @param indexerClasses the names of the classes that represent indexers
	associated with the portlet
	*/
	@Override
	public void setIndexerClasses(java.util.List<String> indexerClasses) {
		_portlet.setIndexerClasses(indexerClasses);
	}

	/**
	* Sets the init parameters of the portlet.
	*
	* @param initParams the init parameters of the portlet
	*/
	@Override
	public void setInitParams(Map<String, String> initParams) {
		_portlet.setInitParams(initParams);
	}

	/**
	* Set to <code>true</code> if the portlet can be added multiple times to a
	* layout.
	*
	* @param instanceable boolean value for whether the portlet can be added
	multiple times to a layout
	*/
	@Override
	public void setInstanceable(boolean instanceable) {
		_portlet.setInstanceable(instanceable);
	}

	/**
	* Set to <code>true</code> to allow the portlet to be cached within the
	* layout.
	*
	* @param layoutCacheable boolean value for whether the portlet can be
	cached within the layout
	*/
	@Override
	public void setLayoutCacheable(boolean layoutCacheable) {
		_portlet.setLayoutCacheable(layoutCacheable);
	}

	/**
	* Set to <code>true</code> if the portlet goes into the maximized state
	* when the user goes into the edit mode.
	*
	* @param maximizeEdit boolean value for whether the portlet goes into the
	maximized state when the user goes into the edit mode
	*/
	@Override
	public void setMaximizeEdit(boolean maximizeEdit) {
		_portlet.setMaximizeEdit(maximizeEdit);
	}

	/**
	* Set to <code>true</code> if the portlet goes into the maximized state
	* when the user goes into the help mode.
	*
	* @param maximizeHelp boolean value for whether the portlet goes into the
	maximized state when the user goes into the help mode
	*/
	@Override
	public void setMaximizeHelp(boolean maximizeHelp) {
		_portlet.setMaximizeHelp(maximizeHelp);
	}

	/**
	* Sets the maximum size of buffered bytes before storing occurs.
	*
	* @param multipartFileSizeThreshold the maximum size of buffered bytes
	before storing occurs
	*/
	@Override
	public void setMultipartFileSizeThreshold(int multipartFileSizeThreshold) {
		_portlet.setMultipartFileSizeThreshold(multipartFileSizeThreshold);
	}

	/**
	* Sets the directory for storing uploaded files.
	*
	* @param multipartLocation the directory for storing uploaded files
	*/
	@Override
	public void setMultipartLocation(String multipartLocation) {
		_portlet.setMultipartLocation(multipartLocation);
	}

	/**
	* Sets the maximum number of bytes permitted for an uploaded file.
	*
	* @param multipartMaxFileSize the maximum number of bytes permitted for an
	uploaded file
	*/
	@Override
	public void setMultipartMaxFileSize(long multipartMaxFileSize) {
		_portlet.setMultipartMaxFileSize(multipartMaxFileSize);
	}

	/**
	* Sets the maximum number of bytes permitted for a multipart request.
	*
	* @param multipartMaxRequestSize the maximum number of bytes permitted for
	a multipart request
	*/
	@Override
	public void setMultipartMaxRequestSize(long multipartMaxRequestSize) {
		_portlet.setMultipartMaxRequestSize(multipartMaxRequestSize);
	}

	/**
	* Sets the mvcc version of this portlet.
	*
	* @param mvccVersion the mvcc version of this portlet
	*/
	@Override
	public void setMvccVersion(long mvccVersion) {
		_portlet.setMvccVersion(mvccVersion);
	}

	@Override
	public void setNew(boolean n) {
		_portlet.setNew(n);
	}

	/**
	* Sets the name of the open search class of the portlet.
	*
	* @param openSearchClass the name of the open search class of the portlet
	*/
	@Override
	public void setOpenSearchClass(String openSearchClass) {
		_portlet.setOpenSearchClass(openSearchClass);
	}

	/**
	* Sets the parent struts path of the portlet.
	*
	* @param parentStrutsPath the parent struts path of the portlet
	*/
	@Override
	public void setParentStrutsPath(String parentStrutsPath) {
		_portlet.setParentStrutsPath(parentStrutsPath);
	}

	/**
	* Sets the name of the permission propagator class of the portlet.
	*/
	@Override
	public void setPermissionPropagatorClass(String permissionPropagatorClass) {
		_portlet.setPermissionPropagatorClass(permissionPropagatorClass);
	}

	/**
	* Sets this portlet's plugin package.
	*
	* @param pluginPackage this portlet's plugin package
	*/
	@Override
	public void setPluginPackage(
		com.liferay.portal.kernel.plugin.PluginPackage pluginPackage) {
		_portlet.setPluginPackage(pluginPackage);
	}

	/**
	* Sets the name of the poller processor class of the portlet.
	*
	* @param pollerProcessorClass the name of the poller processor class of the
	portlet
	*/
	@Override
	public void setPollerProcessorClass(String pollerProcessorClass) {
		_portlet.setPollerProcessorClass(pollerProcessorClass);
	}

	/**
	* Sets the name of the POP message listener class of the portlet.
	*
	* @param popMessageListenerClass the name of the POP message listener class
	of the portlet
	*/
	@Override
	public void setPopMessageListenerClass(String popMessageListenerClass) {
		_portlet.setPopMessageListenerClass(popMessageListenerClass);
	}

	/**
	* Set to <code>true</code> if the portlet goes into the pop up state when
	* the user goes into the print mode.
	*
	* @param popUpPrint boolean value for whether the portlet goes into the pop
	up state when the user goes into the print mode
	*/
	@Override
	public void setPopUpPrint(boolean popUpPrint) {
		_portlet.setPopUpPrint(popUpPrint);
	}

	/**
	* Sets this portlet's application.
	*
	* @param portletApp this portlet's application
	*/
	@Override
	public void setPortletApp(PortletApp portletApp) {
		_portlet.setPortletApp(portletApp);
	}

	/**
	* Sets the name of the portlet class of the portlet.
	*
	* @param portletClass the name of the portlet class of the portlet
	*/
	@Override
	public void setPortletClass(String portletClass) {
		_portlet.setPortletClass(portletClass);
	}

	/**
	* Sets the name of the portlet data handler class of the portlet.
	*
	* @param portletDataHandlerClass the name of portlet data handler class of
	the portlet
	*/
	@Override
	public void setPortletDataHandlerClass(String portletDataHandlerClass) {
		_portlet.setPortletDataHandlerClass(portletDataHandlerClass);
	}

	/**
	* Sets the filters of the portlet.
	*
	* @param portletFilters the filters of the portlet
	*/
	@Override
	public void setPortletFilters(Map<String, PortletFilter> portletFilters) {
		_portlet.setPortletFilters(portletFilters);
	}

	/**
	* Sets the portlet ID of this portlet.
	*
	* @param portletId the portlet ID of this portlet
	*/
	@Override
	public void setPortletId(String portletId) {
		_portlet.setPortletId(portletId);
	}

	/**
	* Sets the portlet info of the portlet.
	*
	* @param portletInfo the portlet info of the portlet
	*/
	@Override
	public void setPortletInfo(PortletInfo portletInfo) {
		_portlet.setPortletInfo(portletInfo);
	}

	/**
	* Sets the name of the portlet layout listener class of the portlet.
	*
	* @param portletLayoutListenerClass the name of the portlet layout listener
	class of the portlet
	*/
	@Override
	public void setPortletLayoutListenerClass(String portletLayoutListenerClass) {
		_portlet.setPortletLayoutListenerClass(portletLayoutListenerClass);
	}

	/**
	* Sets the portlet modes of the portlet.
	*
	* @param portletModes the portlet modes of the portlet
	*/
	@Override
	public void setPortletModes(Map<String, java.util.Set<String>> portletModes) {
		_portlet.setPortletModes(portletModes);
	}

	/**
	* Sets the name of the portlet.
	*
	* @param portletName the name of the portlet
	*/
	@Override
	public void setPortletName(String portletName) {
		_portlet.setPortletName(portletName);
	}

	/**
	* Sets the name of the portlet URL class of the portlet.
	*
	* @param portletURLClass the name of the portlet URL class of the portlet
	*/
	@Override
	public void setPortletURLClass(String portletURLClass) {
		_portlet.setPortletURLClass(portletURLClass);
	}

	/**
	* Set to <code>true</code> if preferences are shared across the entire
	* company.
	*
	* @param preferencesCompanyWide boolean value for whether preferences are
	shared across the entire company
	*/
	@Override
	public void setPreferencesCompanyWide(boolean preferencesCompanyWide) {
		_portlet.setPreferencesCompanyWide(preferencesCompanyWide);
	}

	/**
	* Set to <code>true</code> if preferences are owned by the group when the
	* portlet is shown in a group layout. Set to <code>false</code> if
	* preferences are owned by the user at all times.
	*
	* @param preferencesOwnedByGroup boolean value for whether preferences are
	owned by the group when the portlet is shown in a group layout or
	preferences are owned by the user at all times
	*/
	@Override
	public void setPreferencesOwnedByGroup(boolean preferencesOwnedByGroup) {
		_portlet.setPreferencesOwnedByGroup(preferencesOwnedByGroup);
	}

	/**
	* Set to <code>true</code> if preferences are unique per layout.
	*
	* @param preferencesUniquePerLayout boolean value for whether preferences
	are unique per layout
	*/
	@Override
	public void setPreferencesUniquePerLayout(
		boolean preferencesUniquePerLayout) {
		_portlet.setPreferencesUniquePerLayout(preferencesUniquePerLayout);
	}

	/**
	* Sets the name of the preferences validator class of the portlet.
	*
	* @param preferencesValidator the name of the preferences validator class
	of the portlet
	*/
	@Override
	public void setPreferencesValidator(String preferencesValidator) {
		_portlet.setPreferencesValidator(preferencesValidator);
	}

	/**
	* Sets the primary key of this portlet.
	*
	* @param primaryKey the primary key of this portlet
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_portlet.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_portlet.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Set to <code>true</code> if the portlet does not share request attributes
	* with the portal or portlets from another WAR.
	*
	* @param privateRequestAttributes boolean value for whether the portlet
	shares request attributes with the portal or portlets from another
	WAR
	*/
	@Override
	public void setPrivateRequestAttributes(boolean privateRequestAttributes) {
		_portlet.setPrivateRequestAttributes(privateRequestAttributes);
	}

	/**
	* Set to <code>true</code> if the portlet does not share session attributes
	* with the portal.
	*
	* @param privateSessionAttributes boolean value for whether the portlet
	shares session attributes with the portal
	*/
	@Override
	public void setPrivateSessionAttributes(boolean privateSessionAttributes) {
		_portlet.setPrivateSessionAttributes(privateSessionAttributes);
	}

	/**
	* Sets the processing events of the portlet.
	*
	* @param processingEvents the processing events of the portlet
	*/
	@Override
	public void setProcessingEvents(
		java.util.Set<com.liferay.portal.kernel.xml.QName> processingEvents) {
		_portlet.setProcessingEvents(processingEvents);
	}

	/**
	* Sets the public render parameters of the portlet.
	*
	* @param publicRenderParameters the public render parameters of the portlet
	*/
	@Override
	public void setPublicRenderParameters(
		java.util.Set<PublicRenderParameter> publicRenderParameters) {
		_portlet.setPublicRenderParameters(publicRenderParameters);
	}

	/**
	* Sets the publishing events of the portlet.
	*
	* @param publishingEvents the publishing events of the portlet
	*/
	@Override
	public void setPublishingEvents(
		java.util.Set<com.liferay.portal.kernel.xml.QName> publishingEvents) {
		_portlet.setPublishingEvents(publishingEvents);
	}

	/**
	* Set to <code>true</code> if the portlet is ready to be used.
	*
	* @param ready whether the portlet is ready to be used
	*/
	@Override
	public void setReady(boolean ready) {
		_portlet.setReady(ready);
	}

	/**
	* Sets the render timeout of the portlet.
	*
	* @param renderTimeout the render timeout of the portlet
	*/
	@Override
	public void setRenderTimeout(int renderTimeout) {
		_portlet.setRenderTimeout(renderTimeout);
	}

	/**
	* Sets the render weight of the portlet.
	*
	* @param renderWeight int value for the render weight of the portlet
	*/
	@Override
	public void setRenderWeight(int renderWeight) {
		_portlet.setRenderWeight(renderWeight);
	}

	/**
	* Set to <code>true</code> if the portlet will only process namespaced
	* parameters.
	*
	* @param requiresNamespacedParameters boolean value for whether the portlet
	will only process namespaced parameters
	*/
	@Override
	public void setRequiresNamespacedParameters(
		boolean requiresNamespacedParameters) {
		_portlet.setRequiresNamespacedParameters(requiresNamespacedParameters);
	}

	/**
	* Sets the resource bundle of the portlet.
	*
	* @param resourceBundle the resource bundle of the portlet
	*/
	@Override
	public void setResourceBundle(String resourceBundle) {
		_portlet.setResourceBundle(resourceBundle);
	}

	/**
	* Set to <code>true</code> if the portlet restores to the current view from
	* the maximized state.
	*
	* @param restoreCurrentView boolean value for whether the portlet restores
	to the current view from the maximized state
	*/
	@Override
	public void setRestoreCurrentView(boolean restoreCurrentView) {
		_portlet.setRestoreCurrentView(restoreCurrentView);
	}

	/**
	* Sets the role mappers of the portlet.
	*
	* @param roleMappers the role mappers of the portlet
	*/
	@Override
	public void setRoleMappers(Map<String, String> roleMappers) {
		_portlet.setRoleMappers(roleMappers);
	}

	/**
	* Sets the roles of this portlet.
	*
	* @param roles the roles of this portlet
	*/
	@Override
	public void setRoles(String roles) {
		_portlet.setRoles(roles);
	}

	/**
	* Sets an array of required roles of the portlet.
	*
	* @param rolesArray an array of required roles of the portlet
	*/
	@Override
	public void setRolesArray(String[] rolesArray) {
		_portlet.setRolesArray(rolesArray);
	}

	/**
	* Sets the scheduler entries of the portlet.
	*
	* @param schedulerEntries the scheduler entries of the portlet
	*/
	@Override
	public void setSchedulerEntries(
		java.util.List<com.liferay.portal.kernel.scheduler.SchedulerEntry> schedulerEntries) {
		_portlet.setSchedulerEntries(schedulerEntries);
	}

	/**
	* Set to <code>true</code> if the portlet supports scoping of data.
	*
	* @param scopeable boolean value for whether or not the the portlet
	supports scoping of data
	*/
	@Override
	public void setScopeable(boolean scopeable) {
		_portlet.setScopeable(scopeable);
	}

	/**
	* Set to <code>true</code> if users are shown that they do not have access
	* to the portlet.
	*
	* @param showPortletAccessDenied boolean value for whether users are shown
	that they do not have access to the portlet
	*/
	@Override
	public void setShowPortletAccessDenied(boolean showPortletAccessDenied) {
		_portlet.setShowPortletAccessDenied(showPortletAccessDenied);
	}

	/**
	* Set to <code>true</code> if users are shown that the portlet is inactive.
	*
	* @param showPortletInactive boolean value for whether users are shown that
	the portlet is inactive
	*/
	@Override
	public void setShowPortletInactive(boolean showPortletInactive) {
		_portlet.setShowPortletInactive(showPortletInactive);
	}

	/**
	* Set to <code>true</code> if the portlet uses Single Page Application.
	*
	* @param singlePageApplication boolean value for whether or not the the
	portlet uses Single Page Application
	*/
	@Override
	public void setSinglePageApplication(boolean singlePageApplication) {
		_portlet.setSinglePageApplication(singlePageApplication);
	}

	/**
	* Sets the names of the classes that represent social activity interpreters
	* associated with the portlet.
	*
	* @param socialActivityInterpreterClasses the names of the classes that
	represent social activity interpreters associated with the portlet
	*/
	@Override
	public void setSocialActivityInterpreterClasses(
		java.util.List<String> socialActivityInterpreterClasses) {
		_portlet.setSocialActivityInterpreterClasses(socialActivityInterpreterClasses);
	}

	/**
	* Sets the name of the social request interpreter class of the portlet.
	*
	* @param socialRequestInterpreterClass the name of the request interpreter
	class of the portlet
	*/
	@Override
	public void setSocialRequestInterpreterClass(
		String socialRequestInterpreterClass) {
		_portlet.setSocialRequestInterpreterClass(socialRequestInterpreterClass);
	}

	/**
	* Sets the names of the classes that represent staged model data handlers
	* associated with the portlet.
	*
	* @param stagedModelDataHandlerClasses the names of the classes that
	represent staged model data handlers associated with the portlet
	*/
	@Override
	public void setStagedModelDataHandlerClasses(
		java.util.List<String> stagedModelDataHandlerClasses) {
		_portlet.setStagedModelDataHandlerClasses(stagedModelDataHandlerClasses);
	}

	/**
	* Set to <code>true</code> if the portlet is a static portlet that is
	* cannot be moved.
	*
	* @param staticPortlet boolean value for whether the portlet is a static
	portlet that cannot be moved
	*/
	@Override
	public void setStatic(boolean staticPortlet) {
		_portlet.setStatic(staticPortlet);
	}

	/**
	* Set to <code>true</code> if the portlet is a static portlet at the start
	* of a list of portlets.
	*
	* @param staticPortletStart boolean value for whether the portlet is a
	static portlet at the start of a list of portlets
	*/
	@Override
	public void setStaticStart(boolean staticPortletStart) {
		_portlet.setStaticStart(staticPortletStart);
	}

	/**
	* Sets the struts path of the portlet.
	*
	* @param strutsPath the struts path of the portlet
	*/
	@Override
	public void setStrutsPath(String strutsPath) {
		_portlet.setStrutsPath(strutsPath);
	}

	/**
	* Sets the supported locales of the portlet.
	*
	* @param supportedLocales the supported locales of the portlet
	*/
	@Override
	public void setSupportedLocales(java.util.Set<String> supportedLocales) {
		_portlet.setSupportedLocales(supportedLocales);
	}

	/**
	* Set to <code>true</code> if the portlet is a system portlet that a user
	* cannot manually add to their page.
	*
	* @param system boolean value for whether the portlet is a system portlet
	that a user cannot manually add to their page
	*/
	@Override
	public void setSystem(boolean system) {
		_portlet.setSystem(system);
	}

	/**
	* Sets the name of the template handler class of the portlet.
	*
	* @param templateHandlerClass the name of template handler class of the
	portlet
	*/
	@Override
	public void setTemplateHandlerClass(String templateHandlerClass) {
		_portlet.setTemplateHandlerClass(templateHandlerClass);
	}

	/**
	* Sets the names of the classes that represent trash handlers associated to
	* the portlet.
	*
	* @param trashHandlerClasses the names of the classes that represent trash
	handlers associated with the portlet
	*/
	@Override
	public void setTrashHandlerClasses(
		java.util.List<String> trashHandlerClasses) {
		_portlet.setTrashHandlerClasses(trashHandlerClasses);
	}

	/**
	* Set to <code>true</code> if the portlet is an undeployed portlet.
	*
	* @param undeployedPortlet boolean value for whether the portlet is an
	undeployed portlet
	*/
	@Override
	public void setUndeployedPortlet(boolean undeployedPortlet) {
		_portlet.setUndeployedPortlet(undeployedPortlet);
	}

	/**
	* Sets the unlinked roles of the portlet.
	*
	* @param unlinkedRoles the unlinked roles of the portlet
	*/
	@Override
	public void setUnlinkedRoles(java.util.Set<String> unlinkedRoles) {
		_portlet.setUnlinkedRoles(unlinkedRoles);
	}

	/**
	* Sets the name of the URL encoder class of the portlet.
	*
	* @param urlEncoderClass the name of the URL encoder class of the portlet
	*/
	@Override
	public void setURLEncoderClass(String urlEncoderClass) {
		_portlet.setURLEncoderClass(urlEncoderClass);
	}

	/**
	* Set to <code>true</code> if the portlet uses the default template.
	*
	* @param useDefaultTemplate boolean value for whether the portlet uses the
	default template
	*/
	@Override
	public void setUseDefaultTemplate(boolean useDefaultTemplate) {
		_portlet.setUseDefaultTemplate(useDefaultTemplate);
	}

	/**
	* Sets the class loader resource path to the user notification definitions
	* of the portlet.
	*
	* @param userNotificationDefinitions the class loader resource path to the
	user notification definitions of the portlet
	*/
	@Override
	public void setUserNotificationDefinitions(
		String userNotificationDefinitions) {
		_portlet.setUserNotificationDefinitions(userNotificationDefinitions);
	}

	/**
	* Sets the names of the classes that represent user notification handlers
	* associated with the portlet.
	*
	* @param userNotificationHandlerClasses the names of the classes that
	represent user notification handlers associated with the portlet
	*/
	@Override
	public void setUserNotificationHandlerClasses(
		java.util.List<String> userNotificationHandlerClasses) {
		_portlet.setUserNotificationHandlerClasses(userNotificationHandlerClasses);
	}

	/**
	* Sets the user principal strategy of the portlet.
	*
	* @param userPrincipalStrategy the user principal strategy of the portlet
	*/
	@Override
	public void setUserPrincipalStrategy(String userPrincipalStrategy) {
		_portlet.setUserPrincipalStrategy(userPrincipalStrategy);
	}

	/**
	* Sets the virtual path of the portlet.
	*
	* @param virtualPath the virtual path of the portlet
	*/
	@Override
	public void setVirtualPath(String virtualPath) {
		_portlet.setVirtualPath(virtualPath);
	}

	/**
	* Sets the name of the WebDAV storage class of the portlet.
	*
	* @param webDAVStorageClass the name of the WebDAV storage class of the
	portlet
	*/
	@Override
	public void setWebDAVStorageClass(String webDAVStorageClass) {
		_portlet.setWebDAVStorageClass(webDAVStorageClass);
	}

	/**
	* Sets the name of the WebDAV storage token of the portlet.
	*
	* @param webDAVStorageToken the name of the WebDAV storage token of the
	portlet
	*/
	@Override
	public void setWebDAVStorageToken(String webDAVStorageToken) {
		_portlet.setWebDAVStorageToken(webDAVStorageToken);
	}

	/**
	* Sets the window states of the portlet.
	*
	* @param windowStates the window states of the portlet
	*/
	@Override
	public void setWindowStates(Map<String, java.util.Set<String>> windowStates) {
		_portlet.setWindowStates(windowStates);
	}

	/**
	* Sets the names of the classes that represent workflow handlers associated
	* to the portlet.
	*
	* @param workflowHandlerClasses the names of the classes that represent
	workflow handlers associated with the portlet
	*/
	@Override
	public void setWorkflowHandlerClasses(
		java.util.List<String> workflowHandlerClasses) {
		_portlet.setWorkflowHandlerClasses(workflowHandlerClasses);
	}

	/**
	* Sets the name of the XML-RPC method class of the portlet.
	*
	* @param xmlRpcMethodClass the name of the XML-RPC method class of the
	portlet
	*/
	@Override
	public void setXmlRpcMethodClass(String xmlRpcMethodClass) {
		_portlet.setXmlRpcMethodClass(xmlRpcMethodClass);
	}

	@Override
	public CacheModel<Portlet> toCacheModel() {
		return _portlet.toCacheModel();
	}

	@Override
	public Portlet toEscapedModel() {
		return new PortletWrapper(_portlet.toEscapedModel());
	}

	@Override
	public String toString() {
		return _portlet.toString();
	}

	@Override
	public Portlet toUnescapedModel() {
		return new PortletWrapper(_portlet.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _portlet.toXmlString();
	}

	@Override
	public void unsetReady() {
		_portlet.unsetReady();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof PortletWrapper)) {
			return false;
		}

		PortletWrapper portletWrapper = (PortletWrapper)obj;

		if (Objects.equals(_portlet, portletWrapper._portlet)) {
			return true;
		}

		return false;
	}

	@Override
	public Portlet getWrappedModel() {
		return _portlet;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _portlet.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _portlet.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_portlet.resetOriginalValues();
	}

	private final Portlet _portlet;
}