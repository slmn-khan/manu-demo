create index IX_7C24E6A6 on DMSPOC_DmsPoc (VIN[$COLUMN_LENGTH:75$]);
create index IX_BC141850 on DMSPOC_DmsPoc (deleted, toShow);
create index IX_D3F9CC0B on DMSPOC_DmsPoc (regNo[$COLUMN_LENGTH:75$], VIN[$COLUMN_LENGTH:75$]);
create index IX_DBB98A99 on DMSPOC_DmsPoc (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_4725E35B on DMSPOC_DmsPoc (uuid_[$COLUMN_LENGTH:75$], groupId);