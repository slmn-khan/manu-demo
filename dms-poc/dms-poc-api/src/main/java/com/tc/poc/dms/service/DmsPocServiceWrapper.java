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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link DmsPocService}.
 *
 * @author Manisha Gera
 * @see DmsPocService
 * @generated
 */
@ProviderType
public class DmsPocServiceWrapper implements DmsPocService,
	ServiceWrapper<DmsPocService> {
	public DmsPocServiceWrapper(DmsPocService dmsPocService) {
		_dmsPocService = dmsPocService;
	}

	@Override
	public com.tc.poc.dms.model.DmsPoc create(String vin, String model,
		String repairOrderNo, String regNo, String status)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.exception.PortalException {
		return _dmsPocService.create(vin, model, repairOrderNo, regNo, status);
	}

	@Override
	public com.tc.poc.dms.model.DmsPoc create(String repairOrderNo,
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
		return _dmsPocService.create(repairOrderNo, dealerCode,
			authorisedDealerInfo, dealershipName, dealershipAddress,
			dealerShipPhoneNo, faxNo, dealershipEmail, GST, customerName,
			customerAddress, customerMobileNo, customerEmailAddress,
			contactPerson, contactPersonPhone, regNo, VIN, dateOfDelivery,
			kmsIn, model, engineNo, insurancePolicyNo, insuranceExpiryDate,
			rsaRequired, appointmentType, orderDateIn, orderTimeIn,
			serviceAdvisor, serviceAdvisorMobileNo, soldByDealer,
			customerMobilityType, transactionNo, reasonForVisit,
			extendedWarranty, servicePlan, customerOrderDescription, complaint,
			workToBeDone, instruction, carPicture, xDent, scratch, bodyDamage,
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

	@Override
	public com.tc.poc.dms.model.DmsPoc delete(long id)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException,
			com.liferay.portal.kernel.exception.SystemException {
		return _dmsPocService.delete(id);
	}

	@Override
	public com.tc.poc.dms.model.DmsPoc find(long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tc.poc.dms.exception.NoSuchDmsPocException {
		return _dmsPocService.find(id);
	}

	@Override
	public java.util.List<com.tc.poc.dms.model.DmsPoc> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmsPocService.findAll();
	}

	@Override
	public java.util.List<com.tc.poc.dms.model.DmsPoc> findAllToShow()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _dmsPocService.findAllToShow();
	}

	@Override
	public com.tc.poc.dms.model.DmsPoc findByRegNo(String regNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tc.poc.dms.exception.NoSuchDmsPocException {
		return _dmsPocService.findByRegNo(regNo);
	}

	@Override
	public com.tc.poc.dms.model.DmsPoc findByRegNoOrVIN(String regNo, String vin)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tc.poc.dms.exception.NoSuchDmsPocException {
		return _dmsPocService.findByRegNoOrVIN(regNo, vin);
	}

	@Override
	public com.tc.poc.dms.model.DmsPoc findByVIN(String vin)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tc.poc.dms.exception.NoSuchDmsPocException {
		return _dmsPocService.findByVIN(vin);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _dmsPocService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject saveScannedImage(
		String type, String dataUri)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException,
			com.liferay.portal.kernel.exception.PortalException {
		return _dmsPocService.saveScannedImage(type, dataUri);
	}

	@Override
	public com.liferay.portal.kernel.json.JSONObject saveScannedImage(
		String type, String dataUri, java.io.File image)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException,
			com.liferay.portal.kernel.exception.PortalException {
		return _dmsPocService.saveScannedImage(type, dataUri, image);
	}

	@Override
	public com.tc.poc.dms.model.DmsPoc update(long id, String repairOrderNo,
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
		return _dmsPocService.update(id, repairOrderNo, dealerCode,
			authorisedDealerInfo, dealershipName, dealershipAddress,
			dealerShipPhoneNo, faxNo, dealershipEmail, GST, customerName,
			customerAddress, customerMobileNo, customerEmailAddress,
			contactPerson, contactPersonPhone, regNo, VIN, dateOfDelivery,
			kmsIn, model, engineNo, insurancePolicyNo, insuranceExpiryDate,
			rsaRequired, appointmentType, orderDateIn, orderTimeIn,
			serviceAdvisor, serviceAdvisorMobileNo, soldByDealer,
			customerMobilityType, transactionNo, reasonForVisit,
			extendedWarranty, servicePlan, customerOrderDescription, complaint,
			workToBeDone, instruction, carPicture, xDent, scratch, bodyDamage,
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

	@Override
	public com.tc.poc.dms.model.DmsPoc updatePartsLabourInventory(long id,
		String inventoryPartsJSONStr, String partsJSONStr,
		String labourJSONStr, boolean toShow)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.exception.PortalException {
		return _dmsPocService.updatePartsLabourInventory(id,
			inventoryPartsJSONStr, partsJSONStr, labourJSONStr, toShow);
	}

	@Override
	public com.tc.poc.dms.model.DmsPoc updateToShow(long id, boolean toShow)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.exception.PortalException {
		return _dmsPocService.updateToShow(id, toShow);
	}

	@Override
	public DmsPocService getWrappedService() {
		return _dmsPocService;
	}

	@Override
	public void setWrappedService(DmsPocService dmsPocService) {
		_dmsPocService = dmsPocService;
	}

	private DmsPocService _dmsPocService;
}