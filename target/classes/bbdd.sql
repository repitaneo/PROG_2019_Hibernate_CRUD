CREATE DATABASE  IF NOT EXISTS `hibernate` ;
USE `hibernate`;
SET NAMES utf8 ;


DROP TABLE IF EXISTS `alumnado`;

SET character_set_client = utf8mb4 ;
CREATE TABLE `alumnado` (
  `idalumnado` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) DEFAULT NULL,
  `telefono` varchar(45) DEFAULT NULL,
  `localidad` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idalumnado`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


--
-- Dumping data for table `alumnado`
--

LOCK TABLES `alumnado` WRITE;
INSERT INTO `alumnado` VALUES 
(1,'Marcos','44444','Oviedo'),
(2,'Maria','55555','Gijon'),
(3,'Carlos','66666','Avilés'),
(4,'Lucas','4334','Mieres');

UNLOCK TABLES;
