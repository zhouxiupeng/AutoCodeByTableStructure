package com.bluemobi.serviceimpl.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appcore.dao.MyBatisBaseDao;
import com.appcore.service.impl.MybatisBaseServiceImpl;
import com.bluemobi.dao.account.AccountDao;
import com.bluemobi.service.account.AccountService;

/**
 * 【账户信息】 服务类 实现类
 * 
 * @author AutoCode 309444359@qq.com
 * @date 2017-12
 * 
 */
@Service(value = "accountService")
public class AccountServiceImpl extends MybatisBaseServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public MyBatisBaseDao getDao() {
        return accountDao;
    }

}
