package com.ibm.coding.controller;

import com.ibm.coding.service.FriendService;
import com.ibm.coding.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author THLiu
 */
@RestController
@RequestMapping("api")
public class FriendController {

    @Autowired
    FriendService friendService;

    @GetMapping("v1/friend/list")
    public JsonResponse<Object> search(@RequestParam Integer uid) {
        JsonResponse<Object> result = new JsonResponse<>();
        result.setData(friendService.getFriend(uid));
        result.setMessage("success");
        result.setCode(200);
        return result;
    }
}
