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
 * This class is a wrapper for {@link Customer}.
 * </p>
 *
 * @author ADMIN
 * @see Customer
 * @generated
 */
public class CustomerWrapper implements Customer, ModelWrapper<Customer> {
	public CustomerWrapper(Customer customer) {
		_customer = customer;
	}

	@Override
	public Class<?> getModelClass() {
		return Customer.class;
	}

	@Override
	public String getModelClassName() {
		return Customer.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("customerId", getCustomerId());
		attributes.put("name", getName());
		attributes.put("email", getEmail());
		attributes.put("address", getAddress());
		attributes.put("phone", getPhone());
		attributes.put("passportNo", getPassportNo());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("serviceId", getServiceId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long customerId = (Long)attributes.get("customerId");

		if (customerId != null) {
			setCustomerId(customerId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String phone = (String)attributes.get("phone");

		if (phone != null) {
			setPhone(phone);
		}

		String passportNo = (String)attributes.get("passportNo");

		if (passportNo != null) {
			setPassportNo(passportNo);
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

		Long serviceId = (Long)attributes.get("serviceId");

		if (serviceId != null) {
			setServiceId(serviceId);
		}
	}

	/**
	* Returns the primary key of this customer.
	*
	* @return the primary key of this customer
	*/
	@Override
	public long getPrimaryKey() {
		return _customer.getPrimaryKey();
	}

	/**
	* Sets the primary key of this customer.
	*
	* @param primaryKey the primary key of this customer
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_customer.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the uuid of this customer.
	*
	* @return the uuid of this customer
	*/
	@Override
	public java.lang.String getUuid() {
		return _customer.getUuid();
	}

	/**
	* Sets the uuid of this customer.
	*
	* @param uuid the uuid of this customer
	*/
	@Override
	public void setUuid(java.lang.String uuid) {
		_customer.setUuid(uuid);
	}

	/**
	* Returns the customer ID of this customer.
	*
	* @return the customer ID of this customer
	*/
	@Override
	public long getCustomerId() {
		return _customer.getCustomerId();
	}

	/**
	* Sets the customer ID of this customer.
	*
	* @param customerId the customer ID of this customer
	*/
	@Override
	public void setCustomerId(long customerId) {
		_customer.setCustomerId(customerId);
	}

	/**
	* Returns the name of this customer.
	*
	* @return the name of this customer
	*/
	@Override
	public java.lang.String getName() {
		return _customer.getName();
	}

	/**
	* Sets the name of this customer.
	*
	* @param name the name of this customer
	*/
	@Override
	public void setName(java.lang.String name) {
		_customer.setName(name);
	}

	/**
	* Returns the email of this customer.
	*
	* @return the email of this customer
	*/
	@Override
	public java.lang.String getEmail() {
		return _customer.getEmail();
	}

	/**
	* Sets the email of this customer.
	*
	* @param email the email of this customer
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_customer.setEmail(email);
	}

	/**
	* Returns the address of this customer.
	*
	* @return the address of this customer
	*/
	@Override
	public java.lang.String getAddress() {
		return _customer.getAddress();
	}

	/**
	* Sets the address of this customer.
	*
	* @param address the address of this customer
	*/
	@Override
	public void setAddress(java.lang.String address) {
		_customer.setAddress(address);
	}

	/**
	* Returns the phone of this customer.
	*
	* @return the phone of this customer
	*/
	@Override
	public java.lang.String getPhone() {
		return _customer.getPhone();
	}

	/**
	* Sets the phone of this customer.
	*
	* @param phone the phone of this customer
	*/
	@Override
	public void setPhone(java.lang.String phone) {
		_customer.setPhone(phone);
	}

	/**
	* Returns the passport no of this customer.
	*
	* @return the passport no of this customer
	*/
	@Override
	public java.lang.String getPassportNo() {
		return _customer.getPassportNo();
	}

	/**
	* Sets the passport no of this customer.
	*
	* @param passportNo the passport no of this customer
	*/
	@Override
	public void setPassportNo(java.lang.String passportNo) {
		_customer.setPassportNo(passportNo);
	}

	/**
	* Returns the company ID of this customer.
	*
	* @return the company ID of this customer
	*/
	@Override
	public long getCompanyId() {
		return _customer.getCompanyId();
	}

	/**
	* Sets the company ID of this customer.
	*
	* @param companyId the company ID of this customer
	*/
	@Override
	public void setCompanyId(long companyId) {
		_customer.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this customer.
	*
	* @return the group ID of this customer
	*/
	@Override
	public long getGroupId() {
		return _customer.getGroupId();
	}

	/**
	* Sets the group ID of this customer.
	*
	* @param groupId the group ID of this customer
	*/
	@Override
	public void setGroupId(long groupId) {
		_customer.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this customer.
	*
	* @return the user ID of this customer
	*/
	@Override
	public long getUserId() {
		return _customer.getUserId();
	}

	/**
	* Sets the user ID of this customer.
	*
	* @param userId the user ID of this customer
	*/
	@Override
	public void setUserId(long userId) {
		_customer.setUserId(userId);
	}

	/**
	* Returns the user uuid of this customer.
	*
	* @return the user uuid of this customer
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _customer.getUserUuid();
	}

	/**
	* Sets the user uuid of this customer.
	*
	* @param userUuid the user uuid of this customer
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_customer.setUserUuid(userUuid);
	}

	/**
	* Returns the create date of this customer.
	*
	* @return the create date of this customer
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _customer.getCreateDate();
	}

	/**
	* Sets the create date of this customer.
	*
	* @param createDate the create date of this customer
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_customer.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this customer.
	*
	* @return the modified date of this customer
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _customer.getModifiedDate();
	}

	/**
	* Sets the modified date of this customer.
	*
	* @param modifiedDate the modified date of this customer
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_customer.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the service ID of this customer.
	*
	* @return the service ID of this customer
	*/
	@Override
	public long getServiceId() {
		return _customer.getServiceId();
	}

	/**
	* Sets the service ID of this customer.
	*
	* @param serviceId the service ID of this customer
	*/
	@Override
	public void setServiceId(long serviceId) {
		_customer.setServiceId(serviceId);
	}

	@Override
	public boolean isNew() {
		return _customer.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_customer.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _customer.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_customer.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _customer.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _customer.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_customer.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _customer.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_customer.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_customer.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_customer.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new CustomerWrapper((Customer)_customer.clone());
	}

	@Override
	public int compareTo(com.liferay.docs.model.Customer customer) {
		return _customer.compareTo(customer);
	}

	@Override
	public int hashCode() {
		return _customer.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.liferay.docs.model.Customer> toCacheModel() {
		return _customer.toCacheModel();
	}

	@Override
	public com.liferay.docs.model.Customer toEscapedModel() {
		return new CustomerWrapper(_customer.toEscapedModel());
	}

	@Override
	public com.liferay.docs.model.Customer toUnescapedModel() {
		return new CustomerWrapper(_customer.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _customer.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _customer.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_customer.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CustomerWrapper)) {
			return false;
		}

		CustomerWrapper customerWrapper = (CustomerWrapper)obj;

		if (Validator.equals(_customer, customerWrapper._customer)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _customer.getStagedModelType();
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Customer getWrappedCustomer() {
		return _customer;
	}

	@Override
	public Customer getWrappedModel() {
		return _customer;
	}

	@Override
	public void resetOriginalValues() {
		_customer.resetOriginalValues();
	}

	private Customer _customer;
}