package ex30;

public class StudentsVO {

	public String scode;
	public String sname;
	public String dept;

	public String getScode() {
		return scode;
	}

	public void setScode(String scode) {
		this.scode = scode;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "StudentsVO [scode=" + scode + ", sname=" + sname + ", dept=" + dept + "]";
	}

}
