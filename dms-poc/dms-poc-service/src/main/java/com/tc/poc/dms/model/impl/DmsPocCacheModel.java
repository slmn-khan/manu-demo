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

package com.tc.poc.dms.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import com.tc.poc.dms.model.DmsPoc;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing DmsPoc in entity cache.
 *
 * @author Manisha Gera
 * @see DmsPoc
 * @generated
 */
@ProviderType
public class DmsPocCacheModel implements CacheModel<DmsPoc>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof DmsPocCacheModel)) {
			return false;
		}

		DmsPocCacheModel dmsPocCacheModel = (DmsPocCacheModel)obj;

		if (id == dmsPocCacheModel.id) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, id);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(305);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", id=");
		sb.append(id);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", orgId=");
		sb.append(orgId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", modifiedBy=");
		sb.append(modifiedBy);
		sb.append(", modifiedByName=");
		sb.append(modifiedByName);
		sb.append(", deleted=");
		sb.append(deleted);
		sb.append(", repairOrderNo=");
		sb.append(repairOrderNo);
		sb.append(", dealerCode=");
		sb.append(dealerCode);
		sb.append(", authorisedDealerInfo=");
		sb.append(authorisedDealerInfo);
		sb.append(", dealershipName=");
		sb.append(dealershipName);
		sb.append(", dealershipAddress=");
		sb.append(dealershipAddress);
		sb.append(", dealerShipPhoneNo=");
		sb.append(dealerShipPhoneNo);
		sb.append(", faxNo=");
		sb.append(faxNo);
		sb.append(", dealershipEmail=");
		sb.append(dealershipEmail);
		sb.append(", GST=");
		sb.append(GST);
		sb.append(", customerName=");
		sb.append(customerName);
		sb.append(", customerAddress=");
		sb.append(customerAddress);
		sb.append(", customerMobileNo=");
		sb.append(customerMobileNo);
		sb.append(", customerEmailAddress=");
		sb.append(customerEmailAddress);
		sb.append(", contactPerson=");
		sb.append(contactPerson);
		sb.append(", contactPersonPhone=");
		sb.append(contactPersonPhone);
		sb.append(", regNo=");
		sb.append(regNo);
		sb.append(", VIN=");
		sb.append(VIN);
		sb.append(", dateOfDelivery=");
		sb.append(dateOfDelivery);
		sb.append(", kmsIn=");
		sb.append(kmsIn);
		sb.append(", model=");
		sb.append(model);
		sb.append(", engineNo=");
		sb.append(engineNo);
		sb.append(", insurancePolicyNo=");
		sb.append(insurancePolicyNo);
		sb.append(", insuranceExpiryDate=");
		sb.append(insuranceExpiryDate);
		sb.append(", rsaRequired=");
		sb.append(rsaRequired);
		sb.append(", appointmentType=");
		sb.append(appointmentType);
		sb.append(", orderDateIn=");
		sb.append(orderDateIn);
		sb.append(", orderTimeIn=");
		sb.append(orderTimeIn);
		sb.append(", serviceAdvisor=");
		sb.append(serviceAdvisor);
		sb.append(", serviceAdvisorMobileNo=");
		sb.append(serviceAdvisorMobileNo);
		sb.append(", soldByDealer=");
		sb.append(soldByDealer);
		sb.append(", customerMobilityType=");
		sb.append(customerMobilityType);
		sb.append(", transactionNo=");
		sb.append(transactionNo);
		sb.append(", reasonForVisit=");
		sb.append(reasonForVisit);
		sb.append(", extendedWarranty=");
		sb.append(extendedWarranty);
		sb.append(", servicePlan=");
		sb.append(servicePlan);
		sb.append(", customerOrderDescription=");
		sb.append(customerOrderDescription);
		sb.append(", complaint=");
		sb.append(complaint);
		sb.append(", workToBeDone=");
		sb.append(workToBeDone);
		sb.append(", instruction=");
		sb.append(instruction);
		sb.append(", carPicture=");
		sb.append(carPicture);
		sb.append(", xDent=");
		sb.append(xDent);
		sb.append(", scratch=");
		sb.append(scratch);
		sb.append(", bodyDamage=");
		sb.append(bodyDamage);
		sb.append(", modificationOrNonOBMFittings=");
		sb.append(modificationOrNonOBMFittings);
		sb.append(", tyreCondition=");
		sb.append(tyreCondition);
		sb.append(", treadDepth=");
		sb.append(treadDepth);
		sb.append(", frontRight=");
		sb.append(frontRight);
		sb.append(", frontLeft=");
		sb.append(frontLeft);
		sb.append(", rearRight=");
		sb.append(rearRight);
		sb.append(", rearLeft=");
		sb.append(rearLeft);
		sb.append(", windowsGlazzing=");
		sb.append(windowsGlazzing);
		sb.append(", wiperBlades=");
		sb.append(wiperBlades);
		sb.append(", lights=");
		sb.append(lights);
		sb.append(", exhaustSystem=");
		sb.append(exhaustSystem);
		sb.append(", underbody=");
		sb.append(underbody);
		sb.append(", engineCompartment=");
		sb.append(engineCompartment);
		sb.append(", washing=");
		sb.append(washing);
		sb.append(", oilLevel=");
		sb.append(oilLevel);
		sb.append(", coolant=");
		sb.append(coolant);
		sb.append(", windshieldWasher=");
		sb.append(windshieldWasher);
		sb.append(", brakes=");
		sb.append(brakes);
		sb.append(", axle=");
		sb.append(axle);
		sb.append(", monograms=");
		sb.append(monograms);
		sb.append(", polishing=");
		sb.append(polishing);
		sb.append(", fuel=");
		sb.append(fuel);
		sb.append(", ownersManual=");
		sb.append(ownersManual);
		sb.append(", serScheMaintenanceManual=");
		sb.append(serScheMaintenanceManual);
		sb.append(", infotainmentMmiNavigManual=");
		sb.append(infotainmentMmiNavigManual);
		sb.append(", extWarrantyBook=");
		sb.append(extWarrantyBook);
		sb.append(", quickReferenceGuide=");
		sb.append(quickReferenceGuide);
		sb.append(", spareWheel=");
		sb.append(spareWheel);
		sb.append(", jackToolKits=");
		sb.append(jackToolKits);
		sb.append(", floorMat=");
		sb.append(floorMat);
		sb.append(", mudFlaps=");
		sb.append(mudFlaps);
		sb.append(", warningTriangle=");
		sb.append(warningTriangle);
		sb.append(", firstAidKit=");
		sb.append(firstAidKit);
		sb.append(", noOfKeys=");
		sb.append(noOfKeys);
		sb.append(", otherLooseItems=");
		sb.append(otherLooseItems);
		sb.append(", financialInformation=");
		sb.append(financialInformation);
		sb.append(", modeOfPayment=");
		sb.append(modeOfPayment);
		sb.append(", estimatedCost=");
		sb.append(estimatedCost);
		sb.append(", taxesAsApplicable=");
		sb.append(taxesAsApplicable);
		sb.append(", estimatedDateOfDelivery=");
		sb.append(estimatedDateOfDelivery);
		sb.append(", estimatedDeliveryTime=");
		sb.append(estimatedDeliveryTime);
		sb.append(", laborEstimate=");
		sb.append(laborEstimate);
		sb.append(", parts=");
		sb.append(parts);
		sb.append(", termsAndConditions=");
		sb.append(termsAndConditions);
		sb.append(", grantMyConsent=");
		sb.append(grantMyConsent);
		sb.append(", serviceAdvisotSignature=");
		sb.append(serviceAdvisotSignature);
		sb.append(", customerSignature=");
		sb.append(customerSignature);
		sb.append(", remarksArea=");
		sb.append(remarksArea);
		sb.append(", termsStrictly=");
		sb.append(termsStrictly);
		sb.append(", workshopCopy=");
		sb.append(workshopCopy);
		sb.append(", version=");
		sb.append(version);
		sb.append(", customerWaiting=");
		sb.append(customerWaiting);
		sb.append(", campaign=");
		sb.append(campaign);
		sb.append(", dissNo=");
		sb.append(dissNo);
		sb.append(", descriptiveInformation=");
		sb.append(descriptiveInformation);
		sb.append(", timeStart=");
		sb.append(timeStart);
		sb.append(", timeStop=");
		sb.append(timeStop);
		sb.append(", nameOfTechnician=");
		sb.append(nameOfTechnician);
		sb.append(", technicianSignature=");
		sb.append(technicianSignature);
		sb.append(", inventoryPartsJSONStr=");
		sb.append(inventoryPartsJSONStr);
		sb.append(", partNumber=");
		sb.append(partNumber);
		sb.append(", partDescription=");
		sb.append(partDescription);
		sb.append(", partCatagory=");
		sb.append(partCatagory);
		sb.append(", internalPartsOrder=");
		sb.append(internalPartsOrder);
		sb.append(", partQuantity=");
		sb.append(partQuantity);
		sb.append(", partRate=");
		sb.append(partRate);
		sb.append(", partCost=");
		sb.append(partCost);
		sb.append(", partTotal=");
		sb.append(partTotal);
		sb.append(", partsJSONStr=");
		sb.append(partsJSONStr);
		sb.append(", labourDescription=");
		sb.append(labourDescription);
		sb.append(", labourCatagory=");
		sb.append(labourCatagory);
		sb.append(", labourCode=");
		sb.append(labourCode);
		sb.append(", timeUnit=");
		sb.append(timeUnit);
		sb.append(", hours=");
		sb.append(hours);
		sb.append(", labourRate=");
		sb.append(labourRate);
		sb.append(", labourCost=");
		sb.append(labourCost);
		sb.append(", labourTotal=");
		sb.append(labourTotal);
		sb.append(", labourJSONStr=");
		sb.append(labourJSONStr);
		sb.append(", additionalRepairsReqDesc=");
		sb.append(additionalRepairsReqDesc);
		sb.append(", additionalRepairsReqPart=");
		sb.append(additionalRepairsReqPart);
		sb.append(", additionalRepairsReqLabour=");
		sb.append(additionalRepairsReqLabour);
		sb.append(", additionalRepairsReqAuth=");
		sb.append(additionalRepairsReqAuth);
		sb.append(", additionalRepairsReqDT=");
		sb.append(additionalRepairsReqDT);
		sb.append(", roadTestKmOut=");
		sb.append(roadTestKmOut);
		sb.append(", roadTestKmIn=");
		sb.append(roadTestKmIn);
		sb.append(", allJobsAttended=");
		sb.append(allJobsAttended);
		sb.append(", accessoriesSettingAsOriginal=");
		sb.append(accessoriesSettingAsOriginal);
		sb.append(", roadTestSignature=");
		sb.append(roadTestSignature);
		sb.append(", roadTestDate=");
		sb.append(roadTestDate);
		sb.append(", interiors=");
		sb.append(interiors);
		sb.append(", interiorsPolishing=");
		sb.append(interiorsPolishing);
		sb.append(", exteriors=");
		sb.append(exteriors);
		sb.append(", exteriorsPolishing=");
		sb.append(exteriorsPolishing);
		sb.append(", vacuumCleaned=");
		sb.append(vacuumCleaned);
		sb.append(", washingCheckerSignature=");
		sb.append(washingCheckerSignature);
		sb.append(", status=");
		sb.append(status);
		sb.append(", toShow=");
		sb.append(toShow);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public DmsPoc toEntityModel() {
		DmsPocImpl dmsPocImpl = new DmsPocImpl();

		if (uuid == null) {
			dmsPocImpl.setUuid("");
		}
		else {
			dmsPocImpl.setUuid(uuid);
		}

		dmsPocImpl.setId(id);
		dmsPocImpl.setGroupId(groupId);
		dmsPocImpl.setOrgId(orgId);
		dmsPocImpl.setCompanyId(companyId);
		dmsPocImpl.setUserId(userId);

		if (userName == null) {
			dmsPocImpl.setUserName("");
		}
		else {
			dmsPocImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			dmsPocImpl.setCreateDate(null);
		}
		else {
			dmsPocImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			dmsPocImpl.setModifiedDate(null);
		}
		else {
			dmsPocImpl.setModifiedDate(new Date(modifiedDate));
		}

		dmsPocImpl.setModifiedBy(modifiedBy);

		if (modifiedByName == null) {
			dmsPocImpl.setModifiedByName("");
		}
		else {
			dmsPocImpl.setModifiedByName(modifiedByName);
		}

		dmsPocImpl.setDeleted(deleted);

		if (repairOrderNo == null) {
			dmsPocImpl.setRepairOrderNo("");
		}
		else {
			dmsPocImpl.setRepairOrderNo(repairOrderNo);
		}

		if (dealerCode == null) {
			dmsPocImpl.setDealerCode("");
		}
		else {
			dmsPocImpl.setDealerCode(dealerCode);
		}

		if (authorisedDealerInfo == null) {
			dmsPocImpl.setAuthorisedDealerInfo("");
		}
		else {
			dmsPocImpl.setAuthorisedDealerInfo(authorisedDealerInfo);
		}

		if (dealershipName == null) {
			dmsPocImpl.setDealershipName("");
		}
		else {
			dmsPocImpl.setDealershipName(dealershipName);
		}

		if (dealershipAddress == null) {
			dmsPocImpl.setDealershipAddress("");
		}
		else {
			dmsPocImpl.setDealershipAddress(dealershipAddress);
		}

		dmsPocImpl.setDealerShipPhoneNo(dealerShipPhoneNo);
		dmsPocImpl.setFaxNo(faxNo);

		if (dealershipEmail == null) {
			dmsPocImpl.setDealershipEmail("");
		}
		else {
			dmsPocImpl.setDealershipEmail(dealershipEmail);
		}

		if (GST == null) {
			dmsPocImpl.setGST("");
		}
		else {
			dmsPocImpl.setGST(GST);
		}

		if (customerName == null) {
			dmsPocImpl.setCustomerName("");
		}
		else {
			dmsPocImpl.setCustomerName(customerName);
		}

		if (customerAddress == null) {
			dmsPocImpl.setCustomerAddress("");
		}
		else {
			dmsPocImpl.setCustomerAddress(customerAddress);
		}

		dmsPocImpl.setCustomerMobileNo(customerMobileNo);

		if (customerEmailAddress == null) {
			dmsPocImpl.setCustomerEmailAddress("");
		}
		else {
			dmsPocImpl.setCustomerEmailAddress(customerEmailAddress);
		}

		if (contactPerson == null) {
			dmsPocImpl.setContactPerson("");
		}
		else {
			dmsPocImpl.setContactPerson(contactPerson);
		}

		dmsPocImpl.setContactPersonPhone(contactPersonPhone);

		if (regNo == null) {
			dmsPocImpl.setRegNo("");
		}
		else {
			dmsPocImpl.setRegNo(regNo);
		}

		if (VIN == null) {
			dmsPocImpl.setVIN("");
		}
		else {
			dmsPocImpl.setVIN(VIN);
		}

		if (dateOfDelivery == Long.MIN_VALUE) {
			dmsPocImpl.setDateOfDelivery(null);
		}
		else {
			dmsPocImpl.setDateOfDelivery(new Date(dateOfDelivery));
		}

		dmsPocImpl.setKmsIn(kmsIn);

		if (model == null) {
			dmsPocImpl.setModel("");
		}
		else {
			dmsPocImpl.setModel(model);
		}

		if (engineNo == null) {
			dmsPocImpl.setEngineNo("");
		}
		else {
			dmsPocImpl.setEngineNo(engineNo);
		}

		if (insurancePolicyNo == null) {
			dmsPocImpl.setInsurancePolicyNo("");
		}
		else {
			dmsPocImpl.setInsurancePolicyNo(insurancePolicyNo);
		}

		if (insuranceExpiryDate == Long.MIN_VALUE) {
			dmsPocImpl.setInsuranceExpiryDate(null);
		}
		else {
			dmsPocImpl.setInsuranceExpiryDate(new Date(insuranceExpiryDate));
		}

		dmsPocImpl.setRsaRequired(rsaRequired);

		if (appointmentType == null) {
			dmsPocImpl.setAppointmentType("");
		}
		else {
			dmsPocImpl.setAppointmentType(appointmentType);
		}

		if (orderDateIn == Long.MIN_VALUE) {
			dmsPocImpl.setOrderDateIn(null);
		}
		else {
			dmsPocImpl.setOrderDateIn(new Date(orderDateIn));
		}

		if (orderTimeIn == Long.MIN_VALUE) {
			dmsPocImpl.setOrderTimeIn(null);
		}
		else {
			dmsPocImpl.setOrderTimeIn(new Date(orderTimeIn));
		}

		if (serviceAdvisor == null) {
			dmsPocImpl.setServiceAdvisor("");
		}
		else {
			dmsPocImpl.setServiceAdvisor(serviceAdvisor);
		}

		dmsPocImpl.setServiceAdvisorMobileNo(serviceAdvisorMobileNo);

		if (soldByDealer == null) {
			dmsPocImpl.setSoldByDealer("");
		}
		else {
			dmsPocImpl.setSoldByDealer(soldByDealer);
		}

		if (customerMobilityType == null) {
			dmsPocImpl.setCustomerMobilityType("");
		}
		else {
			dmsPocImpl.setCustomerMobilityType(customerMobilityType);
		}

		if (transactionNo == null) {
			dmsPocImpl.setTransactionNo("");
		}
		else {
			dmsPocImpl.setTransactionNo(transactionNo);
		}

		if (reasonForVisit == null) {
			dmsPocImpl.setReasonForVisit("");
		}
		else {
			dmsPocImpl.setReasonForVisit(reasonForVisit);
		}

		if (extendedWarranty == null) {
			dmsPocImpl.setExtendedWarranty("");
		}
		else {
			dmsPocImpl.setExtendedWarranty(extendedWarranty);
		}

		if (servicePlan == null) {
			dmsPocImpl.setServicePlan("");
		}
		else {
			dmsPocImpl.setServicePlan(servicePlan);
		}

		if (customerOrderDescription == null) {
			dmsPocImpl.setCustomerOrderDescription("");
		}
		else {
			dmsPocImpl.setCustomerOrderDescription(customerOrderDescription);
		}

		if (complaint == null) {
			dmsPocImpl.setComplaint("");
		}
		else {
			dmsPocImpl.setComplaint(complaint);
		}

		if (workToBeDone == null) {
			dmsPocImpl.setWorkToBeDone("");
		}
		else {
			dmsPocImpl.setWorkToBeDone(workToBeDone);
		}

		if (instruction == null) {
			dmsPocImpl.setInstruction("");
		}
		else {
			dmsPocImpl.setInstruction(instruction);
		}

		if (carPicture == null) {
			dmsPocImpl.setCarPicture("");
		}
		else {
			dmsPocImpl.setCarPicture(carPicture);
		}

		if (xDent == null) {
			dmsPocImpl.setXDent("");
		}
		else {
			dmsPocImpl.setXDent(xDent);
		}

		if (scratch == null) {
			dmsPocImpl.setScratch("");
		}
		else {
			dmsPocImpl.setScratch(scratch);
		}

		if (bodyDamage == null) {
			dmsPocImpl.setBodyDamage("");
		}
		else {
			dmsPocImpl.setBodyDamage(bodyDamage);
		}

		if (modificationOrNonOBMFittings == null) {
			dmsPocImpl.setModificationOrNonOBMFittings("");
		}
		else {
			dmsPocImpl.setModificationOrNonOBMFittings(modificationOrNonOBMFittings);
		}

		if (tyreCondition == null) {
			dmsPocImpl.setTyreCondition("");
		}
		else {
			dmsPocImpl.setTyreCondition(tyreCondition);
		}

		if (treadDepth == null) {
			dmsPocImpl.setTreadDepth("");
		}
		else {
			dmsPocImpl.setTreadDepth(treadDepth);
		}

		if (frontRight == null) {
			dmsPocImpl.setFrontRight("");
		}
		else {
			dmsPocImpl.setFrontRight(frontRight);
		}

		if (frontLeft == null) {
			dmsPocImpl.setFrontLeft("");
		}
		else {
			dmsPocImpl.setFrontLeft(frontLeft);
		}

		if (rearRight == null) {
			dmsPocImpl.setRearRight("");
		}
		else {
			dmsPocImpl.setRearRight(rearRight);
		}

		if (rearLeft == null) {
			dmsPocImpl.setRearLeft("");
		}
		else {
			dmsPocImpl.setRearLeft(rearLeft);
		}

		if (windowsGlazzing == null) {
			dmsPocImpl.setWindowsGlazzing("");
		}
		else {
			dmsPocImpl.setWindowsGlazzing(windowsGlazzing);
		}

		if (wiperBlades == null) {
			dmsPocImpl.setWiperBlades("");
		}
		else {
			dmsPocImpl.setWiperBlades(wiperBlades);
		}

		if (lights == null) {
			dmsPocImpl.setLights("");
		}
		else {
			dmsPocImpl.setLights(lights);
		}

		if (exhaustSystem == null) {
			dmsPocImpl.setExhaustSystem("");
		}
		else {
			dmsPocImpl.setExhaustSystem(exhaustSystem);
		}

		if (underbody == null) {
			dmsPocImpl.setUnderbody("");
		}
		else {
			dmsPocImpl.setUnderbody(underbody);
		}

		if (engineCompartment == null) {
			dmsPocImpl.setEngineCompartment("");
		}
		else {
			dmsPocImpl.setEngineCompartment(engineCompartment);
		}

		if (washing == null) {
			dmsPocImpl.setWashing("");
		}
		else {
			dmsPocImpl.setWashing(washing);
		}

		if (oilLevel == null) {
			dmsPocImpl.setOilLevel("");
		}
		else {
			dmsPocImpl.setOilLevel(oilLevel);
		}

		if (coolant == null) {
			dmsPocImpl.setCoolant("");
		}
		else {
			dmsPocImpl.setCoolant(coolant);
		}

		if (windshieldWasher == null) {
			dmsPocImpl.setWindshieldWasher("");
		}
		else {
			dmsPocImpl.setWindshieldWasher(windshieldWasher);
		}

		if (brakes == null) {
			dmsPocImpl.setBrakes("");
		}
		else {
			dmsPocImpl.setBrakes(brakes);
		}

		if (axle == null) {
			dmsPocImpl.setAxle("");
		}
		else {
			dmsPocImpl.setAxle(axle);
		}

		if (monograms == null) {
			dmsPocImpl.setMonograms("");
		}
		else {
			dmsPocImpl.setMonograms(monograms);
		}

		if (polishing == null) {
			dmsPocImpl.setPolishing("");
		}
		else {
			dmsPocImpl.setPolishing(polishing);
		}

		if (fuel == null) {
			dmsPocImpl.setFuel("");
		}
		else {
			dmsPocImpl.setFuel(fuel);
		}

		if (ownersManual == null) {
			dmsPocImpl.setOwnersManual("");
		}
		else {
			dmsPocImpl.setOwnersManual(ownersManual);
		}

		if (serScheMaintenanceManual == null) {
			dmsPocImpl.setSerScheMaintenanceManual("");
		}
		else {
			dmsPocImpl.setSerScheMaintenanceManual(serScheMaintenanceManual);
		}

		if (infotainmentMmiNavigManual == null) {
			dmsPocImpl.setInfotainmentMmiNavigManual("");
		}
		else {
			dmsPocImpl.setInfotainmentMmiNavigManual(infotainmentMmiNavigManual);
		}

		if (extWarrantyBook == null) {
			dmsPocImpl.setExtWarrantyBook("");
		}
		else {
			dmsPocImpl.setExtWarrantyBook(extWarrantyBook);
		}

		if (quickReferenceGuide == null) {
			dmsPocImpl.setQuickReferenceGuide("");
		}
		else {
			dmsPocImpl.setQuickReferenceGuide(quickReferenceGuide);
		}

		if (spareWheel == null) {
			dmsPocImpl.setSpareWheel("");
		}
		else {
			dmsPocImpl.setSpareWheel(spareWheel);
		}

		if (jackToolKits == null) {
			dmsPocImpl.setJackToolKits("");
		}
		else {
			dmsPocImpl.setJackToolKits(jackToolKits);
		}

		if (floorMat == null) {
			dmsPocImpl.setFloorMat("");
		}
		else {
			dmsPocImpl.setFloorMat(floorMat);
		}

		if (mudFlaps == null) {
			dmsPocImpl.setMudFlaps("");
		}
		else {
			dmsPocImpl.setMudFlaps(mudFlaps);
		}

		if (warningTriangle == null) {
			dmsPocImpl.setWarningTriangle("");
		}
		else {
			dmsPocImpl.setWarningTriangle(warningTriangle);
		}

		if (firstAidKit == null) {
			dmsPocImpl.setFirstAidKit("");
		}
		else {
			dmsPocImpl.setFirstAidKit(firstAidKit);
		}

		dmsPocImpl.setNoOfKeys(noOfKeys);

		if (otherLooseItems == null) {
			dmsPocImpl.setOtherLooseItems("");
		}
		else {
			dmsPocImpl.setOtherLooseItems(otherLooseItems);
		}

		if (financialInformation == null) {
			dmsPocImpl.setFinancialInformation("");
		}
		else {
			dmsPocImpl.setFinancialInformation(financialInformation);
		}

		if (modeOfPayment == null) {
			dmsPocImpl.setModeOfPayment("");
		}
		else {
			dmsPocImpl.setModeOfPayment(modeOfPayment);
		}

		dmsPocImpl.setEstimatedCost(estimatedCost);

		if (taxesAsApplicable == null) {
			dmsPocImpl.setTaxesAsApplicable("");
		}
		else {
			dmsPocImpl.setTaxesAsApplicable(taxesAsApplicable);
		}

		if (estimatedDateOfDelivery == Long.MIN_VALUE) {
			dmsPocImpl.setEstimatedDateOfDelivery(null);
		}
		else {
			dmsPocImpl.setEstimatedDateOfDelivery(new Date(
					estimatedDateOfDelivery));
		}

		if (estimatedDeliveryTime == null) {
			dmsPocImpl.setEstimatedDeliveryTime("");
		}
		else {
			dmsPocImpl.setEstimatedDeliveryTime(estimatedDeliveryTime);
		}

		dmsPocImpl.setLaborEstimate(laborEstimate);
		dmsPocImpl.setParts(parts);

		if (termsAndConditions == null) {
			dmsPocImpl.setTermsAndConditions("");
		}
		else {
			dmsPocImpl.setTermsAndConditions(termsAndConditions);
		}

		if (grantMyConsent == null) {
			dmsPocImpl.setGrantMyConsent("");
		}
		else {
			dmsPocImpl.setGrantMyConsent(grantMyConsent);
		}

		if (serviceAdvisotSignature == null) {
			dmsPocImpl.setServiceAdvisotSignature("");
		}
		else {
			dmsPocImpl.setServiceAdvisotSignature(serviceAdvisotSignature);
		}

		if (customerSignature == null) {
			dmsPocImpl.setCustomerSignature("");
		}
		else {
			dmsPocImpl.setCustomerSignature(customerSignature);
		}

		if (remarksArea == null) {
			dmsPocImpl.setRemarksArea("");
		}
		else {
			dmsPocImpl.setRemarksArea(remarksArea);
		}

		if (termsStrictly == null) {
			dmsPocImpl.setTermsStrictly("");
		}
		else {
			dmsPocImpl.setTermsStrictly(termsStrictly);
		}

		if (workshopCopy == null) {
			dmsPocImpl.setWorkshopCopy("");
		}
		else {
			dmsPocImpl.setWorkshopCopy(workshopCopy);
		}

		if (version == null) {
			dmsPocImpl.setVersion("");
		}
		else {
			dmsPocImpl.setVersion(version);
		}

		dmsPocImpl.setCustomerWaiting(customerWaiting);

		if (campaign == null) {
			dmsPocImpl.setCampaign("");
		}
		else {
			dmsPocImpl.setCampaign(campaign);
		}

		if (dissNo == null) {
			dmsPocImpl.setDissNo("");
		}
		else {
			dmsPocImpl.setDissNo(dissNo);
		}

		if (descriptiveInformation == null) {
			dmsPocImpl.setDescriptiveInformation("");
		}
		else {
			dmsPocImpl.setDescriptiveInformation(descriptiveInformation);
		}

		if (timeStart == null) {
			dmsPocImpl.setTimeStart("");
		}
		else {
			dmsPocImpl.setTimeStart(timeStart);
		}

		if (timeStop == null) {
			dmsPocImpl.setTimeStop("");
		}
		else {
			dmsPocImpl.setTimeStop(timeStop);
		}

		if (nameOfTechnician == null) {
			dmsPocImpl.setNameOfTechnician("");
		}
		else {
			dmsPocImpl.setNameOfTechnician(nameOfTechnician);
		}

		if (technicianSignature == null) {
			dmsPocImpl.setTechnicianSignature("");
		}
		else {
			dmsPocImpl.setTechnicianSignature(technicianSignature);
		}

		if (inventoryPartsJSONStr == null) {
			dmsPocImpl.setInventoryPartsJSONStr("");
		}
		else {
			dmsPocImpl.setInventoryPartsJSONStr(inventoryPartsJSONStr);
		}

		if (partNumber == null) {
			dmsPocImpl.setPartNumber("");
		}
		else {
			dmsPocImpl.setPartNumber(partNumber);
		}

		if (partDescription == null) {
			dmsPocImpl.setPartDescription("");
		}
		else {
			dmsPocImpl.setPartDescription(partDescription);
		}

		if (partCatagory == null) {
			dmsPocImpl.setPartCatagory("");
		}
		else {
			dmsPocImpl.setPartCatagory(partCatagory);
		}

		if (internalPartsOrder == null) {
			dmsPocImpl.setInternalPartsOrder("");
		}
		else {
			dmsPocImpl.setInternalPartsOrder(internalPartsOrder);
		}

		if (partQuantity == null) {
			dmsPocImpl.setPartQuantity("");
		}
		else {
			dmsPocImpl.setPartQuantity(partQuantity);
		}

		if (partRate == null) {
			dmsPocImpl.setPartRate("");
		}
		else {
			dmsPocImpl.setPartRate(partRate);
		}

		if (partCost == null) {
			dmsPocImpl.setPartCost("");
		}
		else {
			dmsPocImpl.setPartCost(partCost);
		}

		if (partTotal == null) {
			dmsPocImpl.setPartTotal("");
		}
		else {
			dmsPocImpl.setPartTotal(partTotal);
		}

		if (partsJSONStr == null) {
			dmsPocImpl.setPartsJSONStr("");
		}
		else {
			dmsPocImpl.setPartsJSONStr(partsJSONStr);
		}

		if (labourDescription == null) {
			dmsPocImpl.setLabourDescription("");
		}
		else {
			dmsPocImpl.setLabourDescription(labourDescription);
		}

		if (labourCatagory == null) {
			dmsPocImpl.setLabourCatagory("");
		}
		else {
			dmsPocImpl.setLabourCatagory(labourCatagory);
		}

		if (labourCode == null) {
			dmsPocImpl.setLabourCode("");
		}
		else {
			dmsPocImpl.setLabourCode(labourCode);
		}

		if (timeUnit == null) {
			dmsPocImpl.setTimeUnit("");
		}
		else {
			dmsPocImpl.setTimeUnit(timeUnit);
		}

		if (hours == null) {
			dmsPocImpl.setHours("");
		}
		else {
			dmsPocImpl.setHours(hours);
		}

		if (labourRate == null) {
			dmsPocImpl.setLabourRate("");
		}
		else {
			dmsPocImpl.setLabourRate(labourRate);
		}

		dmsPocImpl.setLabourCost(labourCost);
		dmsPocImpl.setLabourTotal(labourTotal);

		if (labourJSONStr == null) {
			dmsPocImpl.setLabourJSONStr("");
		}
		else {
			dmsPocImpl.setLabourJSONStr(labourJSONStr);
		}

		if (additionalRepairsReqDesc == null) {
			dmsPocImpl.setAdditionalRepairsReqDesc("");
		}
		else {
			dmsPocImpl.setAdditionalRepairsReqDesc(additionalRepairsReqDesc);
		}

		if (additionalRepairsReqPart == null) {
			dmsPocImpl.setAdditionalRepairsReqPart("");
		}
		else {
			dmsPocImpl.setAdditionalRepairsReqPart(additionalRepairsReqPart);
		}

		if (additionalRepairsReqLabour == null) {
			dmsPocImpl.setAdditionalRepairsReqLabour("");
		}
		else {
			dmsPocImpl.setAdditionalRepairsReqLabour(additionalRepairsReqLabour);
		}

		if (additionalRepairsReqAuth == null) {
			dmsPocImpl.setAdditionalRepairsReqAuth("");
		}
		else {
			dmsPocImpl.setAdditionalRepairsReqAuth(additionalRepairsReqAuth);
		}

		if (additionalRepairsReqDT == Long.MIN_VALUE) {
			dmsPocImpl.setAdditionalRepairsReqDT(null);
		}
		else {
			dmsPocImpl.setAdditionalRepairsReqDT(new Date(
					additionalRepairsReqDT));
		}

		dmsPocImpl.setRoadTestKmOut(roadTestKmOut);
		dmsPocImpl.setRoadTestKmIn(roadTestKmIn);
		dmsPocImpl.setAllJobsAttended(allJobsAttended);
		dmsPocImpl.setAccessoriesSettingAsOriginal(accessoriesSettingAsOriginal);

		if (roadTestSignature == null) {
			dmsPocImpl.setRoadTestSignature("");
		}
		else {
			dmsPocImpl.setRoadTestSignature(roadTestSignature);
		}

		if (roadTestDate == Long.MIN_VALUE) {
			dmsPocImpl.setRoadTestDate(null);
		}
		else {
			dmsPocImpl.setRoadTestDate(new Date(roadTestDate));
		}

		dmsPocImpl.setInteriors(interiors);
		dmsPocImpl.setInteriorsPolishing(interiorsPolishing);
		dmsPocImpl.setExteriors(exteriors);
		dmsPocImpl.setExteriorsPolishing(exteriorsPolishing);
		dmsPocImpl.setVacuumCleaned(vacuumCleaned);

		if (washingCheckerSignature == null) {
			dmsPocImpl.setWashingCheckerSignature("");
		}
		else {
			dmsPocImpl.setWashingCheckerSignature(washingCheckerSignature);
		}

		if (status == null) {
			dmsPocImpl.setStatus("");
		}
		else {
			dmsPocImpl.setStatus(status);
		}

		dmsPocImpl.setToShow(toShow);

		dmsPocImpl.resetOriginalValues();

		return dmsPocImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		id = objectInput.readLong();

		groupId = objectInput.readLong();

		orgId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		modifiedBy = objectInput.readLong();
		modifiedByName = objectInput.readUTF();

		deleted = objectInput.readBoolean();
		repairOrderNo = objectInput.readUTF();
		dealerCode = objectInput.readUTF();
		authorisedDealerInfo = objectInput.readUTF();
		dealershipName = objectInput.readUTF();
		dealershipAddress = objectInput.readUTF();

		dealerShipPhoneNo = objectInput.readLong();

		faxNo = objectInput.readLong();
		dealershipEmail = objectInput.readUTF();
		GST = objectInput.readUTF();
		customerName = objectInput.readUTF();
		customerAddress = objectInput.readUTF();

		customerMobileNo = objectInput.readLong();
		customerEmailAddress = objectInput.readUTF();
		contactPerson = objectInput.readUTF();

		contactPersonPhone = objectInput.readLong();
		regNo = objectInput.readUTF();
		VIN = objectInput.readUTF();
		dateOfDelivery = objectInput.readLong();

		kmsIn = objectInput.readLong();
		model = objectInput.readUTF();
		engineNo = objectInput.readUTF();
		insurancePolicyNo = objectInput.readUTF();
		insuranceExpiryDate = objectInput.readLong();

		rsaRequired = objectInput.readBoolean();
		appointmentType = objectInput.readUTF();
		orderDateIn = objectInput.readLong();
		orderTimeIn = objectInput.readLong();
		serviceAdvisor = objectInput.readUTF();

		serviceAdvisorMobileNo = objectInput.readLong();
		soldByDealer = objectInput.readUTF();
		customerMobilityType = objectInput.readUTF();
		transactionNo = objectInput.readUTF();
		reasonForVisit = objectInput.readUTF();
		extendedWarranty = objectInput.readUTF();
		servicePlan = objectInput.readUTF();
		customerOrderDescription = objectInput.readUTF();
		complaint = objectInput.readUTF();
		workToBeDone = objectInput.readUTF();
		instruction = objectInput.readUTF();
		carPicture = objectInput.readUTF();
		xDent = objectInput.readUTF();
		scratch = objectInput.readUTF();
		bodyDamage = objectInput.readUTF();
		modificationOrNonOBMFittings = objectInput.readUTF();
		tyreCondition = objectInput.readUTF();
		treadDepth = objectInput.readUTF();
		frontRight = objectInput.readUTF();
		frontLeft = objectInput.readUTF();
		rearRight = objectInput.readUTF();
		rearLeft = objectInput.readUTF();
		windowsGlazzing = objectInput.readUTF();
		wiperBlades = objectInput.readUTF();
		lights = objectInput.readUTF();
		exhaustSystem = objectInput.readUTF();
		underbody = objectInput.readUTF();
		engineCompartment = objectInput.readUTF();
		washing = objectInput.readUTF();
		oilLevel = objectInput.readUTF();
		coolant = objectInput.readUTF();
		windshieldWasher = objectInput.readUTF();
		brakes = objectInput.readUTF();
		axle = objectInput.readUTF();
		monograms = objectInput.readUTF();
		polishing = objectInput.readUTF();
		fuel = objectInput.readUTF();
		ownersManual = objectInput.readUTF();
		serScheMaintenanceManual = objectInput.readUTF();
		infotainmentMmiNavigManual = objectInput.readUTF();
		extWarrantyBook = objectInput.readUTF();
		quickReferenceGuide = objectInput.readUTF();
		spareWheel = objectInput.readUTF();
		jackToolKits = objectInput.readUTF();
		floorMat = objectInput.readUTF();
		mudFlaps = objectInput.readUTF();
		warningTriangle = objectInput.readUTF();
		firstAidKit = objectInput.readUTF();

		noOfKeys = objectInput.readLong();
		otherLooseItems = objectInput.readUTF();
		financialInformation = objectInput.readUTF();
		modeOfPayment = objectInput.readUTF();

		estimatedCost = objectInput.readLong();
		taxesAsApplicable = objectInput.readUTF();
		estimatedDateOfDelivery = objectInput.readLong();
		estimatedDeliveryTime = objectInput.readUTF();

		laborEstimate = objectInput.readLong();

		parts = objectInput.readLong();
		termsAndConditions = objectInput.readUTF();
		grantMyConsent = objectInput.readUTF();
		serviceAdvisotSignature = objectInput.readUTF();
		customerSignature = objectInput.readUTF();
		remarksArea = objectInput.readUTF();
		termsStrictly = objectInput.readUTF();
		workshopCopy = objectInput.readUTF();
		version = objectInput.readUTF();

		customerWaiting = objectInput.readBoolean();
		campaign = objectInput.readUTF();
		dissNo = objectInput.readUTF();
		descriptiveInformation = objectInput.readUTF();
		timeStart = objectInput.readUTF();
		timeStop = objectInput.readUTF();
		nameOfTechnician = objectInput.readUTF();
		technicianSignature = objectInput.readUTF();
		inventoryPartsJSONStr = objectInput.readUTF();
		partNumber = objectInput.readUTF();
		partDescription = objectInput.readUTF();
		partCatagory = objectInput.readUTF();
		internalPartsOrder = objectInput.readUTF();
		partQuantity = objectInput.readUTF();
		partRate = objectInput.readUTF();
		partCost = objectInput.readUTF();
		partTotal = objectInput.readUTF();
		partsJSONStr = objectInput.readUTF();
		labourDescription = objectInput.readUTF();
		labourCatagory = objectInput.readUTF();
		labourCode = objectInput.readUTF();
		timeUnit = objectInput.readUTF();
		hours = objectInput.readUTF();
		labourRate = objectInput.readUTF();

		labourCost = objectInput.readLong();

		labourTotal = objectInput.readLong();
		labourJSONStr = objectInput.readUTF();
		additionalRepairsReqDesc = objectInput.readUTF();
		additionalRepairsReqPart = objectInput.readUTF();
		additionalRepairsReqLabour = objectInput.readUTF();
		additionalRepairsReqAuth = objectInput.readUTF();
		additionalRepairsReqDT = objectInput.readLong();

		roadTestKmOut = objectInput.readLong();

		roadTestKmIn = objectInput.readLong();

		allJobsAttended = objectInput.readBoolean();

		accessoriesSettingAsOriginal = objectInput.readBoolean();
		roadTestSignature = objectInput.readUTF();
		roadTestDate = objectInput.readLong();

		interiors = objectInput.readBoolean();

		interiorsPolishing = objectInput.readBoolean();

		exteriors = objectInput.readBoolean();

		exteriorsPolishing = objectInput.readBoolean();

		vacuumCleaned = objectInput.readBoolean();
		washingCheckerSignature = objectInput.readUTF();
		status = objectInput.readUTF();

		toShow = objectInput.readBoolean();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(id);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(orgId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeLong(modifiedBy);

		if (modifiedByName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(modifiedByName);
		}

		objectOutput.writeBoolean(deleted);

		if (repairOrderNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(repairOrderNo);
		}

		if (dealerCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dealerCode);
		}

		if (authorisedDealerInfo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(authorisedDealerInfo);
		}

		if (dealershipName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dealershipName);
		}

		if (dealershipAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dealershipAddress);
		}

		objectOutput.writeLong(dealerShipPhoneNo);

		objectOutput.writeLong(faxNo);

		if (dealershipEmail == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dealershipEmail);
		}

		if (GST == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(GST);
		}

		if (customerName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerName);
		}

		if (customerAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerAddress);
		}

		objectOutput.writeLong(customerMobileNo);

		if (customerEmailAddress == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerEmailAddress);
		}

		if (contactPerson == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(contactPerson);
		}

		objectOutput.writeLong(contactPersonPhone);

		if (regNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(regNo);
		}

		if (VIN == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(VIN);
		}

		objectOutput.writeLong(dateOfDelivery);

		objectOutput.writeLong(kmsIn);

		if (model == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(model);
		}

		if (engineNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(engineNo);
		}

		if (insurancePolicyNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(insurancePolicyNo);
		}

		objectOutput.writeLong(insuranceExpiryDate);

		objectOutput.writeBoolean(rsaRequired);

		if (appointmentType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(appointmentType);
		}

		objectOutput.writeLong(orderDateIn);
		objectOutput.writeLong(orderTimeIn);

		if (serviceAdvisor == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(serviceAdvisor);
		}

		objectOutput.writeLong(serviceAdvisorMobileNo);

		if (soldByDealer == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(soldByDealer);
		}

		if (customerMobilityType == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerMobilityType);
		}

		if (transactionNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(transactionNo);
		}

		if (reasonForVisit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(reasonForVisit);
		}

		if (extendedWarranty == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(extendedWarranty);
		}

		if (servicePlan == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(servicePlan);
		}

		if (customerOrderDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerOrderDescription);
		}

		if (complaint == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(complaint);
		}

		if (workToBeDone == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workToBeDone);
		}

		if (instruction == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(instruction);
		}

		if (carPicture == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(carPicture);
		}

		if (xDent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(xDent);
		}

		if (scratch == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(scratch);
		}

		if (bodyDamage == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(bodyDamage);
		}

		if (modificationOrNonOBMFittings == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(modificationOrNonOBMFittings);
		}

		if (tyreCondition == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(tyreCondition);
		}

		if (treadDepth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(treadDepth);
		}

		if (frontRight == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(frontRight);
		}

		if (frontLeft == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(frontLeft);
		}

		if (rearRight == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rearRight);
		}

		if (rearLeft == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(rearLeft);
		}

		if (windowsGlazzing == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(windowsGlazzing);
		}

		if (wiperBlades == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(wiperBlades);
		}

		if (lights == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lights);
		}

		if (exhaustSystem == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(exhaustSystem);
		}

		if (underbody == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(underbody);
		}

		if (engineCompartment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(engineCompartment);
		}

		if (washing == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(washing);
		}

		if (oilLevel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(oilLevel);
		}

		if (coolant == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(coolant);
		}

		if (windshieldWasher == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(windshieldWasher);
		}

		if (brakes == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(brakes);
		}

		if (axle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(axle);
		}

		if (monograms == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(monograms);
		}

		if (polishing == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(polishing);
		}

		if (fuel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fuel);
		}

		if (ownersManual == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(ownersManual);
		}

		if (serScheMaintenanceManual == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(serScheMaintenanceManual);
		}

		if (infotainmentMmiNavigManual == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(infotainmentMmiNavigManual);
		}

		if (extWarrantyBook == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(extWarrantyBook);
		}

		if (quickReferenceGuide == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(quickReferenceGuide);
		}

		if (spareWheel == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(spareWheel);
		}

		if (jackToolKits == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(jackToolKits);
		}

		if (floorMat == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(floorMat);
		}

		if (mudFlaps == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(mudFlaps);
		}

		if (warningTriangle == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(warningTriangle);
		}

		if (firstAidKit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstAidKit);
		}

		objectOutput.writeLong(noOfKeys);

		if (otherLooseItems == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(otherLooseItems);
		}

		if (financialInformation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(financialInformation);
		}

		if (modeOfPayment == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(modeOfPayment);
		}

		objectOutput.writeLong(estimatedCost);

		if (taxesAsApplicable == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(taxesAsApplicable);
		}

		objectOutput.writeLong(estimatedDateOfDelivery);

		if (estimatedDeliveryTime == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(estimatedDeliveryTime);
		}

		objectOutput.writeLong(laborEstimate);

		objectOutput.writeLong(parts);

		if (termsAndConditions == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(termsAndConditions);
		}

		if (grantMyConsent == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(grantMyConsent);
		}

		if (serviceAdvisotSignature == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(serviceAdvisotSignature);
		}

		if (customerSignature == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(customerSignature);
		}

		if (remarksArea == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(remarksArea);
		}

		if (termsStrictly == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(termsStrictly);
		}

		if (workshopCopy == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(workshopCopy);
		}

		if (version == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(version);
		}

		objectOutput.writeBoolean(customerWaiting);

		if (campaign == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(campaign);
		}

		if (dissNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(dissNo);
		}

		if (descriptiveInformation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(descriptiveInformation);
		}

		if (timeStart == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(timeStart);
		}

		if (timeStop == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(timeStop);
		}

		if (nameOfTechnician == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(nameOfTechnician);
		}

		if (technicianSignature == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(technicianSignature);
		}

		if (inventoryPartsJSONStr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(inventoryPartsJSONStr);
		}

		if (partNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(partNumber);
		}

		if (partDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(partDescription);
		}

		if (partCatagory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(partCatagory);
		}

		if (internalPartsOrder == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(internalPartsOrder);
		}

		if (partQuantity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(partQuantity);
		}

		if (partRate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(partRate);
		}

		if (partCost == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(partCost);
		}

		if (partTotal == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(partTotal);
		}

		if (partsJSONStr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(partsJSONStr);
		}

		if (labourDescription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labourDescription);
		}

		if (labourCatagory == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labourCatagory);
		}

		if (labourCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labourCode);
		}

		if (timeUnit == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(timeUnit);
		}

		if (hours == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(hours);
		}

		if (labourRate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labourRate);
		}

		objectOutput.writeLong(labourCost);

		objectOutput.writeLong(labourTotal);

		if (labourJSONStr == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(labourJSONStr);
		}

		if (additionalRepairsReqDesc == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(additionalRepairsReqDesc);
		}

		if (additionalRepairsReqPart == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(additionalRepairsReqPart);
		}

		if (additionalRepairsReqLabour == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(additionalRepairsReqLabour);
		}

		if (additionalRepairsReqAuth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(additionalRepairsReqAuth);
		}

		objectOutput.writeLong(additionalRepairsReqDT);

		objectOutput.writeLong(roadTestKmOut);

		objectOutput.writeLong(roadTestKmIn);

		objectOutput.writeBoolean(allJobsAttended);

		objectOutput.writeBoolean(accessoriesSettingAsOriginal);

		if (roadTestSignature == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(roadTestSignature);
		}

		objectOutput.writeLong(roadTestDate);

		objectOutput.writeBoolean(interiors);

		objectOutput.writeBoolean(interiorsPolishing);

		objectOutput.writeBoolean(exteriors);

		objectOutput.writeBoolean(exteriorsPolishing);

		objectOutput.writeBoolean(vacuumCleaned);

		if (washingCheckerSignature == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(washingCheckerSignature);
		}

		if (status == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeBoolean(toShow);
	}

	public String uuid;
	public long id;
	public long groupId;
	public long orgId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long modifiedBy;
	public String modifiedByName;
	public boolean deleted;
	public String repairOrderNo;
	public String dealerCode;
	public String authorisedDealerInfo;
	public String dealershipName;
	public String dealershipAddress;
	public long dealerShipPhoneNo;
	public long faxNo;
	public String dealershipEmail;
	public String GST;
	public String customerName;
	public String customerAddress;
	public long customerMobileNo;
	public String customerEmailAddress;
	public String contactPerson;
	public long contactPersonPhone;
	public String regNo;
	public String VIN;
	public long dateOfDelivery;
	public long kmsIn;
	public String model;
	public String engineNo;
	public String insurancePolicyNo;
	public long insuranceExpiryDate;
	public boolean rsaRequired;
	public String appointmentType;
	public long orderDateIn;
	public long orderTimeIn;
	public String serviceAdvisor;
	public long serviceAdvisorMobileNo;
	public String soldByDealer;
	public String customerMobilityType;
	public String transactionNo;
	public String reasonForVisit;
	public String extendedWarranty;
	public String servicePlan;
	public String customerOrderDescription;
	public String complaint;
	public String workToBeDone;
	public String instruction;
	public String carPicture;
	public String xDent;
	public String scratch;
	public String bodyDamage;
	public String modificationOrNonOBMFittings;
	public String tyreCondition;
	public String treadDepth;
	public String frontRight;
	public String frontLeft;
	public String rearRight;
	public String rearLeft;
	public String windowsGlazzing;
	public String wiperBlades;
	public String lights;
	public String exhaustSystem;
	public String underbody;
	public String engineCompartment;
	public String washing;
	public String oilLevel;
	public String coolant;
	public String windshieldWasher;
	public String brakes;
	public String axle;
	public String monograms;
	public String polishing;
	public String fuel;
	public String ownersManual;
	public String serScheMaintenanceManual;
	public String infotainmentMmiNavigManual;
	public String extWarrantyBook;
	public String quickReferenceGuide;
	public String spareWheel;
	public String jackToolKits;
	public String floorMat;
	public String mudFlaps;
	public String warningTriangle;
	public String firstAidKit;
	public long noOfKeys;
	public String otherLooseItems;
	public String financialInformation;
	public String modeOfPayment;
	public long estimatedCost;
	public String taxesAsApplicable;
	public long estimatedDateOfDelivery;
	public String estimatedDeliveryTime;
	public long laborEstimate;
	public long parts;
	public String termsAndConditions;
	public String grantMyConsent;
	public String serviceAdvisotSignature;
	public String customerSignature;
	public String remarksArea;
	public String termsStrictly;
	public String workshopCopy;
	public String version;
	public boolean customerWaiting;
	public String campaign;
	public String dissNo;
	public String descriptiveInformation;
	public String timeStart;
	public String timeStop;
	public String nameOfTechnician;
	public String technicianSignature;
	public String inventoryPartsJSONStr;
	public String partNumber;
	public String partDescription;
	public String partCatagory;
	public String internalPartsOrder;
	public String partQuantity;
	public String partRate;
	public String partCost;
	public String partTotal;
	public String partsJSONStr;
	public String labourDescription;
	public String labourCatagory;
	public String labourCode;
	public String timeUnit;
	public String hours;
	public String labourRate;
	public long labourCost;
	public long labourTotal;
	public String labourJSONStr;
	public String additionalRepairsReqDesc;
	public String additionalRepairsReqPart;
	public String additionalRepairsReqLabour;
	public String additionalRepairsReqAuth;
	public long additionalRepairsReqDT;
	public long roadTestKmOut;
	public long roadTestKmIn;
	public boolean allJobsAttended;
	public boolean accessoriesSettingAsOriginal;
	public String roadTestSignature;
	public long roadTestDate;
	public boolean interiors;
	public boolean interiorsPolishing;
	public boolean exteriors;
	public boolean exteriorsPolishing;
	public boolean vacuumCleaned;
	public String washingCheckerSignature;
	public String status;
	public boolean toShow;
}