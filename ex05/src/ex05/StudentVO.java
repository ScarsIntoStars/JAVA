package ex05;

import java.util.Date;

public class StudentVO {



	private String sno;
	private String sname;
	private String dept;
	private String birthday; // 두 개가 있는데 유틸에 있는 값 가져왔음
	private int year;

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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "StudentVO [sno=" + sno + ", sname=" + sname + ", dept=" + dept + ", birthday=" + birthday + ", year="
				+ year + "]";
	}

}
