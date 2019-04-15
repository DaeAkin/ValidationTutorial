package com.kei890.validationtutorial.dto;
import org.springframework.stereotype.Component;

@Component
public class MemberDto {
	
	int no;
	String id;
	String pw;
	
	public MemberDto() {
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "id : " + getId() + "\n pw :" + getPw();
	}

}
