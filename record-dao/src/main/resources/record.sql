-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        5.7.11 - MySQL Community Server (GPL)
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  8.2.0.4675
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 record 的数据库结构
CREATE DATABASE IF NOT EXISTS `record` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci */;
USE `record`;


-- 导出  表 record.web_user 结构
CREATE TABLE IF NOT EXISTS `web_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '用户名',
  `password` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '密码',
  `password_salt` varchar(50) COLLATE utf8_unicode_ci NOT NULL COMMENT '密码盐',
  `nickname` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '昵称',
  `enable` bit(1) DEFAULT b'0' COMMENT '可用0可用1冻结，2删除',
  `token` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL COMMENT '口令',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='web用户表';

-- 正在导出表  record.web_user 的数据：~5 rows (大约)
/*!40000 ALTER TABLE `web_user` DISABLE KEYS */;
INSERT INTO `web_user` (`id`, `username`, `password`, `password_salt`, `nickname`, `enable`, `token`, `create_time`, `update_time`) VALUES
	(1, 'lzh', '123456', 'lizhenhui', 'xhh', b'0', NULL, '2016-11-02 14:37:10', '2016-11-02 14:37:10'),
	(2, 'lzh', '123456', 'lizhenhui', 'xhh', b'0', NULL, '2016-11-02 14:53:23', '2016-11-02 14:53:23'),
	(3, 'lzh', '123456', 'lizhenhui', 'xhh', b'0', NULL, '2016-11-02 14:55:07', '2016-11-02 14:55:07'),
	(4, 'lzh', '123456', 'lizhenhui', 'xhh', b'0', NULL, '2016-11-02 14:57:00', '2016-11-02 14:57:00'),
	(5, 'lzh', '123456', 'lizhenhui', 'xhh', b'0', NULL, '2016-11-02 15:03:51', '2016-11-02 15:03:51');
/*!40000 ALTER TABLE `web_user` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
