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
    public int save${nameFU}(${nameFU} _${name}) {
    	return this.${name}DaoImpl.save${nameFU}(_${name});
    }

    @Override
    public ${nameFU} get${nameFU}ByID(<#list pkPropertyList as pk><#if pk_index!=0> ,</#if>${pk.javaType}	_${pk.dbName}</#list>) {
    	return this.${name}DaoImpl.get${nameFU}ByID(<#list pkPropertyList as pk><#if pk_index!=0> ,</#if>_${pk.dbName}</#list>);
    }
    @Override
    public int update${nameFU}(${nameFU} _${name}) {
    	return this.${name}DaoImpl.update${nameFU}(_${name});
    }
}
