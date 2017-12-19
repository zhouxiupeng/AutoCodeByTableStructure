package com.bluemobi.dao${packageName};

import com.appcore.dao.MyBatisBaseDao;

/**
 * 【${note}】 数据访问对象 接口
 * 
 * @author ${author} ${email}
 * @date ${timeMonth}
 * 
 */
public interface I${nameFU}Dao{
	 public String getPrefix();
	 public int save${nameFU}(${nameFU}VO _${name});
	 public ${nameFU}VO get${nameFU}ByID(<#list pkPropertyList as pk><#if pk_index!=0> and</#if>${pk.javaType}	_${pk.dbName}</#list>);
}
