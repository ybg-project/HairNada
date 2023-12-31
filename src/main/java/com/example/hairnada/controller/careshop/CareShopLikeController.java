package com.example.hairnada.controller.careshop;

import com.example.hairnada.dto.careshop.CareShopLikeDto;
import com.example.hairnada.service.careshop.CareShopLikeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/careshopLike/*")
@RequiredArgsConstructor
public class CareShopLikeController {
    private final CareShopLikeService careShopLikeService;

    // 좋아요 확인
    @GetMapping("/check")
    public List<Long> checkLike(HttpServletRequest req){
        Long userNumber = (Long)req.getSession().getAttribute("userNumber");
        List<Long> likeList = careShopLikeService.checkLike(userNumber);
        return likeList;
    }

    // 좋아요 추가
    @PostMapping("/add")
    public void addLike(@RequestBody CareShopLikeDto careShopLikeDto, HttpServletRequest req){
        Long userNumber = (Long)req.getSession().getAttribute("userNumber");
        careShopLikeDto.setUserNumber(userNumber);
        careShopLikeService.addLike(careShopLikeDto);
    }

    // 좋아요 삭제
    @DeleteMapping("/subtract")
    public void subtractLike(@RequestBody CareShopLikeDto careShopLikeDto, HttpServletRequest req){
        Long userNumber = (Long)req.getSession().getAttribute("userNumber");
        careShopLikeDto.setUserNumber(userNumber);
        careShopLikeService.subtractLike(careShopLikeDto);
    }
}
