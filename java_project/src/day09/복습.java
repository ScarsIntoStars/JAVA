package day09;

import java.util.Scanner;

public class 복습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int answer = (int) (Math.random() * 31) + 1; // 1~31 랜덤정답

		// 반복하면서 입력받는데
		// 정답보다 크면 down
		// 정답보다 작으면 up
		// 정답이면 반복문 종료

		while (true) {
			System.out.print("에상하는 답은? ");
			int guess = sc.nextInt();

			if (guess > answer) {
				System.out.println("down!");
			} else if (guess < answer) {
				System.out.println("up");
			} else if (guess == answer) {
				System.out.println("정답입니다!");
				break;
			} else {
				System.out.println("1부터 31까지의 숫자만 입력가능합니다.");
			}

		}

	}

}
