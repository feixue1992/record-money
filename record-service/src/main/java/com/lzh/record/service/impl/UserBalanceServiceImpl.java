package com.lzh.record.service.impl;

import com.lzh.record.mapper.UserAccountMapper;
import com.lzh.record.mapper.UserBalanceMapper;
import com.lzh.record.model.entity.UserAccount;
import com.lzh.record.model.entity.UserBalance;
import com.lzh.record.service.UserAccountService;
import com.lzh.record.service.UserBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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
    public void addBalanceRecord(UserBalance userBalance, UserAccount userAccount) {
        userBalance.setAccountId(1);
        BigDecimal remainMoney = userAccount.getBalance();
        if (userBalance.getType() == 0) {
            userBalance.setRemainBalance(remainMoney.subtract(userBalance.getBalance()));
            userBalanceMapper.addBalanceRecord(userBalance);
            userAccountService.updateAccountById(userBalance.getBalance().negate(), 1);
        } else {
            userBalance.setRemainBalance(remainMoney.add(userBalance.getBalance()));
            userBalanceMapper.addBalanceRecord(userBalance);
            userAccountService.updateAccountById(userBalance.getBalance(), 1);
        }
    }
}
