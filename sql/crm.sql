CREATE TABLE `menu` (
  `menu_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '菜单id',
  `title` varchar(50) NOT NULL COMMENT '菜单名称',
  `href` varchar(100) DEFAULT NULL COMMENT '菜单路径',
  `menu_belong_id` int(6) DEFAULT NULL COMMENT '菜单上级id',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`menu_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

CREATE TABLE `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '角色id',
  `role_name` varchar(50) NOT NULL COMMENT '角色名称',
  `role_describe` varchar(200) DEFAULT NULL COMMENT '角色描述',
  `role_state` bigint(2) DEFAULT '1' COMMENT '角色状态（0：已禁用；1：已启用）',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`role_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

CREATE TABLE `sympathy_records` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_id` varchar(20) DEFAULT NULL COMMENT '用户编号',
  `content` varchar(255) DEFAULT NULL COMMENT '描述',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增id',
  `user_id` varchar(20) NOT NULL COMMENT '用户id',
  `user_name` varchar(30) DEFAULT NULL COMMENT '用户姓名',
  `user_sex` bigint(2) DEFAULT NULL COMMENT '用户性别（0:女; 1:男）',
  `user_phone` varchar(20) DEFAULT NULL COMMENT '用户手机号',
  `user_birthday` varchar(30) DEFAULT NULL COMMENT '用户生日',
  `user_role_id` bigint(2) DEFAULT '1' COMMENT '用户角色id',
  `user_state` bigint(2) NOT NULL DEFAULT '1' COMMENT '用户状态（0：已删除；1：正常）',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;