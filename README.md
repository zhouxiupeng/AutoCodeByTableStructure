#地址
https://github.com/zhouxiupeng/AutoCodeByTableStructure

#AutoCodeByTableStructure

原始作者版本
https://github.com/j112929/AutoCodeByTableStructure
感谢原作者的支持。
我在作者的原始版本做了改写，增加模版组的概念，可以自由配置多个模版组等功能。
同时增加其他功能
#FreeMarker 介绍
https://baike.baidu.com/item/freemarker/9489366?fr=aladdin
本系统是使用FreeMarker作为模版引擎而开发的代码生成工具，如果想自定义模版，需要了解一下FreeMarker的语法

#如何使用

1、修改数据的链接，在conf->jdbc.properties文件中
2、修改要生成的表的名称，在conf->tables.txt中，一行一个表的名称
3、修改conf->config.xml中的文件的生成路径，
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

配置好数据库链接后，直接运行com.code->AutoCodeMain.java即可

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




#系统结构说明
com.code=>AutoCodeMain.java 系统启动类
com.code=>Config.java,CodeConfig.java是配置参数类，其中Config，系统支持的模版类型定义，输出的每种文件定义一个模版
com.code.constat=>DBType.java,是支持的数据库类型定义，目前支持mysql，oracle，mssql ，db2等常用数据库
com.code.db=>DBUtil.java ,ProReader.java是数据库驱动装载类，DBUtil实现了把数据库结构信息装载到模版变量中
com.code.freemarkder=>FreeMarkerWriter.java 最终文件输出，根据模版和变量，输出最终的文件
com.code.log=>LogStart.java ,log4j初始化类
com.code.model=>DropDown.java,myClass.java,Property.java,其中myClass.java 记录模版中使用的变量集合，需要扩展包，类名等需要修改这个类
com.code.model.abstractModel=>AbstractDBField.java db名称和表名称，AbstractField.java固定的标签信息等，在每个文件的注解中提现。Symbol 模版中用到规定变量的定义。如：等号，分号，等等
com.code.parser=>JavaTypeResolverDefaultImpl.java 类型转换类，如果把变量都定义成基本类，就需要修改这个类
com.code.util=>对文件等基础操作类


