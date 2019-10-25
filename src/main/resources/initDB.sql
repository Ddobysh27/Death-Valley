DROP DATABASE `userbank`;

CREATE DATABASE `userbank`;
USE `userbank`;
SET GLOBAL time_zone = '+3:00';

DROP TABLE IF EXISTS Account;
CREATE TABLE `account` (
  `accountId` int(11) NOT NULL AUTO_INCREMENT,
  `account` int(11) DEFAULT NULL,
  `userId` int(11) NOT NULL,
  PRIMARY KEY (`accountId`, `userId`)
) ;

LOCK TABLES Account WRITE;
INSERT INTO Account VALUES (1,100,1),(2,200,2),(3,300,3),(4,500,4),(5,500,5),
							 (6,666,6),(7,7000,9),(8,800,10),(9,900,7),(10,1000,8);
UNLOCK TABLES;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `surName` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`userId`)
);

LOCK TABLES `user` WRITE;
INSERT INTO `user` VALUES (1,'John','Snow'),(2,'Arya','Stark'),(3,'Jaime','Lannister'),(4,'Sansa','Stark'),
						  (5,'Daenerys','Targaryen'),(6,'Cersei ','Lannister'),(7,'Tyrio','Lannister'),(8,'Tywin','Lannister'),
                          (9,'Robb','Stark'),(10,'Joffrey','Baratheon');
UNLOCK TABLES;