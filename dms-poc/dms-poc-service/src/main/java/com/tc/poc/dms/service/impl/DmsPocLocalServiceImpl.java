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
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.security.auth.PrincipalThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.tc.poc.dms.exception.NoSuchDmsPocException;
import com.tc.poc.dms.model.DmsPoc;
import com.tc.poc.dms.service.base.DmsPocLocalServiceBaseImpl;
import com.tc.poc.dms.util.CommonUtils;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.imageio.ImageIO;
import javax.xml.bind.DatatypeConverter;

/**
 * The implementation of the dms poc local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.tc.poc.dms.service.DmsPocLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Manisha Gera
 * @see DmsPocLocalServiceBaseImpl
 * @see com.tc.poc.dms.service.DmsPocLocalServiceUtil
 */
public class DmsPocLocalServiceImpl extends DmsPocLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link
	 * com.tc.poc.dms.service.DmsPocLocalServiceUtil} to access the dms poc local
	 * service.
	 */
	public DmsPoc create(String vin, String model, String repairOrderNo, String regNo, String status)
			throws SystemException, PortalException {

		long dmsPocId = counterLocalService.increment();
		DmsPoc dmsPoc = dmsPocPersistence.create(dmsPocId);
		dmsPoc.setCreateDate(new Date());
		dmsPoc.setUserName(CommonUtils.getCurrentUser().getFullName());
		dmsPoc.setModifiedDate(new Date());
		dmsPoc.setModifiedBy(PrincipalThreadLocal.getUserId());
		dmsPoc.setModifiedByName(CommonUtils.getCurrentUser().getFullName());
		dmsPoc.setUserId(PrincipalThreadLocal.getUserId());

		dmsPoc.setGroupId(CommonUtils.getServiceScopeGroupId());
		dmsPoc.setOrgId(CommonUtils.getUserOrganizationId());

		dmsPoc.setModel(model);
		dmsPoc.setRegNo(regNo);
		dmsPoc.setVIN(vin);
		dmsPoc.setRepairOrderNo(repairOrderNo);
		dmsPoc.setStatus(status);

		dmsPoc = dmsPocPersistence.update(dmsPoc);
		return dmsPoc;
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
		try {
			DmsPoc dmsPocTemp = dmsPocPersistence.findByVin(VIN);
			if(dmsPocTemp != null) {
				throw new SystemException("Vehicle Id is already registered with us.");
			}	
		}catch(NoSuchDmsPocException ex) {
			
		}
		
		long dmsPocId = counterLocalService.increment();
		DmsPoc dmsPoc = dmsPocPersistence.create(dmsPocId);
		
		dmsPoc.setCreateDate(new Date());
		dmsPoc.setUserName(CommonUtils.getCurrentUser().getFullName());
		dmsPoc.setModifiedDate(new Date());
		dmsPoc.setModifiedBy(PrincipalThreadLocal.getUserId());
		dmsPoc.setModifiedByName(CommonUtils.getCurrentUser().getFullName());
		dmsPoc.setUserId(PrincipalThreadLocal.getUserId());

		dmsPoc.setGroupId(CommonUtils.getServiceScopeGroupId());
		dmsPoc.setOrgId(CommonUtils.getUserOrganizationId());
		
		dmsPoc.setRepairOrderNo(repairOrderNo);
		dmsPoc.setDealerCode(dealerCode);
		dmsPoc.setAuthorisedDealerInfo(authorisedDealerInfo);
		dmsPoc.setDealershipName(dealershipName);
		dmsPoc.setDealershipAddress(dealershipAddress);
		dmsPoc.setDealerShipPhoneNo(dealerShipPhoneNo);
		dmsPoc.setFaxNo(faxNo);
		dmsPoc.setDealershipEmail(dealershipEmail);
		dmsPoc.setGST(GST);
		dmsPoc.setCustomerName(customerName);
		dmsPoc.setCustomerAddress(customerAddress);
		dmsPoc.setCustomerMobileNo(customerMobileNo);
		dmsPoc.setCustomerEmailAddress(customerEmailAddress);
		dmsPoc.setContactPerson(contactPerson);
		dmsPoc.setContactPersonPhone(contactPersonPhone);
		dmsPoc.setRegNo(regNo);
		dmsPoc.setVIN(VIN);
		dmsPoc.setDateOfDelivery(dateOfDelivery);
		dmsPoc.setKmsIn(kmsIn);
		dmsPoc.setModel(model);
		dmsPoc.setEngineNo(engineNo);
		dmsPoc.setInsurancePolicyNo(insurancePolicyNo);
		dmsPoc.setInsuranceExpiryDate(insuranceExpiryDate);
		dmsPoc.setRsaRequired(rsaRequired);
		dmsPoc.setAppointmentType(appointmentType);
		dmsPoc.setOrderDateIn(orderDateIn);
		dmsPoc.setOrderTimeIn(orderTimeIn);
		dmsPoc.setServiceAdvisor(serviceAdvisor);
		dmsPoc.setServiceAdvisorMobileNo(serviceAdvisorMobileNo);
		dmsPoc.setSoldByDealer(soldByDealer);
		dmsPoc.setCustomerMobilityType(customerMobilityType);
		dmsPoc.setTransactionNo(transactionNo);
		dmsPoc.setReasonForVisit(reasonForVisit);
		dmsPoc.setExtendedWarranty(extendedWarranty);
		dmsPoc.setServicePlan(servicePlan);
		dmsPoc.setCustomerOrderDescription(customerOrderDescription);
		dmsPoc.setComplaint(complaint);
		dmsPoc.setWorkToBeDone(workToBeDone);
		dmsPoc.setInstruction(instruction);
		dmsPoc.setCarPicture(carPicture);
		dmsPoc.setXDent(xDent);
		dmsPoc.setScratch(scratch);
		dmsPoc.setBodyDamage(bodyDamage);
		dmsPoc.setModificationOrNonOBMFittings(modificationOrNonOBMFittings);
		dmsPoc.setTyreCondition(tyreCondition);
		dmsPoc.setTreadDepth(treadDepth);
		dmsPoc.setFrontLeft(frontLeft);
		dmsPoc.setFrontRight(frontRight);
		dmsPoc.setRearLeft(rearLeft);
		dmsPoc.setRearRight(rearRight);
		dmsPoc.setWindowsGlazzing(windowsGlazzing);
		dmsPoc.setWiperBlades(wiperBlades);
		dmsPoc.setLights(lights);
		dmsPoc.setExhaustSystem(exhaustSystem);
		dmsPoc.setUnderbody(underbody);
		dmsPoc.setEngineCompartment(engineCompartment);
		dmsPoc.setWashing(washing);
		dmsPoc.setOilLevel(oilLevel);
		dmsPoc.setCoolant(coolant);
		dmsPoc.setWindshieldWasher(windshieldWasher);
		dmsPoc.setBrakes(brakes);
		dmsPoc.setAxle(axle);
		dmsPoc.setMonograms(monograms);
		dmsPoc.setPolishing(polishing);
		dmsPoc.setFuel(fuel);
		dmsPoc.setOwnersManual(ownersManual);
		dmsPoc.setSerScheMaintenanceManual(serScheMaintenanceManual);
		dmsPoc.setInfotainmentMmiNavigManual(infotainmentMmiNavigManual);
		dmsPoc.setExtWarrantyBook(extWarrantyBook);
		dmsPoc.setQuickReferenceGuide(quickReferenceGuide);
		dmsPoc.setSpareWheel(spareWheel);
		dmsPoc.setJackToolKits(jackToolKits);
		dmsPoc.setFloorMat(floorMat);
		dmsPoc.setMudFlaps(mudFlaps);
		dmsPoc.setWarningTriangle(warningTriangle);
		dmsPoc.setFirstAidKit(firstAidKit);
		dmsPoc.setNoOfKeys(noOfKeys);
		dmsPoc.setOtherLooseItems(otherLooseItems);
		dmsPoc.setFinancialInformation(financialInformation);
		dmsPoc.setModeOfPayment(modeOfPayment);
		dmsPoc.setEstimatedCost(estimatedCost);
		dmsPoc.setTaxesAsApplicable(taxesAsApplicable);
		dmsPoc.setEstimatedDateOfDelivery(estimatedDateOfDelivery);
		dmsPoc.setEstimatedDeliveryTime(estimatedDeliveryTime);
		dmsPoc.setLaborEstimate(laborEstimate);
		dmsPoc.setParts(parts);
		dmsPoc.setTermsAndConditions(termsAndConditions);
		dmsPoc.setGrantMyConsent(grantMyConsent);
		dmsPoc.getServiceAdvisotSignature();
		dmsPoc.setCustomerSignature(customerSignature);
		dmsPoc.setRemarksArea(remarksArea);
		dmsPoc.setTermsStrictly(termsStrictly);
		dmsPoc.setWorkshopCopy(workshopCopy);
		dmsPoc.setVersion(version);
		dmsPoc.setCustomerWaiting(customerWaiting);
		dmsPoc.setCampaign(campaign);
		dmsPoc.setDissNo(dissNo);
		dmsPoc.setDescriptiveInformation(descriptiveInformation);
		dmsPoc.setTimeStart(timeStart);
		dmsPoc.setTimeStop(timeStop);
		dmsPoc.setNameOfTechnician(nameOfTechnician);
		dmsPoc.setTechnicianSignature(technicianSignature);
		dmsPoc.setPartNumber(partNumber);
		dmsPoc.setPartDescription(partDescription);
		dmsPoc.setPartCatagory(partCatagory);
		dmsPoc.setInternalPartsOrder(internalPartsOrder);
		dmsPoc.setPartQuantity(partQuantity);
		dmsPoc.setPartRate(partRate);
		dmsPoc.setPartCost(partCost);
		dmsPoc.setPartTotal(partTotal);
		dmsPoc.setLabourDescription(labourDescription);
		dmsPoc.setLabourCatagory(labourCatagory);
		dmsPoc.setLabourCode(labourCode);
		dmsPoc.setTimeUnit(timeUnit);
		dmsPoc.setHours(hours);
		dmsPoc.setLabourRate(labourRate);
		dmsPoc.setLabourCost(labourCost);
		dmsPoc.setLabourTotal(labourTotal);
		dmsPoc.setAdditionalRepairsReqDesc(additionalRepairsReqDesc);
		dmsPoc.setAdditionalRepairsReqPart(additionalRepairsReqPart);
		dmsPoc.setAdditionalRepairsReqLabour(additionalRepairsReqLabour);
		dmsPoc.setAdditionalRepairsReqAuth(additionalRepairsReqAuth);
		dmsPoc.setAdditionalRepairsReqDT(additionalRepairsReqDT);
		dmsPoc.getRoadTestKmOut();
		dmsPoc.setRoadTestKmIn(roadTestKmIn);
		dmsPoc.setAllJobsAttended(allJobsAttended);
		dmsPoc.setAccessoriesSettingAsOriginal(accessoriesSettingAsOriginal);
		dmsPoc.setRoadTestSignature(roadTestSignature);
		dmsPoc.setRoadTestDate(roadTestDate);
		dmsPoc.setInteriors(interiors);
		dmsPoc.setInteriorsPolishing(interiorsPolishing);
		dmsPoc.setExteriors(exteriors);
		dmsPoc.setExteriorsPolishing(exteriorsPolishing);
		dmsPoc.setVacuumCleaned(vacuumCleaned);
		dmsPoc.setWashingCheckerSignature(washingCheckerSignature);
		dmsPoc.setStatus(status);

		dmsPoc = dmsPocPersistence.update(dmsPoc);
		return dmsPoc;
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
		System.out.println("successfull customer name..djjds." + customerName);
		DmsPoc dmsPoc = dmsPocPersistence.findByPrimaryKey(id);
		System.out.println("successfull customer name..djjds." + customerName);
		dmsPoc.setModifiedDate(new Date());
		dmsPoc.setModifiedBy(PrincipalThreadLocal.getUserId());
		dmsPoc.setModifiedByName(CommonUtils.getCurrentUser().getFullName());
		System.out.println("successfull customer name..djjds." + customerName);
		dmsPoc.setGroupId(CommonUtils.getServiceScopeGroupId());
		dmsPoc.setOrgId(CommonUtils.getUserOrganizationId());
		System.out.println("successfull customer name..djjds." + customerName);
		dmsPoc.setRepairOrderNo(repairOrderNo);
		dmsPoc.setDealerCode(dealerCode);
		dmsPoc.setAuthorisedDealerInfo(authorisedDealerInfo);
		dmsPoc.setDealershipName(dealershipName);
		dmsPoc.setDealershipAddress(dealershipAddress);
		dmsPoc.setDealerShipPhoneNo(dealerShipPhoneNo);
		dmsPoc.setFaxNo(faxNo);
		dmsPoc.setDealershipEmail(dealershipEmail);
		dmsPoc.setGST(GST);
		dmsPoc.setCustomerName(customerName);
		dmsPoc.setCustomerAddress(customerAddress);
		dmsPoc.setCustomerMobileNo(customerMobileNo);
		dmsPoc.setCustomerEmailAddress(customerEmailAddress);
		dmsPoc.setContactPerson(contactPerson);
		dmsPoc.setContactPersonPhone(contactPersonPhone);
		dmsPoc.setRegNo(regNo);
		dmsPoc.setVIN(VIN);
		dmsPoc.setDateOfDelivery(dateOfDelivery);
		dmsPoc.setKmsIn(kmsIn);
		dmsPoc.setModel(model);
		dmsPoc.setEngineNo(engineNo);
		dmsPoc.setInsurancePolicyNo(insurancePolicyNo);
		dmsPoc.setInsuranceExpiryDate(insuranceExpiryDate);
		dmsPoc.setRsaRequired(rsaRequired);
		dmsPoc.setAppointmentType(appointmentType);
		dmsPoc.setOrderDateIn(orderDateIn);
		dmsPoc.setOrderTimeIn(orderTimeIn);
		dmsPoc.setServiceAdvisor(serviceAdvisor);
		dmsPoc.setServiceAdvisorMobileNo(serviceAdvisorMobileNo);
		dmsPoc.setSoldByDealer(soldByDealer);
		dmsPoc.setCustomerMobilityType(customerMobilityType);
		dmsPoc.setTransactionNo(transactionNo);
		dmsPoc.setReasonForVisit(reasonForVisit);
		dmsPoc.setExtendedWarranty(extendedWarranty);
		dmsPoc.setServicePlan(servicePlan);
		dmsPoc.setCustomerOrderDescription(customerOrderDescription);
		dmsPoc.setComplaint(complaint);
		dmsPoc.setWorkToBeDone(workToBeDone);
		dmsPoc.setInstruction(instruction);
		dmsPoc.setCarPicture(carPicture);
		dmsPoc.setXDent(xDent);
		dmsPoc.setScratch(scratch);
		dmsPoc.setBodyDamage(bodyDamage);
		dmsPoc.setModificationOrNonOBMFittings(modificationOrNonOBMFittings);
		dmsPoc.setTyreCondition(tyreCondition);
		dmsPoc.setTreadDepth(treadDepth);
		dmsPoc.setFrontLeft(frontLeft);
		dmsPoc.setFrontRight(frontRight);
		dmsPoc.setRearLeft(rearLeft);
		dmsPoc.setRearRight(rearRight);
		dmsPoc.setWindowsGlazzing(windowsGlazzing);
		dmsPoc.setWiperBlades(wiperBlades);
		dmsPoc.setLights(lights);
		dmsPoc.setExhaustSystem(exhaustSystem);
		dmsPoc.setUnderbody(underbody);
		dmsPoc.setEngineCompartment(engineCompartment);
		dmsPoc.setWashing(washing);
		dmsPoc.setOilLevel(oilLevel);
		dmsPoc.setCoolant(coolant);
		dmsPoc.setWindshieldWasher(windshieldWasher);
		dmsPoc.setBrakes(brakes);
		dmsPoc.setAxle(axle);
		dmsPoc.setMonograms(monograms);
		dmsPoc.setPolishing(polishing);
		dmsPoc.setFuel(fuel);
		dmsPoc.setOwnersManual(ownersManual);
		dmsPoc.setSerScheMaintenanceManual(serScheMaintenanceManual);
		dmsPoc.setInfotainmentMmiNavigManual(infotainmentMmiNavigManual);
		dmsPoc.setExtWarrantyBook(extWarrantyBook);
		dmsPoc.setQuickReferenceGuide(quickReferenceGuide);
		dmsPoc.setSpareWheel(spareWheel);
		dmsPoc.setJackToolKits(jackToolKits);
		dmsPoc.setFloorMat(floorMat);
		dmsPoc.setMudFlaps(mudFlaps);
		dmsPoc.setWarningTriangle(warningTriangle);
		dmsPoc.setFirstAidKit(firstAidKit);
		dmsPoc.setNoOfKeys(noOfKeys);
		dmsPoc.setOtherLooseItems(otherLooseItems);
		dmsPoc.setFinancialInformation(financialInformation);
		dmsPoc.setModeOfPayment(modeOfPayment);
		dmsPoc.setEstimatedCost(estimatedCost);
		dmsPoc.setTaxesAsApplicable(taxesAsApplicable);
		dmsPoc.setEstimatedDateOfDelivery(estimatedDateOfDelivery);
		dmsPoc.setEstimatedDeliveryTime(estimatedDeliveryTime);
		dmsPoc.setLaborEstimate(laborEstimate);
		dmsPoc.setParts(parts);
		dmsPoc.setTermsAndConditions(termsAndConditions);
		dmsPoc.setGrantMyConsent(grantMyConsent);
		dmsPoc.getServiceAdvisotSignature();
		dmsPoc.setCustomerSignature(customerSignature);
		dmsPoc.setRemarksArea(remarksArea);
		dmsPoc.setTermsStrictly(termsStrictly);
		dmsPoc.setWorkshopCopy(workshopCopy);
		dmsPoc.setVersion(version);
		dmsPoc.setCustomerWaiting(customerWaiting);
		dmsPoc.setCampaign(campaign);
		dmsPoc.setDissNo(dissNo);
		dmsPoc.setDescriptiveInformation(descriptiveInformation);
		dmsPoc.setTimeStart(timeStart);
		dmsPoc.setTimeStop(timeStop);
		dmsPoc.setNameOfTechnician(nameOfTechnician);
		dmsPoc.setTechnicianSignature(technicianSignature);
		dmsPoc.setPartNumber(partNumber);
		dmsPoc.setPartDescription(partDescription);
		dmsPoc.setPartCatagory(partCatagory);
		dmsPoc.setInternalPartsOrder(internalPartsOrder);
		dmsPoc.setPartQuantity(partQuantity);
		dmsPoc.setPartRate(partRate);
		dmsPoc.setPartCost(partCost);
		dmsPoc.setPartTotal(partTotal);
		dmsPoc.setLabourDescription(labourDescription);
		dmsPoc.setLabourCatagory(labourCatagory);
		dmsPoc.setLabourCode(labourCode);
		dmsPoc.setTimeUnit(timeUnit);
		dmsPoc.setHours(hours);
		dmsPoc.setLabourRate(labourRate);
		dmsPoc.setLabourCost(labourCost);
		dmsPoc.setLabourTotal(labourTotal);
		dmsPoc.setAdditionalRepairsReqDesc(additionalRepairsReqDesc);
		dmsPoc.setAdditionalRepairsReqPart(additionalRepairsReqPart);
		dmsPoc.setAdditionalRepairsReqLabour(additionalRepairsReqLabour);
		dmsPoc.setAdditionalRepairsReqAuth(additionalRepairsReqAuth);
		dmsPoc.setAdditionalRepairsReqDT(additionalRepairsReqDT);
		dmsPoc.getRoadTestKmOut();
		dmsPoc.setRoadTestKmIn(roadTestKmIn);
		dmsPoc.setAllJobsAttended(allJobsAttended);
		dmsPoc.setAccessoriesSettingAsOriginal(accessoriesSettingAsOriginal);
		dmsPoc.setRoadTestSignature(roadTestSignature);
		dmsPoc.setRoadTestDate(roadTestDate);
		dmsPoc.setInteriors(interiors);
		dmsPoc.setInteriorsPolishing(interiorsPolishing);
		dmsPoc.setExteriors(exteriors);
		dmsPoc.setExteriorsPolishing(exteriorsPolishing);
		dmsPoc.setVacuumCleaned(vacuumCleaned);
		dmsPoc.setWashingCheckerSignature(washingCheckerSignature);
		dmsPoc.setStatus(status);
		System.out.println("successfull customer name..djjds." + customerName);

		dmsPoc = dmsPocPersistence.update(dmsPoc);
		return dmsPoc;
	}
	
	public DmsPoc updateToShow(long id)
			throws SystemException, PortalException {
		DmsPoc dmsPoc = dmsPocPersistence.findByPrimaryKey(id);
		dmsPoc.setToShow(true);
		dmsPoc = dmsPocPersistence.update(dmsPoc);
		return dmsPoc;
	}
	
	public DmsPoc updatePartsLabourInventory(long id, String inventoryPartsJSONStr,
			String partsJSONStr, String labourJSONStr, boolean toShow)
			throws SystemException, PortalException {
		DmsPoc dmsPoc = dmsPocPersistence.findByPrimaryKey(id);
		dmsPoc.setInventoryPartsJSONStr(inventoryPartsJSONStr);
		dmsPoc.setPartsJSONStr(partsJSONStr);
		dmsPoc.setLabourJSONStr(labourJSONStr);
		dmsPoc.setToShow(toShow);
		dmsPoc = dmsPocPersistence.update(dmsPoc);
		return dmsPoc;
	}


	public List<DmsPoc> findAll() throws SystemException {
		// System.out.println("orgid-"+CommonUtils.getUserOrganizationId());
		return dmsPocPersistence.findByDeleted(false);
	}
	
	public List<DmsPoc> findAllToShow() throws SystemException {
		// System.out.println("orgid-"+CommonUtils.getUserOrganizationId());
		return dmsPocPersistence.findByDeletedShow(false, true);
	}
	
	public DmsPoc find(long id) throws SystemException, NoSuchDmsPocException{
		return  dmsPocPersistence.findByPrimaryKey(id);
	}
	
	public DmsPoc findByRegNo(String regNo) throws SystemException, NoSuchDmsPocException{
		return  dmsPocPersistence.findByRegNo(regNo);
	}
	
	public DmsPoc findByVIN(String vin) throws SystemException, NoSuchDmsPocException{
		return  dmsPocPersistence.findByVin(vin);
	}
	
	public DmsPoc findByRegNoOrVIN(String regNo, String vin) throws SystemException, NoSuchDmsPocException{
		if((regNo != null && (!regNo.isEmpty())) && (vin != null && (!vin.isEmpty()))) {
			return  dmsPocPersistence.findByRegNoVin(regNo, vin);
		}else if(regNo != null && (!regNo.isEmpty())) {
			return  dmsPocPersistence.findByRegNo(regNo);
		}else if(vin != null && (!vin.isEmpty())) {
			return  dmsPocPersistence.findByVin(vin);
		}else {
			throw new SystemException("No Vehicle found with given details.");
		}
	}

	public DmsPoc delete(long id) throws NoSuchDmsPocException, SystemException{
		DmsPoc dmsPoc = dmsPocPersistence.findByPrimaryKey(id);
		dmsPoc.setDeleted(true);
		return  dmsPocPersistence.update(dmsPoc);
	}
	public JSONObject saveScannedImage(String type,String dataUri,File image) throws SystemException, IOException, PortalException{
		String fileUrl = "";
		if(type != null && type.equals("web")) {
			
			ServiceContext serviceContext = CommonUtils.getServiceContext(false);
			long userId = CommonUtils.getCurrentLoginUser(serviceContext).getUserId();
			String tempFileName =  "temp-img-"+userId+"-"+System.currentTimeMillis();
			if(image == null) {
				System.out.println("img null::");
				File outF = new File(tempFileName+".png");
				byte[] imagedata = DatatypeConverter.parseBase64Binary(dataUri.substring(dataUri.indexOf(",") + 1));
				BufferedImage bufferedImage = ImageIO.read(new ByteArrayInputStream(imagedata));
				ImageIO.write(bufferedImage, "png", outF );
				image = outF;
			}else {
				System.out.println("img found::");
			}
			fileUrl = CommonUtils.getFileUrl(image,
					"Scanned Images", serviceContext, tempFileName, "", "Document Manager", "Document Viewer", userId+"",true);
		}
		JSONObject jsonObject = JSONFactoryUtil.createJSONObject();
		jsonObject.put("fileUrl", fileUrl);
		//jsonObject.put("fileUrl", fileUrl);
		return jsonObject;
	}
	
}