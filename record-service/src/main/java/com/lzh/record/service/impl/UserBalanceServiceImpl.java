package com.lzh.record.service.impl;

import com.lzh.record.mapper.UserBalanceMapper;
import com.lzh.record.model.entity.UserBalance;
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

    @Override
    public List<UserBalance> getBalanceList() {
        return userBalanceMapper.getBalanceList();
    }

    @Override
    public void updateBalance(UserBalance userBalance) {
        userBalanceMapper.updateBalance();
    }

    @Override
    public void addBalanceRecord(UserBalance userBalance) {
        userBalanceMapper.addBalanceRecord(userBalance);
    }
}
