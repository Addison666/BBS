package com.ibm.coding.service;


import com.ibm.coding.dto.UserNickInfoDto;

/**
 * @author THLiu
 */
public interface UserInfoService {

    UserNickInfoDto getNickUserInfo(Integer uid);
}
