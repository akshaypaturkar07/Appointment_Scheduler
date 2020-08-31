create database doctor_appointment;
use doctor_appointment;
CREATE TABLE `address` (
   `addressID` int NOT NULL AUTO_INCREMENT,
   `addressLine1` varchar(500) DEFAULT NOT NULL,
   `addressLine2` varchar(500) DEFAULT NULL,
   `city` varchar(100) DEFAULT NOT NULL,
   `state` varchar(100) DEFAULT NOT NULL,
   `country` varchar(100) DEFAULT NOT NULL,
   `pin` mediumtext,
   PRIMARY KEY (`addressID`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

insert into address values(1001,'Near ikea','sevent street','hyderabad','telangana','india','500049');
insert into address values(1002,'Near max','marathalli','Bangalore','Karnataka','india','600049');
insert into address values(1003,'Near fashion street','Viman Nagar','Pune','Maharashtra','india','444621');

