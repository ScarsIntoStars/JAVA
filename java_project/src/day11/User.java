package day11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class User {

	private String name;
	private String id;
	private String pw;
	private String joinDate;

	// 기본생성자, 모든필드 매개변수로 받는 생성자
	public User() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
		joinDate = dtf.format(LocalDateTime.now());
	}

	public User(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	} // 바로 필드에 값 입력하기 편해서 사용함

	// 매서드(get/set)

	public String getName() { // 사용법 : 객체.getName();
		return name;
	}

	public void setName(String name) { // 사용법 : 객체.setName("안녕");
		this.name = name;
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

	// 매서드 print
	public void print() {
		System.out.println(name + "\t" + id + "\t" + pw + "\t" + joinDate);
	}

}
