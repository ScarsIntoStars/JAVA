package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Member {

	private long id;
	// long 기본자료형 0
	// Long 매퍼클래스(?) null
	// int와 Inteager(?)의 차이
	private String email;
	private String pw;
	private String name;
	private String joinDate;

	public Member() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 hh:mm:ss");
		joinDate = dtf.format(LocalDateTime.now());
	}

	public Member(Long id, String email, String pw, String name) {
		this();
		this.id = id;
		this.email = email;
		this.pw = pw;
		this.name = name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String setPw() {
		return pw;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void print() {
		System.out.println("이름\t아이디\t비밀번호");
	}

}
