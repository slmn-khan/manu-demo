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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.tc.poc.dms.service.http.DmsPocServiceSoap}.
 *
 * @author Manisha Gera
 * @see com.tc.poc.dms.service.http.DmsPocServiceSoap
 * @generated
 */
@ProviderType
public class DmsPocSoap implements Serializable {
	public static DmsPocSoap toSoapModel(DmsPoc model) {
		DmsPocSoap soapModel = new DmsPocSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setId(model.getId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setOrgId(model.getOrgId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setModifiedBy(model.getModifiedBy());
		soapModel.setModifiedByName(model.getModifiedByName());
		soapModel.setDeleted(model.isDeleted());
		soapModel.setRepairOrderNo(model.getRepairOrderNo());
		soapModel.setDealerCode(model.getDealerCode());
		soapModel.setAuthorisedDealerInfo(model.getAuthorisedDealerInfo());
		soapModel.setDealershipName(model.getDealershipName());
		soapModel.setDealershipAddress(model.getDealershipAddress());
		soapModel.setDealerShipPhoneNo(model.getDealerShipPhoneNo());
		soapModel.setFaxNo(model.getFaxNo());
		soapModel.setDealershipEmail(model.getDealershipEmail());
		soapModel.setGST(model.getGST());
		soapModel.setCustomerName(model.getCustomerName());
		soapModel.setCustomerAddress(model.getCustomerAddress());
		soapModel.setCustomerMobileNo(model.getCustomerMobileNo());
		soapModel.setCustomerEmailAddress(model.getCustomerEmailAddress());
		soapModel.setContactPerson(model.getContactPerson());
		soapModel.setContactPersonPhone(model.getContactPersonPhone());
		soapModel.setRegNo(model.getRegNo());
		soapModel.setVIN(model.getVIN());
		soapModel.setDateOfDelivery(model.getDateOfDelivery());
		soapModel.setKmsIn(model.getKmsIn());
		soapModel.setModel(model.getModel());
		soapModel.setEngineNo(model.getEngineNo());
		soapModel.setInsurancePolicyNo(model.getInsurancePolicyNo());
		soapModel.setInsuranceExpiryDate(model.getInsuranceExpiryDate());
		soapModel.setRsaRequired(model.isRsaRequired());
		soapModel.setAppointmentType(model.getAppointmentType());
		soapModel.setOrderDateIn(model.getOrderDateIn());
		soapModel.setOrderTimeIn(model.getOrderTimeIn());
		soapModel.setServiceAdvisor(model.getServiceAdvisor());
		soapModel.setServiceAdvisorMobileNo(model.getServiceAdvisorMobileNo());
		soapModel.setSoldByDealer(model.getSoldByDealer());
		soapModel.setCustomerMobilityType(model.getCustomerMobilityType());
		soapModel.setTransactionNo(model.getTransactionNo());
		soapModel.setReasonForVisit(model.getReasonForVisit());
		soapModel.setExtendedWarranty(model.getExtendedWarranty());
		soapModel.setServicePlan(model.getServicePlan());
		soapModel.setCustomerOrderDescription(model.getCustomerOrderDescription());
		soapModel.setComplaint(model.getComplaint());
		soapModel.setWorkToBeDone(model.getWorkToBeDone());
		soapModel.setInstruction(model.getInstruction());
		soapModel.setCarPicture(model.getCarPicture());
		soapModel.setXDent(model.getXDent());
		soapModel.setScratch(model.getScratch());
		soapModel.setBodyDamage(model.getBodyDamage());
		soapModel.setModificationOrNonOBMFittings(model.getModificationOrNonOBMFittings());
		soapModel.setTyreCondition(model.getTyreCondition());
		soapModel.setTreadDepth(model.getTreadDepth());
		soapModel.setFrontRight(model.getFrontRight());
		soapModel.setFrontLeft(model.getFrontLeft());
		soapModel.setRearRight(model.getRearRight());
		soapModel.setRearLeft(model.getRearLeft());
		soapModel.setWindowsGlazzing(model.getWindowsGlazzing());
		soapModel.setWiperBlades(model.getWiperBlades());
		soapModel.setLights(model.getLights());
		soapModel.setExhaustSystem(model.getExhaustSystem());
		soapModel.setUnderbody(model.getUnderbody());
		soapModel.setEngineCompartment(model.getEngineCompartment());
		soapModel.setWashing(model.getWashing());
		soapModel.setOilLevel(model.getOilLevel());
		soapModel.setCoolant(model.getCoolant());
		soapModel.setWindshieldWasher(model.getWindshieldWasher());
		soapModel.setBrakes(model.getBrakes());
		soapModel.setAxle(model.getAxle());
		soapModel.setMonograms(model.getMonograms());
		soapModel.setPolishing(model.getPolishing());
		soapModel.setFuel(model.getFuel());
		soapModel.setOwnersManual(model.getOwnersManual());
		soapModel.setSerScheMaintenanceManual(model.getSerScheMaintenanceManual());
		soapModel.setInfotainmentMmiNavigManual(model.getInfotainmentMmiNavigManual());
		soapModel.setExtWarrantyBook(model.getExtWarrantyBook());
		soapModel.setQuickReferenceGuide(model.getQuickReferenceGuide());
		soapModel.setSpareWheel(model.getSpareWheel());
		soapModel.setJackToolKits(model.getJackToolKits());
		soapModel.setFloorMat(model.getFloorMat());
		soapModel.setMudFlaps(model.getMudFlaps());
		soapModel.setWarningTriangle(model.getWarningTriangle());
		soapModel.setFirstAidKit(model.getFirstAidKit());
		soapModel.setNoOfKeys(model.getNoOfKeys());
		soapModel.setOtherLooseItems(model.getOtherLooseItems());
		soapModel.setFinancialInformation(model.getFinancialInformation());
		soapModel.setModeOfPayment(model.getModeOfPayment());
		soapModel.setEstimatedCost(model.getEstimatedCost());
		soapModel.setTaxesAsApplicable(model.getTaxesAsApplicable());
		soapModel.setEstimatedDateOfDelivery(model.getEstimatedDateOfDelivery());
		soapModel.setEstimatedDeliveryTime(model.getEstimatedDeliveryTime());
		soapModel.setLaborEstimate(model.getLaborEstimate());
		soapModel.setParts(model.getParts());
		soapModel.setTermsAndConditions(model.getTermsAndConditions());
		soapModel.setGrantMyConsent(model.getGrantMyConsent());
		soapModel.setServiceAdvisotSignature(model.getServiceAdvisotSignature());
		soapModel.setCustomerSignature(model.getCustomerSignature());
		soapModel.setRemarksArea(model.getRemarksArea());
		soapModel.setTermsStrictly(model.getTermsStrictly());
		soapModel.setWorkshopCopy(model.getWorkshopCopy());
		soapModel.setVersion(model.getVersion());
		soapModel.setCustomerWaiting(model.isCustomerWaiting());
		soapModel.setCampaign(model.getCampaign());
		soapModel.setDissNo(model.getDissNo());
		soapModel.setDescriptiveInformation(model.getDescriptiveInformation());
		soapModel.setTimeStart(model.getTimeStart());
		soapModel.setTimeStop(model.getTimeStop());
		soapModel.setNameOfTechnician(model.getNameOfTechnician());
		soapModel.setTechnicianSignature(model.getTechnicianSignature());
		soapModel.setInventoryPartsJSONStr(model.getInventoryPartsJSONStr());
		soapModel.setPartNumber(model.getPartNumber());
		soapModel.setPartDescription(model.getPartDescription());
		soapModel.setPartCatagory(model.getPartCatagory());
		soapModel.setInternalPartsOrder(model.getInternalPartsOrder());
		soapModel.setPartQuantity(model.getPartQuantity());
		soapModel.setPartRate(model.getPartRate());
		soapModel.setPartCost(model.getPartCost());
		soapModel.setPartTotal(model.getPartTotal());
		soapModel.setPartsJSONStr(model.getPartsJSONStr());
		soapModel.setLabourDescription(model.getLabourDescription());
		soapModel.setLabourCatagory(model.getLabourCatagory());
		soapModel.setLabourCode(model.getLabourCode());
		soapModel.setTimeUnit(model.getTimeUnit());
		soapModel.setHours(model.getHours());
		soapModel.setLabourRate(model.getLabourRate());
		soapModel.setLabourCost(model.getLabourCost());
		soapModel.setLabourTotal(model.getLabourTotal());
		soapModel.setLabourJSONStr(model.getLabourJSONStr());
		soapModel.setAdditionalRepairsReqDesc(model.getAdditionalRepairsReqDesc());
		soapModel.setAdditionalRepairsReqPart(model.getAdditionalRepairsReqPart());
		soapModel.setAdditionalRepairsReqLabour(model.getAdditionalRepairsReqLabour());
		soapModel.setAdditionalRepairsReqAuth(model.getAdditionalRepairsReqAuth());
		soapModel.setAdditionalRepairsReqDT(model.getAdditionalRepairsReqDT());
		soapModel.setRoadTestKmOut(model.getRoadTestKmOut());
		soapModel.setRoadTestKmIn(model.getRoadTestKmIn());
		soapModel.setAllJobsAttended(model.isAllJobsAttended());
		soapModel.setAccessoriesSettingAsOriginal(model.isAccessoriesSettingAsOriginal());
		soapModel.setRoadTestSignature(model.getRoadTestSignature());
		soapModel.setRoadTestDate(model.getRoadTestDate());
		soapModel.setInteriors(model.isInteriors());
		soapModel.setInteriorsPolishing(model.isInteriorsPolishing());
		soapModel.setExteriors(model.isExteriors());
		soapModel.setExteriorsPolishing(model.isExteriorsPolishing());
		soapModel.setVacuumCleaned(model.isVacuumCleaned());
		soapModel.setWashingCheckerSignature(model.getWashingCheckerSignature());
		soapModel.setStatus(model.getStatus());
		soapModel.setToShow(model.isToShow());

		return soapModel;
	}

	public static DmsPocSoap[] toSoapModels(DmsPoc[] models) {
		DmsPocSoap[] soapModels = new DmsPocSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static DmsPocSoap[][] toSoapModels(DmsPoc[][] models) {
		DmsPocSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new DmsPocSoap[models.length][models[0].length];
		}
		else {
			soapModels = new DmsPocSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static DmsPocSoap[] toSoapModels(List<DmsPoc> models) {
		List<DmsPocSoap> soapModels = new ArrayList<DmsPocSoap>(models.size());

		for (DmsPoc model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new DmsPocSoap[soapModels.size()]);
	}

	public DmsPocSoap() {
	}

	public long getPrimaryKey() {
		return _id;
	}

	public void setPrimaryKey(long pk) {
		setId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getId() {
		return _id;
	}

	public void setId(long id) {
		_id = id;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getOrgId() {
		return _orgId;
	}

	public void setOrgId(long orgId) {
		_orgId = orgId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getModifiedBy() {
		return _modifiedBy;
	}

	public void setModifiedBy(long modifiedBy) {
		_modifiedBy = modifiedBy;
	}

	public String getModifiedByName() {
		return _modifiedByName;
	}

	public void setModifiedByName(String modifiedByName) {
		_modifiedByName = modifiedByName;
	}

	public boolean getDeleted() {
		return _deleted;
	}

	public boolean isDeleted() {
		return _deleted;
	}

	public void setDeleted(boolean deleted) {
		_deleted = deleted;
	}

	public String getRepairOrderNo() {
		return _repairOrderNo;
	}

	public void setRepairOrderNo(String repairOrderNo) {
		_repairOrderNo = repairOrderNo;
	}

	public String getDealerCode() {
		return _dealerCode;
	}

	public void setDealerCode(String dealerCode) {
		_dealerCode = dealerCode;
	}

	public String getAuthorisedDealerInfo() {
		return _authorisedDealerInfo;
	}

	public void setAuthorisedDealerInfo(String authorisedDealerInfo) {
		_authorisedDealerInfo = authorisedDealerInfo;
	}

	public String getDealershipName() {
		return _dealershipName;
	}

	public void setDealershipName(String dealershipName) {
		_dealershipName = dealershipName;
	}

	public String getDealershipAddress() {
		return _dealershipAddress;
	}

	public void setDealershipAddress(String dealershipAddress) {
		_dealershipAddress = dealershipAddress;
	}

	public long getDealerShipPhoneNo() {
		return _dealerShipPhoneNo;
	}

	public void setDealerShipPhoneNo(long dealerShipPhoneNo) {
		_dealerShipPhoneNo = dealerShipPhoneNo;
	}

	public long getFaxNo() {
		return _faxNo;
	}

	public void setFaxNo(long faxNo) {
		_faxNo = faxNo;
	}

	public String getDealershipEmail() {
		return _dealershipEmail;
	}

	public void setDealershipEmail(String dealershipEmail) {
		_dealershipEmail = dealershipEmail;
	}

	public String getGST() {
		return _GST;
	}

	public void setGST(String GST) {
		_GST = GST;
	}

	public String getCustomerName() {
		return _customerName;
	}

	public void setCustomerName(String customerName) {
		_customerName = customerName;
	}

	public String getCustomerAddress() {
		return _customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		_customerAddress = customerAddress;
	}

	public long getCustomerMobileNo() {
		return _customerMobileNo;
	}

	public void setCustomerMobileNo(long customerMobileNo) {
		_customerMobileNo = customerMobileNo;
	}

	public String getCustomerEmailAddress() {
		return _customerEmailAddress;
	}

	public void setCustomerEmailAddress(String customerEmailAddress) {
		_customerEmailAddress = customerEmailAddress;
	}

	public String getContactPerson() {
		return _contactPerson;
	}

	public void setContactPerson(String contactPerson) {
		_contactPerson = contactPerson;
	}

	public long getContactPersonPhone() {
		return _contactPersonPhone;
	}

	public void setContactPersonPhone(long contactPersonPhone) {
		_contactPersonPhone = contactPersonPhone;
	}

	public String getRegNo() {
		return _regNo;
	}

	public void setRegNo(String regNo) {
		_regNo = regNo;
	}

	public String getVIN() {
		return _VIN;
	}

	public void setVIN(String VIN) {
		_VIN = VIN;
	}

	public Date getDateOfDelivery() {
		return _dateOfDelivery;
	}

	public void setDateOfDelivery(Date dateOfDelivery) {
		_dateOfDelivery = dateOfDelivery;
	}

	public long getKmsIn() {
		return _kmsIn;
	}

	public void setKmsIn(long kmsIn) {
		_kmsIn = kmsIn;
	}

	public String getModel() {
		return _model;
	}

	public void setModel(String model) {
		_model = model;
	}

	public String getEngineNo() {
		return _engineNo;
	}

	public void setEngineNo(String engineNo) {
		_engineNo = engineNo;
	}

	public String getInsurancePolicyNo() {
		return _insurancePolicyNo;
	}

	public void setInsurancePolicyNo(String insurancePolicyNo) {
		_insurancePolicyNo = insurancePolicyNo;
	}

	public Date getInsuranceExpiryDate() {
		return _insuranceExpiryDate;
	}

	public void setInsuranceExpiryDate(Date insuranceExpiryDate) {
		_insuranceExpiryDate = insuranceExpiryDate;
	}

	public boolean getRsaRequired() {
		return _rsaRequired;
	}

	public boolean isRsaRequired() {
		return _rsaRequired;
	}

	public void setRsaRequired(boolean rsaRequired) {
		_rsaRequired = rsaRequired;
	}

	public String getAppointmentType() {
		return _appointmentType;
	}

	public void setAppointmentType(String appointmentType) {
		_appointmentType = appointmentType;
	}

	public Date getOrderDateIn() {
		return _orderDateIn;
	}

	public void setOrderDateIn(Date orderDateIn) {
		_orderDateIn = orderDateIn;
	}

	public Date getOrderTimeIn() {
		return _orderTimeIn;
	}

	public void setOrderTimeIn(Date orderTimeIn) {
		_orderTimeIn = orderTimeIn;
	}

	public String getServiceAdvisor() {
		return _serviceAdvisor;
	}

	public void setServiceAdvisor(String serviceAdvisor) {
		_serviceAdvisor = serviceAdvisor;
	}

	public long getServiceAdvisorMobileNo() {
		return _serviceAdvisorMobileNo;
	}

	public void setServiceAdvisorMobileNo(long serviceAdvisorMobileNo) {
		_serviceAdvisorMobileNo = serviceAdvisorMobileNo;
	}

	public String getSoldByDealer() {
		return _soldByDealer;
	}

	public void setSoldByDealer(String soldByDealer) {
		_soldByDealer = soldByDealer;
	}

	public String getCustomerMobilityType() {
		return _customerMobilityType;
	}

	public void setCustomerMobilityType(String customerMobilityType) {
		_customerMobilityType = customerMobilityType;
	}

	public String getTransactionNo() {
		return _transactionNo;
	}

	public void setTransactionNo(String transactionNo) {
		_transactionNo = transactionNo;
	}

	public String getReasonForVisit() {
		return _reasonForVisit;
	}

	public void setReasonForVisit(String reasonForVisit) {
		_reasonForVisit = reasonForVisit;
	}

	public String getExtendedWarranty() {
		return _extendedWarranty;
	}

	public void setExtendedWarranty(String extendedWarranty) {
		_extendedWarranty = extendedWarranty;
	}

	public String getServicePlan() {
		return _servicePlan;
	}

	public void setServicePlan(String servicePlan) {
		_servicePlan = servicePlan;
	}

	public String getCustomerOrderDescription() {
		return _customerOrderDescription;
	}

	public void setCustomerOrderDescription(String customerOrderDescription) {
		_customerOrderDescription = customerOrderDescription;
	}

	public String getComplaint() {
		return _complaint;
	}

	public void setComplaint(String complaint) {
		_complaint = complaint;
	}

	public String getWorkToBeDone() {
		return _workToBeDone;
	}

	public void setWorkToBeDone(String workToBeDone) {
		_workToBeDone = workToBeDone;
	}

	public String getInstruction() {
		return _instruction;
	}

	public void setInstruction(String instruction) {
		_instruction = instruction;
	}

	public String getCarPicture() {
		return _carPicture;
	}

	public void setCarPicture(String carPicture) {
		_carPicture = carPicture;
	}

	public String getXDent() {
		return _xDent;
	}

	public void setXDent(String xDent) {
		_xDent = xDent;
	}

	public String getScratch() {
		return _scratch;
	}

	public void setScratch(String scratch) {
		_scratch = scratch;
	}

	public String getBodyDamage() {
		return _bodyDamage;
	}

	public void setBodyDamage(String bodyDamage) {
		_bodyDamage = bodyDamage;
	}

	public String getModificationOrNonOBMFittings() {
		return _modificationOrNonOBMFittings;
	}

	public void setModificationOrNonOBMFittings(
		String modificationOrNonOBMFittings) {
		_modificationOrNonOBMFittings = modificationOrNonOBMFittings;
	}

	public String getTyreCondition() {
		return _tyreCondition;
	}

	public void setTyreCondition(String tyreCondition) {
		_tyreCondition = tyreCondition;
	}

	public String getTreadDepth() {
		return _treadDepth;
	}

	public void setTreadDepth(String treadDepth) {
		_treadDepth = treadDepth;
	}

	public String getFrontRight() {
		return _frontRight;
	}

	public void setFrontRight(String frontRight) {
		_frontRight = frontRight;
	}

	public String getFrontLeft() {
		return _frontLeft;
	}

	public void setFrontLeft(String frontLeft) {
		_frontLeft = frontLeft;
	}

	public String getRearRight() {
		return _rearRight;
	}

	public void setRearRight(String rearRight) {
		_rearRight = rearRight;
	}

	public String getRearLeft() {
		return _rearLeft;
	}

	public void setRearLeft(String rearLeft) {
		_rearLeft = rearLeft;
	}

	public String getWindowsGlazzing() {
		return _windowsGlazzing;
	}

	public void setWindowsGlazzing(String windowsGlazzing) {
		_windowsGlazzing = windowsGlazzing;
	}

	public String getWiperBlades() {
		return _wiperBlades;
	}

	public void setWiperBlades(String wiperBlades) {
		_wiperBlades = wiperBlades;
	}

	public String getLights() {
		return _lights;
	}

	public void setLights(String lights) {
		_lights = lights;
	}

	public String getExhaustSystem() {
		return _exhaustSystem;
	}

	public void setExhaustSystem(String exhaustSystem) {
		_exhaustSystem = exhaustSystem;
	}

	public String getUnderbody() {
		return _underbody;
	}

	public void setUnderbody(String underbody) {
		_underbody = underbody;
	}

	public String getEngineCompartment() {
		return _engineCompartment;
	}

	public void setEngineCompartment(String engineCompartment) {
		_engineCompartment = engineCompartment;
	}

	public String getWashing() {
		return _washing;
	}

	public void setWashing(String washing) {
		_washing = washing;
	}

	public String getOilLevel() {
		return _oilLevel;
	}

	public void setOilLevel(String oilLevel) {
		_oilLevel = oilLevel;
	}

	public String getCoolant() {
		return _coolant;
	}

	public void setCoolant(String coolant) {
		_coolant = coolant;
	}

	public String getWindshieldWasher() {
		return _windshieldWasher;
	}

	public void setWindshieldWasher(String windshieldWasher) {
		_windshieldWasher = windshieldWasher;
	}

	public String getBrakes() {
		return _brakes;
	}

	public void setBrakes(String brakes) {
		_brakes = brakes;
	}

	public String getAxle() {
		return _axle;
	}

	public void setAxle(String axle) {
		_axle = axle;
	}

	public String getMonograms() {
		return _monograms;
	}

	public void setMonograms(String monograms) {
		_monograms = monograms;
	}

	public String getPolishing() {
		return _polishing;
	}

	public void setPolishing(String polishing) {
		_polishing = polishing;
	}

	public String getFuel() {
		return _fuel;
	}

	public void setFuel(String fuel) {
		_fuel = fuel;
	}

	public String getOwnersManual() {
		return _ownersManual;
	}

	public void setOwnersManual(String ownersManual) {
		_ownersManual = ownersManual;
	}

	public String getSerScheMaintenanceManual() {
		return _serScheMaintenanceManual;
	}

	public void setSerScheMaintenanceManual(String serScheMaintenanceManual) {
		_serScheMaintenanceManual = serScheMaintenanceManual;
	}

	public String getInfotainmentMmiNavigManual() {
		return _infotainmentMmiNavigManual;
	}

	public void setInfotainmentMmiNavigManual(String infotainmentMmiNavigManual) {
		_infotainmentMmiNavigManual = infotainmentMmiNavigManual;
	}

	public String getExtWarrantyBook() {
		return _extWarrantyBook;
	}

	public void setExtWarrantyBook(String extWarrantyBook) {
		_extWarrantyBook = extWarrantyBook;
	}

	public String getQuickReferenceGuide() {
		return _quickReferenceGuide;
	}

	public void setQuickReferenceGuide(String quickReferenceGuide) {
		_quickReferenceGuide = quickReferenceGuide;
	}

	public String getSpareWheel() {
		return _spareWheel;
	}

	public void setSpareWheel(String spareWheel) {
		_spareWheel = spareWheel;
	}

	public String getJackToolKits() {
		return _jackToolKits;
	}

	public void setJackToolKits(String jackToolKits) {
		_jackToolKits = jackToolKits;
	}

	public String getFloorMat() {
		return _floorMat;
	}

	public void setFloorMat(String floorMat) {
		_floorMat = floorMat;
	}

	public String getMudFlaps() {
		return _mudFlaps;
	}

	public void setMudFlaps(String mudFlaps) {
		_mudFlaps = mudFlaps;
	}

	public String getWarningTriangle() {
		return _warningTriangle;
	}

	public void setWarningTriangle(String warningTriangle) {
		_warningTriangle = warningTriangle;
	}

	public String getFirstAidKit() {
		return _firstAidKit;
	}

	public void setFirstAidKit(String firstAidKit) {
		_firstAidKit = firstAidKit;
	}

	public long getNoOfKeys() {
		return _noOfKeys;
	}

	public void setNoOfKeys(long noOfKeys) {
		_noOfKeys = noOfKeys;
	}

	public String getOtherLooseItems() {
		return _otherLooseItems;
	}

	public void setOtherLooseItems(String otherLooseItems) {
		_otherLooseItems = otherLooseItems;
	}

	public String getFinancialInformation() {
		return _financialInformation;
	}

	public void setFinancialInformation(String financialInformation) {
		_financialInformation = financialInformation;
	}

	public String getModeOfPayment() {
		return _modeOfPayment;
	}

	public void setModeOfPayment(String modeOfPayment) {
		_modeOfPayment = modeOfPayment;
	}

	public long getEstimatedCost() {
		return _estimatedCost;
	}

	public void setEstimatedCost(long estimatedCost) {
		_estimatedCost = estimatedCost;
	}

	public String getTaxesAsApplicable() {
		return _taxesAsApplicable;
	}

	public void setTaxesAsApplicable(String taxesAsApplicable) {
		_taxesAsApplicable = taxesAsApplicable;
	}

	public Date getEstimatedDateOfDelivery() {
		return _estimatedDateOfDelivery;
	}

	public void setEstimatedDateOfDelivery(Date estimatedDateOfDelivery) {
		_estimatedDateOfDelivery = estimatedDateOfDelivery;
	}

	public String getEstimatedDeliveryTime() {
		return _estimatedDeliveryTime;
	}

	public void setEstimatedDeliveryTime(String estimatedDeliveryTime) {
		_estimatedDeliveryTime = estimatedDeliveryTime;
	}

	public long getLaborEstimate() {
		return _laborEstimate;
	}

	public void setLaborEstimate(long laborEstimate) {
		_laborEstimate = laborEstimate;
	}

	public long getParts() {
		return _parts;
	}

	public void setParts(long parts) {
		_parts = parts;
	}

	public String getTermsAndConditions() {
		return _termsAndConditions;
	}

	public void setTermsAndConditions(String termsAndConditions) {
		_termsAndConditions = termsAndConditions;
	}

	public String getGrantMyConsent() {
		return _grantMyConsent;
	}

	public void setGrantMyConsent(String grantMyConsent) {
		_grantMyConsent = grantMyConsent;
	}

	public String getServiceAdvisotSignature() {
		return _serviceAdvisotSignature;
	}

	public void setServiceAdvisotSignature(String serviceAdvisotSignature) {
		_serviceAdvisotSignature = serviceAdvisotSignature;
	}

	public String getCustomerSignature() {
		return _customerSignature;
	}

	public void setCustomerSignature(String customerSignature) {
		_customerSignature = customerSignature;
	}

	public String getRemarksArea() {
		return _remarksArea;
	}

	public void setRemarksArea(String remarksArea) {
		_remarksArea = remarksArea;
	}

	public String getTermsStrictly() {
		return _termsStrictly;
	}

	public void setTermsStrictly(String termsStrictly) {
		_termsStrictly = termsStrictly;
	}

	public String getWorkshopCopy() {
		return _workshopCopy;
	}

	public void setWorkshopCopy(String workshopCopy) {
		_workshopCopy = workshopCopy;
	}

	public String getVersion() {
		return _version;
	}

	public void setVersion(String version) {
		_version = version;
	}

	public boolean getCustomerWaiting() {
		return _customerWaiting;
	}

	public boolean isCustomerWaiting() {
		return _customerWaiting;
	}

	public void setCustomerWaiting(boolean customerWaiting) {
		_customerWaiting = customerWaiting;
	}

	public String getCampaign() {
		return _campaign;
	}

	public void setCampaign(String campaign) {
		_campaign = campaign;
	}

	public String getDissNo() {
		return _dissNo;
	}

	public void setDissNo(String dissNo) {
		_dissNo = dissNo;
	}

	public String getDescriptiveInformation() {
		return _descriptiveInformation;
	}

	public void setDescriptiveInformation(String descriptiveInformation) {
		_descriptiveInformation = descriptiveInformation;
	}

	public String getTimeStart() {
		return _timeStart;
	}

	public void setTimeStart(String timeStart) {
		_timeStart = timeStart;
	}

	public String getTimeStop() {
		return _timeStop;
	}

	public void setTimeStop(String timeStop) {
		_timeStop = timeStop;
	}

	public String getNameOfTechnician() {
		return _nameOfTechnician;
	}

	public void setNameOfTechnician(String nameOfTechnician) {
		_nameOfTechnician = nameOfTechnician;
	}

	public String getTechnicianSignature() {
		return _technicianSignature;
	}

	public void setTechnicianSignature(String technicianSignature) {
		_technicianSignature = technicianSignature;
	}

	public String getInventoryPartsJSONStr() {
		return _inventoryPartsJSONStr;
	}

	public void setInventoryPartsJSONStr(String inventoryPartsJSONStr) {
		_inventoryPartsJSONStr = inventoryPartsJSONStr;
	}

	public String getPartNumber() {
		return _partNumber;
	}

	public void setPartNumber(String partNumber) {
		_partNumber = partNumber;
	}

	public String getPartDescription() {
		return _partDescription;
	}

	public void setPartDescription(String partDescription) {
		_partDescription = partDescription;
	}

	public String getPartCatagory() {
		return _partCatagory;
	}

	public void setPartCatagory(String partCatagory) {
		_partCatagory = partCatagory;
	}

	public String getInternalPartsOrder() {
		return _internalPartsOrder;
	}

	public void setInternalPartsOrder(String internalPartsOrder) {
		_internalPartsOrder = internalPartsOrder;
	}

	public String getPartQuantity() {
		return _partQuantity;
	}

	public void setPartQuantity(String partQuantity) {
		_partQuantity = partQuantity;
	}

	public String getPartRate() {
		return _partRate;
	}

	public void setPartRate(String partRate) {
		_partRate = partRate;
	}

	public String getPartCost() {
		return _partCost;
	}

	public void setPartCost(String partCost) {
		_partCost = partCost;
	}

	public String getPartTotal() {
		return _partTotal;
	}

	public void setPartTotal(String partTotal) {
		_partTotal = partTotal;
	}

	public String getPartsJSONStr() {
		return _partsJSONStr;
	}

	public void setPartsJSONStr(String partsJSONStr) {
		_partsJSONStr = partsJSONStr;
	}

	public String getLabourDescription() {
		return _labourDescription;
	}

	public void setLabourDescription(String labourDescription) {
		_labourDescription = labourDescription;
	}

	public String getLabourCatagory() {
		return _labourCatagory;
	}

	public void setLabourCatagory(String labourCatagory) {
		_labourCatagory = labourCatagory;
	}

	public String getLabourCode() {
		return _labourCode;
	}

	public void setLabourCode(String labourCode) {
		_labourCode = labourCode;
	}

	public String getTimeUnit() {
		return _timeUnit;
	}

	public void setTimeUnit(String timeUnit) {
		_timeUnit = timeUnit;
	}

	public String getHours() {
		return _hours;
	}

	public void setHours(String hours) {
		_hours = hours;
	}

	public String getLabourRate() {
		return _labourRate;
	}

	public void setLabourRate(String labourRate) {
		_labourRate = labourRate;
	}

	public long getLabourCost() {
		return _labourCost;
	}

	public void setLabourCost(long labourCost) {
		_labourCost = labourCost;
	}

	public long getLabourTotal() {
		return _labourTotal;
	}

	public void setLabourTotal(long labourTotal) {
		_labourTotal = labourTotal;
	}

	public String getLabourJSONStr() {
		return _labourJSONStr;
	}

	public void setLabourJSONStr(String labourJSONStr) {
		_labourJSONStr = labourJSONStr;
	}

	public String getAdditionalRepairsReqDesc() {
		return _additionalRepairsReqDesc;
	}

	public void setAdditionalRepairsReqDesc(String additionalRepairsReqDesc) {
		_additionalRepairsReqDesc = additionalRepairsReqDesc;
	}

	public String getAdditionalRepairsReqPart() {
		return _additionalRepairsReqPart;
	}

	public void setAdditionalRepairsReqPart(String additionalRepairsReqPart) {
		_additionalRepairsReqPart = additionalRepairsReqPart;
	}

	public String getAdditionalRepairsReqLabour() {
		return _additionalRepairsReqLabour;
	}

	public void setAdditionalRepairsReqLabour(String additionalRepairsReqLabour) {
		_additionalRepairsReqLabour = additionalRepairsReqLabour;
	}

	public String getAdditionalRepairsReqAuth() {
		return _additionalRepairsReqAuth;
	}

	public void setAdditionalRepairsReqAuth(String additionalRepairsReqAuth) {
		_additionalRepairsReqAuth = additionalRepairsReqAuth;
	}

	public Date getAdditionalRepairsReqDT() {
		return _additionalRepairsReqDT;
	}

	public void setAdditionalRepairsReqDT(Date additionalRepairsReqDT) {
		_additionalRepairsReqDT = additionalRepairsReqDT;
	}

	public long getRoadTestKmOut() {
		return _roadTestKmOut;
	}

	public void setRoadTestKmOut(long roadTestKmOut) {
		_roadTestKmOut = roadTestKmOut;
	}

	public long getRoadTestKmIn() {
		return _roadTestKmIn;
	}

	public void setRoadTestKmIn(long roadTestKmIn) {
		_roadTestKmIn = roadTestKmIn;
	}

	public boolean getAllJobsAttended() {
		return _allJobsAttended;
	}

	public boolean isAllJobsAttended() {
		return _allJobsAttended;
	}

	public void setAllJobsAttended(boolean allJobsAttended) {
		_allJobsAttended = allJobsAttended;
	}

	public boolean getAccessoriesSettingAsOriginal() {
		return _accessoriesSettingAsOriginal;
	}

	public boolean isAccessoriesSettingAsOriginal() {
		return _accessoriesSettingAsOriginal;
	}

	public void setAccessoriesSettingAsOriginal(
		boolean accessoriesSettingAsOriginal) {
		_accessoriesSettingAsOriginal = accessoriesSettingAsOriginal;
	}

	public String getRoadTestSignature() {
		return _roadTestSignature;
	}

	public void setRoadTestSignature(String roadTestSignature) {
		_roadTestSignature = roadTestSignature;
	}

	public Date getRoadTestDate() {
		return _roadTestDate;
	}

	public void setRoadTestDate(Date roadTestDate) {
		_roadTestDate = roadTestDate;
	}

	public boolean getInteriors() {
		return _interiors;
	}

	public boolean isInteriors() {
		return _interiors;
	}

	public void setInteriors(boolean interiors) {
		_interiors = interiors;
	}

	public boolean getInteriorsPolishing() {
		return _interiorsPolishing;
	}

	public boolean isInteriorsPolishing() {
		return _interiorsPolishing;
	}

	public void setInteriorsPolishing(boolean interiorsPolishing) {
		_interiorsPolishing = interiorsPolishing;
	}

	public boolean getExteriors() {
		return _exteriors;
	}

	public boolean isExteriors() {
		return _exteriors;
	}

	public void setExteriors(boolean exteriors) {
		_exteriors = exteriors;
	}

	public boolean getExteriorsPolishing() {
		return _exteriorsPolishing;
	}

	public boolean isExteriorsPolishing() {
		return _exteriorsPolishing;
	}

	public void setExteriorsPolishing(boolean exteriorsPolishing) {
		_exteriorsPolishing = exteriorsPolishing;
	}

	public boolean getVacuumCleaned() {
		return _vacuumCleaned;
	}

	public boolean isVacuumCleaned() {
		return _vacuumCleaned;
	}

	public void setVacuumCleaned(boolean vacuumCleaned) {
		_vacuumCleaned = vacuumCleaned;
	}

	public String getWashingCheckerSignature() {
		return _washingCheckerSignature;
	}

	public void setWashingCheckerSignature(String washingCheckerSignature) {
		_washingCheckerSignature = washingCheckerSignature;
	}

	public String getStatus() {
		return _status;
	}

	public void setStatus(String status) {
		_status = status;
	}

	public boolean getToShow() {
		return _toShow;
	}

	public boolean isToShow() {
		return _toShow;
	}

	public void setToShow(boolean toShow) {
		_toShow = toShow;
	}

	private String _uuid;
	private long _id;
	private long _groupId;
	private long _orgId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _modifiedBy;
	private String _modifiedByName;
	private boolean _deleted;
	private String _repairOrderNo;
	private String _dealerCode;
	private String _authorisedDealerInfo;
	private String _dealershipName;
	private String _dealershipAddress;
	private long _dealerShipPhoneNo;
	private long _faxNo;
	private String _dealershipEmail;
	private String _GST;
	private String _customerName;
	private String _customerAddress;
	private long _customerMobileNo;
	private String _customerEmailAddress;
	private String _contactPerson;
	private long _contactPersonPhone;
	private String _regNo;
	private String _VIN;
	private Date _dateOfDelivery;
	private long _kmsIn;
	private String _model;
	private String _engineNo;
	private String _insurancePolicyNo;
	private Date _insuranceExpiryDate;
	private boolean _rsaRequired;
	private String _appointmentType;
	private Date _orderDateIn;
	private Date _orderTimeIn;
	private String _serviceAdvisor;
	private long _serviceAdvisorMobileNo;
	private String _soldByDealer;
	private String _customerMobilityType;
	private String _transactionNo;
	private String _reasonForVisit;
	private String _extendedWarranty;
	private String _servicePlan;
	private String _customerOrderDescription;
	private String _complaint;
	private String _workToBeDone;
	private String _instruction;
	private String _carPicture;
	private String _xDent;
	private String _scratch;
	private String _bodyDamage;
	private String _modificationOrNonOBMFittings;
	private String _tyreCondition;
	private String _treadDepth;
	private String _frontRight;
	private String _frontLeft;
	private String _rearRight;
	private String _rearLeft;
	private String _windowsGlazzing;
	private String _wiperBlades;
	private String _lights;
	private String _exhaustSystem;
	private String _underbody;
	private String _engineCompartment;
	private String _washing;
	private String _oilLevel;
	private String _coolant;
	private String _windshieldWasher;
	private String _brakes;
	private String _axle;
	private String _monograms;
	private String _polishing;
	private String _fuel;
	private String _ownersManual;
	private String _serScheMaintenanceManual;
	private String _infotainmentMmiNavigManual;
	private String _extWarrantyBook;
	private String _quickReferenceGuide;
	private String _spareWheel;
	private String _jackToolKits;
	private String _floorMat;
	private String _mudFlaps;
	private String _warningTriangle;
	private String _firstAidKit;
	private long _noOfKeys;
	private String _otherLooseItems;
	private String _financialInformation;
	private String _modeOfPayment;
	private long _estimatedCost;
	private String _taxesAsApplicable;
	private Date _estimatedDateOfDelivery;
	private String _estimatedDeliveryTime;
	private long _laborEstimate;
	private long _parts;
	private String _termsAndConditions;
	private String _grantMyConsent;
	private String _serviceAdvisotSignature;
	private String _customerSignature;
	private String _remarksArea;
	private String _termsStrictly;
	private String _workshopCopy;
	private String _version;
	private boolean _customerWaiting;
	private String _campaign;
	private String _dissNo;
	private String _descriptiveInformation;
	private String _timeStart;
	private String _timeStop;
	private String _nameOfTechnician;
	private String _technicianSignature;
	private String _inventoryPartsJSONStr;
	private String _partNumber;
	private String _partDescription;
	private String _partCatagory;
	private String _internalPartsOrder;
	private String _partQuantity;
	private String _partRate;
	private String _partCost;
	private String _partTotal;
	private String _partsJSONStr;
	private String _labourDescription;
	private String _labourCatagory;
	private String _labourCode;
	private String _timeUnit;
	private String _hours;
	private String _labourRate;
	private long _labourCost;
	private long _labourTotal;
	private String _labourJSONStr;
	private String _additionalRepairsReqDesc;
	private String _additionalRepairsReqPart;
	private String _additionalRepairsReqLabour;
	private String _additionalRepairsReqAuth;
	private Date _additionalRepairsReqDT;
	private long _roadTestKmOut;
	private long _roadTestKmIn;
	private boolean _allJobsAttended;
	private boolean _accessoriesSettingAsOriginal;
	private String _roadTestSignature;
	private Date _roadTestDate;
	private boolean _interiors;
	private boolean _interiorsPolishing;
	private boolean _exteriors;
	private boolean _exteriorsPolishing;
	private boolean _vacuumCleaned;
	private String _washingCheckerSignature;
	private String _status;
	private boolean _toShow;
}