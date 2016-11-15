package com.lzh.record.controller;

import com.lzh.record.model.entity.UserBalance;
import com.lzh.record.service.UserBalanceService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
        List<UserBalance> balances = userBalanceService.getBalanceList();
        request.setAttribute("balances", balances);
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
        userBalanceService.addBalanceRecord(userBalance);
        return "redirect:/front/balance/list";
    }

}
