/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50632
Source Host           : localhost:3306
Source Database       : springcloud

Target Server Type    : MYSQL
Target Server Version : 50632
File Encoding         : 65001

Date: 2017-04-05 22:30:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for springcloud
-- ----------------------------
DROP TABLE IF EXISTS `springcloud`;
CREATE TABLE `springcloud` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `springcloud` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of springcloud
-- ----------------------------
INSERT INTO `springcloud` VALUES ('1', 'springcloud', 'userame', 'pwd');
SET FOREIGN_KEY_CHECKS=1;
