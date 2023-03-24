create database demo;
create table product(
id int not null,
productcode varchar(50),
productname varchar(50),
productprice int ,
productamount int,
productdecription varchar(100),
productstatus varchar(10)
);
create unique index masanpham2 on product (productcode);
create index ten_gia on product(productname,productprice);
explain select * from product
where productcode="1";
create view sanpham as
select productCode, productName, productPrice, productStatus 
from product;
select * from sanpham ;
update sanpham
set productName="dien thoai"
where productCode="4";
drop view sanpham;

delimiter $$
create procedure lay_thong_tin()
begin 
select * from product;
end $$
delimiter ;
call lay_thong_tin();

delimiter $$ 
create procedure them()
begin
INSERT INTO `demo`.`product` (`id`, `productcode`, `productname`, `productprice`, `productamount`, `productdecription`, `productstatus`) VALUES ('5', '5', 'may bat', '500', '2', 'bad', '1');
end $$
delimiter $$;
call them();
delimiter $$
create procedure sua_thong_tin(in a int)
begin 
update product
set productname="keo sieu cap"
where productcode=a;
end $$
delimiter ;
call sua_thong_tin(1);
delimiter $$
create procedure xoa(in a int)
begin 
delete from product
where productcode=a;
end $$
delimiter ;
call xoa(1);