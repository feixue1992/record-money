package com.lzh.record.service;

import com.lzh.record.model.entity.UserBalance;

import java.util.List;

/**
 * Created by Administrator on 2016/11/14.
 */
public interface UserBalanceService {
        List<UserBalance> getBalanceList();

        void updateBalance(UserBalance userBalance);

        void addBalanceRecord(UserBalance userBalance);

}
