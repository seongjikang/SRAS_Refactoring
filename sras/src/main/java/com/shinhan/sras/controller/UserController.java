package com.shinhan.sras.controller;

import com.shinhan.sras.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins = "http://192.168.155.6:25111")
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/confirm/authority/userId/{userId}")
    public Map<String, Object> confirmUserId(@PathVariable String userId) {
        return userService.confirmUserId(userId);
    }

    @PostMapping("/login")
    public Map<String, Object> login(@RequestBody HashMap<String, Object> user) {
        return userService.login(user.get("userId").toString(), user.get("password").toString());
    }

    @GetMapping("/get/userName/userId/{userId}")
    public Map<String, Object> getUserName(@PathVariable String userId) {
        return userService.getUserName(userId);
    }

}
