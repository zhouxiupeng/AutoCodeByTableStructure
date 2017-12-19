package com.bluemobi.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appcore.dao.MyBatisBaseDao;
import com.appcore.service.impl.MybatisBaseServiceImpl;
import com.bluemobi.dao.AccountDao;
import com.bluemobi.service.AccountService;

/**
 * 【账户信息】 服务类 实现类
 * 
 * @author 代码自动生成 113857118@qq.com
 * @date 2017-12
 * 
 */
@Service(value = "accountService")
public class AccountServiceImpl  implements IAccountService {

    @Autowired
    private IAccountDao accountDaoImpl;


    @Override
    public int saveAccount(AccountVO _account) {
    	return accountDaoImpl.saveAccount(_account);
    }

    @Override
    public AccountVO getAccountByID(Long	_account_id) {
    	return accountDaoImpl.getAccountByID(_account_id);
    }
}
