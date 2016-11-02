package com.lzh.record.service.impl;


import com.lzh.record.model.entity.WebUser;
import com.lzh.record.service.WebUserService;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by Administrator on 2016/11/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/application-context-dao.xml", "classpath:/application-context-service.xml", "classpath:/application-context-transaction.xml"})
public class WebUserServiceImplTest extends TestCase {
    @Autowired
    private WebUserService webUserService;

    public void testDeleteByPrimaryKey() throws Exception {

    }

    @Test
    public void testInsertSelective() throws Exception {
        WebUser webUser = new WebUser();
        webUser.setCreateTime(new Date());
        webUser.setUsername("lzh");
        webUser.setNickname("xhh");
        webUser.setPassword("123456");
        webUser.setPasswordSalt("lizhenhui");
        webUserService.insertSelective(webUser);
    }

    @Test
    public void testSelectByPrimaryKey() throws Exception {
        webUserService.selectByPrimaryKey(1);
    }

    public void testSelectByWebUser() throws Exception {

    }

    public void testUpdateByPrimaryKeySelective() throws Exception {

    }

    public void testSelectByUsername() throws Exception {

    }

}