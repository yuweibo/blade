package com.xy.mapper;


/**
 * sql:
 CREATE DATABASE IF NOT EXISTS user;
 CREATE TABLE IF NOT EXISTS user.`t_user` (
 `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
 `username` varchar(20) DEFAULT NULL,
 `password` varchar(50) DEFAULT NULL,
 `real_name` varchar(20) DEFAULT NULL,
 `age` int(10) DEFAULT NULL,
 PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

 INSERT INTO user.`t_user` (`id`, `username`, `password`, `real_name`, `age`)
 VALUES
 (1, 'aaa', 'aaa', 'aaa', 32),
 (2, 'jack', '999', '杰克65', 29),
 (3, 'jack_up', '123556', 'aaa', 19),
 (4, 'jack', '123556', '杰克', 20),
 (5, 'jack', '123556', '杰克', 20);

 */