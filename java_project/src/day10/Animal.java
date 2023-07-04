package day10;

public class Animal {

	// 필드(인스턴스 변수)
	private String name;
	private String sound;
	private int leg;

	// 매서드
	public void setName(String name) {
		this.name = name;
	} // 받은 (파랑)name의 값을 (하늘)name으로 넘겨줌

	public String getName() { // 보낼 것이라 매개변수 필요없음
		return name;
	}

	public void setSound(String sound) {
		this.sound = sound;
	}

	public String getSound() {
		return sound;
	}

	public void setLeg(int leg) {
		this.leg = leg;
	}

	public int getLeg() {
		return leg;
	}

}
