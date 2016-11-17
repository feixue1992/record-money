package com.lzh.record.mapper;

import com.lzh.record.model.entity.UserAccount;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by Administrator on 2016/11/14.
 */
public interface UserAccountMapper {

    List<UserAccount> getAccountList();

    void updateAccountById(@Param("balance") BigDecimal balance, @Param("id") int id);

    void addUserAccount(UserAccount userAccount);

    UserAccount getAccountByUserId(int userId);

}
