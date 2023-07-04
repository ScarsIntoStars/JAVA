package day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {

		List<Member> list = new ArrayList<Member>();
		Scanner sc = new Scanner(System.in);
		Long id = 100l; // 뒤에 l이 있어야 롱 타입으로 인식함

		while (true) {
			System.out.println("1.멤버등록 2.멤버리스트 3.멤버검색 0.종료");
			System.out.print("메뉴선택 : ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("이메일 > ");
				String email = sc.next();
				System.out.print("비밀번호 > ");
				String pw = sc.next();
				System.out.print("이름 > ");
				String name = sc.next();
				Member m = new Member(id++, email, pw, name); // 아이디는 자동으로 100, 101, 102 ...
				System.out.println(name + "님 맴버가입 축하드립니다");
				list.add(m);

			} else if (menu == 2) {
				System.out.println("No\t이메일\t비밀번호\t이름\t가입날짜");
				System.out.println("==========================================");

//				for (int i = 0; i < list.size(); i++) {
//					list.get(i).print();	
//				}

				for (Member m : list) { // 향상된 for문 or foreach
					m.print();
				}

			} else if (menu == 3) {
				System.out.print("검색 할 아이디 : ");
				Long searchId = sc.nextLong();
				System.out.println("No\t이메일\t비밀번호\t이름\t가입날짜");
				System.out.println("==========================================");
				boolean find = false;

				for (Member m : list) {
					if (searchId.equals(m.getId())) {
						m.print();
						find = true;
						break;
					}

//				for (int i = 0; i < list.size(); i++) {
//
//					if (searchId.equals(list.get(i).getId())) {
//
//					}
//					if (sEmail.equals(list.get(i).getEmail())) {
//						list.get(i).print();
//						

					if (!find) {
						m.print();
						find = true;
						break;
					}
				}

			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");

	}
}

// 선생님꺼
//
//package day11;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//
//public class Member {
//	private Long id;
//	private String email;
//	private String pw;
//	private String name;
//	private String joinDate;
//	
//	public Member() {
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일 hh:mm:ss");
//		joinDate = dtf.format(LocalDateTime.now());
//	}
//	public Member(Long id, String email, String pw, String name) { // Member m = new Member(1,"a","1111","홍길동");
//		this();
//		this.id = id;
//		this.email = email;
//		this.pw = pw;
//		this.name = name;
//	}
//	
//	public Long getId() {
//		return id;
//	}
//	public void setId(Long id) {
//		this.id = id;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getPw() {
//		return pw;
//	}
//	public void setPw(String pw) {
//		this.pw = pw;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void print() {
//		System.out.printf("%d\t%s\t%s\t%s\t%s\n",id,email,pw,name,joinDate);
//	}
//}
//
//
//
//







