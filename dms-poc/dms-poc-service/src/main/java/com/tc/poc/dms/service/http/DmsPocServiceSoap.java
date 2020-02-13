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

package com.tc.poc.dms.service.http;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import com.tc.poc.dms.service.DmsPocServiceUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link DmsPocServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.tc.poc.dms.model.DmsPocSoap}.
 * If the method in the service utility returns a
 * {@link com.tc.poc.dms.model.DmsPoc}, that is translated to a
 * {@link com.tc.poc.dms.model.DmsPocSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Manisha Gera
 * @see DmsPocServiceHttp
 * @see com.tc.poc.dms.model.DmsPocSoap
 * @see DmsPocServiceUtil
 * @generated
 */
@ProviderType
public class DmsPocServiceSoap {
	public static com.tc.poc.dms.model.DmsPocSoap create(String vin,
		String model, String repairOrderNo, String regNo, String status)
		throws RemoteException {
		try {
			com.tc.poc.dms.model.DmsPoc returnValue = DmsPocServiceUtil.create(vin,
					model, repairOrderNo, regNo, status);

			return com.tc.poc.dms.model.DmsPocSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.tc.poc.dms.model.DmsPocSoap[] findAll()
		throws RemoteException {
		try {
			java.util.List<com.tc.poc.dms.model.DmsPoc> returnValue = DmsPocServiceUtil.findAll();

			return com.tc.poc.dms.model.DmsPocSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.tc.poc.dms.model.DmsPocSoap[] findAllToShow()
		throws RemoteException {
		try {
			java.util.List<com.tc.poc.dms.model.DmsPoc> returnValue = DmsPocServiceUtil.findAllToShow();

			return com.tc.poc.dms.model.DmsPocSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.tc.poc.dms.model.DmsPocSoap create(String repairOrderNo,
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
		throws RemoteException {
		try {
			com.tc.poc.dms.model.DmsPoc returnValue = DmsPocServiceUtil.create(repairOrderNo,
					dealerCode, authorisedDealerInfo, dealershipName,
					dealershipAddress, dealerShipPhoneNo, faxNo,
					dealershipEmail, GST, customerName, customerAddress,
					customerMobileNo, customerEmailAddress, contactPerson,
					contactPersonPhone, regNo, VIN, dateOfDelivery, kmsIn,
					model, engineNo, insurancePolicyNo, insuranceExpiryDate,
					rsaRequired, appointmentType, orderDateIn, orderTimeIn,
					serviceAdvisor, serviceAdvisorMobileNo, soldByDealer,
					customerMobilityType, transactionNo, reasonForVisit,
					extendedWarranty, servicePlan, customerOrderDescription,
					complaint, workToBeDone, instruction, carPicture, xDent,
					scratch, bodyDamage, modificationOrNonOBMFittings,
					tyreCondition, treadDepth, frontRight, frontLeft,
					rearRight, rearLeft, windowsGlazzing, wiperBlades, lights,
					exhaustSystem, underbody, engineCompartment, washing,
					oilLevel, coolant, windshieldWasher, brakes, axle,
					monograms, polishing, fuel, ownersManual,
					serScheMaintenanceManual, infotainmentMmiNavigManual,
					extWarrantyBook, quickReferenceGuide, spareWheel,
					jackToolKits, floorMat, mudFlaps, warningTriangle,
					firstAidKit, noOfKeys, otherLooseItems,
					financialInformation, modeOfPayment, estimatedCost,
					taxesAsApplicable, estimatedDateOfDelivery,
					estimatedDeliveryTime, laborEstimate, parts,
					termsAndConditions, grantMyConsent,
					serviceAdvisotSignature, customerSignature, remarksArea,
					termsStrictly, workshopCopy, version, customerWaiting,
					campaign, dissNo, descriptiveInformation, timeStart,
					timeStop, nameOfTechnician, technicianSignature,
					partNumber, partDescription, partCatagory,
					internalPartsOrder, partQuantity, partRate, partCost,
					partTotal, labourDescription, labourCatagory, labourCode,
					timeUnit, hours, labourRate, labourCost, labourTotal,
					additionalRepairsReqDesc, additionalRepairsReqPart,
					additionalRepairsReqLabour, additionalRepairsReqAuth,
					additionalRepairsReqDT, roadTestKmOut, roadTestKmIn,
					allJobsAttended, accessoriesSettingAsOriginal,
					roadTestSignature, roadTestDate, interiors,
					interiorsPolishing, exteriors, exteriorsPolishing,
					vacuumCleaned, washingCheckerSignature, status);

			return com.tc.poc.dms.model.DmsPocSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.tc.poc.dms.model.DmsPocSoap update(long id,
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
		throws RemoteException {
		try {
			com.tc.poc.dms.model.DmsPoc returnValue = DmsPocServiceUtil.update(id,
					repairOrderNo, dealerCode, authorisedDealerInfo,
					dealershipName, dealershipAddress, dealerShipPhoneNo,
					faxNo, dealershipEmail, GST, customerName, customerAddress,
					customerMobileNo, customerEmailAddress, contactPerson,
					contactPersonPhone, regNo, VIN, dateOfDelivery, kmsIn,
					model, engineNo, insurancePolicyNo, insuranceExpiryDate,
					rsaRequired, appointmentType, orderDateIn, orderTimeIn,
					serviceAdvisor, serviceAdvisorMobileNo, soldByDealer,
					customerMobilityType, transactionNo, reasonForVisit,
					extendedWarranty, servicePlan, customerOrderDescription,
					complaint, workToBeDone, instruction, carPicture, xDent,
					scratch, bodyDamage, modificationOrNonOBMFittings,
					tyreCondition, treadDepth, frontRight, frontLeft,
					rearRight, rearLeft, windowsGlazzing, wiperBlades, lights,
					exhaustSystem, underbody, engineCompartment, washing,
					oilLevel, coolant, windshieldWasher, brakes, axle,
					monograms, polishing, fuel, ownersManual,
					serScheMaintenanceManual, infotainmentMmiNavigManual,
					extWarrantyBook, quickReferenceGuide, spareWheel,
					jackToolKits, floorMat, mudFlaps, warningTriangle,
					firstAidKit, noOfKeys, otherLooseItems,
					financialInformation, modeOfPayment, estimatedCost,
					taxesAsApplicable, estimatedDateOfDelivery,
					estimatedDeliveryTime, laborEstimate, parts,
					termsAndConditions, grantMyConsent,
					serviceAdvisotSignature, customerSignature, remarksArea,
					termsStrictly, workshopCopy, version, customerWaiting,
					campaign, dissNo, descriptiveInformation, timeStart,
					timeStop, nameOfTechnician, technicianSignature,
					partNumber, partDescription, partCatagory,
					internalPartsOrder, partQuantity, partRate, partCost,
					partTotal, labourDescription, labourCatagory, labourCode,
					timeUnit, hours, labourRate, labourCost, labourTotal,
					additionalRepairsReqDesc, additionalRepairsReqPart,
					additionalRepairsReqLabour, additionalRepairsReqAuth,
					additionalRepairsReqDT, roadTestKmOut, roadTestKmIn,
					allJobsAttended, accessoriesSettingAsOriginal,
					roadTestSignature, roadTestDate, interiors,
					interiorsPolishing, exteriors, exteriorsPolishing,
					vacuumCleaned, washingCheckerSignature, status);

			return com.tc.poc.dms.model.DmsPocSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.tc.poc.dms.model.DmsPocSoap find(long id)
		throws RemoteException {
		try {
			com.tc.poc.dms.model.DmsPoc returnValue = DmsPocServiceUtil.find(id);

			return com.tc.poc.dms.model.DmsPocSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.tc.poc.dms.model.DmsPocSoap findByRegNo(String regNo)
		throws RemoteException {
		try {
			com.tc.poc.dms.model.DmsPoc returnValue = DmsPocServiceUtil.findByRegNo(regNo);

			return com.tc.poc.dms.model.DmsPocSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.tc.poc.dms.model.DmsPocSoap findByVIN(String vin)
		throws RemoteException {
		try {
			com.tc.poc.dms.model.DmsPoc returnValue = DmsPocServiceUtil.findByVIN(vin);

			return com.tc.poc.dms.model.DmsPocSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.tc.poc.dms.model.DmsPocSoap findByRegNoOrVIN(
		String regNo, String vin) throws RemoteException {
		try {
			com.tc.poc.dms.model.DmsPoc returnValue = DmsPocServiceUtil.findByRegNoOrVIN(regNo,
					vin);

			return com.tc.poc.dms.model.DmsPocSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.tc.poc.dms.model.DmsPocSoap delete(long id)
		throws RemoteException {
		try {
			com.tc.poc.dms.model.DmsPoc returnValue = DmsPocServiceUtil.delete(id);

			return com.tc.poc.dms.model.DmsPocSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.tc.poc.dms.model.DmsPocSoap updateToShow(long id,
		boolean toShow) throws RemoteException {
		try {
			com.tc.poc.dms.model.DmsPoc returnValue = DmsPocServiceUtil.updateToShow(id,
					toShow);

			return com.tc.poc.dms.model.DmsPocSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static String saveScannedImage(String type, String dataUri)
		throws RemoteException {
		try {
			com.liferay.portal.kernel.json.JSONObject returnValue = DmsPocServiceUtil.saveScannedImage(type,
					dataUri);

			return returnValue.toString();
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.tc.poc.dms.model.DmsPocSoap updatePartsLabourInventory(
		long id, String inventoryPartsJSONStr, String partsJSONStr,
		String labourJSONStr, boolean toShow) throws RemoteException {
		try {
			com.tc.poc.dms.model.DmsPoc returnValue = DmsPocServiceUtil.updatePartsLabourInventory(id,
					inventoryPartsJSONStr, partsJSONStr, labourJSONStr, toShow);

			return com.tc.poc.dms.model.DmsPocSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DmsPocServiceSoap.class);
}