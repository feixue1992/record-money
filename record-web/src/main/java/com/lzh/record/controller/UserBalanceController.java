package com.lzh.record.controller;

import com.lzh.record.model.entity.UserBalance;
import com.lzh.record.service.UserBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2016/11/14.
 */
@Controller
public class UserBalanceController {

    @Autowired
    private UserBalanceService userBalanceService;

    @RequestMapping("/front/balance/list")
    public String getUserBalanceList() {
        List<UserBalance> balances = userBalanceService.getBalanceList();
        return "";
    }
}
