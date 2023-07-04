package day09;

public class Boardd {

	String title;
	int page;
	boolean open;

	// 기본 생성자
	public Boardd() {

	}

	int cnt = 100;

	// 추가한 생성자
	public Boardd(String title, int page, boolean open) {
		this.title = title;
		this.page = page;
		this.open = open;

	}

	// 매서드 get/set
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public boolean getopen() {
		return open;
	}

	public void setOpne(boolean open) {
		this.open = open;
	}

	// 매서드명:cntUp, 매개변수x, 리턴타입x, 실행문구 cnt 1증가
	public void cntUp() {
		cnt++;

	}

	// 매서드명:cntUp1, 매개변수: 정수하나, 리턴타입o
	// 실행문구 : 매개변수만큼 cnt증가하고, cnt리턴

	public int cutUp1(int a) {
		cnt++;
		return cnt = cnt + a;

	}

	// 전체필드 다 출력하는 print매서드
	public void print() {
		System.out.println(title + "\t" + page + "\t" + open);
	}

}
