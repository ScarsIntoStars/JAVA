package day02;

import java.util.Scanner;

public class 반복운_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 반복문 for
		// for(변수선언; 조건; 증감;)
//		for(int i=10; i<=20; i++) { // i가 5보다 작은 동안 반복해라 // i++ 좌와 우는 같다 i = i+1
//			System.out.println("안녕하세요");
//		}
		
//		for(int i=0; i<10; i++) {
//			System.out.println(i);
//		}
		
		// 2씩 증가
//		for(int i=1; i<10; i=i+2) { // 1 3 5 7 9
//			System.out.println(i); 
//		}
	
//		for(int i=0; i<10; i=i+2) { // 0 2 4 6 8 
//			System.out.println(i);
//		}
		
//		for(int i=3; i <= 100; i++) {
//			System.out.println(i);
//		}
		
//		for(int i=0; i<=10; i++) {
//			System.out.print(i);
//		}
		
		// 1~100 짝수출력
//		for(int i=0; i<=100; i=i+2) {
//			System.out.println(i);
//		}
		
		// 1~100 홀수출력
//		for(int i=1; i<=100; i=i+2) {
//			System.out.println(i);
//		}
		
		// 1~10 가로로 출력
		// 출력예시) 1,2,3,4,5,6,7,8,9,10
//		for(int i=1; i<=10; i++) {
//			if(i == 10) {
//				System.out.print(i);
//			} else {
//				System.out.print(i + ",");
//			}
//		} 
	
//		// 1~10 합 출력
//		int sum = 0; // sum은 누적시킬 변수
//		for(int i=1; i<=10; i++) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
		
		
//		int sum = 0
//		sum = sum + 1;
//		sum = sum + 1;
//		sum = sum + 1;
//		sum = sum + 1;
//		sum = sum + 1;
//		sum = sum + 1;								
//		sum = sum + 1;
//		sum = sum + 1;
//		sum = sum + 1;
//		sum = sum + 1;
// 		System.out.println(sum); // 55
		
		
		
		
//		int i; // 변수 i를 밖에서 선언해도 됨
//		int sum = 0;
//		for(i=1; i<=10; i++) {
//			sum = sum + i;
//		}
//		System.out.println(sum); // 출력문은 반복문 밖으로
		
		
		
		// 구구단출력
//		int dan = 6;
//		for(int i=1; i<20; i++) {
//			System.out.println(dan + " * " + i + " = " + (i*dan));
//		}
		
		
		// 1~100 3의 배수 갯수출력
//		int cnt = 0;
//		for(int i=0; i<=100; i++) {
//			if(i % 3 == 0) { // 이 조건이 참이면
//				cnt++;	     // cnt를 추가한다
//			}
//		}
//		System.out.println(cnt); // 34
		
		
		
		// 1~100 3의 배수 갯수, 5의 배수 갯수
//		int cnt1 = 0;
//		int cnt2 = 0;
//		
//		for(int i=1; i<=100; i++) {
//			if(i % 3 == 0) {
//				cnt1++;
//			}
//			if(i % 5 == 0) {
//				cnt2++;
//			}
//		}
//		System.out.println("3의 배수 갯수 " + cnt1 + "개");
//		System.out.println("5의 배수 갯수 " + cnt2 + "개");
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇 부터> ");
//		int a = sc.nextInt();
//		System.out.print("몇 까지> ");
//		int b = sc.nextInt();
//		
//		int sum = 0;
//		for(int i=a; i<=b; i++) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
		
		
		
		// 피즈버즈 놀이
		// 입력받은 수 부터, 입력받은 수 까지 출력
		// 3의 배수는 피즈
		// 5의 배수는 버즈
		// 3과 5의 배수는 피즈버즈
		// 1
		// 2
		// 피즈
		// 4
		// 버즈
		// 피즈
		// 7
		// 8
		// 피즈
		// 버즈
		// 11
		// 피즈......
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 부터> ");
		int a = sc.nextInt();
		System.out.print("몇 까지> ");
		int b = sc.nextInt();
		
		
		for(int i=a; i<=b; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("피즈버즈");
			} else if(i % 3 == 0) {
				System.out.println("피즈");
			} else if(i % 5 == 0) {
				System.out.println("버즈");
			} else {
				System.out.println(i);	
			}
			
		}
		
		
		
		
		
		
	}

}







