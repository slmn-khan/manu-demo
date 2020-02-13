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
import com.liferay.portal.kernel.security.auth.HttpPrincipal;
import com.liferay.portal.kernel.service.http.TunnelUtil;
import com.liferay.portal.kernel.util.MethodHandler;
import com.liferay.portal.kernel.util.MethodKey;

import com.tc.poc.dms.service.DmsPocServiceUtil;

/**
 * Provides the HTTP utility for the
 * {@link DmsPocServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it requires an additional
 * {@link HttpPrincipal} parameter.
 *
 * <p>
 * The benefits of using the HTTP utility is that it is fast and allows for
 * tunneling without the cost of serializing to text. The drawback is that it
 * only works with Java.
 * </p>
 *
 * <p>
 * Set the property <b>tunnel.servlet.hosts.allowed</b> in portal.properties to
 * configure security.
 * </p>
 *
 * <p>
 * The HTTP utility is only generated for remote services.
 * </p>
 *
 * @author Manisha Gera
 * @see DmsPocServiceSoap
 * @see HttpPrincipal
 * @see DmsPocServiceUtil
 * @generated
 */
@ProviderType
public class DmsPocServiceHttp {
	public static com.tc.poc.dms.model.DmsPoc create(
		HttpPrincipal httpPrincipal, String vin, String model,
		String repairOrderNo, String regNo, String status)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(DmsPocServiceUtil.class,
					"create", _createParameterTypes0);

