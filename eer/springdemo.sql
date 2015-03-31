-- --------------------------------------------------------
-- Host                          :127.0.0.1
-- Server version                :5.5.20-log - MySQL Community Server (GPL)
-- Server OS                     :Win64
-- HeidiSQL Version              :7.0.0.4278
-- Created                       :2013-01-12 22:24:47
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping structure for table test.employee
CREATE TABLE IF NOT EXISTS `employee` (
  `empID` int(11) NOT NULL AUTO_INCREMENT,
  `empName` varchar(50) DEFAULT NULL,
  `empTel` varchar(10) DEFAULT NULL,
  `salary` float DEFAULT NULL,
  PRIMARY KEY (`empID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

-- Dumping data for table test.employee: ~0 rows (approximately)
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`empID`, `empName`, `empTel`, `salary`) VALUES
	(1, 'Kanishka Dilshan', '0777123123', 1000),
	(2, 'Sajith Athukorala', '0777345678', 2000),
	(3, 'Ishan Primal', '07123588', 1500);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;


-- Dumping structure for table test.employee_has_project
CREATE TABLE IF NOT EXISTS `employee_has_project` (
  `Employee_empID` int(11) NOT NULL,
  `Project_projID` int(11) NOT NULL,
  PRIMARY KEY (`Employee_empID`,`Project_projID`),
  KEY `fk_Employee_has_Project_Project1` (`Project_projID`),
  KEY `fk_Employee_has_Project_Employee` (`Employee_empID`),
  CONSTRAINT `fk_Employee_has_Project_Employee` FOREIGN KEY (`Employee_empID`) REFERENCES `employee` (`empID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Employee_has_Project_Project1` FOREIGN KEY (`Project_projID`) REFERENCES `project` (`projID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table test.employee_has_project: ~0 rows (approximately)
/*!40000 ALTER TABLE `employee_has_project` DISABLE KEYS */;
INSERT INTO `employee_has_project` (`Employee_empID`, `Project_projID`) VALUES
	(1, 1),
	(3, 1),
	(1, 2),
	(2, 2);
/*!40000 ALTER TABLE `employee_has_project` ENABLE KEYS */;


-- Dumping structure for table test.project
CREATE TABLE IF NOT EXISTS `project` (
  `projID` int(11) NOT NULL AUTO_INCREMENT,
  `projName` varchar(50) DEFAULT NULL,
  `projCode` varchar(10) DEFAULT NULL,
  `projDuration` int(11) DEFAULT NULL,
  PRIMARY KEY (`projID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Dumping data for table test.project: ~0 rows (approximately)
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` (`projID`, `projName`, `projCode`, `projDuration`) VALUES
	(1, 'Proj1', 'PD001', 5),
	(2, 'Proj2', 'PD452', 12);
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
