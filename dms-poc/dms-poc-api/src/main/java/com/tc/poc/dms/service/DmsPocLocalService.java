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

package com.tc.poc.dms.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.PortletDataContext;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.tc.poc.dms.exception.NoSuchDmsPocException;
import com.tc.poc.dms.model.DmsPoc;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

import java.util.Date;
import java.util.List;

/**
 * Provides the local service interface for DmsPoc. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Manisha Gera
 * @see DmsPocLocalServiceUtil
 * @see com.tc.poc.dms.service.base.DmsPocLocalServiceBaseImpl
 * @see com.tc.poc.dms.service.impl.DmsPocLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface DmsPocLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmsPocLocalServiceUtil} to access the dms poc local service. Add custom service methods to {@link com.tc.poc.dms.service.impl.DmsPocLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the dms poc to the database. Also notifies the appropriate model listeners.
	*
	* @param dmsPoc the dms poc
	* @return the dms poc that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public DmsPoc addDmsPoc(DmsPoc dmsPoc);

	public DmsPoc create(String vin, String model, String repairOrderNo,
		String regNo, String status) throws SystemException, PortalException;

	public DmsPoc create(String repairOrderNo, String dealerCode,
		String authorisedDealerInfo, String dealershipName,
		String dealershipAddress, long dealerShipPhoneNo, long faxNo,
		String dealershipEmail, String GST, String customerName,
		String customerAddress, long customerMobileNo,
		String customerEmailAddress, String contactPerson,
		long contactPersonPhone, String regNo, String VIN, Date dateOfDelivery,
		long kmsIn, String model, String engineNo, String insurancePolicyNo,
		Date insuranceExpiryDate, boolean rsaRequired, String appointmentType,
		Date orderDateIn, Date orderTimeIn, String serviceAdvisor,
		long serviceAdvisorMobileNo, String soldByDealer,
		String customerMobilityType, String transactionNo,
		String reasonForVisit, String extendedWarranty, String servicePlan,
		String customerOrderDescription, String complaint, String workToBeDone,
		String instruction, String carPicture, String xDent, String scratch,
		String bodyDamage, String modificationOrNonOBMFittings,
		String tyreCondition, String treadDepth, String frontRight,
		String frontLeft, String rearRight, String rearLeft,
		String windowsGlazzing, String wiperBlades, String lights,
		String exhaustSystem, String underbody, String engineCompartment,
		String washing, String oilLevel, String coolant,
		String windshieldWasher, String brakes, String axle, String monograms,
		String polishing, String fuel, String ownersManual,
		String serScheMaintenanceManual, String infotainmentMmiNavigManual,
		String extWarrantyBook, String quickReferenceGuide, String spareWheel,
		String jackToolKits, String floorMat, String mudFlaps,
		String warningTriangle, String firstAidKit, long noOfKeys,
		String otherLooseItems, String financialInformation,
		String modeOfPayment, long estimatedCost, String taxesAsApplicable,
		Date estimatedDateOfDelivery, String estimatedDeliveryTime,
		long laborEstimate, long parts, String termsAndConditions,
		String grantMyConsent, String serviceAdvisotSignature,
		String customerSignature, String remarksArea, String termsStrictly,
		String workshopCopy, String version, boolean customerWaiting,
		String campaign, String dissNo, String descriptiveInformation,
		String timeStart, String timeStop, String nameOfTechnician,
		String technicianSignature, String partNumber, String partDescription,
		String partCatagory, String internalPartsOrder, String partQuantity,
		String partRate, String partCost, String partTotal,
		String labourDescription, String labourCatagory, String labourCode,
		String timeUnit, String hours, String labourRate, long labourCost,
		long labourTotal, String additionalRepairsReqDesc,
		String additionalRepairsReqPart, String additionalRepairsReqLabour,
		String additionalRepairsReqAuth, Date additionalRepairsReqDT,
		long roadTestKmOut, long roadTestKmIn, boolean allJobsAttended,
		boolean accessoriesSettingAsOriginal, String roadTestSignature,
		Date roadTestDate, boolean interiors, boolean interiorsPolishing,
		boolean exteriors, boolean exteriorsPolishing, boolean vacuumCleaned,
		String washingCheckerSignature, String status)
		throws SystemException, PortalException;

	/**
	* Creates a new dms poc with the primary key. Does not add the dms poc to the database.
	*
	* @param id the primary key for the new dms poc
	* @return the new dms poc
	*/
	@Transactional(enabled = false)
	public DmsPoc createDmsPoc(long id);

	public DmsPoc delete(long id) throws NoSuchDmsPocException, SystemException;

	/**
	* Deletes the dms poc from the database. Also notifies the appropriate model listeners.
	*
	* @param dmsPoc the dms poc
	* @return the dms poc that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public DmsPoc deleteDmsPoc(DmsPoc dmsPoc);

	/**
	* Deletes the dms poc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dms poc
	* @return the dms poc that was removed
	* @throws PortalException if a dms poc with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public DmsPoc deleteDmsPoc(long id) throws PortalException;

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tc.poc.dms.model.impl.DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tc.poc.dms.model.impl.DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DmsPoc fetchDmsPoc(long id);

	/**
	* Returns the dms poc matching the UUID and group.
	*
	* @param uuid the dms poc's UUID
	* @param groupId the primary key of the group
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DmsPoc fetchDmsPocByUuidAndGroupId(String uuid, long groupId);

	public DmsPoc find(long id) throws SystemException, NoSuchDmsPocException;

	public List<DmsPoc> findAll() throws SystemException;

	public List<DmsPoc> findAllToShow() throws SystemException;

	public DmsPoc findByRegNo(String regNo)
		throws SystemException, NoSuchDmsPocException;

	public DmsPoc findByRegNoOrVIN(String regNo, String vin)
		throws SystemException, NoSuchDmsPocException;

	public DmsPoc findByVIN(String vin)
		throws SystemException, NoSuchDmsPocException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	* Returns the dms poc with the primary key.
	*
	* @param id the primary key of the dms poc
	* @return the dms poc
	* @throws PortalException if a dms poc with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DmsPoc getDmsPoc(long id) throws PortalException;

	/**
	* Returns the dms poc matching the UUID and group.
	*
	* @param uuid the dms poc's UUID
	* @param groupId the primary key of the group
	* @return the matching dms poc
	* @throws PortalException if a matching dms poc could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DmsPoc getDmsPocByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

	/**
	* Returns a range of all the dms pocs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.tc.poc.dms.model.impl.DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dms pocs
	* @param end the upper bound of the range of dms pocs (not inclusive)
	* @return the range of dms pocs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DmsPoc> getDmsPocs(int start, int end);

	/**
	* Returns all the dms pocs matching the UUID and company.
	*
	* @param uuid the UUID of the dms pocs
	* @param companyId the primary key of the company
	* @return the matching dms pocs, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DmsPoc> getDmsPocsByUuidAndCompanyId(String uuid, long companyId);

	/**
	* Returns a range of dms pocs matching the UUID and company.
	*
	* @param uuid the UUID of the dms pocs
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of dms pocs
	* @param end the upper bound of the range of dms pocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching dms pocs, or an empty list if no matches were found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DmsPoc> getDmsPocsByUuidAndCompanyId(String uuid,
		long companyId, int start, int end,
		OrderByComparator<DmsPoc> orderByComparator);

	/**
	* Returns the number of dms pocs.
	*
	* @return the number of dms pocs
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDmsPocsCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	public JSONObject saveScannedImage(String type, String dataUri, File image)
		throws SystemException, IOException, PortalException;

	public DmsPoc update(long id, String repairOrderNo, String dealerCode,
		String authorisedDealerInfo, String dealershipName,
		String dealershipAddress, long dealerShipPhoneNo, long faxNo,
		String dealershipEmail, String GST, String customerName,
		String customerAddress, long customerMobileNo,
		String customerEmailAddress, String contactPerson,
		long contactPersonPhone, String regNo, String VIN, Date dateOfDelivery,
		long kmsIn, String model, String engineNo, String insurancePolicyNo,
		Date insuranceExpiryDate, boolean rsaRequired, String appointmentType,
		Date orderDateIn, Date orderTimeIn, String serviceAdvisor,
		long serviceAdvisorMobileNo, String soldByDealer,
		String customerMobilityType, String transactionNo,
		String reasonForVisit, String extendedWarranty, String servicePlan,
		String customerOrderDescription, String complaint, String workToBeDone,
		String instruction, String carPicture, String xDent, String scratch,
		String bodyDamage, String modificationOrNonOBMFittings,
		String tyreCondition, String treadDepth, String frontRight,
		String frontLeft, String rearRight, String rearLeft,
		String windowsGlazzing, String wiperBlades, String lights,
		String exhaustSystem, String underbody, String engineCompartment,
		String washing, String oilLevel, String coolant,
		String windshieldWasher, String brakes, String axle, String monograms,
		String polishing, String fuel, String ownersManual,
		String serScheMaintenanceManual, String infotainmentMmiNavigManual,
		String extWarrantyBook, String quickReferenceGuide, String spareWheel,
		String jackToolKits, String floorMat, String mudFlaps,
		String warningTriangle, String firstAidKit, long noOfKeys,
		String otherLooseItems, String financialInformation,
		String modeOfPayment, long estimatedCost, String taxesAsApplicable,
		Date estimatedDateOfDelivery, String estimatedDeliveryTime,
		long laborEstimate, long parts, String termsAndConditions,
		String grantMyConsent, String serviceAdvisotSignature,
		String customerSignature, String remarksArea, String termsStrictly,
		String workshopCopy, String version, boolean customerWaiting,
		String campaign, String dissNo, String descriptiveInformation,
		String timeStart, String timeStop, String nameOfTechnician,
		String technicianSignature, String partNumber, String partDescription,
		String partCatagory, String internalPartsOrder, String partQuantity,
		String partRate, String partCost, String partTotal,
		String labourDescription, String labourCatagory, String labourCode,
		String timeUnit, String hours, String labourRate, long labourCost,
		long labourTotal, String additionalRepairsReqDesc,
		String additionalRepairsReqPart, String additionalRepairsReqLabour,
		String additionalRepairsReqAuth, Date additionalRepairsReqDT,
		long roadTestKmOut, long roadTestKmIn, boolean allJobsAttended,
		boolean accessoriesSettingAsOriginal, String roadTestSignature,
		Date roadTestDate, boolean interiors, boolean interiorsPolishing,
		boolean exteriors, boolean exteriorsPolishing, boolean vacuumCleaned,
		String washingCheckerSignature, String status)
		throws SystemException, PortalException;

	/**
	* Updates the dms poc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmsPoc the dms poc
	* @return the dms poc that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public DmsPoc updateDmsPoc(DmsPoc dmsPoc);

	public DmsPoc updatePartsLabourInventory(long id,
		String inventoryPartsJSONStr, String partsJSONStr,
		String labourJSONStr, boolean toShow)
		throws SystemException, PortalException;

	public DmsPoc updateToShow(long id) throws SystemException, PortalException;
}