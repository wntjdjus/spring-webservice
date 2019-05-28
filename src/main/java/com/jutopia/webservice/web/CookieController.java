package com.jutopia.webservice.web;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

public class CookieController {

    @GetMapping("/cookie")
    public String getCookie(@CookieValue("user") String user){
        return user+"님 안녕하세요!";
    }
}
