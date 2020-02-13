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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the DmsPoc service. Represents a row in the &quot;DMSPOC_DmsPoc&quot; database table, with each column mapped to a property of this class.
 *
 * @author Manisha Gera
 * @see DmsPocModel
 * @see com.tc.poc.dms.model.impl.DmsPocImpl
 * @see com.tc.poc.dms.model.impl.DmsPocModelImpl
 * @generated
 */
@ImplementationClassName("com.tc.poc.dms.model.impl.DmsPocImpl")
@ProviderType
public interface DmsPoc extends DmsPocModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.tc.poc.dms.model.impl.DmsPocImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<DmsPoc, Long> ID_ACCESSOR = new Accessor<DmsPoc, Long>() {
			@Override
			public Long get(DmsPoc dmsPoc) {
				return dmsPoc.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<DmsPoc> getTypeClass() {
				return DmsPoc.class;
			}
		};
}