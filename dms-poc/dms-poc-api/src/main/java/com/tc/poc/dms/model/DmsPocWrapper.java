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

package com.tc.poc.dms.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link DmsPoc}.
 * </p>
 *
 * @author Manisha Gera
 * @see DmsPoc
 * @generated
 */
@ProviderType
public class DmsPocWrapper implements DmsPoc, ModelWrapper<DmsPoc> {
	public DmsPocWrapper(DmsPoc dmsPoc) {
		_dmsPoc = dmsPoc;
	}

	@Override
	public Class<?> getModelClass() {
		return DmsPoc.class;
	}

	@Override
	public String getModelClassName() {
		return DmsPoc.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("id", getId());
		attributes.put("groupId", getGroupId());
		attributes.put("orgId", getOrgId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("modifiedBy", getModifiedBy());
		attributes.put("modifiedByName", getModifiedByName());
		attributes.put("deleted", isDeleted());
		attributes.put("repairOrderNo", getRepairOrderNo());
		attributes.put("dealerCode", getDealerCode());
		attributes.put("authorisedDealerInfo", getAuthorisedDealerInfo());
		attributes.put("dealershipName", getDealershipName());
		attributes.put("dealershipAddress", getDealershipAddress());
		attributes.put("dealerShipPhoneNo", getDealerShipPhoneNo());
		attributes.put("faxNo", getFaxNo());
		attributes.put("dealershipEmail", getDealershipEmail());
		attributes.put("GST", getGST());
		attributes.put("customerName", getCustomerName());
		attributes.put("customerAddress", getCustomerAddress());
		attributes.put("customerMobileNo", getCustomerMobileNo());
		attributes.put("customerEmailAddress", getCustomerEmailAddress());
		attributes.put("contactPerson", getContactPerson());
		attributes.put("contactPersonPhone", getContactPersonPhone());
		attributes.put("regNo", getRegNo());
		attributes.put("VIN", getVIN());
		attributes.put("dateOfDelivery", getDateOfDelivery());
		attributes.put("kmsIn", getKmsIn());
		attributes.put("model", getModel());
		attributes.put("engineNo", getEngineNo());
		attributes.put("insurancePolicyNo", getInsurancePolicyNo());
		attributes.put("insuranceExpiryDate", getInsuranceExpiryDate());
		attributes.put("rsaRequired", isRsaRequired());
		attributes.put("appointmentType", getAppointmentType());
		attributes.put("orderDateIn", getOrderDateIn());
		attributes.put("orderTimeIn", getOrderTimeIn());
		attributes.put("serviceAdvisor", getServiceAdvisor());
		attributes.put("serviceAdvisorMobileNo", getServiceAdvisorMobileNo());
		attributes.put("soldByDealer", getSoldByDealer());
		attributes.put("customerMobilityType", getCustomerMobilityType());
		attributes.put("transactionNo", getTransactionNo());
		attributes.put("reasonForVisit", getReasonForVisit());
		attributes.put("extendedWarranty", getExtendedWarranty());
		attributes.put("servicePlan", getServicePlan());
		attributes.put("customerOrderDescription", getCustomerOrderDescription());
		attributes.put("complaint", getComplaint());
		attributes.put("workToBeDone", getWorkToBeDone());
		attributes.put("instruction", getInstruction());
		attributes.put("carPicture", getCarPicture());
		attributes.put("xDent", getXDent());
		attributes.put("scratch", getScratch());
		attributes.put("bodyDamage", getBodyDamage());
		attributes.put("modificationOrNonOBMFittings",
			getModificationOrNonOBMFittings());
		attributes.put("tyreCondition", getTyreCondition());
		attributes.put("treadDepth", getTreadDepth());
		attributes.put("frontRight", getFrontRight());
		attributes.put("frontLeft", getFrontLeft());
		attributes.put("rearRight", getRearRight());
		attributes.put("rearLeft", getRearLeft());
		attributes.put("windowsGlazzing", getWindowsGlazzing());
		attributes.put("wiperBlades", getWiperBlades());
		attributes.put("lights", getLights());
		attributes.put("exhaustSystem", getExhaustSystem());
		attributes.put("underbody", getUnderbody());
		attributes.put("engineCompartment", getEngineCompartment());
		attributes.put("washing", getWashing());
		attributes.put("oilLevel", getOilLevel());
		attributes.put("coolant", getCoolant());
		attributes.put("windshieldWasher", getWindshieldWasher());
		attributes.put("brakes", getBrakes());
		attributes.put("axle", getAxle());
		attributes.put("monograms", getMonograms());
		attributes.put("polishing", getPolishing());
		attributes.put("fuel", getFuel());
		attributes.put("ownersManual", getOwnersManual());
		attributes.put("serScheMaintenanceManual", getSerScheMaintenanceManual());
		attributes.put("infotainmentMmiNavigManual",
			getInfotainmentMmiNavigManual());
		attributes.put("extWarrantyBook", getExtWarrantyBook());
		attributes.put("quickReferenceGuide", getQuickReferenceGuide());
		attributes.put("spareWheel", getSpareWheel());
		attributes.put("jackToolKits", getJackToolKits());
		attributes.put("floorMat", getFloorMat());
		attributes.put("mudFlaps", getMudFlaps());
		attributes.put("warningTriangle", getWarningTriangle());
		attributes.put("firstAidKit", getFirstAidKit());
		attributes.put("noOfKeys", getNoOfKeys());
		attributes.put("otherLooseItems", getOtherLooseItems());
		attributes.put("financialInformation", getFinancialInformation());
		attributes.put("modeOfPayment", getModeOfPayment());
		attributes.put("estimatedCost", getEstimatedCost());
		attributes.put("taxesAsApplicable", getTaxesAsApplicable());
		attributes.put("estimatedDateOfDelivery", getEstimatedDateOfDelivery());
		attributes.put("estimatedDeliveryTime", getEstimatedDeliveryTime());
		attributes.put("laborEstimate", getLaborEstimate());
		attributes.put("parts", getParts());
		attributes.put("termsAndConditions", getTermsAndConditions());
		attributes.put("grantMyConsent", getGrantMyConsent());
		attributes.put("serviceAdvisotSignature", getServiceAdvisotSignature());
		attributes.put("customerSignature", getCustomerSignature());
		attributes.put("remarksArea", getRemarksArea());
		attributes.put("termsStrictly", getTermsStrictly());
		attributes.put("workshopCopy", getWorkshopCopy());
		attributes.put("version", getVersion());
		attributes.put("customerWaiting", isCustomerWaiting());
		attributes.put("campaign", getCampaign());
		attributes.put("dissNo", getDissNo());
		attributes.put("descriptiveInformation", getDescriptiveInformation());
		attributes.put("timeStart", getTimeStart());
		attributes.put("timeStop", getTimeStop());
		attributes.put("nameOfTechnician", getNameOfTechnician());
		attributes.put("technicianSignature", getTechnicianSignature());
		attributes.put("inventoryPartsJSONStr", getInventoryPartsJSONStr());
		attributes.put("partNumber", getPartNumber());
		attributes.put("partDescription", getPartDescription());
		attributes.put("partCatagory", getPartCatagory());
		attributes.put("internalPartsOrder", getInternalPartsOrder());
		attributes.put("partQuantity", getPartQuantity());
		attributes.put("partRate", getPartRate());
		attributes.put("partCost", getPartCost());
		attributes.put("partTotal", getPartTotal());
		attributes.put("partsJSONStr", getPartsJSONStr());
		attributes.put("labourDescription", getLabourDescription());
		attributes.put("labourCatagory", getLabourCatagory());
		attributes.put("labourCode", getLabourCode());
		attributes.put("timeUnit", getTimeUnit());
		attributes.put("hours", getHours());
		attributes.put("labourRate", getLabourRate());
		attributes.put("labourCost", getLabourCost());
		attributes.put("labourTotal", getLabourTotal());
		attributes.put("labourJSONStr", getLabourJSONStr());
		attributes.put("additionalRepairsReqDesc", getAdditionalRepairsReqDesc());
		attributes.put("additionalRepairsReqPart", getAdditionalRepairsReqPart());
		attributes.put("additionalRepairsReqLabour",
			getAdditionalRepairsReqLabour());
		attributes.put("additionalRepairsReqAuth", getAdditionalRepairsReqAuth());
		attributes.put("additionalRepairsReqDT", getAdditionalRepairsReqDT());
		attributes.put("roadTestKmOut", getRoadTestKmOut());
		attributes.put("roadTestKmIn", getRoadTestKmIn());
		attributes.put("allJobsAttended", isAllJobsAttended());
		attributes.put("accessoriesSettingAsOriginal",
			isAccessoriesSettingAsOriginal());
		attributes.put("roadTestSignature", getRoadTestSignature());
		attributes.put("roadTestDate", getRoadTestDate());
		attributes.put("interiors", isInteriors());
		attributes.put("interiorsPolishing", isInteriorsPolishing());
		attributes.put("exteriors", isExteriors());
		attributes.put("exteriorsPolishing", isExteriorsPolishing());
		attributes.put("vacuumCleaned", isVacuumCleaned());
		attributes.put("washingCheckerSignature", getWashingCheckerSignature());
		attributes.put("status", getStatus());
		attributes.put("toShow", isToShow());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long id = (Long)attributes.get("id");

		if (id != null) {
			setId(id);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long orgId = (Long)attributes.get("orgId");

		if (orgId != null) {
			setOrgId(orgId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long modifiedBy = (Long)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}

		String modifiedByName = (String)attributes.get("modifiedByName");

		if (modifiedByName != null) {
			setModifiedByName(modifiedByName);
		}

		Boolean deleted = (Boolean)attributes.get("deleted");

		if (deleted != null) {
			setDeleted(deleted);
		}

		String repairOrderNo = (String)attributes.get("repairOrderNo");

		if (repairOrderNo != null) {
			setRepairOrderNo(repairOrderNo);
		}

		String dealerCode = (String)attributes.get("dealerCode");

		if (dealerCode != null) {
			setDealerCode(dealerCode);
		}

		String authorisedDealerInfo = (String)attributes.get(
				"authorisedDealerInfo");

		if (authorisedDealerInfo != null) {
			setAuthorisedDealerInfo(authorisedDealerInfo);
		}

		String dealershipName = (String)attributes.get("dealershipName");

		if (dealershipName != null) {
			setDealershipName(dealershipName);
		}

		String dealershipAddress = (String)attributes.get("dealershipAddress");

		if (dealershipAddress != null) {
			setDealershipAddress(dealershipAddress);
		}

		Long dealerShipPhoneNo = (Long)attributes.get("dealerShipPhoneNo");

		if (dealerShipPhoneNo != null) {
			setDealerShipPhoneNo(dealerShipPhoneNo);
		}

		Long faxNo = (Long)attributes.get("faxNo");

		if (faxNo != null) {
			setFaxNo(faxNo);
		}

		String dealershipEmail = (String)attributes.get("dealershipEmail");

		if (dealershipEmail != null) {
			setDealershipEmail(dealershipEmail);
		}

		String GST = (String)attributes.get("GST");

		if (GST != null) {
			setGST(GST);
		}

		String customerName = (String)attributes.get("customerName");

		if (customerName != null) {
			setCustomerName(customerName);
		}

		String customerAddress = (String)attributes.get("customerAddress");

		if (customerAddress != null) {
			setCustomerAddress(customerAddress);
		}

		Long customerMobileNo = (Long)attributes.get("customerMobileNo");

		if (customerMobileNo != null) {
			setCustomerMobileNo(customerMobileNo);
		}

		String customerEmailAddress = (String)attributes.get(
				"customerEmailAddress");

		if (customerEmailAddress != null) {
			setCustomerEmailAddress(customerEmailAddress);
		}

		String contactPerson = (String)attributes.get("contactPerson");

		if (contactPerson != null) {
			setContactPerson(contactPerson);
		}

		Long contactPersonPhone = (Long)attributes.get("contactPersonPhone");

		if (contactPersonPhone != null) {
			setContactPersonPhone(contactPersonPhone);
		}

		String regNo = (String)attributes.get("regNo");

		if (regNo != null) {
			setRegNo(regNo);
		}

		String VIN = (String)attributes.get("VIN");

		if (VIN != null) {
			setVIN(VIN);
		}

		Date dateOfDelivery = (Date)attributes.get("dateOfDelivery");

		if (dateOfDelivery != null) {
			setDateOfDelivery(dateOfDelivery);
		}

		Long kmsIn = (Long)attributes.get("kmsIn");

		if (kmsIn != null) {
			setKmsIn(kmsIn);
		}

		String model = (String)attributes.get("model");

		if (model != null) {
			setModel(model);
		}

		String engineNo = (String)attributes.get("engineNo");

		if (engineNo != null) {
			setEngineNo(engineNo);
		}

		String insurancePolicyNo = (String)attributes.get("insurancePolicyNo");

		if (insurancePolicyNo != null) {
			setInsurancePolicyNo(insurancePolicyNo);
		}

		Date insuranceExpiryDate = (Date)attributes.get("insuranceExpiryDate");

		if (insuranceExpiryDate != null) {
			setInsuranceExpiryDate(insuranceExpiryDate);
		}

		Boolean rsaRequired = (Boolean)attributes.get("rsaRequired");

		if (rsaRequired != null) {
			setRsaRequired(rsaRequired);
		}

		String appointmentType = (String)attributes.get("appointmentType");

		if (appointmentType != null) {
			setAppointmentType(appointmentType);
		}

		Date orderDateIn = (Date)attributes.get("orderDateIn");

		if (orderDateIn != null) {
			setOrderDateIn(orderDateIn);
		}

		Date orderTimeIn = (Date)attributes.get("orderTimeIn");

		if (orderTimeIn != null) {
			setOrderTimeIn(orderTimeIn);
		}

		String serviceAdvisor = (String)attributes.get("serviceAdvisor");

		if (serviceAdvisor != null) {
			setServiceAdvisor(serviceAdvisor);
		}

		Long serviceAdvisorMobileNo = (Long)attributes.get(
				"serviceAdvisorMobileNo");

		if (serviceAdvisorMobileNo != null) {
			setServiceAdvisorMobileNo(serviceAdvisorMobileNo);
		}

		String soldByDealer = (String)attributes.get("soldByDealer");

		if (soldByDealer != null) {
			setSoldByDealer(soldByDealer);
		}

		String customerMobilityType = (String)attributes.get(
				"customerMobilityType");

		if (customerMobilityType != null) {
			setCustomerMobilityType(customerMobilityType);
		}

		String transactionNo = (String)attributes.get("transactionNo");

		if (transactionNo != null) {
			setTransactionNo(transactionNo);
		}

		String reasonForVisit = (String)attributes.get("reasonForVisit");

		if (reasonForVisit != null) {
			setReasonForVisit(reasonForVisit);
		}

		String extendedWarranty = (String)attributes.get("extendedWarranty");

		if (extendedWarranty != null) {
			setExtendedWarranty(extendedWarranty);
		}

		String servicePlan = (String)attributes.get("servicePlan");

		if (servicePlan != null) {
			setServicePlan(servicePlan);
		}

		String customerOrderDescription = (String)attributes.get(
				"customerOrderDescription");

		if (customerOrderDescription != null) {
			setCustomerOrderDescription(customerOrderDescription);
		}

		String complaint = (String)attributes.get("complaint");

		if (complaint != null) {
			setComplaint(complaint);
		}

		String workToBeDone = (String)attributes.get("workToBeDone");

		if (workToBeDone != null) {
			setWorkToBeDone(workToBeDone);
		}

		String instruction = (String)attributes.get("instruction");

		if (instruction != null) {
			setInstruction(instruction);
		}

		String carPicture = (String)attributes.get("carPicture");

		if (carPicture != null) {
			setCarPicture(carPicture);
		}

		String xDent = (String)attributes.get("xDent");

		if (xDent != null) {
			setXDent(xDent);
		}

		String scratch = (String)attributes.get("scratch");

		if (scratch != null) {
			setScratch(scratch);
		}

		String bodyDamage = (String)attributes.get("bodyDamage");

		if (bodyDamage != null) {
			setBodyDamage(bodyDamage);
		}

		String modificationOrNonOBMFittings = (String)attributes.get(
				"modificationOrNonOBMFittings");

		if (modificationOrNonOBMFittings != null) {
			setModificationOrNonOBMFittings(modificationOrNonOBMFittings);
		}

		String tyreCondition = (String)attributes.get("tyreCondition");

		if (tyreCondition != null) {
			setTyreCondition(tyreCondition);
		}

		String treadDepth = (String)attributes.get("treadDepth");

		if (treadDepth != null) {
			setTreadDepth(treadDepth);
		}

		String frontRight = (String)attributes.get("frontRight");

		if (frontRight != null) {
			setFrontRight(frontRight);
		}

		String frontLeft = (String)attributes.get("frontLeft");

		if (frontLeft != null) {
			setFrontLeft(frontLeft);
		}

		String rearRight = (String)attributes.get("rearRight");

		if (rearRight != null) {
			setRearRight(rearRight);
		}

		String rearLeft = (String)attributes.get("rearLeft");

		if (rearLeft != null) {
			setRearLeft(rearLeft);
		}

		String windowsGlazzing = (String)attributes.get("windowsGlazzing");

		if (windowsGlazzing != null) {
			setWindowsGlazzing(windowsGlazzing);
		}

		String wiperBlades = (String)attributes.get("wiperBlades");

		if (wiperBlades != null) {
			setWiperBlades(wiperBlades);
		}

		String lights = (String)attributes.get("lights");

		if (lights != null) {
			setLights(lights);
		}

		String exhaustSystem = (String)attributes.get("exhaustSystem");

		if (exhaustSystem != null) {
			setExhaustSystem(exhaustSystem);
		}

		String underbody = (String)attributes.get("underbody");

		if (underbody != null) {
			setUnderbody(underbody);
		}

		String engineCompartment = (String)attributes.get("engineCompartment");

		if (engineCompartment != null) {
			setEngineCompartment(engineCompartment);
		}

		String washing = (String)attributes.get("washing");

		if (washing != null) {
			setWashing(washing);
		}

		String oilLevel = (String)attributes.get("oilLevel");

		if (oilLevel != null) {
			setOilLevel(oilLevel);
		}

		String coolant = (String)attributes.get("coolant");

		if (coolant != null) {
			setCoolant(coolant);
		}

		String windshieldWasher = (String)attributes.get("windshieldWasher");

		if (windshieldWasher != null) {
			setWindshieldWasher(windshieldWasher);
		}

		String brakes = (String)attributes.get("brakes");

		if (brakes != null) {
			setBrakes(brakes);
		}

		String axle = (String)attributes.get("axle");

		if (axle != null) {
			setAxle(axle);
		}

		String monograms = (String)attributes.get("monograms");

		if (monograms != null) {
			setMonograms(monograms);
		}

		String polishing = (String)attributes.get("polishing");

		if (polishing != null) {
			setPolishing(polishing);
		}

		String fuel = (String)attributes.get("fuel");

		if (fuel != null) {
			setFuel(fuel);
		}

		String ownersManual = (String)attributes.get("ownersManual");

		if (ownersManual != null) {
			setOwnersManual(ownersManual);
		}

		String serScheMaintenanceManual = (String)attributes.get(
				"serScheMaintenanceManual");

		if (serScheMaintenanceManual != null) {
			setSerScheMaintenanceManual(serScheMaintenanceManual);
		}

		String infotainmentMmiNavigManual = (String)attributes.get(
				"infotainmentMmiNavigManual");

		if (infotainmentMmiNavigManual != null) {
			setInfotainmentMmiNavigManual(infotainmentMmiNavigManual);
		}

		String extWarrantyBook = (String)attributes.get("extWarrantyBook");

		if (extWarrantyBook != null) {
			setExtWarrantyBook(extWarrantyBook);
		}

		String quickReferenceGuide = (String)attributes.get(
				"quickReferenceGuide");

		if (quickReferenceGuide != null) {
			setQuickReferenceGuide(quickReferenceGuide);
		}

		String spareWheel = (String)attributes.get("spareWheel");

		if (spareWheel != null) {
			setSpareWheel(spareWheel);
		}

		String jackToolKits = (String)attributes.get("jackToolKits");

		if (jackToolKits != null) {
			setJackToolKits(jackToolKits);
		}

		String floorMat = (String)attributes.get("floorMat");

		if (floorMat != null) {
			setFloorMat(floorMat);
		}

		String mudFlaps = (String)attributes.get("mudFlaps");

		if (mudFlaps != null) {
			setMudFlaps(mudFlaps);
		}

		String warningTriangle = (String)attributes.get("warningTriangle");

		if (warningTriangle != null) {
			setWarningTriangle(warningTriangle);
		}

		String firstAidKit = (String)attributes.get("firstAidKit");

		if (firstAidKit != null) {
			setFirstAidKit(firstAidKit);
		}

		Long noOfKeys = (Long)attributes.get("noOfKeys");

		if (noOfKeys != null) {
			setNoOfKeys(noOfKeys);
		}

		String otherLooseItems = (String)attributes.get("otherLooseItems");

		if (otherLooseItems != null) {
			setOtherLooseItems(otherLooseItems);
		}

		String financialInformation = (String)attributes.get(
				"financialInformation");

		if (financialInformation != null) {
			setFinancialInformation(financialInformation);
		}

		String modeOfPayment = (String)attributes.get("modeOfPayment");

		if (modeOfPayment != null) {
			setModeOfPayment(modeOfPayment);
		}

		Long estimatedCost = (Long)attributes.get("estimatedCost");

		if (estimatedCost != null) {
			setEstimatedCost(estimatedCost);
		}

		String taxesAsApplicable = (String)attributes.get("taxesAsApplicable");

		if (taxesAsApplicable != null) {
			setTaxesAsApplicable(taxesAsApplicable);
		}

		Date estimatedDateOfDelivery = (Date)attributes.get(
				"estimatedDateOfDelivery");

		if (estimatedDateOfDelivery != null) {
			setEstimatedDateOfDelivery(estimatedDateOfDelivery);
		}

		String estimatedDeliveryTime = (String)attributes.get(
				"estimatedDeliveryTime");

		if (estimatedDeliveryTime != null) {
			setEstimatedDeliveryTime(estimatedDeliveryTime);
		}

		Long laborEstimate = (Long)attributes.get("laborEstimate");

		if (laborEstimate != null) {
			setLaborEstimate(laborEstimate);
		}

		Long parts = (Long)attributes.get("parts");

		if (parts != null) {
			setParts(parts);
		}

		String termsAndConditions = (String)attributes.get("termsAndConditions");

		if (termsAndConditions != null) {
			setTermsAndConditions(termsAndConditions);
		}

		String grantMyConsent = (String)attributes.get("grantMyConsent");

		if (grantMyConsent != null) {
			setGrantMyConsent(grantMyConsent);
		}

		String serviceAdvisotSignature = (String)attributes.get(
				"serviceAdvisotSignature");

		if (serviceAdvisotSignature != null) {
			setServiceAdvisotSignature(serviceAdvisotSignature);
		}

		String customerSignature = (String)attributes.get("customerSignature");

		if (customerSignature != null) {
			setCustomerSignature(customerSignature);
		}

		String remarksArea = (String)attributes.get("remarksArea");

		if (remarksArea != null) {
			setRemarksArea(remarksArea);
		}

		String termsStrictly = (String)attributes.get("termsStrictly");

		if (termsStrictly != null) {
			setTermsStrictly(termsStrictly);
		}

		String workshopCopy = (String)attributes.get("workshopCopy");

		if (workshopCopy != null) {
			setWorkshopCopy(workshopCopy);
		}

		String version = (String)attributes.get("version");

		if (version != null) {
			setVersion(version);
		}

		Boolean customerWaiting = (Boolean)attributes.get("customerWaiting");

		if (customerWaiting != null) {
			setCustomerWaiting(customerWaiting);
		}

		String campaign = (String)attributes.get("campaign");

		if (campaign != null) {
			setCampaign(campaign);
		}

		String dissNo = (String)attributes.get("dissNo");

		if (dissNo != null) {
			setDissNo(dissNo);
		}

		String descriptiveInformation = (String)attributes.get(
				"descriptiveInformation");

		if (descriptiveInformation != null) {
			setDescriptiveInformation(descriptiveInformation);
		}

		String timeStart = (String)attributes.get("timeStart");

		if (timeStart != null) {
			setTimeStart(timeStart);
		}

		String timeStop = (String)attributes.get("timeStop");

		if (timeStop != null) {
			setTimeStop(timeStop);
		}

		String nameOfTechnician = (String)attributes.get("nameOfTechnician");

		if (nameOfTechnician != null) {
			setNameOfTechnician(nameOfTechnician);
		}

		String technicianSignature = (String)attributes.get(
				"technicianSignature");

		if (technicianSignature != null) {
			setTechnicianSignature(technicianSignature);
		}

		String inventoryPartsJSONStr = (String)attributes.get(
				"inventoryPartsJSONStr");

		if (inventoryPartsJSONStr != null) {
			setInventoryPartsJSONStr(inventoryPartsJSONStr);
		}

		String partNumber = (String)attributes.get("partNumber");

		if (partNumber != null) {
			setPartNumber(partNumber);
		}

		String partDescription = (String)attributes.get("partDescription");

		if (partDescription != null) {
			setPartDescription(partDescription);
		}

		String partCatagory = (String)attributes.get("partCatagory");

		if (partCatagory != null) {
			setPartCatagory(partCatagory);
		}

		String internalPartsOrder = (String)attributes.get("internalPartsOrder");

		if (internalPartsOrder != null) {
			setInternalPartsOrder(internalPartsOrder);
		}

		String partQuantity = (String)attributes.get("partQuantity");

		if (partQuantity != null) {
			setPartQuantity(partQuantity);
		}

		String partRate = (String)attributes.get("partRate");

		if (partRate != null) {
			setPartRate(partRate);
		}

		String partCost = (String)attributes.get("partCost");

		if (partCost != null) {
			setPartCost(partCost);
		}

		String partTotal = (String)attributes.get("partTotal");

		if (partTotal != null) {
			setPartTotal(partTotal);
		}

		String partsJSONStr = (String)attributes.get("partsJSONStr");

		if (partsJSONStr != null) {
			setPartsJSONStr(partsJSONStr);
		}

		String labourDescription = (String)attributes.get("labourDescription");

		if (labourDescription != null) {
			setLabourDescription(labourDescription);
		}

		String labourCatagory = (String)attributes.get("labourCatagory");

		if (labourCatagory != null) {
			setLabourCatagory(labourCatagory);
		}

		String labourCode = (String)attributes.get("labourCode");

		if (labourCode != null) {
			setLabourCode(labourCode);
		}

		String timeUnit = (String)attributes.get("timeUnit");

		if (timeUnit != null) {
			setTimeUnit(timeUnit);
		}

		String hours = (String)attributes.get("hours");

		if (hours != null) {
			setHours(hours);
		}

		String labourRate = (String)attributes.get("labourRate");

		if (labourRate != null) {
			setLabourRate(labourRate);
		}

		Long labourCost = (Long)attributes.get("labourCost");

		if (labourCost != null) {
			setLabourCost(labourCost);
		}

		Long labourTotal = (Long)attributes.get("labourTotal");

		if (labourTotal != null) {
			setLabourTotal(labourTotal);
		}

		String labourJSONStr = (String)attributes.get("labourJSONStr");

		if (labourJSONStr != null) {
			setLabourJSONStr(labourJSONStr);
		}

		String additionalRepairsReqDesc = (String)attributes.get(
				"additionalRepairsReqDesc");

		if (additionalRepairsReqDesc != null) {
			setAdditionalRepairsReqDesc(additionalRepairsReqDesc);
		}

		String additionalRepairsReqPart = (String)attributes.get(
				"additionalRepairsReqPart");

		if (additionalRepairsReqPart != null) {
			setAdditionalRepairsReqPart(additionalRepairsReqPart);
		}

		String additionalRepairsReqLabour = (String)attributes.get(
				"additionalRepairsReqLabour");

		if (additionalRepairsReqLabour != null) {
			setAdditionalRepairsReqLabour(additionalRepairsReqLabour);
		}

		String additionalRepairsReqAuth = (String)attributes.get(
				"additionalRepairsReqAuth");

		if (additionalRepairsReqAuth != null) {
			setAdditionalRepairsReqAuth(additionalRepairsReqAuth);
		}

		Date additionalRepairsReqDT = (Date)attributes.get(
				"additionalRepairsReqDT");

		if (additionalRepairsReqDT != null) {
			setAdditionalRepairsReqDT(additionalRepairsReqDT);
		}

		Long roadTestKmOut = (Long)attributes.get("roadTestKmOut");

		if (roadTestKmOut != null) {
			setRoadTestKmOut(roadTestKmOut);
		}

		Long roadTestKmIn = (Long)attributes.get("roadTestKmIn");

		if (roadTestKmIn != null) {
			setRoadTestKmIn(roadTestKmIn);
		}

		Boolean allJobsAttended = (Boolean)attributes.get("allJobsAttended");

		if (allJobsAttended != null) {
			setAllJobsAttended(allJobsAttended);
		}

		Boolean accessoriesSettingAsOriginal = (Boolean)attributes.get(
				"accessoriesSettingAsOriginal");

		if (accessoriesSettingAsOriginal != null) {
			setAccessoriesSettingAsOriginal(accessoriesSettingAsOriginal);
		}

		String roadTestSignature = (String)attributes.get("roadTestSignature");

		if (roadTestSignature != null) {
			setRoadTestSignature(roadTestSignature);
		}

		Date roadTestDate = (Date)attributes.get("roadTestDate");

		if (roadTestDate != null) {
			setRoadTestDate(roadTestDate);
		}

		Boolean interiors = (Boolean)attributes.get("interiors");

		if (interiors != null) {
			setInteriors(interiors);
		}

		Boolean interiorsPolishing = (Boolean)attributes.get(
				"interiorsPolishing");

		if (interiorsPolishing != null) {
			setInteriorsPolishing(interiorsPolishing);
		}

		Boolean exteriors = (Boolean)attributes.get("exteriors");

		if (exteriors != null) {
			setExteriors(exteriors);
		}

		Boolean exteriorsPolishing = (Boolean)attributes.get(
				"exteriorsPolishing");

		if (exteriorsPolishing != null) {
			setExteriorsPolishing(exteriorsPolishing);
		}

		Boolean vacuumCleaned = (Boolean)attributes.get("vacuumCleaned");

		if (vacuumCleaned != null) {
			setVacuumCleaned(vacuumCleaned);
		}

		String washingCheckerSignature = (String)attributes.get(
				"washingCheckerSignature");

		if (washingCheckerSignature != null) {
			setWashingCheckerSignature(washingCheckerSignature);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Boolean toShow = (Boolean)attributes.get("toShow");

		if (toShow != null) {
			setToShow(toShow);
		}
	}

	@Override
	public Object clone() {
		return new DmsPocWrapper((DmsPoc)_dmsPoc.clone());
	}

	@Override
	public int compareTo(DmsPoc dmsPoc) {
		return _dmsPoc.compareTo(dmsPoc);
	}

	/**
	* Returns the accessories setting as original of this dms poc.
	*
	* @return the accessories setting as original of this dms poc
	*/
	@Override
	public boolean getAccessoriesSettingAsOriginal() {
		return _dmsPoc.getAccessoriesSettingAsOriginal();
	}

	/**
	* Returns the additional repairs req auth of this dms poc.
	*
	* @return the additional repairs req auth of this dms poc
	*/
	@Override
	public String getAdditionalRepairsReqAuth() {
		return _dmsPoc.getAdditionalRepairsReqAuth();
	}

	/**
	* Returns the additional repairs req desc of this dms poc.
	*
	* @return the additional repairs req desc of this dms poc
	*/
	@Override
	public String getAdditionalRepairsReqDesc() {
		return _dmsPoc.getAdditionalRepairsReqDesc();
	}

	/**
	* Returns the additional repairs req dt of this dms poc.
	*
	* @return the additional repairs req dt of this dms poc
	*/
	@Override
	public Date getAdditionalRepairsReqDT() {
		return _dmsPoc.getAdditionalRepairsReqDT();
	}

	/**
	* Returns the additional repairs req labour of this dms poc.
	*
	* @return the additional repairs req labour of this dms poc
	*/
	@Override
	public String getAdditionalRepairsReqLabour() {
		return _dmsPoc.getAdditionalRepairsReqLabour();
	}

	/**
	* Returns the additional repairs req part of this dms poc.
	*
	* @return the additional repairs req part of this dms poc
	*/
	@Override
	public String getAdditionalRepairsReqPart() {
		return _dmsPoc.getAdditionalRepairsReqPart();
	}

	/**
	* Returns the all jobs attended of this dms poc.
	*
	* @return the all jobs attended of this dms poc
	*/
	@Override
	public boolean getAllJobsAttended() {
		return _dmsPoc.getAllJobsAttended();
	}

	/**
	* Returns the appointment type of this dms poc.
	*
	* @return the appointment type of this dms poc
	*/
	@Override
	public String getAppointmentType() {
		return _dmsPoc.getAppointmentType();
	}

	/**
	* Returns the authorised dealer info of this dms poc.
	*
	* @return the authorised dealer info of this dms poc
	*/
	@Override
	public String getAuthorisedDealerInfo() {
		return _dmsPoc.getAuthorisedDealerInfo();
	}

	/**
	* Returns the axle of this dms poc.
	*
	* @return the axle of this dms poc
	*/
	@Override
	public String getAxle() {
		return _dmsPoc.getAxle();
	}

	/**
	* Returns the body damage of this dms poc.
	*
	* @return the body damage of this dms poc
	*/
	@Override
	public String getBodyDamage() {
		return _dmsPoc.getBodyDamage();
	}

	/**
	* Returns the brakes of this dms poc.
	*
	* @return the brakes of this dms poc
	*/
	@Override
	public String getBrakes() {
		return _dmsPoc.getBrakes();
	}

	/**
	* Returns the campaign of this dms poc.
	*
	* @return the campaign of this dms poc
	*/
	@Override
	public String getCampaign() {
		return _dmsPoc.getCampaign();
	}

	/**
	* Returns the car picture of this dms poc.
	*
	* @return the car picture of this dms poc
	*/
	@Override
	public String getCarPicture() {
		return _dmsPoc.getCarPicture();
	}

	/**
	* Returns the company ID of this dms poc.
	*
	* @return the company ID of this dms poc
	*/
	@Override
	public long getCompanyId() {
		return _dmsPoc.getCompanyId();
	}

	/**
	* Returns the complaint of this dms poc.
	*
	* @return the complaint of this dms poc
	*/
	@Override
	public String getComplaint() {
		return _dmsPoc.getComplaint();
	}

	/**
	* Returns the contact person of this dms poc.
	*
	* @return the contact person of this dms poc
	*/
	@Override
	public String getContactPerson() {
		return _dmsPoc.getContactPerson();
	}

	/**
	* Returns the contact person phone of this dms poc.
	*
	* @return the contact person phone of this dms poc
	*/
	@Override
	public long getContactPersonPhone() {
		return _dmsPoc.getContactPersonPhone();
	}

	/**
	* Returns the coolant of this dms poc.
	*
	* @return the coolant of this dms poc
	*/
	@Override
	public String getCoolant() {
		return _dmsPoc.getCoolant();
	}

	/**
	* Returns the create date of this dms poc.
	*
	* @return the create date of this dms poc
	*/
	@Override
	public Date getCreateDate() {
		return _dmsPoc.getCreateDate();
	}

	/**
	* Returns the customer address of this dms poc.
	*
	* @return the customer address of this dms poc
	*/
	@Override
	public String getCustomerAddress() {
		return _dmsPoc.getCustomerAddress();
	}

	/**
	* Returns the customer email address of this dms poc.
	*
	* @return the customer email address of this dms poc
	*/
	@Override
	public String getCustomerEmailAddress() {
		return _dmsPoc.getCustomerEmailAddress();
	}

	/**
	* Returns the customer mobile no of this dms poc.
	*
	* @return the customer mobile no of this dms poc
	*/
	@Override
	public long getCustomerMobileNo() {
		return _dmsPoc.getCustomerMobileNo();
	}

	/**
	* Returns the customer mobility type of this dms poc.
	*
	* @return the customer mobility type of this dms poc
	*/
	@Override
	public String getCustomerMobilityType() {
		return _dmsPoc.getCustomerMobilityType();
	}

	/**
	* Returns the customer name of this dms poc.
	*
	* @return the customer name of this dms poc
	*/
	@Override
	public String getCustomerName() {
		return _dmsPoc.getCustomerName();
	}

	/**
	* Returns the customer order description of this dms poc.
	*
	* @return the customer order description of this dms poc
	*/
	@Override
	public String getCustomerOrderDescription() {
		return _dmsPoc.getCustomerOrderDescription();
	}

	/**
	* Returns the customer signature of this dms poc.
	*
	* @return the customer signature of this dms poc
	*/
	@Override
	public String getCustomerSignature() {
		return _dmsPoc.getCustomerSignature();
	}

	/**
	* Returns the customer waiting of this dms poc.
	*
	* @return the customer waiting of this dms poc
	*/
	@Override
	public boolean getCustomerWaiting() {
		return _dmsPoc.getCustomerWaiting();
	}

	/**
	* Returns the date of delivery of this dms poc.
	*
	* @return the date of delivery of this dms poc
	*/
	@Override
	public Date getDateOfDelivery() {
		return _dmsPoc.getDateOfDelivery();
	}

	/**
	* Returns the dealer code of this dms poc.
	*
	* @return the dealer code of this dms poc
	*/
	@Override
	public String getDealerCode() {
		return _dmsPoc.getDealerCode();
	}

	/**
	* Returns the dealership address of this dms poc.
	*
	* @return the dealership address of this dms poc
	*/
	@Override
	public String getDealershipAddress() {
		return _dmsPoc.getDealershipAddress();
	}

	/**
	* Returns the dealership email of this dms poc.
	*
	* @return the dealership email of this dms poc
	*/
	@Override
	public String getDealershipEmail() {
		return _dmsPoc.getDealershipEmail();
	}

	/**
	* Returns the dealership name of this dms poc.
	*
	* @return the dealership name of this dms poc
	*/
	@Override
	public String getDealershipName() {
		return _dmsPoc.getDealershipName();
	}

	/**
	* Returns the dealer ship phone no of this dms poc.
	*
	* @return the dealer ship phone no of this dms poc
	*/
	@Override
	public long getDealerShipPhoneNo() {
		return _dmsPoc.getDealerShipPhoneNo();
	}

	/**
	* Returns the deleted of this dms poc.
	*
	* @return the deleted of this dms poc
	*/
	@Override
	public boolean getDeleted() {
		return _dmsPoc.getDeleted();
	}

	/**
	* Returns the descriptive information of this dms poc.
	*
	* @return the descriptive information of this dms poc
	*/
	@Override
	public String getDescriptiveInformation() {
		return _dmsPoc.getDescriptiveInformation();
	}

	/**
	* Returns the diss no of this dms poc.
	*
	* @return the diss no of this dms poc
	*/
	@Override
	public String getDissNo() {
		return _dmsPoc.getDissNo();
	}

	/**
	* Returns the engine compartment of this dms poc.
	*
	* @return the engine compartment of this dms poc
	*/
	@Override
	public String getEngineCompartment() {
		return _dmsPoc.getEngineCompartment();
	}

	/**
	* Returns the engine no of this dms poc.
	*
	* @return the engine no of this dms poc
	*/
	@Override
	public String getEngineNo() {
		return _dmsPoc.getEngineNo();
	}

	/**
	* Returns the estimated cost of this dms poc.
	*
	* @return the estimated cost of this dms poc
	*/
	@Override
	public long getEstimatedCost() {
		return _dmsPoc.getEstimatedCost();
	}

	/**
	* Returns the estimated date of delivery of this dms poc.
	*
	* @return the estimated date of delivery of this dms poc
	*/
	@Override
	public Date getEstimatedDateOfDelivery() {
		return _dmsPoc.getEstimatedDateOfDelivery();
	}

	/**
	* Returns the estimated delivery time of this dms poc.
	*
	* @return the estimated delivery time of this dms poc
	*/
	@Override
	public String getEstimatedDeliveryTime() {
		return _dmsPoc.getEstimatedDeliveryTime();
	}

	/**
	* Returns the exhaust system of this dms poc.
	*
	* @return the exhaust system of this dms poc
	*/
	@Override
	public String getExhaustSystem() {
		return _dmsPoc.getExhaustSystem();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _dmsPoc.getExpandoBridge();
	}

	/**
	* Returns the extended warranty of this dms poc.
	*
	* @return the extended warranty of this dms poc
	*/
	@Override
	public String getExtendedWarranty() {
		return _dmsPoc.getExtendedWarranty();
	}

	/**
	* Returns the exteriors of this dms poc.
	*
	* @return the exteriors of this dms poc
	*/
	@Override
	public boolean getExteriors() {
		return _dmsPoc.getExteriors();
	}

	/**
	* Returns the exteriors polishing of this dms poc.
	*
	* @return the exteriors polishing of this dms poc
	*/
	@Override
	public boolean getExteriorsPolishing() {
		return _dmsPoc.getExteriorsPolishing();
	}

	/**
	* Returns the ext warranty book of this dms poc.
	*
	* @return the ext warranty book of this dms poc
	*/
	@Override
	public String getExtWarrantyBook() {
		return _dmsPoc.getExtWarrantyBook();
	}

	/**
	* Returns the fax no of this dms poc.
	*
	* @return the fax no of this dms poc
	*/
	@Override
	public long getFaxNo() {
		return _dmsPoc.getFaxNo();
	}

	/**
	* Returns the financial information of this dms poc.
	*
	* @return the financial information of this dms poc
	*/
	@Override
	public String getFinancialInformation() {
		return _dmsPoc.getFinancialInformation();
	}

	/**
	* Returns the first aid kit of this dms poc.
	*
	* @return the first aid kit of this dms poc
	*/
	@Override
	public String getFirstAidKit() {
		return _dmsPoc.getFirstAidKit();
	}

	/**
	* Returns the floor mat of this dms poc.
	*
	* @return the floor mat of this dms poc
	*/
	@Override
	public String getFloorMat() {
		return _dmsPoc.getFloorMat();
	}

	/**
	* Returns the front left of this dms poc.
	*
	* @return the front left of this dms poc
	*/
	@Override
	public String getFrontLeft() {
		return _dmsPoc.getFrontLeft();
	}

	/**
	* Returns the front right of this dms poc.
	*
	* @return the front right of this dms poc
	*/
	@Override
	public String getFrontRight() {
		return _dmsPoc.getFrontRight();
	}

	/**
	* Returns the fuel of this dms poc.
	*
	* @return the fuel of this dms poc
	*/
	@Override
	public String getFuel() {
		return _dmsPoc.getFuel();
	}

	/**
	* Returns the grant my consent of this dms poc.
	*
	* @return the grant my consent of this dms poc
	*/
	@Override
	public String getGrantMyConsent() {
		return _dmsPoc.getGrantMyConsent();
	}

	/**
	* Returns the group ID of this dms poc.
	*
	* @return the group ID of this dms poc
	*/
	@Override
	public long getGroupId() {
		return _dmsPoc.getGroupId();
	}

	/**
	* Returns the gst of this dms poc.
	*
	* @return the gst of this dms poc
	*/
	@Override
	public String getGST() {
		return _dmsPoc.getGST();
	}

	/**
	* Returns the hours of this dms poc.
	*
	* @return the hours of this dms poc
	*/
	@Override
	public String getHours() {
		return _dmsPoc.getHours();
	}

	/**
	* Returns the ID of this dms poc.
	*
	* @return the ID of this dms poc
	*/
	@Override
	public long getId() {
		return _dmsPoc.getId();
	}

	/**
	* Returns the infotainment mmi navig manual of this dms poc.
	*
	* @return the infotainment mmi navig manual of this dms poc
	*/
	@Override
	public String getInfotainmentMmiNavigManual() {
		return _dmsPoc.getInfotainmentMmiNavigManual();
	}

	/**
	* Returns the instruction of this dms poc.
	*
	* @return the instruction of this dms poc
	*/
	@Override
	public String getInstruction() {
		return _dmsPoc.getInstruction();
	}

	/**
	* Returns the insurance expiry date of this dms poc.
	*
	* @return the insurance expiry date of this dms poc
	*/
	@Override
	public Date getInsuranceExpiryDate() {
		return _dmsPoc.getInsuranceExpiryDate();
	}

	/**
	* Returns the insurance policy no of this dms poc.
	*
	* @return the insurance policy no of this dms poc
	*/
	@Override
	public String getInsurancePolicyNo() {
		return _dmsPoc.getInsurancePolicyNo();
	}

	/**
	* Returns the interiors of this dms poc.
	*
	* @return the interiors of this dms poc
	*/
	@Override
	public boolean getInteriors() {
		return _dmsPoc.getInteriors();
	}

	/**
	* Returns the interiors polishing of this dms poc.
	*
	* @return the interiors polishing of this dms poc
	*/
	@Override
	public boolean getInteriorsPolishing() {
		return _dmsPoc.getInteriorsPolishing();
	}

	/**
	* Returns the internal parts order of this dms poc.
	*
	* @return the internal parts order of this dms poc
	*/
	@Override
	public String getInternalPartsOrder() {
		return _dmsPoc.getInternalPartsOrder();
	}

	/**
	* Returns the inventory parts json str of this dms poc.
	*
	* @return the inventory parts json str of this dms poc
	*/
	@Override
	public String getInventoryPartsJSONStr() {
		return _dmsPoc.getInventoryPartsJSONStr();
	}

	/**
	* Returns the jack tool kits of this dms poc.
	*
	* @return the jack tool kits of this dms poc
	*/
	@Override
	public String getJackToolKits() {
		return _dmsPoc.getJackToolKits();
	}

	/**
	* Returns the kms in of this dms poc.
	*
	* @return the kms in of this dms poc
	*/
	@Override
	public long getKmsIn() {
		return _dmsPoc.getKmsIn();
	}

	/**
	* Returns the labor estimate of this dms poc.
	*
	* @return the labor estimate of this dms poc
	*/
	@Override
	public long getLaborEstimate() {
		return _dmsPoc.getLaborEstimate();
	}

	/**
	* Returns the labour catagory of this dms poc.
	*
	* @return the labour catagory of this dms poc
	*/
	@Override
	public String getLabourCatagory() {
		return _dmsPoc.getLabourCatagory();
	}

	/**
	* Returns the labour code of this dms poc.
	*
	* @return the labour code of this dms poc
	*/
	@Override
	public String getLabourCode() {
		return _dmsPoc.getLabourCode();
	}

	/**
	* Returns the labour cost of this dms poc.
	*
	* @return the labour cost of this dms poc
	*/
	@Override
	public long getLabourCost() {
		return _dmsPoc.getLabourCost();
	}

	/**
	* Returns the labour description of this dms poc.
	*
	* @return the labour description of this dms poc
	*/
	@Override
	public String getLabourDescription() {
		return _dmsPoc.getLabourDescription();
	}

	/**
	* Returns the labour json str of this dms poc.
	*
	* @return the labour json str of this dms poc
	*/
	@Override
	public String getLabourJSONStr() {
		return _dmsPoc.getLabourJSONStr();
	}

	/**
	* Returns the labour rate of this dms poc.
	*
	* @return the labour rate of this dms poc
	*/
	@Override
	public String getLabourRate() {
		return _dmsPoc.getLabourRate();
	}

	/**
	* Returns the labour total of this dms poc.
	*
	* @return the labour total of this dms poc
	*/
	@Override
	public long getLabourTotal() {
		return _dmsPoc.getLabourTotal();
	}

	/**
	* Returns the lights of this dms poc.
	*
	* @return the lights of this dms poc
	*/
	@Override
	public String getLights() {
		return _dmsPoc.getLights();
	}

	/**
	* Returns the model of this dms poc.
	*
	* @return the model of this dms poc
	*/
	@Override
	public String getModel() {
		return _dmsPoc.getModel();
	}

	/**
	* Returns the mode of payment of this dms poc.
	*
	* @return the mode of payment of this dms poc
	*/
	@Override
	public String getModeOfPayment() {
		return _dmsPoc.getModeOfPayment();
	}

	/**
	* Returns the modification or non obm fittings of this dms poc.
	*
	* @return the modification or non obm fittings of this dms poc
	*/
	@Override
	public String getModificationOrNonOBMFittings() {
		return _dmsPoc.getModificationOrNonOBMFittings();
	}

	/**
	* Returns the modified by of this dms poc.
	*
	* @return the modified by of this dms poc
	*/
	@Override
	public long getModifiedBy() {
		return _dmsPoc.getModifiedBy();
	}

	/**
	* Returns the modified by name of this dms poc.
	*
	* @return the modified by name of this dms poc
	*/
	@Override
	public String getModifiedByName() {
		return _dmsPoc.getModifiedByName();
	}

	/**
	* Returns the modified date of this dms poc.
	*
	* @return the modified date of this dms poc
	*/
	@Override
	public Date getModifiedDate() {
		return _dmsPoc.getModifiedDate();
	}

	/**
	* Returns the monograms of this dms poc.
	*
	* @return the monograms of this dms poc
	*/
	@Override
	public String getMonograms() {
		return _dmsPoc.getMonograms();
	}

	/**
	* Returns the mud flaps of this dms poc.
	*
	* @return the mud flaps of this dms poc
	*/
	@Override
	public String getMudFlaps() {
		return _dmsPoc.getMudFlaps();
	}

	/**
	* Returns the name of technician of this dms poc.
	*
	* @return the name of technician of this dms poc
	*/
	@Override
	public String getNameOfTechnician() {
		return _dmsPoc.getNameOfTechnician();
	}

	/**
	* Returns the no of keys of this dms poc.
	*
	* @return the no of keys of this dms poc
	*/
	@Override
	public long getNoOfKeys() {
		return _dmsPoc.getNoOfKeys();
	}

	/**
	* Returns the oil level of this dms poc.
	*
	* @return the oil level of this dms poc
	*/
	@Override
	public String getOilLevel() {
		return _dmsPoc.getOilLevel();
	}

	/**
	* Returns the order date in of this dms poc.
	*
	* @return the order date in of this dms poc
	*/
	@Override
	public Date getOrderDateIn() {
		return _dmsPoc.getOrderDateIn();
	}

	/**
	* Returns the order time in of this dms poc.
	*
	* @return the order time in of this dms poc
	*/
	@Override
	public Date getOrderTimeIn() {
		return _dmsPoc.getOrderTimeIn();
	}

	/**
	* Returns the org ID of this dms poc.
	*
	* @return the org ID of this dms poc
	*/
	@Override
	public long getOrgId() {
		return _dmsPoc.getOrgId();
	}

	/**
	* Returns the other loose items of this dms poc.
	*
	* @return the other loose items of this dms poc
	*/
	@Override
	public String getOtherLooseItems() {
		return _dmsPoc.getOtherLooseItems();
	}

	/**
	* Returns the owners manual of this dms poc.
	*
	* @return the owners manual of this dms poc
	*/
	@Override
	public String getOwnersManual() {
		return _dmsPoc.getOwnersManual();
	}

	/**
	* Returns the part catagory of this dms poc.
	*
	* @return the part catagory of this dms poc
	*/
	@Override
	public String getPartCatagory() {
		return _dmsPoc.getPartCatagory();
	}

	/**
	* Returns the part cost of this dms poc.
	*
	* @return the part cost of this dms poc
	*/
	@Override
	public String getPartCost() {
		return _dmsPoc.getPartCost();
	}

	/**
	* Returns the part description of this dms poc.
	*
	* @return the part description of this dms poc
	*/
	@Override
	public String getPartDescription() {
		return _dmsPoc.getPartDescription();
	}

	/**
	* Returns the part number of this dms poc.
	*
	* @return the part number of this dms poc
	*/
	@Override
	public String getPartNumber() {
		return _dmsPoc.getPartNumber();
	}

	/**
	* Returns the part quantity of this dms poc.
	*
	* @return the part quantity of this dms poc
	*/
	@Override
	public String getPartQuantity() {
		return _dmsPoc.getPartQuantity();
	}

	/**
	* Returns the part rate of this dms poc.
	*
	* @return the part rate of this dms poc
	*/
	@Override
	public String getPartRate() {
		return _dmsPoc.getPartRate();
	}

	/**
	* Returns the parts of this dms poc.
	*
	* @return the parts of this dms poc
	*/
	@Override
	public long getParts() {
		return _dmsPoc.getParts();
	}

	/**
	* Returns the parts json str of this dms poc.
	*
	* @return the parts json str of this dms poc
	*/
	@Override
	public String getPartsJSONStr() {
		return _dmsPoc.getPartsJSONStr();
	}

	/**
	* Returns the part total of this dms poc.
	*
	* @return the part total of this dms poc
	*/
	@Override
	public String getPartTotal() {
		return _dmsPoc.getPartTotal();
	}

	/**
	* Returns the polishing of this dms poc.
	*
	* @return the polishing of this dms poc
	*/
	@Override
	public String getPolishing() {
		return _dmsPoc.getPolishing();
	}

	/**
	* Returns the primary key of this dms poc.
	*
	* @return the primary key of this dms poc
	*/
	@Override
	public long getPrimaryKey() {
		return _dmsPoc.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _dmsPoc.getPrimaryKeyObj();
	}

	/**
	* Returns the quick reference guide of this dms poc.
	*
	* @return the quick reference guide of this dms poc
	*/
	@Override
	public String getQuickReferenceGuide() {
		return _dmsPoc.getQuickReferenceGuide();
	}

	/**
	* Returns the rear left of this dms poc.
	*
	* @return the rear left of this dms poc
	*/
	@Override
	public String getRearLeft() {
		return _dmsPoc.getRearLeft();
	}

	/**
	* Returns the rear right of this dms poc.
	*
	* @return the rear right of this dms poc
	*/
	@Override
	public String getRearRight() {
		return _dmsPoc.getRearRight();
	}

	/**
	* Returns the reason for visit of this dms poc.
	*
	* @return the reason for visit of this dms poc
	*/
	@Override
	public String getReasonForVisit() {
		return _dmsPoc.getReasonForVisit();
	}

	/**
	* Returns the reg no of this dms poc.
	*
	* @return the reg no of this dms poc
	*/
	@Override
	public String getRegNo() {
		return _dmsPoc.getRegNo();
	}

	/**
	* Returns the remarks area of this dms poc.
	*
	* @return the remarks area of this dms poc
	*/
	@Override
	public String getRemarksArea() {
		return _dmsPoc.getRemarksArea();
	}

	/**
	* Returns the repair order no of this dms poc.
	*
	* @return the repair order no of this dms poc
	*/
	@Override
	public String getRepairOrderNo() {
		return _dmsPoc.getRepairOrderNo();
	}

	/**
	* Returns the road test date of this dms poc.
	*
	* @return the road test date of this dms poc
	*/
	@Override
	public Date getRoadTestDate() {
		return _dmsPoc.getRoadTestDate();
	}

	/**
	* Returns the road test km in of this dms poc.
	*
	* @return the road test km in of this dms poc
	*/
	@Override
	public long getRoadTestKmIn() {
		return _dmsPoc.getRoadTestKmIn();
	}

	/**
	* Returns the road test km out of this dms poc.
	*
	* @return the road test km out of this dms poc
	*/
	@Override
	public long getRoadTestKmOut() {
		return _dmsPoc.getRoadTestKmOut();
	}

	/**
	* Returns the road test signature of this dms poc.
	*
	* @return the road test signature of this dms poc
	*/
	@Override
	public String getRoadTestSignature() {
		return _dmsPoc.getRoadTestSignature();
	}

	/**
	* Returns the rsa required of this dms poc.
	*
	* @return the rsa required of this dms poc
	*/
	@Override
	public boolean getRsaRequired() {
		return _dmsPoc.getRsaRequired();
	}

	/**
	* Returns the scratch of this dms poc.
	*
	* @return the scratch of this dms poc
	*/
	@Override
	public String getScratch() {
		return _dmsPoc.getScratch();
	}

	/**
	* Returns the ser sche maintenance manual of this dms poc.
	*
	* @return the ser sche maintenance manual of this dms poc
	*/
	@Override
	public String getSerScheMaintenanceManual() {
		return _dmsPoc.getSerScheMaintenanceManual();
	}

	/**
	* Returns the service advisor of this dms poc.
	*
	* @return the service advisor of this dms poc
	*/
	@Override
	public String getServiceAdvisor() {
		return _dmsPoc.getServiceAdvisor();
	}

	/**
	* Returns the service advisor mobile no of this dms poc.
	*
	* @return the service advisor mobile no of this dms poc
	*/
	@Override
	public long getServiceAdvisorMobileNo() {
		return _dmsPoc.getServiceAdvisorMobileNo();
	}

	/**
	* Returns the service advisot signature of this dms poc.
	*
	* @return the service advisot signature of this dms poc
	*/
	@Override
	public String getServiceAdvisotSignature() {
		return _dmsPoc.getServiceAdvisotSignature();
	}

	/**
	* Returns the service plan of this dms poc.
	*
	* @return the service plan of this dms poc
	*/
	@Override
	public String getServicePlan() {
		return _dmsPoc.getServicePlan();
	}

	/**
	* Returns the sold by dealer of this dms poc.
	*
	* @return the sold by dealer of this dms poc
	*/
	@Override
	public String getSoldByDealer() {
		return _dmsPoc.getSoldByDealer();
	}

	/**
	* Returns the spare wheel of this dms poc.
	*
	* @return the spare wheel of this dms poc
	*/
	@Override
	public String getSpareWheel() {
		return _dmsPoc.getSpareWheel();
	}

	/**
	* Returns the status of this dms poc.
	*
	* @return the status of this dms poc
	*/
	@Override
	public String getStatus() {
		return _dmsPoc.getStatus();
	}

	/**
	* Returns the taxes as applicable of this dms poc.
	*
	* @return the taxes as applicable of this dms poc
	*/
	@Override
	public String getTaxesAsApplicable() {
		return _dmsPoc.getTaxesAsApplicable();
	}

	/**
	* Returns the technician signature of this dms poc.
	*
	* @return the technician signature of this dms poc
	*/
	@Override
	public String getTechnicianSignature() {
		return _dmsPoc.getTechnicianSignature();
	}

	/**
	* Returns the terms and conditions of this dms poc.
	*
	* @return the terms and conditions of this dms poc
	*/
	@Override
	public String getTermsAndConditions() {
		return _dmsPoc.getTermsAndConditions();
	}

	/**
	* Returns the terms strictly of this dms poc.
	*
	* @return the terms strictly of this dms poc
	*/
	@Override
	public String getTermsStrictly() {
		return _dmsPoc.getTermsStrictly();
	}

	/**
	* Returns the time start of this dms poc.
	*
	* @return the time start of this dms poc
	*/
	@Override
	public String getTimeStart() {
		return _dmsPoc.getTimeStart();
	}

	/**
	* Returns the time stop of this dms poc.
	*
	* @return the time stop of this dms poc
	*/
	@Override
	public String getTimeStop() {
		return _dmsPoc.getTimeStop();
	}

	/**
	* Returns the time unit of this dms poc.
	*
	* @return the time unit of this dms poc
	*/
	@Override
	public String getTimeUnit() {
		return _dmsPoc.getTimeUnit();
	}

	/**
	* Returns the to show of this dms poc.
	*
	* @return the to show of this dms poc
	*/
	@Override
	public boolean getToShow() {
		return _dmsPoc.getToShow();
	}

	/**
	* Returns the transaction no of this dms poc.
	*
	* @return the transaction no of this dms poc
	*/
	@Override
	public String getTransactionNo() {
		return _dmsPoc.getTransactionNo();
	}

	/**
	* Returns the tread depth of this dms poc.
	*
	* @return the tread depth of this dms poc
	*/
	@Override
	public String getTreadDepth() {
		return _dmsPoc.getTreadDepth();
	}

	/**
	* Returns the tyre condition of this dms poc.
	*
	* @return the tyre condition of this dms poc
	*/
	@Override
	public String getTyreCondition() {
		return _dmsPoc.getTyreCondition();
	}

	/**
	* Returns the underbody of this dms poc.
	*
	* @return the underbody of this dms poc
	*/
	@Override
	public String getUnderbody() {
		return _dmsPoc.getUnderbody();
	}

	/**
	* Returns the user ID of this dms poc.
	*
	* @return the user ID of this dms poc
	*/
	@Override
	public long getUserId() {
		return _dmsPoc.getUserId();
	}

	/**
	* Returns the user name of this dms poc.
	*
	* @return the user name of this dms poc
	*/
	@Override
	public String getUserName() {
		return _dmsPoc.getUserName();
	}

	/**
	* Returns the user uuid of this dms poc.
	*
	* @return the user uuid of this dms poc
	*/
	@Override
	public String getUserUuid() {
		return _dmsPoc.getUserUuid();
	}

	/**
	* Returns the uuid of this dms poc.
	*
	* @return the uuid of this dms poc
	*/
	@Override
	public String getUuid() {
		return _dmsPoc.getUuid();
	}

	/**
	* Returns the vacuum cleaned of this dms poc.
	*
	* @return the vacuum cleaned of this dms poc
	*/
	@Override
	public boolean getVacuumCleaned() {
		return _dmsPoc.getVacuumCleaned();
	}

	/**
	* Returns the version of this dms poc.
	*
	* @return the version of this dms poc
	*/
	@Override
	public String getVersion() {
		return _dmsPoc.getVersion();
	}

	/**
	* Returns the vin of this dms poc.
	*
	* @return the vin of this dms poc
	*/
	@Override
	public String getVIN() {
		return _dmsPoc.getVIN();
	}

	/**
	* Returns the warning triangle of this dms poc.
	*
	* @return the warning triangle of this dms poc
	*/
	@Override
	public String getWarningTriangle() {
		return _dmsPoc.getWarningTriangle();
	}

	/**
	* Returns the washing of this dms poc.
	*
	* @return the washing of this dms poc
	*/
	@Override
	public String getWashing() {
		return _dmsPoc.getWashing();
	}

	/**
	* Returns the washing checker signature of this dms poc.
	*
	* @return the washing checker signature of this dms poc
	*/
	@Override
	public String getWashingCheckerSignature() {
		return _dmsPoc.getWashingCheckerSignature();
	}

	/**
	* Returns the windows glazzing of this dms poc.
	*
	* @return the windows glazzing of this dms poc
	*/
	@Override
	public String getWindowsGlazzing() {
		return _dmsPoc.getWindowsGlazzing();
	}

	/**
	* Returns the windshield washer of this dms poc.
	*
	* @return the windshield washer of this dms poc
	*/
	@Override
	public String getWindshieldWasher() {
		return _dmsPoc.getWindshieldWasher();
	}

	/**
	* Returns the wiper blades of this dms poc.
	*
	* @return the wiper blades of this dms poc
	*/
	@Override
	public String getWiperBlades() {
		return _dmsPoc.getWiperBlades();
	}

	/**
	* Returns the workshop copy of this dms poc.
	*
	* @return the workshop copy of this dms poc
	*/
	@Override
	public String getWorkshopCopy() {
		return _dmsPoc.getWorkshopCopy();
	}

	/**
	* Returns the work to be done of this dms poc.
	*
	* @return the work to be done of this dms poc
	*/
	@Override
	public String getWorkToBeDone() {
		return _dmsPoc.getWorkToBeDone();
	}

	/**
	* Returns the x dent of this dms poc.
	*
	* @return the x dent of this dms poc
	*/
	@Override
	public String getXDent() {
		return _dmsPoc.getXDent();
	}

	@Override
	public int hashCode() {
		return _dmsPoc.hashCode();
	}

	/**
	* Returns <code>true</code> if this dms poc is accessories setting as original.
	*
	* @return <code>true</code> if this dms poc is accessories setting as original; <code>false</code> otherwise
	*/
	@Override
	public boolean isAccessoriesSettingAsOriginal() {
		return _dmsPoc.isAccessoriesSettingAsOriginal();
	}

	/**
	* Returns <code>true</code> if this dms poc is all jobs attended.
	*
	* @return <code>true</code> if this dms poc is all jobs attended; <code>false</code> otherwise
	*/
	@Override
	public boolean isAllJobsAttended() {
		return _dmsPoc.isAllJobsAttended();
	}

	@Override
	public boolean isCachedModel() {
		return _dmsPoc.isCachedModel();
	}

	/**
	* Returns <code>true</code> if this dms poc is customer waiting.
	*
	* @return <code>true</code> if this dms poc is customer waiting; <code>false</code> otherwise
	*/
	@Override
	public boolean isCustomerWaiting() {
		return _dmsPoc.isCustomerWaiting();
	}

	/**
	* Returns <code>true</code> if this dms poc is deleted.
	*
	* @return <code>true</code> if this dms poc is deleted; <code>false</code> otherwise
	*/
	@Override
	public boolean isDeleted() {
		return _dmsPoc.isDeleted();
	}

	@Override
	public boolean isEscapedModel() {
		return _dmsPoc.isEscapedModel();
	}

	/**
	* Returns <code>true</code> if this dms poc is exteriors.
	*
	* @return <code>true</code> if this dms poc is exteriors; <code>false</code> otherwise
	*/
	@Override
	public boolean isExteriors() {
		return _dmsPoc.isExteriors();
	}

	/**
	* Returns <code>true</code> if this dms poc is exteriors polishing.
	*
	* @return <code>true</code> if this dms poc is exteriors polishing; <code>false</code> otherwise
	*/
	@Override
	public boolean isExteriorsPolishing() {
		return _dmsPoc.isExteriorsPolishing();
	}

	/**
	* Returns <code>true</code> if this dms poc is interiors.
	*
	* @return <code>true</code> if this dms poc is interiors; <code>false</code> otherwise
	*/
	@Override
	public boolean isInteriors() {
		return _dmsPoc.isInteriors();
	}

	/**
	* Returns <code>true</code> if this dms poc is interiors polishing.
	*
	* @return <code>true</code> if this dms poc is interiors polishing; <code>false</code> otherwise
	*/
	@Override
	public boolean isInteriorsPolishing() {
		return _dmsPoc.isInteriorsPolishing();
	}

	@Override
	public boolean isNew() {
		return _dmsPoc.isNew();
	}

	/**
	* Returns <code>true</code> if this dms poc is rsa required.
	*
	* @return <code>true</code> if this dms poc is rsa required; <code>false</code> otherwise
	*/
	@Override
	public boolean isRsaRequired() {
		return _dmsPoc.isRsaRequired();
	}

	/**
	* Returns <code>true</code> if this dms poc is to show.
	*
	* @return <code>true</code> if this dms poc is to show; <code>false</code> otherwise
	*/
	@Override
	public boolean isToShow() {
		return _dmsPoc.isToShow();
	}

	/**
	* Returns <code>true</code> if this dms poc is vacuum cleaned.
	*
	* @return <code>true</code> if this dms poc is vacuum cleaned; <code>false</code> otherwise
	*/
	@Override
	public boolean isVacuumCleaned() {
		return _dmsPoc.isVacuumCleaned();
	}

	@Override
	public void persist() {
		_dmsPoc.persist();
	}

	/**
	* Sets whether this dms poc is accessories setting as original.
	*
	* @param accessoriesSettingAsOriginal the accessories setting as original of this dms poc
	*/
	@Override
	public void setAccessoriesSettingAsOriginal(
		boolean accessoriesSettingAsOriginal) {
		_dmsPoc.setAccessoriesSettingAsOriginal(accessoriesSettingAsOriginal);
	}

	/**
	* Sets the additional repairs req auth of this dms poc.
	*
	* @param additionalRepairsReqAuth the additional repairs req auth of this dms poc
	*/
	@Override
	public void setAdditionalRepairsReqAuth(String additionalRepairsReqAuth) {
		_dmsPoc.setAdditionalRepairsReqAuth(additionalRepairsReqAuth);
	}

	/**
	* Sets the additional repairs req desc of this dms poc.
	*
	* @param additionalRepairsReqDesc the additional repairs req desc of this dms poc
	*/
	@Override
	public void setAdditionalRepairsReqDesc(String additionalRepairsReqDesc) {
		_dmsPoc.setAdditionalRepairsReqDesc(additionalRepairsReqDesc);
	}

	/**
	* Sets the additional repairs req dt of this dms poc.
	*
	* @param additionalRepairsReqDT the additional repairs req dt of this dms poc
	*/
	@Override
	public void setAdditionalRepairsReqDT(Date additionalRepairsReqDT) {
		_dmsPoc.setAdditionalRepairsReqDT(additionalRepairsReqDT);
	}

	/**
	* Sets the additional repairs req labour of this dms poc.
	*
	* @param additionalRepairsReqLabour the additional repairs req labour of this dms poc
	*/
	@Override
	public void setAdditionalRepairsReqLabour(String additionalRepairsReqLabour) {
		_dmsPoc.setAdditionalRepairsReqLabour(additionalRepairsReqLabour);
	}

	/**
	* Sets the additional repairs req part of this dms poc.
	*
	* @param additionalRepairsReqPart the additional repairs req part of this dms poc
	*/
	@Override
	public void setAdditionalRepairsReqPart(String additionalRepairsReqPart) {
		_dmsPoc.setAdditionalRepairsReqPart(additionalRepairsReqPart);
	}

	/**
	* Sets whether this dms poc is all jobs attended.
	*
	* @param allJobsAttended the all jobs attended of this dms poc
	*/
	@Override
	public void setAllJobsAttended(boolean allJobsAttended) {
		_dmsPoc.setAllJobsAttended(allJobsAttended);
	}

	/**
	* Sets the appointment type of this dms poc.
	*
	* @param appointmentType the appointment type of this dms poc
	*/
	@Override
	public void setAppointmentType(String appointmentType) {
		_dmsPoc.setAppointmentType(appointmentType);
	}

	/**
	* Sets the authorised dealer info of this dms poc.
	*
	* @param authorisedDealerInfo the authorised dealer info of this dms poc
	*/
	@Override
	public void setAuthorisedDealerInfo(String authorisedDealerInfo) {
		_dmsPoc.setAuthorisedDealerInfo(authorisedDealerInfo);
	}

	/**
	* Sets the axle of this dms poc.
	*
	* @param axle the axle of this dms poc
	*/
	@Override
	public void setAxle(String axle) {
		_dmsPoc.setAxle(axle);
	}

	/**
	* Sets the body damage of this dms poc.
	*
	* @param bodyDamage the body damage of this dms poc
	*/
	@Override
	public void setBodyDamage(String bodyDamage) {
		_dmsPoc.setBodyDamage(bodyDamage);
	}

	/**
	* Sets the brakes of this dms poc.
	*
	* @param brakes the brakes of this dms poc
	*/
	@Override
	public void setBrakes(String brakes) {
		_dmsPoc.setBrakes(brakes);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_dmsPoc.setCachedModel(cachedModel);
	}

	/**
	* Sets the campaign of this dms poc.
	*
	* @param campaign the campaign of this dms poc
	*/
	@Override
	public void setCampaign(String campaign) {
		_dmsPoc.setCampaign(campaign);
	}

	/**
	* Sets the car picture of this dms poc.
	*
	* @param carPicture the car picture of this dms poc
	*/
	@Override
	public void setCarPicture(String carPicture) {
		_dmsPoc.setCarPicture(carPicture);
	}

	/**
	* Sets the company ID of this dms poc.
	*
	* @param companyId the company ID of this dms poc
	*/
	@Override
	public void setCompanyId(long companyId) {
		_dmsPoc.setCompanyId(companyId);
	}

	/**
	* Sets the complaint of this dms poc.
	*
	* @param complaint the complaint of this dms poc
	*/
	@Override
	public void setComplaint(String complaint) {
		_dmsPoc.setComplaint(complaint);
	}

	/**
	* Sets the contact person of this dms poc.
	*
	* @param contactPerson the contact person of this dms poc
	*/
	@Override
	public void setContactPerson(String contactPerson) {
		_dmsPoc.setContactPerson(contactPerson);
	}

	/**
	* Sets the contact person phone of this dms poc.
	*
	* @param contactPersonPhone the contact person phone of this dms poc
	*/
	@Override
	public void setContactPersonPhone(long contactPersonPhone) {
		_dmsPoc.setContactPersonPhone(contactPersonPhone);
	}

	/**
	* Sets the coolant of this dms poc.
	*
	* @param coolant the coolant of this dms poc
	*/
	@Override
	public void setCoolant(String coolant) {
		_dmsPoc.setCoolant(coolant);
	}

	/**
	* Sets the create date of this dms poc.
	*
	* @param createDate the create date of this dms poc
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_dmsPoc.setCreateDate(createDate);
	}

	/**
	* Sets the customer address of this dms poc.
	*
	* @param customerAddress the customer address of this dms poc
	*/
	@Override
	public void setCustomerAddress(String customerAddress) {
		_dmsPoc.setCustomerAddress(customerAddress);
	}

	/**
	* Sets the customer email address of this dms poc.
	*
	* @param customerEmailAddress the customer email address of this dms poc
	*/
	@Override
	public void setCustomerEmailAddress(String customerEmailAddress) {
		_dmsPoc.setCustomerEmailAddress(customerEmailAddress);
	}

	/**
	* Sets the customer mobile no of this dms poc.
	*
	* @param customerMobileNo the customer mobile no of this dms poc
	*/
	@Override
	public void setCustomerMobileNo(long customerMobileNo) {
		_dmsPoc.setCustomerMobileNo(customerMobileNo);
	}

	/**
	* Sets the customer mobility type of this dms poc.
	*
	* @param customerMobilityType the customer mobility type of this dms poc
	*/
	@Override
	public void setCustomerMobilityType(String customerMobilityType) {
		_dmsPoc.setCustomerMobilityType(customerMobilityType);
	}

	/**
	* Sets the customer name of this dms poc.
	*
	* @param customerName the customer name of this dms poc
	*/
	@Override
	public void setCustomerName(String customerName) {
		_dmsPoc.setCustomerName(customerName);
	}

	/**
	* Sets the customer order description of this dms poc.
	*
	* @param customerOrderDescription the customer order description of this dms poc
	*/
	@Override
	public void setCustomerOrderDescription(String customerOrderDescription) {
		_dmsPoc.setCustomerOrderDescription(customerOrderDescription);
	}

	/**
	* Sets the customer signature of this dms poc.
	*
	* @param customerSignature the customer signature of this dms poc
	*/
	@Override
	public void setCustomerSignature(String customerSignature) {
		_dmsPoc.setCustomerSignature(customerSignature);
	}

	/**
	* Sets whether this dms poc is customer waiting.
	*
	* @param customerWaiting the customer waiting of this dms poc
	*/
	@Override
	public void setCustomerWaiting(boolean customerWaiting) {
		_dmsPoc.setCustomerWaiting(customerWaiting);
	}

	/**
	* Sets the date of delivery of this dms poc.
	*
	* @param dateOfDelivery the date of delivery of this dms poc
	*/
	@Override
	public void setDateOfDelivery(Date dateOfDelivery) {
		_dmsPoc.setDateOfDelivery(dateOfDelivery);
	}

	/**
	* Sets the dealer code of this dms poc.
	*
	* @param dealerCode the dealer code of this dms poc
	*/
	@Override
	public void setDealerCode(String dealerCode) {
		_dmsPoc.setDealerCode(dealerCode);
	}

	/**
	* Sets the dealership address of this dms poc.
	*
	* @param dealershipAddress the dealership address of this dms poc
	*/
	@Override
	public void setDealershipAddress(String dealershipAddress) {
		_dmsPoc.setDealershipAddress(dealershipAddress);
	}

	/**
	* Sets the dealership email of this dms poc.
	*
	* @param dealershipEmail the dealership email of this dms poc
	*/
	@Override
	public void setDealershipEmail(String dealershipEmail) {
		_dmsPoc.setDealershipEmail(dealershipEmail);
	}

	/**
	* Sets the dealership name of this dms poc.
	*
	* @param dealershipName the dealership name of this dms poc
	*/
	@Override
	public void setDealershipName(String dealershipName) {
		_dmsPoc.setDealershipName(dealershipName);
	}

	/**
	* Sets the dealer ship phone no of this dms poc.
	*
	* @param dealerShipPhoneNo the dealer ship phone no of this dms poc
	*/
	@Override
	public void setDealerShipPhoneNo(long dealerShipPhoneNo) {
		_dmsPoc.setDealerShipPhoneNo(dealerShipPhoneNo);
	}

	/**
	* Sets whether this dms poc is deleted.
	*
	* @param deleted the deleted of this dms poc
	*/
	@Override
	public void setDeleted(boolean deleted) {
		_dmsPoc.setDeleted(deleted);
	}

	/**
	* Sets the descriptive information of this dms poc.
	*
	* @param descriptiveInformation the descriptive information of this dms poc
	*/
	@Override
	public void setDescriptiveInformation(String descriptiveInformation) {
		_dmsPoc.setDescriptiveInformation(descriptiveInformation);
	}

	/**
	* Sets the diss no of this dms poc.
	*
	* @param dissNo the diss no of this dms poc
	*/
	@Override
	public void setDissNo(String dissNo) {
		_dmsPoc.setDissNo(dissNo);
	}

	/**
	* Sets the engine compartment of this dms poc.
	*
	* @param engineCompartment the engine compartment of this dms poc
	*/
	@Override
	public void setEngineCompartment(String engineCompartment) {
		_dmsPoc.setEngineCompartment(engineCompartment);
	}

	/**
	* Sets the engine no of this dms poc.
	*
	* @param engineNo the engine no of this dms poc
	*/
	@Override
	public void setEngineNo(String engineNo) {
		_dmsPoc.setEngineNo(engineNo);
	}

	/**
	* Sets the estimated cost of this dms poc.
	*
	* @param estimatedCost the estimated cost of this dms poc
	*/
	@Override
	public void setEstimatedCost(long estimatedCost) {
		_dmsPoc.setEstimatedCost(estimatedCost);
	}

	/**
	* Sets the estimated date of delivery of this dms poc.
	*
	* @param estimatedDateOfDelivery the estimated date of delivery of this dms poc
	*/
	@Override
	public void setEstimatedDateOfDelivery(Date estimatedDateOfDelivery) {
		_dmsPoc.setEstimatedDateOfDelivery(estimatedDateOfDelivery);
	}

	/**
	* Sets the estimated delivery time of this dms poc.
	*
	* @param estimatedDeliveryTime the estimated delivery time of this dms poc
	*/
	@Override
	public void setEstimatedDeliveryTime(String estimatedDeliveryTime) {
		_dmsPoc.setEstimatedDeliveryTime(estimatedDeliveryTime);
	}

	/**
	* Sets the exhaust system of this dms poc.
	*
	* @param exhaustSystem the exhaust system of this dms poc
	*/
	@Override
	public void setExhaustSystem(String exhaustSystem) {
		_dmsPoc.setExhaustSystem(exhaustSystem);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_dmsPoc.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_dmsPoc.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_dmsPoc.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the extended warranty of this dms poc.
	*
	* @param extendedWarranty the extended warranty of this dms poc
	*/
	@Override
	public void setExtendedWarranty(String extendedWarranty) {
		_dmsPoc.setExtendedWarranty(extendedWarranty);
	}

	/**
	* Sets whether this dms poc is exteriors.
	*
	* @param exteriors the exteriors of this dms poc
	*/
	@Override
	public void setExteriors(boolean exteriors) {
		_dmsPoc.setExteriors(exteriors);
	}

	/**
	* Sets whether this dms poc is exteriors polishing.
	*
	* @param exteriorsPolishing the exteriors polishing of this dms poc
	*/
	@Override
	public void setExteriorsPolishing(boolean exteriorsPolishing) {
		_dmsPoc.setExteriorsPolishing(exteriorsPolishing);
	}

	/**
	* Sets the ext warranty book of this dms poc.
	*
	* @param extWarrantyBook the ext warranty book of this dms poc
	*/
	@Override
	public void setExtWarrantyBook(String extWarrantyBook) {
		_dmsPoc.setExtWarrantyBook(extWarrantyBook);
	}

	/**
	* Sets the fax no of this dms poc.
	*
	* @param faxNo the fax no of this dms poc
	*/
	@Override
	public void setFaxNo(long faxNo) {
		_dmsPoc.setFaxNo(faxNo);
	}

	/**
	* Sets the financial information of this dms poc.
	*
	* @param financialInformation the financial information of this dms poc
	*/
	@Override
	public void setFinancialInformation(String financialInformation) {
		_dmsPoc.setFinancialInformation(financialInformation);
	}

	/**
	* Sets the first aid kit of this dms poc.
	*
	* @param firstAidKit the first aid kit of this dms poc
	*/
	@Override
	public void setFirstAidKit(String firstAidKit) {
		_dmsPoc.setFirstAidKit(firstAidKit);
	}

	/**
	* Sets the floor mat of this dms poc.
	*
	* @param floorMat the floor mat of this dms poc
	*/
	@Override
	public void setFloorMat(String floorMat) {
		_dmsPoc.setFloorMat(floorMat);
	}

	/**
	* Sets the front left of this dms poc.
	*
	* @param frontLeft the front left of this dms poc
	*/
	@Override
	public void setFrontLeft(String frontLeft) {
		_dmsPoc.setFrontLeft(frontLeft);
	}

	/**
	* Sets the front right of this dms poc.
	*
	* @param frontRight the front right of this dms poc
	*/
	@Override
	public void setFrontRight(String frontRight) {
		_dmsPoc.setFrontRight(frontRight);
	}

	/**
	* Sets the fuel of this dms poc.
	*
	* @param fuel the fuel of this dms poc
	*/
	@Override
	public void setFuel(String fuel) {
		_dmsPoc.setFuel(fuel);
	}

	/**
	* Sets the grant my consent of this dms poc.
	*
	* @param grantMyConsent the grant my consent of this dms poc
	*/
	@Override
	public void setGrantMyConsent(String grantMyConsent) {
		_dmsPoc.setGrantMyConsent(grantMyConsent);
	}

	/**
	* Sets the group ID of this dms poc.
	*
	* @param groupId the group ID of this dms poc
	*/
	@Override
	public void setGroupId(long groupId) {
		_dmsPoc.setGroupId(groupId);
	}

	/**
	* Sets the gst of this dms poc.
	*
	* @param GST the gst of this dms poc
	*/
	@Override
	public void setGST(String GST) {
		_dmsPoc.setGST(GST);
	}

	/**
	* Sets the hours of this dms poc.
	*
	* @param hours the hours of this dms poc
	*/
	@Override
	public void setHours(String hours) {
		_dmsPoc.setHours(hours);
	}

	/**
	* Sets the ID of this dms poc.
	*
	* @param id the ID of this dms poc
	*/
	@Override
	public void setId(long id) {
		_dmsPoc.setId(id);
	}

	/**
	* Sets the infotainment mmi navig manual of this dms poc.
	*
	* @param infotainmentMmiNavigManual the infotainment mmi navig manual of this dms poc
	*/
	@Override
	public void setInfotainmentMmiNavigManual(String infotainmentMmiNavigManual) {
		_dmsPoc.setInfotainmentMmiNavigManual(infotainmentMmiNavigManual);
	}

	/**
	* Sets the instruction of this dms poc.
	*
	* @param instruction the instruction of this dms poc
	*/
	@Override
	public void setInstruction(String instruction) {
		_dmsPoc.setInstruction(instruction);
	}

	/**
	* Sets the insurance expiry date of this dms poc.
	*
	* @param insuranceExpiryDate the insurance expiry date of this dms poc
	*/
	@Override
	public void setInsuranceExpiryDate(Date insuranceExpiryDate) {
		_dmsPoc.setInsuranceExpiryDate(insuranceExpiryDate);
	}

	/**
	* Sets the insurance policy no of this dms poc.
	*
	* @param insurancePolicyNo the insurance policy no of this dms poc
	*/
	@Override
	public void setInsurancePolicyNo(String insurancePolicyNo) {
		_dmsPoc.setInsurancePolicyNo(insurancePolicyNo);
	}

	/**
	* Sets whether this dms poc is interiors.
	*
	* @param interiors the interiors of this dms poc
	*/
	@Override
	public void setInteriors(boolean interiors) {
		_dmsPoc.setInteriors(interiors);
	}

	/**
	* Sets whether this dms poc is interiors polishing.
	*
	* @param interiorsPolishing the interiors polishing of this dms poc
	*/
	@Override
	public void setInteriorsPolishing(boolean interiorsPolishing) {
		_dmsPoc.setInteriorsPolishing(interiorsPolishing);
	}

	/**
	* Sets the internal parts order of this dms poc.
	*
	* @param internalPartsOrder the internal parts order of this dms poc
	*/
	@Override
	public void setInternalPartsOrder(String internalPartsOrder) {
		_dmsPoc.setInternalPartsOrder(internalPartsOrder);
	}

	/**
	* Sets the inventory parts json str of this dms poc.
	*
	* @param inventoryPartsJSONStr the inventory parts json str of this dms poc
	*/
	@Override
	public void setInventoryPartsJSONStr(String inventoryPartsJSONStr) {
		_dmsPoc.setInventoryPartsJSONStr(inventoryPartsJSONStr);
	}

	/**
	* Sets the jack tool kits of this dms poc.
	*
	* @param jackToolKits the jack tool kits of this dms poc
	*/
	@Override
	public void setJackToolKits(String jackToolKits) {
		_dmsPoc.setJackToolKits(jackToolKits);
	}

	/**
	* Sets the kms in of this dms poc.
	*
	* @param kmsIn the kms in of this dms poc
	*/
	@Override
	public void setKmsIn(long kmsIn) {
		_dmsPoc.setKmsIn(kmsIn);
	}

	/**
	* Sets the labor estimate of this dms poc.
	*
	* @param laborEstimate the labor estimate of this dms poc
	*/
	@Override
	public void setLaborEstimate(long laborEstimate) {
		_dmsPoc.setLaborEstimate(laborEstimate);
	}

	/**
	* Sets the labour catagory of this dms poc.
	*
	* @param labourCatagory the labour catagory of this dms poc
	*/
	@Override
	public void setLabourCatagory(String labourCatagory) {
		_dmsPoc.setLabourCatagory(labourCatagory);
	}

	/**
	* Sets the labour code of this dms poc.
	*
	* @param labourCode the labour code of this dms poc
	*/
	@Override
	public void setLabourCode(String labourCode) {
		_dmsPoc.setLabourCode(labourCode);
	}

	/**
	* Sets the labour cost of this dms poc.
	*
	* @param labourCost the labour cost of this dms poc
	*/
	@Override
	public void setLabourCost(long labourCost) {
		_dmsPoc.setLabourCost(labourCost);
	}

	/**
	* Sets the labour description of this dms poc.
	*
	* @param labourDescription the labour description of this dms poc
	*/
	@Override
	public void setLabourDescription(String labourDescription) {
		_dmsPoc.setLabourDescription(labourDescription);
	}

	/**
	* Sets the labour json str of this dms poc.
	*
	* @param labourJSONStr the labour json str of this dms poc
	*/
	@Override
	public void setLabourJSONStr(String labourJSONStr) {
		_dmsPoc.setLabourJSONStr(labourJSONStr);
	}

	/**
	* Sets the labour rate of this dms poc.
	*
	* @param labourRate the labour rate of this dms poc
	*/
	@Override
	public void setLabourRate(String labourRate) {
		_dmsPoc.setLabourRate(labourRate);
	}

	/**
	* Sets the labour total of this dms poc.
	*
	* @param labourTotal the labour total of this dms poc
	*/
	@Override
	public void setLabourTotal(long labourTotal) {
		_dmsPoc.setLabourTotal(labourTotal);
	}

	/**
	* Sets the lights of this dms poc.
	*
	* @param lights the lights of this dms poc
	*/
	@Override
	public void setLights(String lights) {
		_dmsPoc.setLights(lights);
	}

	/**
	* Sets the model of this dms poc.
	*
	* @param model the model of this dms poc
	*/
	@Override
	public void setModel(String model) {
		_dmsPoc.setModel(model);
	}

	/**
	* Sets the mode of payment of this dms poc.
	*
	* @param modeOfPayment the mode of payment of this dms poc
	*/
	@Override
	public void setModeOfPayment(String modeOfPayment) {
		_dmsPoc.setModeOfPayment(modeOfPayment);
	}

	/**
	* Sets the modification or non obm fittings of this dms poc.
	*
	* @param modificationOrNonOBMFittings the modification or non obm fittings of this dms poc
	*/
	@Override
	public void setModificationOrNonOBMFittings(
		String modificationOrNonOBMFittings) {
		_dmsPoc.setModificationOrNonOBMFittings(modificationOrNonOBMFittings);
	}

	/**
	* Sets the modified by of this dms poc.
	*
	* @param modifiedBy the modified by of this dms poc
	*/
	@Override
	public void setModifiedBy(long modifiedBy) {
		_dmsPoc.setModifiedBy(modifiedBy);
	}

	/**
	* Sets the modified by name of this dms poc.
	*
	* @param modifiedByName the modified by name of this dms poc
	*/
	@Override
	public void setModifiedByName(String modifiedByName) {
		_dmsPoc.setModifiedByName(modifiedByName);
	}

	/**
	* Sets the modified date of this dms poc.
	*
	* @param modifiedDate the modified date of this dms poc
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_dmsPoc.setModifiedDate(modifiedDate);
	}

	/**
	* Sets the monograms of this dms poc.
	*
	* @param monograms the monograms of this dms poc
	*/
	@Override
	public void setMonograms(String monograms) {
		_dmsPoc.setMonograms(monograms);
	}

	/**
	* Sets the mud flaps of this dms poc.
	*
	* @param mudFlaps the mud flaps of this dms poc
	*/
	@Override
	public void setMudFlaps(String mudFlaps) {
		_dmsPoc.setMudFlaps(mudFlaps);
	}

	/**
	* Sets the name of technician of this dms poc.
	*
	* @param nameOfTechnician the name of technician of this dms poc
	*/
	@Override
	public void setNameOfTechnician(String nameOfTechnician) {
		_dmsPoc.setNameOfTechnician(nameOfTechnician);
	}

	@Override
	public void setNew(boolean n) {
		_dmsPoc.setNew(n);
	}

	/**
	* Sets the no of keys of this dms poc.
	*
	* @param noOfKeys the no of keys of this dms poc
	*/
	@Override
	public void setNoOfKeys(long noOfKeys) {
		_dmsPoc.setNoOfKeys(noOfKeys);
	}

	/**
	* Sets the oil level of this dms poc.
	*
	* @param oilLevel the oil level of this dms poc
	*/
	@Override
	public void setOilLevel(String oilLevel) {
		_dmsPoc.setOilLevel(oilLevel);
	}

	/**
	* Sets the order date in of this dms poc.
	*
	* @param orderDateIn the order date in of this dms poc
	*/
	@Override
	public void setOrderDateIn(Date orderDateIn) {
		_dmsPoc.setOrderDateIn(orderDateIn);
	}

	/**
	* Sets the order time in of this dms poc.
	*
	* @param orderTimeIn the order time in of this dms poc
	*/
	@Override
	public void setOrderTimeIn(Date orderTimeIn) {
		_dmsPoc.setOrderTimeIn(orderTimeIn);
	}

	/**
	* Sets the org ID of this dms poc.
	*
	* @param orgId the org ID of this dms poc
	*/
	@Override
	public void setOrgId(long orgId) {
		_dmsPoc.setOrgId(orgId);
	}

	/**
	* Sets the other loose items of this dms poc.
	*
	* @param otherLooseItems the other loose items of this dms poc
	*/
	@Override
	public void setOtherLooseItems(String otherLooseItems) {
		_dmsPoc.setOtherLooseItems(otherLooseItems);
	}

	/**
	* Sets the owners manual of this dms poc.
	*
	* @param ownersManual the owners manual of this dms poc
	*/
	@Override
	public void setOwnersManual(String ownersManual) {
		_dmsPoc.setOwnersManual(ownersManual);
	}

	/**
	* Sets the part catagory of this dms poc.
	*
	* @param partCatagory the part catagory of this dms poc
	*/
	@Override
	public void setPartCatagory(String partCatagory) {
		_dmsPoc.setPartCatagory(partCatagory);
	}

	/**
	* Sets the part cost of this dms poc.
	*
	* @param partCost the part cost of this dms poc
	*/
	@Override
	public void setPartCost(String partCost) {
		_dmsPoc.setPartCost(partCost);
	}

	/**
	* Sets the part description of this dms poc.
	*
	* @param partDescription the part description of this dms poc
	*/
	@Override
	public void setPartDescription(String partDescription) {
		_dmsPoc.setPartDescription(partDescription);
	}

	/**
	* Sets the part number of this dms poc.
	*
	* @param partNumber the part number of this dms poc
	*/
	@Override
	public void setPartNumber(String partNumber) {
		_dmsPoc.setPartNumber(partNumber);
	}

	/**
	* Sets the part quantity of this dms poc.
	*
	* @param partQuantity the part quantity of this dms poc
	*/
	@Override
	public void setPartQuantity(String partQuantity) {
		_dmsPoc.setPartQuantity(partQuantity);
	}

	/**
	* Sets the part rate of this dms poc.
	*
	* @param partRate the part rate of this dms poc
	*/
	@Override
	public void setPartRate(String partRate) {
		_dmsPoc.setPartRate(partRate);
	}

	/**
	* Sets the parts of this dms poc.
	*
	* @param parts the parts of this dms poc
	*/
	@Override
	public void setParts(long parts) {
		_dmsPoc.setParts(parts);
	}

	/**
	* Sets the parts json str of this dms poc.
	*
	* @param partsJSONStr the parts json str of this dms poc
	*/
	@Override
	public void setPartsJSONStr(String partsJSONStr) {
		_dmsPoc.setPartsJSONStr(partsJSONStr);
	}

	/**
	* Sets the part total of this dms poc.
	*
	* @param partTotal the part total of this dms poc
	*/
	@Override
	public void setPartTotal(String partTotal) {
		_dmsPoc.setPartTotal(partTotal);
	}

	/**
	* Sets the polishing of this dms poc.
	*
	* @param polishing the polishing of this dms poc
	*/
	@Override
	public void setPolishing(String polishing) {
		_dmsPoc.setPolishing(polishing);
	}

	/**
	* Sets the primary key of this dms poc.
	*
	* @param primaryKey the primary key of this dms poc
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_dmsPoc.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_dmsPoc.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the quick reference guide of this dms poc.
	*
	* @param quickReferenceGuide the quick reference guide of this dms poc
	*/
	@Override
	public void setQuickReferenceGuide(String quickReferenceGuide) {
		_dmsPoc.setQuickReferenceGuide(quickReferenceGuide);
	}

	/**
	* Sets the rear left of this dms poc.
	*
	* @param rearLeft the rear left of this dms poc
	*/
	@Override
	public void setRearLeft(String rearLeft) {
		_dmsPoc.setRearLeft(rearLeft);
	}

	/**
	* Sets the rear right of this dms poc.
	*
	* @param rearRight the rear right of this dms poc
	*/
	@Override
	public void setRearRight(String rearRight) {
		_dmsPoc.setRearRight(rearRight);
	}

	/**
	* Sets the reason for visit of this dms poc.
	*
	* @param reasonForVisit the reason for visit of this dms poc
	*/
	@Override
	public void setReasonForVisit(String reasonForVisit) {
		_dmsPoc.setReasonForVisit(reasonForVisit);
	}

	/**
	* Sets the reg no of this dms poc.
	*
	* @param regNo the reg no of this dms poc
	*/
	@Override
	public void setRegNo(String regNo) {
		_dmsPoc.setRegNo(regNo);
	}

	/**
	* Sets the remarks area of this dms poc.
	*
	* @param remarksArea the remarks area of this dms poc
	*/
	@Override
	public void setRemarksArea(String remarksArea) {
		_dmsPoc.setRemarksArea(remarksArea);
	}

	/**
	* Sets the repair order no of this dms poc.
	*
	* @param repairOrderNo the repair order no of this dms poc
	*/
	@Override
	public void setRepairOrderNo(String repairOrderNo) {
		_dmsPoc.setRepairOrderNo(repairOrderNo);
	}

	/**
	* Sets the road test date of this dms poc.
	*
	* @param roadTestDate the road test date of this dms poc
	*/
	@Override
	public void setRoadTestDate(Date roadTestDate) {
		_dmsPoc.setRoadTestDate(roadTestDate);
	}

	/**
	* Sets the road test km in of this dms poc.
	*
	* @param roadTestKmIn the road test km in of this dms poc
	*/
	@Override
	public void setRoadTestKmIn(long roadTestKmIn) {
		_dmsPoc.setRoadTestKmIn(roadTestKmIn);
	}

	/**
	* Sets the road test km out of this dms poc.
	*
	* @param roadTestKmOut the road test km out of this dms poc
	*/
	@Override
	public void setRoadTestKmOut(long roadTestKmOut) {
		_dmsPoc.setRoadTestKmOut(roadTestKmOut);
	}

	/**
	* Sets the road test signature of this dms poc.
	*
	* @param roadTestSignature the road test signature of this dms poc
	*/
	@Override
	public void setRoadTestSignature(String roadTestSignature) {
		_dmsPoc.setRoadTestSignature(roadTestSignature);
	}

	/**
	* Sets whether this dms poc is rsa required.
	*
	* @param rsaRequired the rsa required of this dms poc
	*/
	@Override
	public void setRsaRequired(boolean rsaRequired) {
		_dmsPoc.setRsaRequired(rsaRequired);
	}

	/**
	* Sets the scratch of this dms poc.
	*
	* @param scratch the scratch of this dms poc
	*/
	@Override
	public void setScratch(String scratch) {
		_dmsPoc.setScratch(scratch);
	}

	/**
	* Sets the ser sche maintenance manual of this dms poc.
	*
	* @param serScheMaintenanceManual the ser sche maintenance manual of this dms poc
	*/
	@Override
	public void setSerScheMaintenanceManual(String serScheMaintenanceManual) {
		_dmsPoc.setSerScheMaintenanceManual(serScheMaintenanceManual);
	}

	/**
	* Sets the service advisor of this dms poc.
	*
	* @param serviceAdvisor the service advisor of this dms poc
	*/
	@Override
	public void setServiceAdvisor(String serviceAdvisor) {
		_dmsPoc.setServiceAdvisor(serviceAdvisor);
	}

	/**
	* Sets the service advisor mobile no of this dms poc.
	*
	* @param serviceAdvisorMobileNo the service advisor mobile no of this dms poc
	*/
	@Override
	public void setServiceAdvisorMobileNo(long serviceAdvisorMobileNo) {
		_dmsPoc.setServiceAdvisorMobileNo(serviceAdvisorMobileNo);
	}

	/**
	* Sets the service advisot signature of this dms poc.
	*
	* @param serviceAdvisotSignature the service advisot signature of this dms poc
	*/
	@Override
	public void setServiceAdvisotSignature(String serviceAdvisotSignature) {
		_dmsPoc.setServiceAdvisotSignature(serviceAdvisotSignature);
	}

	/**
	* Sets the service plan of this dms poc.
	*
	* @param servicePlan the service plan of this dms poc
	*/
	@Override
	public void setServicePlan(String servicePlan) {
		_dmsPoc.setServicePlan(servicePlan);
	}

	/**
	* Sets the sold by dealer of this dms poc.
	*
	* @param soldByDealer the sold by dealer of this dms poc
	*/
	@Override
	public void setSoldByDealer(String soldByDealer) {
		_dmsPoc.setSoldByDealer(soldByDealer);
	}

	/**
	* Sets the spare wheel of this dms poc.
	*
	* @param spareWheel the spare wheel of this dms poc
	*/
	@Override
	public void setSpareWheel(String spareWheel) {
		_dmsPoc.setSpareWheel(spareWheel);
	}

	/**
	* Sets the status of this dms poc.
	*
	* @param status the status of this dms poc
	*/
	@Override
	public void setStatus(String status) {
		_dmsPoc.setStatus(status);
	}

	/**
	* Sets the taxes as applicable of this dms poc.
	*
	* @param taxesAsApplicable the taxes as applicable of this dms poc
	*/
	@Override
	public void setTaxesAsApplicable(String taxesAsApplicable) {
		_dmsPoc.setTaxesAsApplicable(taxesAsApplicable);
	}

	/**
	* Sets the technician signature of this dms poc.
	*
	* @param technicianSignature the technician signature of this dms poc
	*/
	@Override
	public void setTechnicianSignature(String technicianSignature) {
		_dmsPoc.setTechnicianSignature(technicianSignature);
	}

	/**
	* Sets the terms and conditions of this dms poc.
	*
	* @param termsAndConditions the terms and conditions of this dms poc
	*/
	@Override
	public void setTermsAndConditions(String termsAndConditions) {
		_dmsPoc.setTermsAndConditions(termsAndConditions);
	}

	/**
	* Sets the terms strictly of this dms poc.
	*
	* @param termsStrictly the terms strictly of this dms poc
	*/
	@Override
	public void setTermsStrictly(String termsStrictly) {
		_dmsPoc.setTermsStrictly(termsStrictly);
	}

	/**
	* Sets the time start of this dms poc.
	*
	* @param timeStart the time start of this dms poc
	*/
	@Override
	public void setTimeStart(String timeStart) {
		_dmsPoc.setTimeStart(timeStart);
	}

	/**
	* Sets the time stop of this dms poc.
	*
	* @param timeStop the time stop of this dms poc
	*/
	@Override
	public void setTimeStop(String timeStop) {
		_dmsPoc.setTimeStop(timeStop);
	}

	/**
	* Sets the time unit of this dms poc.
	*
	* @param timeUnit the time unit of this dms poc
	*/
	@Override
	public void setTimeUnit(String timeUnit) {
		_dmsPoc.setTimeUnit(timeUnit);
	}

	/**
	* Sets whether this dms poc is to show.
	*
	* @param toShow the to show of this dms poc
	*/
	@Override
	public void setToShow(boolean toShow) {
		_dmsPoc.setToShow(toShow);
	}

	/**
	* Sets the transaction no of this dms poc.
	*
	* @param transactionNo the transaction no of this dms poc
	*/
	@Override
	public void setTransactionNo(String transactionNo) {
		_dmsPoc.setTransactionNo(transactionNo);
	}

	/**
	* Sets the tread depth of this dms poc.
	*
	* @param treadDepth the tread depth of this dms poc
	*/
	@Override
	public void setTreadDepth(String treadDepth) {
		_dmsPoc.setTreadDepth(treadDepth);
	}

	/**
	* Sets the tyre condition of this dms poc.
	*
	* @param tyreCondition the tyre condition of this dms poc
	*/
	@Override
	public void setTyreCondition(String tyreCondition) {
		_dmsPoc.setTyreCondition(tyreCondition);
	}

	/**
	* Sets the underbody of this dms poc.
	*
	* @param underbody the underbody of this dms poc
	*/
	@Override
	public void setUnderbody(String underbody) {
		_dmsPoc.setUnderbody(underbody);
	}

	/**
	* Sets the user ID of this dms poc.
	*
	* @param userId the user ID of this dms poc
	*/
	@Override
	public void setUserId(long userId) {
		_dmsPoc.setUserId(userId);
	}

	/**
	* Sets the user name of this dms poc.
	*
	* @param userName the user name of this dms poc
	*/
	@Override
	public void setUserName(String userName) {
		_dmsPoc.setUserName(userName);
	}

	/**
	* Sets the user uuid of this dms poc.
	*
	* @param userUuid the user uuid of this dms poc
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_dmsPoc.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this dms poc.
	*
	* @param uuid the uuid of this dms poc
	*/
	@Override
	public void setUuid(String uuid) {
		_dmsPoc.setUuid(uuid);
	}

	/**
	* Sets whether this dms poc is vacuum cleaned.
	*
	* @param vacuumCleaned the vacuum cleaned of this dms poc
	*/
	@Override
	public void setVacuumCleaned(boolean vacuumCleaned) {
		_dmsPoc.setVacuumCleaned(vacuumCleaned);
	}

	/**
	* Sets the version of this dms poc.
	*
	* @param version the version of this dms poc
	*/
	@Override
	public void setVersion(String version) {
		_dmsPoc.setVersion(version);
	}

	/**
	* Sets the vin of this dms poc.
	*
	* @param VIN the vin of this dms poc
	*/
	@Override
	public void setVIN(String VIN) {
		_dmsPoc.setVIN(VIN);
	}

	/**
	* Sets the warning triangle of this dms poc.
	*
	* @param warningTriangle the warning triangle of this dms poc
	*/
	@Override
	public void setWarningTriangle(String warningTriangle) {
		_dmsPoc.setWarningTriangle(warningTriangle);
	}

	/**
	* Sets the washing of this dms poc.
	*
	* @param washing the washing of this dms poc
	*/
	@Override
	public void setWashing(String washing) {
		_dmsPoc.setWashing(washing);
	}

	/**
	* Sets the washing checker signature of this dms poc.
	*
	* @param washingCheckerSignature the washing checker signature of this dms poc
	*/
	@Override
	public void setWashingCheckerSignature(String washingCheckerSignature) {
		_dmsPoc.setWashingCheckerSignature(washingCheckerSignature);
	}

	/**
	* Sets the windows glazzing of this dms poc.
	*
	* @param windowsGlazzing the windows glazzing of this dms poc
	*/
	@Override
	public void setWindowsGlazzing(String windowsGlazzing) {
		_dmsPoc.setWindowsGlazzing(windowsGlazzing);
	}

	/**
	* Sets the windshield washer of this dms poc.
	*
	* @param windshieldWasher the windshield washer of this dms poc
	*/
	@Override
	public void setWindshieldWasher(String windshieldWasher) {
		_dmsPoc.setWindshieldWasher(windshieldWasher);
	}

	/**
	* Sets the wiper blades of this dms poc.
	*
	* @param wiperBlades the wiper blades of this dms poc
	*/
	@Override
	public void setWiperBlades(String wiperBlades) {
		_dmsPoc.setWiperBlades(wiperBlades);
	}

	/**
	* Sets the workshop copy of this dms poc.
	*
	* @param workshopCopy the workshop copy of this dms poc
	*/
	@Override
	public void setWorkshopCopy(String workshopCopy) {
		_dmsPoc.setWorkshopCopy(workshopCopy);
	}

	/**
	* Sets the work to be done of this dms poc.
	*
	* @param workToBeDone the work to be done of this dms poc
	*/
	@Override
	public void setWorkToBeDone(String workToBeDone) {
		_dmsPoc.setWorkToBeDone(workToBeDone);
	}

	/**
	* Sets the x dent of this dms poc.
	*
	* @param xDent the x dent of this dms poc
	*/
	@Override
	public void setXDent(String xDent) {
		_dmsPoc.setXDent(xDent);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<DmsPoc> toCacheModel() {
		return _dmsPoc.toCacheModel();
	}

	@Override
	public DmsPoc toEscapedModel() {
		return new DmsPocWrapper(_dmsPoc.toEscapedModel());
	}

	@Override
	public String toString() {
		return _dmsPoc.toString();
	}

	@Override
	public DmsPoc toUnescapedModel() {
		return new DmsPocWrapper(_dmsPoc.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _dmsPoc.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmsPocWrapper)) {
			return false;
		}

		DmsPocWrapper dmsPocWrapper = (DmsPocWrapper)obj;

		if (Objects.equals(_dmsPoc, dmsPocWrapper._dmsPoc)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _dmsPoc.getStagedModelType();
	}

	@Override
	public DmsPoc getWrappedModel() {
		return _dmsPoc;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _dmsPoc.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _dmsPoc.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_dmsPoc.resetOriginalValues();
	}

	private final DmsPoc _dmsPoc;
}