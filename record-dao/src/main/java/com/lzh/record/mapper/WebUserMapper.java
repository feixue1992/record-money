package com.lzh.record.mapper;

import com.lzh.record.model.entity.WebUser;

import java.util.List;

public interface WebUserMapper {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(WebUser record);

    WebUser selectByPrimaryKey(Integer id);

    WebUser selectByWebUser(WebUser webUser);

    int updateByPrimaryKeySelective(WebUser record);

    WebUser selectByUsername(String username);

    List<WebUser> selectUserList(WebUser user);

}