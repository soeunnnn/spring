package com.kh.spring.member.validator;


//밸리데이터용 객체 생성 (멤버는 여기저기서 많이 사용되야하니까 밸리데이터용 객체를 따로 하나 만든것임)
public class JoinForm {
	private String userId;
	private String password;
	private String tell;
	private String email;
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getTell() {
		return tell;
	}
	
	public void setTell(String tell) {
		this.tell = tell;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "JoinForm [userId=" + userId + ", password=" + password + ", tell=" + tell + ", email=" + email + "]";
	}
	
	
	
	
}
