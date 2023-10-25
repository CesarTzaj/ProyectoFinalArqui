-- MariaDB dump 10.19  Distrib 10.4.28-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: sistema_de_riego
-- ------------------------------------------------------
-- Server version	10.4.28-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `horario_riego`
--

DROP TABLE IF EXISTS `horario_riego`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `horario_riego` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_horario` time NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horario_riego`
--

LOCK TABLES `horario_riego` WRITE;
/*!40000 ALTER TABLE `horario_riego` DISABLE KEYS */;
INSERT INTO `horario_riego` VALUES (1,'10:25:00'),(3,'14:35:00'),(4,'14:36:00'),(5,'14:37:00'),(6,'14:37:00'),(7,'14:37:00');
/*!40000 ALTER TABLE `horario_riego` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `horario_valvula`
--

DROP TABLE IF EXISTS `horario_valvula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `horario_valvula` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_valvula` int(11) DEFAULT NULL,
  `id_horario` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_horario` (`id_horario`),
  KEY `fl_valvula` (`id_valvula`),
  CONSTRAINT `fk_horario` FOREIGN KEY (`id_horario`) REFERENCES `horario_riego` (`id`),
  CONSTRAINT `fl_valvula` FOREIGN KEY (`id_valvula`) REFERENCES `valvula` (`ID_VALVULA`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `horario_valvula`
--

LOCK TABLES `horario_valvula` WRITE;
/*!40000 ALTER TABLE `horario_valvula` DISABLE KEYS */;
INSERT INTO `horario_valvula` VALUES (1,1,1);
/*!40000 ALTER TABLE `horario_valvula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registro`
--

DROP TABLE IF EXISTS `registro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registro` (
  `id_registro` int(11) NOT NULL AUTO_INCREMENT,
  `id_sesor` int(11) DEFAULT NULL,
  `fecha_registro` datetime NOT NULL,
  `id_valvula` int(11) DEFAULT NULL,
  `valvula_estado` tinyint(4) DEFAULT NULL,
  `id_ubicacion` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_registro`),
  KEY `fk_registro_sensor` (`id_sesor`),
  KEY `fk_registro_valvula` (`id_valvula`),
  KEY `fk_registro_ubicacion` (`id_ubicacion`),
  CONSTRAINT `fk_registro_sensor` FOREIGN KEY (`id_sesor`) REFERENCES `sensor` (`ID_SENSOR`),
  CONSTRAINT `fk_registro_ubicacion` FOREIGN KEY (`id_ubicacion`) REFERENCES `ubicacion` (`id_ubicacion`),
  CONSTRAINT `fk_registro_valvula` FOREIGN KEY (`id_valvula`) REFERENCES `valvula` (`ID_VALVULA`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registro`
--

LOCK TABLES `registro` WRITE;
/*!40000 ALTER TABLE `registro` DISABLE KEYS */;
INSERT INTO `registro` VALUES (1,1,'2023-02-20 00:00:00',1,1,1),(2,1,'2023-02-21 00:00:00',2,0,2),(3,1,'2023-02-22 00:00:00',2,1,1),(4,1,'2023-02-23 00:00:00',1,1,1),(5,1,'2023-02-23 00:00:00',1,1,1),(6,1,'2023-02-23 12:12:45',1,1,1),(8,1,'2023-10-15 13:40:21',1,1,1),(9,1,'2023-10-15 13:41:01',1,1,1),(10,2,'2023-10-15 13:41:09',1,1,1);
/*!40000 ALTER TABLE `registro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sensor`
--

DROP TABLE IF EXISTS `sensor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sensor` (
  `ID_SENSOR` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_SENSOR`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sensor`
--

LOCK TABLES `sensor` WRITE;
/*!40000 ALTER TABLE `sensor` DISABLE KEYS */;
INSERT INTO `sensor` VALUES (1,'sensor1'),(2,'sensor2');
/*!40000 ALTER TABLE `sensor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ubicacion`
--

DROP TABLE IF EXISTS `ubicacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ubicacion` (
  `id_ubicacion` int(11) NOT NULL AUTO_INCREMENT,
  `lugar` varchar(100) NOT NULL,
  PRIMARY KEY (`id_ubicacion`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ubicacion`
--

LOCK TABLES `ubicacion` WRITE;
/*!40000 ALTER TABLE `ubicacion` DISABLE KEYS */;
INSERT INTO `ubicacion` VALUES (1,'hueto1'),(2,'hueto 2');
/*!40000 ALTER TABLE `ubicacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `valvula`
--

DROP TABLE IF EXISTS `valvula`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `valvula` (
  `ID_VALVULA` int(11) NOT NULL AUTO_INCREMENT,
  `NOMBRE` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID_VALVULA`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `valvula`
--

LOCK TABLES `valvula` WRITE;
/*!40000 ALTER TABLE `valvula` DISABLE KEYS */;
INSERT INTO `valvula` VALUES (1,'Valvula 1'),(2,'Valvula 2');
/*!40000 ALTER TABLE `valvula` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-15 16:35:12
