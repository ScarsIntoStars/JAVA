package day10;

import java.util.ArrayList;
import java.util.List;

public class ArrayLiseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열
		String[] a = new String[10];
		a[0] = "안녕";
		a[1] = "반가워요";
		a[2] = "잘있어요";

		System.out.println(a[0]);
//		a[0] = "안녕하세요";
//		System.out.println(a[0]);

		// 배열은 칸을 정해놓고 사용
		// arrayList - 값을 집어넣을 때 마다 칸이 증가함
		ArrayList<String> b = new ArrayList<>();
		// 위와 아래가 같음
		// List<String> b = new ArrayList<>(); // new ArrayList<>(String);과 같음
		// <String만 들어갈 수 있음>

		// 방에 집어넣는 게 아니라, 추가하는 개념
		b.add("안녕"); // 값 추가
		b.add("반가워요");
		b.add("잘있어요");
		System.out.println(b.get(0)); // 값 확인
		b.set(0, "안녕하세요"); // 값 변경

		// a와 b의 값을 for문으로 출력
		for (int i = 0; i <= 2; i++) {
			System.out.println(a[i]);
		}

		for (int j = 0; j <= 2; j++) { // arrayList는 .size로 길이확인가능
			System.out.println(b.get(j));
		}

	}

}
