package com.lzh.record.model.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/11/14.
 */
@Data
public class UserAccount extends BaseModel{
    private BigDecimal balance;
    private int userId;
    private int enable;
}
