/*
Navicat MySQL Data Transfer

Source Server         : 3___mysql_localhost
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2017-03-21 16:08:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(50) DEFAULT NULL,
  `userAge` int(11) DEFAULT NULL,
  `userAddress` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '李胜', '12', '邵阳');
INSERT INTO `user` VALUES ('5', 'lis', '12', '天宫');
INSERT INTO `user` VALUES ('6', '李张三', '32', '大黄桥');
INSERT INTO `user` VALUES ('7', 'wanger', '12', '罗湖区');
INSERT INTO `user` VALUES ('8', 'wanger', '12', '罗湖区');


/*
Navicat MySQL Data Transfer

Source Server         : 3___mysql_localhost
Source Server Version : 50709
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50709
File Encoding         : 65001

Date: 2017-03-21 16:08:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userId` int(11) DEFAULT NULL,
  `title` varchar(100) NOT NULL,
  `content` text NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('9', '1', '文章1', '这是第一篇文章');
INSERT INTO `article` VALUES ('16', '2', '文章3', '这是第3篇文章');
INSERT INTO `article` VALUES ('17', '2', '文章3', '这是第3篇文章');
INSERT INTO `article` VALUES ('18', '1', '文章3', '这是第3篇文章');
INSERT INTO `article` VALUES ('19', '1', '文章3', '这是第3篇文章');
INSERT INTO `article` VALUES ('20', '1', '文章3', '这是第3篇文章');