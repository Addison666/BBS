package com.ibm.coding.dao;

import com.ibm.coding.dto.FriendDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author THLiu
 */
public interface FriendMapper {

    List<FriendDto> getFriend(@Param("uid") Integer uid);
}
