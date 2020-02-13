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

package com.tc.poc.dms.service.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONObject;
import com.tc.poc.dms.exception.NoSuchDmsPocException;
import com.tc.poc.dms.model.DmsPoc;
import com.tc.poc.dms.service.base.DmsPocServiceBaseImpl;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * The implementation of the dms poc remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.tc.poc.dms.service.DmsPocService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Manisha Gera
 * @see DmsPocServiceBaseImpl
 * @see com.tc.poc.dms.service.DmsPocServiceUtil
 */
public class DmsPocServiceImpl extends DmsPocServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link com.tc.poc.dms.service.DmsPocServiceUtil} to access the dms poc remote service.
	 */
	public DmsPoc create(String vin, String model, String repairOrderNo, String regNo, String status) throws SystemException, PortalException {
		return dmsPocLocalService.create(vin,model,repairOrderNo,regNo,status);
	}
	public List<DmsPoc> findAll() throws SystemException {
		return dmsPocLocalService.findAll();
	}
	public List<DmsPoc> findAllToShow() throws SystemException {
		return dmsPocLocalService.findAllToShow();
	}
	
	public DmsPoc create(String repairOrderNo, String dealerCode, String authorisedDealerInfo, String dealershipName
			, String dealershipAddress,long dealerShipPhoneNo, long faxNo, String dealershipEmail, String GST
			, String customerName,String customerAddress, long customerMobileNo, String customerEmailAddress, String contactPerson
			, long contactPersonPhone,String regNo, String VIN, Date dateOfDelivery, long kmsIn
			, String model,String engineNo, String insurancePolicyNo, Date insuranceExpiryDate, boolean rsaRequired
			, String appointmentType,Date orderDateIn, Date orderTimeIn, String serviceAdvisor, long serviceAdvisorMobileNo
			, String soldByDealer,String customerMobilityType, String transactionNo, String reasonForVisit, String extendedWarranty
			, String servicePlan,String customerOrderDescription, String complaint, String workToBeDone, String instruction
			, String carPicture,String xDent, String scratch, String bodyDamage, String modificationOrNonOBMFittings
			, String tyreCondition,String treadDepth, String frontRight, String frontLeft, String rearRight
			, String rearLeft, String windowsGlazzing,String wiperBlades, String lights, String exhaustSystem, String underbody
			, String engineCompartment,String washing, String oilLevel, String coolant, String windshieldWasher
			, String brakes,String axle, String monograms, String polishing, String fuel
			, String ownersManual
			, String serScheMaintenanceManual, String infotainmentMmiNavigManual,String extWarrantyBook, String quickReferenceGuide, String spareWheel, String jackToolKits
			, String floorMat,String mudFlaps, String warningTriangle, String firstAidKit, long noOfKeys
			, String otherLooseItems,String financialInformation, String modeOfPayment, long estimatedCost, String taxesAsApplicable
			, Date estimatedDateOfDelivery
			, String estimatedDeliveryTime, long laborEstimate,long parts, String termsAndConditions, String grantMyConsent, String serviceAdvisotSignature
			, String customerSignature,String remarksArea, String termsStrictly, String workshopCopy, String version
			, boolean customerWaiting,String campaign, String dissNo, String descriptiveInformation, String timeStart
			, String timeStop,String nameOfTechnician,String technicianSignature,
			String partNumber, String partDescription, String partCatagory, String internalPartsOrder, String partQuantity
			, String partRate, String partCost, String partTotal, String labourDescription,
			String labourCatagory, String labourCode, String timeUnit, String hours, String labourRate, long labourCost, long labourTotal,
			String additionalRepairsReqDesc, String additionalRepairsReqPart, String additionalRepairsReqLabour, String additionalRepairsReqAuth, Date additionalRepairsReqDT, long roadTestKmOut,
			long roadTestKmIn, boolean allJobsAttended, boolean accessoriesSettingAsOriginal, String roadTestSignature, Date roadTestDate, boolean interiors, boolean interiorsPolishing, boolean exteriors,
			boolean exteriorsPolishing, boolean vacuumCleaned, String washingCheckerSignature, String status)
			throws SystemException, PortalException {
		return dmsPocLocalService.create(repairOrderNo, dealerCode, authorisedDealerInfo, dealershipName
				, dealershipAddress, dealerShipPhoneNo, faxNo, dealershipEmail, GST
				, customerName,customerAddress, customerMobileNo, customerEmailAddress, contactPerson
				, contactPersonPhone,regNo, VIN, dateOfDelivery, kmsIn
				, model,engineNo, insurancePolicyNo, insuranceExpiryDate, rsaRequired
				, appointmentType,orderDateIn, orderTimeIn, serviceAdvisor, serviceAdvisorMobileNo
				, soldByDealer,customerMobilityType, transactionNo, reasonForVisit, extendedWarranty
				, servicePlan,customerOrderDescription, complaint, workToBeDone, instruction
				, carPicture,xDent, scratch, bodyDamage, modificationOrNonOBMFittings
				, tyreCondition,treadDepth, frontRight, frontLeft, rearRight
				, rearLeft, windowsGlazzing,wiperBlades, lights, exhaustSystem, underbody
				, engineCompartment,washing, oilLevel, coolant, windshieldWasher
				, brakes,axle, monograms, polishing, fuel
				, ownersManual
				, serScheMaintenanceManual, infotainmentMmiNavigManual,extWarrantyBook, quickReferenceGuide, spareWheel, jackToolKits
				, floorMat,mudFlaps, warningTriangle, firstAidKit, noOfKeys
				, otherLooseItems,financialInformation, modeOfPayment, estimatedCost, taxesAsApplicable
				, estimatedDateOfDelivery
				, estimatedDeliveryTime, laborEstimate,parts, termsAndConditions, grantMyConsent, serviceAdvisotSignature
				, customerSignature,remarksArea, termsStrictly, workshopCopy, version
				, customerWaiting,campaign, dissNo, descriptiveInformation, timeStart
				, timeStop,nameOfTechnician,technicianSignature,
				partNumber, partDescription, partCatagory, internalPartsOrder, partQuantity
				, partRate, partCost, partTotal, labourDescription,
				labourCatagory, labourCode, timeUnit, hours, labourRate, labourCost, labourTotal,
				additionalRepairsReqDesc, additionalRepairsReqPart, additionalRepairsReqLabour, additionalRepairsReqAuth, additionalRepairsReqDT, roadTestKmOut,
				roadTestKmIn, allJobsAttended, accessoriesSettingAsOriginal, roadTestSignature, roadTestDate, interiors, interiorsPolishing, exteriors,
				exteriorsPolishing, vacuumCleaned, washingCheckerSignature, status);
	}

	
	public DmsPoc update(long id,String repairOrderNo, String dealerCode, String authorisedDealerInfo, String dealershipName
			, String dealershipAddress,long dealerShipPhoneNo, long faxNo, String dealershipEmail, String GST
			, String customerName,String customerAddress, long customerMobileNo, String customerEmailAddress, String contactPerson
			, long contactPersonPhone,String regNo, String VIN, Date dateOfDelivery, long kmsIn
			, String model,String engineNo, String insurancePolicyNo, Date insuranceExpiryDate, boolean rsaRequired
			, String appointmentType,Date orderDateIn, Date orderTimeIn, String serviceAdvisor, long serviceAdvisorMobileNo
			, String soldByDealer,String customerMobilityType, String transactionNo, String reasonForVisit, String extendedWarranty
			, String servicePlan,String customerOrderDescription, String complaint, String workToBeDone, String instruction
			, String carPicture,String xDent, String scratch, String bodyDamage, String modificationOrNonOBMFittings
			, String tyreCondition,String treadDepth, String frontRight, String frontLeft, String rearRight
			, String rearLeft, String windowsGlazzing,String wiperBlades, String lights, String exhaustSystem, String underbody
			, String engineCompartment,String washing, String oilLevel, String coolant, String windshieldWasher
			, String brakes,String axle, String monograms, String polishing, String fuel
			, String ownersManual
			, String serScheMaintenanceManual, String infotainmentMmiNavigManual,String extWarrantyBook, String quickReferenceGuide, String spareWheel, String jackToolKits
			, String floorMat,String mudFlaps, String warningTriangle, String firstAidKit, long noOfKeys
			, String otherLooseItems,String financialInformation, String modeOfPayment, long estimatedCost, String taxesAsApplicable
			, Date estimatedDateOfDelivery
			, String estimatedDeliveryTime, long laborEstimate,long parts, String termsAndConditions, String grantMyConsent, String serviceAdvisotSignature
			, String customerSignature,String remarksArea, String termsStrictly, String workshopCopy, String version
			, boolean customerWaiting,String campaign, String dissNo, String descriptiveInformation, String timeStart
			, String timeStop,String nameOfTechnician,String technicianSignature,
			String partNumber, String partDescription, String partCatagory, String internalPartsOrder, String partQuantity
			, String partRate, String partCost, String partTotal, String labourDescription,
			String labourCatagory, String labourCode, String timeUnit, String hours, String labourRate, long labourCost, long labourTotal,
			String additionalRepairsReqDesc, String additionalRepairsReqPart, String additionalRepairsReqLabour, String additionalRepairsReqAuth, Date additionalRepairsReqDT, long roadTestKmOut,
			long roadTestKmIn, boolean allJobsAttended, boolean accessoriesSettingAsOriginal, String roadTestSignature, Date roadTestDate, boolean interiors, boolean interiorsPolishing, boolean exteriors,
			boolean exteriorsPolishing, boolean vacuumCleaned, String washingCheckerSignature, String status)
			throws SystemException, PortalException {

		return dmsPocLocalService.update(id,repairOrderNo, dealerCode, authorisedDealerInfo, dealershipName
				, dealershipAddress, dealerShipPhoneNo, faxNo, dealershipEmail, GST
				, customerName,customerAddress, customerMobileNo, customerEmailAddress, contactPerson
				, contactPersonPhone,regNo, VIN, dateOfDelivery, kmsIn
				, model,engineNo, insurancePolicyNo, insuranceExpiryDate, rsaRequired
				, appointmentType,orderDateIn, orderTimeIn, serviceAdvisor, serviceAdvisorMobileNo
				, soldByDealer,customerMobilityType, transactionNo, reasonForVisit, extendedWarranty
				, servicePlan,customerOrderDescription, complaint, workToBeDone, instruction
				, carPicture,xDent, scratch, bodyDamage, modificationOrNonOBMFittings
				, tyreCondition,treadDepth, frontRight, frontLeft, rearRight
				, rearLeft, windowsGlazzing,wiperBlades, lights, exhaustSystem, underbody
				, engineCompartment,washing, oilLevel, coolant, windshieldWasher
				, brakes,axle, monograms, polishing, fuel
				, ownersManual
				, serScheMaintenanceManual, infotainmentMmiNavigManual,extWarrantyBook, quickReferenceGuide, spareWheel, jackToolKits
				, floorMat,mudFlaps, warningTriangle, firstAidKit, noOfKeys
				, otherLooseItems,financialInformation, modeOfPayment, estimatedCost, taxesAsApplicable
				, estimatedDateOfDelivery
				, estimatedDeliveryTime, laborEstimate,parts, termsAndConditions, grantMyConsent, serviceAdvisotSignature
				, customerSignature,remarksArea, termsStrictly, workshopCopy, version
				, customerWaiting,campaign, dissNo, descriptiveInformation, timeStart
				, timeStop,nameOfTechnician,technicianSignature,
				partNumber, partDescription, partCatagory, internalPartsOrder, partQuantity
				, partRate, partCost, partTotal, labourDescription,
				labourCatagory, labourCode, timeUnit, hours, labourRate, labourCost, labourTotal,
				additionalRepairsReqDesc, additionalRepairsReqPart, additionalRepairsReqLabour, additionalRepairsReqAuth, additionalRepairsReqDT, roadTestKmOut,
				roadTestKmIn, allJobsAttended, accessoriesSettingAsOriginal, roadTestSignature, roadTestDate, interiors, interiorsPolishing, exteriors,
				exteriorsPolishing, vacuumCleaned, washingCheckerSignature, status);
	}
	
	public DmsPoc find(long id) throws SystemException, NoSuchDmsPocException{
		return dmsPocLocalService.find(id);
	}
	
	public DmsPoc findByRegNo(String regNo) throws SystemException, NoSuchDmsPocException{
		return dmsPocLocalService.findByRegNo(regNo);
	}
	public DmsPoc findByVIN(String vin) throws SystemException, NoSuchDmsPocException{
		return dmsPocLocalService.findByVIN(vin);
	}
	public DmsPoc findByRegNoOrVIN(String regNo, String vin) throws SystemException, NoSuchDmsPocException{
		return dmsPocLocalService.findByRegNoOrVIN(regNo,vin);		
	}	
	public DmsPoc delete(long id) throws NoSuchDmsPocException, SystemException{
		return dmsPocLocalService.delete(id);
	}
	public DmsPoc updateToShow(long id,boolean toShow)
			throws SystemException, PortalException {
		DmsPoc dmsPoc = dmsPocPersistence.findByPrimaryKey(id);
		dmsPoc.setToShow(toShow);
		dmsPoc = dmsPocPersistence.update(dmsPoc);
		return dmsPoc;
	}
	public JSONObject saveScannedImage(String type,String dataUri,File image) throws SystemException, IOException, PortalException{
		return dmsPocLocalService.saveScannedImage(type,dataUri,image);
	}
	public JSONObject saveScannedImage(String type,String dataUri) throws SystemException, IOException, PortalException{
		return dmsPocLocalService.saveScannedImage(type,dataUri,null);
	}
	public DmsPoc updatePartsLabourInventory(long id, String inventoryPartsJSONStr,
			String partsJSONStr, String labourJSONStr, boolean toShow)
			throws SystemException, PortalException {
		return dmsPocLocalService.updatePartsLabourInventory(id,inventoryPartsJSONStr,
				partsJSONStr,labourJSONStr,toShow);
	}
		
}