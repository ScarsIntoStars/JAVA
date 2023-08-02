package ex04;

public class StudentVO { // 자바빈

	// 필드
	private int sno;
	private String sname;
	private String address;
	private String phone;

	
	// 기본 생성자
	public StudentVO() {

	}

	// 만든 생성자 (생성자 오버로딩) 매개변수의 갯수가 달라서 이름이 같아도 됨
	public StudentVO(int sno, String sname, String address, String phone) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.address = address;
		this.phone = phone;
	}

	
	// 매서드
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "StudentVO [sno=" + sno + ", sname=" + sname + ", address=" + address + ", phone=" + phone + "]";
	}
}
