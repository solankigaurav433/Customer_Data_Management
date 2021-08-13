create table AA_Customer (
	uuid_ VARCHAR(75) null,
	customerId LONG not null primary key,
	name VARCHAR(75) null,
	email VARCHAR(75) null,
	address VARCHAR(75) null,
	phone VARCHAR(75) null,
	passportNo VARCHAR(75) null,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null,
	serviceId LONG
);

create table AA_Service (
	uuid_ VARCHAR(75) null,
	serviceId LONG not null primary key,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	price VARCHAR(75) null,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);

create table AA_Services (
	uuid_ VARCHAR(75) null,
	serviceId LONG not null primary key,
	name VARCHAR(75) null,
	description VARCHAR(75) null,
	price VARCHAR(75) null,
	companyId LONG,
	groupId LONG,
	userId LONG,
	createDate DATE null,
	modifiedDate DATE null
);