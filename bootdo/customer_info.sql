/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : bootdo

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-11-09 20:26:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `customer_info`
-- ----------------------------
DROP TABLE IF EXISTS `customer_info`;
CREATE TABLE `customer_info` (
  `customer_id` int(20) NOT NULL AUTO_INCREMENT COMMENT '客户编号',
  `customer_class` varchar(10) DEFAULT NULL COMMENT '客户类别',
  `customer_name` varchar(20) DEFAULT NULL COMMENT '客户名',
  `customer_tellphone` varchar(11) DEFAULT NULL COMMENT '联系电话',
  PRIMARY KEY (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer_info
-- ----------------------------
INSERT INTO `customer_info` VALUES ('1', 'vip', 'wangquanxiu', '13061390676');
