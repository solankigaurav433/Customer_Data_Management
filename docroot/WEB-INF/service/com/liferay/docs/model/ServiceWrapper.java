/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.docs.model;

import com.liferay.portal.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Service}.
 * </p>
 *
 * @author ADMIN
 * @see Service
 * @generated
 */
public class ServiceWrapper implements Service, ModelWrapper<Service> {
	public ServiceWrapper(Service service) {
		_service = service;
	}

	@Override
	public Class<?> getModelClass() {
		return Service.class;
	}

	@Override
	public String getModelClassName() {
		return Service.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("serviceId", getServiceId());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("price", getPrice());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long serviceId = (Long)attributes.get("serviceId");

		if (serviceId != null) {
			setServiceId(serviceId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String price = (String)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	/**
	* Returns the primary key of this service.
	*
	* @return the primary key of this service
	*/
	@Override
	public long getPrimaryKey() {
		return _service.getPrimaryKey();
	}

	/**
	* Sets the primary key of this service.
	*
	* @param primaryKey the primary key of this service
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_service.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this service.
	*
	* @return the uuid of this service
	*/
	@Override
	public java.lang.String getUuid() {
		return _service.getUuid();
	}

	/**
	* Sets the uuid of this service.
	*
	* @param uuid the uuid of this service
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_service.setUuid(uuid);
	}

	/**
	* Returns the service ID of this service.
	*
	* @return the service ID of this service
	*/
	@Override
	public long getServiceId() {
		return _service.getServiceId();
	}

	/**
	* Sets the service ID of this service.
	*
	* @param serviceId the service ID of this service
	*/
	@Override
	public void setServiceId(long serviceId) {
		_service.setServiceId(serviceId);
	}

	/**
	* Returns the name of this service.
	*
	* @return the name of this service
	*/
	@Override
	public java.lang.String getName() {
		return _service.getName();
	}

	/**
	* Sets the name of this service.
	*
	* @param name the name of this service
	*/
	@Override
	public void setName(java.lang.String name) {
		_service.setName(name);
	}

	/**
	* Returns the description of this service.
	*
	* @return the description of this service
	*/
	@Override
	public java.lang.String getDescription() {
		return _service.getDescription();
	}

	/**
	* Sets the description of this service.
	*
	* @param description the description of this service
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_service.setDescription(description);
	}

	/**
	* Returns the price of this service.
	*
	* @return the price of this service
	*/
	@Override
	public java.lang.String getPrice() {
		return _service.getPrice();
	}

	/**
	* Sets the price of this service.
	*
	* @param price the price of this service
	*/
	@Override
	public void setPrice(java.lang.String price) {
		_service.setPrice(price);
	}

	/**
	* Returns the company ID of this service.
	*
	* @return the company ID of this service
	*/
	@Override
	public long getCompanyId() {
		return _service.getCompanyId();
	}

	/**
	* Sets the company ID of this service.
	*
	* @param companyId the company ID of this service
	*/
	@Override
	public void setCompanyId(long companyId) {
		_service.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this service.
	*
	* @return the group ID of this service
	*/
	@Override
	public long getGroupId() {
		return _service.getGroupId();
	}

	/**
	* Sets the group ID of this service.
	*
	* @param groupId the group ID of this service
	*/
	@Override
	public void setGroupId(long groupId) {
		_service.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this service.
	*
	* @return the user ID of this service
	*/
	@Override
	public long getUserId() {
		return _service.getUserId();
	}

	/**
	* Sets the user ID of this service.
	*
	* @param userId the user ID of this service
	*/
	@Override
	public void setUserId(long userId) {
		_service.setUserId(userId);
	}

	/**
	* Returns the user uuid of this service.
	*
	* @return the user uuid of this service
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _service.getUserUuid();
	}

	/**
	* Sets the user uuid of this service.
	*
	* @param userUuid the user uuid of this service
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_service.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this service.
	*
	* @return the create date of this service
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _service.getCreateDate();
	}

	/**
	* Sets the create date of this service.
	*
	* @param createDate the create date of this service
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_service.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this service.
	*
	* @return the modified date of this service
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _service.getModifiedDate();
	}

	/**
	* Sets the modified date of this service.
	*
	* @param modifiedDate the modified date of this service
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_service.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _service.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_service.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _service.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_service.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _service.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _service.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_service.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _service.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_service.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_service.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_service.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ServiceWrapper((Service)_service.clone());
	}

	@Override
	public int compareTo(com.liferay.docs.model.Service service) {
		return _service.compareTo(service);
	}

	@Override
	public int hashCode() {
		return _service.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.docs.model.Service> toCacheModel() {
		return _service.toCacheModel();
	}

	@Override
	public com.liferay.docs.model.Service toEscapedModel() {
		return new ServiceWrapper(_service.toEscapedModel());
	}

	@Override
	public com.liferay.docs.model.Service toUnescapedModel() {
		return new ServiceWrapper(_service.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _service.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _service.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_service.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServiceWrapper)) {
			return false;
		}

		ServiceWrapper serviceWrapper = (ServiceWrapper)obj;

		if (Validator.equals(_service, serviceWrapper._service)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _service.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Service getWrappedService() {
		return _service;
	}

	@Override
	public Service getWrappedModel() {
		return _service;
	}

	@Override
	public void resetOriginalValues() {
		_service.resetOriginalValues();
	}

	private Service _service;
}