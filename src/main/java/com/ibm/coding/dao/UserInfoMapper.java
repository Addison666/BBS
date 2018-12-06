package com.ibm.coding.dao;


import com.ibm.coding.entity.UserNickInfo;

/**
 * @author THLiu
 */

public interface UserInfoMapper {

    UserNickInfo getNickInfoByUid(Integer uid);
}
