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

package com.tahir.motogplusservice.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Khaliq service. Represents a row in the &quot;moto_Khaliq&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.tahir.motogplusservice.model.impl.KhaliqModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.tahir.motogplusservice.model.impl.KhaliqImpl}.
 * </p>
 *
 * @author TahirNoor
 * @see Khaliq
 * @see com.tahir.motogplusservice.model.impl.KhaliqImpl
 * @see com.tahir.motogplusservice.model.impl.KhaliqModelImpl
 * @generated
 */
@ProviderType
public interface KhaliqModel extends BaseModel<Khaliq>, GroupedModel,
	ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a khaliq model instance should use the {@link Khaliq} interface instead.
	 */

	/**
	 * Returns the primary key of this khaliq.
	 *
	 * @return the primary key of this khaliq
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this khaliq.
	 *
	 * @param primaryKey the primary key of this khaliq
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this khaliq.
	 *
	 * @return the uuid of this khaliq
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this khaliq.
	 *
	 * @param uuid the uuid of this khaliq
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the khaliq ID of this khaliq.
	 *
	 * @return the khaliq ID of this khaliq
	 */
	public long getKhaliqId();

	/**
	 * Sets the khaliq ID of this khaliq.
	 *
	 * @param khaliqId the khaliq ID of this khaliq
	 */
	public void setKhaliqId(long khaliqId);

	/**
	 * Returns the group ID of this khaliq.
	 *
	 * @return the group ID of this khaliq
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this khaliq.
	 *
	 * @param groupId the group ID of this khaliq
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this khaliq.
	 *
	 * @return the company ID of this khaliq
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this khaliq.
	 *
	 * @param companyId the company ID of this khaliq
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this khaliq.
	 *
	 * @return the user ID of this khaliq
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this khaliq.
	 *
	 * @param userId the user ID of this khaliq
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this khaliq.
	 *
	 * @return the user uuid of this khaliq
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this khaliq.
	 *
	 * @param userUuid the user uuid of this khaliq
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this khaliq.
	 *
	 * @return the user name of this khaliq
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this khaliq.
	 *
	 * @param userName the user name of this khaliq
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this khaliq.
	 *
	 * @return the create date of this khaliq
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this khaliq.
	 *
	 * @param createDate the create date of this khaliq
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this khaliq.
	 *
	 * @return the modified date of this khaliq
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this khaliq.
	 *
	 * @param modifiedDate the modified date of this khaliq
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this khaliq.
	 *
	 * @return the name of this khaliq
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this khaliq.
	 *
	 * @param name the name of this khaliq
	 */
	public void setName(String name);

	/**
	 * Returns the designation of this khaliq.
	 *
	 * @return the designation of this khaliq
	 */
	@AutoEscape
	public String getDesignation();

	/**
	 * Sets the designation of this khaliq.
	 *
	 * @param designation the designation of this khaliq
	 */
	public void setDesignation(String designation);

	/**
	 * Returns the dob of this khaliq.
	 *
	 * @return the dob of this khaliq
	 */
	public Date getDob();

	/**
	 * Sets the dob of this khaliq.
	 *
	 * @param dob the dob of this khaliq
	 */
	public void setDob(Date dob);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Khaliq khaliq);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Khaliq> toCacheModel();

	@Override
	public Khaliq toEscapedModel();

	@Override
	public Khaliq toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}