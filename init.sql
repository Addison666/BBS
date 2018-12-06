create table user(
	id bigint(20) auto_increment primary key,
	username varchar(50) not null,
	password varchar(255),
  create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE `t_friend_circle_message` (
  `id` bigint(15) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `uid` bigint(15) DEFAULT NULL COMMENT '用户id',
  `content` varchar(500) DEFAULT NULL,
  `picture` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT '' COMMENT '图片',
  `location` varbinary(100) DEFAULT '' COMMENT '位置',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`)
)

#时间轴表
CREATE TABLE `t_friend_circle_timeline` (
  `id` bigint(15) NOT NULL AUTO_INCREMENT,
  `uid` bigint(15) DEFAULT NULL COMMENT '用户id',
  `fcmid` bigint(15) DEFAULT NULL COMMENT '朋友圈信息id',
  `is_own` int(1) DEFAULT '0' COMMENT '是否是自己的',
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  PRIMARY KEY (`id`)
)

CREATE TABLE `t_friend_circle_comment` (
  `id` bigint(15) NOT NULL AUTO_INCREMENT,
  `fcmid` bigint(15) DEFAULT NULL COMMENT '朋友圈信息id',
  `uid` bigint(15) DEFAULT NULL COMMENT '用户id',
  `content` varchar(500) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL COMMENT '创建日期',
  `like_count` int(10) DEFAULT '0' COMMENT '点赞数',
  PRIMARY KEY (`id`)
)

CREATE TABLE `t_friend_circle_list` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `uid` bigint(20) NOT NULL,
  `fid` bigint(20) NOT NULL,
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table user_info(
	id bigint(20) auto_increment primary key,
	nick_name varchar(50) not null default "",
	age int(5) null default null,
	user_id bigint(20) not null,
	create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);
create table user_nick_info (
	id bigint(20) auto_increment primary key,
	nick_name varchar(50) not null default "",
	age int(3) null default null,
	sex char(1) null default null,
	picture_path varchar(200) null default "",
	uid bigint(20) null default null,
	create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
);