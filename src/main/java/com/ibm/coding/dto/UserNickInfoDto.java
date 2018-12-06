package com.ibm.coding.dto;

import lombok.Data;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author THLiu
 */
@Data
public class UserNickInfoDto {
    private String nickName;
    private Integer age;
    private String sex;
    private String picturePath;
    private LocalDate createTime;
}
