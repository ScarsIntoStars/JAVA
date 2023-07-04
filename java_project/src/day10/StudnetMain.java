package day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudnetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		매서드를 사용하는 이유는 재사용성!

//		List<Student> list = new ArrayList<Student>(); // student만 들어감
//
//		Student s = new Student(); // s라는 스튜던트 객체생성
//		// (안에 필드로 no name dept year을 가지고 있음) student 객체만 들어갈 수 있음
//		// s는 필드만 가지고 있는 객체, 내용은 없음
//		list.add(s);
//		
//
//		String[] list2 = new String[10]; // String만 들어갈 수 있는 list2
//		String b = "안녕"; // String만 들어갈 수 있는 b를 만듬
//		list2[0] = b; // b를 list2 0번 방에 넣음
//		

		List<Student> list = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("=====학사관리시스템");
			System.out.println("1.학생등록 2.학생리스트 3.학생검색 0.종료");
			System.out.print("메뉴 > ");
			int menu = sc.nextInt();

			if (menu == 1) {
				Student s = new Student();
				System.out.print("학번 > ");
				s.setNo(sc.next());
				System.out.print("이름 > ");
				s.setName(sc.next());
				System.out.print("학과 > ");
				s.setDept(sc.next());
				System.out.print("학년> ");
				s.setYear(sc.nextInt());
				System.out.println(s.getName() + "학생 등록완료!");
				list.add(s);
			} else if (menu == 2) {
				System.out.println("학번\t이름\t학과\t학년");
				System.out.println("========================");
				for (int i = 0; i < list.size(); i++) {
//					System.out.println(list.get(i).getNo() + "\t" + list.get(i).getName() + "\t" + list.get(i).getDept()
//							+ "\t" + list.get(i).getYear());
					list.get(i).print();
				}

			} else if (menu == 3) {
				System.out.print("조회할 학번> ");
				String find = sc.next();

				for (int i = 0; i < list.size(); i++) {
					if (find.equals(list.get(i).getNo())) {
						// list에서 i번째에 있는 no가 find와 같은지 비교

					} else {
						System.out.println("없는 학번입니다.");
					}
				}
			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시입력");
			}

		}
		System.out.println("학사프로그램 종료");
	}

}
