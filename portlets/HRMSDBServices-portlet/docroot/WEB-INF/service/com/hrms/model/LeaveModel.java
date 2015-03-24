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

package com.hrms.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Leave service. Represents a row in the &quot;HRMS_Leave&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.hrms.model.impl.LeaveModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.hrms.model.impl.LeaveImpl}.
 * </p>
 *
 * @author yashpalsinh
 * @see Leave
 * @see com.hrms.model.impl.LeaveImpl
 * @see com.hrms.model.impl.LeaveModelImpl
 * @generated
 */
public interface LeaveModel extends BaseModel<Leave> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a leave model instance should use the {@link Leave} interface instead.
	 */

	/**
	 * Returns the primary key of this leave.
	 *
	 * @return the primary key of this leave
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this leave.
	 *
	 * @param primaryKey the primary key of this leave
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the leave ID of this leave.
	 *
	 * @return the leave ID of this leave
	 */
	public long getLeaveId();

	/**
	 * Sets the leave ID of this leave.
	 *
	 * @param leaveId the leave ID of this leave
	 */
	public void setLeaveId(long leaveId);

	/**
	 * Returns the group ID of this leave.
	 *
	 * @return the group ID of this leave
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this leave.
	 *
	 * @param groupId the group ID of this leave
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this leave.
	 *
	 * @return the company ID of this leave
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this leave.
	 *
	 * @param companyId the company ID of this leave
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the leave name of this leave.
	 *
	 * @return the leave name of this leave
	 */
	@AutoEscape
	public String getLeaveName();

	/**
	 * Sets the leave name of this leave.
	 *
	 * @param leaveName the leave name of this leave
	 */
	public void setLeaveName(String leaveName);

	/**
	 * Returns the leave type of this leave.
	 *
	 * @return the leave type of this leave
	 */
	@AutoEscape
	public String getLeaveType();

	/**
	 * Sets the leave type of this leave.
	 *
	 * @param leaveType the leave type of this leave
	 */
	public void setLeaveType(String leaveType);

	/**
	 * Returns the leaves allowed per year of this leave.
	 *
	 * @return the leaves allowed per year of this leave
	 */
	public int getLeavesAllowedPerYear();

	/**
	 * Sets the leaves allowed per year of this leave.
	 *
	 * @param leavesAllowedPerYear the leaves allowed per year of this leave
	 */
	public void setLeavesAllowedPerYear(int leavesAllowedPerYear);

	/**
	 * Returns the carry over of this leave.
	 *
	 * @return the carry over of this leave
	 */
	public boolean getCarryOver();

	/**
	 * Returns <code>true</code> if this leave is carry over.
	 *
	 * @return <code>true</code> if this leave is carry over; <code>false</code> otherwise
	 */
	public boolean isCarryOver();

	/**
	 * Sets whether this leave is carry over.
	 *
	 * @param carryOver the carry over of this leave
	 */
	public void setCarryOver(boolean carryOver);

	/**
	 * Returns the carry over limit of this leave.
	 *
	 * @return the carry over limit of this leave
	 */
	public int getCarryOverLimit();

	/**
	 * Sets the carry over limit of this leave.
	 *
	 * @param carryOverLimit the carry over limit of this leave
	 */
	public void setCarryOverLimit(int carryOverLimit);

	/**
	 * Returns the encachement of this leave.
	 *
	 * @return the encachement of this leave
	 */
	public boolean getEncachement();

	/**
	 * Returns <code>true</code> if this leave is encachement.
	 *
	 * @return <code>true</code> if this leave is encachement; <code>false</code> otherwise
	 */
	public boolean isEncachement();

	/**
	 * Sets whether this leave is encachement.
	 *
	 * @param encachement the encachement of this leave
	 */
	public void setEncachement(boolean encachement);

	/**
	 * Returns the status of this leave.
	 *
	 * @return the status of this leave
	 */
	public boolean getStatus();

	/**
	 * Returns <code>true</code> if this leave is status.
	 *
	 * @return <code>true</code> if this leave is status; <code>false</code> otherwise
	 */
	public boolean isStatus();

	/**
	 * Sets whether this leave is status.
	 *
	 * @param status the status of this leave
	 */
	public void setStatus(boolean status);

	/**
	 * Returns the create date of this leave.
	 *
	 * @return the create date of this leave
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this leave.
	 *
	 * @param createDate the create date of this leave
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this leave.
	 *
	 * @return the modified date of this leave
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this leave.
	 *
	 * @param modifiedDate the modified date of this leave
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the create by of this leave.
	 *
	 * @return the create by of this leave
	 */
	public long getCreateBy();

	/**
	 * Sets the create by of this leave.
	 *
	 * @param createBy the create by of this leave
	 */
	public void setCreateBy(long createBy);

	/**
	 * Returns the modified by of this leave.
	 *
	 * @return the modified by of this leave
	 */
	public long getModifiedBy();

	/**
	 * Sets the modified by of this leave.
	 *
	 * @param modifiedBy the modified by of this leave
	 */
	public void setModifiedBy(long modifiedBy);

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
	public int compareTo(Leave leave);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Leave> toCacheModel();

	@Override
	public Leave toEscapedModel();

	@Override
	public Leave toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}