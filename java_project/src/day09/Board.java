package day09;

public class Board {

	// 필드
	private String title;
	private int cnt;
	private boolean open;

	// 생성자
	public Board(String title, int cnt, boolean open) {
		this.title = title;
		this.cnt = cnt;
		this.open = open;
	}

	// 매서드 (get/set)
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public boolean getOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	// 매서드명:cntUp, 매개변수x, 리턴타입x, 실행문구 cnt 1증가
	public void cntUp() {
		cnt++;
	}

	
	// 매서드명:cntUp1, 매개변수: 정수하나, 리턴타입o
	// 실행문구 : 매개변수만큼 cnt증가하고, cnt리턴
	public int cntUp1(int a) {
		cnt++;
		return cnt += a;
	}

	// 전체필드 다 출력하는 print매서드
	public void print() {
		System.out.println(title + "\t" + cnt + "\t" + open);
	}
}
