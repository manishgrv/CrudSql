# CRUD Operation

Use below script to create a table
CREATE TABLE `department` (
	`departmentId` INT(11) NOT NULL AUTO_INCREMENT,
	`departmentName` VARCHAR(50) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`departmentAddress` VARCHAR(50) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	`departmentCode` VARCHAR(50) NULL DEFAULT NULL COLLATE 'latin1_swedish_ci',
	PRIMARY KEY (`departmentId`) USING BTREE
)
COLLATE='latin1_swedish_ci'
ENGINE=InnoDB;
