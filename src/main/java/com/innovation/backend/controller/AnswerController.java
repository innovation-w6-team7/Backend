package com.innovation.backend.controller;

import com.innovation.backend.dto.request.AnswerRequestDto;
import com.innovation.backend.dto.response.ResponseDto;
import com.innovation.backend.security.user.UserDetailsImpl;
import com.innovation.backend.service.AnswerService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Validated
@RequiredArgsConstructor
@RestController
public class AnswerController {

    private final AnswerService answerService;

    @RequestMapping(value = "/auth/interview/{interviewId}/myanswer", method = RequestMethod.POST)
    public ResponseDto<?> createAnswer(@PathVariable Long interviewId, @RequestBody AnswerRequestDto requestDto, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        return answerService.createAnswer(interviewId, requestDto, userDetails);
    }

    @RequestMapping(value = "/auth/interview/{interviewId}/myanswer", method = RequestMethod.PUT)
    public ResponseDto<?> updateAnswer(@PathVariable Long interviewId, @RequestBody AnswerRequestDto requestDto, @AuthenticationPrincipal UserDetailsImpl userDetails) {
        return answerService.updateAnswer(interviewId, requestDto, userDetails);
    }

    @RequestMapping(value = "/interview/{interviewId}/answers", method = RequestMethod.GET)
    public ResponseDto<?> getAnswers(@PathVariable Long interviewId) {
        return answerService.getAnswers(interviewId);
    }

}
