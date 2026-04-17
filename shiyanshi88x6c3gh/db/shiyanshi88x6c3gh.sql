-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: shiyanshi88x6c3gh
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `shiyanshi88x6c3gh`
--

/*!40000 DROP DATABASE IF EXISTS `shiyanshi88x6c3gh`*/;

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `shiyanshi88x6c3gh` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `shiyanshi88x6c3gh`;

--
-- Table structure for table `anquanyinhuan`
--

DROP TABLE IF EXISTS `anquanyinhuan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `anquanyinhuan` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '预约编号',
  `bianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '编号',
  `shiyanshimingcheng` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室名称',
  `shiyanshileixing` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室类型',
  `yuanxi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '院系',
  `shiyanshiweizhi` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '实验室位置',
  `xueshengxuehao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生姓名',
  `shoujihao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `yongtu` longtext COLLATE utf8mb4_unicode_ci COMMENT '用途',
  `appointmentdate` date DEFAULT NULL COMMENT '预约日期',
  `timeperiod` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '时间段',
  `shangbaoshijian` datetime DEFAULT NULL COMMENT '上报时间',
  `anquanyinhuan` longtext COLLATE utf8mb4_unicode_ci COMMENT '安全隐患',
  `shipaizhaopian` longtext COLLATE utf8mb4_unicode_ci COMMENT '实拍照片',
  `shhf` longtext COLLATE utf8mb4_unicode_ci COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='安全隐患';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `anquanyinhuan`
--

LOCK TABLES `anquanyinhuan` WRITE;
/*!40000 ALTER TABLE `anquanyinhuan` DISABLE KEYS */;
INSERT INTO `anquanyinhuan` VALUES (1,'2026-04-08 14:34:43','预约编号1','4003','材料测试室','应用研究','土木工程学院','工程楼2层','001','李思远','13765432109','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','2026-04-08','时间段1','2026-04-08 22:34:43','安全隐患1','upload/anquanyinhuan_材料测试室1.jpg,upload/anquanyinhuan_材料测试室2.jpg,upload/anquanyinhuan_材料测试室3.jpg',''),(2,'2026-04-08 14:34:43','预约编号2','4007','物理实验室','基础研究','机械工程学院','理科楼B座4层','006','周雪','13678901234','此处文本编辑框是内容详细的操作提示，您可以对现有文字进行修改，包括删除多余文字、替换不合适的表述等；插入图片时，既可以从本地选择图片上传，图片插入后会直接展示在编辑框中，完成操作后点击空白区域即可保存。','2026-04-08','时间段2','2026-04-08 22:34:43','安全隐患2','upload/anquanyinhuan_物理实验室1.jpg,upload/anquanyinhuan_物理实验室2.jpg,upload/anquanyinhuan_物理实验室3.jpg',''),(3,'2026-04-08 14:34:43','预约编号3','4002','电子测试室','检测服务','商学院','电信楼5层','005','张明','15212345678','编辑框中展示的默认内容仅为示例，您可任意修改其中的文字表述，比如更换词语、调整语句顺序等；当需要插入图片时，点击编辑框上方的 “插入图片” 按钮，上传图片后即可直接在编辑框中展示。','2026-04-08','时间段3','2026-04-08 22:34:43','安全隐患3','upload/anquanyinhuan_电子测试室1.jpg,upload/anquanyinhuan_电子测试室2.jpg,upload/anquanyinhuan_电子测试室3.jpg',''),(4,'2026-04-08 14:34:43','预约编号4','4008','食品检测室','检测服务','工学院','食品楼2层','004','高雪','13023456789','此编辑框内已详情的内容，您可以直接对现有文字进行修改，无论是调整文字内容、更正表述还是增减文字数量都能实现；若需插入图片，只需点击上方工具栏的图片图标，选择本地文件或输入图片链接即可插入展示，所有操作完成后提交后系统会保存您的修改。​','2026-04-08','时间段4','2026-04-08 22:34:43','安全隐患4','upload/anquanyinhuan_食品检测室1.jpg,upload/anquanyinhuan_食品检测室2.jpg,upload/anquanyinhuan_食品检测室3.jpg',''),(5,'2026-04-08 14:34:43','预约编号5','4004','生化分析室','基础研究','新闻与传播学院','实验楼A座5层','002','林书豪','13654321098','此编辑框内的默认内容为可编辑状态，您可对文字进行修改，比如调整语句顺序、更换文字内容等；插入图片时，支持上传图片，上传后图片会直接在编辑框中展示，也能一键删除不需要的图片。','2026-04-08','时间段5','2026-04-08 22:34:43','安全隐患5','upload/anquanyinhuan_生化分析室1.jpg,upload/anquanyinhuan_生化分析室2.jpg,upload/anquanyinhuan_生化分析室3.jpg',''),(6,'2026-04-08 14:34:43','预约编号6','4001','航空实验室','应用研究','历史学院','航空楼5层','007','吴磊','15065432109','此处文本编辑框是内容详细的操作提示，您能轻松对框内文字进行修改，像更正错误文字、调整文字内容等都能实现；插入图片的话，点击工具栏上的图片按钮，选择要插入的图片，图片就会在编辑框中展示，支持随时再次编辑。','2026-04-08','时间段6','2026-04-08 22:34:43','安全隐患6','upload/anquanyinhuan_航空实验室1.jpg,upload/anquanyinhuan_航空实验室2.jpg,upload/anquanyinhuan_航空实验室3.jpg',''),(7,'2026-04-08 14:34:43','预约编号7','4005','海洋实验室','基础研究','自动化学院','海洋楼4层','003','黄晓彤','13276543210','编辑框中的默认提示允许您进行文字修改操作，像更正错别字、调整文字内容等都能轻松完成；插入图片的话，点击工具栏中的图片按钮，选择图片后即可在编辑框中展示，所有修改实时可见且支持随时编辑。​\n','2026-04-08','时间段7','2026-04-08 22:34:43','安全隐患7','upload/anquanyinhuan_海洋实验室1.jpg,upload/anquanyinhuan_海洋实验室2.jpg,upload/anquanyinhuan_海洋实验室3.jpg',''),(8,'2026-04-08 14:34:43','预约编号8','4006','农业实验室','应用研究','药学院','农科楼2层','008','董珊','15178901234','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','2026-04-08','时间段8','2026-04-08 22:34:43','安全隐患8','upload/anquanyinhuan_农业实验室1.jpg,upload/anquanyinhuan_农业实验室2.jpg,upload/anquanyinhuan_农业实验室3.jpg','');
/*!40000 ALTER TABLE `anquanyinhuan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `baofeishenqing`
--

DROP TABLE IF EXISTS `baofeishenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `baofeishenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `baofeibianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '报废编号',
  `shebeibianhao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备编号',
  `shebeimingcheng` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备名称',
  `shebeifenlei` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备分类',
  `shuliang` int(11) DEFAULT NULL COMMENT '报废数量',
  `xinghao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '型号',
  `fengmian` longtext COLLATE utf8mb4_unicode_ci COMMENT '封面',
  `baofeishijian` datetime DEFAULT NULL COMMENT '报废时间',
  `baofeishuoming` longtext COLLATE utf8mb4_unicode_ci COMMENT '报废说明',
  `sfsh` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COLLATE utf8mb4_unicode_ci COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `baofeibianhao` (`baofeibianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='报废申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `baofeishenqing`
--

