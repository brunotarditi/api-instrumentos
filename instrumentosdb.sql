CREATE DATABASE  IF NOT EXISTS `instrumentosdb` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `instrumentosdb`;
-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: instrumentosdb
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `instrumento`
--

DROP TABLE IF EXISTS `instrumento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `instrumento` (
  `id_instrumento` bigint NOT NULL AUTO_INCREMENT,
  `cantidad_vendida` int DEFAULT NULL,
  `costo_envio` varchar(10) COLLATE utf8_spanish_ci DEFAULT NULL,
  `descripcion` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `imagen` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  `instrumento` varchar(120) COLLATE utf8_spanish_ci DEFAULT NULL,
  `marca` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  `modelo` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`id_instrumento`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `instrumento`
--

LOCK TABLES `instrumento` WRITE;
/*!40000 ALTER TABLE `instrumento` DISABLE KEYS */;
INSERT INTO `instrumento` VALUES (1,28,'G','Estas viendo una excelente mandolina de la marca Stagg, con un sonido muy dulce, tapa aros y fondo de tilo, y diapasón de palisandro. Es un instrumento acústico (no se enchufa) de cuerdas dobles (4 pares) con la caja ovalada y cóncava, y el mástil corto. Su utilización abarca variados ámbitos, desde rock, folk, country y ensambles experimentales.','nro10.jpg','Mandolina Instrumento Musical Stagg Sunburst','Stagg','M20',3600),(2,10,'150','1 Pandereta - 32 sonajas metálicas. Más de 8 años vendiendo con 100 % de calificaciones POSITIVAS y clientes satisfechos !! ','nro9.jpg','Pandereta Pandero Instrumento Musical ','DyM ventas','32 sonajas',325),(3,3,'250','Triangulo Musical de 24 Centímetros De Acero. ENVIOS POR CORREO O ENCOMIENDA: Se le deberán adicionar $40 en concepto de Despacho y el Costo del envío se abonará al recibir el producto en Terminal, Sucursal OCA o Domicilio','nro8.jpg','Triangulo Musical 24 Cm Percusion','LBP','24',260),(4,2,'G','BARCHIME CORTINA MUSICAL DE 25 BARRAS LATIN CUSTOM. Emitimos factura A y B','nro7.jpg','Bar Chimes Lp Cortina Musical 72 Barras ','FM','LATIN',2250),(5,5,'300','Las calabazas utilizadas para nuestras artesanías son sembradas y cosechadas por nosotros, quienes seleccionamos el mejor fruto para garantizar la calidad del producto y ofrecerle algo creativo y original.','nro6.jpg','Shekeres. Instrumento. Música. Artesanía. ','Azalea Artesanías','Cuentas de madera',850),(6,0,'2000','Buen dia! Sale a la venta este Piano Alemán Neumeyer con candelabros incluidos. Tiene una talla muy bonita en la madera. Una pieza de calidad.','nro3.jpg','Antiguo Piano Aleman Con Candelabros. ','Neumeyer','Stratus',17000),(7,5,'G','Material: Plástico smil madera 4 Cuerdas longitud: 60cm, el mejor regalo para usted, su familia y amigos, adecuado para 3-18 años de edad','nro4.jpg','Guitarra Ukelele Infantil Grande 60cm','GUITARRA','UKELELE',500),(8,1375,'G','Organo Electrónico GADNIC T01. Display de Led. 54 Teclas. 100 Timbres / 100 Ritmos. 4 1/2 octavas. 8 Percusiones. 8 Canciones de muestra. Grabación y reproducción. Entrada para Micrófono. Salida de Audio (Auriculares / Amplificador). Vibrato. Sustain Incluye Atril Apoya partitura y Micrófono. Dimensiones: 84,5 x 32,5 x 11 cm','nro2.jpg','Teclado Organo Electronico Musical Instrumento 54 Teclas ','GADNIC','T01',2250),(9,15,'300','Estas viendo un excelente y completísimo set de percusion para niños con estuche rígido, equipado con los instrumentos mas divertidos! De gran calidad y sonoridad. Ideal para jardines, escuelas primarias, musicoterapeutas o chicos que se quieran iniciar en la música de la mejor manera. Es un muy buen producto que garantiza entretenimiento en cualquier casa o reunión, ya que esta equipado para que varias personas al mismo tiempo estén tocando un instrumento.','nro1.jpg','Instrumentos De Percusión Niños Set Musical Con Estuche ','KNIGHT','LB17',2700),(10,380,'250','DESCRIPCIÓN: DE 1 A 3 AÑOS. EL SET INCLUYE 5 TAMBORES, PALILLOS Y EL PLATILLO TAL CUAL LAS FOTOS. SONIDOS REALISTAS Y FÁCIL DE MONTAR. MEDIDAS: 40X20X46 CM','nro5.jpg','Batería Musical Infantil Juguete Niño 9 Piezas Palillos ','Bateria','Infantil',850),(58,2,'G','Bateria Yamaha Rydeen de color rojo con bombo 20 madera y 5 cuerpos Shell Pack','nro11.jpg','Bateria Yamaha Rydeen','Yamaha Rydeen','RDP0F5HTR',83374.6);
/*!40000 ALTER TABLE `instrumento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'instrumentosdb'
--

--
-- Dumping routines for database 'instrumentosdb'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-13 21:28:26
