/*
 * Copyright 2002-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lzh.record.service.impl;

import com.lzh.record.mapper.WebUserMapper;
import com.lzh.record.model.entity.WebUser;
import com.lzh.record.service.WebUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author zhL
 * @since 1.0.0
 */

@Service("webUserService")
public class WebUserServiceImpl implements WebUserService {

    @Autowired
    private WebUserMapper webUserMapper;

    public int deleteByPrimaryKey(Integer id) {
        return webUserMapper.deleteByPrimaryKey(id);
    }

    public int insertSelective(WebUser record) {
        record.setPasswordSalt("lzh");
        return webUserMapper.insertSelective(record);
    }

    public WebUser selectByPrimaryKey(Integer id) {
        return webUserMapper.selectByPrimaryKey(id);
    }

    public WebUser selectByWebUser(WebUser webUser) {
        return webUserMapper.selectByWebUser(webUser);
    }

    public int updateByPrimaryKeySelective(WebUser record) {
        return webUserMapper.updateByPrimaryKeySelective(record);
    }

    public WebUser selectByUsername(String username) {
        return webUserMapper.selectByUsername(username);
    }

    @Override
    public List<WebUser> selectUserList(WebUser user) {
        return webUserMapper.selectUserList(user);
    }
}
