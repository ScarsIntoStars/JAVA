package day10;

public class Member {

	// 필드
	private String email;
	private String pw;
	private String name;
	private String joinDate;

	// 생성자
	public Member() {
	}

	public Member(String email, String pw, String name, String joinDta) {
		this.email = email;
		this.pw = pw;
		this.joinDate = joinDate;
	}

	// 매서드
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getJoinData() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}
	
	public void print() {
		System.out.printf("%s\t%s\t%s\t%s\n", email,pw,name,joinDate);
	}
	
	
}