			MethodHandler methodHandler = new MethodHandler(methodKey, vin,
					model, repairOrderNo, regNo, status);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.tc.poc.dms.model.DmsPoc)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.tc.poc.dms.model.DmsPoc> findAll(
		HttpPrincipal httpPrincipal)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(DmsPocServiceUtil.class,
					"findAll", _findAllParameterTypes1);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.tc.poc.dms.model.DmsPoc>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static java.util.List<com.tc.poc.dms.model.DmsPoc> findAllToShow(
		HttpPrincipal httpPrincipal)
		throws com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(DmsPocServiceUtil.class,
					"findAllToShow", _findAllToShowParameterTypes2);

			MethodHandler methodHandler = new MethodHandler(methodKey);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (java.util.List<com.tc.poc.dms.model.DmsPoc>)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.tc.poc.dms.model.DmsPoc create(
		HttpPrincipal httpPrincipal, String repairOrderNo, String dealerCode,
		String authorisedDealerInfo, String dealershipName,
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
		try {
			MethodKey methodKey = new MethodKey(DmsPocServiceUtil.class,
					"create", _createParameterTypes3);

			MethodHandler methodHandler = new MethodHandler(methodKey,
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

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.tc.poc.dms.model.DmsPoc)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.tc.poc.dms.model.DmsPoc update(
		HttpPrincipal httpPrincipal, long id, String repairOrderNo,
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
		try {
			MethodKey methodKey = new MethodKey(DmsPocServiceUtil.class,
					"update", _updateParameterTypes4);

			MethodHandler methodHandler = new MethodHandler(methodKey, id,
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

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.tc.poc.dms.model.DmsPoc)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.tc.poc.dms.model.DmsPoc find(
		HttpPrincipal httpPrincipal, long id)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tc.poc.dms.exception.NoSuchDmsPocException {
		try {
			MethodKey methodKey = new MethodKey(DmsPocServiceUtil.class,
					"find", _findParameterTypes5);

			MethodHandler methodHandler = new MethodHandler(methodKey, id);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				if (e instanceof com.tc.poc.dms.exception.NoSuchDmsPocException) {
					throw (com.tc.poc.dms.exception.NoSuchDmsPocException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.tc.poc.dms.model.DmsPoc)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.tc.poc.dms.model.DmsPoc findByRegNo(
		HttpPrincipal httpPrincipal, String regNo)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tc.poc.dms.exception.NoSuchDmsPocException {
		try {
			MethodKey methodKey = new MethodKey(DmsPocServiceUtil.class,
					"findByRegNo", _findByRegNoParameterTypes6);

			MethodHandler methodHandler = new MethodHandler(methodKey, regNo);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				if (e instanceof com.tc.poc.dms.exception.NoSuchDmsPocException) {
					throw (com.tc.poc.dms.exception.NoSuchDmsPocException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.tc.poc.dms.model.DmsPoc)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.tc.poc.dms.model.DmsPoc findByVIN(
		HttpPrincipal httpPrincipal, String vin)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tc.poc.dms.exception.NoSuchDmsPocException {
		try {
			MethodKey methodKey = new MethodKey(DmsPocServiceUtil.class,
					"findByVIN", _findByVINParameterTypes7);

			MethodHandler methodHandler = new MethodHandler(methodKey, vin);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				if (e instanceof com.tc.poc.dms.exception.NoSuchDmsPocException) {
					throw (com.tc.poc.dms.exception.NoSuchDmsPocException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.tc.poc.dms.model.DmsPoc)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.tc.poc.dms.model.DmsPoc findByRegNoOrVIN(
		HttpPrincipal httpPrincipal, String regNo, String vin)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.tc.poc.dms.exception.NoSuchDmsPocException {
		try {
			MethodKey methodKey = new MethodKey(DmsPocServiceUtil.class,
					"findByRegNoOrVIN", _findByRegNoOrVINParameterTypes8);

			MethodHandler methodHandler = new MethodHandler(methodKey, regNo,
					vin);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				if (e instanceof com.tc.poc.dms.exception.NoSuchDmsPocException) {
					throw (com.tc.poc.dms.exception.NoSuchDmsPocException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.tc.poc.dms.model.DmsPoc)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.tc.poc.dms.model.DmsPoc delete(
		HttpPrincipal httpPrincipal, long id)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException,
			com.liferay.portal.kernel.exception.SystemException {
		try {
			MethodKey methodKey = new MethodKey(DmsPocServiceUtil.class,
					"delete", _deleteParameterTypes9);

			MethodHandler methodHandler = new MethodHandler(methodKey, id);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.tc.poc.dms.exception.NoSuchDmsPocException) {
					throw (com.tc.poc.dms.exception.NoSuchDmsPocException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.tc.poc.dms.model.DmsPoc)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.tc.poc.dms.model.DmsPoc updateToShow(
		HttpPrincipal httpPrincipal, long id, boolean toShow)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(DmsPocServiceUtil.class,
					"updateToShow", _updateToShowParameterTypes10);

			MethodHandler methodHandler = new MethodHandler(methodKey, id,
					toShow);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.tc.poc.dms.model.DmsPoc)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.kernel.json.JSONObject saveScannedImage(
		HttpPrincipal httpPrincipal, String type, String dataUri,
		java.io.File image)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException,
			com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(DmsPocServiceUtil.class,
					"saveScannedImage", _saveScannedImageParameterTypes11);

			MethodHandler methodHandler = new MethodHandler(methodKey, type,
					dataUri, image);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				if (e instanceof java.io.IOException) {
					throw (java.io.IOException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.kernel.json.JSONObject)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.liferay.portal.kernel.json.JSONObject saveScannedImage(
		HttpPrincipal httpPrincipal, String type, String dataUri)
		throws com.liferay.portal.kernel.exception.SystemException,
			java.io.IOException,
			com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(DmsPocServiceUtil.class,
					"saveScannedImage", _saveScannedImageParameterTypes12);

			MethodHandler methodHandler = new MethodHandler(methodKey, type,
					dataUri);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				if (e instanceof java.io.IOException) {
					throw (java.io.IOException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.liferay.portal.kernel.json.JSONObject)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	public static com.tc.poc.dms.model.DmsPoc updatePartsLabourInventory(
		HttpPrincipal httpPrincipal, long id, String inventoryPartsJSONStr,
		String partsJSONStr, String labourJSONStr, boolean toShow)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.kernel.exception.PortalException {
		try {
			MethodKey methodKey = new MethodKey(DmsPocServiceUtil.class,
					"updatePartsLabourInventory",
					_updatePartsLabourInventoryParameterTypes13);

			MethodHandler methodHandler = new MethodHandler(methodKey, id,
					inventoryPartsJSONStr, partsJSONStr, labourJSONStr, toShow);

			Object returnObj = null;

			try {
				returnObj = TunnelUtil.invoke(httpPrincipal, methodHandler);
			}
			catch (Exception e) {
				if (e instanceof com.liferay.portal.kernel.exception.SystemException) {
					throw (com.liferay.portal.kernel.exception.SystemException)e;
				}

				if (e instanceof com.liferay.portal.kernel.exception.PortalException) {
					throw (com.liferay.portal.kernel.exception.PortalException)e;
				}

				throw new com.liferay.portal.kernel.exception.SystemException(e);
			}

			return (com.tc.poc.dms.model.DmsPoc)returnObj;
		}
		catch (com.liferay.portal.kernel.exception.SystemException se) {
			_log.error(se, se);

			throw se;
		}
	}

	private static Log _log = LogFactoryUtil.getLog(DmsPocServiceHttp.class);
	private static final Class<?>[] _createParameterTypes0 = new Class[] {
			String.class, String.class, String.class, String.class, String.class
		};
	private static final Class<?>[] _findAllParameterTypes1 = new Class[] {  };
	private static final Class<?>[] _findAllToShowParameterTypes2 = new Class[] {  };
	private static final Class<?>[] _createParameterTypes3 = new Class[] {
			String.class, String.class, String.class, String.class, String.class,
			long.class, long.class, String.class, String.class, String.class,
			String.class, long.class, String.class, String.class, long.class,
			String.class, String.class, java.util.Date.class, long.class,
			String.class, String.class, String.class, java.util.Date.class,
			boolean.class, String.class, java.util.Date.class,
			java.util.Date.class, String.class, long.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, long.class, String.class, String.class, String.class,
			long.class, String.class, java.util.Date.class, String.class,
			long.class, long.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			boolean.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, long.class, long.class,
			String.class, String.class, String.class, String.class,
			java.util.Date.class, long.class, long.class, boolean.class,
			boolean.class, String.class, java.util.Date.class, boolean.class,
			boolean.class, boolean.class, boolean.class, boolean.class,
			String.class, String.class
		};
	private static final Class<?>[] _updateParameterTypes4 = new Class[] {
			long.class, String.class, String.class, String.class, String.class,
			String.class, long.class, long.class, String.class, String.class,
			String.class, String.class, long.class, String.class, String.class,
			long.class, String.class, String.class, java.util.Date.class,
			long.class, String.class, String.class, String.class,
			java.util.Date.class, boolean.class, String.class,
			java.util.Date.class, java.util.Date.class, String.class, long.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, long.class, String.class, String.class,
			String.class, long.class, String.class, java.util.Date.class,
			String.class, long.class, long.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, boolean.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, String.class,
			String.class, String.class, String.class, String.class, long.class,
			long.class, String.class, String.class, String.class, String.class,
			java.util.Date.class, long.class, long.class, boolean.class,
			boolean.class, String.class, java.util.Date.class, boolean.class,
			boolean.class, boolean.class, boolean.class, boolean.class,
			String.class, String.class
		};
	private static final Class<?>[] _findParameterTypes5 = new Class[] {
			long.class
		};
	private static final Class<?>[] _findByRegNoParameterTypes6 = new Class[] {
			String.class
		};
	private static final Class<?>[] _findByVINParameterTypes7 = new Class[] {
			String.class
		};
	private static final Class<?>[] _findByRegNoOrVINParameterTypes8 = new Class[] {
			String.class, String.class
		};
	private static final Class<?>[] _deleteParameterTypes9 = new Class[] {
			long.class
		};
	private static final Class<?>[] _updateToShowParameterTypes10 = new Class[] {
			long.class, boolean.class
		};
	private static final Class<?>[] _saveScannedImageParameterTypes11 = new Class[] {
			String.class, String.class, java.io.File.class
		};
	private static final Class<?>[] _saveScannedImageParameterTypes12 = new Class[] {
			String.class, String.class
		};
	private static final Class<?>[] _updatePartsLabourInventoryParameterTypes13 = new Class[] {
			long.class, String.class, String.class, String.class, boolean.class
		};
}