create database Bai3_3;
create table customer(
cID int not null primary key,
cName varchar(400) ,
cAge int not null
);
create table `order`(
oId int not null primary key,
cID int not null,
oDate varchar(500),
oTotalPrice int,
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
select oId, odate, ototalprice from `order`;
select * from customer
inner join `order` on customer.cid=`order`.cid;
select * from product 
inner  join Odertail on product.pID=Odertail.pid inner join `order` on odertail.oId=`order`.oId;
select * from customer
 inner join `order`on count(`order`.cId) 
group by cid 
having count(`order`.cId)=0;

