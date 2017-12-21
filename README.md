#AutoCodeByTableStructure

原始作者版本
https://github.com/j112929/AutoCodeByTableStructure
感谢原作者的支持。
我在作者的原始版本做了改写，增加模版组的概念，可以自由配置多个模版组等功能。
同时增加其他功能

#如何使用

1、修改数据的链接，在jdbc.properties文件中
2、修改要生成的表的名称，在tables.txt中，一行一个表的名称
3、修改config.xml中的文件的生成路径，
注意：
 mainpath 变量后面必须已反斜杠结束，后面要用它做路径的拼接。
 例如：变量jsp = "$mainpath+jsp/"，最后，程序中要把$mainpath+都替换掉。
 
#关于模版组的定义

config.xml中变量marker_path定义自定义模版组的路径，注意，是已默认路径freeeMarkerTemp为基础。
如果前面没有反斜杠，定义的模版的路径和默认的模版的路径是平级的。
最后系统获取路径时，是用默认路径+marker_path的变量，定义新的模版的路径。

#关于新定义变量数据库名称的声明

变量dbname 表示数据的名称，但是，原来的系统变量用他做为了表的名称，我也没改以前的逻辑，在模版参数中重新定义了dbNameT表是数据库的名称。

#关于运行

配置好数据库链接后，直接运行AutoCodeMain.java即可

#测试数据库的表

CREATE TABLE IF NOT EXISTS `payment`.`account` (
  `account_id` BIGINT(20) NOT NULL COMMENT '账户ID',
  `user_id` BIGINT(20) NOT NULL DEFAULT '0' COMMENT '用户UID',
  `user_type` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '账户类型  1:个人账户;2:企业账户;',
  `status` TINYINT(4) NULL DEFAULT '0' COMMENT '用户状态: -1.删除 ,0.冻结. 1. 正常',
  `create_time` DATETIME NULL COMMENT '创建时间，默认为0',
  `update_time` DATETIME NULL,
  PRIMARY KEY (`account_id`),
  INDEX `idx_user` (`user_id` ASC, `user_type` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '账户信息';