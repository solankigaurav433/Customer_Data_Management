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

package com.liferay.docs.model.impl;

import com.liferay.docs.model.Services;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Services in entity cache.
 *
 * @author ADMIN
 * @see Services
 * @generated
 */
public class ServicesCacheModel implements CacheModel<Services>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", serviceId=");
		sb.append(serviceId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", description=");
		sb.append(description);
		sb.append(", price=");
		sb.append(price);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Services toEntityModel() {
		ServicesImpl servicesImpl = new ServicesImpl();

		if (uuid == null) {
			servicesImpl.setUuid(StringPool.BLANK);
		}
		else {
			servicesImpl.setUuid(uuid);
		}

		servicesImpl.setServiceId(serviceId);

		if (name == null) {
			servicesImpl.setName(StringPool.BLANK);
		}
		else {
			servicesImpl.setName(name);
		}

		if (description == null) {
			servicesImpl.setDescription(StringPool.BLANK);
		}
		else {
			servicesImpl.setDescription(description);
		}

		if (price == null) {
			servicesImpl.setPrice(StringPool.BLANK);
		}
		else {
			servicesImpl.setPrice(price);
		}

		servicesImpl.setCompanyId(companyId);
		servicesImpl.setGroupId(groupId);
		servicesImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			servicesImpl.setCreateDate(null);
		}
		else {
			servicesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			servicesImpl.setModifiedDate(null);
		}
		else {
			servicesImpl.setModifiedDate(new Date(modifiedDate));
		}

		servicesImpl.resetOriginalValues();

		return servicesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();
		serviceId = objectInput.readLong();
		name = objectInput.readUTF();
		description = objectInput.readUTF();
		price = objectInput.readUTF();
		companyId = objectInput.readLong();
		groupId = objectInput.readLong();
		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(serviceId);

		if (name == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}

		if (price == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(price);
		}

		objectOutput.writeLong(companyId);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long serviceId;
	public String name;
	public String description;
	public String price;
	public long companyId;
	public long groupId;
	public long userId;
	public long createDate;
	public long modifiedDate;
}