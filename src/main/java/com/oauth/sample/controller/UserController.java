package com.oauth.sample.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/my-info")
    public Map<String, Object> getMyInfo(@AuthenticationPrincipal OAuth2User oAuth2User) {
//        Map<String, Object> res = new HashMap<>();
//        res.put("name", "Huy");
//        res.put("email", "example@gmail.com");
//        return res;
        return oAuth2User.getAttributes();
    }

}
