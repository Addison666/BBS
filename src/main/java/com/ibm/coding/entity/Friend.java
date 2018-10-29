package com.ibm.coding.entity;

import lombok.Data;

import java.time.Instant;

/**
 * @author THLiu
 */
@Data
public class Friend {
    private Integer id;
    private Integer uid;
    private Integer fid;
    private Instant createTime;
}
