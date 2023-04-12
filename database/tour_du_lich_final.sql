-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: tour_du_lich3
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking` (
  `booking_id` int NOT NULL AUTO_INCREMENT,
  `tour_id` int NOT NULL,
  `user_id` int NOT NULL,
  `create_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `adult_number` int NOT NULL DEFAULT '1',
  `child_number` int NOT NULL DEFAULT '0',
  `total_cost` decimal(20,4) NOT NULL DEFAULT '0.0000',
  `status` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`booking_id`),
  KEY `fk_Booking_Customer` (`user_id`),
  KEY `fk_Booking_Tour` (`tour_id`),
  CONSTRAINT `fk_Booking_Customer` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON UPDATE CASCADE,
  CONSTRAINT `fk_Booking_Tour` FOREIGN KEY (`tour_id`) REFERENCES `tour` (`tour_id`) ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--


--
-- Table structure for table `group`
--

DROP TABLE IF EXISTS `group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `group` (
  `group_id` int NOT NULL AUTO_INCREMENT,
  `group_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`group_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group`
--

INSERT INTO `group` VALUES (1,'admin'),(2,'manager'),(3,'staff'),(4,'customer');

--
-- Table structure for table `group_permission`
--

DROP TABLE IF EXISTS `group_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `group_permission` (
  `group_per_id` int NOT NULL AUTO_INCREMENT,
  `group_id` int DEFAULT NULL,
  `per_id` int DEFAULT NULL,
  PRIMARY KEY (`group_per_id`),
  KEY `fk_Group_Permission_Group` (`group_id`),
  KEY `fk_Group_Permission_Permission` (`per_id`),
  CONSTRAINT `fk_Group_Permission_Group` FOREIGN KEY (`group_id`) REFERENCES `group` (`group_id`) ON UPDATE CASCADE,
  CONSTRAINT `fk_Group_Permission_Permission` FOREIGN KEY (`per_id`) REFERENCES `permission` (`per_id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `group_permission`
--

INSERT INTO `group_permission` VALUES (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,3,1),(6,2,1);

--
-- Table structure for table `hotel`
--

