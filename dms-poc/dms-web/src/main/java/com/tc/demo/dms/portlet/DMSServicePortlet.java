package com.tc.demo.dms.portlet;


import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.tc.demo.dms.constants.DMSServicePortletKeys;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author admin
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.dms",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/dmsservice-view.jsp",
		"javax.portlet.name=" + DMSServicePortletKeys.DMSService,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"com.liferay.portlet.add-default-resource=true"
	},
	service = Portlet.class
)
public class DMSServicePortlet extends MVCPortlet {
}