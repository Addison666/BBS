package com.ibm.coding.service.Impl;

import com.ibm.coding.dao.FriendMapper;
import com.ibm.coding.dto.FriendDto;
import com.ibm.coding.dto.FriendsDto;
import com.ibm.coding.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author THLiu
 */
@Service
public class FriendServiceImpl implements FriendService {
    @Autowired
    FriendMapper friendMapper;

    @Override
    public FriendsDto getFriend(Integer uid) {
        List<FriendDto> fri = friendMapper.getFriend(uid);
        FriendsDto friendsDto = new FriendsDto();
        friendsDto.setUid(uid);
        friendsDto.setList(fri);
        return friendsDto;
    }
}
