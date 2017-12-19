package com.bluemobi.service${packageName};

import com.appcore.service.MybatisBaseService;

/**
 * 【${note}】 服务类 接口
 * 
 * @author ${author} ${email}
 * @date ${timeMonth}
 * 
 */
public interface I${nameFU}Service {
	
    public int save${nameFU}(${nameFU}VO _${name});
    public ${nameFU}VO get${nameFU}ByID(<#list pkPropertyList as pk><#if pk_index!=0> and</#if>${pk.javaType}	_${pk.dbName}</#list>);

}
