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

package com.tc.poc.dms.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.tc.poc.dms.model.DmsPoc;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the dms poc service. This utility wraps {@link com.tc.poc.dms.service.persistence.impl.DmsPocPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Manisha Gera
 * @see DmsPocPersistence
 * @see com.tc.poc.dms.service.persistence.impl.DmsPocPersistenceImpl
 * @generated
 */
@ProviderType
public class DmsPocUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(DmsPoc dmsPoc) {
		getPersistence().clearCache(dmsPoc);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DmsPoc> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DmsPoc> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DmsPoc> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator<DmsPoc> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DmsPoc update(DmsPoc dmsPoc) {
		return getPersistence().update(dmsPoc);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DmsPoc update(DmsPoc dmsPoc, ServiceContext serviceContext) {
		return getPersistence().update(dmsPoc, serviceContext);
	}

	/**
	* Returns all the dms pocs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching dms pocs
	*/
	public static List<DmsPoc> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	* Returns a range of all the dms pocs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of dms pocs
	* @param end the upper bound of the range of dms pocs (not inclusive)
	* @return the range of matching dms pocs
	*/
	public static List<DmsPoc> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	* Returns an ordered range of all the dms pocs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of dms pocs
	* @param end the upper bound of the range of dms pocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dms pocs
	*/
	public static List<DmsPoc> findByUuid(String uuid, int start, int end,
		OrderByComparator<DmsPoc> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the dms pocs where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of dms pocs
	* @param end the upper bound of the range of dms pocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dms pocs
	*/
	public static List<DmsPoc> findByUuid(String uuid, int start, int end,
		OrderByComparator<DmsPoc> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first dms poc in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public static DmsPoc findByUuid_First(String uuid,
		OrderByComparator<DmsPoc> orderByComparator)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first dms poc in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public static DmsPoc fetchByUuid_First(String uuid,
		OrderByComparator<DmsPoc> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last dms poc in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public static DmsPoc findByUuid_Last(String uuid,
		OrderByComparator<DmsPoc> orderByComparator)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last dms poc in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public static DmsPoc fetchByUuid_Last(String uuid,
		OrderByComparator<DmsPoc> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the dms pocs before and after the current dms poc in the ordered set where uuid = &#63;.
	*
	* @param id the primary key of the current dms poc
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dms poc
	* @throws NoSuchDmsPocException if a dms poc with the primary key could not be found
	*/
	public static DmsPoc[] findByUuid_PrevAndNext(long id, String uuid,
		OrderByComparator<DmsPoc> orderByComparator)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence()
				   .findByUuid_PrevAndNext(id, uuid, orderByComparator);
	}

	/**
	* Removes all the dms pocs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of dms pocs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching dms pocs
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the dms poc where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDmsPocException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public static DmsPoc findByUUID_G(String uuid, long groupId)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the dms poc where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public static DmsPoc fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the dms poc where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public static DmsPoc fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the dms poc where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the dms poc that was removed
	*/
	public static DmsPoc removeByUUID_G(String uuid, long groupId)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of dms pocs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching dms pocs
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the dms pocs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching dms pocs
	*/
	public static List<DmsPoc> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	* Returns a range of all the dms pocs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of dms pocs
	* @param end the upper bound of the range of dms pocs (not inclusive)
	* @return the range of matching dms pocs
	*/
	public static List<DmsPoc> findByUuid_C(String uuid, long companyId,
		int start, int end) {
		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	* Returns an ordered range of all the dms pocs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of dms pocs
	* @param end the upper bound of the range of dms pocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dms pocs
	*/
	public static List<DmsPoc> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<DmsPoc> orderByComparator) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the dms pocs where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of dms pocs
	* @param end the upper bound of the range of dms pocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dms pocs
	*/
	public static List<DmsPoc> findByUuid_C(String uuid, long companyId,
		int start, int end, OrderByComparator<DmsPoc> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid_C(uuid, companyId, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first dms poc in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public static DmsPoc findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<DmsPoc> orderByComparator)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence()
				   .findByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the first dms poc in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public static DmsPoc fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<DmsPoc> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_First(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last dms poc in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public static DmsPoc findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<DmsPoc> orderByComparator)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence()
				   .findByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the last dms poc in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public static DmsPoc fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<DmsPoc> orderByComparator) {
		return getPersistence()
				   .fetchByUuid_C_Last(uuid, companyId, orderByComparator);
	}

	/**
	* Returns the dms pocs before and after the current dms poc in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param id the primary key of the current dms poc
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dms poc
	* @throws NoSuchDmsPocException if a dms poc with the primary key could not be found
	*/
	public static DmsPoc[] findByUuid_C_PrevAndNext(long id, String uuid,
		long companyId, OrderByComparator<DmsPoc> orderByComparator)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence()
				   .findByUuid_C_PrevAndNext(id, uuid, companyId,
			orderByComparator);
	}

	/**
	* Removes all the dms pocs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	* Returns the number of dms pocs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching dms pocs
	*/
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	* Returns all the dms pocs where deleted = &#63;.
	*
	* @param deleted the deleted
	* @return the matching dms pocs
	*/
	public static List<DmsPoc> findByDeleted(boolean deleted) {
		return getPersistence().findByDeleted(deleted);
	}

	/**
	* Returns a range of all the dms pocs where deleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deleted the deleted
	* @param start the lower bound of the range of dms pocs
	* @param end the upper bound of the range of dms pocs (not inclusive)
	* @return the range of matching dms pocs
	*/
	public static List<DmsPoc> findByDeleted(boolean deleted, int start, int end) {
		return getPersistence().findByDeleted(deleted, start, end);
	}

	/**
	* Returns an ordered range of all the dms pocs where deleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deleted the deleted
	* @param start the lower bound of the range of dms pocs
	* @param end the upper bound of the range of dms pocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dms pocs
	*/
	public static List<DmsPoc> findByDeleted(boolean deleted, int start,
		int end, OrderByComparator<DmsPoc> orderByComparator) {
		return getPersistence()
				   .findByDeleted(deleted, start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the dms pocs where deleted = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deleted the deleted
	* @param start the lower bound of the range of dms pocs
	* @param end the upper bound of the range of dms pocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dms pocs
	*/
	public static List<DmsPoc> findByDeleted(boolean deleted, int start,
		int end, OrderByComparator<DmsPoc> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByDeleted(deleted, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first dms poc in the ordered set where deleted = &#63;.
	*
	* @param deleted the deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public static DmsPoc findByDeleted_First(boolean deleted,
		OrderByComparator<DmsPoc> orderByComparator)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence().findByDeleted_First(deleted, orderByComparator);
	}

	/**
	* Returns the first dms poc in the ordered set where deleted = &#63;.
	*
	* @param deleted the deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public static DmsPoc fetchByDeleted_First(boolean deleted,
		OrderByComparator<DmsPoc> orderByComparator) {
		return getPersistence().fetchByDeleted_First(deleted, orderByComparator);
	}

	/**
	* Returns the last dms poc in the ordered set where deleted = &#63;.
	*
	* @param deleted the deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public static DmsPoc findByDeleted_Last(boolean deleted,
		OrderByComparator<DmsPoc> orderByComparator)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence().findByDeleted_Last(deleted, orderByComparator);
	}

	/**
	* Returns the last dms poc in the ordered set where deleted = &#63;.
	*
	* @param deleted the deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public static DmsPoc fetchByDeleted_Last(boolean deleted,
		OrderByComparator<DmsPoc> orderByComparator) {
		return getPersistence().fetchByDeleted_Last(deleted, orderByComparator);
	}

	/**
	* Returns the dms pocs before and after the current dms poc in the ordered set where deleted = &#63;.
	*
	* @param id the primary key of the current dms poc
	* @param deleted the deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dms poc
	* @throws NoSuchDmsPocException if a dms poc with the primary key could not be found
	*/
	public static DmsPoc[] findByDeleted_PrevAndNext(long id, boolean deleted,
		OrderByComparator<DmsPoc> orderByComparator)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence()
				   .findByDeleted_PrevAndNext(id, deleted, orderByComparator);
	}

	/**
	* Removes all the dms pocs where deleted = &#63; from the database.
	*
	* @param deleted the deleted
	*/
	public static void removeByDeleted(boolean deleted) {
		getPersistence().removeByDeleted(deleted);
	}

	/**
	* Returns the number of dms pocs where deleted = &#63;.
	*
	* @param deleted the deleted
	* @return the number of matching dms pocs
	*/
	public static int countByDeleted(boolean deleted) {
		return getPersistence().countByDeleted(deleted);
	}

	/**
	* Returns all the dms pocs where deleted = &#63; and toShow = &#63;.
	*
	* @param deleted the deleted
	* @param toShow the to show
	* @return the matching dms pocs
	*/
	public static List<DmsPoc> findByDeletedShow(boolean deleted, boolean toShow) {
		return getPersistence().findByDeletedShow(deleted, toShow);
	}

	/**
	* Returns a range of all the dms pocs where deleted = &#63; and toShow = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deleted the deleted
	* @param toShow the to show
	* @param start the lower bound of the range of dms pocs
	* @param end the upper bound of the range of dms pocs (not inclusive)
	* @return the range of matching dms pocs
	*/
	public static List<DmsPoc> findByDeletedShow(boolean deleted,
		boolean toShow, int start, int end) {
		return getPersistence().findByDeletedShow(deleted, toShow, start, end);
	}

	/**
	* Returns an ordered range of all the dms pocs where deleted = &#63; and toShow = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deleted the deleted
	* @param toShow the to show
	* @param start the lower bound of the range of dms pocs
	* @param end the upper bound of the range of dms pocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching dms pocs
	*/
	public static List<DmsPoc> findByDeletedShow(boolean deleted,
		boolean toShow, int start, int end,
		OrderByComparator<DmsPoc> orderByComparator) {
		return getPersistence()
				   .findByDeletedShow(deleted, toShow, start, end,
			orderByComparator);
	}

	/**
	* Returns an ordered range of all the dms pocs where deleted = &#63; and toShow = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param deleted the deleted
	* @param toShow the to show
	* @param start the lower bound of the range of dms pocs
	* @param end the upper bound of the range of dms pocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching dms pocs
	*/
	public static List<DmsPoc> findByDeletedShow(boolean deleted,
		boolean toShow, int start, int end,
		OrderByComparator<DmsPoc> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findByDeletedShow(deleted, toShow, start, end,
			orderByComparator, retrieveFromCache);
	}

	/**
	* Returns the first dms poc in the ordered set where deleted = &#63; and toShow = &#63;.
	*
	* @param deleted the deleted
	* @param toShow the to show
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public static DmsPoc findByDeletedShow_First(boolean deleted,
		boolean toShow, OrderByComparator<DmsPoc> orderByComparator)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence()
				   .findByDeletedShow_First(deleted, toShow, orderByComparator);
	}

	/**
	* Returns the first dms poc in the ordered set where deleted = &#63; and toShow = &#63;.
	*
	* @param deleted the deleted
	* @param toShow the to show
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public static DmsPoc fetchByDeletedShow_First(boolean deleted,
		boolean toShow, OrderByComparator<DmsPoc> orderByComparator) {
		return getPersistence()
				   .fetchByDeletedShow_First(deleted, toShow, orderByComparator);
	}

	/**
	* Returns the last dms poc in the ordered set where deleted = &#63; and toShow = &#63;.
	*
	* @param deleted the deleted
	* @param toShow the to show
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public static DmsPoc findByDeletedShow_Last(boolean deleted,
		boolean toShow, OrderByComparator<DmsPoc> orderByComparator)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence()
				   .findByDeletedShow_Last(deleted, toShow, orderByComparator);
	}

	/**
	* Returns the last dms poc in the ordered set where deleted = &#63; and toShow = &#63;.
	*
	* @param deleted the deleted
	* @param toShow the to show
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public static DmsPoc fetchByDeletedShow_Last(boolean deleted,
		boolean toShow, OrderByComparator<DmsPoc> orderByComparator) {
		return getPersistence()
				   .fetchByDeletedShow_Last(deleted, toShow, orderByComparator);
	}

	/**
	* Returns the dms pocs before and after the current dms poc in the ordered set where deleted = &#63; and toShow = &#63;.
	*
	* @param id the primary key of the current dms poc
	* @param deleted the deleted
	* @param toShow the to show
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dms poc
	* @throws NoSuchDmsPocException if a dms poc with the primary key could not be found
	*/
	public static DmsPoc[] findByDeletedShow_PrevAndNext(long id,
		boolean deleted, boolean toShow,
		OrderByComparator<DmsPoc> orderByComparator)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence()
				   .findByDeletedShow_PrevAndNext(id, deleted, toShow,
			orderByComparator);
	}

	/**
	* Removes all the dms pocs where deleted = &#63; and toShow = &#63; from the database.
	*
	* @param deleted the deleted
	* @param toShow the to show
	*/
	public static void removeByDeletedShow(boolean deleted, boolean toShow) {
		getPersistence().removeByDeletedShow(deleted, toShow);
	}

	/**
	* Returns the number of dms pocs where deleted = &#63; and toShow = &#63;.
	*
	* @param deleted the deleted
	* @param toShow the to show
	* @return the number of matching dms pocs
	*/
	public static int countByDeletedShow(boolean deleted, boolean toShow) {
		return getPersistence().countByDeletedShow(deleted, toShow);
	}

	/**
	* Returns the dms poc where regNo = &#63; or throws a {@link NoSuchDmsPocException} if it could not be found.
	*
	* @param regNo the reg no
	* @return the matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public static DmsPoc findByRegNo(String regNo)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence().findByRegNo(regNo);
	}

	/**
	* Returns the dms poc where regNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param regNo the reg no
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public static DmsPoc fetchByRegNo(String regNo) {
		return getPersistence().fetchByRegNo(regNo);
	}

	/**
	* Returns the dms poc where regNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param regNo the reg no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public static DmsPoc fetchByRegNo(String regNo, boolean retrieveFromCache) {
		return getPersistence().fetchByRegNo(regNo, retrieveFromCache);
	}

	/**
	* Removes the dms poc where regNo = &#63; from the database.
	*
	* @param regNo the reg no
	* @return the dms poc that was removed
	*/
	public static DmsPoc removeByRegNo(String regNo)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence().removeByRegNo(regNo);
	}

	/**
	* Returns the number of dms pocs where regNo = &#63;.
	*
	* @param regNo the reg no
	* @return the number of matching dms pocs
	*/
	public static int countByRegNo(String regNo) {
		return getPersistence().countByRegNo(regNo);
	}

	/**
	* Returns the dms poc where VIN = &#63; or throws a {@link NoSuchDmsPocException} if it could not be found.
	*
	* @param VIN the vin
	* @return the matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public static DmsPoc findByVin(String VIN)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence().findByVin(VIN);
	}

	/**
	* Returns the dms poc where VIN = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param VIN the vin
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public static DmsPoc fetchByVin(String VIN) {
		return getPersistence().fetchByVin(VIN);
	}

	/**
	* Returns the dms poc where VIN = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param VIN the vin
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public static DmsPoc fetchByVin(String VIN, boolean retrieveFromCache) {
		return getPersistence().fetchByVin(VIN, retrieveFromCache);
	}

	/**
	* Removes the dms poc where VIN = &#63; from the database.
	*
	* @param VIN the vin
	* @return the dms poc that was removed
	*/
	public static DmsPoc removeByVin(String VIN)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence().removeByVin(VIN);
	}

	/**
	* Returns the number of dms pocs where VIN = &#63;.
	*
	* @param VIN the vin
	* @return the number of matching dms pocs
	*/
	public static int countByVin(String VIN) {
		return getPersistence().countByVin(VIN);
	}

	/**
	* Returns the dms poc where regNo = &#63; and VIN = &#63; or throws a {@link NoSuchDmsPocException} if it could not be found.
	*
	* @param regNo the reg no
	* @param VIN the vin
	* @return the matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public static DmsPoc findByRegNoVin(String regNo, String VIN)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence().findByRegNoVin(regNo, VIN);
	}

	/**
	* Returns the dms poc where regNo = &#63; and VIN = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param regNo the reg no
	* @param VIN the vin
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public static DmsPoc fetchByRegNoVin(String regNo, String VIN) {
		return getPersistence().fetchByRegNoVin(regNo, VIN);
	}

	/**
	* Returns the dms poc where regNo = &#63; and VIN = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param regNo the reg no
	* @param VIN the vin
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public static DmsPoc fetchByRegNoVin(String regNo, String VIN,
		boolean retrieveFromCache) {
		return getPersistence().fetchByRegNoVin(regNo, VIN, retrieveFromCache);
	}

	/**
	* Removes the dms poc where regNo = &#63; and VIN = &#63; from the database.
	*
	* @param regNo the reg no
	* @param VIN the vin
	* @return the dms poc that was removed
	*/
	public static DmsPoc removeByRegNoVin(String regNo, String VIN)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence().removeByRegNoVin(regNo, VIN);
	}

	/**
	* Returns the number of dms pocs where regNo = &#63; and VIN = &#63;.
	*
	* @param regNo the reg no
	* @param VIN the vin
	* @return the number of matching dms pocs
	*/
	public static int countByRegNoVin(String regNo, String VIN) {
		return getPersistence().countByRegNoVin(regNo, VIN);
	}

	/**
	* Caches the dms poc in the entity cache if it is enabled.
	*
	* @param dmsPoc the dms poc
	*/
	public static void cacheResult(DmsPoc dmsPoc) {
		getPersistence().cacheResult(dmsPoc);
	}

	/**
	* Caches the dms pocs in the entity cache if it is enabled.
	*
	* @param dmsPocs the dms pocs
	*/
	public static void cacheResult(List<DmsPoc> dmsPocs) {
		getPersistence().cacheResult(dmsPocs);
	}

	/**
	* Creates a new dms poc with the primary key. Does not add the dms poc to the database.
	*
	* @param id the primary key for the new dms poc
	* @return the new dms poc
	*/
	public static DmsPoc create(long id) {
		return getPersistence().create(id);
	}

	/**
	* Removes the dms poc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dms poc
	* @return the dms poc that was removed
	* @throws NoSuchDmsPocException if a dms poc with the primary key could not be found
	*/
	public static DmsPoc remove(long id)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence().remove(id);
	}

	public static DmsPoc updateImpl(DmsPoc dmsPoc) {
		return getPersistence().updateImpl(dmsPoc);
	}

	/**
	* Returns the dms poc with the primary key or throws a {@link NoSuchDmsPocException} if it could not be found.
	*
	* @param id the primary key of the dms poc
	* @return the dms poc
	* @throws NoSuchDmsPocException if a dms poc with the primary key could not be found
	*/
	public static DmsPoc findByPrimaryKey(long id)
		throws com.tc.poc.dms.exception.NoSuchDmsPocException {
		return getPersistence().findByPrimaryKey(id);
	}

	/**
	* Returns the dms poc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dms poc
	* @return the dms poc, or <code>null</code> if a dms poc with the primary key could not be found
	*/
	public static DmsPoc fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	public static java.util.Map<java.io.Serializable, DmsPoc> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the dms pocs.
	*
	* @return the dms pocs
	*/
	public static List<DmsPoc> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the dms pocs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dms pocs
	* @param end the upper bound of the range of dms pocs (not inclusive)
	* @return the range of dms pocs
	*/
	public static List<DmsPoc> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the dms pocs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dms pocs
	* @param end the upper bound of the range of dms pocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of dms pocs
	*/
	public static List<DmsPoc> findAll(int start, int end,
		OrderByComparator<DmsPoc> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the dms pocs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link DmsPocModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of dms pocs
	* @param end the upper bound of the range of dms pocs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of dms pocs
	*/
	public static List<DmsPoc> findAll(int start, int end,
		OrderByComparator<DmsPoc> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the dms pocs from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of dms pocs.
	*
	* @return the number of dms pocs
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static DmsPocPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<DmsPocPersistence, DmsPocPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(DmsPocPersistence.class);

		ServiceTracker<DmsPocPersistence, DmsPocPersistence> serviceTracker = new ServiceTracker<DmsPocPersistence, DmsPocPersistence>(bundle.getBundleContext(),
				DmsPocPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}