package com.yundong.${dbNameT}service.impl${packageName};

import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.yundong.${dbNameT}dao${packageName}.I${nameFU}Dao;
import com.yundong.${dbNameT}service${packageName}.I${nameFU}Service;
import com.yundong.${dbNameT}entity.${nameFU};

/**
 * 【${note}】 服务类 实现类
 * 
 * @author ${author} ${email}
 * @date ${timeMonth}
 * 
 */
@Service
public class ${nameFU}ServiceImpl  implements I${nameFU}Service {

    @Autowired
    private I${nameFU}Dao ${name}DaoImpl;


    @Override
    public int save${nameFU}(long key, ${nameFU} ${name}) {
    	return this.${name}DaoImpl.save${nameFU}(key, ${name});
    }

    @Override
    public ${nameFU} get${nameFU}ByID(long key, <#list pkPropertyList as pk><#if pk_index!=0> ,</#if>${pk.javaType}	${pk.dbName}</#list>) {
    	return this.${name}DaoImpl.get${nameFU}ByID(key, <#list pkPropertyList as pk><#if pk_index!=0> ,</#if>${pk.dbName}</#list>);
    }
    @Override
    public int update${nameFU}(long key, ${nameFU} ${name}) {
    	return this.${name}DaoImpl.update${nameFU}(key, ${name});
    }
}
