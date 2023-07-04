package day10;

public class User2 {

	// 필드(인스턴스 변수)
	private String name;
	private String id;
	private String pw;

	// 생성자
	public User2() {

	}

	public User2(String name, String id, String pw) {
		this.name = name;
		this.id = id;
		this.pw = pw;
	}

	// set,get
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getPw() {
		return pw;
	}

	public void print() {
		System.out.printf("%s\t+%s\t%s", name, id, pw);
	}

}
