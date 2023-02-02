CREATE DATABASE  IF NOT EXISTS `modalibre` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `modalibre`;
-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: modalibre
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cuenta_cliente`
--

DROP TABLE IF EXISTS `cuenta_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cuenta_cliente` (
  `idCuenta_Cliente` int NOT NULL AUTO_INCREMENT,
  `Nick` varchar(30) NOT NULL,
  `Correo` varchar(30) NOT NULL,
  `Contraseña` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`idCuenta_Cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuenta_cliente`
--

LOCK TABLES `cuenta_cliente` WRITE;
/*!40000 ALTER TABLE `cuenta_cliente` DISABLE KEYS */;
INSERT INTO `cuenta_cliente` VALUES (3,'alex','alex@gmail.com','123'),(8,'elvis','elvis123@gmail.com','1234'),(10,'alexander','alex123@gmail.com','contra'),(11,'prueba1','prueba1@gmail.com','123'),(12,'Mayra','mayra123@gmail.com','1020'),(16,'nos09','nos12@hotmail.com','12'),(18,'porraslq','por65@hotmail.com','seguir1'),(20,'Casemiro0L','remi@gmail.com','567'),(21,'Liviana','liv@gmail.com','maria1'),(22,'maria123','maria@gmail.com','1234');
/*!40000 ALTER TABLE `cuenta_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuenta_trabajadores`
--

DROP TABLE IF EXISTS `cuenta_trabajadores`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cuenta_trabajadores` (
  `idCuenta_trabajadores` int NOT NULL AUTO_INCREMENT,
  `Nick` varchar(30) NOT NULL,
  `Correo` varchar(30) NOT NULL,
  `Contraseña` varchar(30) NOT NULL,
  PRIMARY KEY (`idCuenta_trabajadores`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuenta_trabajadores`
--

LOCK TABLES `cuenta_trabajadores` WRITE;
/*!40000 ALTER TABLE `cuenta_trabajadores` DISABLE KEYS */;
INSERT INTO `cuenta_trabajadores` VALUES (1,'Omar12','omar@modalibre.com','hola'),(2,'Juan5','juan@modalibre.com','123');
/*!40000 ALTER TABLE `cuenta_trabajadores` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalles_cliente`
--

DROP TABLE IF EXISTS `detalles_cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalles_cliente` (
  `idDetalles_cliente` int NOT NULL AUTO_INCREMENT,
  `Nombres` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `Apellidos` varchar(30) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `Documento` varchar(20) DEFAULT NULL,
  `Telefono` char(9) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  `Direccion` varchar(60) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci DEFAULT NULL,
  PRIMARY KEY (`idDetalles_cliente`),
  CONSTRAINT `fk_Detalles_CLiente_Cuenta_Cliente1` FOREIGN KEY (`idDetalles_cliente`) REFERENCES `cuenta_cliente` (`idCuenta_Cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalles_cliente`
--

LOCK TABLES `detalles_cliente` WRITE;
/*!40000 ALTER TABLE `detalles_cliente` DISABLE KEYS */;
INSERT INTO `detalles_cliente` VALUES (3,'Alexander','Porro','35345345','345435535','Av. Las lunas 516 '),(8,NULL,NULL,NULL,NULL,NULL),(10,NULL,NULL,NULL,NULL,NULL),(11,NULL,NULL,NULL,NULL,NULL),(12,'mayra','rojas','75656565','981231362','Av. munila 100 01'),(16,NULL,NULL,NULL,NULL,NULL),(18,'Alvarado','Porras','21332113','312313121','Jr. arcos 12 12'),(20,'Casemiro','Lujo','543543534543','967765575','Jr. Barranca 1200 '),(21,'Liviana','Marquez','75456546','982383243','Jr. apurimac 16 '),(22,'Maria','Justo','72323232','983243242','Jr. Junin 12 1');
/*!40000 ALTER TABLE `detalles_cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalles_compra`
--

DROP TABLE IF EXISTS `detalles_compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalles_compra` (
  `idDetalles_Compra` int NOT NULL AUTO_INCREMENT,
  `Tipo` varchar(45) NOT NULL,
  `Marca` varchar(45) NOT NULL,
  `Talla` varchar(30) NOT NULL,
  `Precio` decimal(20,2) NOT NULL,
  `Cantidad` int NOT NULL,
  PRIMARY KEY (`idDetalles_Compra`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalles_compra`
--

LOCK TABLES `detalles_compra` WRITE;
/*!40000 ALTER TABLE `detalles_compra` DISABLE KEYS */;
INSERT INTO `detalles_compra` VALUES (10,'Cardigan rojo','Dior','S',45.90,3),(11,'Vestido floreado','Zara','S',80.00,3),(13,'Vestido Verde','Republic','S',75.90,2),(14,'Vestido Blanco','Zara','S',80.00,11),(15,'Short Azul','Levis','S',40.00,3),(16,'Vestido floreado','Zara','L',80.00,1),(17,'Vestido Verde','Republic','M',75.90,1),(18,'Tacones Blancos','Prada','S',120.00,1),(19,'Short Azul','Levis','M',40.00,2),(20,'Tacones Blancos','Prada','S',120.00,2);
/*!40000 ALTER TABLE `detalles_compra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalles_trabajador`
--

DROP TABLE IF EXISTS `detalles_trabajador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalles_trabajador` (
  `idCuenta_trabajadores` int NOT NULL,
  `Cargo` varchar(30) NOT NULL,
  `Nombres` varchar(30) NOT NULL,
  `Apellidos` varchar(30) NOT NULL,
  `DNI` char(8) NOT NULL,
  `Telefono` char(9) NOT NULL,
  KEY `fk_Detalles_trabajador_Cuenta_trabajadores1_idx` (`idCuenta_trabajadores`),
  CONSTRAINT `fk_Detalles_trabajador_Cuenta_trabajadores1` FOREIGN KEY (`idCuenta_trabajadores`) REFERENCES `cuenta_trabajadores` (`idCuenta_trabajadores`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalles_trabajador`
--

LOCK TABLES `detalles_trabajador` WRITE;
/*!40000 ALTER TABLE `detalles_trabajador` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalles_trabajador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `productos`
--

DROP TABLE IF EXISTS `productos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `productos` (
  `idProductos` int NOT NULL AUTO_INCREMENT,
  `Tipo` varchar(30) NOT NULL,
  `Marca` varchar(30) NOT NULL,
  `Talla` varchar(30) NOT NULL,
  `Precio` decimal(20,2) NOT NULL,
  `Stock` int NOT NULL,
  PRIMARY KEY (`idProductos`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `productos`
--

LOCK TABLES `productos` WRITE;
/*!40000 ALTER TABLE `productos` DISABLE KEYS */;
INSERT INTO `productos` VALUES (1,'Vestido Blanco','Zara','S, M, L',80.00,13),(2,'Vestido Verde','Republic','S, M, L',75.90,6),(3,'Sombrero blanco','Beanie','',19.90,11),(4,'Short Azul','Levis','S, M, L',40.00,7),(5,'Cardigan rojo','Dior','S, M, L',45.90,10),(6,'Polo Negro','Nike','S, M, L',40.90,10),(7,'Vestido floreado','Zara','S, M, L',80.00,16),(8,'Tacones Blancos','Prada','',120.00,7);
/*!40000 ALTER TABLE `productos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `solicitud_compra`
--

DROP TABLE IF EXISTS `solicitud_compra`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `solicitud_compra` (
  `idSolicitud_Compra` int NOT NULL AUTO_INCREMENT,
  `idDetalles_Compra` int NOT NULL,
  `idCuenta_Cliente` int NOT NULL,
  `Total` decimal(20,2) NOT NULL,
  `Estado` varchar(30) NOT NULL,
  PRIMARY KEY (`idSolicitud_Compra`),
  KEY `fk_Solicitud_Compra_Detalles_Compra1_idx` (`idDetalles_Compra`),
  KEY `fk_Solicitud_Compra_Cuenta_Cliente1_idx` (`idCuenta_Cliente`),
  CONSTRAINT `fk_Solicitud_Compra_Cuenta_Cliente1` FOREIGN KEY (`idCuenta_Cliente`) REFERENCES `cuenta_cliente` (`idCuenta_Cliente`),
  CONSTRAINT `fk_Solicitud_Compra_Detalles_Compra1` FOREIGN KEY (`idDetalles_Compra`) REFERENCES `detalles_compra` (`idDetalles_Compra`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `solicitud_compra`
--

LOCK TABLES `solicitud_compra` WRITE;
/*!40000 ALTER TABLE `solicitud_compra` DISABLE KEYS */;
INSERT INTO `solicitud_compra` VALUES (9,10,8,137.70,'Pendiente'),(10,11,3,240.00,'Aprobado'),(12,13,18,151.80,'Pendiente'),(13,14,18,880.00,'Aprobado'),(14,15,16,120.00,'Pendiente'),(15,16,12,80.00,'Rechazado'),(16,17,3,75.90,'Rechazado'),(17,18,20,120.00,'Pendiente'),(18,19,21,80.00,'Pendiente'),(19,20,22,240.00,'Aprobado');
/*!40000 ALTER TABLE `solicitud_compra` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-02-02 11:42:53
