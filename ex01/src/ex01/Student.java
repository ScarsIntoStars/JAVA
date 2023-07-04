package ex01;

public class Student {

	// JAVA bean을 배웠다.

	// 필드
	private String sno; // 학번인데, 연산할 것이 아니고 고정값이라 인트말고 스트링을 쓰는 것ㅇ이 좋음
	private String sname;
	private String address;
	private String dept = "컴정과"; // 값을 넣지 않아도 기본적으로 값을 줌

	// 생성자 - 객체를 생성함
	public Student() {

	}

	public Student(String sno, String sname, String address) {
//		super();
		this.sno = sno;
		this.sname = sname;
		this.address = address;
	}

	// 매서드
	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", sname=" + sname + ", address=" + address + ", dept=" + dept + "]";
	}
}
