package com.ibm.coding.controller;

import com.ibm.coding.service.FriendService;
import com.ibm.coding.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author THLiu
 */
@RestController
@RequestMapping("api")
public class FriendController {

    @Autowired
    FriendService friendService;

    /**
     * 好友列表
     */
    @GetMapping("v1/friend/list")
    public JsonResponse<Object> list(@RequestParam Integer uid) {
        JsonResponse<Object> result = new JsonResponse<>();
        result.setData(friendService.getFriend(uid));
        result.setMessage("success");
        result.setCode(200);
        return result;
    }

    /**
     * 查找好友
     */
    @GetMapping("v1/friend/research")
    public JsonResponse<Object> search(@RequestParam String username) {
        return null;
    }

    /**
     * 添加好友
     */
    @GetMapping("v1/friend/add")
    public JsonResponse<Object> add(@RequestParam String username) {
        return null;
    }

    /**
     * 删除好友
     */
    @GetMapping("v1/friend/delete")
    public JsonResponse<Object> delete(@RequestParam String username) {
        return null;
    }
}
