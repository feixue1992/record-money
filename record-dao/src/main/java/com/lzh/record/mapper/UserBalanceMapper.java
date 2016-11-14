package com.lzh.record.mapper;

import com.lzh.record.model.entity.UserBalance;

import java.util.List;

/**
 * Created by Administrator on 2016/11/14.
 */
public interface UserBalanceMapper {

    List<UserBalance> getBalanceList();

    void updateBalance();

}
