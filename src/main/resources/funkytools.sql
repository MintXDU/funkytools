CREATE DATABASE /*!32312 IF NOT EXISTS*/ `funkytools` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci */;

USE `funkytools`;

--
-- Table structure for table `repository`
--

DROP TABLE IF EXISTS `repository`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `repository` (
                              `id` bigint(20) NOT NULL AUTO_INCREMENT,
                              `name` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
                              `description` mediumtext COLLATE utf8mb4_unicode_ci,
                              `url` varchar(255) COLLATE utf8mb4_unicode_ci NOT NULL,
                              `likes` int(11) DEFAULT '0',
                              PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1880472912033714178 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `repository`
--

LOCK TABLES `repository` WRITE;
/*!40000 ALTER TABLE `repository` DISABLE KEYS */;
INSERT INTO `repository` VALUES (1,'marketing','这是一个抽奖接口,模拟高并发场景下的一些解决方案','https://github.com/MintXDU/marketing',15),(2,'testRepo','this is a testing repo.','https://baidu.com',9);

