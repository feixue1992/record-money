package com.lzh.record.model.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/11/14.
 */
@Data
public class UserBalance extends BaseModel{
    private BigDecimal balance;
    private String content;
    private int type;
    private int accountId;
}
