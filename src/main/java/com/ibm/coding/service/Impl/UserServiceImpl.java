package com.ibm.coding.service.Impl;


import com.ibm.coding.dao.UserMapper;
import com.ibm.coding.dto.UserDto;


import com.ibm.coding.dto.UsersDto;
import com.ibm.coding.entity.User;
import com.ibm.coding.entity.UserInfo;
import com.ibm.coding.exceptions.RunTimeException;
import com.ibm.coding.service.UserService;

import com.ibm.coding.util.EmptyUtil;
import com.ibm.coding.vo.LoginVo;
import com.ibm.coding.vo.UserInfoVo;
import com.ibm.coding.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author THLiu
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public UsersDto getUser(LoginVo loginVo) {
        UserDto userDto = userMapper.getUser(loginVo.getName());
        EmptyUtil.isNotNull(userDto, "用户不存在");
        if (!userDto.getPassword().equals(loginVo.getPass())) {
            throw new RunTimeException(403, "用户名或密码错误");
        }
        UsersDto users = new UsersDto();
        users.setId(userDto.getId());
        users.setUsername(userDto.getUsername());
        return users;
    }

    @Override
    public void registration(UserVo userVo) {
        if (userVo.getPass().equals("")) {
            throw new RunTimeException(202, "密码不能为空");
        } else {
            UserDto userDto = userMapper.getUser(userVo.getName());
            if (userDto == null) {
                User user = new User();
                user.setUsername(userVo.getName());
                user.setPassword(userVo.getPass());
                userMapper.createUser(user);
            } else {
                throw new RunTimeException(400, "用户名存在");
            }
        }
    }

    @Override
    public void checkUser(UserVo userVo) {
        UserDto userDto = userMapper.getUser(userVo.getName());
        if (userDto == null) {
            throw new RunTimeException(200, "通过");
        } else {
            throw new RunTimeException(400, "用户存在");
        }
    }

    @Override
    public void addUserInfo(UserInfoVo infoVo) {
        UserInfo user = userMapper.getUserInfoByNickName(infoVo.getNickName());
        if (user == null) {
            UserInfo userInfo = new UserInfo();
            BeanUtils.copyProperties(infoVo, userInfo);
            userMapper.addUserInfo(userInfo);
        } else {
            throw new RunTimeException(2001, "昵称存在");
        }
    }


}
