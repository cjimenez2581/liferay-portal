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

package com.liferay.portal.service.persistence.impl;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.PasswordPolicy;
import com.liferay.portal.kernel.service.persistence.PasswordPolicyPersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;

import java.lang.reflect.Field;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PasswordPolicyFinderBaseImpl extends BasePersistenceImpl<PasswordPolicy> {
	public PasswordPolicyFinderBaseImpl() {
		setModelClass(PasswordPolicy.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	@Override
	public Set<String> getBadColumnNames() {
		return getPasswordPolicyPersistence().getBadColumnNames();
	}

	/**
	 * Returns the password policy persistence.
	 *
	 * @return the password policy persistence
	 */
	public PasswordPolicyPersistence getPasswordPolicyPersistence() {
		return passwordPolicyPersistence;
	}

	/**
	 * Sets the password policy persistence.
	 *
	 * @param passwordPolicyPersistence the password policy persistence
	 */
	public void setPasswordPolicyPersistence(
		PasswordPolicyPersistence passwordPolicyPersistence) {
		this.passwordPolicyPersistence = passwordPolicyPersistence;
	}

	@BeanReference(type = PasswordPolicyPersistence.class)
	protected PasswordPolicyPersistence passwordPolicyPersistence;
	private static final Log _log = LogFactoryUtil.getLog(PasswordPolicyFinderBaseImpl.class);
}