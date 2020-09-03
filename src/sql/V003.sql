CREATE TABLE `user`
(
    `userID`          int NOT NULL AUTO_INCREMENT,
    `userName`        varchar(100) DEFAULT NOT NULL,
    `email`           int          DEFAULT NULL,
    `phonenumber`     varchar(10)  DEFAULT NULL,
    `appointmentdate` datetime     DEFAULT NULL,
    PRIMARY KEY (`userID`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;