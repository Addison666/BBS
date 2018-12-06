package com.ibm.coding.dao;

import com.ibm.coding.dto.UserDto;


import com.ibm.coding.entity.User;
import com.ibm.coding.entity.UserInfo;
import com.ibm.coding.vo.UserInfoVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Created by THLiu on 5/30/2018.
 * e-mail: dlthliu@ibm.cn.com
 */
public interface UserMapper {
    UserDto getUser(@Param("username") String username);

    int createUser(User user);

    int addUserInfo(UserInfo userInfo);

    UserInfo getUserInfoByNickName(String nickName);

    UserInfo getUserInfoByUid(Integer uid);
}
