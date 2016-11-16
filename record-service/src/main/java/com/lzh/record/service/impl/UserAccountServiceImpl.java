package com.lzh.record.service.impl;

import com.lzh.record.mapper.UserAccountMapper;
import com.lzh.record.model.entity.UserAccount;
import com.lzh.record.service.UserAccountService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by lzh on 2016/11/16.
 */
@Service("UserAccount")
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountMapper userAccountMapper;

    @Override
    public List<UserAccount> getAccountList() {
        return userAccountMapper.getAccountList();
    }

    @Override
    public void updateAccountById(@Param("balance") BigDecimal balance, @Param("id") int id) {
        userAccountMapper.updateAccountById(balance, id);
    }

    @Override
    public void addUserAccount(UserAccount userAccount) {
        userAccountMapper.addUserAccount(userAccount);
    }
}
