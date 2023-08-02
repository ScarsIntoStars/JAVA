package ex11;

public class TypeVO {
	public String cno;
	public int tno;

	public String getCno() {
		return cno;
	}

	public void setCno(String cno) {
		this.cno = cno;
	}

	public int getTno() {
		return tno;
	}

	public void setTno(int tno) {
		this.tno = tno;
	}

	@Override
	public String toString() {
		return "TypeVO [cno=" + cno + ", tno=" + tno + "]";
	}

}
