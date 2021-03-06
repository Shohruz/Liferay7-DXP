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

package com.tahir.motogplusservice.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;

import com.tahir.motogplusservice.model.Khaliq;
import com.tahir.motogplusservice.model.KhaliqModel;
import com.tahir.motogplusservice.model.KhaliqSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Khaliq service. Represents a row in the &quot;moto_Khaliq&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link KhaliqModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link KhaliqImpl}.
 * </p>
 *
 * @author TahirNoor
 * @see KhaliqImpl
 * @see Khaliq
 * @see KhaliqModel
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class KhaliqModelImpl extends BaseModelImpl<Khaliq>
	implements KhaliqModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a khaliq model instance should use the {@link Khaliq} interface instead.
	 */
	public static final String TABLE_NAME = "moto_Khaliq";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "khaliqId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "name", Types.VARCHAR },
			{ "designation", Types.VARCHAR },
			{ "dob", Types.TIMESTAMP }
		};
	public static final Map<String, Integer> TABLE_COLUMNS_MAP = new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("khaliqId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("name", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("designation", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dob", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE = "create table moto_Khaliq (uuid_ VARCHAR(75) null,khaliqId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,designation VARCHAR(75) null,dob DATE null)";
	public static final String TABLE_SQL_DROP = "drop table moto_Khaliq";
	public static final String ORDER_BY_JPQL = " ORDER BY khaliq.khaliqId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY moto_Khaliq.khaliqId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.tahir.motogplusservice.service.util.ServiceProps.get(
				"value.object.entity.cache.enabled.com.tahir.motogplusservice.model.Khaliq"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.tahir.motogplusservice.service.util.ServiceProps.get(
				"value.object.finder.cache.enabled.com.tahir.motogplusservice.model.Khaliq"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.tahir.motogplusservice.service.util.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.tahir.motogplusservice.model.Khaliq"),
			true);
	public static final long COMPANYID_COLUMN_BITMASK = 1L;
	public static final long GROUPID_COLUMN_BITMASK = 2L;
	public static final long NAME_COLUMN_BITMASK = 4L;
	public static final long UUID_COLUMN_BITMASK = 8L;
	public static final long KHALIQID_COLUMN_BITMASK = 16L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Khaliq toModel(KhaliqSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Khaliq model = new KhaliqImpl();

		model.setUuid(soapModel.getUuid());
		model.setKhaliqId(soapModel.getKhaliqId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setName(soapModel.getName());
		model.setDesignation(soapModel.getDesignation());
		model.setDob(soapModel.getDob());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Khaliq> toModels(KhaliqSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Khaliq> models = new ArrayList<Khaliq>(soapModels.length);

		for (KhaliqSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.tahir.motogplusservice.service.util.ServiceProps.get(
				"lock.expiration.time.com.tahir.motogplusservice.model.Khaliq"));

	public KhaliqModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _khaliqId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setKhaliqId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _khaliqId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Khaliq.class;
	}

	@Override
	public String getModelClassName() {
		return Khaliq.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("khaliqId", getKhaliqId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("designation", getDesignation());
		attributes.put("dob", getDob());

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long khaliqId = (Long)attributes.get("khaliqId");

		if (khaliqId != null) {
			setKhaliqId(khaliqId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String designation = (String)attributes.get("designation");

		if (designation != null) {
			setDesignation(designation);
		}

		Date dob = (Date)attributes.get("dob");

		if (dob != null) {
			setDob(dob);
		}
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getKhaliqId() {
		return _khaliqId;
	}

	@Override
	public void setKhaliqId(long khaliqId) {
		_khaliqId = khaliqId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return StringPool.BLANK;
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask |= NAME_COLUMN_BITMASK;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	@JSON
	@Override
	public String getDesignation() {
		if (_designation == null) {
			return StringPool.BLANK;
		}
		else {
			return _designation;
		}
	}

	@Override
	public void setDesignation(String designation) {
		_designation = designation;
	}

	@JSON
	@Override
	public Date getDob() {
		return _dob;
	}

	@Override
	public void setDob(Date dob) {
		_dob = dob;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				Khaliq.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Khaliq.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Khaliq toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Khaliq)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		KhaliqImpl khaliqImpl = new KhaliqImpl();

		khaliqImpl.setUuid(getUuid());
		khaliqImpl.setKhaliqId(getKhaliqId());
		khaliqImpl.setGroupId(getGroupId());
		khaliqImpl.setCompanyId(getCompanyId());
		khaliqImpl.setUserId(getUserId());
		khaliqImpl.setUserName(getUserName());
		khaliqImpl.setCreateDate(getCreateDate());
		khaliqImpl.setModifiedDate(getModifiedDate());
		khaliqImpl.setName(getName());
		khaliqImpl.setDesignation(getDesignation());
		khaliqImpl.setDob(getDob());

		khaliqImpl.resetOriginalValues();

		return khaliqImpl;
	}

	@Override
	public int compareTo(Khaliq khaliq) {
		long primaryKey = khaliq.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Khaliq)) {
			return false;
		}

		Khaliq khaliq = (Khaliq)obj;

		long primaryKey = khaliq.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		KhaliqModelImpl khaliqModelImpl = this;

		khaliqModelImpl._originalUuid = khaliqModelImpl._uuid;

		khaliqModelImpl._originalGroupId = khaliqModelImpl._groupId;

		khaliqModelImpl._setOriginalGroupId = false;

		khaliqModelImpl._originalCompanyId = khaliqModelImpl._companyId;

		khaliqModelImpl._setOriginalCompanyId = false;

		khaliqModelImpl._setModifiedDate = false;

		khaliqModelImpl._originalName = khaliqModelImpl._name;

		khaliqModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Khaliq> toCacheModel() {
		KhaliqCacheModel khaliqCacheModel = new KhaliqCacheModel();

		khaliqCacheModel.uuid = getUuid();

		String uuid = khaliqCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			khaliqCacheModel.uuid = null;
		}

		khaliqCacheModel.khaliqId = getKhaliqId();

		khaliqCacheModel.groupId = getGroupId();

		khaliqCacheModel.companyId = getCompanyId();

		khaliqCacheModel.userId = getUserId();

		khaliqCacheModel.userName = getUserName();

		String userName = khaliqCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			khaliqCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			khaliqCacheModel.createDate = createDate.getTime();
		}
		else {
			khaliqCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			khaliqCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			khaliqCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		khaliqCacheModel.name = getName();

		String name = khaliqCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			khaliqCacheModel.name = null;
		}

		khaliqCacheModel.designation = getDesignation();

		String designation = khaliqCacheModel.designation;

		if ((designation != null) && (designation.length() == 0)) {
			khaliqCacheModel.designation = null;
		}

		Date dob = getDob();

		if (dob != null) {
			khaliqCacheModel.dob = dob.getTime();
		}
		else {
			khaliqCacheModel.dob = Long.MIN_VALUE;
		}

		return khaliqCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(23);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", khaliqId=");
		sb.append(getKhaliqId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", designation=");
		sb.append(getDesignation());
		sb.append(", dob=");
		sb.append(getDob());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(37);

		sb.append("<model><model-name>");
		sb.append("com.tahir.motogplusservice.model.Khaliq");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>khaliqId</column-name><column-value><![CDATA[");
		sb.append(getKhaliqId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>designation</column-name><column-value><![CDATA[");
		sb.append(getDesignation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dob</column-name><column-value><![CDATA[");
		sb.append(getDob());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader = Khaliq.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
			Khaliq.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _khaliqId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _name;
	private String _originalName;
	private String _designation;
	private Date _dob;
	private long _columnBitmask;
	private Khaliq _escapedModel;
}