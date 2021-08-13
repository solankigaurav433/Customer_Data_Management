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
 * This class is a wrapper for {@link Services}.
 * </p>
 *
 * @author ADMIN
 * @see Services
 * @generated
 */
public class ServicesWrapper implements Services, ModelWrapper<Services> {
	public ServicesWrapper(Services services) {
		_services = services;
	}

	@Override
	public Class<?> getModelClass() {
		return Services.class;
	}

	@Override
	public String getModelClassName() {
		return Services.class.getName();
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
	* Returns the primary key of this services.
	*
	* @return the primary key of this services
	*/
	@Override
	public long getPrimaryKey() {
		return _services.getPrimaryKey();
	}

	/**
	* Sets the primary key of this services.
	*
	* @param primaryKey the primary key of this services
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_services.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this services.
	*
	* @return the uuid of this services
	*/
	@Override
	public java.lang.String getUuid() {
		return _services.getUuid();
	}

	/**
	* Sets the uuid of this services.
	*
	* @param uuid the uuid of this services
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_services.setUuid(uuid);
	}

	/**
	* Returns the service ID of this services.
	*
	* @return the service ID of this services
	*/
	@Override
	public long getServiceId() {
		return _services.getServiceId();
	}

	/**
	* Sets the service ID of this services.
	*
	* @param serviceId the service ID of this services
	*/
	@Override
	public void setServiceId(long serviceId) {
		_services.setServiceId(serviceId);
	}

	/**
	* Returns the name of this services.
	*
	* @return the name of this services
	*/
	@Override
	public java.lang.String getName() {
		return _services.getName();
	}

	/**
	* Sets the name of this services.
	*
	* @param name the name of this services
	*/
	@Override
	public void setName(java.lang.String name) {
		_services.setName(name);
	}

	/**
	* Returns the description of this services.
	*
	* @return the description of this services
	*/
	@Override
	public java.lang.String getDescription() {
		return _services.getDescription();
	}

	/**
	* Sets the description of this services.
	*
	* @param description the description of this services
	*/
	@Override
	public void setDescription(java.lang.String description) {
		_services.setDescription(description);
	}

	/**
	* Returns the price of this services.
	*
	* @return the price of this services
	*/
	@Override
	public java.lang.String getPrice() {
		return _services.getPrice();
	}

	/**
	* Sets the price of this services.
	*
	* @param price the price of this services
	*/
	@Override
	public void setPrice(java.lang.String price) {
		_services.setPrice(price);
	}

	/**
	* Returns the company ID of this services.
	*
	* @return the company ID of this services
	*/
	@Override
	public long getCompanyId() {
		return _services.getCompanyId();
	}

	/**
	* Sets the company ID of this services.
	*
	* @param companyId the company ID of this services
	*/
	@Override
	public void setCompanyId(long companyId) {
		_services.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this services.
	*
	* @return the group ID of this services
	*/
	@Override
	public long getGroupId() {
		return _services.getGroupId();
	}

	/**
	* Sets the group ID of this services.
	*
	* @param groupId the group ID of this services
	*/
	@Override
	public void setGroupId(long groupId) {
		_services.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this services.
	*
	* @return the user ID of this services
	*/
	@Override
	public long getUserId() {
		return _services.getUserId();
	}

	/**
	* Sets the user ID of this services.
	*
	* @param userId the user ID of this services
	*/
	@Override
	public void setUserId(long userId) {
		_services.setUserId(userId);
	}

	/**
	* Returns the user uuid of this services.
	*
	* @return the user uuid of this services
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _services.getUserUuid();
	}

	/**
	* Sets the user uuid of this services.
	*
	* @param userUuid the user uuid of this services
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_services.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this services.
	*
	* @return the create date of this services
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _services.getCreateDate();
	}

	/**
	* Sets the create date of this services.
	*
	* @param createDate the create date of this services
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_services.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this services.
	*
	* @return the modified date of this services
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _services.getModifiedDate();
	}

	/**
	* Sets the modified date of this services.
	*
	* @param modifiedDate the modified date of this services
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_services.setModifiedDate(modifiedDate);
	}

	@Override
	public boolean isNew() {
		return _services.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_services.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _services.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_services.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _services.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _services.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_services.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _services.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_services.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_services.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_services.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new ServicesWrapper((Services)_services.clone());
	}

	@Override
	public int compareTo(com.liferay.docs.model.Services services) {
		return _services.compareTo(services);
	}

	@Override
	public int hashCode() {
		return _services.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.docs.model.Services> toCacheModel() {
		return _services.toCacheModel();
	}

	@Override
	public com.liferay.docs.model.Services toEscapedModel() {
		return new ServicesWrapper(_services.toEscapedModel());
	}

	@Override
	public com.liferay.docs.model.Services toUnescapedModel() {
		return new ServicesWrapper(_services.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _services.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _services.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_services.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ServicesWrapper)) {
			return false;
		}

		ServicesWrapper servicesWrapper = (ServicesWrapper)obj;

		if (Validator.equals(_services, servicesWrapper._services)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _services.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Services getWrappedServices() {
		return _services;
	}

	@Override
	public Services getWrappedModel() {
		return _services;
	}

	@Override
	public void resetOriginalValues() {
		_services.resetOriginalValues();
	}

	private Services _services;
}