DROP TABLE IF EXISTS `hotel`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hotel` (
  `hotel_id` int NOT NULL AUTO_INCREMENT,
  `hotel_name` varchar(100) NOT NULL,
  `address` text,
  `tel` int DEFAULT NULL,
  `website` varchar(100) DEFAULT NULL,
  `star` tinyint DEFAULT '2',
  PRIMARY KEY (`hotel_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hotel`
--

INSERT INTO `hotel` VALUES (1,'thinh vuong','11/2/3 tran bui duong p12 dalat',NULL,NULL,2),(2,'thinh vuong2','11/2/4 tran bui duong p12 dalat',NULL,NULL,2);

--
-- Table structure for table `permission`
--

DROP TABLE IF EXISTS `permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `permission` (
  `per_id` int NOT NULL AUTO_INCREMENT,
  `per_name` varchar(100) DEFAULT NULL,
  `per_code` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`per_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `permission`
--

INSERT INTO `permission` VALUES (1,'view customer','customer/list'),(2,'create customer','customer/create'),(3,'edit customer','customer/edit'),(4,'delete customer','customer/delete');

--
-- Table structure for table `place`
--

DROP TABLE IF EXISTS `place`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `place` (
  `place_id` int NOT NULL AUTO_INCREMENT,
  `place_name` varchar(100) NOT NULL DEFAULT '',
  `place_describe` text,
  `star` tinyint DEFAULT '3',
  `region` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`place_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `place`
--

INSERT INTO `place` VALUES (1,'cho dem da lat',NULL,4,'vietnam/dalat');

--
-- Table structure for table `sceneric_cultuer`
--

DROP TABLE IF EXISTS `sceneric_cultuer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sceneric_cultuer` (
  `sc_id` int NOT NULL AUTO_INCREMENT,
  `sc_name` varchar(100) NOT NULL DEFAULT '',
  `place_id` int NOT NULL,
  `sc_describe` text,
  `img_url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`sc_id`),
  KEY `fk_SC_Place` (`place_id`),
  CONSTRAINT `fk_SC_Place` FOREIGN KEY (`place_id`) REFERENCES `place` (`place_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sceneric_cultuer`
--

INSERT INTO `sceneric_cultuer` VALUES (1,'crazy house',1,NULL,'sceneric/crazy-house.jpg'),(2,'elephant falls',1,NULL,'sceneric/elephant-falls.jpg'),(3,'linh phuong pagoda',1,NULL,'sceneric/it-is-know-as-daragon.jpg'),(4,'thien vien truc lam',1,NULL,'sceneric/the-most-beautiful-pagoda.jpg');

--
-- Table structure for table `tour`
--

DROP TABLE IF EXISTS `tour`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tour` (
  `tour_id` int NOT NULL AUTO_INCREMENT,
  `tour_name` varchar(100) NOT NULL,
  `tourguide_id` int NOT NULL,
  `hotel_id` int NOT NULL,
  category_id int not null ,
  `adult_price` decimal(20,4) NOT NULL,
  `child_price` decimal(20,4) NOT NULL,
  `adult_number` int NOT NULL DEFAULT '50',
  `child_number` int NOT NULL DEFAULT '50',
  `schedule_describe` text,
  `status` tinyint NOT NULL DEFAULT '0',
  `create_at` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`tour_id`),
  KEY `fk_Tour_Hotel` (`hotel_id`),
  KEY `fk_Tour_TourGuide` (`tourguide_id`),
  CONSTRAINT `fk_Tour_Hotel` FOREIGN KEY (`hotel_id`) REFERENCES `hotel` (`hotel_id`) ON UPDATE CASCADE,
  CONSTRAINT `fk_Tour_TourGuide` FOREIGN KEY (`tourguide_id`) REFERENCES `tourguider` (`tourguide_id`) ON UPDATE CASCADE,
  constraint `fk_Category_Tour` foreign key (category_id) references category(category_id) on UPDATE cascade
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tour`
--

INSERT INTO `tour` VALUES (1,'chuyen du lich da lat',1,1,1,1000000.0000,500000.0000,50,50,'Trải nghiệm mùa hoa tuyết Hàn Quốc\r\nHàn Quốc là đất nước níu chân khách du lịch khắp thế giới với thiên nhiên tươi đẹp bốn mùa. Du lịch Hàn Quốc đem đến những cảm nhận tuyệt vời về nét đặc trưng Á Đông truyền thống nhưng không kém phần hiện đại với rất nhiều danh lam thắng cảnh nổi tiếng khắp đất nước. Riêng Seoul đã có bao nhiêu cảnh sắc thu hút du khách: Đảo Nami xinh đẹp và bình yên, Lotte World là xứ sở thần tiên, những lễ hội vui nhộn, đậm đà bản sắc dân tộc. Cùng iVIVU trải nghiệm điểm đến tuyệt vời này ngay hôm nay!\r\n\r\nNhững trải nghiệm thú vị trong chương trình\r\n- Đảo Nami: hòn đảo nhân tạo xinh đẹp nằm ở ngoại ô Seoul, du khách tìm đến đây để tận mắt ngắm nhìn cảnh sắc thiên nhiên thơ mộng, lãng mạn nhất là con đường nằm giữa hai hàng cây thủy sam.\r\n\r\n- Cung điện Kyeongbok: hoàng cung lớn nhất tiêu biểu cho kiến trúc cổ điển và là một công trình tiêu biểu của Hàn Quốc và là cung điện hoàng gia lớn nhất Hàn Quốc.\r\n\r\n- Tháp Namsan: cảm nhận được không gian đầy tình yêu thương của những cặp đôi tìm đến đây để treo những chiếc ổ khóa đầy màu sắc biểu tượng cho tình yêu của họ.\r\n\r\n- Suối Cheonggyecheon con suối trong mát dài 5.8 km giữa lòng thủ đô Seoul.\r\n\r\n- Tháp N Seoul tọa lạc trên núi Namsan và đã trở thành một biểu tượng của Seoul.\r\n\r\n- Hero Show một show diễn nghệ thuật vẽ đặc sắc và vui nhộn từ các chàng trai tài hoa.\r\n\r\nBạn có sẵn sàng\r\nMột số điều kiện chung giúp Quý Khách nâng cao tỷ lệ xin Visa Hàn Quốc thành công:\r\n\r\n- Đã từng đi du lịch các nước ở khu vực Đông Nam Á.\r\n\r\n- Có công việc ổn định và thu nhập tốt\r\n\r\n- Có tài sản đứng tên như nhà đất, xe hơi, sổ tiết kiệm...\r\n\r\n- Chưa từng bị từ chối visa trước đây\r\n\r\n- Tải App PC Covid xác nhận tiêm chủng đủ 2 mũi trở lên.\r\n\r\niVIVU luôn sẵn sàng tư vấn chi tiết cho Quý Khách theo từng trường hợp cụ thể.\r\n\r\nChương trình tour\r\nƯU ĐÃI ĐẶC BIỆT: GIẢM NGAY 400K/KHÁCH KHI KHÁCH ĐẶT TOUR. ĐIỀU KIỆN: ÁP DỤNG NHÓM 4 KHÁCH TRỞ LÊN.\r\nNGÀY 1: TP.HCM - SEOUL ( NGHỈ ĐÊM TRÊN MÁY BAY)\r\nQuý khách tập trung tại sân bay Tân Sơn Nhất ga đi quốc tế, Trưởng Đoàn hướng dẫn làm thủ tục hàng không cho quý khách đáp chuyến bay đi Hàn Quốc.\r\n\r\nNGÀY 2: SEOUL - ĐẢO NAMI - THÁP N SEOUL ( ĂN SÁNG, TRƯA, TỐI)\r\nĐến sân bay Quốc Tế Incheon, hướng dẫn viên đón đoàn chào mừng đoàn đến với Thủ đô Seoul. Để nạp thêm năng lượng sau chuyến bay đêm, đoàn dùng bữa trưa tại nhà hàng địa phương thưởng thức ẩm thực tại Xứ sở Kim chi.\r\n\r\nTiếp đến, Quý khách khởi hành đi tham quan:\r\n\r\n- Đảo Nami – Nổi tiếng với những bản màu sắc riêng theo từng mùa: Mùa thu rực rỡ ánh vàng đỏ của tán cây phong và rừng ngân hạnh; Mùa hè có cây cối mướt xanh; Mùa đông huyền ảo với tuyết phủ trắng xóa& cuối cùng đặc biệt là vào Mùa xuânhàng trăm cây hoa anh đào nhuộm sắc hồng rực rỡ, với mùi hương ngọt ngào phảng phất không khí và lànơi ra đời của nhiều bộ phim truyền hình nổi tiếng của Hàn Quốc đã làm dấy lên cơn sốt nghệ thuật thứ bảy tại các nước CHÂU Á và thế giới như: \"Bản Tình Ca Mùa Đông\".',0,'2023-03-12 18:32:55');


CREATE TABLE `category` (
    category_id int(10) not null auto_increment,
    category_name varchar(100) not null,
    primary key (category_id)
);

insert into category (category_name)
values ('Tour trong nước'),('Tour ngoài nước'),('Tour đang khuyến mãi'),('Tour Nội Địa Cao Cấp'),('Tour Siêu Du Thuyền 5 Sao'),('Tour Thám Hiểm');






--
-- Table structure for table `tour_image`
--

DROP TABLE IF EXISTS `tour_image`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tour_image` (
  `tour_img_id` int NOT NULL AUTO_INCREMENT,
  `tour_id` int DEFAULT NULL,
  `img_name` varchar(100) DEFAULT NULL,
  `img_url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`tour_img_id`),
  KEY `fk_Tour_Image_Tour` (`tour_id`),
  CONSTRAINT `fk_Tour_Image_Tour` FOREIGN KEY (`tour_id`) REFERENCES `tour` (`tour_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tour_image`
--

INSERT INTO `tour_image` VALUES (1,1,NULL,'.tour/1-ivivu-cung-dien-kyeongbok.jpg'),(2,1,NULL,'.tour/1-ivivu-dao-nami-mua-he.jpg'),(3,1,NULL,'.tour/1-ivivu-tour-han-quoc-thap-nam-san.jpg');

--
-- Table structure for table `tour_place`
--

DROP TABLE IF EXISTS `tour_place`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tour_place` (
  `tour_id` int NOT NULL,
  `place_id` int NOT NULL,
  `create_at` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  KEY `fk_Tour_Place_Tour` (`tour_id`),
  KEY `fk_Tour_Place_Place` (`place_id`),
  CONSTRAINT `fk_Tour_Place_Place` FOREIGN KEY (`place_id`) REFERENCES `place` (`place_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `fk_Tour_Place_Tour` FOREIGN KEY (`tour_id`) REFERENCES `tour` (`tour_id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tour_place`
--

INSERT INTO `tour_place` VALUES (1,1,'2023-03-12 19:09:26');

--
-- Table structure for table `tour_schedule`
--

DROP TABLE IF EXISTS `tour_schedule`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tour_schedule` (
  `tour_schedule_id` int NOT NULL AUTO_INCREMENT,
  `tour_id` int NOT NULL,
  `start_day` date NOT NULL,
  `end_day` date NOT NULL,
  PRIMARY KEY (`tour_schedule_id`),
  KEY `fk_Tour_Schedule_Tour` (`tour_id`),
  CONSTRAINT `fk_Tour_Schedule_Tour` FOREIGN KEY (`tour_id`) REFERENCES `tour` (`tour_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tour_schedule`
--

INSERT INTO `tour_schedule` VALUES (1,1,'2023-03-20','2023-03-23');

--
-- Table structure for table `tourguider`
--

DROP TABLE IF EXISTS `tourguider`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tourguider` (
  `tourguide_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  `tel` int DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `email` text,
  `create_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `status` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`tourguide_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tourguider`
--

INSERT INTO `tourguider` VALUES (1,'van teo','nguyen',932123456,NULL,NULL,'2023-03-12 18:00:38',0);

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `user_name` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `first_name` varchar(100) DEFAULT NULL,
  `last_name` varchar(100) DEFAULT NULL,
  `tel` int DEFAULT NULL,
  `birthday` date DEFAULT NULL,
  `email` text,
  `create_at` datetime DEFAULT CURRENT_TIMESTAMP,
  `grp_per_id` int NOT NULL DEFAULT '4',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `idx_unq_user_name` (`user_name`),
  KEY `fk_User_Group` (`grp_per_id`),
  CONSTRAINT `fk_User_Group` FOREIGN KEY (`grp_per_id`) REFERENCES `group` (`group_id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

INSERT INTO `user` VALUES (1,'admin','123',NULL,NULL,NULL,NULL,NULL,'2023-03-12 17:54:40',1),(2,'bui thi le','123',NULL,NULL,NULL,NULL,NULL,'2023-03-12 17:55:23',4),(3,'bui thi le1','123',NULL,NULL,NULL,NULL,NULL,'2023-03-12 17:55:29',4),(4,'bui thi le2','123',NULL,NULL,NULL,NULL,NULL,'2023-03-12 17:55:33',4),(5,'manager','123',NULL,NULL,NULL,NULL,NULL,'2023-03-12 17:59:14',2),(6,'staff','123',NULL,NULL,NULL,NULL,NULL,'2023-03-12 17:59:22',3);
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-12 19:10:31
