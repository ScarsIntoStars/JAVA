package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Address1 {

	public static void run() {
		List<Student> array = new ArrayList<Student>();
		// 리스트에 학생을 넣음. 그 이름을 array로 만듬
		Student stu = new Student("20231", "홍길동", "인천 서구 경서동"); // 필드를 이용한 생성자로 만듦 , 이름이 같은 생성자를 만들어 쓴느 것 오버로딩 함
		array.add(stu);
		stu = new Student("20232", "심청이", "인천 부평 계산동");
		array.add(stu);
		stu = new Student("20233", "강감찬", "서울 강서구 화곡동");

		array.add(stu);
		Scanner s = new Scanner(System.in);
		boolean run = true;
//		int count = 3;

// 		중괄호 기준으로 변수선언을 한다.
//		그래서 boolean을 case 3에서 선언을 하고, case1에서 쓰려고 할 때 다시 변수선언을 하지 않아도 된다.

		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 주소등록\n2. 주소목록\n3. 주소검색\n4. 주소변경\n5. 주소삭제\n0. 종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 : ");
			String menu = s.nextLine();

			switch (menu) {
			case "5":
				System.out.print("삭제 할 학생학번 ");
				String delete = s.nextLine();
				boolean find = false;
				for (Student st : array) {
					if (delete.equals(st.getSno())) {
						array.remove(st);
						find = true;
						System.out.println("삭제완료입니다.");
						break;
					}

				}
				if (!find)
					System.out.println(delete + "학생이 없습니다.");

				break;
			case "4":
				System.out.print("수정 할 학생이름 : ");
				String update = s.nextLine();
				find = false;
				for (Student st : array) {
					if (update.equals(st.getSname())) {
						find = true;
						System.out.println("이름 : " + st.getSname());
						System.out.println("주소 : " + st.getAddress());
						System.out.print("새로운 주소 : ");
						String newAdd = s.nextLine();
						if (newAdd != "") {
							st.setAddress(newAdd);
							System.out.println("새로운 주소로 수정되었습니다.");
						}

					}
				}
				if (!find)
					System.out.println(update + "학생이 없습니다!");
				break;
			case "3":
				System.out.print("검색 할 이름 : ");
				String search = s.nextLine();
				find = false;
				for (Student st : array) {
					if (search.equals(st.getSname())) { // 찾았을 때
						System.out.println(st.toString());
						find = true;
					}
				}
				if (!find)
					System.out.println(search + "학생이 없습니다.");

				break;
			case "2":

				for (Student st : array) {
					System.out.println(st.toString());
				}

				break;
			case "1":
				stu = new Student(); // 기본생성자를 사용

				stu.setSno("2023" + (array.size() + 1));
				System.out.println("학번 : " + stu.getSno());

				System.out.print("이름 입력 : ");
				stu.setSname(s.nextLine());

				System.out.print("주소 입력 : ");
				stu.setAddress(s.nextLine());

				array.add(stu);

				System.out.println(array.size() + "명 등록완료!");
				break;

			case "0":
				System.out.println("프로그램 종료");
				run = false;
				break;

			default:
				System.out.println("메뉴를 다시 선택하세요!");
				break;

			} // while
		} // swith
	} // run
} // class
