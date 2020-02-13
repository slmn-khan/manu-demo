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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.tc.poc.dms.exception.NoSuchDmsPocException;
import com.tc.poc.dms.model.DmsPoc;

/**
 * The persistence interface for the dms poc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Manisha Gera
 * @see com.tc.poc.dms.service.persistence.impl.DmsPocPersistenceImpl
 * @see DmsPocUtil
 * @generated
 */
@ProviderType
public interface DmsPocPersistence extends BasePersistence<DmsPoc> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DmsPocUtil} to access the dms poc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the dms pocs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching dms pocs
	*/
	public java.util.List<DmsPoc> findByUuid(String uuid);

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
	public java.util.List<DmsPoc> findByUuid(String uuid, int start, int end);

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
	public java.util.List<DmsPoc> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator);

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
	public java.util.List<DmsPoc> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dms poc in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public DmsPoc findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException;

	/**
	* Returns the first dms poc in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public DmsPoc fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator);

	/**
	* Returns the last dms poc in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public DmsPoc findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException;

	/**
	* Returns the last dms poc in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public DmsPoc fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator);

	/**
	* Returns the dms pocs before and after the current dms poc in the ordered set where uuid = &#63;.
	*
	* @param id the primary key of the current dms poc
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dms poc
	* @throws NoSuchDmsPocException if a dms poc with the primary key could not be found
	*/
	public DmsPoc[] findByUuid_PrevAndNext(long id, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException;

	/**
	* Removes all the dms pocs where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of dms pocs where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching dms pocs
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the dms poc where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDmsPocException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public DmsPoc findByUUID_G(String uuid, long groupId)
		throws NoSuchDmsPocException;

	/**
	* Returns the dms poc where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public DmsPoc fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the dms poc where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public DmsPoc fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the dms poc where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the dms poc that was removed
	*/
	public DmsPoc removeByUUID_G(String uuid, long groupId)
		throws NoSuchDmsPocException;

	/**
	* Returns the number of dms pocs where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching dms pocs
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the dms pocs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching dms pocs
	*/
	public java.util.List<DmsPoc> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<DmsPoc> findByUuid_C(String uuid, long companyId,
		int start, int end);

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
	public java.util.List<DmsPoc> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator);

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
	public java.util.List<DmsPoc> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dms poc in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public DmsPoc findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException;

	/**
	* Returns the first dms poc in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public DmsPoc fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator);

	/**
	* Returns the last dms poc in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public DmsPoc findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException;

	/**
	* Returns the last dms poc in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public DmsPoc fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator);

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
	public DmsPoc[] findByUuid_C_PrevAndNext(long id, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException;

	/**
	* Removes all the dms pocs where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of dms pocs where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching dms pocs
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Returns all the dms pocs where deleted = &#63;.
	*
	* @param deleted the deleted
	* @return the matching dms pocs
	*/
	public java.util.List<DmsPoc> findByDeleted(boolean deleted);

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
	public java.util.List<DmsPoc> findByDeleted(boolean deleted, int start,
		int end);

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
	public java.util.List<DmsPoc> findByDeleted(boolean deleted, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator);

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
	public java.util.List<DmsPoc> findByDeleted(boolean deleted, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dms poc in the ordered set where deleted = &#63;.
	*
	* @param deleted the deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public DmsPoc findByDeleted_First(boolean deleted,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException;

	/**
	* Returns the first dms poc in the ordered set where deleted = &#63;.
	*
	* @param deleted the deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public DmsPoc fetchByDeleted_First(boolean deleted,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator);

	/**
	* Returns the last dms poc in the ordered set where deleted = &#63;.
	*
	* @param deleted the deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public DmsPoc findByDeleted_Last(boolean deleted,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException;

	/**
	* Returns the last dms poc in the ordered set where deleted = &#63;.
	*
	* @param deleted the deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public DmsPoc fetchByDeleted_Last(boolean deleted,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator);

	/**
	* Returns the dms pocs before and after the current dms poc in the ordered set where deleted = &#63;.
	*
	* @param id the primary key of the current dms poc
	* @param deleted the deleted
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next dms poc
	* @throws NoSuchDmsPocException if a dms poc with the primary key could not be found
	*/
	public DmsPoc[] findByDeleted_PrevAndNext(long id, boolean deleted,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException;

	/**
	* Removes all the dms pocs where deleted = &#63; from the database.
	*
	* @param deleted the deleted
	*/
	public void removeByDeleted(boolean deleted);

	/**
	* Returns the number of dms pocs where deleted = &#63;.
	*
	* @param deleted the deleted
	* @return the number of matching dms pocs
	*/
	public int countByDeleted(boolean deleted);

	/**
	* Returns all the dms pocs where deleted = &#63; and toShow = &#63;.
	*
	* @param deleted the deleted
	* @param toShow the to show
	* @return the matching dms pocs
	*/
	public java.util.List<DmsPoc> findByDeletedShow(boolean deleted,
		boolean toShow);

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
	public java.util.List<DmsPoc> findByDeletedShow(boolean deleted,
		boolean toShow, int start, int end);

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
	public java.util.List<DmsPoc> findByDeletedShow(boolean deleted,
		boolean toShow, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator);

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
	public java.util.List<DmsPoc> findByDeletedShow(boolean deleted,
		boolean toShow, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first dms poc in the ordered set where deleted = &#63; and toShow = &#63;.
	*
	* @param deleted the deleted
	* @param toShow the to show
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public DmsPoc findByDeletedShow_First(boolean deleted, boolean toShow,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException;

	/**
	* Returns the first dms poc in the ordered set where deleted = &#63; and toShow = &#63;.
	*
	* @param deleted the deleted
	* @param toShow the to show
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public DmsPoc fetchByDeletedShow_First(boolean deleted, boolean toShow,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator);

	/**
	* Returns the last dms poc in the ordered set where deleted = &#63; and toShow = &#63;.
	*
	* @param deleted the deleted
	* @param toShow the to show
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public DmsPoc findByDeletedShow_Last(boolean deleted, boolean toShow,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException;

	/**
	* Returns the last dms poc in the ordered set where deleted = &#63; and toShow = &#63;.
	*
	* @param deleted the deleted
	* @param toShow the to show
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public DmsPoc fetchByDeletedShow_Last(boolean deleted, boolean toShow,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator);

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
	public DmsPoc[] findByDeletedShow_PrevAndNext(long id, boolean deleted,
		boolean toShow,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException;

	/**
	* Removes all the dms pocs where deleted = &#63; and toShow = &#63; from the database.
	*
	* @param deleted the deleted
	* @param toShow the to show
	*/
	public void removeByDeletedShow(boolean deleted, boolean toShow);

	/**
	* Returns the number of dms pocs where deleted = &#63; and toShow = &#63;.
	*
	* @param deleted the deleted
	* @param toShow the to show
	* @return the number of matching dms pocs
	*/
	public int countByDeletedShow(boolean deleted, boolean toShow);

	/**
	* Returns the dms poc where regNo = &#63; or throws a {@link NoSuchDmsPocException} if it could not be found.
	*
	* @param regNo the reg no
	* @return the matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public DmsPoc findByRegNo(String regNo) throws NoSuchDmsPocException;

	/**
	* Returns the dms poc where regNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param regNo the reg no
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public DmsPoc fetchByRegNo(String regNo);

	/**
	* Returns the dms poc where regNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param regNo the reg no
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public DmsPoc fetchByRegNo(String regNo, boolean retrieveFromCache);

	/**
	* Removes the dms poc where regNo = &#63; from the database.
	*
	* @param regNo the reg no
	* @return the dms poc that was removed
	*/
	public DmsPoc removeByRegNo(String regNo) throws NoSuchDmsPocException;

	/**
	* Returns the number of dms pocs where regNo = &#63;.
	*
	* @param regNo the reg no
	* @return the number of matching dms pocs
	*/
	public int countByRegNo(String regNo);

	/**
	* Returns the dms poc where VIN = &#63; or throws a {@link NoSuchDmsPocException} if it could not be found.
	*
	* @param VIN the vin
	* @return the matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public DmsPoc findByVin(String VIN) throws NoSuchDmsPocException;

	/**
	* Returns the dms poc where VIN = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param VIN the vin
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public DmsPoc fetchByVin(String VIN);

	/**
	* Returns the dms poc where VIN = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param VIN the vin
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public DmsPoc fetchByVin(String VIN, boolean retrieveFromCache);

	/**
	* Removes the dms poc where VIN = &#63; from the database.
	*
	* @param VIN the vin
	* @return the dms poc that was removed
	*/
	public DmsPoc removeByVin(String VIN) throws NoSuchDmsPocException;

	/**
	* Returns the number of dms pocs where VIN = &#63;.
	*
	* @param VIN the vin
	* @return the number of matching dms pocs
	*/
	public int countByVin(String VIN);

	/**
	* Returns the dms poc where regNo = &#63; and VIN = &#63; or throws a {@link NoSuchDmsPocException} if it could not be found.
	*
	* @param regNo the reg no
	* @param VIN the vin
	* @return the matching dms poc
	* @throws NoSuchDmsPocException if a matching dms poc could not be found
	*/
	public DmsPoc findByRegNoVin(String regNo, String VIN)
		throws NoSuchDmsPocException;

	/**
	* Returns the dms poc where regNo = &#63; and VIN = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param regNo the reg no
	* @param VIN the vin
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public DmsPoc fetchByRegNoVin(String regNo, String VIN);

	/**
	* Returns the dms poc where regNo = &#63; and VIN = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param regNo the reg no
	* @param VIN the vin
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	*/
	public DmsPoc fetchByRegNoVin(String regNo, String VIN,
		boolean retrieveFromCache);

	/**
	* Removes the dms poc where regNo = &#63; and VIN = &#63; from the database.
	*
	* @param regNo the reg no
	* @param VIN the vin
	* @return the dms poc that was removed
	*/
	public DmsPoc removeByRegNoVin(String regNo, String VIN)
		throws NoSuchDmsPocException;

	/**
	* Returns the number of dms pocs where regNo = &#63; and VIN = &#63;.
	*
	* @param regNo the reg no
	* @param VIN the vin
	* @return the number of matching dms pocs
	*/
	public int countByRegNoVin(String regNo, String VIN);

	/**
	* Caches the dms poc in the entity cache if it is enabled.
	*
	* @param dmsPoc the dms poc
	*/
	public void cacheResult(DmsPoc dmsPoc);

	/**
	* Caches the dms pocs in the entity cache if it is enabled.
	*
	* @param dmsPocs the dms pocs
	*/
	public void cacheResult(java.util.List<DmsPoc> dmsPocs);

	/**
	* Creates a new dms poc with the primary key. Does not add the dms poc to the database.
	*
	* @param id the primary key for the new dms poc
	* @return the new dms poc
	*/
	public DmsPoc create(long id);

	/**
	* Removes the dms poc with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param id the primary key of the dms poc
	* @return the dms poc that was removed
	* @throws NoSuchDmsPocException if a dms poc with the primary key could not be found
	*/
	public DmsPoc remove(long id) throws NoSuchDmsPocException;

	public DmsPoc updateImpl(DmsPoc dmsPoc);

	/**
	* Returns the dms poc with the primary key or throws a {@link NoSuchDmsPocException} if it could not be found.
	*
	* @param id the primary key of the dms poc
	* @return the dms poc
	* @throws NoSuchDmsPocException if a dms poc with the primary key could not be found
	*/
	public DmsPoc findByPrimaryKey(long id) throws NoSuchDmsPocException;

	/**
	* Returns the dms poc with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param id the primary key of the dms poc
	* @return the dms poc, or <code>null</code> if a dms poc with the primary key could not be found
	*/
	public DmsPoc fetchByPrimaryKey(long id);

	@Override
	public java.util.Map<java.io.Serializable, DmsPoc> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the dms pocs.
	*
	* @return the dms pocs
	*/
	public java.util.List<DmsPoc> findAll();

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
	public java.util.List<DmsPoc> findAll(int start, int end);

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
	public java.util.List<DmsPoc> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator);

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
	public java.util.List<DmsPoc> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<DmsPoc> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the dms pocs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of dms pocs.
	*
	* @return the number of dms pocs
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}