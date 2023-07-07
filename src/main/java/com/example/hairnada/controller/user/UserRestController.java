package com.example.hairnada.controller.user;

import com.example.hairnada.service.user.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users/*")
@Slf4j
public class UserRestController {
   private final UserService userService;
   @GetMapping("/checkId")
   public int checkUserId(String userId){
      return userService.checkUserId(userId);
   }

   @GetMapping("/checkNickname")
   public int checkUserNickname(String userNickname){
      return userService.checkUserNickname(userNickname);
   }

   @GetMapping("/loginFail")
   public int loginFail(String userId, String userPassword){
      return userService.loginFail(userId, userPassword);
   }

}
