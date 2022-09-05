package com.innovation.backend.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
@AllArgsConstructor
@Getter
public enum ErrorCode {
    // 회원가입, 로그인 관련 에러

    DUPLICATE_MEMBERNAME("DUPLICATE_MEMBERNAME", "중복된 이름이 있습니다."),
    PASSWORDS_NOT_MATCHED("PASSWORDS_NOT_MATCHED", "비밀번호와 비밀번호 확인이 일치하지 않습니다."),
    MEMBER_NOT_FOUND("MEMBER_NOT_FOUND", "사용자를 찾을 수 없습니다."),
    INVALID_LOGIN("INVALID_LOGIN", "로그인이 필요합니다."),
    INVALID_TOKEN("INVALID_TOKEN", "Token이 유효하지 않습니다."),

    // 인터뷰 관련 에러
    INTERVIEW_NOT_FOUND("INTERVIEW_NOT_FOUND", "해당 인터뷰 id를 찾을 수 없습니다."),
    SUBTOPIC_NOT_FOUND("INTERVIEW_NOT_FOUND", "해당 인터뷰 id를 찾을 수 없습니다."),

    ;

    private final String code;
    private final String message;
}
