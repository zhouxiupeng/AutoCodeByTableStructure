package com.bluemobi.serviceimpl${packageName};

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appcore.dao.MyBatisBaseDao;
import com.appcore.service.impl.MybatisBaseServiceImpl;
import com.bluemobi.dao${packageName}.${nameFU}Dao;
import com.bluemobi.service${packageName}.${nameFU}Service;

/**
 * 【${note}】 服务类 实现类
 * 
 * @author ${author} ${email}
 * @date ${timeMonth}
 * 
 */
@Service(value = "${name}Service")
public class ${nameFU}ServiceImpl  implements I${nameFU}Service {

    @Autowired
    private I${nameFU}Dao ${name}DaoImpl;


    @Override
    public int save${nameFU}(${nameFU}VO _${name}) {
    	return this.${name}DaoImpl.save${nameFU}(_${name});
    }

    @Override
    public ${nameFU}VO get${nameFU}ByID(<#list pkPropertyList as pk><#if pk_index!=0> and</#if>${pk.javaType}	_${pk.dbName}</#list>) {
    	return this.${name}DaoImpl.get${nameFU}ByID(<#list pkPropertyList as pk><#if pk_index!=0> and</#if>_${pk.dbName}</#list>);
    }
}
