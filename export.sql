-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: localhost    Database: library
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
-- Table structure for table `book_count`
--

DROP TABLE IF EXISTS `book_count`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book_count` (
  `BookNo` int DEFAULT '0',
  `UserID` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book_count`
--

LOCK TABLES `book_count` WRITE;
/*!40000 ALTER TABLE `book_count` DISABLE KEYS */;
INSERT INTO `book_count` VALUES (1,1),(2,2),(0,3);
/*!40000 ALTER TABLE `book_count` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `books`
--

DROP TABLE IF EXISTS `books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `books` (
  `BookID` int NOT NULL AUTO_INCREMENT,
  `BookName` varchar(50) NOT NULL,
  `genre` varchar(50) DEFAULT NULL,
  `Author` varchar(30) DEFAULT NULL,
  `Publisher` varchar(50) DEFAULT NULL,
  `Shelf` varchar(5) NOT NULL,
  `Row` varchar(5) NOT NULL,
  `RegBookDate` date DEFAULT NULL,
  PRIMARY KEY (`BookID`)
) ENGINE=InnoDB AUTO_INCREMENT=93 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books`
--

LOCK TABLES `books` WRITE;
/*!40000 ALTER TABLE `books` DISABLE KEYS */;
INSERT INTO `books` VALUES (3,'Harry Potter and Goblet of Fire','Fiction','J. K. Rowling','Pottermore','12','B','2023-07-06'),(4,'Harry Potter and Deathly Hallow','Fiction','J. K. Rowling','Pottermore','D','23','2023-07-06'),(5,'Famous Five','sd','ds','dsd','A','3','2023-07-06'),(6,'akhjkd','hdfdj','jkshdkjh','hkjdfh','hj','d','2023-07-06'),(13,'The da Vinci Code','Thriller','Dan Brown','Doubleday','r','5','2023-07-06'),(14,'Pride and Prejudice','Romantic','Alexander Dumas','Pearson','a','9','2023-07-06'),(15,'To Kill A Mocking Bird','Emotional','Harper Lee','McGraw','z','8','2023-07-06'),(16,'The Perks Of being A Wallflower','Drama','Stephen Chbosky','Klett','g','1','2023-07-06'),(17,'The Hunger Games','Action','Suzanne Collins','Pearson','t','7','2023-07-06'),(18,'Madhushala','Life','H R Bacchan','Pushpalata','h','6','2023-07-06'),(19,'V for Vendetta ','Action','Alan Moore','Cambridge','a','9','2023-07-06'),(20,'Think and Grow Rich','Self-help','Napoleon Hill','The Ralston Society','3','1','2023-07-06'),(21,'Think and Grow Rich','Self-help','Napoleon Hill','The Ralston Society','3','1','2023-07-06'),(23,'The 7 Habits of Highly Effective People','Self-help','Stephen Covey','Simon & Schuster','3','3','2023-07-06'),(24,'The Power of Positive Thinking','Self-help','Norman Vincent Peale','Prentice Hall','3','4','2023-07-06'),(25,'How to Win Friends and Influence People','Self-help','Dale Carnegie','Simon & Schuster','3','5','2023-07-06'),(26,'The Magic of Thinking Big','Self-help','David J. Schwartz','Prentice Hall','3','6','2023-07-06'),(27,'The Intelligent Investor','Finance','Benjamin Graham','HarperBusiness','3','7','2023-07-06'),(28,'Think and Grow Rich','Self-help','Napoleon Hill','The Ralston Society','3','1','2023-07-06'),(29,'Rich Dad Poor Dad','Personal Finance','Robert Kiyosaki','Warner Books','3','2','2023-07-06'),(30,'The 7 Habits of Highly Effective People','Self-help','Stephen Covey','Simon & Schuster','3','3','2023-07-06'),(31,'The Power of Positive Thinking','Self-help','Norman Vincent Peale','Prentice Hall','3','4','2023-07-06'),(32,'How to Win Friends and Influence People','Self-help','Dale Carnegie','Simon & Schuster','3','5','2023-07-06'),(33,'The Magic of Thinking Big','Self-help','David J. Schwartz','Prentice Hall','3','6','2023-07-06'),(34,'The Intelligent Investor','Finance','Benjamin Graham','HarperBusiness','3','7','2023-07-06'),(35,'A Confederacy of Dunces','Satire','John Kennedy Toole','Louisiana State University Press','4','1','2023-07-06'),(36,'One Flew Over the Cuckoo’s Nest','Novel','Ken Kesey','Viking Press','4','2','2023-07-06'),(37,'Lolita','Novel','Vladimir Nabokov','Olympia Press','4','3','2023-07-06'),(38,'Breakfast at Tiffany’s','Novella','Truman Capote','Random House','4','4','2023-07-06'),(39,'In Cold Blood','True Crime','Truman Capote','Random House','4','5','2023-07-06'),(40,'The Catcher in the Rye','Novel','J. D. Salinger','Little, Brown and Company','4','6','2023-07-06'),(41,'Slaughterhouse-Five','Novel','Kurt Vonnegut','Delacorte Press','4','7','2023-07-06'),(42,'Breakfast of Champions','Novel','Kurt Vonnegut','Delacorte Press','4','8','2023-07-06'),(43,'The Alchemist','Fiction','Paulo Coelho','HarperOne','5','1','2023-07-06'),(44,'The Subtle Art of Not Giving a F*ck','Self-help','Mark Manson','HarperOne','5','2','2023-07-06'),(45,'Atomic Habits','Self-help','James Clear','Avery','5','3','2023-07-06'),(46,'The 4-Hour Workweek','Self-help','Timothy Ferriss','Crown Publishing Group','5','4','2023-07-06'),(47,'The Lean Startup','Business','Eric Ries','Crown Business','5','5','2023-07-06'),(48,'The 7 Habits of Highly Effective Families','Self-help','Stephen Covey','Fireside','5','6','2023-07-06'),(49,'The Body Keeps the Score','Psychology','Bessel van der Kolk','Penguin Books','5','7','2023-07-06'),(50,'The Money Book for the Young, Fabulous & Broke','Personal finance','Suze Orman','Riverhead Books','6','1','2023-07-06'),(51,'Sapiens','History','Yuval Noah Harari','HarperCollins Publishers','6','2','2023-07-06'),(52,'Atomic Habits','Self-help','James Clear','Avery','6','3','2023-07-06'),(53,'The Secret','Self-help','Rhonda Byrne','Beyond Words/Atria Books','6','4','2023-07-06'),(54,'Tiny Beautiful Things','Essays','Cheryl Strayed','Vintage','6','5','2023-07-06'),(55,'The Obstacle is the Way','Self-help','Ryan Holiday','Portfolio/Penguin','6','6','2023-07-06'),(56,'The Subtle Art of Not Giving a F*ck','Self-help','Mark Manson','HarperOne','6','7','2023-07-06'),(57,'Educated','Memoir','Tara Westover','Random House','7','1','2023-07-06'),(58,'Calculus','Mathematics','Michael Spivak','Publish or Perish','8','1','2023-07-06'),(59,'Linear Algebra Done Right','Mathematics','Sheldon Axler','Springer','8','2','2023-07-06'),(60,'Introduction to Algebra','Mathematics','Richard Rusczyk','Birkhauser','8','3','2023-07-06'),(61,'Basic Linear Algebra','Mathematics','B.C. Hall','Springer','8','4','2023-07-06'),(62,'Galois Theory','Mathematics','Emil Artin','Courier Corporation','8','5','2023-07-06'),(63,'Real Analysis','Mathematics','Halsey Royden','Prentice Hall','8','6','2023-07-06'),(64,'Multivariable Mathematics','Mathematics','Theodore Shifrin','Wiley','8','7','2023-07-06'),(65,'Geometry Revisited','Mathematics','Coxeter','MAA','8','8','2023-07-06'),(66,'Topology','Mathematics','James Munkres','Prentice Hall','8','9','2023-07-06'),(67,'A Course in Abstract Algebra','Mathematics','Khanna & Bhambri','New Age International','8','10','2023-07-06'),(68,'Advanced Calculus','Mathematics','Lynn Loomis','Dover Publications','8','11','2023-07-06'),(69,'Functions of a Complex Variable','Mathematics','Einar Hille','Chelsea Publishing','8','12','2023-07-06'),(70,'Basic Mathematics','Mathematics','Lang','Undergraduate Texts in Mathematics','8','13','2023-07-06'),(71,'Differential Equations','Mathematics','Georgi Evtouhov','American Mathematical Soc.','8','14','2023-07-06'),(72,'Pride and Prejudice','Literature','Jane Austen','T. Egerton','11','1','2023-07-06'),(73,'Jane Eyre','Literature','Charlotte Bronte','Smith, Elder & Co.','11','2','2023-07-06'),(74,'Wuthering Heights','Literature','Emily Bronte','Thomas Cautley Newby','11','3','2023-07-06'),(75,'Great Expectations','Literature','Charles Dickens','Chapman and Hall','11','4','2023-07-06'),(76,'The Scarlet Letter','Literature','Nathaniel Hawthorne','Ticknor, Reed, and Fields','11','5','2023-07-06'),(77,'Moby Dick','Literature','Herman Melville','Harper & Brothers','11','6','2023-07-06'),(78,'The Adventures of Huckleberry Finn','Literature','Mark Twain','Charles L. Webster and Company','11','7','2023-07-06'),(79,'The Great Gatsby','Literature','F. Scott Fitzgerald','Charles Scribner\'s Sons','11','8','2023-07-06'),(80,'To the Lighthouse','Literature','Virginia Woolf','Hogarth Press','11','9','2023-07-06'),(81,'Pride and Prejudice','Literature','Jane Austen','T. Egerton','11','1','2023-07-06'),(82,'Jane Eyre','Literature','Charlotte Bronte','Smith, Elder & Co.','11','2','2023-07-06'),(83,'Wuthering Heights','Literature','Emily Bronte','Thomas Cautley Newby','11','3','2023-07-06'),(84,'Great Expectations','Literature','Charles Dickens','Chapman and Hall','11','4','2023-07-06'),(85,'The Scarlet Letter','Literature','Nathaniel Hawthorne','Ticknor, Reed, and Fields','11','5','2023-07-06'),(86,'Moby Dick','Literature','Herman Melville','Harper & Brothers','11','6','2023-07-06'),(87,'The Adventures of Huckleberry Finn','Literature','Mark Twain','Charles L. Webster and Company','11','7','2023-07-06'),(88,'Testbook','Math','An','An','112','2','2023-07-06'),(89,'an','Math','An','An dep trai ','121','12','2023-07-06'),(90,'an','an','an','An','22','22',NULL),(91,'an','Toan','An','An','12','2',NULL),(92,'test1','Math','An','An','12','22','2023-10-25');
/*!40000 ALTER TABLE `books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fullname`
--

DROP TABLE IF EXISTS `fullname`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fullname` (
  `UserID` int DEFAULT NULL,
  `FirstName` varchar(30) NOT NULL,
  `LastName` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fullname`
--

LOCK TABLES `fullname` WRITE;
/*!40000 ALTER TABLE `fullname` DISABLE KEYS */;
/*!40000 ALTER TABLE `fullname` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `issuedbook`
--

DROP TABLE IF EXISTS `issuedbook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `issuedbook` (
  `BookID` int DEFAULT NULL,
  `UserID` int DEFAULT NULL,
  `IssueDate` date NOT NULL,
  `ReturnDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `issuedbook`
--

LOCK TABLES `issuedbook` WRITE;
/*!40000 ALTER TABLE `issuedbook` DISABLE KEYS */;
INSERT INTO `issuedbook` VALUES (12,2,'2016-11-17','2023-10-19'),(6,2,'2016-11-17','2023-10-19'),(88,4,'2023-10-20','2023-11-04'),(87,4,'2023-10-22','2023-11-06'),(3,3,'2023-10-22','2023-11-06'),(4,4,'2023-10-22','2023-11-06'),(92,5,'2023-10-25','2023-11-21'),(3,4,'2023-10-25','2023-11-09');
/*!40000 ALTER TABLE `issuedbook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `issuedmagazine`
--

DROP TABLE IF EXISTS `issuedmagazine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `issuedmagazine` (
  `MagID` int DEFAULT NULL,
  `UserID` int DEFAULT NULL,
  `IssueDate` date NOT NULL,
  `ReturnDate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `issuedmagazine`
--

LOCK TABLES `issuedmagazine` WRITE;
/*!40000 ALTER TABLE `issuedmagazine` DISABLE KEYS */;
/*!40000 ALTER TABLE `issuedmagazine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `librarian`
--

DROP TABLE IF EXISTS `librarian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `librarian` (
  `LibrarianID` int NOT NULL AUTO_INCREMENT,
  `FullName` varchar(30) NOT NULL,
  `UserName` varchar(30) NOT NULL,
  `password` varchar(200) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `RegDate` date DEFAULT NULL,
  PRIMARY KEY (`LibrarianID`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `librarian`
--

LOCK TABLES `librarian` WRITE;
/*!40000 ALTER TABLE `librarian` DISABLE KEYS */;
INSERT INTO `librarian` VALUES (1,'Enco Sier','Encosier','1234','enco.cs.doc@gmail.com',NULL),(2,'Leloush Britannia','Zero','9876','leloush.zero@bitannia.com',NULL),(3,'van thanh','thanh','877125dba3851ef662b2dd1b4b8ccf5c70b6a401a4dda9c41deb6e05c32a74ba','an6@gmail.com','2023-10-19'),(4,'qeqeq','thanh','877125dba3851ef662b2dd1b4b8ccf5c70b6a401a4dda9c41deb6e05c32a74ba','thanhtomy02@gmail.com','2023-10-21'),(5,'Khuong Thanh An','An','877125dba3851ef662b2dd1b4b8ccf5c70b6a401a4dda9c41deb6e05c32a74ba','thanht@gmail.com','2023-10-25');
/*!40000 ALTER TABLE `librarian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `magazine`
--

DROP TABLE IF EXISTS `magazine`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `magazine` (
  `MagID` int NOT NULL AUTO_INCREMENT,
  `VolNo` int NOT NULL,
  `Mname` varchar(30) NOT NULL,
  `Magazine` varchar(30) NOT NULL,
  `MagazineShelf` varchar(10) NOT NULL,
  `Genre` varchar(10) NOT NULL,
  `Publisher` varchar(10) NOT NULL,
  PRIMARY KEY (`MagID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `magazine`
--

LOCK TABLES `magazine` WRITE;
/*!40000 ALTER TABLE `magazine` DISABLE KEYS */;
/*!40000 ALTER TABLE `magazine` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publisher`
--

DROP TABLE IF EXISTS `publisher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `publisher` (
  `PublisherID` int NOT NULL AUTO_INCREMENT,
  `PublisherName` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`PublisherID`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publisher`
--

LOCK TABLES `publisher` WRITE;
/*!40000 ALTER TABLE `publisher` DISABLE KEYS */;
INSERT INTO `publisher` VALUES (1,'hjkhdkj'),(2,'Pottermore'),(3,'dsd'),(4,'Whittaker'),(5,'ewhkje'),(6,'dhskj'),(7,'hkjdfh'),(8,'gsjf'),(9,'dshh'),(10,'gdsh'),(11,'Water'),(12,'ew'),(13,'dgjs'),(14,'SGAJ'),(15,'WHOKNOW'),(16,'Doubleday'),(17,'Pearson'),(18,'McGraw'),(19,'Klett'),(20,'Pushpalata'),(21,'Cambridge'),(22,'TMH'),(23,'an'),(24,'thanh an'),(25,'thanhan'),(26,'An dep trai'),(27,'Null'),(28,'chiu');
/*!40000 ALTER TABLE `publisher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `returned_books`
--

DROP TABLE IF EXISTS `returned_books`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `returned_books` (
  `ReturnID` int NOT NULL AUTO_INCREMENT,
  `BookID` int NOT NULL,
  `UserID` int NOT NULL,
  `ReturnDate` date NOT NULL,
  PRIMARY KEY (`ReturnID`),
  KEY `BookID` (`BookID`),
  KEY `UserID` (`UserID`),
  CONSTRAINT `returned_books_ibfk_1` FOREIGN KEY (`BookID`) REFERENCES `books` (`BookID`),
  CONSTRAINT `returned_books_ibfk_2` FOREIGN KEY (`UserID`) REFERENCES `users` (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `returned_books`
--

LOCK TABLES `returned_books` WRITE;
/*!40000 ALTER TABLE `returned_books` DISABLE KEYS */;
INSERT INTO `returned_books` VALUES (5,21,4,'2023-10-22'),(6,5,1,'2023-10-22');
/*!40000 ALTER TABLE `returned_books` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `UserID` int NOT NULL AUTO_INCREMENT,
  `UserPass` varchar(200) NOT NULL,
  `RegDate` date NOT NULL,
  `UserName` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `FullName` varchar(100) NOT NULL,
  PRIMARY KEY (`UserID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'1234','2012-05-15','Deco','deco@gmail.com','Deco'),(2,'12345678','2016-11-07','Piyush','pkalkute@gmail.com','Piyush'),(3,'012345','2016-11-25','NewHero','newhero@gmail.com','NewHero'),(4,'877125dba3851ef662b2dd1b4b8ccf5c70b6a401a4dda9c41deb6e05c32a74ba','2023-10-19','an','thanh@gmail.com','an'),(5,'877125dba3851ef662b2dd1b4b8ccf5c70b6a401a4dda9c41deb6e05c32a74ba','2023-10-25','hung','hungnt@gmail.com','Tran Hung'),(6,'877125dba3851ef662b2dd1b4b8ccf5c70b6a401a4dda9c41deb6e05c32a74ba','2023-10-25','Khanh','khanhdz1306@gmail.com','Quoc Khanh'),(7,'877125dba3851ef662b2dd1b4b8ccf5c70b6a401a4dda9c41deb6e05c32a74ba','2023-10-25','thanh1','thanhtomy03@gmail.com','deptrai');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-10-25 13:41:47
