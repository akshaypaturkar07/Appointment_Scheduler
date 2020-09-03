CREATE TABLE `slots`
(
    `slotID`          int NOT NULL AUTO_INCREMENT,
    `doctorID`        int          DEFAULT NULL,
    `slotStartTime`   time         DEFAULT NULL,
    `slotEndTime`     time         DEFAULT NULL,
    `slotdescription` varchar(200) DEFAULT NULL,
    PRIMARY KEY (`slotID`),
    KEY `slotID` (`slotID`),
    CONSTRAINT `slots_ibfk_1` FOREIGN KEY (`doctorID`) REFERENCES `doctor` (`doctorID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;