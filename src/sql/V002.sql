CREATE TABLE `doctor`
(
    `doctorID`        int NOT NULL AUTO_INCREMENT,
    `doctorName`      varchar(100) DEFAULT NOT NULL,
    `addressID`       int          DEFAULT NULL,
    `contact`         varchar(10)  DEFAULT NULL,
    `qualification`   varchar(100) DEFAULT NULL,
    `contactduration` varchar(200) DEFAULT NULL,
    PRIMARY KEY (`doctorID`),
    KEY `addressID` (`addressID`),
    CONSTRAINT `doctor_ibfk_1` FOREIGN KEY (`addressID`) REFERENCES `address` (`addressID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

insert into doctor
values (5001, 'M Ramaswami', 1001, '9922876798', 'MS Oncology', '10.00 AM - 07:00 PM');


insert into doctor
values (5002, 'R maheshwari', 1002, '7896874556', 'MS Cardio', '12.00 PM - 05:00 PM');


insert into doctor
values (5003, 'Steven Wein', 1003, '8765987645', 'MS Numerology', '1.00 PM - 04:00 PM');



