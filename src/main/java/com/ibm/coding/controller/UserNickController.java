package com.ibm.coding.controller;

/**
 * @author THLiu
 */

import com.ibm.coding.service.UserInfoService;
import com.ibm.coding.util.JsonResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class UserNickController {

    @Autowired
    UserInfoService userInfoService;

    @GetMapping("/v1/user/info")
    public JsonResponse<Object> info(@RequestParam Integer uid){
        JsonResponse<Object> result = new JsonResponse<>();
        result.setCode(200);
        result.setMessage("success");
        result.setData(userInfoService.getNickUserInfo(uid));
        return result;
    }

}
