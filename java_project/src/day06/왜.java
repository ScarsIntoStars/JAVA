package day06;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex02_sign {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] name = new String[10];
		String[] id = new String[10];
		String[] pw = new String[10];
		String[] date = new String[10];
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");

		int cnt = 0;

		while (true) {
			System.out.println("======마켓커리======");
			System.out.println("1.회원가입 2.로그인 3.회원목록 0.종료");
			System.out.print("선택 : ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.println("화원가입을 합니다!");
				System.out.print("이름을 입력하세요 : ");
				name[cnt] = sc.next();
				System.out.print("id를 입력하세요 : ");
				id[cnt] = sc.next();
				System.out.print("pw를 입력하세요 : ");
				pw[cnt] = sc.next();
				System.out.println();
				System.out.println("가입이완료되었습니다!!!");
				LocalDateTime now = LocalDateTime.now(); 											// 현재날짜시간 구하는 문법
				System.out.println(now);
				date[cnt] = dtf.format(now);
				cnt++; 																				// cnt++를 하여 다음 index의 값을 입력 할 수 있게 한다.

			} else if (menu == 2) {
				System.out.println("로그인을 합니다!!!!!");
				System.out.println();
				System.out.print("id를 입력하시오 : ");
				System.out.println();
				String M_id = sc.next();
				System.out.print("pw를 입력하시오 : ");
				String M_pw = sc.next();
				boolean con = true;																	 // 기본 con 값에 true를 넣는다 // 아래에서 id, pw가 맞으면 멈추기 위해서

				for (int i = 0; i < cnt; i++) { 													// for 반복문으로 전체의 index의 값을 비교하여 로그인이 가능한지 판단

					if (M_id.equals(id[i])) {														// 만약 입력값이랑 아이디랑 같으면
						if (M_pw.equals(pw[i])) {													// 만약 패스워드도 같으면
							System.out.println("로그인 되었습니다!!!!!!!");								// 해당 문구를 출력
							con = false;															// con 값에 false를 넣어 아래 if문이 실행되지 않기 때문
							break;																	// 멈춰!
						} else {																	// 패스워드가 입력값이랑 다르면
							System.out.println("비밀번호가 틀립니다.");									// 해당 문구를 출력
							con = false;															// con 값에 false를 넣어 아래 if문이 실행되지 않기 때문 
							break;																	// 멈췅!
						}
					}
					if (con == true) { 																// con값이 true일 경우
						System.out.println("아이디가 틀렸습니다.");
						break; 																		// 반복을 멈춤
					}
				}
			} else if (menu == 3) {
				System.out.println("목록을 출력합니다!!!");
				System.out.println();
				System.out.println("이름\t아이디\t비밀번호\t가입날짜");
				for (int i = 0; i < cnt; i++) { 														// 반복문을 집어넣어 전체가 출력 될 수 있게 함
					System.out.printf("%s\t%s\t%s\t%s\n", name[i], id[i], pw[i], date[i]);
				}
			} else if (menu == 0) {
				System.out.println();
				System.out.println("프로그램을 종료합니다!!");
				break;
			} else {
				System.out.println();
				System.out.println("다시입력 하십쇼");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}