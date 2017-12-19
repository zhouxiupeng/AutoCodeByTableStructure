package com.bluemobi.daoimpl${packageName};

import org.springframework.stereotype.Repository;

import com.appcore.dao.impl.MyBatisBaseDaoImpl;
import com.bluemobi.dao${packageName}.${nameFU}Dao;

/**
 * 【${note}】 数据访问对象 实现类
 * 
 * @author ${author} ${email}
 * @date ${timeMonth}
 * 
 */
@Repository(value = "${name}Dao")
public class ${nameFU}DaoImpl extends MyBatisBaseDaoImpl implements ${nameFU}Dao {

    public static final String PREFIX = ${nameFU}Dao.class.getName() + ".";

    @Override
    public String getPrefix() {
        return PREFIX;
    }

}
