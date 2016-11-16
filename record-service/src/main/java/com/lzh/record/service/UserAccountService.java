package com.lzh.record.service;

import com.lzh.record.model.entity.UserAccount;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Administrator on 2016/11/14.
 */
public interface UserAccountService {
        List<UserAccount> getAccountList();

        void updateAccountById(@Param("balance") BigDecimal balance, @Param("id") int id);

        void addUserAccount(UserAccount userAccount);
}
