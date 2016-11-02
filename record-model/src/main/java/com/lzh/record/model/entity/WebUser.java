package com.lzh.record.model.entity;

import lombok.Data;

@Data
public class WebUser extends BaseModel {

    private String username;

    private String password;

    private String passwordSalt;

    private String nickname;

    private Boolean enable;

    private String token;


}