package com.ibm.coding.entity;

import lombok.Data;

import java.time.Instant;

/**
 * @author THLiu
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private Instant createTime;
}
