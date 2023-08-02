package ex09;

import java.util.*;

public class MessageVO extends UserVO { // UserVO의 이름을 쓰기 위해 상속바등ㅁ
	private int mid;
	private String sender;
	private String receiver;
	private Date sdate;
	private String message;

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getReceiver() {
		return receiver;
	}

	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public Date getSdate() {
		return sdate;
	}

	public void setSdate(Date sdate) {
		this.sdate = sdate;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override // toString에 인헤리티드를 하면 상속값도 가져올 수 있다.
	public String toString() {
		return "MessageVO [mid=" + mid + ", sender=" + sender + ", receiver=" + receiver + ", sdate=" + sdate
				+ ", message=" + message + ", getUname()=" + getUname() + "]";
	}

}
