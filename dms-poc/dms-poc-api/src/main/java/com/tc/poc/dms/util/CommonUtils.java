package com.tc.poc.dms.util;

import com.liferay.document.library.kernel.model.DLFileEntry;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.Organization;
import com.liferay.portal.kernel.model.ResourceConstants;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.security.auth.PrincipalThreadLocal;
import com.liferay.portal.kernel.service.OrganizationLocalServiceUtil;
import com.liferay.portal.kernel.service.ResourcePermissionLocalServiceUtil;
import com.liferay.portal.kernel.service.RoleLocalServiceUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import java.io.File;
import java.util.List;
import java.util.Properties;

public class CommonUtils {
	public static User getCurrentUser() throws SystemException, PortalException {
		ServiceContext serviceContext = CommonUtils.getServiceContext(false);
		long userId = serviceContext.getUserId();
		CommonUtils.printLog("userid:::"+userId);
		return UserLocalServiceUtil.getUser(userId);
	}
	public static User getCurrentLoginUser(ServiceContext serviceContext) throws SystemException, PortalException {
		if(serviceContext == null) {
			serviceContext = CommonUtils.getServiceContext(false);
		}
		long userId = serviceContext.getUserId();
		CommonUtils.printLog("userid:::"+userId);
		return UserLocalServiceUtil.getUser(userId);
	}

	public static ServiceContext getServiceContext(boolean scopeGroup) {
		ServiceContext context = ServiceContextThreadLocal.getServiceContext();
		if (context == null) {
			context = new ServiceContext();
		}
		if (scopeGroup) {
			System.out.println("scopeGroup:" + getServiceScopeGroupId() + ":context:" + context);
			context.setScopeGroupId(getServiceScopeGroupId());
			System.out.println("scopeGroup:" + context.getScopeGroupId());

		}
		return context;
	}

	public static long getUserOrganizationId() throws SystemException {
		List<Organization> organizations = null;
		try {
			organizations = OrganizationLocalServiceUtil.getUserOrganizations(PrincipalThreadLocal.getUserId(), false);
		} catch (PortalException e) {
			e.printStackTrace();
		}
		if (organizations != null && organizations.size() > 0) {
			for (Organization org : organizations) {
				if (!org.getType().equalsIgnoreCase("Location")) {
					return org.getOrganizationId();
				}
			}
		}
		return 0;
	}

	public static long getServiceScopeGroupId() {
		Properties props = PortalUtil.getPortalProperties();
		return Long.parseLong(props.getProperty("scopeGroupIdDms", "0"));
	}

	public static User addRole(User user, String roleName)
			throws SystemException, PortalException, NullPointerException {
		Role liferayRole = RoleLocalServiceUtil.fetchRole(CompanyThreadLocal.getCompanyId(), roleName);
		System.out.println("user:" + user.getUserId());
		System.out.println("Role:" + liferayRole);
		System.out.println("Role id :" + liferayRole.getRoleId());
		RoleLocalServiceUtil.addUserRole(user.getUserId(), liferayRole.getRoleId());
		UserLocalServiceUtil.updateUser(user);
		return user;
	}

	public static boolean hasRole(User user, String roleName) {
		boolean hasRole = false;
		try {
			List<Role> roles = user.getRoles();
			for (Role role : roles) {
				System.out.println("role::" + role.getName());
				System.out.println("role name::" + roleName);
				if (role.getName().equalsIgnoreCase(roleName)) {
					hasRole = true;
					System.out.println("match");
					return hasRole;
				}
			}
		} catch (Exception e) {
			// Need not handle
		}
		return false;
	}

	public static void printLog(String str) {
		System.out.println(str);
	}

