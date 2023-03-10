create database baitap1;
create table class(
id int,
`name` varchar(225)
);
create table teacher(
id int,
`name` varchar(225),
age int,
country varchar(225)
);
select* from class;
insert into Class(id,name)
value(1,'Tan');
insert into Class(id,name)
value(2,'Nhi');

select* from teacher;
insert into teacher(id,name,age,country)
value(1,'Khoa',18,'Da Nang');
insert into Class(id,name)
value(2,'Tuan',21,'Quang Nam');
drop table class;
drop table teacher;