/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.hrms.model.impl;

import com.hrms.model.EmployeeLeave;
import com.hrms.model.EmployeeLeaveModel;
import com.hrms.model.EmployeeLeaveSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the EmployeeLeave service. Represents a row in the &quot;HRMS_EmployeeLeave&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.hrms.model.EmployeeLeaveModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmployeeLeaveImpl}.
 * </p>
 *
 * @author yashpalsinh
 * @see EmployeeLeaveImpl
 * @see com.hrms.model.EmployeeLeave
 * @see com.hrms.model.EmployeeLeaveModel
 * @generated
 */
@JSON(strict = true)
public class EmployeeLeaveModelImpl extends BaseModelImpl<EmployeeLeave>
	implements EmployeeLeaveModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a employee leave model instance should use the {@link com.hrms.model.EmployeeLeave} interface instead.
	 */
	public static final String TABLE_NAME = "HRMS_EmployeeLeave";
	public static final Object[][] TABLE_COLUMNS = {
			{ "employeeLeaveId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "year", Types.INTEGER },
			{ "leavesCarriedOver", Types.INTEGER },
			{ "leavesTakenThisYear", Types.INTEGER },
			{ "remainingLeaves", Types.INTEGER },
			{ "leaveId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "createBy", Types.BIGINT },
			{ "modifiedBy", Types.BIGINT }
		};
	public static final String TABLE_SQL_CREATE = "create table HRMS_EmployeeLeave (employeeLeaveId LONG not null primary key,userId LONG,groupId LONG,companyId LONG,year INTEGER,leavesCarriedOver INTEGER,leavesTakenThisYear INTEGER,remainingLeaves INTEGER,leaveId LONG,createDate DATE null,modifiedDate DATE null,createBy LONG,modifiedBy LONG)";
	public static final String TABLE_SQL_DROP = "drop table HRMS_EmployeeLeave";
	public static final String ORDER_BY_JPQL = " ORDER BY employeeLeave.employeeLeaveId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY HRMS_EmployeeLeave.employeeLeaveId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.hrms.model.EmployeeLeave"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.hrms.model.EmployeeLeave"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static EmployeeLeave toModel(EmployeeLeaveSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		EmployeeLeave model = new EmployeeLeaveImpl();

		model.setEmployeeLeaveId(soapModel.getEmployeeLeaveId());
		model.setUserId(soapModel.getUserId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setYear(soapModel.getYear());
		model.setLeavesCarriedOver(soapModel.getLeavesCarriedOver());
		model.setLeavesTakenThisYear(soapModel.getLeavesTakenThisYear());
		model.setRemainingLeaves(soapModel.getRemainingLeaves());
		model.setLeaveId(soapModel.getLeaveId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setCreateBy(soapModel.getCreateBy());
		model.setModifiedBy(soapModel.getModifiedBy());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<EmployeeLeave> toModels(EmployeeLeaveSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<EmployeeLeave> models = new ArrayList<EmployeeLeave>(soapModels.length);

		for (EmployeeLeaveSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.hrms.model.EmployeeLeave"));

	public EmployeeLeaveModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _employeeLeaveId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmployeeLeaveId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _employeeLeaveId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return EmployeeLeave.class;
	}

	@Override
	public String getModelClassName() {
		return EmployeeLeave.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("employeeLeaveId", getEmployeeLeaveId());
		attributes.put("userId", getUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("year", getYear());
		attributes.put("leavesCarriedOver", getLeavesCarriedOver());
		attributes.put("leavesTakenThisYear", getLeavesTakenThisYear());
		attributes.put("remainingLeaves", getRemainingLeaves());
		attributes.put("leaveId", getLeaveId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("createBy", getCreateBy());
		attributes.put("modifiedBy", getModifiedBy());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long employeeLeaveId = (Long)attributes.get("employeeLeaveId");

		if (employeeLeaveId != null) {
			setEmployeeLeaveId(employeeLeaveId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Integer year = (Integer)attributes.get("year");

		if (year != null) {
			setYear(year);
		}

		Integer leavesCarriedOver = (Integer)attributes.get("leavesCarriedOver");

		if (leavesCarriedOver != null) {
			setLeavesCarriedOver(leavesCarriedOver);
		}

		Integer leavesTakenThisYear = (Integer)attributes.get(
				"leavesTakenThisYear");

		if (leavesTakenThisYear != null) {
			setLeavesTakenThisYear(leavesTakenThisYear);
		}

		Integer remainingLeaves = (Integer)attributes.get("remainingLeaves");

		if (remainingLeaves != null) {
			setRemainingLeaves(remainingLeaves);
		}

		Long leaveId = (Long)attributes.get("leaveId");

		if (leaveId != null) {
			setLeaveId(leaveId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Long createBy = (Long)attributes.get("createBy");

		if (createBy != null) {
			setCreateBy(createBy);
		}

		Long modifiedBy = (Long)attributes.get("modifiedBy");

		if (modifiedBy != null) {
			setModifiedBy(modifiedBy);
		}
	}

	@JSON
	@Override
	public long getEmployeeLeaveId() {
		return _employeeLeaveId;
	}

	@Override
	public void setEmployeeLeaveId(long employeeLeaveId) {
		_employeeLeaveId = employeeLeaveId;
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
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public int getYear() {
		return _year;
	}

	@Override
	public void setYear(int year) {
		_year = year;
	}

	@JSON
	@Override
	public int getLeavesCarriedOver() {
		return _leavesCarriedOver;
	}

	@Override
	public void setLeavesCarriedOver(int leavesCarriedOver) {
		_leavesCarriedOver = leavesCarriedOver;
	}

	@JSON
	@Override
	public int getLeavesTakenThisYear() {
		return _leavesTakenThisYear;
	}

	@Override
	public void setLeavesTakenThisYear(int leavesTakenThisYear) {
		_leavesTakenThisYear = leavesTakenThisYear;
	}

	@JSON
	@Override
	public int getRemainingLeaves() {
		return _remainingLeaves;
	}

	@Override
	public void setRemainingLeaves(int remainingLeaves) {
		_remainingLeaves = remainingLeaves;
	}

	@JSON
	@Override
	public long getLeaveId() {
		return _leaveId;
	}

	@Override
	public void setLeaveId(long leaveId) {
		_leaveId = leaveId;
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

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public long getCreateBy() {
		return _createBy;
	}

	@Override
	public void setCreateBy(long createBy) {
		_createBy = createBy;
	}

	@JSON
	@Override
	public long getModifiedBy() {
		return _modifiedBy;
	}

	@Override
	public void setModifiedBy(long modifiedBy) {
		_modifiedBy = modifiedBy;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			EmployeeLeave.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EmployeeLeave toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EmployeeLeave)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmployeeLeaveImpl employeeLeaveImpl = new EmployeeLeaveImpl();

		employeeLeaveImpl.setEmployeeLeaveId(getEmployeeLeaveId());
		employeeLeaveImpl.setUserId(getUserId());
		employeeLeaveImpl.setGroupId(getGroupId());
		employeeLeaveImpl.setCompanyId(getCompanyId());
		employeeLeaveImpl.setYear(getYear());
		employeeLeaveImpl.setLeavesCarriedOver(getLeavesCarriedOver());
		employeeLeaveImpl.setLeavesTakenThisYear(getLeavesTakenThisYear());
		employeeLeaveImpl.setRemainingLeaves(getRemainingLeaves());
		employeeLeaveImpl.setLeaveId(getLeaveId());
		employeeLeaveImpl.setCreateDate(getCreateDate());
		employeeLeaveImpl.setModifiedDate(getModifiedDate());
		employeeLeaveImpl.setCreateBy(getCreateBy());
		employeeLeaveImpl.setModifiedBy(getModifiedBy());

		employeeLeaveImpl.resetOriginalValues();

		return employeeLeaveImpl;
	}

	@Override
	public int compareTo(EmployeeLeave employeeLeave) {
		long primaryKey = employeeLeave.getPrimaryKey();

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

		if (!(obj instanceof EmployeeLeave)) {
			return false;
		}

		EmployeeLeave employeeLeave = (EmployeeLeave)obj;

		long primaryKey = employeeLeave.getPrimaryKey();

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
	public void resetOriginalValues() {
	}

	@Override
	public CacheModel<EmployeeLeave> toCacheModel() {
		EmployeeLeaveCacheModel employeeLeaveCacheModel = new EmployeeLeaveCacheModel();

		employeeLeaveCacheModel.employeeLeaveId = getEmployeeLeaveId();

		employeeLeaveCacheModel.userId = getUserId();

		employeeLeaveCacheModel.groupId = getGroupId();

		employeeLeaveCacheModel.companyId = getCompanyId();

		employeeLeaveCacheModel.year = getYear();

		employeeLeaveCacheModel.leavesCarriedOver = getLeavesCarriedOver();

		employeeLeaveCacheModel.leavesTakenThisYear = getLeavesTakenThisYear();

		employeeLeaveCacheModel.remainingLeaves = getRemainingLeaves();

		employeeLeaveCacheModel.leaveId = getLeaveId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			employeeLeaveCacheModel.createDate = createDate.getTime();
		}
		else {
			employeeLeaveCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			employeeLeaveCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			employeeLeaveCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		employeeLeaveCacheModel.createBy = getCreateBy();

		employeeLeaveCacheModel.modifiedBy = getModifiedBy();

		return employeeLeaveCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{employeeLeaveId=");
		sb.append(getEmployeeLeaveId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", year=");
		sb.append(getYear());
		sb.append(", leavesCarriedOver=");
		sb.append(getLeavesCarriedOver());
		sb.append(", leavesTakenThisYear=");
		sb.append(getLeavesTakenThisYear());
		sb.append(", remainingLeaves=");
		sb.append(getRemainingLeaves());
		sb.append(", leaveId=");
		sb.append(getLeaveId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", createBy=");
		sb.append(getCreateBy());
		sb.append(", modifiedBy=");
		sb.append(getModifiedBy());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("com.hrms.model.EmployeeLeave");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>employeeLeaveId</column-name><column-value><![CDATA[");
		sb.append(getEmployeeLeaveId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
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
			"<column><column-name>year</column-name><column-value><![CDATA[");
		sb.append(getYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leavesCarriedOver</column-name><column-value><![CDATA[");
		sb.append(getLeavesCarriedOver());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leavesTakenThisYear</column-name><column-value><![CDATA[");
		sb.append(getLeavesTakenThisYear());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>remainingLeaves</column-name><column-value><![CDATA[");
		sb.append(getRemainingLeaves());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>leaveId</column-name><column-value><![CDATA[");
		sb.append(getLeaveId());
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
			"<column><column-name>createBy</column-name><column-value><![CDATA[");
		sb.append(getCreateBy());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedBy</column-name><column-value><![CDATA[");
		sb.append(getModifiedBy());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = EmployeeLeave.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EmployeeLeave.class
		};
	private long _employeeLeaveId;
	private long _userId;
	private String _userUuid;
	private long _groupId;
	private long _companyId;
	private int _year;
	private int _leavesCarriedOver;
	private int _leavesTakenThisYear;
	private int _remainingLeaves;
	private long _leaveId;
	private Date _createDate;
	private Date _modifiedDate;
	private long _createBy;
	private long _modifiedBy;
	private EmployeeLeave _escapedModel;
}