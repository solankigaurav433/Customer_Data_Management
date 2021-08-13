create index IX_8489E647 on AA_Customer (groupId);
create index IX_DBA25E91 on AA_Customer (uuid_);
create index IX_5EEF90F7 on AA_Customer (uuid_, companyId);
create unique index IX_1245E939 on AA_Customer (uuid_, groupId);

create index IX_1AF07C6E on AA_Service (groupId);
create index IX_7365278 on AA_Service (uuid_);
create index IX_DAC1F6B0 on AA_Service (uuid_, companyId);
create unique index IX_60B86932 on AA_Service (uuid_, groupId);

create index IX_A26F05C7 on AA_Services (groupId);
create index IX_47495E11 on AA_Services (uuid_);
create index IX_1C15E177 on AA_Services (uuid_, companyId);
create unique index IX_ADC659B9 on AA_Services (uuid_, groupId);