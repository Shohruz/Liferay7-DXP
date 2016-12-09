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

package com.tahir.liferaypractice.model;

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
 * The base model interface for the TestServiceModule service. Represents a row in the &quot;NC__TestServiceModule&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.tahir.liferaypractice.model.impl.TestServiceModuleModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.tahir.liferaypractice.model.impl.TestServiceModuleImpl}.
 * </p>
 *
 * @author Tahir
 * @see TestServiceModule
 * @see com.tahir.liferaypractice.model.impl.TestServiceModuleImpl
 * @see com.tahir.liferaypractice.model.impl.TestServiceModuleModelImpl
 * @generated
 */
@ProviderType
public interface TestServiceModuleModel extends BaseModel<TestServiceModule>,
	GroupedModel, ShardedModel, StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a test service module model instance should use the {@link TestServiceModule} interface instead.
	 */

	/**
	 * Returns the primary key of this test service module.
	 *
	 * @return the primary key of this test service module
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this test service module.
	 *
	 * @param primaryKey the primary key of this test service module
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this test service module.
	 *
	 * @return the uuid of this test service module
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this test service module.
	 *
	 * @param uuid the uuid of this test service module
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the test service module ID of this test service module.
	 *
	 * @return the test service module ID of this test service module
	 */
	public long getTestServiceModuleId();

	/**
	 * Sets the test service module ID of this test service module.
	 *
	 * @param testServiceModuleId the test service module ID of this test service module
	 */
	public void setTestServiceModuleId(long testServiceModuleId);

	/**
	 * Returns the group ID of this test service module.
	 *
	 * @return the group ID of this test service module
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this test service module.
	 *
	 * @param groupId the group ID of this test service module
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this test service module.
	 *
	 * @return the company ID of this test service module
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this test service module.
	 *
	 * @param companyId the company ID of this test service module
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this test service module.
	 *
	 * @return the user ID of this test service module
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this test service module.
	 *
	 * @param userId the user ID of this test service module
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this test service module.
	 *
	 * @return the user uuid of this test service module
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this test service module.
	 *
	 * @param userUuid the user uuid of this test service module
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this test service module.
	 *
	 * @return the user name of this test service module
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this test service module.
	 *
	 * @param userName the user name of this test service module
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this test service module.
	 *
	 * @return the create date of this test service module
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this test service module.
	 *
	 * @param createDate the create date of this test service module
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this test service module.
	 *
	 * @return the modified date of this test service module
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this test service module.
	 *
	 * @param modifiedDate the modified date of this test service module
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this test service module.
	 *
	 * @return the name of this test service module
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this test service module.
	 *
	 * @param name the name of this test service module
	 */
	public void setName(String name);

	/**
	 * Returns the age of this test service module.
	 *
	 * @return the age of this test service module
	 */
	public int getAge();

	/**
	 * Sets the age of this test service module.
	 *
	 * @param age the age of this test service module
	 */
	public void setAge(int age);

	/**
	 * Returns the profession of this test service module.
	 *
	 * @return the profession of this test service module
	 */
	@AutoEscape
	public String getProfession();

	/**
	 * Sets the profession of this test service module.
	 *
	 * @param profession the profession of this test service module
	 */
	public void setProfession(String profession);

	/**
	 * Returns the dob of this test service module.
	 *
	 * @return the dob of this test service module
	 */
	public Date getDob();

	/**
	 * Sets the dob of this test service module.
	 *
	 * @param dob the dob of this test service module
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
	public int compareTo(
		com.tahir.liferaypractice.model.TestServiceModule testServiceModule);

	@Override
	public int hashCode();

	@Override
	public CacheModel<com.tahir.liferaypractice.model.TestServiceModule> toCacheModel();

	@Override
	public com.tahir.liferaypractice.model.TestServiceModule toEscapedModel();

	@Override
	public com.tahir.liferaypractice.model.TestServiceModule toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}