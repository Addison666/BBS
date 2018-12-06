package com.ibm.coding.service.Impl;

import com.ibm.coding.dao.UserInfoMapper;
import com.ibm.coding.dto.UserInfoDto;
import com.ibm.coding.dto.UserNickInfoDto;
import com.ibm.coding.entity.UserNickInfo;
import com.ibm.coding.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author THLiu
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    UserInfoMapper userInfoMapper;

    @Override
    public UserNickInfoDto getNickUserInfo(Integer uid) {
        UserNickInfoDto ui = new UserNickInfoDto();
        UserNickInfo un = userInfoMapper.getNickInfoByUid(uid);
        ui.setNickName(un.getNickName());
        ui.setAge(un.getAge());
        ui.setCreateTime(un.getCreateTime());
        if (un.getSex() == 1) {
            ui.setSex("女");
        } else {
            ui.setSex("男");
        }
        return ui;
    }
}
