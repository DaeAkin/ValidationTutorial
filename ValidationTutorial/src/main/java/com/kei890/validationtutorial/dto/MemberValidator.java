package com.kei890.validationtutorial.dto;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class MemberValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return MemberDto.class.equals(clazz);
	}

	@Override
	public void validate(Object obj, Errors error) {
		ValidationUtils.rejectIfEmpty(error, "id", "member.id.empty","아이디를 입력해주세요.");
		ValidationUtils.rejectIfEmpty(error, "pw", "member.pw.empty","비밀번호를 입력해주세요");
		
	}

}