	public static String getUserOrganizationNameByOrgId(long[] orgId) throws SystemException {
		Organization organization = null;
		try {
			for (int i = 0; i < orgId.length; i++) {
				organization = OrganizationLocalServiceUtil.getOrganization(orgId[i]);
				if (organization != null) {
					return organization.getName();
				}
			}

		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return "";
	}

	public static String getFileUrl(File file, String folderName, ServiceContext serviceContext, String uniqueName,
			String defaultUrl,String adminRole, String viewRole,String subFolderName,boolean isSubFolderExist) throws PortalException, SystemException {
		// CommonUtils.printLog("Mobile Number = "+serviceContext);
		// CommonUtils.printLog(CompanyThreadLocal.getCompanyId()+" folder class
		// name = "+DLFolder.class.getName()+" folder z =
		// "+ResourceConstants.SCOPE_INDIVIDUAL+" 2 = "+folder.getFolderId()+"
		// 3= ");
		CommonUtils.printLog("File Name == " + file.getName());
		/*if (file == null || !file.exists() || !file.isFile() || file.getName().endsWith(".")
				|| file.getName().endsWith(".tmp")) {
			CommonUtils.printLog("File null " );
			return defaultUrl;
		}*/
		if (file == null) {
			CommonUtils.printLog("File is null " );
			return defaultUrl;
		}
		
		CommonUtils.printLog("file is not null" );
		User currUser = CommonUtils.getCurrentUser();

		Folder folder = createFolder(currUser.getUserId(), CommonUtils.getServiceScopeGroupId(), 0, folderName,
				ServiceContextThreadLocal.getServiceContext(),adminRole,viewRole);

		CommonUtils.printLog("Folder = " + folder);

		String fileName = uniqueName + "-" + file.getName();
		/*if(file.getName().endsWith(".")) {
			fileName = fileName+"jpeg";
		}*/
		CommonUtils.printLog("fileName = " + fileName);
		try {
			FileEntry entry = null;
			CommonUtils.printLog("isSubFolderExist = " + isSubFolderExist);
			if(isSubFolderExist) {
				Folder subfolder = createFolder(currUser.getUserId(), CommonUtils.getServiceScopeGroupId(), folder.getFolderId(), subFolderName,
						ServiceContextThreadLocal.getServiceContext(),adminRole,viewRole);
				CommonUtils.printLog("subfolder = " + subfolder);
				
				entry = DLAppLocalServiceUtil.addFileEntry(currUser.getUserId(),
						CommonUtils.getServiceScopeGroupId(), subfolder.getFolderId(), fileName,
						MimeTypesUtil.getContentType(fileName), fileName, "", "", file, serviceContext);
				CommonUtils.printLog("entry = " + entry);
			}else {
				entry = DLAppLocalServiceUtil.addFileEntry(currUser.getUserId(),
						CommonUtils.getServiceScopeGroupId(), folder.getFolderId(), fileName,
						MimeTypesUtil.getContentType(fileName), fileName, "", "", file, serviceContext);
				CommonUtils.printLog("entry == " + entry);
			}
			CommonUtils.printLog("entry = ==" + entry);
			Role userRole = RoleLocalServiceUtil.getRole(CompanyThreadLocal.getCompanyId(), adminRole);
			ResourcePermissionLocalServiceUtil.setResourcePermissions(CompanyThreadLocal.getCompanyId(),
					DLFileEntry.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, "" + entry.getFileEntryId(),
					userRole.getRoleId(), new String[] { "UPDATE", "VIEW", "PERMISSIONS" });
			userRole = RoleLocalServiceUtil.getRole(CompanyThreadLocal.getCompanyId(), viewRole);
			CommonUtils.printLog("entry = =====" + entry);
			ResourcePermissionLocalServiceUtil.setResourcePermissions(CompanyThreadLocal.getCompanyId(),
					DLFileEntry.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, "" + entry.getFileEntryId(),
					userRole.getRoleId(), new String[] { "VIEW" });
			String url = "/documents/" + entry.getGroupId() + "/" + folder.getFolderId() + "/" + entry.getTitle() + "/"
					+ entry.getUuid();
			CommonUtils.printLog("url" + url);
			return url;
		} catch (Exception ex) {
			ex.printStackTrace();
			return defaultUrl;
		}

	}
	private static Folder createFolder(long userId, long groupId, long parentFolderId, String folderName,
			ServiceContext context,String adminRole, String viewRole) {

		Folder folder = null;
		Role userRole = null;
		try {
			User user = UserLocalServiceUtil.fetchUser(userId);
			// folder=DLFolderLocalServiceUtil.createDLFolder(CounterLocalServiceUtil.increment(DLFolder.class.getName(),1));

			CommonUtils.printLog("Repository ID = " + CommonUtils.getServiceScopeGroupId());
			try {
				folder = DLAppLocalServiceUtil.getFolder(CommonUtils.getServiceScopeGroupId(), parentFolderId,
						folderName);
			} catch (Exception ex) {
				ex.printStackTrace();

			}
			if (folder == null) {
				folder = DLAppLocalServiceUtil.addFolder(user.getUserId(), CommonUtils.getServiceScopeGroupId(),
						parentFolderId, folderName, folderName + " description", context);
				// DLFileEntryType
				// dlFileEntryType=DLFileEntryTypeLocalServiceUtil.createDLFileEntryType(CounterLocalServiceUtil.increment(DLFileEntryType.class.getName(),
				// 1));
				// DLFolderLocalServiceUtil.addDLFileEntryTypeDLFolder(0,
				// folder.getFolderId());
			}

			if (userRole == null) {
				userRole = RoleLocalServiceUtil.getRole(CompanyThreadLocal.getCompanyId(), adminRole);
			}

			// userRole =
			// RoleLocalServiceUtil.fetchRole(CompanyThreadLocal.getCompanyId(),
			// "Meeting Requester");

			ResourcePermissionLocalServiceUtil.setResourcePermissions(CompanyThreadLocal.getCompanyId(),
					DLFolder.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, "" + folder.getFolderId(),
					userRole.getRoleId(), new String[] { "ACCESS", "ADD_DOCUMENT", "ADD_SHORTCUT", "ADD_SUBFOLDER",
							"UPDATE", "VIEW", "PERMISSIONS" });
			userRole = RoleLocalServiceUtil.getRole(CompanyThreadLocal.getCompanyId(),viewRole);
			ResourcePermissionLocalServiceUtil.setResourcePermissions(CompanyThreadLocal.getCompanyId(),
					DLFolder.class.getName(), ResourceConstants.SCOPE_INDIVIDUAL, "" + folder.getFolderId(),
					userRole.getRoleId(), new String[] { "ACCESS", "VIEW" });
		} catch (PortalException e1) {
		//	e1.printStackTrace();
		} catch (Exception e1) {
			//e1.printStackTrace();
		}
		return folder;

	}
}
