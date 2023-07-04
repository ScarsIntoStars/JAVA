package day09;

public class Animal {
//	// TODO Auto-generated method stub
//	String name; // 동물이름
//	String sound; // 울음소리
//	int leg; // 다리갯수

	// 필드
	private String name;
	private String sound;
	private int leg;
	// private은 같은 클래스 안에서만 접근가능
	// AnimalMain에서 사용하기 위해
	// 아래 매서드를 이용함

	// 매서드 (get/set)
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
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

	public void print() {
		System.out.println(name + "\t" + sound + "\t" + leg);
//		System.out.println(this.name + "\t" + this.sound + "\t" + this.leg);
//		위 아래가 똑같음!
		
	}
	
	public void print1() {
		System.out.printf("이름:%s, 울음:%s, 다리%d\n",name,sound,leg);
	}
	
	
}
