package com.yundong.${dbNameT}service${packageName};

import java.util.List;
import com.yundong.${dbNameT}entity.${nameFU};

/**
 * 【${note}】 服务类 接口
 * 
 * @author ${author} ${email}
 * @date ${timeMonth}
 * 
 */
public interface I${nameFU}Service {
	
    int save${nameFU}(${nameFU} ${name});
    ${nameFU} get${nameFU}ByID(<#list pkPropertyList as pk><#if pk_index!=0> ,</#if>${pk.javaType}	${pk.dbName}</#list>);
    int update${nameFU}(${nameFU} ${name});
}
