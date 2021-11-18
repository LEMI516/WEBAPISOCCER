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
INSERT INTO `competition` VALUES ('CLA','CONMEBOL','1BXvkTi3DtX8-UEc_Lye-EVT2X64e4AGE','COPA LIBERTADORES',4.5,2,'#000000'),('CMD','MUNDIAL','1K_AHzjHP0PTaLJ8WwLP_zm-3CokRN2rk','COPA MUNDIAL',5,1,'#000000'),('CPA','CONMEBOL','1p5gBQsB-9w9d2UO_80TGcjbdrbKD986M','COPA AMERICA',4.5,1,'#000000'),('CPAS','UEFA','1yI07dXtg41yzpG5zNvsY0jXGfOhZggSr','EUROCOPA',4.8,1,'#000000'),('CSD','CONMEBOL','1OmmFnL3rFRunbyhFXn7HSlFuMFv_ftIm','COPA SUDAMERICANA',4,2,'#000000'),('LCOL','CONMEBOL','1t4gYuvC1OtonXSx3jVyeuURo1yhaDjX_','LIGA COLOMBIANA',3.5,2,'#000000'),('UCL','UEFA','1_CDHh9Ved2sdF0dr0WYK6Whme-VFHkGO','UEFA CHAMPIONS LEAGUE',4.8,2,'#000000'),('UEL','UEFA','1mHYnmXrhxWvnvt7Q-D3Ao-Oc-rNRQCc5','UEFA EUROPA LEAGUE',4.2,2,'#000000');
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
INSERT INTO `team` VALUES ('ADITL','CONMEBOL','CHI','1yaUCX89AIiZeDWNpqivByMDKlV3TxSwK','AUDAX ITALIANO',3,2),('AEK','UEFA','GRE','1EQCysRDxcb_DJ6k3e3YzVkW0GqPZ5QbU','AEK ATENAS',3.5,2),('AJAX','UEFA','PSB','1GqLYWS38PETOsfPbhceWLSTS6BgDKJbo','AJAX',3,2),('ALE','UEFA','','10pVVyc8ezukwF4L1nGd93DNefA1Yt_jP','ALEMANIA',3,1),('ALL','CONMEBOL','PER','1kQe9vL9zyM47xTg1GPF9pE1P8Ouw0gZO','ALIANZA LIMA',3,2),('ALP','CONMEBOL','COL','1kzNbJ4vvgRZulfM2r4tAosUj64YsQBSK','ALIANZA PETROLERA',3,2),('AMC','CONMEBOL','COL','1JjVvehLiPpmAd9F2AEiy6pK0SUjYj3-P','AMERICA CALI',3,2),('ANDL','UEFA','BELG','1AJn2_QzZ4umdYArUyLvvWqESLmsDkTAQ','ANDERLECHT',3,2),('ANTF','CONMEBOL','CHI','1NsjigWzjWjPcJqOCPHpDDHZgmoe5NxmO','ANTOFAGASTA',3,2),('ARG','CONMEBOL','','1K9PbZ4G74Ht8Ben7HZswl5lDD-PcRp3T','ARGENTINA',3,1),('ARGJN','CONMEBOL','ARG','1TYXyxyGw4cDjEO5G5joyFInwmqdW3PKv','ARGENTINOS JUNIORS',3,2),('ATAL','UEFA','ITA','1JuOp2xFoKRduNyzHSAZJ-OXnhq40L6cs','ATALANTA',3,2),('ATLB','UEFA','ESP','1H_CegeHybMvBQQDK8K88zQ5HXirhxL4z','ATLETICO BILBAO',3,2),('ATMD','UEFA','ESP','13abZSx5__vt4UiKSnfvec_VbxIcZNgjQ','ATLETICO MADRID',3,2),('ATMN','CONMEBOL','BRA','1O4cMlOYhyCqS1MYh8z3MDectEBPs4_gq','ATLETICO MINEIRO',3,2),('ATPN','CONMEBOL','BRA','1iyIZoya1NJ2gQeF1m_29OfV6RW1KmOxL','ATLETICO PARANAENSE',3,2),('AUST','UEFA',NULL,'1GZdCsG3R9LxqBRcSyEf4phWoZMvQhIjY','AUSTRIA',3,1),('AUSTL','AFC',NULL,'1TfacOqLglikd1A6-dBN7hZAPTzq3mQdV','AUSTRALIA',3,1),('BAR','UEFA','ESP','1bwM1BAvnvaP8K9uwWogJIeWkiwDLtbDY','BARCELONA FC',3,2),('BCJ','CONMEBOL','ARG','1vE1uFQNha8uHMB6bhGjzLWg0-geM1v4u','BOCA JUNIORS',3,2),('BCM','CONMEBOL','COL','1EuzOFOERRuWbM34BXsmUeL2kk2scqVDD','BUCARAMANGA',3,2),('BDM','UEFA','ALE','1T7QhH846E4YZt-lAegAhV6EJ5wz30YjB','BORUSSIA DORTMUND',3,2),('BDX','UEFA','FRA','1pova19C_iNDWt1s3jfTdSvqY_AoEA7yt','BORDEAUX',3,2),('BELG','UEFA',NULL,'1CRqIJgxOB-y0lR3Y5u30UpjJ07oplDhB','BELGICA',3,1),('BENF','UEFA','PORT','1a8BfT4yOxt1B1s8qGYv5UUdY275K06XR','BENFICA',3,2),('BHZ','UEFA','','1GZUrlsK7MuntDZ7NCDkzV2q4zjgDA0iy','BOSNIA HERZEGOVINA',3,1),('BKF','CAF',NULL,'1o1jQflWpNnT8MlDuJkCjNJXUrNjXlMUR','BURKINA FASO',3,1),('BLV','CONMEBOL','BOL','1jVok5E8f88uiJXwgsLJYIFLw97witZ9q','BOLIVAR',3,2),('BMO','UEFA','ALE','13yfEZ2U5mjuHSPdVJ4cTR0anWQa2JpQu','BORUSSIA MONCHENGLADBACH',3,2),('BOL','CONMEBOL','ARG','1wI6Z5kmZlIwTh-S5p1aaFx24cM453FCa','BOLIVIA',3,1),('BRA','CONMEBOL','ARG','1G85eTN5er-mNC8zBWkBRXMXyp3lgo-00','BRASIL',3,1),('BSL','UEFA','SUIZ','1EXmZ-zSHILuvG0OWN_xWc0wzt_u79NPv','BASEL FC',3,2),('BTF','CONMEBOL','BRA','19Vas4JAvBaYa4nZFAQJBWMkn0kTFKw5Z','BOTAFOGO',3,2),('BULG','UEFA',NULL,'1qSrzJZAE7IiMVzMDgFBK77PwunFvji-T','BULGARIA',3,1),('BYL','UEFA','ALE','1w0PZe2qvNIW0BFh0QYobwk03uR7ZfBhn','BAYER LEVERKUSEN',3,2),('BYM','UEFA','ALE','1NXXOHazFRptHeezkYkjxAmZRgSao_OqT','BAYER MUNICH',3,2),('CAL','CONMEBOL','COL','1rFdHO2CFwrjDshhGNNKQBIt0bllVn_Fd','DEPORTIVO CALI',3,2),('CHEL','UEFA','ING','1lKRYnJRzQMuxpeuYUCa3al5woH9_Eicy','CHELSEA FC',3,2),('CHI','CONMEBOL','ARG','1UKemCkvPsvgixx6zbW0YaEqMGJ5cTGKn','CHILE',3,1),('CHN','AFC',NULL,'1g10OMXYVJXVy-4fOPwz5umqvqaBs657a','CHINA',3,1),('CLC','CONMEBOL','CHI','1rno5wsN43YBzaFAfdnSlqwJEmEI-wU6G','COLO COLO',3,2),('CLT','UEFA','ESC','1G6oy9RRcDUZO4-sXVXPnzBuaXp4ErzmQ','CELTIC FC',3,2),('CMF','CAF',NULL,'1O91zJ6qz1FbybaiA8Iyx5Slcg16KvdV_','COSTA DE MARFIL',3,1),('CMR','CAF',NULL,'15K6NN-WakKk2ZMOLsKCsuyUkqFhUkOrY','CAMERUN',3,1),('CND','CONCACAF',NULL,'1PJamFTP6oudbIVW1xYelYzn67zE--e__','CANADA',3,1),('CNF','CONMEBOL','URU','1VKOjvmQMLW32u4xIpSy56fONIVzB3ixe','CLUB NACIONAL DF',3,2),('CNG','CAF',NULL,'1z7r-8G9pcU4dCjefPg4ok-MEdFPh4HDF','RD CONGO',3,1),('COL','CONMEBOL','ARG','1hQ-0ALV3B9pfkZJRq2Wsp-9NtEBhS7RY','COLOMBIA',3,1),('CRC','CONMEBOL','VNZ','125_vsIUIix8r4sQspY083N6lwsL3rtpa','CARACAS FC',3,2),('EUA','AFC','ARG','13Y0dbB3Zn3MOGZBCObrthqZ86UyNxeN9','EMIRATOS ARABES UNIDOS',3,1),('MED','CONMEBOL','COL','1bjXPDUvdIyKJYSJRCYzhi2Uz5wDCJyiw','INDEPENDIENTE MEDELLIN',3.5,2),('ONC','CONMEBOL','COL','1NNPFEkotrNxwCq-MlEScbGSFAyvcdSbZ','ONCE CALDAS',3,2),('SA','AFC','EUA','1GavMwWk4fXZN0OLNHBpJ3uuunN10rHvg','ARABIA SAUDITA',3.5,1),('STF','CONMEBOL','COL','1Mi8tiCleq5ylnPQJlZWP7wIjdCGtkui6','INDEPENDIENTE SANTAFE',3.5,2),('SUIZ','UEFA',NULL,'1hBe1T57GiAEovfHHRadlhbEO3wnnCyVT','SUIZA',3,1);
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

-- Dump completed on 2021-11-18 17:37:53
