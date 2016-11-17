package com.lzh.record.service.impl;

import com.lzh.record.mapper.UserAccountMapper;
import com.lzh.record.mapper.UserBalanceMapper;
import com.lzh.record.model.entity.UserBalance;
import com.lzh.record.service.UserAccountService;
import com.lzh.record.service.UserBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/11/14.
 */
@Service("userBalanceService")
public class UserBalanceServiceImpl implements UserBalanceService{

    @Autowired
    private UserBalanceMapper userBalanceMapper;
    @Autowired
    private UserAccountService userAccountService;

    @Override
    public List<UserBalance> getBalanceList() {
        return userBalanceMapper.getBalanceList();
    }

    @Override
    public void updateBalance(UserBalance userBalance) {
        userBalanceMapper.updateBalance(userBalance);
    }

    @Override
    public void addBalanceRecord(UserBalance userBalance) {
        userBalance.setAccountId(1);
        userBalanceMapper.addBalanceRecord(userBalance);
        if (userBalance.getType() == 0) {
            userAccountService.updateAccountById(userBalance.getBalance().negate(), 1);
        } else {
            userAccountService.updateAccountById(userBalance.getBalance(), 1);
        }
    }
}
