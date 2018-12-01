package com.ibm.coding.service;



import com.ibm.coding.dto.UsersDto;
import com.ibm.coding.vo.LoginVo;
import com.ibm.coding.vo.UserInfoVo;
import com.ibm.coding.vo.UserVo;


/**
 * @author THLiu
 */

public interface UserService {

    UsersDto getUser(LoginVo loginVo);

    void registration(UserVo userVo);

    void checkUser(UserVo userVo);

    void addUserInfo(UserInfoVo infoVo);
}
