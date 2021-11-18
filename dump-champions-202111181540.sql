-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: localhost    Database: champions
-- ------------------------------------------------------
-- Server version	5.7.34

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
-- Table structure for table `competition`
--

DROP TABLE IF EXISTS `competition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `competition` (
  `id` varchar(255) NOT NULL,
  `confederation` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `rating` double DEFAULT NULL,
  `type_team` int(11) DEFAULT NULL,
  `colour` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `competition`
--

LOCK TABLES `competition` WRITE;
/*!40000 ALTER TABLE `competition` DISABLE KEYS */;
INSERT INTO `competition` VALUES ('CPA','CONMEBOL','1p5gBQsB-9w9d2UO_80TGcjbdrbKD986M','COPA AMERICA',3,1,'#000000'),('CPAS','AFC','1yI07dXtg41yzpG5zNvsY0jXGfOhZggSr','COPA ASIATICA',3,1,'#000000'),('LCOL','CONMEBOL','1t4gYuvC1OtonXSx3jVyeuURo1yhaDjX_','LIGA COLOMBIANA',3,2,'#000000'),('UCL','UEFA','1_CDHh9Ved2sdF0dr0WYK6Whme-VFHkGO','UEFA CHAMPIONS LEAGUE',3,2,'#000000');
/*!40000 ALTER TABLE `competition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `history`
--

DROP TABLE IF EXISTS `history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `history` (
  `id` varchar(255) NOT NULL,
  `id_competition` varchar(255) DEFAULT NULL,
  `id_team1` varchar(255) DEFAULT NULL,
  `id_team2` varchar(255) DEFAULT NULL,
  `id_team3` varchar(255) DEFAULT NULL,
  `id_team4` varchar(255) DEFAULT NULL,
  `id_tournament` varchar(255) DEFAULT NULL,
  `version` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `history`
--

LOCK TABLES `history` WRITE;
/*!40000 ALTER TABLE `history` DISABLE KEYS */;
INSERT INTO `history` VALUES ('CPA--1','CPA','BRASIL','BOLIVIA','ARGENTINA','CHILE','',1),('CPA--2','CPA','BOL','BRA','CHI','ARG','',2),('CPA--3','CPA','ARG','BRA','CHI','BOL','',3),('CPA--4','CPA','CHI','BRA','BOL','ARG','',4),('CPA--5','CPA','BRA','ARG','BOL','CHI','',5),('CPA--6','CPA','BRA','ARG','CHI','BOL','',6),('CPA--7','CPA','BRA','CHI','ARG','BOL','',7),('CPAS--1','CPAS','EUA','SA','','','',1),('LCOL--1','LCOL','MED','STF','','','',1),('UCL--1','UCL','BMO','BYL','','','',1);
/*!40000 ALTER TABLE `history` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `team`
--

DROP TABLE IF EXISTS `team`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `team` (
  `id` varchar(255) NOT NULL,
  `confederation` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `rating` double DEFAULT NULL,
  `type_team` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `team`
--

LOCK TABLES `team` WRITE;
/*!40000 ALTER TABLE `team` DISABLE KEYS */;
INSERT INTO `team` VALUES ('ALE','UEFA','','10pVVyc8ezukwF4L1nGd93DNefA1Yt_jP','ALEMANIA',3,1),('ARG','CONMEBOL','','1K9PbZ4G74Ht8Ben7HZswl5lDD-PcRp3T','ARGENTINA',3,1),('BMO','UEFA','ALE','13yfEZ2U5mjuHSPdVJ4cTR0anWQa2JpQu','BORUSSIA MONCHENGLADBACH',3,2),('BOL','CONMEBOL','ARG','1wI6Z5kmZlIwTh-S5p1aaFx24cM453FCa','BOLIVIA',3,1),('BRA','CONMEBOL','ARG','1G85eTN5er-mNC8zBWkBRXMXyp3lgo-00','BRASIL',3,1),('BYL','UEFA','ALE','1w0PZe2qvNIW0BFh0QYobwk03uR7ZfBhn','BAYER LEVERKUSEN',3,2),('CHI','CONMEBOL','ARG','1UKemCkvPsvgixx6zbW0YaEqMGJ5cTGKn','CHILE',3,1),('COL','CONMEBOL','ARG','1hQ-0ALV3B9pfkZJRq2Wsp-9NtEBhS7RY','COLOMBIA',3,1),('EUA','AFC','ARG','13Y0dbB3Zn3MOGZBCObrthqZ86UyNxeN9','EMIRATOS ARABES UNIDOS',3,1),('MED','CONMEBOL','COL','1bjXPDUvdIyKJYSJRCYzhi2Uz5wDCJyiw','INDEPENDIENTE MEDELLIN',3,2),('SA','AFC','EUA','1GavMwWk4fXZN0OLNHBpJ3uuunN10rHvg','ARABIA SAUDITA',3,1),('STF','CONMEBOL','COL','1Mi8tiCleq5ylnPQJlZWP7wIjdCGtkui6','INDEPENDIENTE SANTAFE',3,2);
/*!40000 ALTER TABLE `team` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'champions'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-18 15:40:10
