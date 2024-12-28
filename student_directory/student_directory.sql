CREATE DATABASE  IF NOT EXISTS `student_directory`;
USE `student_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `stud_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `mobile` VARCHAR(15) DEFAULT NULL,
  PRIMARY KEY (`stud_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `student` VALUES 
	(1,'Ishita','Bhat','ishita@gmail.com','8956237453'),
	(2,'Yuvraj','Singh','yuvraj@gmail.com','9452874365'),
	(3,'Avani','Gupta','avani@gmail.com','9658931245'),
	(4,'Aditya','Rai','aditya@gmail.com','8529865131'),
	(5,'Rudra','Tyagi','rudra@gmail.com','8763912482');
