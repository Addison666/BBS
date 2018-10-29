package com.ibm.coding.dto;

import lombok.Data;

import java.util.List;

/**
 * @author THLiu
 */
@Data
public class FriendsDto {
    private Integer uid;
    private List<FriendDto> list;
}
