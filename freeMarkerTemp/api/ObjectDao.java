package com.yundong.${dbNameT}dao${packageName};

import com.yundong.${dbNameT}entity.${nameFU};

/**
 * 【${note}】 数据访问对象 接口
 * 
 * @author ${author} ${email}
 * @date ${timeMonth}
 * 
 */
public interface I${nameFU}Dao{
	  String getPrefix();
	  int save${nameFU}(${nameFU} ${name});
	  ${nameFU} get${nameFU}ByID(<#list pkPropertyList as pk><#if pk_index!=0>,</#if>${pk.javaType}	${pk.dbName}</#list>);
	  int update${nameFU}(${nameFU} ${name});
}
