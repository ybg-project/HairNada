package com.example.hairnada.controller.admin;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/*")
@RequiredArgsConstructor
public class AdminController {
    // 유저 리스트
    @GetMapping("/userList")
    public void memberList(){}

    // 로그인
    @GetMapping("/adminLogin")
    public void adminLogin(){}

    // 배송 관리
    @GetMapping("/delivery")
    public void delivery(){}

    // 헤어 리스트
    @GetMapping("/hairList")
    public void hairList(){}

    // 헤어 게시글 읽기
    @GetMapping("/hairRead")
    public void hairRead(){}

    // 헤어 게시글 수정
    @GetMapping("/hairModify")
    public void hairModify(){}

    // 헤어 게시글 업로드
    @GetMapping("/hairUpload")
    public void hairUpload(){}

    // 등업 신청 목록
    @GetMapping("/membership")
    public void membership(){}

    // 등업 신청 게시글 읽기
    @GetMapping("/levelUp")
    public void levelUP(){}

    // 상품 리스트
    @GetMapping("/storeList")
    public void storeList(){}

    // 상품 읽어오기
    @GetMapping("/storeRead")
    public void storeRead(){}

    // 상품 올리기
    @GetMapping("/storeUpload")
    public void storeUpload(){}




}