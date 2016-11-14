package com.lzh.record.controller;

import com.lzh.record.model.entity.WebUser;
import com.lzh.record.service.WebUserService;
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
 * Created by lzh on 2016/11/7.
 */
@Controller
public class UserController {

    @Autowired
    private WebUserService webUserService;

    @InitBinder("user")
    public void initUser(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("user.");
    }

    /**
     * 用户列表
     * @param request
     * @param user
     * @return
     */
    @RequestMapping("/front/user/list")
    public String getUserList(HttpServletRequest request, WebUser user) {
        List<WebUser> users = webUserService.selectUserList(user);
        request.setAttribute("users", users);
        return "/user/user_list";
    }

    /**
     * 跳到修改用户信息
     * @param request
     * @param id
     * @return
     */
    @RequestMapping("/front/to/user/update/{id}")
    public String toUpdateUser(HttpServletRequest request,@PathVariable("id") int id) {
        WebUser user = webUserService.selectByPrimaryKey(id);
        request.setAttribute("user", user);
        return "/user/user_update";
    }

    /**
     * 修改用户
     * @param user
     * @return
     */
    @RequestMapping("/front/user/update")
    public String updateUser(@ModelAttribute("user") WebUser user) {
        webUserService.updateByPrimaryKeySelective(user);
        return "redirect:/front/user/list";
    }

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    @RequestMapping("/front/user/delete/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        webUserService.deleteByPrimaryKey(id);
        return "redirect:/front/user/list";
    }

    /**
     * 跳到增加用户页面
     * @return
     */
    @RequestMapping("/front/user/to/add")
    public String toAddUser() {
        return "/user/user_add";
    }

    /**
     * 增加用户
     * @param user
     * @return
     */
    @RequestMapping("/front/user/add")
    public String addUser(@ModelAttribute("user") WebUser user) {
        webUserService.insertSelective(user);
        return "redirect:/front/user/list";
    }
}
