CREATE TABLE Admin (
 username       varchar(25)      Not Null,
 pasword        varchar(25)     Not Null   Unique,
 phone_num      varchar(25)     NOT NULL,
 PRIMARY KEY (username));

CREATE TABLE Customer(
CID            INT               NOT NULL,
FName          VARCHAR(15)       NOT NULL,
LName          VARCHAR(15)       NOT NULL,
Phonenumber    CHAR(9)               NOT NULL,
PRIMARY KEY(CID));

CREATE TABLE Supplier
(Sid         INT             NOT NULL,
 Fname       VARCHAR(10)     NOT NULL,
 Lname       VARCHAR(10)     NOT NULL,
 City        VARCHAR(10)     NOT NULL,
 Street      VARCHAR(10)     NOT NULL,
 Phone_num   VARCHAR(10),
 PRIMARY KEY(Sid));

CREATE TABLE Branch
(Id          INT             NOT NULL,
 Name        VARCHAR(20)     NOT NULL,
 City        VARCHAR(10)     NOT NULL,
 Street      VARCHAR(10)     NOT NULL,
 Phone_num   VARCHAR(15)             ,
  Mid            char(9),
 PRIMARY KEY(Id)
 );
 

CREATE TABLE INSURANCE
(Id                            INT              NOT NULL,
 Insurance_company_name        VARCHAR(20)      NOT NULL,
 Insurance_period              VARCHAR(15),
 The_acctivation_date          VARCHAR(20),
 Company_phone_num             VARCHAR(15), 
 PRIMARY KEY(Id));
 
 CREATE TABLE Employee(
SSN            CHAR(9)           NOT NULL,
FName          VARCHAR(10)       NOT NULL,
Minit          VARCHAR(10),
Lname          VARCHAR(10)       NOT NULL,
City           VARCHAR(15)       NOT NULL,
Street         VARCHAR(15)       NOT NULL,
Sex            CHAR,
Salary         FLOAT             NOT NULL,
JoPtype       VARCHAR(30)       NOT NULL,
Hour           INT,
FID             INT              NOT NULL,
IID             INT              NOT NULL,
PRIMARY KEY(SSN),
FOREIGN KEY(FID)REFERENCES GALLERY(ID),
FOREIGN KEY(IID)REFERENCES Insurance(ID));
CREATE TABLE Admin (
 username       varchar(25)      Not Null,
 pasword        varchar(25)     Not Null   Unique,
 phone_num      varchar(25)     NOT NULL,
 PRIMARY KEY (username));

CREATE TABLE Product(

PID             INT               NOT NULL,
Name            VARCHAR(60)       NOT NULL,
Price           FLOAT             NOT NULL,
FID             INT               NOT NULL,
IID             INT               NOT NULL,
quntity         INT                       ,
SID             INT,
PRIMARY KEY(PID),
FOREIGN KEY(FID)REFERENCES Gallery(ID),
FOREIGN KEY(IID)REFERENCES Insurance(ID),
FOREIGN KEY(SID)REFERENCES Supplier(Sid));

CREATE TABLE Sales
(CID            INT       NOT NULL,
 PID            INT       NOT NULL,
 Discount       FLOAT,
 Total_price    FLOAT,
 PRIMARY KEY(CID,PID),
 FOREIGN KEY(CID) REFERENCES CUSTOMER(CID),
 FOREIGN KEY(PID) REFERENCES PRODUCT(PID));

insert into Customer values(1,'Ahamd','Ajaj','059768432');
insert into Customer values(2,'Ali','Falah','059765982');
insert into Customer values(3,'Islam','Hawash','059709843');
insert into Customer values(4,'Jamal','Dweikat','059576930');
insert into Customer values(5,'Sami','Assi','059007333');

insert into SUPPLIER values(1,'Ahmad','Ali','Istanbul','Taksim','+902123456');
insert into SUPPLIER values(2,'Othman','Hamed','Istanbul','Taksim','+902127685');
insert into SUPPLIER values(3,'Omar','Khaled','Istanbul','Istiklal','+902126453');
insert into SUPPLIER values(4,'Ali','Othman','Istanbul','Istiklal','+902123499');
insert into SUPPLIER values(5,'Jamal','Hazem','Istanbul','Sultan','+902120956');
insert into SUPPLIER values(6,'Mojahed','Ghanem','Istanbul','Istiklal','+902123954');
insert into SUPPLIER values(7,'Jamal','Ali','Istanbul','Sultan','+902120765');



insert into INSURANCE values(1,'AL_Hayah','6 mounth','2021/01/01','2376854');
insert into INSURANCE values(2,'AL_Hayah','6 mounth','2021/01/01','2376854');

insert into Branch values(1,'Mobilium','Nablus','Haifa','0599059234');

insert into PRODUCT values(1,'Applique Table',500.500,1,2,3,1);
insert into PRODUCT values(2,'Childrens Bedroom',12000.0,1,2,2,2);
insert into PRODUCT values(3,'Bedroom',15000.0,1,2,2,3);
insert into PRODUCT values(4,'Sofa set',5000.0,1,2,3,4);
insert into PRODUCT values(5,'Baby Cot',1200.0,1,2,2,5);
insert into PRODUCT values(6,'Velvet Sofa set',7000.0,1,2,3,6);
insert into PRODUCT values(7,'Closet',1000.300,1,2,2,7);

insert into sales values(1,1,0.0,500.500);
insert into sales values(2,3,0.3,10500);
insert into sales values(3,7,0.2,1040.0);
insert into sales values(4,2,0.0,12000.0);
insert into sales values(5,6,0.0,7000.0);

insert into Employee values('404236789','Alaa','Rami','Sweseh','Nablus','Hefa','F',3500.0,'accountent',8,1,1);
insert into Employee values('407224576','Mosaab','Imad','Zaglol','Nablus','Ibn_Roshod','M',3000.0,'Sale-represantative',8,1,1);
insert into Employee values('405894511','Mosleh','Imad','Zaglol','Nablus','Ibn_Roshod','M',3000.0,' Sale_represantative',8,1,1);
insert into Employee values('403698547','Yosef','Naser','Sheleh','Nablus','KHaletAL-Eman','M',2800.0,'Sale_represantative',8,1,1);
insert into Employee values('407242297','Mohamad','Ameed','Tofaha','Nablus','Abu_Buker','M',2300.0,'clean_worker',8,1,1);
insert into Employee values('406325410','Adel','Rami','Habebah','Nablus','Aseera','M',2300.0,'clean_worker',8,1,1);
insert into Employee values('402548796','Omar','Samer','Sakhleh','Nablus','ALarsad','M',3200.0,'merchandise_worker',8,1,1);
insert into Employee values('406325416','Othman','Rami','Yaeish','Nablus','Rafedia','M',2800.0,'Sale_represantative',8,1,1);
insert into Employee values('402548777','Ali','Samer','Swalim','Nablus','Zawata','M',3000.0,'Sale_represantative',8,1,1);

insert into admin VALUES('Alaa','12345','0599659218');
insert into admin VALUES('ahmad','2468','0592330251');