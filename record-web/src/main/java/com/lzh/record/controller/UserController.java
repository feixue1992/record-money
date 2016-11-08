package com.lzh.record.controller;

import com.lzh.record.model.entity.WebUser;
import com.lzh.record.service.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by lzh on 2016/11/7.
 */
@Controller
public class UserController {

    @Autowired
    private WebUserService webUserService;

    @RequestMapping("/front/user/list")
    public String index(HttpServletRequest request, WebUser user) {
        List<WebUser> users = webUserService.selectUserList(user);
        request.setAttribute("users", users);
        return "/index";
    }
}
