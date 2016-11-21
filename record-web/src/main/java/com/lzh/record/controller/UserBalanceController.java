package com.lzh.record.controller;

import com.github.pagehelper.PageHelper;
import com.lzh.record.model.entity.UserAccount;
import com.lzh.record.model.entity.UserBalance;
import com.lzh.record.service.UserAccountService;
import com.lzh.record.service.UserBalanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2016/11/14.
 */
@Controller
public class UserBalanceController {

    @Autowired
    private UserBalanceService userBalanceService;
    @Autowired
    private UserAccountService userAccountService;

    @InitBinder("balance")
    private void initBalanceBinder(WebDataBinder webDataBinder) {
        webDataBinder.setFieldDefaultPrefix("balance.");
    }

    /**
     * 资金列表
     * @param request
     * @return
     */
    @RequestMapping("/front/balance/list")
    public String getUserBalanceList(HttpServletRequest request) {
        PageHelper.startPage(1, 20); // 核心分页代码
        List<UserBalance> balances = userBalanceService.getBalanceList();
        UserAccount userAccount = userAccountService.getAccountByUserId(1);
        request.setAttribute("balances", balances);
        request.setAttribute("userAccount", userAccount);
        return "/user/balance_list";
    }

    /**
     * 跳到增加记录列表
     * @return
     */
    @RequestMapping("/front/balance/to/add")
    public String toBalanceAdd() {
        return "/user/balance_add";
    }

    @RequestMapping("/front/balance/add")
    public String balanceAdd(@ModelAttribute("balance") UserBalance userBalance) {
        UserAccount userAccount = userAccountService.getAccountByUserId(1);
        userBalanceService.addBalanceRecord(userBalance, userAccount);
        return "redirect:/front/balance/list";
    }

}
