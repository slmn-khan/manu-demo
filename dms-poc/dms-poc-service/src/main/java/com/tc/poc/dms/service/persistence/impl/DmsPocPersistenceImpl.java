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

package com.tc.poc.dms.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.CompanyProvider;
import com.liferay.portal.kernel.service.persistence.CompanyProviderWrapper;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import com.tc.poc.dms.exception.NoSuchDmsPocException;
import com.tc.poc.dms.model.DmsPoc;
import com.tc.poc.dms.model.impl.DmsPocImpl;
import com.tc.poc.dms.model.impl.DmsPocModelImpl;
import com.tc.poc.dms.service.persistence.DmsPocPersistence;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the dms poc service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Manisha Gera
 * @see DmsPocPersistence
 * @see com.tc.poc.dms.service.persistence.DmsPocUtil
 * @generated
 */
@ProviderType
public class DmsPocPersistenceImpl extends BasePersistenceImpl<DmsPoc>
	implements DmsPocPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DmsPocUtil} to access the dms poc persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DmsPocImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, DmsPocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, DmsPocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, DmsPocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, DmsPocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			DmsPocModelImpl.UUID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the dms pocs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching dms pocs
	 */
	@Override
	public List<DmsPoc> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<DmsPoc> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<DmsPoc> findByUuid(String uuid, int start, int end,
		OrderByComparator<DmsPoc> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<DmsPoc> findByUuid(String uuid, int start, int end,
		OrderByComparator<DmsPoc> orderByComparator, boolean retrieveFromCache) {
		uuid = Objects.toString(uuid, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<DmsPoc> list = null;

		if (retrieveFromCache) {
			list = (List<DmsPoc>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (DmsPoc dmsPoc : list) {
					if (!uuid.equals(dmsPoc.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_DMSPOC_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmsPocModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<DmsPoc>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DmsPoc>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first dms poc in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dms poc
	 * @throws NoSuchDmsPocException if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc findByUuid_First(String uuid,
		OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException {
		DmsPoc dmsPoc = fetchByUuid_First(uuid, orderByComparator);

		if (dmsPoc != null) {
			return dmsPoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchDmsPocException(msg.toString());
	}

	/**
	 * Returns the first dms poc in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dms poc, or <code>null</code> if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc fetchByUuid_First(String uuid,
		OrderByComparator<DmsPoc> orderByComparator) {
		List<DmsPoc> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dms poc in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dms poc
	 * @throws NoSuchDmsPocException if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc findByUuid_Last(String uuid,
		OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException {
		DmsPoc dmsPoc = fetchByUuid_Last(uuid, orderByComparator);

		if (dmsPoc != null) {
			return dmsPoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchDmsPocException(msg.toString());
	}

	/**
	 * Returns the last dms poc in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dms poc, or <code>null</code> if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc fetchByUuid_Last(String uuid,
		OrderByComparator<DmsPoc> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<DmsPoc> list = findByUuid(uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public DmsPoc[] findByUuid_PrevAndNext(long id, String uuid,
		OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException {
		uuid = Objects.toString(uuid, "");

		DmsPoc dmsPoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmsPoc[] array = new DmsPocImpl[3];

			array[0] = getByUuid_PrevAndNext(session, dmsPoc, uuid,
					orderByComparator, true);

			array[1] = dmsPoc;

			array[2] = getByUuid_PrevAndNext(session, dmsPoc, uuid,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmsPoc getByUuid_PrevAndNext(Session session, DmsPoc dmsPoc,
		String uuid, OrderByComparator<DmsPoc> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMSPOC_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(DmsPocModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmsPoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmsPoc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dms pocs where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (DmsPoc dmsPoc : findByUuid(uuid, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dmsPoc);
		}
	}

	/**
	 * Returns the number of dms pocs where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching dms pocs
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMSPOC_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "dmsPoc.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "dmsPoc.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(dmsPoc.uuid IS NULL OR dmsPoc.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, DmsPocImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			DmsPocModelImpl.UUID_COLUMN_BITMASK |
			DmsPocModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the dms poc where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchDmsPocException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dms poc
	 * @throws NoSuchDmsPocException if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc findByUUID_G(String uuid, long groupId)
		throws NoSuchDmsPocException {
		DmsPoc dmsPoc = fetchByUUID_G(uuid, groupId);

		if (dmsPoc == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchDmsPocException(msg.toString());
		}

		return dmsPoc;
	}

	/**
	 * Returns the dms poc where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the dms poc where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof DmsPoc) {
			DmsPoc dmsPoc = (DmsPoc)result;

			if (!Objects.equals(uuid, dmsPoc.getUuid()) ||
					(groupId != dmsPoc.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMSPOC_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<DmsPoc> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					DmsPoc dmsPoc = list.get(0);

					result = dmsPoc;

					cacheResult(dmsPoc);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (DmsPoc)result;
		}
	}

	/**
	 * Removes the dms poc where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the dms poc that was removed
	 */
	@Override
	public DmsPoc removeByUUID_G(String uuid, long groupId)
		throws NoSuchDmsPocException {
		DmsPoc dmsPoc = findByUUID_G(uuid, groupId);

		return remove(dmsPoc);
	}

	/**
	 * Returns the number of dms pocs where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching dms pocs
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMSPOC_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "dmsPoc.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "dmsPoc.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(dmsPoc.uuid IS NULL OR dmsPoc.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "dmsPoc.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, DmsPocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C =
		new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, DmsPocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() },
			DmsPocModelImpl.UUID_COLUMN_BITMASK |
			DmsPocModelImpl.COMPANYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_C = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the dms pocs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching dms pocs
	 */
	@Override
	public List<DmsPoc> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<DmsPoc> findByUuid_C(String uuid, long companyId, int start,
		int end) {
		return findByUuid_C(uuid, companyId, start, end, null);
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
	@Override
	public List<DmsPoc> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<DmsPoc> orderByComparator) {
		return findByUuid_C(uuid, companyId, start, end, orderByComparator, true);
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
	@Override
	public List<DmsPoc> findByUuid_C(String uuid, long companyId, int start,
		int end, OrderByComparator<DmsPoc> orderByComparator,
		boolean retrieveFromCache) {
		uuid = Objects.toString(uuid, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] { uuid, companyId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID_C;
			finderArgs = new Object[] {
					uuid, companyId,
					
					start, end, orderByComparator
				};
		}

		List<DmsPoc> list = null;

		if (retrieveFromCache) {
			list = (List<DmsPoc>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (DmsPoc dmsPoc : list) {
					if (!uuid.equals(dmsPoc.getUuid()) ||
							(companyId != dmsPoc.getCompanyId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_DMSPOC_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmsPocModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				if (!pagination) {
					list = (List<DmsPoc>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DmsPoc>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public DmsPoc findByUuid_C_First(String uuid, long companyId,
		OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException {
		DmsPoc dmsPoc = fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (dmsPoc != null) {
			return dmsPoc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchDmsPocException(msg.toString());
	}

	/**
	 * Returns the first dms poc in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dms poc, or <code>null</code> if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc fetchByUuid_C_First(String uuid, long companyId,
		OrderByComparator<DmsPoc> orderByComparator) {
		List<DmsPoc> list = findByUuid_C(uuid, companyId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public DmsPoc findByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException {
		DmsPoc dmsPoc = fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (dmsPoc != null) {
			return dmsPoc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchDmsPocException(msg.toString());
	}

	/**
	 * Returns the last dms poc in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dms poc, or <code>null</code> if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc fetchByUuid_C_Last(String uuid, long companyId,
		OrderByComparator<DmsPoc> orderByComparator) {
		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<DmsPoc> list = findByUuid_C(uuid, companyId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public DmsPoc[] findByUuid_C_PrevAndNext(long id, String uuid,
		long companyId, OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException {
		uuid = Objects.toString(uuid, "");

		DmsPoc dmsPoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmsPoc[] array = new DmsPocImpl[3];

			array[0] = getByUuid_C_PrevAndNext(session, dmsPoc, uuid,
					companyId, orderByComparator, true);

			array[1] = dmsPoc;

			array[2] = getByUuid_C_PrevAndNext(session, dmsPoc, uuid,
					companyId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmsPoc getByUuid_C_PrevAndNext(Session session, DmsPoc dmsPoc,
		String uuid, long companyId,
		OrderByComparator<DmsPoc> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_DMSPOC_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(DmsPocModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmsPoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmsPoc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dms pocs where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (DmsPoc dmsPoc : findByUuid_C(uuid, companyId, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dmsPoc);
		}
	}

	/**
	 * Returns the number of dms pocs where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching dms pocs
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_C;

		Object[] finderArgs = new Object[] { uuid, companyId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMSPOC_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_1 = "dmsPoc.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_2 = "dmsPoc.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_C_UUID_3 = "(dmsPoc.uuid IS NULL OR dmsPoc.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 = "dmsPoc.companyId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELETED = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, DmsPocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeleted",
			new String[] {
				Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELETED =
		new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, DmsPocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeleted",
			new String[] { Boolean.class.getName() },
			DmsPocModelImpl.DELETED_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELETED = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDeleted",
			new String[] { Boolean.class.getName() });

	/**
	 * Returns all the dms pocs where deleted = &#63;.
	 *
	 * @param deleted the deleted
	 * @return the matching dms pocs
	 */
	@Override
	public List<DmsPoc> findByDeleted(boolean deleted) {
		return findByDeleted(deleted, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<DmsPoc> findByDeleted(boolean deleted, int start, int end) {
		return findByDeleted(deleted, start, end, null);
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
	@Override
	public List<DmsPoc> findByDeleted(boolean deleted, int start, int end,
		OrderByComparator<DmsPoc> orderByComparator) {
		return findByDeleted(deleted, start, end, orderByComparator, true);
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
	@Override
	public List<DmsPoc> findByDeleted(boolean deleted, int start, int end,
		OrderByComparator<DmsPoc> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELETED;
			finderArgs = new Object[] { deleted };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DELETED;
			finderArgs = new Object[] { deleted, start, end, orderByComparator };
		}

		List<DmsPoc> list = null;

		if (retrieveFromCache) {
			list = (List<DmsPoc>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (DmsPoc dmsPoc : list) {
					if ((deleted != dmsPoc.isDeleted())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_DMSPOC_WHERE);

			query.append(_FINDER_COLUMN_DELETED_DELETED_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmsPocModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(deleted);

				if (!pagination) {
					list = (List<DmsPoc>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DmsPoc>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first dms poc in the ordered set where deleted = &#63;.
	 *
	 * @param deleted the deleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dms poc
	 * @throws NoSuchDmsPocException if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc findByDeleted_First(boolean deleted,
		OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException {
		DmsPoc dmsPoc = fetchByDeleted_First(deleted, orderByComparator);

		if (dmsPoc != null) {
			return dmsPoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deleted=");
		msg.append(deleted);

		msg.append("}");

		throw new NoSuchDmsPocException(msg.toString());
	}

	/**
	 * Returns the first dms poc in the ordered set where deleted = &#63;.
	 *
	 * @param deleted the deleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dms poc, or <code>null</code> if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc fetchByDeleted_First(boolean deleted,
		OrderByComparator<DmsPoc> orderByComparator) {
		List<DmsPoc> list = findByDeleted(deleted, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last dms poc in the ordered set where deleted = &#63;.
	 *
	 * @param deleted the deleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dms poc
	 * @throws NoSuchDmsPocException if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc findByDeleted_Last(boolean deleted,
		OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException {
		DmsPoc dmsPoc = fetchByDeleted_Last(deleted, orderByComparator);

		if (dmsPoc != null) {
			return dmsPoc;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deleted=");
		msg.append(deleted);

		msg.append("}");

		throw new NoSuchDmsPocException(msg.toString());
	}

	/**
	 * Returns the last dms poc in the ordered set where deleted = &#63;.
	 *
	 * @param deleted the deleted
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dms poc, or <code>null</code> if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc fetchByDeleted_Last(boolean deleted,
		OrderByComparator<DmsPoc> orderByComparator) {
		int count = countByDeleted(deleted);

		if (count == 0) {
			return null;
		}

		List<DmsPoc> list = findByDeleted(deleted, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public DmsPoc[] findByDeleted_PrevAndNext(long id, boolean deleted,
		OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException {
		DmsPoc dmsPoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmsPoc[] array = new DmsPocImpl[3];

			array[0] = getByDeleted_PrevAndNext(session, dmsPoc, deleted,
					orderByComparator, true);

			array[1] = dmsPoc;

			array[2] = getByDeleted_PrevAndNext(session, dmsPoc, deleted,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmsPoc getByDeleted_PrevAndNext(Session session, DmsPoc dmsPoc,
		boolean deleted, OrderByComparator<DmsPoc> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DMSPOC_WHERE);

		query.append(_FINDER_COLUMN_DELETED_DELETED_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(DmsPocModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(deleted);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmsPoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmsPoc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dms pocs where deleted = &#63; from the database.
	 *
	 * @param deleted the deleted
	 */
	@Override
	public void removeByDeleted(boolean deleted) {
		for (DmsPoc dmsPoc : findByDeleted(deleted, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(dmsPoc);
		}
	}

	/**
	 * Returns the number of dms pocs where deleted = &#63;.
	 *
	 * @param deleted the deleted
	 * @return the number of matching dms pocs
	 */
	@Override
	public int countByDeleted(boolean deleted) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DELETED;

		Object[] finderArgs = new Object[] { deleted };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMSPOC_WHERE);

			query.append(_FINDER_COLUMN_DELETED_DELETED_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(deleted);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_DELETED_DELETED_2 = "dmsPoc.deleted = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_DELETEDSHOW =
		new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, DmsPocImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByDeletedShow",
			new String[] {
				Boolean.class.getName(), Boolean.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELETEDSHOW =
		new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, DmsPocImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByDeletedShow",
			new String[] { Boolean.class.getName(), Boolean.class.getName() },
			DmsPocModelImpl.DELETED_COLUMN_BITMASK |
			DmsPocModelImpl.TOSHOW_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_DELETEDSHOW = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByDeletedShow",
			new String[] { Boolean.class.getName(), Boolean.class.getName() });

	/**
	 * Returns all the dms pocs where deleted = &#63; and toShow = &#63;.
	 *
	 * @param deleted the deleted
	 * @param toShow the to show
	 * @return the matching dms pocs
	 */
	@Override
	public List<DmsPoc> findByDeletedShow(boolean deleted, boolean toShow) {
		return findByDeletedShow(deleted, toShow, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
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
	@Override
	public List<DmsPoc> findByDeletedShow(boolean deleted, boolean toShow,
		int start, int end) {
		return findByDeletedShow(deleted, toShow, start, end, null);
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
	@Override
	public List<DmsPoc> findByDeletedShow(boolean deleted, boolean toShow,
		int start, int end, OrderByComparator<DmsPoc> orderByComparator) {
		return findByDeletedShow(deleted, toShow, start, end,
			orderByComparator, true);
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
	@Override
	public List<DmsPoc> findByDeletedShow(boolean deleted, boolean toShow,
		int start, int end, OrderByComparator<DmsPoc> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELETEDSHOW;
			finderArgs = new Object[] { deleted, toShow };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_DELETEDSHOW;
			finderArgs = new Object[] {
					deleted, toShow,
					
					start, end, orderByComparator
				};
		}

		List<DmsPoc> list = null;

		if (retrieveFromCache) {
			list = (List<DmsPoc>)finderCache.getResult(finderPath, finderArgs,
					this);

			if ((list != null) && !list.isEmpty()) {
				for (DmsPoc dmsPoc : list) {
					if ((deleted != dmsPoc.isDeleted()) ||
							(toShow != dmsPoc.isToShow())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_DMSPOC_WHERE);

			query.append(_FINDER_COLUMN_DELETEDSHOW_DELETED_2);

			query.append(_FINDER_COLUMN_DELETEDSHOW_TOSHOW_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DmsPocModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(deleted);

				qPos.add(toShow);

				if (!pagination) {
					list = (List<DmsPoc>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DmsPoc>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
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
	@Override
	public DmsPoc findByDeletedShow_First(boolean deleted, boolean toShow,
		OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException {
		DmsPoc dmsPoc = fetchByDeletedShow_First(deleted, toShow,
				orderByComparator);

		if (dmsPoc != null) {
			return dmsPoc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deleted=");
		msg.append(deleted);

		msg.append(", toShow=");
		msg.append(toShow);

		msg.append("}");

		throw new NoSuchDmsPocException(msg.toString());
	}

	/**
	 * Returns the first dms poc in the ordered set where deleted = &#63; and toShow = &#63;.
	 *
	 * @param deleted the deleted
	 * @param toShow the to show
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dms poc, or <code>null</code> if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc fetchByDeletedShow_First(boolean deleted, boolean toShow,
		OrderByComparator<DmsPoc> orderByComparator) {
		List<DmsPoc> list = findByDeletedShow(deleted, toShow, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public DmsPoc findByDeletedShow_Last(boolean deleted, boolean toShow,
		OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException {
		DmsPoc dmsPoc = fetchByDeletedShow_Last(deleted, toShow,
				orderByComparator);

		if (dmsPoc != null) {
			return dmsPoc;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("deleted=");
		msg.append(deleted);

		msg.append(", toShow=");
		msg.append(toShow);

		msg.append("}");

		throw new NoSuchDmsPocException(msg.toString());
	}

	/**
	 * Returns the last dms poc in the ordered set where deleted = &#63; and toShow = &#63;.
	 *
	 * @param deleted the deleted
	 * @param toShow the to show
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dms poc, or <code>null</code> if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc fetchByDeletedShow_Last(boolean deleted, boolean toShow,
		OrderByComparator<DmsPoc> orderByComparator) {
		int count = countByDeletedShow(deleted, toShow);

		if (count == 0) {
			return null;
		}

		List<DmsPoc> list = findByDeletedShow(deleted, toShow, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public DmsPoc[] findByDeletedShow_PrevAndNext(long id, boolean deleted,
		boolean toShow, OrderByComparator<DmsPoc> orderByComparator)
		throws NoSuchDmsPocException {
		DmsPoc dmsPoc = findByPrimaryKey(id);

		Session session = null;

		try {
			session = openSession();

			DmsPoc[] array = new DmsPocImpl[3];

			array[0] = getByDeletedShow_PrevAndNext(session, dmsPoc, deleted,
					toShow, orderByComparator, true);

			array[1] = dmsPoc;

			array[2] = getByDeletedShow_PrevAndNext(session, dmsPoc, deleted,
					toShow, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected DmsPoc getByDeletedShow_PrevAndNext(Session session,
		DmsPoc dmsPoc, boolean deleted, boolean toShow,
		OrderByComparator<DmsPoc> orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(5 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_DMSPOC_WHERE);

		query.append(_FINDER_COLUMN_DELETEDSHOW_DELETED_2);

		query.append(_FINDER_COLUMN_DELETEDSHOW_TOSHOW_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(DmsPocModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(deleted);

		qPos.add(toShow);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(dmsPoc);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<DmsPoc> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the dms pocs where deleted = &#63; and toShow = &#63; from the database.
	 *
	 * @param deleted the deleted
	 * @param toShow the to show
	 */
	@Override
	public void removeByDeletedShow(boolean deleted, boolean toShow) {
		for (DmsPoc dmsPoc : findByDeletedShow(deleted, toShow,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(dmsPoc);
		}
	}

	/**
	 * Returns the number of dms pocs where deleted = &#63; and toShow = &#63;.
	 *
	 * @param deleted the deleted
	 * @param toShow the to show
	 * @return the number of matching dms pocs
	 */
	@Override
	public int countByDeletedShow(boolean deleted, boolean toShow) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_DELETEDSHOW;

		Object[] finderArgs = new Object[] { deleted, toShow };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMSPOC_WHERE);

			query.append(_FINDER_COLUMN_DELETEDSHOW_DELETED_2);

			query.append(_FINDER_COLUMN_DELETEDSHOW_TOSHOW_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(deleted);

				qPos.add(toShow);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_DELETEDSHOW_DELETED_2 = "dmsPoc.deleted = ? AND ";
	private static final String _FINDER_COLUMN_DELETEDSHOW_TOSHOW_2 = "dmsPoc.toShow = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_REGNO = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, DmsPocImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByRegNo",
			new String[] { String.class.getName() },
			DmsPocModelImpl.REGNO_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REGNO = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRegNo",
			new String[] { String.class.getName() });

	/**
	 * Returns the dms poc where regNo = &#63; or throws a {@link NoSuchDmsPocException} if it could not be found.
	 *
	 * @param regNo the reg no
	 * @return the matching dms poc
	 * @throws NoSuchDmsPocException if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc findByRegNo(String regNo) throws NoSuchDmsPocException {
		DmsPoc dmsPoc = fetchByRegNo(regNo);

		if (dmsPoc == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("regNo=");
			msg.append(regNo);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchDmsPocException(msg.toString());
		}

		return dmsPoc;
	}

	/**
	 * Returns the dms poc where regNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param regNo the reg no
	 * @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc fetchByRegNo(String regNo) {
		return fetchByRegNo(regNo, true);
	}

	/**
	 * Returns the dms poc where regNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param regNo the reg no
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc fetchByRegNo(String regNo, boolean retrieveFromCache) {
		regNo = Objects.toString(regNo, "");

		Object[] finderArgs = new Object[] { regNo };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_REGNO,
					finderArgs, this);
		}

		if (result instanceof DmsPoc) {
			DmsPoc dmsPoc = (DmsPoc)result;

			if (!Objects.equals(regNo, dmsPoc.getRegNo())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMSPOC_WHERE);

			boolean bindRegNo = false;

			if (regNo.isEmpty()) {
				query.append(_FINDER_COLUMN_REGNO_REGNO_3);
			}
			else {
				bindRegNo = true;

				query.append(_FINDER_COLUMN_REGNO_REGNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRegNo) {
					qPos.add(regNo);
				}

				List<DmsPoc> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_REGNO,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"DmsPocPersistenceImpl.fetchByRegNo(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					DmsPoc dmsPoc = list.get(0);

					result = dmsPoc;

					cacheResult(dmsPoc);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_REGNO, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (DmsPoc)result;
		}
	}

	/**
	 * Removes the dms poc where regNo = &#63; from the database.
	 *
	 * @param regNo the reg no
	 * @return the dms poc that was removed
	 */
	@Override
	public DmsPoc removeByRegNo(String regNo) throws NoSuchDmsPocException {
		DmsPoc dmsPoc = findByRegNo(regNo);

		return remove(dmsPoc);
	}

	/**
	 * Returns the number of dms pocs where regNo = &#63;.
	 *
	 * @param regNo the reg no
	 * @return the number of matching dms pocs
	 */
	@Override
	public int countByRegNo(String regNo) {
		regNo = Objects.toString(regNo, "");

		FinderPath finderPath = FINDER_PATH_COUNT_BY_REGNO;

		Object[] finderArgs = new Object[] { regNo };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMSPOC_WHERE);

			boolean bindRegNo = false;

			if (regNo.isEmpty()) {
				query.append(_FINDER_COLUMN_REGNO_REGNO_3);
			}
			else {
				bindRegNo = true;

				query.append(_FINDER_COLUMN_REGNO_REGNO_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRegNo) {
					qPos.add(regNo);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_REGNO_REGNO_1 = "dmsPoc.regNo IS NULL";
	private static final String _FINDER_COLUMN_REGNO_REGNO_2 = "dmsPoc.regNo = ?";
	private static final String _FINDER_COLUMN_REGNO_REGNO_3 = "(dmsPoc.regNo IS NULL OR dmsPoc.regNo = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_VIN = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, DmsPocImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByVin",
			new String[] { String.class.getName() },
			DmsPocModelImpl.VIN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_VIN = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByVin",
			new String[] { String.class.getName() });

	/**
	 * Returns the dms poc where VIN = &#63; or throws a {@link NoSuchDmsPocException} if it could not be found.
	 *
	 * @param VIN the vin
	 * @return the matching dms poc
	 * @throws NoSuchDmsPocException if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc findByVin(String VIN) throws NoSuchDmsPocException {
		DmsPoc dmsPoc = fetchByVin(VIN);

		if (dmsPoc == null) {
			StringBundler msg = new StringBundler(4);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("VIN=");
			msg.append(VIN);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchDmsPocException(msg.toString());
		}

		return dmsPoc;
	}

	/**
	 * Returns the dms poc where VIN = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param VIN the vin
	 * @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc fetchByVin(String VIN) {
		return fetchByVin(VIN, true);
	}

	/**
	 * Returns the dms poc where VIN = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param VIN the vin
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc fetchByVin(String VIN, boolean retrieveFromCache) {
		VIN = Objects.toString(VIN, "");

		Object[] finderArgs = new Object[] { VIN };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_VIN,
					finderArgs, this);
		}

		if (result instanceof DmsPoc) {
			DmsPoc dmsPoc = (DmsPoc)result;

			if (!Objects.equals(VIN, dmsPoc.getVIN())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_SELECT_DMSPOC_WHERE);

			boolean bindVIN = false;

			if (VIN.isEmpty()) {
				query.append(_FINDER_COLUMN_VIN_VIN_3);
			}
			else {
				bindVIN = true;

				query.append(_FINDER_COLUMN_VIN_VIN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVIN) {
					qPos.add(VIN);
				}

				List<DmsPoc> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_VIN, finderArgs,
						list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"DmsPocPersistenceImpl.fetchByVin(String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					DmsPoc dmsPoc = list.get(0);

					result = dmsPoc;

					cacheResult(dmsPoc);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_VIN, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (DmsPoc)result;
		}
	}

	/**
	 * Removes the dms poc where VIN = &#63; from the database.
	 *
	 * @param VIN the vin
	 * @return the dms poc that was removed
	 */
	@Override
	public DmsPoc removeByVin(String VIN) throws NoSuchDmsPocException {
		DmsPoc dmsPoc = findByVin(VIN);

		return remove(dmsPoc);
	}

	/**
	 * Returns the number of dms pocs where VIN = &#63;.
	 *
	 * @param VIN the vin
	 * @return the number of matching dms pocs
	 */
	@Override
	public int countByVin(String VIN) {
		VIN = Objects.toString(VIN, "");

		FinderPath finderPath = FINDER_PATH_COUNT_BY_VIN;

		Object[] finderArgs = new Object[] { VIN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DMSPOC_WHERE);

			boolean bindVIN = false;

			if (VIN.isEmpty()) {
				query.append(_FINDER_COLUMN_VIN_VIN_3);
			}
			else {
				bindVIN = true;

				query.append(_FINDER_COLUMN_VIN_VIN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindVIN) {
					qPos.add(VIN);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_VIN_VIN_1 = "dmsPoc.VIN IS NULL";
	private static final String _FINDER_COLUMN_VIN_VIN_2 = "dmsPoc.VIN = ?";
	private static final String _FINDER_COLUMN_VIN_VIN_3 = "(dmsPoc.VIN IS NULL OR dmsPoc.VIN = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_REGNOVIN = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, DmsPocImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByRegNoVin",
			new String[] { String.class.getName(), String.class.getName() },
			DmsPocModelImpl.REGNO_COLUMN_BITMASK |
			DmsPocModelImpl.VIN_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_REGNOVIN = new FinderPath(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByRegNoVin",
			new String[] { String.class.getName(), String.class.getName() });

	/**
	 * Returns the dms poc where regNo = &#63; and VIN = &#63; or throws a {@link NoSuchDmsPocException} if it could not be found.
	 *
	 * @param regNo the reg no
	 * @param VIN the vin
	 * @return the matching dms poc
	 * @throws NoSuchDmsPocException if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc findByRegNoVin(String regNo, String VIN)
		throws NoSuchDmsPocException {
		DmsPoc dmsPoc = fetchByRegNoVin(regNo, VIN);

		if (dmsPoc == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("regNo=");
			msg.append(regNo);

			msg.append(", VIN=");
			msg.append(VIN);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchDmsPocException(msg.toString());
		}

		return dmsPoc;
	}

	/**
	 * Returns the dms poc where regNo = &#63; and VIN = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param regNo the reg no
	 * @param VIN the vin
	 * @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc fetchByRegNoVin(String regNo, String VIN) {
		return fetchByRegNoVin(regNo, VIN, true);
	}

	/**
	 * Returns the dms poc where regNo = &#63; and VIN = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param regNo the reg no
	 * @param VIN the vin
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching dms poc, or <code>null</code> if a matching dms poc could not be found
	 */
	@Override
	public DmsPoc fetchByRegNoVin(String regNo, String VIN,
		boolean retrieveFromCache) {
		regNo = Objects.toString(regNo, "");
		VIN = Objects.toString(VIN, "");

		Object[] finderArgs = new Object[] { regNo, VIN };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_REGNOVIN,
					finderArgs, this);
		}

		if (result instanceof DmsPoc) {
			DmsPoc dmsPoc = (DmsPoc)result;

			if (!Objects.equals(regNo, dmsPoc.getRegNo()) ||
					!Objects.equals(VIN, dmsPoc.getVIN())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_DMSPOC_WHERE);

			boolean bindRegNo = false;

			if (regNo.isEmpty()) {
				query.append(_FINDER_COLUMN_REGNOVIN_REGNO_3);
			}
			else {
				bindRegNo = true;

				query.append(_FINDER_COLUMN_REGNOVIN_REGNO_2);
			}

			boolean bindVIN = false;

			if (VIN.isEmpty()) {
				query.append(_FINDER_COLUMN_REGNOVIN_VIN_3);
			}
			else {
				bindVIN = true;

				query.append(_FINDER_COLUMN_REGNOVIN_VIN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRegNo) {
					qPos.add(regNo);
				}

				if (bindVIN) {
					qPos.add(VIN);
				}

				List<DmsPoc> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_REGNOVIN,
						finderArgs, list);
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							_log.warn(
								"DmsPocPersistenceImpl.fetchByRegNoVin(String, String, boolean) with parameters (" +
								StringUtil.merge(finderArgs) +
								") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					DmsPoc dmsPoc = list.get(0);

					result = dmsPoc;

					cacheResult(dmsPoc);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_REGNOVIN,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (DmsPoc)result;
		}
	}

	/**
	 * Removes the dms poc where regNo = &#63; and VIN = &#63; from the database.
	 *
	 * @param regNo the reg no
	 * @param VIN the vin
	 * @return the dms poc that was removed
	 */
	@Override
	public DmsPoc removeByRegNoVin(String regNo, String VIN)
		throws NoSuchDmsPocException {
		DmsPoc dmsPoc = findByRegNoVin(regNo, VIN);

		return remove(dmsPoc);
	}

	/**
	 * Returns the number of dms pocs where regNo = &#63; and VIN = &#63;.
	 *
	 * @param regNo the reg no
	 * @param VIN the vin
	 * @return the number of matching dms pocs
	 */
	@Override
	public int countByRegNoVin(String regNo, String VIN) {
		regNo = Objects.toString(regNo, "");
		VIN = Objects.toString(VIN, "");

		FinderPath finderPath = FINDER_PATH_COUNT_BY_REGNOVIN;

		Object[] finderArgs = new Object[] { regNo, VIN };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DMSPOC_WHERE);

			boolean bindRegNo = false;

			if (regNo.isEmpty()) {
				query.append(_FINDER_COLUMN_REGNOVIN_REGNO_3);
			}
			else {
				bindRegNo = true;

				query.append(_FINDER_COLUMN_REGNOVIN_REGNO_2);
			}

			boolean bindVIN = false;

			if (VIN.isEmpty()) {
				query.append(_FINDER_COLUMN_REGNOVIN_VIN_3);
			}
			else {
				bindVIN = true;

				query.append(_FINDER_COLUMN_REGNOVIN_VIN_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindRegNo) {
					qPos.add(regNo);
				}

				if (bindVIN) {
					qPos.add(VIN);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_REGNOVIN_REGNO_1 = "dmsPoc.regNo IS NULL AND ";
	private static final String _FINDER_COLUMN_REGNOVIN_REGNO_2 = "dmsPoc.regNo = ? AND ";
	private static final String _FINDER_COLUMN_REGNOVIN_REGNO_3 = "(dmsPoc.regNo IS NULL OR dmsPoc.regNo = '') AND ";
	private static final String _FINDER_COLUMN_REGNOVIN_VIN_1 = "dmsPoc.VIN IS NULL";
	private static final String _FINDER_COLUMN_REGNOVIN_VIN_2 = "dmsPoc.VIN = ?";
	private static final String _FINDER_COLUMN_REGNOVIN_VIN_3 = "(dmsPoc.VIN IS NULL OR dmsPoc.VIN = '')";

	public DmsPocPersistenceImpl() {
		setModelClass(DmsPoc.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");
			dbColumnNames.put("id", "id_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the dms poc in the entity cache if it is enabled.
	 *
	 * @param dmsPoc the dms poc
	 */
	@Override
	public void cacheResult(DmsPoc dmsPoc) {
		entityCache.putResult(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocImpl.class, dmsPoc.getPrimaryKey(), dmsPoc);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] { dmsPoc.getUuid(), dmsPoc.getGroupId() }, dmsPoc);

		finderCache.putResult(FINDER_PATH_FETCH_BY_REGNO,
			new Object[] { dmsPoc.getRegNo() }, dmsPoc);

		finderCache.putResult(FINDER_PATH_FETCH_BY_VIN,
			new Object[] { dmsPoc.getVIN() }, dmsPoc);

		finderCache.putResult(FINDER_PATH_FETCH_BY_REGNOVIN,
			new Object[] { dmsPoc.getRegNo(), dmsPoc.getVIN() }, dmsPoc);

		dmsPoc.resetOriginalValues();
	}

	/**
	 * Caches the dms pocs in the entity cache if it is enabled.
	 *
	 * @param dmsPocs the dms pocs
	 */
	@Override
	public void cacheResult(List<DmsPoc> dmsPocs) {
		for (DmsPoc dmsPoc : dmsPocs) {
			if (entityCache.getResult(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
						DmsPocImpl.class, dmsPoc.getPrimaryKey()) == null) {
				cacheResult(dmsPoc);
			}
			else {
				dmsPoc.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all dms pocs.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DmsPocImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the dms poc.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DmsPoc dmsPoc) {
		entityCache.removeResult(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocImpl.class, dmsPoc.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((DmsPocModelImpl)dmsPoc, true);
	}

	@Override
	public void clearCache(List<DmsPoc> dmsPocs) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (DmsPoc dmsPoc : dmsPocs) {
			entityCache.removeResult(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
				DmsPocImpl.class, dmsPoc.getPrimaryKey());

			clearUniqueFindersCache((DmsPocModelImpl)dmsPoc, true);
		}
	}

	protected void cacheUniqueFindersCache(DmsPocModelImpl dmsPocModelImpl) {
		Object[] args = new Object[] {
				dmsPocModelImpl.getUuid(), dmsPocModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			dmsPocModelImpl, false);

		args = new Object[] { dmsPocModelImpl.getRegNo() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_REGNO, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_REGNO, args,
			dmsPocModelImpl, false);

		args = new Object[] { dmsPocModelImpl.getVIN() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_VIN, args, Long.valueOf(1),
			false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_VIN, args, dmsPocModelImpl,
			false);

		args = new Object[] { dmsPocModelImpl.getRegNo(), dmsPocModelImpl.getVIN() };

		finderCache.putResult(FINDER_PATH_COUNT_BY_REGNOVIN, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_REGNOVIN, args,
			dmsPocModelImpl, false);
	}

	protected void clearUniqueFindersCache(DmsPocModelImpl dmsPocModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					dmsPocModelImpl.getUuid(), dmsPocModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((dmsPocModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					dmsPocModelImpl.getOriginalUuid(),
					dmsPocModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] { dmsPocModelImpl.getRegNo() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_REGNO, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_REGNO, args);
		}

		if ((dmsPocModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REGNO.getColumnBitmask()) != 0) {
			Object[] args = new Object[] { dmsPocModelImpl.getOriginalRegNo() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_REGNO, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_REGNO, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] { dmsPocModelImpl.getVIN() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_VIN, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_VIN, args);
		}

		if ((dmsPocModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_VIN.getColumnBitmask()) != 0) {
			Object[] args = new Object[] { dmsPocModelImpl.getOriginalVIN() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_VIN, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_VIN, args);
		}

		if (clearCurrent) {
			Object[] args = new Object[] {
					dmsPocModelImpl.getRegNo(), dmsPocModelImpl.getVIN()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_REGNOVIN, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_REGNOVIN, args);
		}

		if ((dmsPocModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_REGNOVIN.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					dmsPocModelImpl.getOriginalRegNo(),
					dmsPocModelImpl.getOriginalVIN()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_REGNOVIN, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_REGNOVIN, args);
		}
	}

	/**
	 * Creates a new dms poc with the primary key. Does not add the dms poc to the database.
	 *
	 * @param id the primary key for the new dms poc
	 * @return the new dms poc
	 */
	@Override
	public DmsPoc create(long id) {
		DmsPoc dmsPoc = new DmsPocImpl();

		dmsPoc.setNew(true);
		dmsPoc.setPrimaryKey(id);

		String uuid = PortalUUIDUtil.generate();

		dmsPoc.setUuid(uuid);

		dmsPoc.setCompanyId(companyProvider.getCompanyId());

		return dmsPoc;
	}

	/**
	 * Removes the dms poc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the dms poc
	 * @return the dms poc that was removed
	 * @throws NoSuchDmsPocException if a dms poc with the primary key could not be found
	 */
	@Override
	public DmsPoc remove(long id) throws NoSuchDmsPocException {
		return remove((Serializable)id);
	}

	/**
	 * Removes the dms poc with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the dms poc
	 * @return the dms poc that was removed
	 * @throws NoSuchDmsPocException if a dms poc with the primary key could not be found
	 */
	@Override
	public DmsPoc remove(Serializable primaryKey) throws NoSuchDmsPocException {
		Session session = null;

		try {
			session = openSession();

			DmsPoc dmsPoc = (DmsPoc)session.get(DmsPocImpl.class, primaryKey);

			if (dmsPoc == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDmsPocException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(dmsPoc);
		}
		catch (NoSuchDmsPocException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected DmsPoc removeImpl(DmsPoc dmsPoc) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(dmsPoc)) {
				dmsPoc = (DmsPoc)session.get(DmsPocImpl.class,
						dmsPoc.getPrimaryKeyObj());
			}

			if (dmsPoc != null) {
				session.delete(dmsPoc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (dmsPoc != null) {
			clearCache(dmsPoc);
		}

		return dmsPoc;
	}

	@Override
	public DmsPoc updateImpl(DmsPoc dmsPoc) {
		boolean isNew = dmsPoc.isNew();

		if (!(dmsPoc instanceof DmsPocModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(dmsPoc.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(dmsPoc);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in dmsPoc proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DmsPoc implementation " +
				dmsPoc.getClass());
		}

		DmsPocModelImpl dmsPocModelImpl = (DmsPocModelImpl)dmsPoc;

		if (Validator.isNull(dmsPoc.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			dmsPoc.setUuid(uuid);
		}

		ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (dmsPoc.getCreateDate() == null)) {
			if (serviceContext == null) {
				dmsPoc.setCreateDate(now);
			}
			else {
				dmsPoc.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!dmsPocModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				dmsPoc.setModifiedDate(now);
			}
			else {
				dmsPoc.setModifiedDate(serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (dmsPoc.isNew()) {
				session.save(dmsPoc);

				dmsPoc.setNew(false);
			}
			else {
				dmsPoc = (DmsPoc)session.merge(dmsPoc);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!DmsPocModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] { dmsPocModelImpl.getUuid() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] {
					dmsPocModelImpl.getUuid(), dmsPocModelImpl.getCompanyId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
				args);

			args = new Object[] { dmsPocModelImpl.isDeleted() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DELETED, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELETED,
				args);

			args = new Object[] {
					dmsPocModelImpl.isDeleted(), dmsPocModelImpl.isToShow()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_DELETEDSHOW, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELETEDSHOW,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((dmsPocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] { dmsPocModelImpl.getOriginalUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { dmsPocModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((dmsPocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmsPocModelImpl.getOriginalUuid(),
						dmsPocModelImpl.getOriginalCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);

				args = new Object[] {
						dmsPocModelImpl.getUuid(),
						dmsPocModelImpl.getCompanyId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_C, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID_C,
					args);
			}

			if ((dmsPocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELETED.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmsPocModelImpl.getOriginalDeleted()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELETED, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELETED,
					args);

				args = new Object[] { dmsPocModelImpl.isDeleted() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELETED, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELETED,
					args);
			}

			if ((dmsPocModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELETEDSHOW.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						dmsPocModelImpl.getOriginalDeleted(),
						dmsPocModelImpl.getOriginalToShow()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELETEDSHOW, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELETEDSHOW,
					args);

				args = new Object[] {
						dmsPocModelImpl.isDeleted(), dmsPocModelImpl.isToShow()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_DELETEDSHOW, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_DELETEDSHOW,
					args);
			}
		}

		entityCache.putResult(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
			DmsPocImpl.class, dmsPoc.getPrimaryKey(), dmsPoc, false);

		clearUniqueFindersCache(dmsPocModelImpl, false);
		cacheUniqueFindersCache(dmsPocModelImpl);

		dmsPoc.resetOriginalValues();

		return dmsPoc;
	}

	/**
	 * Returns the dms poc with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the dms poc
	 * @return the dms poc
	 * @throws NoSuchDmsPocException if a dms poc with the primary key could not be found
	 */
	@Override
	public DmsPoc findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDmsPocException {
		DmsPoc dmsPoc = fetchByPrimaryKey(primaryKey);

		if (dmsPoc == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDmsPocException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return dmsPoc;
	}

	/**
	 * Returns the dms poc with the primary key or throws a {@link NoSuchDmsPocException} if it could not be found.
	 *
	 * @param id the primary key of the dms poc
	 * @return the dms poc
	 * @throws NoSuchDmsPocException if a dms poc with the primary key could not be found
	 */
	@Override
	public DmsPoc findByPrimaryKey(long id) throws NoSuchDmsPocException {
		return findByPrimaryKey((Serializable)id);
	}

	/**
	 * Returns the dms poc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the dms poc
	 * @return the dms poc, or <code>null</code> if a dms poc with the primary key could not be found
	 */
	@Override
	public DmsPoc fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
				DmsPocImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		DmsPoc dmsPoc = (DmsPoc)serializable;

		if (dmsPoc == null) {
			Session session = null;

			try {
				session = openSession();

				dmsPoc = (DmsPoc)session.get(DmsPocImpl.class, primaryKey);

				if (dmsPoc != null) {
					cacheResult(dmsPoc);
				}
				else {
					entityCache.putResult(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
						DmsPocImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
					DmsPocImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return dmsPoc;
	}

	/**
	 * Returns the dms poc with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the dms poc
	 * @return the dms poc, or <code>null</code> if a dms poc with the primary key could not be found
	 */
	@Override
	public DmsPoc fetchByPrimaryKey(long id) {
		return fetchByPrimaryKey((Serializable)id);
	}

	@Override
	public Map<Serializable, DmsPoc> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, DmsPoc> map = new HashMap<Serializable, DmsPoc>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			DmsPoc dmsPoc = fetchByPrimaryKey(primaryKey);

			if (dmsPoc != null) {
				map.put(primaryKey, dmsPoc);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
					DmsPocImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (DmsPoc)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_DMSPOC_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (DmsPoc dmsPoc : (List<DmsPoc>)q.list()) {
				map.put(dmsPoc.getPrimaryKeyObj(), dmsPoc);

				cacheResult(dmsPoc);

				uncachedPrimaryKeys.remove(dmsPoc.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(DmsPocModelImpl.ENTITY_CACHE_ENABLED,
					DmsPocImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the dms pocs.
	 *
	 * @return the dms pocs
	 */
	@Override
	public List<DmsPoc> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<DmsPoc> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<DmsPoc> findAll(int start, int end,
		OrderByComparator<DmsPoc> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<DmsPoc> findAll(int start, int end,
		OrderByComparator<DmsPoc> orderByComparator, boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<DmsPoc> list = null;

		if (retrieveFromCache) {
			list = (List<DmsPoc>)finderCache.getResult(finderPath, finderArgs,
					this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_DMSPOC);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DMSPOC;

				if (pagination) {
					sql = sql.concat(DmsPocModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<DmsPoc>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<DmsPoc>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the dms pocs from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DmsPoc dmsPoc : findAll()) {
			remove(dmsPoc);
		}
	}

	/**
	 * Returns the number of dms pocs.
	 *
	 * @return the number of dms pocs
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DMSPOC);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DmsPocModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the dms poc persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(DmsPocImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = CompanyProviderWrapper.class)
	protected CompanyProvider companyProvider;
	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_DMSPOC = "SELECT dmsPoc FROM DmsPoc dmsPoc";
	private static final String _SQL_SELECT_DMSPOC_WHERE_PKS_IN = "SELECT dmsPoc FROM DmsPoc dmsPoc WHERE id_ IN (";
	private static final String _SQL_SELECT_DMSPOC_WHERE = "SELECT dmsPoc FROM DmsPoc dmsPoc WHERE ";
	private static final String _SQL_COUNT_DMSPOC = "SELECT COUNT(dmsPoc) FROM DmsPoc dmsPoc";
	private static final String _SQL_COUNT_DMSPOC_WHERE = "SELECT COUNT(dmsPoc) FROM DmsPoc dmsPoc WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "dmsPoc.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No DmsPoc exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No DmsPoc exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(DmsPocPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid", "id"
			});
}