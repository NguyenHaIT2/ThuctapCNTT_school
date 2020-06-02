-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: school
-- ------------------------------------------------------
-- Server version	8.0.19

create schema school;
USE school;

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(45) DEFAULT NULL,
  `matkhau` varchar(45) DEFAULT NULL,
  `groupid` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--
-- ORDER BY:  `id`

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'mta.vn','123456',1),(2,'mta.vn','123456',1),(3,'mta.vn','123456',1),(4,'mta.vn','123456',1);
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `binhluan`
--

DROP TABLE IF EXISTS `binhluan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `binhluan` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `maphuhuynh` bigint DEFAULT NULL,
  `mahinhanh` bigint DEFAULT NULL,
  `ngay` date DEFAULT NULL,
  `gio` varchar(45) DEFAULT NULL,
  `noidung` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `binhluan`
--
-- ORDER BY:  `id`

LOCK TABLES `binhluan` WRITE;
/*!40000 ALTER TABLE `binhluan` DISABLE KEYS */;
/*!40000 ALTER TABLE `binhluan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diemdanhden`
--

DROP TABLE IF EXISTS `diemdanhden`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diemdanhden` (
  `id` int NOT NULL,
  `ten` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diemdanhden`
--
-- ORDER BY:  `id`

LOCK TABLES `diemdanhden` WRITE;
/*!40000 ALTER TABLE `diemdanhden` DISABLE KEYS */;
INSERT INTO `diemdanhden` VALUES (1,'có'),(2,'không');
/*!40000 ALTER TABLE `diemdanhden` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diemdanhve`
--

DROP TABLE IF EXISTS `diemdanhve`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diemdanhve` (
  `id` int NOT NULL AUTO_INCREMENT,
  `ten` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diemdanhve`
--
-- ORDER BY:  `id`

LOCK TABLES `diemdanhve` WRITE;
/*!40000 ALTER TABLE `diemdanhve` DISABLE KEYS */;
INSERT INTO `diemdanhve` VALUES (1,'có'),(2,'không');
/*!40000 ALTER TABLE `diemdanhve` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `giaovien`
--

DROP TABLE IF EXISTS `giaovien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `giaovien` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ten` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `matkhau` varchar(45) DEFAULT NULL,
  `groupid` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `giaovien`
--
-- ORDER BY:  `id`

LOCK TABLES `giaovien` WRITE;
/*!40000 ALTER TABLE `giaovien` DISABLE KEYS */;
INSERT INTO `giaovien` VALUES (1,'Nguyễn Thị Hà','mta.vn','123456',2),(2,'Phạm Lê Huy','mta.vn','123456',2),(3,'Nguyễn Hoàng Long','mta.vn','123456',2),(4,'Trịnh Huy Trà','mta.vn','123456',2),(5,'Nguyễn Duy Minh','mta.vn','123456',2),(6,'Nguyễn Văn Nam','mta.vn','123456',2),(7,'Hoàng Thị Thủy','mta.vn','123456',2),(8,'Nguyễn Hà Phương','mta.vn','123456',2),(9,'Lê Thị Quỳnh','mta.vn','123456',2);
/*!40000 ALTER TABLE `giaovien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `group`
--

DROP TABLE IF EXISTS `group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `group` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group`
--
-- ORDER BY:  `id`

LOCK TABLES `group` WRITE;
/*!40000 ALTER TABLE `group` DISABLE KEYS */;
INSERT INTO `group` VALUES (1,'Quản trị'),(2,'Giáo viên'),(3,'Phụ Huynh');
/*!40000 ALTER TABLE `group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `group_role`
--

DROP TABLE IF EXISTS `group_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `group_role` (
  `groupid` int DEFAULT NULL,
  `roleid` int DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group_role`
--
-- ORDER BY:  `id`

LOCK TABLES `group_role` WRITE;
/*!40000 ALTER TABLE `group_role` DISABLE KEYS */;
INSERT INTO `group_role` VALUES (1,1,1),(1,2,2),(1,3,3),(1,4,4),(1,5,5),(2,1,6),(2,5,7),(3,1,8),(3,5,9);
/*!40000 ALTER TABLE `group_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hinhanh`
--

DROP TABLE IF EXISTS `hinhanh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hinhanh` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `image` varchar(150) DEFAULT NULL,
  `thoigian` date DEFAULT NULL,
  `mahoatdong` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hinhanh`
--
-- ORDER BY:  `id`

LOCK TABLES `hinhanh` WRITE;
/*!40000 ALTER TABLE `hinhanh` DISABLE KEYS */;
INSERT INTO `hinhanh` VALUES (1,NULL,'2020-05-06',1),(2,NULL,'2020-05-06',2),(3,NULL,'2020-05-06',3),(4,NULL,'2020-05-06',4),(5,NULL,'2020-05-06',5),(6,NULL,'2020-05-06',6),(7,NULL,'2020-05-07',7),(8,NULL,'2020-05-07',8),(9,NULL,'2020-05-07',9),(10,NULL,'2020-05-07',10),(11,NULL,'2020-05-07',11);
/*!40000 ALTER TABLE `hinhanh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hoatdongtrongngay`
--

DROP TABLE IF EXISTS `hoatdongtrongngay`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hoatdongtrongngay` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ngay` date DEFAULT NULL,
  `gio` varchar(45) DEFAULT NULL,
  `ten` varchar(300) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hoatdongtrongngay`
--
-- ORDER BY:  `id`

LOCK TABLES `hoatdongtrongngay` WRITE;
/*!40000 ALTER TABLE `hoatdongtrongngay` DISABLE KEYS */;
INSERT INTO `hoatdongtrongngay` VALUES (1,'2020-05-06','09:00','Học hát'),(2,'2020-05-06','10:00','Học vẽ'),(3,'2020-05-06','11:00','Ăn uống'),(4,'2020-05-06','12:00','Ngủ nghỉ'),(5,'2020-05-06','14:00','Ăn bữa phụ'),(6,'2020-05-06','15:00','Vui chơi'),(7,'2020-05-07','09:00','Học tô'),(8,'2020-05-07','11:00','Ăn uống'),(9,'2020-05-07','12:00','Ngủ trưa'),(10,'2020-05-07','14:00','Ăn cháo'),(11,'2020-05-07','15:00','Học hát');
/*!40000 ALTER TABLE `hoatdongtrongngay` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hocsinh`
--

DROP TABLE IF EXISTS `hocsinh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hocsinh` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ten` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ngaysinh` date DEFAULT NULL,
  `magiaovien` bigint DEFAULT NULL,
  `maphuhuynh` bigint DEFAULT NULL,
  `malop` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hocsinh`
--
-- ORDER BY:  `id`

LOCK TABLES `hocsinh` WRITE;
/*!40000 ALTER TABLE `hocsinh` DISABLE KEYS */;
INSERT INTO `hocsinh` VALUES (1,'Bùi Quang Khánh','2016-03-03',1,1,1),(2,'Lê Bá Khải','2016-03-03',1,2,1),(3,'Nguyễn Minh Tâm','2016-03-03',1,3,1),(4,'Lê Hùng Cường','2016-03-03',1,2,1),(5,'Hoàng Thị Hiền','2016-03-03',1,3,1),(6,'Dương Thu','2016-03-03',1,4,1),(7,'Tạ Tiêu','2016-03-03',1,5,1),(8,'Minh Hiếu','2016-03-03',1,4,1),(9,'Mai Vân','2016-03-03',1,4,1),(10,'Lê Tú Hảo','2016-03-03',1,5,1),(11,'Triệu Ninh Ngân','2016-03-03',1,6,1),(12,'Trúc Thanh','2016-03-03',1,6,1);
/*!40000 ALTER TABLE `hocsinh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hocsinh_den`
--

DROP TABLE IF EXISTS `hocsinh_den`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hocsinh_den` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `mahocsinh` bigint DEFAULT NULL,
  `maden` int DEFAULT NULL,
  `nguoiduadi` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ngay` date DEFAULT NULL,
  `gio` varchar(45) DEFAULT NULL,
  `image` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hocsinh_den`
--
-- ORDER BY:  `id`

LOCK TABLES `hocsinh_den` WRITE;
/*!40000 ALTER TABLE `hocsinh_den` DISABLE KEYS */;
/*!40000 ALTER TABLE `hocsinh_den` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hocsinh_hinhanh`
--

DROP TABLE IF EXISTS `hocsinh_hinhanh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hocsinh_hinhanh` (
  `mahocsinh` bigint DEFAULT NULL,
  `mahinhanh` bigint DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hocsinh_hinhanh`
--
-- ORDER BY:  `id`

LOCK TABLES `hocsinh_hinhanh` WRITE;
/*!40000 ALTER TABLE `hocsinh_hinhanh` DISABLE KEYS */;
/*!40000 ALTER TABLE `hocsinh_hinhanh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hocsinh_hocphi`
--

DROP TABLE IF EXISTS `hocsinh_hocphi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hocsinh_hocphi` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `mahocsinh` bigint DEFAULT NULL,
  `thang` int DEFAULT NULL,
  `nam` int DEFAULT NULL,
  `tinhtrang` int DEFAULT NULL,
  `sotien` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hocsinh_hocphi`
--
-- ORDER BY:  `id`

LOCK TABLES `hocsinh_hocphi` WRITE;
/*!40000 ALTER TABLE `hocsinh_hocphi` DISABLE KEYS */;
/*!40000 ALTER TABLE `hocsinh_hocphi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hocsinh_ve`
--

DROP TABLE IF EXISTS `hocsinh_ve`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hocsinh_ve` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `mahocsinh` bigint DEFAULT NULL,
  `mave` int DEFAULT NULL,
  `nguoiduave` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ngay` date DEFAULT NULL,
  `gio` varchar(45) DEFAULT NULL,
  `image` varchar(150) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hocsinh_ve`
--
-- ORDER BY:  `id`

LOCK TABLES `hocsinh_ve` WRITE;
/*!40000 ALTER TABLE `hocsinh_ve` DISABLE KEYS */;
/*!40000 ALTER TABLE `hocsinh_ve` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lop`
--

DROP TABLE IF EXISTS `lop`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lop` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ten` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `magiaovien` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lop`
--
-- ORDER BY:  `id`

LOCK TABLES `lop` WRITE;
/*!40000 ALTER TABLE `lop` DISABLE KEYS */;
INSERT INTO `lop` VALUES (1,'mầm 1',1),(2,'mầm 2',2),(3,'chồi 1',3),(4,'chồi 2',4),(5,'lá 1',5),(6,'lá 2',6);
/*!40000 ALTER TABLE `lop` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lop_hoatdong`
--

DROP TABLE IF EXISTS `lop_hoatdong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lop_hoatdong` (
  `malop` bigint DEFAULT NULL,
  `mahoatdong` bigint DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lop_hoatdong`
--
-- ORDER BY:  `id`

LOCK TABLES `lop_hoatdong` WRITE;
/*!40000 ALTER TABLE `lop_hoatdong` DISABLE KEYS */;
INSERT INTO `lop_hoatdong` VALUES (1,1,1),(1,2,2),(1,3,3),(1,4,4),(1,5,5),(1,6,6),(1,7,7),(1,8,8),(1,9,9),(1,10,10),(1,11,11),(2,1,12),(2,2,13);
/*!40000 ALTER TABLE `lop_hoatdong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `lop_noidunghoctap`
--

DROP TABLE IF EXISTS `lop_noidunghoctap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `lop_noidunghoctap` (
  `malop` bigint DEFAULT NULL,
  `manoidunghoctap` bigint DEFAULT NULL,
  `id` bigint NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `lop_noidunghoctap`
--
-- ORDER BY:  `id`

LOCK TABLES `lop_noidunghoctap` WRITE;
/*!40000 ALTER TABLE `lop_noidunghoctap` DISABLE KEYS */;
INSERT INTO `lop_noidunghoctap` VALUES (1,1,1),(1,2,2),(1,3,3),(1,4,4),(1,5,5),(1,6,6),(1,7,7),(2,1,8),(2,2,9),(2,3,10),(2,4,11),(2,5,12),(2,6,13),(2,7,14);
/*!40000 ALTER TABLE `lop_noidunghoctap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `monan`
--

DROP TABLE IF EXISTS `monan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monan` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ten` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monan`
--
-- ORDER BY:  `id`

LOCK TABLES `monan` WRITE;
/*!40000 ALTER TABLE `monan` DISABLE KEYS */;
INSERT INTO `monan` VALUES (1,'Cháo'),(2,'Sữa'),(3,'Ngô'),(4,'Canh rau ngót'),(5,'Khoai'),(6,'Thịt băm'),(7,'Cá kho'),(8,'Thị gà'),(9,'thịt bò'),(10,'Rau muống');
/*!40000 ALTER TABLE `monan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `noidunghoctap`
--

DROP TABLE IF EXISTS `noidunghoctap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `noidunghoctap` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ten` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `nam` int DEFAULT NULL,
  `thang` int DEFAULT NULL,
  `tuan` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `noidunghoctap`
--
-- ORDER BY:  `id`

LOCK TABLES `noidunghoctap` WRITE;
/*!40000 ALTER TABLE `noidunghoctap` DISABLE KEYS */;
INSERT INTO `noidunghoctap` VALUES (1,'Học hát',2020,5,17),(2,'Học vẽ',2020,5,18),(3,'Học viết',2020,5,19),(4,'Vui chơi',2020,5,20),(5,'Nặn đất màu',2020,6,21),(6,'Picnic',2020,6,22),(7,'Học đánh vần',2020,6,22);
/*!40000 ALTER TABLE `noidunghoctap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phuhuynh`
--

DROP TABLE IF EXISTS `phuhuynh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phuhuynh` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `ten` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `sdt` varchar(45) DEFAULT NULL,
  `matkhau` varchar(45) DEFAULT NULL,
  `groupid` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phuhuynh`
--
-- ORDER BY:  `id`

LOCK TABLES `phuhuynh` WRITE;
/*!40000 ALTER TABLE `phuhuynh` DISABLE KEYS */;
INSERT INTO `phuhuynh` VALUES (1,'Lê Thị Hội','mta.vn','123456789','123456',3),(2,'Nguyễn Văn Tuấn','mta.vn','123456789','123456',3),(3,'Nguyễn Thị Lê','mta.vn','123456789','123456',3),(4,'Lê Bá Tùng','mta.vn','123456789','123456',3),(5,'Đinh Thị Thu','mta.vn','123456789','123456',3),(6,'Nguyễn Minh Tú','mta.vn','012345678','123456',3);
/*!40000 ALTER TABLE `phuhuynh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` int NOT NULL,
  `name` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--
-- ORDER BY:  `id`

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'Xem'),(2,'Thêm'),(3,'Sửa'),(4,'Xóa'),(5,'Tìm kiếm');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sukientruong`
--

DROP TABLE IF EXISTS `sukientruong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sukientruong` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `thoigianbatdau` date DEFAULT NULL,
  `thoigianketthuc` date DEFAULT NULL,
  `ten` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sukientruong`
--
-- ORDER BY:  `id`

LOCK TABLES `sukientruong` WRITE;
/*!40000 ALTER TABLE `sukientruong` DISABLE KEYS */;
/*!40000 ALTER TABLE `sukientruong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thetranghangthang`
--

DROP TABLE IF EXISTS `thetranghangthang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thetranghangthang` (
  `id` bigint NOT NULL,
  `chieucao` int DEFAULT NULL,
  `cannang` int DEFAULT NULL,
  `thang` int DEFAULT NULL,
  `nam` int DEFAULT NULL,
  `mahocsinh` bigint DEFAULT NULL,
  `magiaovien` bigint DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thetranghangthang`
--
-- ORDER BY:  `id`

LOCK TABLES `thetranghangthang` WRITE;
/*!40000 ALTER TABLE `thetranghangthang` DISABLE KEYS */;
/*!40000 ALTER TABLE `thetranghangthang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `thucdon`
--

DROP TABLE IF EXISTS `thucdon`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `thucdon` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `mamonan` bigint DEFAULT NULL,
  `ngay` date DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `thucdon`
--
-- ORDER BY:  `id`

LOCK TABLES `thucdon` WRITE;
/*!40000 ALTER TABLE `thucdon` DISABLE KEYS */;
/*!40000 ALTER TABLE `thucdon` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'school'
--

--
-- Dumping routines for database 'school'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-06-01  6:04:36
