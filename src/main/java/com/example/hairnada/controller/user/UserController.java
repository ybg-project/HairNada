package com.example.hairnada.controller.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/*")
@RequiredArgsConstructor
public class UserController {

    @GetMapping("/login")
    public void login(){

    }

    @GetMapping("/join")
    public void join(){

    }

    @GetMapping("/find-id")
    public void find(){

    }


}