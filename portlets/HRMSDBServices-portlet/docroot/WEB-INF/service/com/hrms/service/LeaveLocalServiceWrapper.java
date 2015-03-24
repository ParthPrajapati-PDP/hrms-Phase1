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

package com.hrms.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LeaveLocalService}.
 *
 * @author yashpalsinh
 * @see LeaveLocalService
 * @generated
 */
public class LeaveLocalServiceWrapper implements LeaveLocalService,
	ServiceWrapper<LeaveLocalService> {
	public LeaveLocalServiceWrapper(LeaveLocalService leaveLocalService) {
		_leaveLocalService = leaveLocalService;
	}

	/**
	* Adds the leave to the database. Also notifies the appropriate model listeners.
	*
	* @param leave the leave
	* @return the leave that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.Leave addLeave(com.hrms.model.Leave leave)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _leaveLocalService.addLeave(leave);
	}

	/**
	* Creates a new leave with the primary key. Does not add the leave to the database.
	*
	* @param leaveId the primary key for the new leave
	* @return the new leave
	*/
	@Override
	public com.hrms.model.Leave createLeave(long leaveId) {
		return _leaveLocalService.createLeave(leaveId);
	}

	/**
	* Deletes the leave with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param leaveId the primary key of the leave
	* @return the leave that was removed
	* @throws PortalException if a leave with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.Leave deleteLeave(long leaveId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _leaveLocalService.deleteLeave(leaveId);
	}

	/**
	* Deletes the leave from the database. Also notifies the appropriate model listeners.
	*
	* @param leave the leave
	* @return the leave that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.Leave deleteLeave(com.hrms.model.Leave leave)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _leaveLocalService.deleteLeave(leave);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _leaveLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _leaveLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _leaveLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _leaveLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _leaveLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _leaveLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.hrms.model.Leave fetchLeave(long leaveId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _leaveLocalService.fetchLeave(leaveId);
	}

	/**
	* Returns the leave with the primary key.
	*
	* @param leaveId the primary key of the leave
	* @return the leave
	* @throws PortalException if a leave with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.Leave getLeave(long leaveId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _leaveLocalService.getLeave(leaveId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _leaveLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the leaves.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.hrms.model.impl.LeaveModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of leaves
	* @param end the upper bound of the range of leaves (not inclusive)
	* @return the range of leaves
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.hrms.model.Leave> getLeaves(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _leaveLocalService.getLeaves(start, end);
	}

	/**
	* Returns the number of leaves.
	*
	* @return the number of leaves
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getLeavesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _leaveLocalService.getLeavesCount();
	}

	/**
	* Updates the leave in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param leave the leave
	* @return the leave that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.hrms.model.Leave updateLeave(com.hrms.model.Leave leave)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _leaveLocalService.updateLeave(leave);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _leaveLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_leaveLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _leaveLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public LeaveLocalService getWrappedLeaveLocalService() {
		return _leaveLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedLeaveLocalService(LeaveLocalService leaveLocalService) {
		_leaveLocalService = leaveLocalService;
	}

	@Override
	public LeaveLocalService getWrappedService() {
		return _leaveLocalService;
	}

	@Override
	public void setWrappedService(LeaveLocalService leaveLocalService) {
		_leaveLocalService = leaveLocalService;
	}

	private LeaveLocalService _leaveLocalService;
}