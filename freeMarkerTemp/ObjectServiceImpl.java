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
public class ${nameFU}ServiceImpl extends MybatisBaseServiceImpl implements ${nameFU}Service {

    @Autowired
    private ${nameFU}Dao ${name}Dao;

    @Override
    public MyBatisBaseDao getDao() {
        return ${name}Dao;
    }

}