LOCK TABLES `baofeishenqing` WRITE;
/*!40000 ALTER TABLE `baofeishenqing` DISABLE KEYS */;
INSERT INTO `baofeishenqing` VALUES (1,'2026-04-08 14:34:43','1111111111','EQ006','恒温培养箱','温控设备',78,'DHP-9052','upload/baofeishenqing_EQ0061.jpg,upload/baofeishenqing_EQ0062.jpg,upload/baofeishenqing_EQ0063.jpg','2026-04-08 22:34:43','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','是',''),(2,'2026-04-08 14:34:43','2222222222','EQ018','超低温冰箱','冷藏设备',26,'DW-86L386','upload/baofeishenqing_EQ0181.jpg,upload/baofeishenqing_EQ0182.jpg,upload/baofeishenqing_EQ0183.jpg','2026-04-08 22:34:43','此处文本编辑框是内容详细的操作提示，您可以对现有文字进行修改，包括删除多余文字、替换不合适的表述等；插入图片时，既可以从本地选择图片上传，图片插入后会直接展示在编辑框中，完成操作后点击空白区域即可保存。','是',''),(3,'2026-04-08 14:34:43','3333333333','EQ016','显微镜','成像设备',23,'CX43','upload/baofeishenqing_EQ0161.jpg,upload/baofeishenqing_EQ0162.jpg,upload/baofeishenqing_EQ0163.jpg','2026-04-08 22:34:43','编辑框中展示的默认内容仅为示例，您可任意修改其中的文字表述，比如更换词语、调整语句顺序等；当需要插入图片时，点击编辑框上方的 “插入图片” 按钮，上传图片后即可直接在编辑框中展示。','是',''),(4,'2026-04-08 14:34:43','4444444444','EQ014','酶标仪','免疫检测设备',68,'RT-6100','upload/baofeishenqing_EQ0141.jpg,upload/baofeishenqing_EQ0142.jpg,upload/baofeishenqing_EQ0143.jpg','2026-04-08 22:34:43','此编辑框内已详情的内容，您可以直接对现有文字进行修改，无论是调整文字内容、更正表述还是增减文字数量都能实现；若需插入图片，只需点击上方工具栏的图片图标，选择本地文件或输入图片链接即可插入展示，所有操作完成后提交后系统会保存您的修改。​','是',''),(5,'2026-04-08 14:34:43','5555555555','EQ019','离子色谱仪','分析仪器',55,'ICS-1100','upload/baofeishenqing_EQ0191.jpg,upload/baofeishenqing_EQ0192.jpg,upload/baofeishenqing_EQ0193.jpg','2026-04-08 22:34:43','此编辑框内的默认内容为可编辑状态，您可对文字进行修改，比如调整语句顺序、更换文字内容等；插入图片时，支持上传图片，上传后图片会直接在编辑框中展示，也能一键删除不需要的图片。','是',''),(6,'2026-04-08 14:34:43','6666666666','EQ010','pH计','分析仪器',39,'HQ40d','upload/baofeishenqing_EQ0101.jpg,upload/baofeishenqing_EQ0102.jpg,upload/baofeishenqing_EQ0103.jpg','2026-04-08 22:34:43','此处文本编辑框是内容详细的操作提示，您能轻松对框内文字进行修改，像更正错误文字、调整文字内容等都能实现；插入图片的话，点击工具栏上的图片按钮，选择要插入的图片，图片就会在编辑框中展示，支持随时再次编辑。','是',''),(7,'2026-04-08 14:34:43','7777777777','EQ004','PCR仪','分子生物学设备',29,'T100','upload/baofeishenqing_EQ0041.jpg,upload/baofeishenqing_EQ0042.jpg,upload/baofeishenqing_EQ0043.jpg','2026-04-08 22:34:43','编辑框中的默认提示允许您进行文字修改操作，像更正错别字、调整文字内容等都能轻松完成；插入图片的话，点击工具栏中的图片按钮，选择图片后即可在编辑框中展示，所有修改实时可见且支持随时编辑。​\n','是',''),(8,'2026-04-08 14:34:43','8888888888','EQ012','电泳仪','分子生物学设备',45,'DYY-6C','upload/baofeishenqing_EQ0121.jpg,upload/baofeishenqing_EQ0122.jpg,upload/baofeishenqing_EQ0123.jpg','2026-04-08 22:34:43','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','是','');
/*!40000 ALTER TABLE `baofeishenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chat`
--

DROP TABLE IF EXISTS `chat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chat` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `adminid` bigint(20) DEFAULT NULL COMMENT '管理员id',
  `ask` longtext COLLATE utf8mb4_unicode_ci COMMENT '提问',
  `reply` longtext COLLATE utf8mb4_unicode_ci COMMENT '回复',
  `isreply` int(11) DEFAULT NULL COMMENT '是否回复',
  `isread` int(11) DEFAULT '0' COMMENT '已读/未读(1:已读,0:未读)',
  `uname` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户名',
  `uimage` longtext COLLATE utf8mb4_unicode_ci COMMENT '用户头像',
  `type` int(11) DEFAULT '1' COMMENT '内容类型(1:文本,2:图片,3:视频,4:文件,5:表情)',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='智能助手';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chat`
--

LOCK TABLES `chat` WRITE;
/*!40000 ALTER TABLE `chat` DISABLE KEYS */;
INSERT INTO `chat` VALUES (1,'2026-04-08 14:34:43',1,1,'提问1','回复1',1,1,'用户名1','upload/chat_uimage1.jpg,upload/chat_uimage2.jpg,upload/chat_uimage3.jpg',1),(2,'2026-04-08 14:34:43',2,2,'提问2','回复2',2,2,'用户名2','upload/chat_uimage2.jpg,upload/chat_uimage3.jpg,upload/chat_uimage4.jpg',2),(3,'2026-04-08 14:34:43',3,3,'提问3','回复3',3,3,'用户名3','upload/chat_uimage3.jpg,upload/chat_uimage4.jpg,upload/chat_uimage5.jpg',3),(4,'2026-04-08 14:34:43',4,4,'提问4','回复4',4,4,'用户名4','upload/chat_uimage4.jpg,upload/chat_uimage5.jpg,upload/chat_uimage6.jpg',4),(5,'2026-04-08 14:34:43',5,5,'提问5','回复5',5,5,'用户名5','upload/chat_uimage5.jpg,upload/chat_uimage6.jpg,upload/chat_uimage7.jpg',5),(6,'2026-04-08 14:34:43',6,6,'提问6','回复6',6,6,'用户名6','upload/chat_uimage6.jpg,upload/chat_uimage7.jpg,upload/chat_uimage8.jpg',6),(7,'2026-04-08 14:34:43',7,7,'提问7','回复7',7,7,'用户名7','upload/chat_uimage7.jpg,upload/chat_uimage8.jpg,upload/chat_uimage1.jpg',7),(8,'2026-04-08 14:34:43',8,8,'提问8','回复8',8,8,'用户名8','upload/chat_uimage8.jpg,upload/chat_uimage1.jpg,upload/chat_uimage2.jpg',8);
/*!40000 ALTER TABLE `chat` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `chathelper`
--

DROP TABLE IF EXISTS `chathelper`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `chathelper` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `ask` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '提问',
  `reply` longtext COLLATE utf8mb4_unicode_ci COMMENT '回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='聊天助手表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `chathelper`
--

LOCK TABLES `chathelper` WRITE;
/*!40000 ALTER TABLE `chathelper` DISABLE KEYS */;
INSERT INTO `chathelper` VALUES (1,'2026-04-08 14:34:43','提问1','回复1'),(2,'2026-04-08 14:34:43','提问2','回复2'),(3,'2026-04-08 14:34:43','提问3','回复3'),(4,'2026-04-08 14:34:43','提问4','回复4'),(5,'2026-04-08 14:34:43','提问5','回复5'),(6,'2026-04-08 14:34:43','提问6','回复6'),(7,'2026-04-08 14:34:43','提问7','回复7'),(8,'2026-04-08 14:34:43','提问8','回复8');
/*!40000 ALTER TABLE `chathelper` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(200) DEFAULT NULL COMMENT '配置参数值',
  `url` varchar(500) DEFAULT NULL COMMENT 'url',
  `type` int(11) DEFAULT NULL COMMENT '参数类型',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','upload/picture1.jpg',NULL,1),(2,'picture2','upload/picture2.jpg',NULL,1),(3,'picture3','upload/picture3.jpg',NULL,1),(11,'baidu','{\"appId\":\"49214550\",\"apiKey\":\"7Otjpv2kn0ljQk45qXOXh5MO\",\"secretKey\":\"BMfbXRbTIVaB4C3SbRTtGqDv1wHDvyXS\"}',NULL,2),(21,'bLoginBackgroundImg','',NULL,3),(22,'bRegisterBackgroundImg','',NULL,3),(23,'bIndexBackgroundImg','',NULL,3),(24,'bTopLogo','',NULL,3),(25,'bHomeLogo','',NULL,3),(29,'appLoginBackgroundImg','',NULL,3),(30,'appRegisterBackgroudImg','',NULL,3),(31,'appLoginLogo','',NULL,3),(32,'appRegLogo','',NULL,3);
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussshiyanshi`
--

DROP TABLE IF EXISTS `discussshiyanshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussshiyanshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COLLATE utf8mb4_unicode_ci COMMENT '头像',
  `nickname` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户名',
  `content` longtext COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '评论内容',
  `score` double DEFAULT NULL COMMENT '评分',
  `reply` longtext COLLATE utf8mb4_unicode_ci COMMENT '回复内容',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `istop` int(11) DEFAULT '0' COMMENT '置顶(1:置顶,0:非置顶)',
  `tuserids` longtext COLLATE utf8mb4_unicode_ci COMMENT '赞用户ids',
  `cuserids` longtext COLLATE utf8mb4_unicode_ci COMMENT '踩用户ids',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='实验室评论';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussshiyanshi`
--

LOCK TABLES `discussshiyanshi` WRITE;
/*!40000 ALTER TABLE `discussshiyanshi` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussshiyanshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `discussshiyanzhidao`
--

DROP TABLE IF EXISTS `discussshiyanzhidao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `discussshiyanzhidao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `refid` bigint(20) NOT NULL COMMENT '关联表id',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `avatarurl` longtext COLLATE utf8mb4_unicode_ci COMMENT '头像',
  `nickname` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '用户名',
  `content` longtext COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '评论内容',
  `reply` longtext COLLATE utf8mb4_unicode_ci COMMENT '回复内容',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `istop` int(11) DEFAULT '0' COMMENT '置顶(1:置顶,0:非置顶)',
  `tuserids` longtext COLLATE utf8mb4_unicode_ci COMMENT '赞用户ids',
  `cuserids` longtext COLLATE utf8mb4_unicode_ci COMMENT '踩用户ids',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='实验指导评论';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `discussshiyanzhidao`
--

LOCK TABLES `discussshiyanzhidao` WRITE;
/*!40000 ALTER TABLE `discussshiyanzhidao` DISABLE KEYS */;
/*!40000 ALTER TABLE `discussshiyanzhidao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jiaoshi`
--

DROP TABLE IF EXISTS `jiaoshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `jiaoshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `jiaoshizhanghao` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '教师账号',
  `jiaoshixingming` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '教师姓名',
  `mima` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '密码',
  `xingbie` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '性别',
  `lianxidianhua` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '联系电话',
  `touxiang` longtext COLLATE utf8mb4_unicode_ci COMMENT '头像',
  `yuanxi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '院系',
  `zhuanyefangxiang` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '专业方向',
  PRIMARY KEY (`id`),
  UNIQUE KEY `jiaoshizhanghao` (`jiaoshizhanghao`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='教师';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jiaoshi`
--

LOCK TABLES `jiaoshi` WRITE;
/*!40000 ALTER TABLE `jiaoshi` DISABLE KEYS */;
INSERT INTO `jiaoshi` VALUES (21,'2026-04-08 14:34:43','001','李思远','123456','女','13765432109','upload/jiaoshi_touxiang1.jpg','土木工程学院','专业方向1'),(22,'2026-04-08 14:34:43','006','周雪','123456','女','13678901234','upload/jiaoshi_touxiang2.jpg','机械工程学院','专业方向2'),(23,'2026-04-08 14:34:43','005','张明','123456','男','15212345678','upload/jiaoshi_touxiang3.jpg','商学院','专业方向3'),(24,'2026-04-08 14:34:43','004','高雪','123456','男','13023456789','upload/jiaoshi_touxiang4.jpg','工学院','专业方向4'),(25,'2026-04-08 14:34:43','002','林书豪','123456','男','13654321098','upload/jiaoshi_touxiang5.jpg','新闻与传播学院','专业方向5'),(26,'2026-04-08 14:34:43','007','吴磊','123456','女','15065432109','upload/jiaoshi_touxiang6.jpg','历史学院','专业方向6'),(27,'2026-04-08 14:34:43','003','黄晓彤','123456','女','13276543210','upload/jiaoshi_touxiang7.jpg','自动化学院','专业方向7'),(28,'2026-04-08 14:34:43','008','董珊','123456','女','15178901234','upload/jiaoshi_touxiang8.jpg','药学院','专业方向8');
/*!40000 ALTER TABLE `jiaoshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '标题',
  `introduction` longtext COLLATE utf8mb4_unicode_ci COMMENT '简介',
  `picture` longtext COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '图片',
  `content` longtext COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '内容',
  `name` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '发布人',
  `headportrait` longtext COLLATE utf8mb4_unicode_ci COMMENT '头像',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='通知公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (1,'2026-04-08 14:34:43','实验室举办消防安全演练','增强火灾应急处置能力','upload/news_picture1.jpg','为提高实验室人员消防安全意识与应急处置能力，我校实验室举办消防安全演练。演练模拟火灾场景，组织人员疏散、灭火操作等环节，使参与者熟悉火灾应对流程，掌握灭火器材使用方法','实验室安全主管刘老师','upload/news_headportrait1.jpg'),(2,'2026-04-08 14:34:43','我校实验室举办学术交流活动','诚邀知名学者共探科研前沿','upload/news_picture2.jpg','为促进学术交流，拓宽科研视野，我校实验室于[具体日期]举办学术交流活动。活动邀请了来自国内外多所高校及科研机构的知名学者，围绕[学术主题]展开深入研讨。活动期间，学者们分享最新研究成果，并就热点问题进行交流，现场气氛热烈','实验室科研秘书张明','upload/news_headportrait2.jpg'),(3,'2026-04-08 14:34:43','我校实验室获省级科研奖励','省级奖项肯定科研贡献','upload/news_picture3.jpg','我校实验室凭借在[科研项目名称]的突出成果，荣获省级科研奖励。该项目在[研究领域]取得重要突破，为行业发展提供新思路与方法，获得评审专家高度评价','实验室项目团队代表王教授','upload/news_headportrait3.jpg'),(4,'2026-04-08 14:34:43','实验室举办开放日活动','向社会公众展示科研魅力','upload/news_picture4.jpg','为普及科学知识，提升公众对科研工作认知，我校实验室举办开放日活动。活动吸引众多市民、学生参与，通过实地参观、实验演示、科普讲座等形式，让参观者了解实验室研究内容、科研成果及重要意义','实验室科普专员孙悦','upload/news_headportrait4.jpg'),(5,'2026-04-08 14:34:43','实验室新设备投入使用','先进设备助力科研水平提升','upload/news_picture5.jpg','经过前期调研、采购与安装调试，我校实验室新一批先进设备正式投入使用。这批设备包括[列举设备名称]，将极大提升实验室在[研究方向]的检测、分析能力，为科研项目开展提供有力支撑','实验室设备管理员赵强','upload/news_headportrait5.jpg'),(6,'2026-04-08 14:34:43','实验室启用新的信息化管理系统','信息化助力实验室高效管理','upload/news_picture6.jpg','为提升实验室管理效率与服务水平，我校实验室启用新的信息化管理系统。该系统涵盖设备管理、项目管理、人员管理等模块，实现实验室管理信息化、智能化，提高工作效率与决策科学性','实验室信息化负责人唐老师','upload/news_headportrait6.jpg'),(7,'2026-04-08 14:34:43','实验室参与制定行业标准','提升我校在行业内话语权','upload/news_picture7.jpg','我校实验室凭借在相关领域的深厚研究积累，受邀参与制定行业标准。此次参与标准制定，将充分体现我校科研成果，提升我校在行业内的影响力与话语权，推动行业规范化发展','标准制定项目负责人李教授','upload/news_headportrait7.jpg'),(8,'2026-04-08 14:34:43','实验室研究生在国际期刊发表高水平论文','展现我校研究生科研实力','upload/news_picture8.jpg','我校实验室[研究生姓名]以第一作者身份在国际知名期刊《[期刊名称]》发表高水平论文。论文围绕[研究主题]展开深入研究，提出新理论与方法，得到国际同行高度认可，彰显我校研究生扎实科研能力与创新精神','研究生导师陈教授','upload/news_headportrait8.jpg');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `popupremind`
--

DROP TABLE IF EXISTS `popupremind`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `popupremind` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '发布人id',
  `role` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '角色',
  `title` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '标题',
  `type` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT '个人' COMMENT '类型',
  `brief` longtext COLLATE utf8mb4_unicode_ci COMMENT '简介',
  `content` longtext COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '内容',
  `remindtime` datetime DEFAULT NULL COMMENT '提醒时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='弹窗提醒';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `popupremind`
--

LOCK TABLES `popupremind` WRITE;
/*!40000 ALTER TABLE `popupremind` DISABLE KEYS */;
INSERT INTO `popupremind` VALUES (9,'2026-04-08 14:39:31',11,'xuesheng','测试','个人','项目的完美演示必须配合真实的数据体现，会有不一样的观感!真实数据取材请使用百度搜索或者淘宝网','<p>项目的完美演示必须配合真实的数据体现，会有不一样的观感!真实数据取材请使用百度搜索或者淘宝网</p>','2026-04-08 22:39:25');
/*!40000 ALTER TABLE `popupremind` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quxiaoshebeiyuyue`
--

DROP TABLE IF EXISTS `quxiaoshebeiyuyue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quxiaoshebeiyuyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '预约编号',
  `shebeibianhao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备编号',
  `shebeimingcheng` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备名称',
  `shebeifenlei` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备分类',
  `yuanxi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '院系',
  `shuliang` int(11) DEFAULT NULL COMMENT '借用数量',
  `fengmian` longtext COLLATE utf8mb4_unicode_ci COMMENT '封面',
  `xinghao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '型号',
  `jieyongshijian` datetime DEFAULT NULL COMMENT '借用时间',
  `xueshengxuehao` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生姓名',
  `shoujihao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `quxiaoshuoming` longtext COLLATE utf8mb4_unicode_ci COMMENT '取消说明',
  `sfsh` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COLLATE utf8mb4_unicode_ci COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuyuebianhao` (`yuyuebianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='取消设备预约';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quxiaoshebeiyuyue`
--

LOCK TABLES `quxiaoshebeiyuyue` WRITE;
/*!40000 ALTER TABLE `quxiaoshebeiyuyue` DISABLE KEYS */;
INSERT INTO `quxiaoshebeiyuyue` VALUES (1,'2026-04-08 14:34:43','1111111111','EQ006','恒温培养箱','温控设备','土木工程学院',78,'upload/quxiaoshebeiyuyue_实验室火灾报警疏散与救援预案1.jpg,upload/quxiaoshebeiyuyue_实验室火灾报警疏散与救援预案2.jpg,upload/quxiaoshebeiyuyue_实验室火灾报警疏散与救援预案3.jpg','DHP-9052','2026-04-08 22:34:43','001','李思远','13489012345','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','是',''),(2,'2026-04-08 14:34:43','2222222222','EQ018','超低温冰箱','冷藏设备','机械工程学院',26,'upload/quxiaoshebeiyuyue_电气设备接地电阻检测与绝缘防护1.jpg,upload/quxiaoshebeiyuyue_电气设备接地电阻检测与绝缘防护2.jpg,upload/quxiaoshebeiyuyue_电气设备接地电阻检测与绝缘防护3.jpg','DW-86L386','2026-04-08 22:34:43','006','周雪','13512345678','此处文本编辑框是内容详细的操作提示，您可以对现有文字进行修改，包括删除多余文字、替换不合适的表述等；插入图片时，既可以从本地选择图片上传，图片插入后会直接展示在编辑框中，完成操作后点击空白区域即可保存。','是',''),(3,'2026-04-08 14:34:43','3333333333','EQ016','显微镜','成像设备','商学院',23,'upload/quxiaoshebeiyuyue_精密仪器防尘防潮与定期校准要求1.jpg,upload/quxiaoshebeiyuyue_精密仪器防尘防潮与定期校准要求2.jpg,upload/quxiaoshebeiyuyue_精密仪器防尘防潮与定期校准要求3.jpg','CX43','2026-04-08 22:34:43','005','张明','13501234567','编辑框中展示的默认内容仅为示例，您可任意修改其中的文字表述，比如更换词语、调整语句顺序等；当需要插入图片时，点击编辑框上方的 “插入图片” 按钮，上传图片后即可直接在编辑框中展示。','是',''),(4,'2026-04-08 14:34:43','4444444444','EQ014','酶标仪','免疫检测设备','工学院',68,'upload/quxiaoshebeiyuyue_化学品泄漏分级应急处置方法1.jpg,upload/quxiaoshebeiyuyue_化学品泄漏分级应急处置方法2.jpg,upload/quxiaoshebeiyuyue_化学品泄漏分级应急处置方法3.jpg','RT-6100','2026-04-08 22:34:43','004','高雪','13456789012','此编辑框内已详情的内容，您可以直接对现有文字进行修改，无论是调整文字内容、更正表述还是增减文字数量都能实现；若需插入图片，只需点击上方工具栏的图片图标，选择本地文件或输入图片链接即可插入展示，所有操作完成后提交后系统会保存您的修改。​','是',''),(5,'2026-04-08 14:34:43','5555555555','EQ019','离子色谱仪','分析仪器','新闻与传播学院',55,'upload/quxiaoshebeiyuyue_实验室危险化学品废弃物处置规范1.jpg,upload/quxiaoshebeiyuyue_实验室危险化学品废弃物处置规范2.jpg,upload/quxiaoshebeiyuyue_实验室危险化学品废弃物处置规范3.jpg','ICS-1100','2026-04-08 22:34:43','002','林书豪','13412345678','此编辑框内的默认内容为可编辑状态，您可对文字进行修改，比如调整语句顺序、更换文字内容等；插入图片时，支持上传图片，上传后图片会直接在编辑框中展示，也能一键删除不需要的图片。','是',''),(6,'2026-04-08 14:34:43','6666666666','EQ010','pH计','分析仪器','历史学院',39,'upload/quxiaoshebeiyuyue_高压仪器气密性检查与泄压流程1.jpg,upload/quxiaoshebeiyuyue_高压仪器气密性检查与泄压流程2.jpg,upload/quxiaoshebeiyuyue_高压仪器气密性检查与泄压流程3.jpg','HQ40d','2026-04-08 22:34:43','007','吴磊','13434567890','此处文本编辑框是内容详细的操作提示，您能轻松对框内文字进行修改，像更正错误文字、调整文字内容等都能实现；插入图片的话，点击工具栏上的图片按钮，选择要插入的图片，图片就会在编辑框中展示，支持随时再次编辑。','是',''),(7,'2026-04-08 14:34:43','7777777777','EQ004','PCR仪','分子生物学设备','自动化学院',29,'upload/quxiaoshebeiyuyue_电气火灾灭火器材选择与断电操作1.jpg,upload/quxiaoshebeiyuyue_电气火灾灭火器材选择与断电操作2.jpg,upload/quxiaoshebeiyuyue_电气火灾灭火器材选择与断电操作3.jpg','T100','2026-04-08 22:34:43','003','黄晓彤','13545678901','编辑框中的默认提示允许您进行文字修改操作，像更正错别字、调整文字内容等都能轻松完成；插入图片的话，点击工具栏中的图片按钮，选择图片后即可在编辑框中展示，所有修改实时可见且支持随时编辑。​\n','是',''),(8,'2026-04-08 14:34:43','8888888888','EQ012','电泳仪','分子生物学设备','药学院',45,'upload/quxiaoshebeiyuyue_实验室常见伤害分级急救处理流程1.jpg,upload/quxiaoshebeiyuyue_实验室常见伤害分级急救处理流程2.jpg,upload/quxiaoshebeiyuyue_实验室常见伤害分级急救处理流程3.jpg','DYY-6C','2026-04-08 22:34:43','008','董珊','13467890123','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','是','');
/*!40000 ALTER TABLE `quxiaoshebeiyuyue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `quxiaoshiyanshiyuyue`
--

DROP TABLE IF EXISTS `quxiaoshiyanshiyuyue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `quxiaoshiyanshiyuyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '编号',
  `yuyuebianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '预约编号',
  `shiyanshimingcheng` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室名称',
  `shiyanshileixing` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室类型',
  `tupian` longtext COLLATE utf8mb4_unicode_ci COMMENT '图片',
  `yuanxi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '院系',
  `shiyanshiweizhi` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '实验室位置',
  `xueshengxuehao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生姓名',
  `shoujihao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `yongtu` longtext COLLATE utf8mb4_unicode_ci COMMENT '用途',
  `appointmentdate` date DEFAULT NULL COMMENT '预约日期',
  `timeperiod` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '时间段',
  `quxiaoshijian` datetime DEFAULT NULL COMMENT '取消时间',
  `quxiaobeizhu` longtext COLLATE utf8mb4_unicode_ci COMMENT '取消备注',
  `sfsh` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COLLATE utf8mb4_unicode_ci COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='取消实验室预约';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quxiaoshiyanshiyuyue`
--

LOCK TABLES `quxiaoshiyanshiyuyue` WRITE;
/*!40000 ALTER TABLE `quxiaoshiyanshiyuyue` DISABLE KEYS */;
INSERT INTO `quxiaoshiyanshiyuyue` VALUES (1,'2026-04-08 14:34:43','4003','预约编号1','材料测试室','应用研究','upload/quxiaoshiyanshiyuyue_材料测试室1.jpg,upload/quxiaoshiyanshiyuyue_材料测试室2.jpg,upload/quxiaoshiyanshiyuyue_材料测试室3.jpg','土木工程学院','工程楼2层','001','李思远','13765432109','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','2026-04-08','时间段1','2026-04-08 22:34:43','取消备注1','是',''),(2,'2026-04-08 14:34:43','4007','预约编号2','物理实验室','基础研究','upload/quxiaoshiyanshiyuyue_物理实验室1.jpg,upload/quxiaoshiyanshiyuyue_物理实验室2.jpg,upload/quxiaoshiyanshiyuyue_物理实验室3.jpg','机械工程学院','理科楼B座4层','006','周雪','13678901234','此处文本编辑框是内容详细的操作提示，您可以对现有文字进行修改，包括删除多余文字、替换不合适的表述等；插入图片时，既可以从本地选择图片上传，图片插入后会直接展示在编辑框中，完成操作后点击空白区域即可保存。','2026-04-08','时间段2','2026-04-08 22:34:43','取消备注2','是',''),(3,'2026-04-08 14:34:43','4002','预约编号3','电子测试室','检测服务','upload/quxiaoshiyanshiyuyue_电子测试室1.jpg,upload/quxiaoshiyanshiyuyue_电子测试室2.jpg,upload/quxiaoshiyanshiyuyue_电子测试室3.jpg','商学院','电信楼5层','005','张明','15212345678','编辑框中展示的默认内容仅为示例，您可任意修改其中的文字表述，比如更换词语、调整语句顺序等；当需要插入图片时，点击编辑框上方的 “插入图片” 按钮，上传图片后即可直接在编辑框中展示。','2026-04-08','时间段3','2026-04-08 22:34:43','取消备注3','是',''),(4,'2026-04-08 14:34:43','4008','预约编号4','食品检测室','检测服务','upload/quxiaoshiyanshiyuyue_食品检测室1.jpg,upload/quxiaoshiyanshiyuyue_食品检测室2.jpg,upload/quxiaoshiyanshiyuyue_食品检测室3.jpg','工学院','食品楼2层','004','高雪','13023456789','此编辑框内已详情的内容，您可以直接对现有文字进行修改，无论是调整文字内容、更正表述还是增减文字数量都能实现；若需插入图片，只需点击上方工具栏的图片图标，选择本地文件或输入图片链接即可插入展示，所有操作完成后提交后系统会保存您的修改。​','2026-04-08','时间段4','2026-04-08 22:34:43','取消备注4','是',''),(5,'2026-04-08 14:34:43','4004','预约编号5','生化分析室','基础研究','upload/quxiaoshiyanshiyuyue_生化分析室1.jpg,upload/quxiaoshiyanshiyuyue_生化分析室2.jpg,upload/quxiaoshiyanshiyuyue_生化分析室3.jpg','新闻与传播学院','实验楼A座5层','002','林书豪','13654321098','此编辑框内的默认内容为可编辑状态，您可对文字进行修改，比如调整语句顺序、更换文字内容等；插入图片时，支持上传图片，上传后图片会直接在编辑框中展示，也能一键删除不需要的图片。','2026-04-08','时间段5','2026-04-08 22:34:43','取消备注5','是',''),(6,'2026-04-08 14:34:43','4001','预约编号6','航空实验室','应用研究','upload/quxiaoshiyanshiyuyue_航空实验室1.jpg,upload/quxiaoshiyanshiyuyue_航空实验室2.jpg,upload/quxiaoshiyanshiyuyue_航空实验室3.jpg','历史学院','航空楼5层','007','吴磊','15065432109','此处文本编辑框是内容详细的操作提示，您能轻松对框内文字进行修改，像更正错误文字、调整文字内容等都能实现；插入图片的话，点击工具栏上的图片按钮，选择要插入的图片，图片就会在编辑框中展示，支持随时再次编辑。','2026-04-08','时间段6','2026-04-08 22:34:43','取消备注6','是',''),(7,'2026-04-08 14:34:43','4005','预约编号7','海洋实验室','基础研究','upload/quxiaoshiyanshiyuyue_海洋实验室1.jpg,upload/quxiaoshiyanshiyuyue_海洋实验室2.jpg,upload/quxiaoshiyanshiyuyue_海洋实验室3.jpg','自动化学院','海洋楼4层','003','黄晓彤','13276543210','编辑框中的默认提示允许您进行文字修改操作，像更正错别字、调整文字内容等都能轻松完成；插入图片的话，点击工具栏中的图片按钮，选择图片后即可在编辑框中展示，所有修改实时可见且支持随时编辑。​\n','2026-04-08','时间段7','2026-04-08 22:34:43','取消备注7','是',''),(8,'2026-04-08 14:34:43','4006','预约编号8','农业实验室','应用研究','upload/quxiaoshiyanshiyuyue_农业实验室1.jpg,upload/quxiaoshiyanshiyuyue_农业实验室2.jpg,upload/quxiaoshiyanshiyuyue_农业实验室3.jpg','药学院','农科楼2层','008','董珊','15178901234','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','2026-04-08','时间段8','2026-04-08 22:34:43','取消备注8','是','');
/*!40000 ALTER TABLE `quxiaoshiyanshiyuyue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shebeifenlei`
--

DROP TABLE IF EXISTS `shebeifenlei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shebeifenlei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shebeifenlei` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '设备分类',
  PRIMARY KEY (`id`),
  UNIQUE KEY `shebeifenlei` (`shebeifenlei`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='设备分类';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shebeifenlei`
--

LOCK TABLES `shebeifenlei` WRITE;
/*!40000 ALTER TABLE `shebeifenlei` DISABLE KEYS */;
INSERT INTO `shebeifenlei` VALUES (1,'2026-04-08 14:34:43','温控设备'),(2,'2026-04-08 14:34:43','冷藏设备'),(3,'2026-04-08 14:34:43','成像设备'),(4,'2026-04-08 14:34:43','免疫检测设备'),(5,'2026-04-08 14:34:43','分析仪器'),(6,'2026-04-08 14:34:43','分子生物学设备'),(7,'2026-04-08 14:34:43','设备分类7'),(8,'2026-04-08 14:34:43','设备分类8');
/*!40000 ALTER TABLE `shebeifenlei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shebeiguihai`
--

DROP TABLE IF EXISTS `shebeiguihai`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shebeiguihai` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '预约编号',
  `shebeibianhao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备编号',
  `shebeimingcheng` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备名称',
  `shebeifenlei` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备分类',
  `yuanxi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '院系',
  `shuliang` int(11) DEFAULT NULL COMMENT '归还数量',
  `fengmian` longtext COLLATE utf8mb4_unicode_ci COMMENT '封面',
  `xinghao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '型号',
  `xueshengxuehao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生姓名',
  `shoujihao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `guihaishijian` datetime DEFAULT NULL COMMENT '归还时间',
  `sfsh` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COLLATE utf8mb4_unicode_ci COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='设备归还';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shebeiguihai`
--

LOCK TABLES `shebeiguihai` WRITE;
/*!40000 ALTER TABLE `shebeiguihai` DISABLE KEYS */;
INSERT INTO `shebeiguihai` VALUES (1,'2026-04-08 14:34:43','预约编号1','EQ006','恒温培养箱','温控设备','土木工程学院',78,'upload/shebeiguihai_EQ0061.jpg,upload/shebeiguihai_EQ0062.jpg,upload/shebeiguihai_EQ0063.jpg','DHP-9052','001','李思远','13489012345','2026-04-08 22:34:43','是',''),(2,'2026-04-08 14:34:43','预约编号2','EQ018','超低温冰箱','冷藏设备','机械工程学院',26,'upload/shebeiguihai_EQ0181.jpg,upload/shebeiguihai_EQ0182.jpg,upload/shebeiguihai_EQ0183.jpg','DW-86L386','006','周雪','13512345678','2026-04-08 22:34:43','是',''),(3,'2026-04-08 14:34:43','预约编号3','EQ016','显微镜','成像设备','商学院',23,'upload/shebeiguihai_EQ0161.jpg,upload/shebeiguihai_EQ0162.jpg,upload/shebeiguihai_EQ0163.jpg','CX43','005','张明','13501234567','2026-04-08 22:34:43','是',''),(4,'2026-04-08 14:34:43','预约编号4','EQ014','酶标仪','免疫检测设备','工学院',68,'upload/shebeiguihai_EQ0141.jpg,upload/shebeiguihai_EQ0142.jpg,upload/shebeiguihai_EQ0143.jpg','RT-6100','004','高雪','13456789012','2026-04-08 22:34:43','是',''),(5,'2026-04-08 14:34:43','预约编号5','EQ019','离子色谱仪','分析仪器','新闻与传播学院',55,'upload/shebeiguihai_EQ0191.jpg,upload/shebeiguihai_EQ0192.jpg,upload/shebeiguihai_EQ0193.jpg','ICS-1100','002','林书豪','13412345678','2026-04-08 22:34:43','是',''),(6,'2026-04-08 14:34:43','预约编号6','EQ010','pH计','分析仪器','历史学院',39,'upload/shebeiguihai_EQ0101.jpg,upload/shebeiguihai_EQ0102.jpg,upload/shebeiguihai_EQ0103.jpg','HQ40d','007','吴磊','13434567890','2026-04-08 22:34:43','是',''),(7,'2026-04-08 14:34:43','预约编号7','EQ004','PCR仪','分子生物学设备','自动化学院',29,'upload/shebeiguihai_EQ0041.jpg,upload/shebeiguihai_EQ0042.jpg,upload/shebeiguihai_EQ0043.jpg','T100','003','黄晓彤','13545678901','2026-04-08 22:34:43','是',''),(8,'2026-04-08 14:34:43','预约编号8','EQ012','电泳仪','分子生物学设备','药学院',45,'upload/shebeiguihai_EQ0121.jpg,upload/shebeiguihai_EQ0122.jpg,upload/shebeiguihai_EQ0123.jpg','DYY-6C','008','董珊','13467890123','2026-04-08 22:34:43','是','');
/*!40000 ALTER TABLE `shebeiguihai` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shebeishiyongbaogao`
--

DROP TABLE IF EXISTS `shebeishiyongbaogao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shebeishiyongbaogao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '预约编号',
  `shebeibianhao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备编号',
  `shebeimingcheng` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备名称',
  `shebeifenlei` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备分类',
  `yuanxi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '院系',
  `fengmian` longtext COLLATE utf8mb4_unicode_ci COMMENT '封面',
  `xinghao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '型号',
  `shangbaoshijian` datetime DEFAULT NULL COMMENT '上报时间',
  `xueshengxuehao` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生姓名',
  `shoujihao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `shiyongqingkuang` longtext COLLATE utf8mb4_unicode_ci COMMENT '使用情况',
  `haosunfankui` longtext COLLATE utf8mb4_unicode_ci COMMENT '耗损反馈',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuyuebianhao` (`yuyuebianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='设备使用报告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shebeishiyongbaogao`
--

LOCK TABLES `shebeishiyongbaogao` WRITE;
/*!40000 ALTER TABLE `shebeishiyongbaogao` DISABLE KEYS */;
INSERT INTO `shebeishiyongbaogao` VALUES (1,'2026-04-08 14:34:43','1111111111','EQ006','恒温培养箱','温控设备','土木工程学院','upload/shebeishiyongbaogao_实验室火灾报警疏散与救援预案1.jpg,upload/shebeishiyongbaogao_实验室火灾报警疏散与救援预案2.jpg,upload/shebeishiyongbaogao_实验室火灾报警疏散与救援预案3.jpg','DHP-9052','2026-04-08 22:34:43','001','李思远','13489012345','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','耗损反馈1'),(2,'2026-04-08 14:34:43','2222222222','EQ018','超低温冰箱','冷藏设备','机械工程学院','upload/shebeishiyongbaogao_电气设备接地电阻检测与绝缘防护1.jpg,upload/shebeishiyongbaogao_电气设备接地电阻检测与绝缘防护2.jpg,upload/shebeishiyongbaogao_电气设备接地电阻检测与绝缘防护3.jpg','DW-86L386','2026-04-08 22:34:43','006','周雪','13512345678','此处文本编辑框是内容详细的操作提示，您可以对现有文字进行修改，包括删除多余文字、替换不合适的表述等；插入图片时，既可以从本地选择图片上传，图片插入后会直接展示在编辑框中，完成操作后点击空白区域即可保存。','耗损反馈2'),(3,'2026-04-08 14:34:43','3333333333','EQ016','显微镜','成像设备','商学院','upload/shebeishiyongbaogao_精密仪器防尘防潮与定期校准要求1.jpg,upload/shebeishiyongbaogao_精密仪器防尘防潮与定期校准要求2.jpg,upload/shebeishiyongbaogao_精密仪器防尘防潮与定期校准要求3.jpg','CX43','2026-04-08 22:34:43','005','张明','13501234567','编辑框中展示的默认内容仅为示例，您可任意修改其中的文字表述，比如更换词语、调整语句顺序等；当需要插入图片时，点击编辑框上方的 “插入图片” 按钮，上传图片后即可直接在编辑框中展示。','耗损反馈3'),(4,'2026-04-08 14:34:43','4444444444','EQ014','酶标仪','免疫检测设备','工学院','upload/shebeishiyongbaogao_化学品泄漏分级应急处置方法1.jpg,upload/shebeishiyongbaogao_化学品泄漏分级应急处置方法2.jpg,upload/shebeishiyongbaogao_化学品泄漏分级应急处置方法3.jpg','RT-6100','2026-04-08 22:34:43','004','高雪','13456789012','此编辑框内已详情的内容，您可以直接对现有文字进行修改，无论是调整文字内容、更正表述还是增减文字数量都能实现；若需插入图片，只需点击上方工具栏的图片图标，选择本地文件或输入图片链接即可插入展示，所有操作完成后提交后系统会保存您的修改。​','耗损反馈4'),(5,'2026-04-08 14:34:43','5555555555','EQ019','离子色谱仪','分析仪器','新闻与传播学院','upload/shebeishiyongbaogao_实验室危险化学品废弃物处置规范1.jpg,upload/shebeishiyongbaogao_实验室危险化学品废弃物处置规范2.jpg,upload/shebeishiyongbaogao_实验室危险化学品废弃物处置规范3.jpg','ICS-1100','2026-04-08 22:34:43','002','林书豪','13412345678','此编辑框内的默认内容为可编辑状态，您可对文字进行修改，比如调整语句顺序、更换文字内容等；插入图片时，支持上传图片，上传后图片会直接在编辑框中展示，也能一键删除不需要的图片。','耗损反馈5'),(6,'2026-04-08 14:34:43','6666666666','EQ010','pH计','分析仪器','历史学院','upload/shebeishiyongbaogao_高压仪器气密性检查与泄压流程1.jpg,upload/shebeishiyongbaogao_高压仪器气密性检查与泄压流程2.jpg,upload/shebeishiyongbaogao_高压仪器气密性检查与泄压流程3.jpg','HQ40d','2026-04-08 22:34:43','007','吴磊','13434567890','此处文本编辑框是内容详细的操作提示，您能轻松对框内文字进行修改，像更正错误文字、调整文字内容等都能实现；插入图片的话，点击工具栏上的图片按钮，选择要插入的图片，图片就会在编辑框中展示，支持随时再次编辑。','耗损反馈6'),(7,'2026-04-08 14:34:43','7777777777','EQ004','PCR仪','分子生物学设备','自动化学院','upload/shebeishiyongbaogao_电气火灾灭火器材选择与断电操作1.jpg,upload/shebeishiyongbaogao_电气火灾灭火器材选择与断电操作2.jpg,upload/shebeishiyongbaogao_电气火灾灭火器材选择与断电操作3.jpg','T100','2026-04-08 22:34:43','003','黄晓彤','13545678901','编辑框中的默认提示允许您进行文字修改操作，像更正错别字、调整文字内容等都能轻松完成；插入图片的话，点击工具栏中的图片按钮，选择图片后即可在编辑框中展示，所有修改实时可见且支持随时编辑。​\n','耗损反馈7'),(8,'2026-04-08 14:34:43','8888888888','EQ012','电泳仪','分子生物学设备','药学院','upload/shebeishiyongbaogao_实验室常见伤害分级急救处理流程1.jpg,upload/shebeishiyongbaogao_实验室常见伤害分级急救处理流程2.jpg,upload/shebeishiyongbaogao_实验室常见伤害分级急救处理流程3.jpg','DYY-6C','2026-04-08 22:34:43','008','董珊','13467890123','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','耗损反馈8');
/*!40000 ALTER TABLE `shebeishiyongbaogao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shebeiyuyue`
--

DROP TABLE IF EXISTS `shebeiyuyue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shebeiyuyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '预约编号',
  `shebeibianhao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备编号',
  `shebeimingcheng` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备名称',
  `shebeifenlei` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备分类',
  `yuanxi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '院系',
  `shuliang` int(11) DEFAULT NULL COMMENT '借用数量',
  `fengmian` longtext COLLATE utf8mb4_unicode_ci COMMENT '封面',
  `xinghao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '型号',
  `jieyongshijian` datetime DEFAULT NULL COMMENT '借用时间',
  `xueshengxuehao` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生姓名',
  `shoujihao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `guihaizhuangtai` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '归还状态',
  `yongtu` longtext COLLATE utf8mb4_unicode_ci COMMENT '用途',
  `sfsh` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COLLATE utf8mb4_unicode_ci COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuyuebianhao` (`yuyuebianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='设备预约';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shebeiyuyue`
--

LOCK TABLES `shebeiyuyue` WRITE;
/*!40000 ALTER TABLE `shebeiyuyue` DISABLE KEYS */;
INSERT INTO `shebeiyuyue` VALUES (1,'2026-04-08 14:34:43','1111111111','EQ006','恒温培养箱','温控设备','土木工程学院',78,'upload/shebeiyuyue_实验室火灾报警疏散与救援预案1.jpg,upload/shebeiyuyue_实验室火灾报警疏散与救援预案2.jpg,upload/shebeiyuyue_实验室火灾报警疏散与救援预案3.jpg','DHP-9052','2026-04-08 22:34:43','001','李思远','13489012345','已归还','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','是',''),(2,'2026-04-08 14:34:43','2222222222','EQ018','超低温冰箱','冷藏设备','机械工程学院',26,'upload/shebeiyuyue_电气设备接地电阻检测与绝缘防护1.jpg,upload/shebeiyuyue_电气设备接地电阻检测与绝缘防护2.jpg,upload/shebeiyuyue_电气设备接地电阻检测与绝缘防护3.jpg','DW-86L386','2026-04-08 22:34:43','006','周雪','13512345678','已归还','此处文本编辑框是内容详细的操作提示，您可以对现有文字进行修改，包括删除多余文字、替换不合适的表述等；插入图片时，既可以从本地选择图片上传，图片插入后会直接展示在编辑框中，完成操作后点击空白区域即可保存。','是',''),(3,'2026-04-08 14:34:43','3333333333','EQ016','显微镜','成像设备','商学院',23,'upload/shebeiyuyue_精密仪器防尘防潮与定期校准要求1.jpg,upload/shebeiyuyue_精密仪器防尘防潮与定期校准要求2.jpg,upload/shebeiyuyue_精密仪器防尘防潮与定期校准要求3.jpg','CX43','2026-04-08 22:34:43','005','张明','13501234567','已归还','编辑框中展示的默认内容仅为示例，您可任意修改其中的文字表述，比如更换词语、调整语句顺序等；当需要插入图片时，点击编辑框上方的 “插入图片” 按钮，上传图片后即可直接在编辑框中展示。','是',''),(4,'2026-04-08 14:34:43','4444444444','EQ014','酶标仪','免疫检测设备','工学院',68,'upload/shebeiyuyue_化学品泄漏分级应急处置方法1.jpg,upload/shebeiyuyue_化学品泄漏分级应急处置方法2.jpg,upload/shebeiyuyue_化学品泄漏分级应急处置方法3.jpg','RT-6100','2026-04-08 22:34:43','004','高雪','13456789012','已归还','此编辑框内已详情的内容，您可以直接对现有文字进行修改，无论是调整文字内容、更正表述还是增减文字数量都能实现；若需插入图片，只需点击上方工具栏的图片图标，选择本地文件或输入图片链接即可插入展示，所有操作完成后提交后系统会保存您的修改。​','是',''),(5,'2026-04-08 14:34:43','5555555555','EQ019','离子色谱仪','分析仪器','新闻与传播学院',55,'upload/shebeiyuyue_实验室危险化学品废弃物处置规范1.jpg,upload/shebeiyuyue_实验室危险化学品废弃物处置规范2.jpg,upload/shebeiyuyue_实验室危险化学品废弃物处置规范3.jpg','ICS-1100','2026-04-08 22:34:43','002','林书豪','13412345678','已归还','此编辑框内的默认内容为可编辑状态，您可对文字进行修改，比如调整语句顺序、更换文字内容等；插入图片时，支持上传图片，上传后图片会直接在编辑框中展示，也能一键删除不需要的图片。','是',''),(6,'2026-04-08 14:34:43','6666666666','EQ010','pH计','分析仪器','历史学院',39,'upload/shebeiyuyue_高压仪器气密性检查与泄压流程1.jpg,upload/shebeiyuyue_高压仪器气密性检查与泄压流程2.jpg,upload/shebeiyuyue_高压仪器气密性检查与泄压流程3.jpg','HQ40d','2026-04-08 22:34:43','007','吴磊','13434567890','已归还','此处文本编辑框是内容详细的操作提示，您能轻松对框内文字进行修改，像更正错误文字、调整文字内容等都能实现；插入图片的话，点击工具栏上的图片按钮，选择要插入的图片，图片就会在编辑框中展示，支持随时再次编辑。','是',''),(7,'2026-04-08 14:34:43','7777777777','EQ004','PCR仪','分子生物学设备','自动化学院',29,'upload/shebeiyuyue_电气火灾灭火器材选择与断电操作1.jpg,upload/shebeiyuyue_电气火灾灭火器材选择与断电操作2.jpg,upload/shebeiyuyue_电气火灾灭火器材选择与断电操作3.jpg','T100','2026-04-08 22:34:43','003','黄晓彤','13545678901','已归还','编辑框中的默认提示允许您进行文字修改操作，像更正错别字、调整文字内容等都能轻松完成；插入图片的话，点击工具栏中的图片按钮，选择图片后即可在编辑框中展示，所有修改实时可见且支持随时编辑。​\n','是',''),(8,'2026-04-08 14:34:43','8888888888','EQ012','电泳仪','分子生物学设备','药学院',45,'upload/shebeiyuyue_实验室常见伤害分级急救处理流程1.jpg,upload/shebeiyuyue_实验室常见伤害分级急救处理流程2.jpg,upload/shebeiyuyue_实验室常见伤害分级急救处理流程3.jpg','DYY-6C','2026-04-08 22:34:43','008','董珊','13467890123','已归还','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','是','');
/*!40000 ALTER TABLE `shebeiyuyue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiyanshebei`
--

DROP TABLE IF EXISTS `shiyanshebei`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiyanshebei` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `shebeibianhao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备编号',
  `shebeimingcheng` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备名称',
  `shebeifenlei` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备分类',
  `yuanxi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '院系',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `fengmian` longtext COLLATE utf8mb4_unicode_ci COMMENT '封面',
  `cunfangdidian` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '存放地点',
  `xinghao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '型号',
  `shiheshiyan` longtext COLLATE utf8mb4_unicode_ci COMMENT '适合实验',
  `shiyongshuoming` longtext COLLATE utf8mb4_unicode_ci COMMENT '使用说明',
  `jianjie` longtext COLLATE utf8mb4_unicode_ci COMMENT '简介',
  `onshelves` int(11) DEFAULT NULL COMMENT '上下架',
  `storeupnum` int(11) DEFAULT '0' COMMENT '收藏数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='实验设备';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiyanshebei`
--

LOCK TABLES `shiyanshebei` WRITE;
/*!40000 ALTER TABLE `shiyanshebei` DISABLE KEYS */;
INSERT INTO `shiyanshebei` VALUES (1,'2026-04-08 14:34:43','EQ006','恒温培养箱','温控设备','土木工程学院',78,'upload/shiyanshebei_实验室火灾报警疏散与救援预案1.jpg,upload/shiyanshebei_实验室火灾报警疏散与救援预案2.jpg,upload/shiyanshebei_实验室火灾报警疏散与救援预案3.jpg','工程楼2层','DHP-9052','微生物培养','设定37℃恒温培养','电热恒温培养箱',1,1),(2,'2026-04-08 14:34:43','EQ018','超低温冰箱','冷藏设备','机械工程学院',26,'upload/shiyanshebei_电气设备接地电阻检测与绝缘防护1.jpg,upload/shiyanshebei_电气设备接地电阻检测与绝缘防护2.jpg,upload/shiyanshebei_电气设备接地电阻检测与绝缘防护3.jpg','理科楼B座4层','DW-86L386','生物样品保存','设置-80℃保存温度','立式超低温保存箱',1,2),(3,'2026-04-08 14:34:43','EQ016','显微镜','成像设备','商学院',23,'upload/shiyanshebei_精密仪器防尘防潮与定期校准要求1.jpg,upload/shiyanshebei_精密仪器防尘防潮与定期校准要求2.jpg,upload/shiyanshebei_精密仪器防尘防潮与定期校准要求3.jpg','电信楼5层','CX43','细胞观察','调节粗微调焦旋钮至清晰','生物显微镜',1,3),(4,'2026-04-08 14:34:43','EQ014','酶标仪','免疫检测设备','工学院',68,'upload/shiyanshebei_化学品泄漏分级应急处置方法1.jpg,upload/shiyanshebei_化学品泄漏分级应急处置方法2.jpg,upload/shiyanshebei_化学品泄漏分级应急处置方法3.jpg','食品楼2层','RT-6100','ELISA实验','设置450nm波长检测','全自动酶标分析仪',1,4),(5,'2026-04-08 14:34:43','EQ019','离子色谱仪','分析仪器','新闻与传播学院',55,'upload/shiyanshebei_实验室危险化学品废弃物处置规范1.jpg,upload/shiyanshebei_实验室危险化学品废弃物处置规范2.jpg,upload/shiyanshebei_实验室危险化学品废弃物处置规范3.jpg','实验楼A座5层','ICS-1100','离子含量测定','按标准方法配制流动相','离子色谱分析系统',1,5),(6,'2026-04-08 14:34:43','EQ010','pH计','分析仪器','历史学院',39,'upload/shiyanshebei_高压仪器气密性检查与泄压流程1.jpg,upload/shiyanshebei_高压仪器气密性检查与泄压流程2.jpg,upload/shiyanshebei_高压仪器气密性检查与泄压流程3.jpg','航空楼5层','HQ40d','溶液酸碱度测定','校准后插入样品搅拌读数','便携式pH测定仪',1,6),(7,'2026-04-08 14:34:43','EQ004','PCR仪','分子生物学设备','自动化学院',29,'upload/shiyanshebei_电气火灾灭火器材选择与断电操作1.jpg,upload/shiyanshebei_电气火灾灭火器材选择与断电操作2.jpg,upload/shiyanshebei_电气火灾灭火器材选择与断电操作3.jpg','海洋楼4层','T100','基因扩增','按程序设置变性退火延伸温度','梯度PCR扩增仪',1,7),(8,'2026-04-08 14:34:43','EQ012','电泳仪','分子生物学设备','药学院',45,'upload/shiyanshebei_实验室常见伤害分级急救处理流程1.jpg,upload/shiyanshebei_实验室常见伤害分级急救处理流程2.jpg,upload/shiyanshebei_实验室常见伤害分级急救处理流程3.jpg','农科楼2层','DYY-6C','核酸蛋白分离','按凝胶浓度设置电压电流','双稳定时电泳仪',1,8);
/*!40000 ALTER TABLE `shiyanshebei` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiyanshi`
--

DROP TABLE IF EXISTS `shiyanshi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiyanshi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编号',
  `shiyanshimingcheng` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室名称',
  `shiyanshileixing` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室类型',
  `yuanxi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '院系',
  `tupian` longtext COLLATE utf8mb4_unicode_ci COMMENT '图片',
  `shiyanshiweizhi` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '实验室位置',
  `yiqipeizhi` longtext COLLATE utf8mb4_unicode_ci COMMENT '仪器配置',
  `rongliang` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '容量',
  `reduciblenum` int(11) DEFAULT NULL COMMENT '可预约次数',
  `kaifangshijian` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '开放时间',
  `yuyueguize` longtext COLLATE utf8mb4_unicode_ci COMMENT '预约规则',
  `huanjingjieshao` longtext COLLATE utf8mb4_unicode_ci COMMENT '环境介绍',
  `discussnum` int(11) DEFAULT '0' COMMENT '评论数',
  `totalscore` double DEFAULT '0' COMMENT '评分',
  `storeupnum` int(11) DEFAULT '0' COMMENT '收藏数',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bianhao` (`bianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='实验室';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiyanshi`
--

LOCK TABLES `shiyanshi` WRITE;
/*!40000 ALTER TABLE `shiyanshi` DISABLE KEYS */;
INSERT INTO `shiyanshi` VALUES (1,'2026-04-08 14:34:43','4003','材料测试室','应用研究','土木工程学院','upload/shiyanshi_材料测试室1.jpg,upload/shiyanshi_材料测试室2.jpg,upload/shiyanshi_材料测试室3.jpg','工程楼2层','光谱仪拉力机','容量1',1,'开放时间1','禁止明火操作','通风良好',0,0,1),(2,'2026-04-08 14:34:43','4007','物理实验室','基础研究','机械工程学院','upload/shiyanshi_物理实验室1.jpg,upload/shiyanshi_物理实验室2.jpg,upload/shiyanshi_物理实验室3.jpg','理科楼B座4层','超导磁体示波器','容量2',2,'开放时间2','仪器轻拿轻放','防震降噪',0,0,2),(3,'2026-04-08 14:34:43','4002','电子测试室','检测服务','商学院','upload/shiyanshi_电子测试室1.jpg,upload/shiyanshi_电子测试室2.jpg,upload/shiyanshi_电子测试室3.jpg','电信楼5层','示波器信号发生器','容量3',3,'开放时间3','接地保护到位','防静电地板',0,0,3),(4,'2026-04-08 14:34:43','4008','食品检测室','检测服务','工学院','upload/shiyanshi_食品检测室1.jpg,upload/shiyanshi_食品检测室2.jpg,upload/shiyanshi_食品检测室3.jpg','食品楼2层','液相色谱仪','容量4',4,'开放时间4','样品标记清晰','洁净操作台',0,0,4),(5,'2026-04-08 14:34:43','4004','生化分析室','基础研究','新闻与传播学院','upload/shiyanshi_生化分析室1.jpg,upload/shiyanshi_生化分析室2.jpg,upload/shiyanshi_生化分析室3.jpg','实验楼A座5层','PCR仪离心机','容量5',5,'开放时间5','穿戴防护装备','恒温恒湿',0,0,5),(6,'2026-04-08 14:34:43','4001','航空实验室','应用研究','历史学院','upload/shiyanshi_航空实验室1.jpg,upload/shiyanshi_航空实验室2.jpg,upload/shiyanshi_航空实验室3.jpg','航空楼5层','风洞实验装置','容量6',6,'开放时间6','高压气源安全','大型实验区',0,0,6),(7,'2026-04-08 14:34:43','4005','海洋实验室','基础研究','自动化学院','upload/shiyanshi_海洋实验室1.jpg,upload/shiyanshi_海洋实验室2.jpg,upload/shiyanshi_海洋实验室3.jpg','海洋楼4层','水质分析仪','容量7',7,'开放时间7','海水样品保鲜','模拟海洋环境',0,0,7),(8,'2026-04-08 14:34:43','4006','农业实验室','应用研究','药学院','upload/shiyanshi_农业实验室1.jpg,upload/shiyanshi_农业实验室2.jpg,upload/shiyanshi_农业实验室3.jpg','农科楼2层','光照培养箱PCR仪','容量8',8,'开放时间8','种子分类存放','温湿度可控',0,0,8);
/*!40000 ALTER TABLE `shiyanshi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiyanshipingjia`
--

DROP TABLE IF EXISTS `shiyanshipingjia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiyanshipingjia` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '编号',
  `yuyuebianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '预约编号',
  `shiyanshimingcheng` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室名称',
  `shiyanshileixing` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室类型',
  `tupian` longtext COLLATE utf8mb4_unicode_ci COMMENT '图片',
  `yuanxi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '院系',
  `shiyanshiweizhi` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '实验室位置',
  `xueshengxuehao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生姓名',
  `shoujihao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `yongtu` longtext COLLATE utf8mb4_unicode_ci COMMENT '用途',
  `appointmentdate` date DEFAULT NULL COMMENT '预约日期',
  `timeperiod` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '时间段',
  `shiyanhuanjing` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '实验环境',
  `pingjianeirong` longtext COLLATE utf8mb4_unicode_ci COMMENT '评价内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='实验室评价';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiyanshipingjia`
--

LOCK TABLES `shiyanshipingjia` WRITE;
/*!40000 ALTER TABLE `shiyanshipingjia` DISABLE KEYS */;
INSERT INTO `shiyanshipingjia` VALUES (1,'2026-04-08 14:34:43','4003','预约编号1','材料测试室','应用研究','upload/shiyanshipingjia_材料测试室1.jpg,upload/shiyanshipingjia_材料测试室2.jpg,upload/shiyanshipingjia_材料测试室3.jpg','土木工程学院','工程楼2层','001','李思远','13765432109','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','2026-04-08','时间段1','5','评价内容1'),(2,'2026-04-08 14:34:43','4007','预约编号2','物理实验室','基础研究','upload/shiyanshipingjia_物理实验室1.jpg,upload/shiyanshipingjia_物理实验室2.jpg,upload/shiyanshipingjia_物理实验室3.jpg','机械工程学院','理科楼B座4层','006','周雪','13678901234','此处文本编辑框是内容详细的操作提示，您可以对现有文字进行修改，包括删除多余文字、替换不合适的表述等；插入图片时，既可以从本地选择图片上传，图片插入后会直接展示在编辑框中，完成操作后点击空白区域即可保存。','2026-04-08','时间段2','5','评价内容2'),(3,'2026-04-08 14:34:43','4002','预约编号3','电子测试室','检测服务','upload/shiyanshipingjia_电子测试室1.jpg,upload/shiyanshipingjia_电子测试室2.jpg,upload/shiyanshipingjia_电子测试室3.jpg','商学院','电信楼5层','005','张明','15212345678','编辑框中展示的默认内容仅为示例，您可任意修改其中的文字表述，比如更换词语、调整语句顺序等；当需要插入图片时，点击编辑框上方的 “插入图片” 按钮，上传图片后即可直接在编辑框中展示。','2026-04-08','时间段3','5','评价内容3'),(4,'2026-04-08 14:34:43','4008','预约编号4','食品检测室','检测服务','upload/shiyanshipingjia_食品检测室1.jpg,upload/shiyanshipingjia_食品检测室2.jpg,upload/shiyanshipingjia_食品检测室3.jpg','工学院','食品楼2层','004','高雪','13023456789','此编辑框内已详情的内容，您可以直接对现有文字进行修改，无论是调整文字内容、更正表述还是增减文字数量都能实现；若需插入图片，只需点击上方工具栏的图片图标，选择本地文件或输入图片链接即可插入展示，所有操作完成后提交后系统会保存您的修改。​','2026-04-08','时间段4','5','评价内容4'),(5,'2026-04-08 14:34:43','4004','预约编号5','生化分析室','基础研究','upload/shiyanshipingjia_生化分析室1.jpg,upload/shiyanshipingjia_生化分析室2.jpg,upload/shiyanshipingjia_生化分析室3.jpg','新闻与传播学院','实验楼A座5层','002','林书豪','13654321098','此编辑框内的默认内容为可编辑状态，您可对文字进行修改，比如调整语句顺序、更换文字内容等；插入图片时，支持上传图片，上传后图片会直接在编辑框中展示，也能一键删除不需要的图片。','2026-04-08','时间段5','5','评价内容5'),(6,'2026-04-08 14:34:43','4001','预约编号6','航空实验室','应用研究','upload/shiyanshipingjia_航空实验室1.jpg,upload/shiyanshipingjia_航空实验室2.jpg,upload/shiyanshipingjia_航空实验室3.jpg','历史学院','航空楼5层','007','吴磊','15065432109','此处文本编辑框是内容详细的操作提示，您能轻松对框内文字进行修改，像更正错误文字、调整文字内容等都能实现；插入图片的话，点击工具栏上的图片按钮，选择要插入的图片，图片就会在编辑框中展示，支持随时再次编辑。','2026-04-08','时间段6','5','评价内容6'),(7,'2026-04-08 14:34:43','4005','预约编号7','海洋实验室','基础研究','upload/shiyanshipingjia_海洋实验室1.jpg,upload/shiyanshipingjia_海洋实验室2.jpg,upload/shiyanshipingjia_海洋实验室3.jpg','自动化学院','海洋楼4层','003','黄晓彤','13276543210','编辑框中的默认提示允许您进行文字修改操作，像更正错别字、调整文字内容等都能轻松完成；插入图片的话，点击工具栏中的图片按钮，选择图片后即可在编辑框中展示，所有修改实时可见且支持随时编辑。​\n','2026-04-08','时间段7','5','评价内容7'),(8,'2026-04-08 14:34:43','4006','预约编号8','农业实验室','应用研究','upload/shiyanshipingjia_农业实验室1.jpg,upload/shiyanshipingjia_农业实验室2.jpg,upload/shiyanshipingjia_农业实验室3.jpg','药学院','农科楼2层','008','董珊','15178901234','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','2026-04-08','时间段8','5','评价内容8');
/*!40000 ALTER TABLE `shiyanshipingjia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiyanshiqiandao`
--

DROP TABLE IF EXISTS `shiyanshiqiandao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiyanshiqiandao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '编号',
  `yuyuebianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '预约编号',
  `shiyanshimingcheng` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室名称',
  `shiyanshileixing` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室类型',
  `tupian` longtext COLLATE utf8mb4_unicode_ci COMMENT '图片',
  `yuanxi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '院系',
  `shiyanshiweizhi` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '实验室位置',
  `xueshengxuehao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生姓名',
  `shoujihao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `yongtu` longtext COLLATE utf8mb4_unicode_ci COMMENT '用途',
  `appointmentdate` date DEFAULT NULL COMMENT '预约日期',
  `timeperiod` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '时间段',
  `qiandaoshijian` datetime DEFAULT NULL COMMENT '签到时间',
  `qiantuizhuangtai` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '签退状态',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='实验室签到';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiyanshiqiandao`
--

LOCK TABLES `shiyanshiqiandao` WRITE;
/*!40000 ALTER TABLE `shiyanshiqiandao` DISABLE KEYS */;
INSERT INTO `shiyanshiqiandao` VALUES (1,'2026-04-08 14:34:43','4003','预约编号1','材料测试室','应用研究','upload/shiyanshiqiandao_材料测试室1.jpg,upload/shiyanshiqiandao_材料测试室2.jpg,upload/shiyanshiqiandao_材料测试室3.jpg','土木工程学院','工程楼2层','001','李思远','13765432109','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','2026-04-08','时间段1','2026-04-08 22:34:43','已签退'),(2,'2026-04-08 14:34:43','4007','预约编号2','物理实验室','基础研究','upload/shiyanshiqiandao_物理实验室1.jpg,upload/shiyanshiqiandao_物理实验室2.jpg,upload/shiyanshiqiandao_物理实验室3.jpg','机械工程学院','理科楼B座4层','006','周雪','13678901234','此处文本编辑框是内容详细的操作提示，您可以对现有文字进行修改，包括删除多余文字、替换不合适的表述等；插入图片时，既可以从本地选择图片上传，图片插入后会直接展示在编辑框中，完成操作后点击空白区域即可保存。','2026-04-08','时间段2','2026-04-08 22:34:43','已签退'),(3,'2026-04-08 14:34:43','4002','预约编号3','电子测试室','检测服务','upload/shiyanshiqiandao_电子测试室1.jpg,upload/shiyanshiqiandao_电子测试室2.jpg,upload/shiyanshiqiandao_电子测试室3.jpg','商学院','电信楼5层','005','张明','15212345678','编辑框中展示的默认内容仅为示例，您可任意修改其中的文字表述，比如更换词语、调整语句顺序等；当需要插入图片时，点击编辑框上方的 “插入图片” 按钮，上传图片后即可直接在编辑框中展示。','2026-04-08','时间段3','2026-04-08 22:34:43','已签退'),(4,'2026-04-08 14:34:43','4008','预约编号4','食品检测室','检测服务','upload/shiyanshiqiandao_食品检测室1.jpg,upload/shiyanshiqiandao_食品检测室2.jpg,upload/shiyanshiqiandao_食品检测室3.jpg','工学院','食品楼2层','004','高雪','13023456789','此编辑框内已详情的内容，您可以直接对现有文字进行修改，无论是调整文字内容、更正表述还是增减文字数量都能实现；若需插入图片，只需点击上方工具栏的图片图标，选择本地文件或输入图片链接即可插入展示，所有操作完成后提交后系统会保存您的修改。​','2026-04-08','时间段4','2026-04-08 22:34:43','已签退'),(5,'2026-04-08 14:34:43','4004','预约编号5','生化分析室','基础研究','upload/shiyanshiqiandao_生化分析室1.jpg,upload/shiyanshiqiandao_生化分析室2.jpg,upload/shiyanshiqiandao_生化分析室3.jpg','新闻与传播学院','实验楼A座5层','002','林书豪','13654321098','此编辑框内的默认内容为可编辑状态，您可对文字进行修改，比如调整语句顺序、更换文字内容等；插入图片时，支持上传图片，上传后图片会直接在编辑框中展示，也能一键删除不需要的图片。','2026-04-08','时间段5','2026-04-08 22:34:43','已签退'),(6,'2026-04-08 14:34:43','4001','预约编号6','航空实验室','应用研究','upload/shiyanshiqiandao_航空实验室1.jpg,upload/shiyanshiqiandao_航空实验室2.jpg,upload/shiyanshiqiandao_航空实验室3.jpg','历史学院','航空楼5层','007','吴磊','15065432109','此处文本编辑框是内容详细的操作提示，您能轻松对框内文字进行修改，像更正错误文字、调整文字内容等都能实现；插入图片的话，点击工具栏上的图片按钮，选择要插入的图片，图片就会在编辑框中展示，支持随时再次编辑。','2026-04-08','时间段6','2026-04-08 22:34:43','已签退'),(7,'2026-04-08 14:34:43','4005','预约编号7','海洋实验室','基础研究','upload/shiyanshiqiandao_海洋实验室1.jpg,upload/shiyanshiqiandao_海洋实验室2.jpg,upload/shiyanshiqiandao_海洋实验室3.jpg','自动化学院','海洋楼4层','003','黄晓彤','13276543210','编辑框中的默认提示允许您进行文字修改操作，像更正错别字、调整文字内容等都能轻松完成；插入图片的话，点击工具栏中的图片按钮，选择图片后即可在编辑框中展示，所有修改实时可见且支持随时编辑。​\n','2026-04-08','时间段7','2026-04-08 22:34:43','已签退'),(8,'2026-04-08 14:34:43','4006','预约编号8','农业实验室','应用研究','upload/shiyanshiqiandao_农业实验室1.jpg,upload/shiyanshiqiandao_农业实验室2.jpg,upload/shiyanshiqiandao_农业实验室3.jpg','药学院','农科楼2层','008','董珊','15178901234','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','2026-04-08','时间段8','2026-04-08 22:34:43','已签退');
/*!40000 ALTER TABLE `shiyanshiqiandao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiyanshiqiantui`
--

DROP TABLE IF EXISTS `shiyanshiqiantui`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiyanshiqiantui` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '编号',
  `yuyuebianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '预约编号',
  `shiyanshimingcheng` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室名称',
  `shiyanshileixing` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室类型',
  `tupian` longtext COLLATE utf8mb4_unicode_ci COMMENT '图片',
  `yuanxi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '院系',
  `shiyanshiweizhi` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '实验室位置',
  `xueshengxuehao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生姓名',
  `shoujihao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `yongtu` longtext COLLATE utf8mb4_unicode_ci COMMENT '用途',
  `appointmentdate` date DEFAULT NULL COMMENT '预约日期',
  `timeperiod` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '时间段',
  `qiantuishijian` datetime DEFAULT NULL COMMENT '签退时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='实验室签退';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiyanshiqiantui`
--

LOCK TABLES `shiyanshiqiantui` WRITE;
/*!40000 ALTER TABLE `shiyanshiqiantui` DISABLE KEYS */;
INSERT INTO `shiyanshiqiantui` VALUES (1,'2026-04-08 14:34:43','4003','预约编号1','材料测试室','应用研究','upload/shiyanshiqiantui_材料测试室1.jpg,upload/shiyanshiqiantui_材料测试室2.jpg,upload/shiyanshiqiantui_材料测试室3.jpg','土木工程学院','工程楼2层','001','李思远','13765432109','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','2026-04-08','时间段1','2026-04-08 22:34:43'),(2,'2026-04-08 14:34:43','4007','预约编号2','物理实验室','基础研究','upload/shiyanshiqiantui_物理实验室1.jpg,upload/shiyanshiqiantui_物理实验室2.jpg,upload/shiyanshiqiantui_物理实验室3.jpg','机械工程学院','理科楼B座4层','006','周雪','13678901234','此处文本编辑框是内容详细的操作提示，您可以对现有文字进行修改，包括删除多余文字、替换不合适的表述等；插入图片时，既可以从本地选择图片上传，图片插入后会直接展示在编辑框中，完成操作后点击空白区域即可保存。','2026-04-08','时间段2','2026-04-08 22:34:43'),(3,'2026-04-08 14:34:43','4002','预约编号3','电子测试室','检测服务','upload/shiyanshiqiantui_电子测试室1.jpg,upload/shiyanshiqiantui_电子测试室2.jpg,upload/shiyanshiqiantui_电子测试室3.jpg','商学院','电信楼5层','005','张明','15212345678','编辑框中展示的默认内容仅为示例，您可任意修改其中的文字表述，比如更换词语、调整语句顺序等；当需要插入图片时，点击编辑框上方的 “插入图片” 按钮，上传图片后即可直接在编辑框中展示。','2026-04-08','时间段3','2026-04-08 22:34:43'),(4,'2026-04-08 14:34:43','4008','预约编号4','食品检测室','检测服务','upload/shiyanshiqiantui_食品检测室1.jpg,upload/shiyanshiqiantui_食品检测室2.jpg,upload/shiyanshiqiantui_食品检测室3.jpg','工学院','食品楼2层','004','高雪','13023456789','此编辑框内已详情的内容，您可以直接对现有文字进行修改，无论是调整文字内容、更正表述还是增减文字数量都能实现；若需插入图片，只需点击上方工具栏的图片图标，选择本地文件或输入图片链接即可插入展示，所有操作完成后提交后系统会保存您的修改。​','2026-04-08','时间段4','2026-04-08 22:34:43'),(5,'2026-04-08 14:34:43','4004','预约编号5','生化分析室','基础研究','upload/shiyanshiqiantui_生化分析室1.jpg,upload/shiyanshiqiantui_生化分析室2.jpg,upload/shiyanshiqiantui_生化分析室3.jpg','新闻与传播学院','实验楼A座5层','002','林书豪','13654321098','此编辑框内的默认内容为可编辑状态，您可对文字进行修改，比如调整语句顺序、更换文字内容等；插入图片时，支持上传图片，上传后图片会直接在编辑框中展示，也能一键删除不需要的图片。','2026-04-08','时间段5','2026-04-08 22:34:43'),(6,'2026-04-08 14:34:43','4001','预约编号6','航空实验室','应用研究','upload/shiyanshiqiantui_航空实验室1.jpg,upload/shiyanshiqiantui_航空实验室2.jpg,upload/shiyanshiqiantui_航空实验室3.jpg','历史学院','航空楼5层','007','吴磊','15065432109','此处文本编辑框是内容详细的操作提示，您能轻松对框内文字进行修改，像更正错误文字、调整文字内容等都能实现；插入图片的话，点击工具栏上的图片按钮，选择要插入的图片，图片就会在编辑框中展示，支持随时再次编辑。','2026-04-08','时间段6','2026-04-08 22:34:43'),(7,'2026-04-08 14:34:43','4005','预约编号7','海洋实验室','基础研究','upload/shiyanshiqiantui_海洋实验室1.jpg,upload/shiyanshiqiantui_海洋实验室2.jpg,upload/shiyanshiqiantui_海洋实验室3.jpg','自动化学院','海洋楼4层','003','黄晓彤','13276543210','编辑框中的默认提示允许您进行文字修改操作，像更正错别字、调整文字内容等都能轻松完成；插入图片的话，点击工具栏中的图片按钮，选择图片后即可在编辑框中展示，所有修改实时可见且支持随时编辑。​\n','2026-04-08','时间段7','2026-04-08 22:34:43'),(8,'2026-04-08 14:34:43','4006','预约编号8','农业实验室','应用研究','upload/shiyanshiqiantui_农业实验室1.jpg,upload/shiyanshiqiantui_农业实验室2.jpg,upload/shiyanshiqiantui_农业实验室3.jpg','药学院','农科楼2层','008','董珊','15178901234','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','2026-04-08','时间段8','2026-04-08 22:34:43');
/*!40000 ALTER TABLE `shiyanshiqiantui` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiyanshiyuyue`
--

DROP TABLE IF EXISTS `shiyanshiyuyue`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiyanshiyuyue` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '编号',
  `yuyuebianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '预约编号',
  `shiyanshimingcheng` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室名称',
  `shiyanshileixing` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室类型',
  `tupian` longtext COLLATE utf8mb4_unicode_ci COMMENT '图片',
  `yuanxi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '院系',
  `shiyanshiweizhi` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '实验室位置',
  `xueshengxuehao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生姓名',
  `shoujihao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `yongtu` longtext COLLATE utf8mb4_unicode_ci COMMENT '用途',
  `appointmentdate` date DEFAULT NULL COMMENT '预约时间',
  `timeperiod` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '时间段',
  `yuyuezhuangtai` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '预约状态',
  `sfsh` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT '待审核' COMMENT '是否审核',
  `shhf` longtext COLLATE utf8mb4_unicode_ci COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuyuebianhao` (`yuyuebianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='实验室预约';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiyanshiyuyue`
--

LOCK TABLES `shiyanshiyuyue` WRITE;
/*!40000 ALTER TABLE `shiyanshiyuyue` DISABLE KEYS */;
INSERT INTO `shiyanshiyuyue` VALUES (1,'2026-04-08 14:34:43','4003','1111111111','材料测试室','应用研究','upload/shiyanshiyuyue_材料测试室1.jpg,upload/shiyanshiyuyue_材料测试室2.jpg,upload/shiyanshiyuyue_材料测试室3.jpg','土木工程学院','工程楼2层','001','李思远','13765432109','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','2026-04-08','8:00-10:00','已签到','是',''),(2,'2026-04-08 14:34:43','4007','2222222222','物理实验室','基础研究','upload/shiyanshiyuyue_物理实验室1.jpg,upload/shiyanshiyuyue_物理实验室2.jpg,upload/shiyanshiyuyue_物理实验室3.jpg','机械工程学院','理科楼B座4层','006','周雪','13678901234','此处文本编辑框是内容详细的操作提示，您可以对现有文字进行修改，包括删除多余文字、替换不合适的表述等；插入图片时，既可以从本地选择图片上传，图片插入后会直接展示在编辑框中，完成操作后点击空白区域即可保存。','2026-04-08','8:00-10:00','已签到','是',''),(3,'2026-04-08 14:34:43','4002','3333333333','电子测试室','检测服务','upload/shiyanshiyuyue_电子测试室1.jpg,upload/shiyanshiyuyue_电子测试室2.jpg,upload/shiyanshiyuyue_电子测试室3.jpg','商学院','电信楼5层','005','张明','15212345678','编辑框中展示的默认内容仅为示例，您可任意修改其中的文字表述，比如更换词语、调整语句顺序等；当需要插入图片时，点击编辑框上方的 “插入图片” 按钮，上传图片后即可直接在编辑框中展示。','2026-04-08','8:00-10:00','已签到','是',''),(4,'2026-04-08 14:34:43','4008','4444444444','食品检测室','检测服务','upload/shiyanshiyuyue_食品检测室1.jpg,upload/shiyanshiyuyue_食品检测室2.jpg,upload/shiyanshiyuyue_食品检测室3.jpg','工学院','食品楼2层','004','高雪','13023456789','此编辑框内已详情的内容，您可以直接对现有文字进行修改，无论是调整文字内容、更正表述还是增减文字数量都能实现；若需插入图片，只需点击上方工具栏的图片图标，选择本地文件或输入图片链接即可插入展示，所有操作完成后提交后系统会保存您的修改。​','2026-04-08','8:00-10:00','已签到','是',''),(5,'2026-04-08 14:34:43','4004','5555555555','生化分析室','基础研究','upload/shiyanshiyuyue_生化分析室1.jpg,upload/shiyanshiyuyue_生化分析室2.jpg,upload/shiyanshiyuyue_生化分析室3.jpg','新闻与传播学院','实验楼A座5层','002','林书豪','13654321098','此编辑框内的默认内容为可编辑状态，您可对文字进行修改，比如调整语句顺序、更换文字内容等；插入图片时，支持上传图片，上传后图片会直接在编辑框中展示，也能一键删除不需要的图片。','2026-04-08','8:00-10:00','已签到','是',''),(6,'2026-04-08 14:34:43','4001','6666666666','航空实验室','应用研究','upload/shiyanshiyuyue_航空实验室1.jpg,upload/shiyanshiyuyue_航空实验室2.jpg,upload/shiyanshiyuyue_航空实验室3.jpg','历史学院','航空楼5层','007','吴磊','15065432109','此处文本编辑框是内容详细的操作提示，您能轻松对框内文字进行修改，像更正错误文字、调整文字内容等都能实现；插入图片的话，点击工具栏上的图片按钮，选择要插入的图片，图片就会在编辑框中展示，支持随时再次编辑。','2026-04-08','8:00-10:00','已签到','是',''),(7,'2026-04-08 14:34:43','4005','7777777777','海洋实验室','基础研究','upload/shiyanshiyuyue_海洋实验室1.jpg,upload/shiyanshiyuyue_海洋实验室2.jpg,upload/shiyanshiyuyue_海洋实验室3.jpg','自动化学院','海洋楼4层','003','黄晓彤','13276543210','编辑框中的默认提示允许您进行文字修改操作，像更正错别字、调整文字内容等都能轻松完成；插入图片的话，点击工具栏中的图片按钮，选择图片后即可在编辑框中展示，所有修改实时可见且支持随时编辑。​\n','2026-04-08','8:00-10:00','已签到','是',''),(8,'2026-04-08 14:34:43','4006','8888888888','农业实验室','应用研究','upload/shiyanshiyuyue_农业实验室1.jpg,upload/shiyanshiyuyue_农业实验室2.jpg,upload/shiyanshiyuyue_农业实验室3.jpg','药学院','农科楼2层','008','董珊','15178901234','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','2026-04-08','8:00-10:00','已签到','是','');
/*!40000 ALTER TABLE `shiyanshiyuyue` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `shiyanzhidao`
--

DROP TABLE IF EXISTS `shiyanzhidao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `shiyanzhidao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhishibiaoti` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '知识标题',
  `zhishileixing` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '知识类型',
  `fengmian` longtext COLLATE utf8mb4_unicode_ci COMMENT '封面',
  `zhishidianyaoqiu` longtext COLLATE utf8mb4_unicode_ci COMMENT '知识点要求',
  `zhuyishixiang` longtext COLLATE utf8mb4_unicode_ci COMMENT '注意事项',
  `xiangqing` longtext COLLATE utf8mb4_unicode_ci COMMENT '详情',
  `jiaoshizhanghao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '教师账号',
  `jiaoshixingming` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '教师姓名',
  `caozuoshipin` longtext COLLATE utf8mb4_unicode_ci COMMENT '操作视频',
  `thumbsupnum` int(11) DEFAULT '0' COMMENT '赞',
  `crazilynum` int(11) DEFAULT '0' COMMENT '踩',
  `clicknum` int(11) DEFAULT '0' COMMENT '点击次数',
  `discussnum` int(11) DEFAULT '0' COMMENT '评论数',
  `storeupnum` int(11) DEFAULT '0' COMMENT '收藏数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='实验指导';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `shiyanzhidao`
--

LOCK TABLES `shiyanzhidao` WRITE;
/*!40000 ALTER TABLE `shiyanzhidao` DISABLE KEYS */;
INSERT INTO `shiyanzhidao` VALUES (1,'2026-04-08 14:34:43','实验室火灾报警疏散与救援预案','应急','upload/shiyanzhidao_实验室火灾报警疏散与救援预案1.jpg,upload/shiyanzhidao_实验室火灾报警疏散与救援预案2.jpg,upload/shiyanzhidao_实验室火灾报警疏散与救援预案3.jpg','熟悉应急预案内容，参与每月应急演练','说明实验室火灾应急预案的核心内容与演练要求','讲解火灾报警的关键信息（地点、火情类型、人员被困情况），人员疏散的优先顺序（先疏散危险区域人员），疏散路线的标识要求，初期火灾的扑救分工（安全员负责控火，管理人员负责疏散），重伤人员的转移救护方法，火灾后的事故调查流程','001','李思远','',1,1,1,0,1),(2,'2026-04-08 14:34:43','电气设备接地电阻检测与绝缘防护','电气','upload/shiyanzhidao_电气设备接地电阻检测与绝缘防护1.jpg,upload/shiyanzhidao_电气设备接地电阻检测与绝缘防护2.jpg,upload/shiyanzhidao_电气设备接地电阻检测与绝缘防护3.jpg','定期检测接地绝缘性能，及时消除电气安全隐患','阐述电气设备接地绝缘的重要性与检测规范','讲解接地装置的安装要求（接地极深度≥2米），接地电阻的检测周期（每年至少1次，标准值≤4Ω），电气设备绝缘层的检查方法（外观检查+绝缘摇表测试），破损绝缘层的修复措施，潮湿环境下的电气防护（加装漏电保护器）','006','周雪','',2,2,2,0,2),(3,'2026-04-08 14:34:43','精密仪器防尘防潮与定期校准要求','仪器','upload/shiyanzhidao_精密仪器防尘防潮与定期校准要求1.jpg,upload/shiyanzhidao_精密仪器防尘防潮与定期校准要求2.jpg,upload/shiyanzhidao_精密仪器防尘防潮与定期校准要求3.jpg','熟练掌握仪器维护技能，确保测量数据精准','说明精密仪器的存放环境要求与维护校准制度','讲解精密仪器的存放环境参数（温度18-25℃，湿度40%-60%），日常清洁的工具选择（无尘布、专用清洁剂），校准周期（天平每月校准1次），校准标准的选用要求，维护校准记录的存档规范','005','张明','',3,3,3,0,3),(4,'2026-04-08 14:34:43','化学品泄漏分级应急处置方法','化学品','upload/shiyanzhidao_化学品泄漏分级应急处置方法1.jpg,upload/shiyanzhidao_化学品泄漏分级应急处置方法2.jpg,upload/shiyanzhidao_化学品泄漏分级应急处置方法3.jpg','能快速启动泄漏应急预案，正确选用处置器材','介绍各类化学品泄漏后的紧急处理流程与人员防护要点','讲解易燃液体泄漏时的火源控制、吸附棉使用方法；腐蚀性化学品泄漏时的中和剂选择（酸泄漏用碳酸氢钠）；有毒化学品泄漏时的人员疏散半径（≥50米）及防护装备穿戴要求，泄漏废弃物的分类收集规范','004','高雪','',4,4,4,0,4),(5,'2026-04-08 14:34:43','实验室危险化学品废弃物处置规范','化学品','upload/shiyanzhidao_实验室危险化学品废弃物处置规范1.jpg,upload/shiyanzhidao_实验室危险化学品废弃物处置规范2.jpg,upload/shiyanzhidao_实验室危险化学品废弃物处置规范3.jpg','严格执行废弃物分类管理制度，完善处置台账','阐述化学品废弃物处理的环保要求与安全管理规范','讲解废弃物分类容器的材质选择（强酸用耐酸容器），标签标注信息（成分、危害、产生时间），临时储存时限（≤7天），委托有资质单位处置的流程及合同备案要求，严禁随意倾倒或掩埋废弃物','002','林书豪','',5,5,5,0,5),(6,'2026-04-08 14:34:43','高压仪器气密性检查与泄压流程','仪器','upload/shiyanzhidao_高压仪器气密性检查与泄压流程1.jpg,upload/shiyanzhidao_高压仪器气密性检查与泄压流程2.jpg,upload/shiyanzhidao_高压仪器气密性检查与泄压流程3.jpg','严格按规程操作，定期校验压力表与安全阀','介绍高压仪器的工作原理与安全操作准则','讲解仪器使用前的气密性检测方法（压力保压10分钟无压降），压力参数的设定范围（灭菌锅常规0.1MPa），运行过程中的压力监测频次，结束后的缓慢泄压操作（严禁快速放气），故障情况下的紧急停机按钮位置','007','吴磊','',6,6,6,0,6),(7,'2026-04-08 14:34:43','电气火灾灭火器材选择与断电操作','电气','upload/shiyanzhidao_电气火灾灭火器材选择与断电操作1.jpg,upload/shiyanzhidao_电气火灾灭火器材选择与断电操作2.jpg,upload/shiyanzhidao_电气火灾灭火器材选择与断电操作3.jpg','能快速识别电气火灾隐患，正确处置初期火情','介绍电气火灾的成因分析与应急处置要点','讲解电气设备的散热通风要求，线路老化的排查周期（每季度1次），短路火灾的预防措施（加装短路保护器），电气火灾发生时的断电操作步骤（切断总电源），二氧化碳、干粉灭火器的正确使用方法，严禁用水扑救带电火灾的规定','003','黄晓彤','',7,7,7,0,7),(8,'2026-04-08 14:34:43','实验室常见伤害分级急救处理流程','应急','upload/shiyanzhidao_实验室常见伤害分级急救处理流程1.jpg,upload/shiyanzhidao_实验室常见伤害分级急救处理流程2.jpg,upload/shiyanzhidao_实验室常见伤害分级急救处理流程3.jpg','能正确实施初级急救，避免二次伤害','介绍实验室常见人员伤害的急救要点与送医注意事项','讲解化学灼伤的冲洗时间（≥15分钟，酸碱灼伤区分中和剂），机械割伤的止血包扎方法（加压止血+无菌纱布覆盖），有毒气体中毒的人员转移措施（移至通风处）及吸氧方法，重伤人员送医时的病情说明要点（伤害类型、接触化学品名称）','008','董珊','',8,8,8,0,8);
/*!40000 ALTER TABLE `shiyanzhidao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `storeup`
--

DROP TABLE IF EXISTS `storeup`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `storeup` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `refid` bigint(20) DEFAULT NULL COMMENT '商品id',
  `tablename` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '表名',
  `name` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '名称',
  `picture` longtext COLLATE utf8mb4_unicode_ci COMMENT '图片',
  `type` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT '1' COMMENT '类型',
  `inteltype` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '推荐类型',
  `remark` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='收藏表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `storeup`
--

LOCK TABLES `storeup` WRITE;
/*!40000 ALTER TABLE `storeup` DISABLE KEYS */;
INSERT INTO `storeup` VALUES (1,'2026-04-08 14:39:14',21,2,'popupremind','标题2',NULL,'61',NULL,NULL),(2,'2026-04-08 14:39:14',21,1,'popupremind','标题1',NULL,'61',NULL,NULL),(3,'2026-04-08 14:39:14',21,3,'popupremind','标题3',NULL,'61',NULL,NULL),(4,'2026-04-08 14:39:14',21,4,'popupremind','标题4',NULL,'61',NULL,NULL),(5,'2026-04-08 14:39:14',21,5,'popupremind','标题5',NULL,'61',NULL,NULL),(6,'2026-04-08 14:39:14',21,6,'popupremind','标题6',NULL,'61',NULL,NULL),(7,'2026-04-08 14:39:14',21,7,'popupremind','标题7',NULL,'61',NULL,NULL),(8,'2026-04-08 14:39:14',21,8,'popupremind','标题8',NULL,'61',NULL,NULL),(9,'2026-04-08 14:39:34',21,9,'popupremind','测试',NULL,'61',NULL,NULL),(10,'2026-04-08 14:39:35',11,9,'popupremind','测试',NULL,'61',NULL,NULL);
/*!40000 ALTER TABLE `storeup` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `syslog`
--

DROP TABLE IF EXISTS `syslog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `syslog` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `username` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户名',
  `operation` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户操作',
  `method` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '请求方法',
  `params` longtext COLLATE utf8mb4_unicode_ci COMMENT '请求参数',
  `time` bigint(20) DEFAULT NULL COMMENT '请求时长(毫秒)',
  `ip` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT 'IP地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='系统日志';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `syslog`
--

LOCK TABLES `syslog` WRITE;
/*!40000 ALTER TABLE `syslog` DISABLE KEYS */;
/*!40000 ALTER TABLE `syslog` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(500) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,11,'001','xuesheng','学生','pqaz30c4lpmb4mpdqeoviy3o0pna84h4','2026-04-08 14:39:04','2026-04-08 15:39:04'),(2,21,'001','jiaoshi','管理员','rb07rfwj44f2zfz1nrsq4kf3ubgbel6t','2026-04-08 14:39:13','2026-04-08 15:39:14');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `username` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '用户名',
  `password` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '密码',
  `role` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT '管理员' COMMENT '角色',
  `image` longtext COLLATE utf8mb4_unicode_ci COMMENT '头像',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='管理员';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'2026-04-08 14:34:44','admin','admin','管理员','upload/image1.jpg');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weihujilu`
--

DROP TABLE IF EXISTS `weihujilu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `weihujilu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `weihubianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '维护编号',
  `shebeibianhao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备编号',
  `shebeimingcheng` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备名称',
  `shebeifenlei` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '设备分类',
  `xinghao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '型号',
  `fengmian` longtext COLLATE utf8mb4_unicode_ci COMMENT '封面',
  `weihushijian` datetime DEFAULT NULL COMMENT '维护时间',
  `weihujilu` longtext COLLATE utf8mb4_unicode_ci COMMENT '维护记录',
  PRIMARY KEY (`id`),
  UNIQUE KEY `weihubianhao` (`weihubianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='维护记录';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weihujilu`
--

LOCK TABLES `weihujilu` WRITE;
/*!40000 ALTER TABLE `weihujilu` DISABLE KEYS */;
INSERT INTO `weihujilu` VALUES (1,'2026-04-08 14:34:43','1111111111','EQ006','恒温培养箱','温控设备','DHP-9052','upload/weihujilu_EQ0061.jpg,upload/weihujilu_EQ0062.jpg,upload/weihujilu_EQ0063.jpg','2026-04-08 22:34:43','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​'),(2,'2026-04-08 14:34:43','2222222222','EQ018','超低温冰箱','冷藏设备','DW-86L386','upload/weihujilu_EQ0181.jpg,upload/weihujilu_EQ0182.jpg,upload/weihujilu_EQ0183.jpg','2026-04-08 22:34:43','此处文本编辑框是内容详细的操作提示，您可以对现有文字进行修改，包括删除多余文字、替换不合适的表述等；插入图片时，既可以从本地选择图片上传，图片插入后会直接展示在编辑框中，完成操作后点击空白区域即可保存。'),(3,'2026-04-08 14:34:43','3333333333','EQ016','显微镜','成像设备','CX43','upload/weihujilu_EQ0161.jpg,upload/weihujilu_EQ0162.jpg,upload/weihujilu_EQ0163.jpg','2026-04-08 22:34:43','编辑框中展示的默认内容仅为示例，您可任意修改其中的文字表述，比如更换词语、调整语句顺序等；当需要插入图片时，点击编辑框上方的 “插入图片” 按钮，上传图片后即可直接在编辑框中展示。'),(4,'2026-04-08 14:34:43','4444444444','EQ014','酶标仪','免疫检测设备','RT-6100','upload/weihujilu_EQ0141.jpg,upload/weihujilu_EQ0142.jpg,upload/weihujilu_EQ0143.jpg','2026-04-08 22:34:43','此编辑框内已详情的内容，您可以直接对现有文字进行修改，无论是调整文字内容、更正表述还是增减文字数量都能实现；若需插入图片，只需点击上方工具栏的图片图标，选择本地文件或输入图片链接即可插入展示，所有操作完成后提交后系统会保存您的修改。​'),(5,'2026-04-08 14:34:43','5555555555','EQ019','离子色谱仪','分析仪器','ICS-1100','upload/weihujilu_EQ0191.jpg,upload/weihujilu_EQ0192.jpg,upload/weihujilu_EQ0193.jpg','2026-04-08 22:34:43','此编辑框内的默认内容为可编辑状态，您可对文字进行修改，比如调整语句顺序、更换文字内容等；插入图片时，支持上传图片，上传后图片会直接在编辑框中展示，也能一键删除不需要的图片。'),(6,'2026-04-08 14:34:43','6666666666','EQ010','pH计','分析仪器','HQ40d','upload/weihujilu_EQ0101.jpg,upload/weihujilu_EQ0102.jpg,upload/weihujilu_EQ0103.jpg','2026-04-08 22:34:43','此处文本编辑框是内容详细的操作提示，您能轻松对框内文字进行修改，像更正错误文字、调整文字内容等都能实现；插入图片的话，点击工具栏上的图片按钮，选择要插入的图片，图片就会在编辑框中展示，支持随时再次编辑。'),(7,'2026-04-08 14:34:43','7777777777','EQ004','PCR仪','分子生物学设备','T100','upload/weihujilu_EQ0041.jpg,upload/weihujilu_EQ0042.jpg,upload/weihujilu_EQ0043.jpg','2026-04-08 22:34:43','编辑框中的默认提示允许您进行文字修改操作，像更正错别字、调整文字内容等都能轻松完成；插入图片的话，点击工具栏中的图片按钮，选择图片后即可在编辑框中展示，所有修改实时可见且支持随时编辑。​\n'),(8,'2026-04-08 14:34:43','8888888888','EQ012','电泳仪','分子生物学设备','DYY-6C','upload/weihujilu_EQ0121.jpg,upload/weihujilu_EQ0122.jpg,upload/weihujilu_EQ0123.jpg','2026-04-08 22:34:43','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​');
/*!40000 ALTER TABLE `weihujilu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xuesheng`
--

DROP TABLE IF EXISTS `xuesheng`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xuesheng` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `xueshengxuehao` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '学生姓名',
  `mima` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '密码',
  `xingbie` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '性别',
  `shoujihao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `touxiang` longtext COLLATE utf8mb4_unicode_ci COMMENT '头像',
  `zhuanye` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '专业',
  `yuanxi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '院系',
  PRIMARY KEY (`id`),
  UNIQUE KEY `xueshengxuehao` (`xueshengxuehao`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='学生';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xuesheng`
--

LOCK TABLES `xuesheng` WRITE;
/*!40000 ALTER TABLE `xuesheng` DISABLE KEYS */;
INSERT INTO `xuesheng` VALUES (11,'2026-04-08 14:34:43','001','李思远','123456','女','13765432109','upload/xuesheng_touxiang1.jpg','法学','土木工程学院'),(12,'2026-04-08 14:34:43','006','周雪','123456','女','13678901234','upload/xuesheng_touxiang2.jpg','教育学','机械工程学院'),(13,'2026-04-08 14:34:43','005','张明','123456','男','15212345678','upload/xuesheng_touxiang3.jpg','体育教育','商学院'),(14,'2026-04-08 14:34:43','004','高雪','123456','男','13023456789','upload/xuesheng_touxiang4.jpg','护理学','工学院'),(15,'2026-04-08 14:34:43','002','林书豪','123456','男','13654321098','upload/xuesheng_touxiang5.jpg','机械设计制造及其自动化','新闻与传播学院'),(16,'2026-04-08 14:34:43','007','吴磊','123456','女','15065432109','upload/xuesheng_touxiang6.jpg','数学与应用数学','历史学院'),(17,'2026-04-08 14:34:43','003','黄晓彤','123456','女','13276543210','upload/xuesheng_touxiang7.jpg','化学','自动化学院'),(18,'2026-04-08 14:34:43','008','董珊','123456','女','15178901234','upload/xuesheng_touxiang8.jpg','物理学','药学院');
/*!40000 ALTER TABLE `xuesheng` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xunchajilu`
--

DROP TABLE IF EXISTS `xunchajilu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xunchajilu` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `bianhao` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '编号',
  `shiyanshimingcheng` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室名称',
  `shiyanshileixing` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室类型',
  `yuanxi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '院系',
  `shiyanshiweizhi` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '实验室位置',
  `yiqipeizhi` longtext COLLATE utf8mb4_unicode_ci COMMENT '仪器配置',
  `xianchangzhaopian` longtext COLLATE utf8mb4_unicode_ci COMMENT '现场照片',
  `xunchaxiangmu` longtext COLLATE utf8mb4_unicode_ci COMMENT '巡查项目',
  `xunchashijian` datetime DEFAULT NULL COMMENT '巡查时间',
  `xunchajilu` longtext COLLATE utf8mb4_unicode_ci COMMENT '巡查记录',
  PRIMARY KEY (`id`),
  UNIQUE KEY `bianhao` (`bianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='巡查记录';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xunchajilu`
--

LOCK TABLES `xunchajilu` WRITE;
/*!40000 ALTER TABLE `xunchajilu` DISABLE KEYS */;
INSERT INTO `xunchajilu` VALUES (1,'2026-04-08 14:34:43','4003','材料测试室','应用研究','土木工程学院','工程楼2层','光谱仪拉力机','upload/xunchajilu_材料测试室1.jpg,upload/xunchajilu_材料测试室2.jpg,upload/xunchajilu_材料测试室3.jpg','巡查项目1','2026-04-08 22:34:43','通风良好'),(2,'2026-04-08 14:34:43','4007','物理实验室','基础研究','机械工程学院','理科楼B座4层','超导磁体示波器','upload/xunchajilu_物理实验室1.jpg,upload/xunchajilu_物理实验室2.jpg,upload/xunchajilu_物理实验室3.jpg','巡查项目2','2026-04-08 22:34:43','防震降噪'),(3,'2026-04-08 14:34:43','4002','电子测试室','检测服务','商学院','电信楼5层','示波器信号发生器','upload/xunchajilu_电子测试室1.jpg,upload/xunchajilu_电子测试室2.jpg,upload/xunchajilu_电子测试室3.jpg','巡查项目3','2026-04-08 22:34:43','防静电地板'),(4,'2026-04-08 14:34:43','4008','食品检测室','检测服务','工学院','食品楼2层','液相色谱仪','upload/xunchajilu_食品检测室1.jpg,upload/xunchajilu_食品检测室2.jpg,upload/xunchajilu_食品检测室3.jpg','巡查项目4','2026-04-08 22:34:43','洁净操作台'),(5,'2026-04-08 14:34:43','4004','生化分析室','基础研究','新闻与传播学院','实验楼A座5层','PCR仪离心机','upload/xunchajilu_生化分析室1.jpg,upload/xunchajilu_生化分析室2.jpg,upload/xunchajilu_生化分析室3.jpg','巡查项目5','2026-04-08 22:34:43','恒温恒湿'),(6,'2026-04-08 14:34:43','4001','航空实验室','应用研究','历史学院','航空楼5层','风洞实验装置','upload/xunchajilu_航空实验室1.jpg,upload/xunchajilu_航空实验室2.jpg,upload/xunchajilu_航空实验室3.jpg','巡查项目6','2026-04-08 22:34:43','大型实验区'),(7,'2026-04-08 14:34:43','4005','海洋实验室','基础研究','自动化学院','海洋楼4层','水质分析仪','upload/xunchajilu_海洋实验室1.jpg,upload/xunchajilu_海洋实验室2.jpg,upload/xunchajilu_海洋实验室3.jpg','巡查项目7','2026-04-08 22:34:43','模拟海洋环境'),(8,'2026-04-08 14:34:43','4006','农业实验室','应用研究','药学院','农科楼2层','光照培养箱PCR仪','upload/xunchajilu_农业实验室1.jpg,upload/xunchajilu_农业实验室2.jpg,upload/xunchajilu_农业实验室3.jpg','巡查项目8','2026-04-08 22:34:43','温湿度可控');
/*!40000 ALTER TABLE `xunchajilu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yinhuanchuli`
--

DROP TABLE IF EXISTS `yinhuanchuli`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yinhuanchuli` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuyuebianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '预约编号',
  `bianhao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '编号',
  `shiyanshimingcheng` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室名称',
  `shiyanshileixing` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '实验室类型',
  `yuanxi` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '院系',
  `shiyanshiweizhi` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '实验室位置',
  `xueshengxuehao` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生学号',
  `xueshengxingming` varchar(16) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学生姓名',
  `shoujihao` varchar(32) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `yongtu` longtext COLLATE utf8mb4_unicode_ci COMMENT '用途',
  `appointmentdate` date DEFAULT NULL COMMENT '预约日期',
  `timeperiod` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '时间段',
  `shangbaoshijian` datetime DEFAULT NULL COMMENT '上报时间',
  `anquanyinhuan` longtext COLLATE utf8mb4_unicode_ci COMMENT '安全隐患',
  `shipaizhaopian` longtext COLLATE utf8mb4_unicode_ci COMMENT '实拍照片',
  `chulishijian` datetime DEFAULT NULL COMMENT '处理时间',
  `yinhuanchuli` longtext COLLATE utf8mb4_unicode_ci COMMENT '隐患处理',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='隐患处理';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yinhuanchuli`
--

LOCK TABLES `yinhuanchuli` WRITE;
/*!40000 ALTER TABLE `yinhuanchuli` DISABLE KEYS */;
INSERT INTO `yinhuanchuli` VALUES (1,'2026-04-08 14:34:43','预约编号1','4003','材料测试室','应用研究','土木工程学院','工程楼2层','001','李思远','13765432109','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','2026-04-08','时间段1','2026-04-08 22:34:43','安全隐患1','upload/yinhuanchuli_材料测试室1.jpg,upload/yinhuanchuli_材料测试室2.jpg,upload/yinhuanchuli_材料测试室3.jpg','2026-04-08 22:34:43','隐患处理1'),(2,'2026-04-08 14:34:43','预约编号2','4007','物理实验室','基础研究','机械工程学院','理科楼B座4层','006','周雪','13678901234','此处文本编辑框是内容详细的操作提示，您可以对现有文字进行修改，包括删除多余文字、替换不合适的表述等；插入图片时，既可以从本地选择图片上传，图片插入后会直接展示在编辑框中，完成操作后点击空白区域即可保存。','2026-04-08','时间段2','2026-04-08 22:34:43','安全隐患2','upload/yinhuanchuli_物理实验室1.jpg,upload/yinhuanchuli_物理实验室2.jpg,upload/yinhuanchuli_物理实验室3.jpg','2026-04-08 22:34:43','隐患处理2'),(3,'2026-04-08 14:34:43','预约编号3','4002','电子测试室','检测服务','商学院','电信楼5层','005','张明','15212345678','编辑框中展示的默认内容仅为示例，您可任意修改其中的文字表述，比如更换词语、调整语句顺序等；当需要插入图片时，点击编辑框上方的 “插入图片” 按钮，上传图片后即可直接在编辑框中展示。','2026-04-08','时间段3','2026-04-08 22:34:43','安全隐患3','upload/yinhuanchuli_电子测试室1.jpg,upload/yinhuanchuli_电子测试室2.jpg,upload/yinhuanchuli_电子测试室3.jpg','2026-04-08 22:34:43','隐患处理3'),(4,'2026-04-08 14:34:43','预约编号4','4008','食品检测室','检测服务','工学院','食品楼2层','004','高雪','13023456789','此编辑框内已详情的内容，您可以直接对现有文字进行修改，无论是调整文字内容、更正表述还是增减文字数量都能实现；若需插入图片，只需点击上方工具栏的图片图标，选择本地文件或输入图片链接即可插入展示，所有操作完成后提交后系统会保存您的修改。​','2026-04-08','时间段4','2026-04-08 22:34:43','安全隐患4','upload/yinhuanchuli_食品检测室1.jpg,upload/yinhuanchuli_食品检测室2.jpg,upload/yinhuanchuli_食品检测室3.jpg','2026-04-08 22:34:43','隐患处理4'),(5,'2026-04-08 14:34:43','预约编号5','4004','生化分析室','基础研究','新闻与传播学院','实验楼A座5层','002','林书豪','13654321098','此编辑框内的默认内容为可编辑状态，您可对文字进行修改，比如调整语句顺序、更换文字内容等；插入图片时，支持上传图片，上传后图片会直接在编辑框中展示，也能一键删除不需要的图片。','2026-04-08','时间段5','2026-04-08 22:34:43','安全隐患5','upload/yinhuanchuli_生化分析室1.jpg,upload/yinhuanchuli_生化分析室2.jpg,upload/yinhuanchuli_生化分析室3.jpg','2026-04-08 22:34:43','隐患处理5'),(6,'2026-04-08 14:34:43','预约编号6','4001','航空实验室','应用研究','历史学院','航空楼5层','007','吴磊','15065432109','此处文本编辑框是内容详细的操作提示，您能轻松对框内文字进行修改，像更正错误文字、调整文字内容等都能实现；插入图片的话，点击工具栏上的图片按钮，选择要插入的图片，图片就会在编辑框中展示，支持随时再次编辑。','2026-04-08','时间段6','2026-04-08 22:34:43','安全隐患6','upload/yinhuanchuli_航空实验室1.jpg,upload/yinhuanchuli_航空实验室2.jpg,upload/yinhuanchuli_航空实验室3.jpg','2026-04-08 22:34:43','隐患处理6'),(7,'2026-04-08 14:34:43','预约编号7','4005','海洋实验室','基础研究','自动化学院','海洋楼4层','003','黄晓彤','13276543210','编辑框中的默认提示允许您进行文字修改操作，像更正错别字、调整文字内容等都能轻松完成；插入图片的话，点击工具栏中的图片按钮，选择图片后即可在编辑框中展示，所有修改实时可见且支持随时编辑。​\n','2026-04-08','时间段7','2026-04-08 22:34:43','安全隐患7','upload/yinhuanchuli_海洋实验室1.jpg,upload/yinhuanchuli_海洋实验室2.jpg,upload/yinhuanchuli_海洋实验室3.jpg','2026-04-08 22:34:43','隐患处理7'),(8,'2026-04-08 14:34:43','预约编号8','4006','农业实验室','应用研究','药学院','农科楼2层','008','董珊','15178901234','此处文本编辑框是内容详细的操作，您可以对框内现有的文字进行任意修改，无论是修改具体内容、调整语句逻辑还是增删文字都没问题；若要插入图片，点击上方工具栏的图片标识，选择本地图片文件，就能将图片插入并展示出来，所有操作都进行保存。​','2026-04-08','时间段8','2026-04-08 22:34:43','安全隐患8','upload/yinhuanchuli_农业实验室1.jpg,upload/yinhuanchuli_农业实验室2.jpg,upload/yinhuanchuli_农业实验室3.jpg','2026-04-08 22:34:43','隐患处理8');
/*!40000 ALTER TABLE `yinhuanchuli` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuanxi`
--

DROP TABLE IF EXISTS `yuanxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuanxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuanxi` varchar(32) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '院系',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuanxi` (`yuanxi`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='院系';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuanxi`
--

LOCK TABLES `yuanxi` WRITE;
/*!40000 ALTER TABLE `yuanxi` DISABLE KEYS */;
INSERT INTO `yuanxi` VALUES (1,'2026-04-08 14:34:43','土木工程学院'),(2,'2026-04-08 14:34:43','机械工程学院'),(3,'2026-04-08 14:34:43','商学院'),(4,'2026-04-08 14:34:43','工学院'),(5,'2026-04-08 14:34:43','新闻与传播学院'),(6,'2026-04-08 14:34:43','历史学院'),(7,'2026-04-08 14:34:43','自动化学院'),(8,'2026-04-08 14:34:43','药学院');
/*!40000 ALTER TABLE `yuanxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `zhishileixing`
--

DROP TABLE IF EXISTS `zhishileixing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `zhishileixing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `zhishileixing` varchar(16) COLLATE utf8mb4_unicode_ci NOT NULL COMMENT '知识类型',
  PRIMARY KEY (`id`),
  UNIQUE KEY `zhishileixing` (`zhishileixing`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='知识类型';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `zhishileixing`
--

LOCK TABLES `zhishileixing` WRITE;
/*!40000 ALTER TABLE `zhishileixing` DISABLE KEYS */;
INSERT INTO `zhishileixing` VALUES (1,'2026-04-08 14:34:43','应急'),(2,'2026-04-08 14:34:43','电气'),(3,'2026-04-08 14:34:43','仪器'),(4,'2026-04-08 14:34:43','化学品'),(5,'2026-04-08 14:34:43','知识类型5'),(6,'2026-04-08 14:34:43','知识类型6'),(7,'2026-04-08 14:34:43','知识类型7'),(8,'2026-04-08 14:34:43','知识类型8');
/*!40000 ALTER TABLE `zhishileixing` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-04-17 15:56:08
