package com.ibm.coding.controller;

import com.ibm.coding.service.UserService;
import com.ibm.coding.util.JsonResponse;
import com.ibm.coding.vo.LoginVo;
import com.ibm.coding.vo.UserVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @author THLiu
 */

@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/v1/user/login")
    public JsonResponse<Object> login(@RequestBody LoginVo loginVo) {
        JsonResponse<Object> result = new JsonResponse<>();
        result.setCode(200);
        result.setMessage("success");
        result.setData(userService.getUser(loginVo));
        return result;
    }

    @PostMapping("/v1/user/registration")
    public JsonResponse<Object> registration(@RequestBody UserVo userVo) {
        userService.registration(userVo);
        JsonResponse<Object> result = new JsonResponse<>();
        result.setCode(201);
        result.setMessage("success");
        return result;
    }

    @PostMapping("/v1/user/checkUser")
    public void checkUser(@RequestBody UserVo userVo) {
        userService.checkUser(userVo);
    }


}
