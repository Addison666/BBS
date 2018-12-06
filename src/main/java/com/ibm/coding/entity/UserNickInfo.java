package com.ibm.coding.entity;

import lombok.Data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author THLiu
 */
@Data
public class UserNickInfo {
    private Integer id;
    private String nickName;
    private Integer age;
    private char sex;
    private String picturePath;
    private LocalDate createTime;
    private Integer uid;
}
