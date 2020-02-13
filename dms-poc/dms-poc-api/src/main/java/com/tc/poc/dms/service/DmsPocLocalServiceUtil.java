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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for DmsPoc. This utility wraps
 * {@link com.tc.poc.dms.service.impl.DmsPocLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Manisha Gera
 * @see DmsPocLocalService
 * @see com.tc.poc.dms.service.base.DmsPocLocalServiceBaseImpl
 * @see com.tc.poc.dms.service.impl.DmsPocLocalServiceImpl
 * @generated
 */
@ProviderType
public class DmsPocLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.tc.poc.dms.service.impl.DmsPocLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the dms poc to the database. Also notifies the appropriate model listeners.
	*
	* @param dmsPoc the dms poc
	* @return the dms poc that was added
	*/
	public static com.tc.poc.dms.model.DmsPoc addDmsPoc(
		com.tc.poc.dms.model.DmsPoc dmsPoc) {
		return getService().addDmsPoc(dmsPoc);
	}

	public static com.tc.poc.dms.model.DmsPoc create(String vin, String model,
		String repairOrderNo, String regNo, String status)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.exception.PortalException {
		return getService().create(vin, model, repairOrderNo, regNo, status);
	}

	public static com.tc.poc.dms.model.DmsPoc create(String repairOrderNo,
		String dealerCode, String authorisedDealerInfo, String dealershipName,
		String dealershipAddress, long dealerShipPhoneNo, long faxNo,
		String dealershipEmail, String GST, String customerName,
		String customerAddress, long customerMobileNo,
		String customerEmailAddress, String contactPerson,
		long contactPersonPhone, String regNo, String VIN,
		java.util.Date dateOfDelivery, long kmsIn, String model,
		String engineNo, String insurancePolicyNo,
		java.util.Date insuranceExpiryDate, boolean rsaRequired,
		String appointmentType, java.util.Date orderDateIn,
		java.util.Date orderTimeIn, String serviceAdvisor,
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
		java.util.Date estimatedDateOfDelivery, String estimatedDeliveryTime,
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
		String additionalRepairsReqAuth, java.util.Date additionalRepairsReqDT,
		long roadTestKmOut, long roadTestKmIn, boolean allJobsAttended,
		boolean accessoriesSettingAsOriginal, String roadTestSignature,
		java.util.Date roadTestDate, boolean interiors,
		boolean interiorsPolishing, boolean exteriors,
		boolean exteriorsPolishing, boolean vacuumCleaned,
		String washingCheckerSignature, String status)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .create(repairOrderNo, dealerCode, authorisedDealerInfo,
			dealershipName, dealershipAddress, dealerShipPhoneNo, faxNo,
			dealershipEmail, GST, customerName, customerAddress,
			customerMobileNo, customerEmailAddress, contactPerson,
			contactPersonPhone, regNo, VIN, dateOfDelivery, kmsIn, model,
			engineNo, insurancePolicyNo, insuranceExpiryDate, rsaRequired,
			appointmentType, orderDateIn, orderTimeIn, serviceAdvisor,
			serviceAdvisorMobileNo, soldByDealer, customerMobilityType,
			transactionNo, reasonForVisit, extendedWarranty, servicePlan,
			customerOrderDescription, complaint, workToBeDone, instruction,
			carPicture, xDent, scratch, bodyDamage,
			modificationOrNonOBMFittings, tyreCondition, treadDepth,
			frontRight, frontLeft, rearRight, rearLeft, windowsGlazzing,
			wiperBlades, lights, exhaustSystem, underbody, engineCompartment,
			washing, oilLevel, coolant, windshieldWasher, brakes, axle,
			monograms, polishing, fuel, ownersManual, serScheMaintenanceManual,
			infotainmentMmiNavigManual, extWarrantyBook, quickReferenceGuide,
			spareWheel, jackToolKits, floorMat, mudFlaps, warningTriangle,
			firstAidKit, noOfKeys, otherLooseItems, financialInformation,
			modeOfPayment, estimatedCost, taxesAsApplicable,
			estimatedDateOfDelivery, estimatedDeliveryTime, laborEstimate,
			parts, termsAndConditions, grantMyConsent, serviceAdvisotSignature,
			customerSignature, remarksArea, termsStrictly, workshopCopy,
			version, customerWaiting, campaign, dissNo, descriptiveInformation,
			timeStart, timeStop, nameOfTechnician, technicianSignature,
			partNumber, partDescription, partCatagory, internalPartsOrder,
			partQuantity, partRate, partCost, partTotal, labourDescription,
			labourCatagory, labourCode, timeUnit, hours, labourRate,
			labourCost, labourTotal, additionalRepairsReqDesc,
			additionalRepairsReqPart, additionalRepairsReqLabour,
			additionalRepairsReqAuth, additionalRepairsReqDT, roadTestKmOut,
			roadTestKmIn, allJobsAttended, accessoriesSettingAsOriginal,
			roadTestSignature, roadTestDate, interiors, interiorsPolishing,
			exteriors, exteriorsPolishing, vacuumCleaned,
			washingCheckerSignature, status);
	}

	/**
	* Creates a new dms poc with the primary key. Does not add the dms poc to the database.
	*
	* @param id the primary key for the new dms poc
	* @return the new dms poc
	*/
	public static com.tc.poc.dms.model.DmsPoc createDmsPoc(long id) {
		return getService().createDmsPoc(id);
	}

	public static com.tc.poc.dms.model.DmsPoc delete(long id)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().delete(id);
	}

	/**
	* Deletes the dms poc from the database. Also notifies the appropriate model listeners.
	*
	* @param dmsPoc the dms poc
	* @return the dms poc that was removed
	*/
	public static com.tc.poc.dms.model.DmsPoc deleteDmsPoc(
		com.tc.poc.dms.model.DmsPoc dmsPoc) {
		return getService().deleteDmsPoc(dmsPoc);
	}

	/**
	* Deletes the dms poc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dms poc
	* @return the dms poc that was removed
	* @throws PortalException if a dms poc with the primary key could not be found
	*/
	public static com.tc.poc.dms.model.DmsPoc deleteDmsPoc(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteDmsPoc(id);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.tc.poc.dms.model.DmsPoc fetchDmsPoc(long id) {
		return getService().fetchDmsPoc(id);
	}

	/**
	* Returns the dms poc matching the UUID and group.
	*
	* @param uuid the dms poc's UUID
	* @param groupId the primary key of the group
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public static com.tc.poc.dms.model.DmsPoc fetchDmsPocByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchDmsPocByUuidAndGroupId(uuid, groupId);
	}

	public static com.tc.poc.dms.model.DmsPoc find(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getService().find(id);
	}

	public static java.util.List<com.tc.poc.dms.model.DmsPoc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAll();
	}

	public static java.util.List<com.tc.poc.dms.model.DmsPoc> findAllToShow()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().findAllToShow();
	}

	public static com.tc.poc.dms.model.DmsPoc findByRegNo(String regNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getService().findByRegNo(regNo);
	}

	public static com.tc.poc.dms.model.DmsPoc findByRegNoOrVIN(String regNo,
		String vin)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getService().findByRegNoOrVIN(regNo, vin);
	}

	public static com.tc.poc.dms.model.DmsPoc findByVIN(String vin)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getService().findByVIN(vin);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the dms poc with the primary key.
	*
	* @param id the primary key of the dms poc
	* @return the dms poc
	* @throws PortalException if a dms poc with the primary key could not be found
	*/
	public static com.tc.poc.dms.model.DmsPoc getDmsPoc(long id)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDmsPoc(id);
	}

	/**
	* Returns the dms poc matching the UUID and group.
	*
	* @param uuid the dms poc's UUID
	* @param groupId the primary key of the group
	* @return the matching dms poc
	* @throws PortalException if a matching dms poc could not be found
	*/
	public static com.tc.poc.dms.model.DmsPoc getDmsPocByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getDmsPocByUuidAndGroupId(uuid, groupId);
	}

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
	public static java.util.List<com.tc.poc.dms.model.DmsPoc> getDmsPocs(
		int start, int end) {
		return getService().getDmsPocs(start, end);
	}

	/**
	* Returns all the dms pocs matching the UUID and company.
	*
	* @param uuid the UUID of the dms pocs
	* @param companyId the primary key of the company
	* @return the matching dms pocs, or an empty list if no matches were found
	*/
	public static java.util.List<com.tc.poc.dms.model.DmsPoc> getDmsPocsByUuidAndCompanyId(
		String uuid, long companyId) {
		return getService().getDmsPocsByUuidAndCompanyId(uuid, companyId);
	}

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
	public static java.util.List<com.tc.poc.dms.model.DmsPoc> getDmsPocsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.tc.poc.dms.model.DmsPoc> orderByComparator) {
		return getService()
				   .getDmsPocsByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of dms pocs.
	*
	* @return the number of dms pocs
	*/
	public static int getDmsPocsCount() {
		return getService().getDmsPocsCount();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	public static com.liferay.portal.kernel.json.JSONObject saveScannedImage(
		String type, String dataUri, java.io.File image)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException,
			com.liferay.portal.kernel.exception.PortalException {
		return getService().saveScannedImage(type, dataUri, image);
	}

	public static com.tc.poc.dms.model.DmsPoc update(long id,
		String repairOrderNo, String dealerCode, String authorisedDealerInfo,
		String dealershipName, String dealershipAddress,
		long dealerShipPhoneNo, long faxNo, String dealershipEmail, String GST,
		String customerName, String customerAddress, long customerMobileNo,
		String customerEmailAddress, String contactPerson,
		long contactPersonPhone, String regNo, String VIN,
		java.util.Date dateOfDelivery, long kmsIn, String model,
		String engineNo, String insurancePolicyNo,
		java.util.Date insuranceExpiryDate, boolean rsaRequired,
		String appointmentType, java.util.Date orderDateIn,
		java.util.Date orderTimeIn, String serviceAdvisor,
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
		java.util.Date estimatedDateOfDelivery, String estimatedDeliveryTime,
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
		String additionalRepairsReqAuth, java.util.Date additionalRepairsReqDT,
		long roadTestKmOut, long roadTestKmIn, boolean allJobsAttended,
		boolean accessoriesSettingAsOriginal, String roadTestSignature,
		java.util.Date roadTestDate, boolean interiors,
		boolean interiorsPolishing, boolean exteriors,
		boolean exteriorsPolishing, boolean vacuumCleaned,
		String washingCheckerSignature, String status)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .update(id, repairOrderNo, dealerCode, authorisedDealerInfo,
			dealershipName, dealershipAddress, dealerShipPhoneNo, faxNo,
			dealershipEmail, GST, customerName, customerAddress,
			customerMobileNo, customerEmailAddress, contactPerson,
			contactPersonPhone, regNo, VIN, dateOfDelivery, kmsIn, model,
			engineNo, insurancePolicyNo, insuranceExpiryDate, rsaRequired,
			appointmentType, orderDateIn, orderTimeIn, serviceAdvisor,
			serviceAdvisorMobileNo, soldByDealer, customerMobilityType,
			transactionNo, reasonForVisit, extendedWarranty, servicePlan,
			customerOrderDescription, complaint, workToBeDone, instruction,
			carPicture, xDent, scratch, bodyDamage,
			modificationOrNonOBMFittings, tyreCondition, treadDepth,
			frontRight, frontLeft, rearRight, rearLeft, windowsGlazzing,
			wiperBlades, lights, exhaustSystem, underbody, engineCompartment,
			washing, oilLevel, coolant, windshieldWasher, brakes, axle,
			monograms, polishing, fuel, ownersManual, serScheMaintenanceManual,
			infotainmentMmiNavigManual, extWarrantyBook, quickReferenceGuide,
			spareWheel, jackToolKits, floorMat, mudFlaps, warningTriangle,
			firstAidKit, noOfKeys, otherLooseItems, financialInformation,
			modeOfPayment, estimatedCost, taxesAsApplicable,
			estimatedDateOfDelivery, estimatedDeliveryTime, laborEstimate,
			parts, termsAndConditions, grantMyConsent, serviceAdvisotSignature,
			customerSignature, remarksArea, termsStrictly, workshopCopy,
			version, customerWaiting, campaign, dissNo, descriptiveInformation,
			timeStart, timeStop, nameOfTechnician, technicianSignature,
			partNumber, partDescription, partCatagory, internalPartsOrder,
			partQuantity, partRate, partCost, partTotal, labourDescription,
			labourCatagory, labourCode, timeUnit, hours, labourRate,
			labourCost, labourTotal, additionalRepairsReqDesc,
			additionalRepairsReqPart, additionalRepairsReqLabour,
			additionalRepairsReqAuth, additionalRepairsReqDT, roadTestKmOut,
			roadTestKmIn, allJobsAttended, accessoriesSettingAsOriginal,
			roadTestSignature, roadTestDate, interiors, interiorsPolishing,
			exteriors, exteriorsPolishing, vacuumCleaned,
			washingCheckerSignature, status);
	}

	/**
	* Updates the dms poc in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param dmsPoc the dms poc
	* @return the dms poc that was updated
	*/
	public static com.tc.poc.dms.model.DmsPoc updateDmsPoc(
		com.tc.poc.dms.model.DmsPoc dmsPoc) {
		return getService().updateDmsPoc(dmsPoc);
	}

	public static com.tc.poc.dms.model.DmsPoc updatePartsLabourInventory(
		long id, String inventoryPartsJSONStr, String partsJSONStr,
		String labourJSONStr, boolean toShow)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .updatePartsLabourInventory(id, inventoryPartsJSONStr,
			partsJSONStr, labourJSONStr, toShow);
	}

	public static com.tc.poc.dms.model.DmsPoc updateToShow(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.exception.PortalException {
		return getService().updateToShow(id);
	}

	public static DmsPocLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DmsPocLocalService, DmsPocLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(DmsPocLocalService.class);

		ServiceTracker<DmsPocLocalService, DmsPocLocalService> serviceTracker = new ServiceTracker<DmsPocLocalService, DmsPocLocalService>(bundle.getBundleContext(),
				DmsPocLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}