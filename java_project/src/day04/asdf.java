package day04;

import java.util.Scanner;

public class asdf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//입력을 하겠다
		String name = "";							// 이름의 기본 변수타입(String)
		String id = "";								// 아이디의 기본 변수타입(String)
		String pw = "";								// 패스워드의 기본 변수타입(String)
		boolean login = false;						// login의 기본 변수타입 : false(boolean) : 아직 로그인 안한상태 

		while (true) {								// true이므로 반복
			if (login) {							// 만약 login의 값이 true일 경우 (로그인을 하였을 경우) 
				System.out.println("========로그인상태=======");				// 출력
				System.out.println("1.회원정보(" + name + ")님" + " 2.로그아웃 0.종료 "); // 출력 
			} else {											// 아니면 login 값이 false일 경우 (로그인을 하지 않았을 경우)
				System.out.println("========회원가입=======");		// 출력
				System.out.println("1.회원가입 2.로그인 3.정보 0.종료"); // 출력
			}
			System.out.print("선택 : ");						// 메뉴 중에서 하나를 선택
			int menu = sc.nextInt();						// 메뉴 선택 값 입력

			if (menu == 1) {								// 메뉴를 1번을 입력했을 경우 
				if (login) {								// 만약 이미 로그인을 했을 경우 (login = true)
					System.out.println("이름\t아이디\t비밀번호");		// 출력
					System.out.println("===========================");	// 출력
					System.out.println(name + "\t" + id + "\t" + pw);	// name값, id값, pw값이 출력
				} else {									// 아직 로그인을 하지 않았을 경우(login = false)
					System.out.print("이름를 입력하시오 : ");	// 이름을 입력
					name = sc.next();						// 입력
					System.out.print("아이디를 입력하시오 : "); // 아이디를 입력
					id = sc.next();							// 입력
					System.out.print("패스워드를입력하시오 : ");	// 패스워드를 입력
					pw = sc.next();							// 입력
					System.out.println("회원가입 완료!!!");	// 출력
				}

			} else if (menu == 2) {							// 메뉴 2을 입력했을 경우
				if (login) {								// 만약 이미 로그인을 했을 경우 (login = true) 
					login = false;							// 로그아웃을 한다 (login = false)
					System.out.println(name + "님 로그아웃 되었습니다.");	// 출력
				} else {									// 아직 로그인을 하지 않았을 경우
					System.out.println("====로그인을 하십시오====");	// 출력
					System.out.print("아이디 : ");					// 출력
					String M_name = sc.next();						// 로그인을 할 아이디 입력
					System.out.print("패스워드 : ");					// 출력
					String M_pw = sc.next();						// 로그인을 할 패스워드 입력
					if (M_name.equals(id) && M_pw.equals(pw)) {		// 만약 회원가입 했던 아이디, 패스워드 하고 바로위에서 입력한 로그인을 할 아이디, 패스워드의 값이 같을 경우
						System.out.println("로그인 성공!");			// 출력
						login = true;								// 로그인값을 true로 놓는다. (로그인 성공)
					} else {										// 만약 회원가입 했던 아이디, 패스워드 하고 바로위에서 입력한 로그인을 할 아이디, 패스워드의 값이 같을 경우
						System.out.println("로그인을 실패하였습니다.");  //출력
					}
				}
			} else if (menu == 0) {								  	// 메뉴 0을 입력했을 경우
				System.out.println("로그인을 종료합니다.");				// 출력
				break;												// 전체 반복문을 종료
			} else {												// 만약 메뉴 입력을 0~3 사이의 값을 입력을 안했을 경우
				System.out.println("0~3까지 입력가능");				// 출력
			}
			System.out.println();									// 반복문 띄어쓰기
		}
		System.out.println("프로그램 종료");							// 출력
	}

}