create database bai3_1;
create table class
(
ClassID int not null auto_increment primary key,
ClassName varchar(60) not null,
StartDate datetime not null,
`status` Bit
);
create table student
(
StudentId int not null auto_increment primary key,
StudentName varchar(50),
address varchar(50),
phone varchar(20),
`Status` bit,
classId int not null,
foreign key (classID) references class (ClassID)
);
create table `subject`(
subId int not null auto_increment primary key,
SubName varchar(30) not null,
credit tinyint not null default 1 check ( credit >=1),
status Bit default 1
);
create table Mark
(
MarkId int not null auto_increment primary key,
SubId int not null,
StudentId int not null,
Mark float default 0 check(Mark between 0 and 100),
ExamTimes tinyint default 1,
unique(SubId, StudentId),
foreign key (SubId) references `Subject` (SubId),
foreign key (StudentId) references Student (StudentId)
);
INSERT INTO Class
VALUES (1, 'A1', '2008-12-20', 1);
INSERT INTO Class
VALUES (2, 'A2', '2008-12-22', 1);
INSERT INTO Class
VALUES (3, 'B3', current_date, 0);
INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Hung', 'Ha Noi', '0912113113', 1, 1);
INSERT INTO Student (StudentName, Address, Status, ClassId)
VALUES ('Hoa', 'Hai phong', 1, 1);
INSERT INTO Student (StudentName, Address, Phone, Status, ClassId)
VALUES ('Manh', 'HCM', '0123123123', 0, 2);
INSERT INTO Subject
VALUES (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
INSERT INTO Mark (SubId, StudentId, Mark, ExamTimes)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
	select StudentId,Studentname from student
    where Studentname like "H%";
select classid, classname,startdate from class
where month(StartDate) = 12;
select subId,Subname,credit from subject
where credit between 3 and 5;
update student 
set classid=5 where studentname="Hung";
select StudentName, subject.SubName, mark.Mark from student
inner join mark on student.StudentId= mark.StudentId inner join subject on mark.SubId=subject.SubId
order by Mark desc, StudentName ;
