create database Bai2;
create table customer(
cID int not null primary key,
cName varchar(400) ,
cAge int not null
);
create table `order`(
oId int not null primary key,
cID int not null,
oDate varchar(500),
oTotalPrice int not null,
foreign key (cId) references customer (cID)
);
create table product(
pID int not null primary key,
pName varchar(500),
pPrice int not null
);
create table Odertail(
oId int not null,
pId int not null,
odQTY varchar(5000),
unique (oId,pId),
foreign key (oId) references `order` (oId),
foreign key (pId) references product ( pId) 
);