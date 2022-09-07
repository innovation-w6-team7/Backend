package com.innovation.backend.controller;

import com.innovation.backend.dto.response.ResponseDto;
import com.innovation.backend.entity.Member;
import com.innovation.backend.security.user.UserDetailsImpl;
import com.innovation.backend.service.MyPageService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.method.P;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/auth/interview/mypage")
public class MyPageController {
    private final MyPageService myPageService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseDto<?> readMyPage(@AuthenticationPrincipal UserDetailsImpl userDetailsImpl){
        Member member = userDetailsImpl.getMember();
        return myPageService.readMypage(member);
    }

    @RequestMapping(value = "/{interviewId}", method = RequestMethod.PUT)
    public ResponseDto<?> makePublic(@PathVariable Long interviewId , @AuthenticationPrincipal UserDetailsImpl userDetailsImpl){
        Member member = userDetailsImpl.getMember();
        return myPageService.makePublic(interviewId,member);
    }

}
