package ex04;

import java.util.*;

public class Juso {

	public static void run() {
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		// 샘플데이타
		List<StudentVO> array = new ArrayList<StudentVO>();
		StudentVO stu = new StudentVO(10, "홍길동", "인천", "010-0000-1515");
		array.add(stu);
		stu = new StudentVO(11, "박심청", "평양", "010-1541-1633"); // 이름을 같게 하려면 새로운 변수 지정을 안하면 됨
		array.add(stu);
		StudentVO stu1 = new StudentVO(12, "고길동", "대전", "010-7777-8888");
		array.add(stu1);
		int cnt = 12;

		while (run) {
			System.out.println("==========학생정보시스템==========");
			System.out.println("\n------------------------------------------------");
			System.out.println("1. 등록\n2. 목록\n3. 조회\n4. 수정\n5. 삭제\n0. 종료");
			System.out.println("------------------------------------------------");

			System.out.print("메뉴선택 > ");
			String menu = sc.nextLine();

			switch (menu) {
			case "0":
				run = false;
				System.out.println("프로그램을 종료합니당");
				break;

			case "1": // 등록
				StudentVO newStu = new StudentVO();
				newStu.setSno(++cnt);
				System.out.print("학생 이름을 입력하세용");
				newStu.setSname(sc.nextLine());
				System.out.print("학생 주소를 입력하세용");
				newStu.setAddress(sc.nextLine());
				System.out.print("학생 폰번을 입력하세용");
				newStu.setPhone(sc.nextLine());
				array.add(newStu);
				System.out.println("전체 학생 수는 : " + array.size() + "명 입니당");
				break;

			case "2":
				System.out.println("학번\t이름\t주소\t핸드폰번호");
				for (StudentVO vo : array) {

					System.out.printf("%d\t%s\t%s\t%s\n", vo.getSno(), vo.getSname(), vo.getAddress(), vo.getPhone());
				}
				System.out.println(array.size() + "명 등록되어 있습니당");
				break;

			case "3": // 조회
				System.out.print("찾을 학생의 학번을 입력하세용 : ");
				String search = sc.nextLine();

				for (StudentVO vo : array) {
					if (vo.getSno() == Integer.parseInt(search)) {
						System.out.println("이름 : " + vo.getSname());
						System.out.println("주소 : " + vo.getAddress());
						System.out.println("폰번 : " + vo.getPhone());
					}
				}
				break;

			case "4":
				System.out.println("수정 할 학번을 입력하세용 : ");
				String update = sc.nextLine();

				for (StudentVO vo : array) {
					if (vo.getSno() == Integer.parseInt(update)) {
						System.out.print("이름 : " + vo.getSname() + " => ");
						String newName = sc.nextLine();
						if (newName != "") {
							vo.setSname(newName);
						}

						System.out.print("주소 : " + vo.getAddress() + " => ");
						String newAddress = sc.nextLine();
						if (newAddress != "") {
							vo.setAddress(newAddress);
						}

						System.out.print("폰번 : " + vo.getPhone() + " => ");
						String newPhone = sc.nextLine();

						if (newName != "") {
							vo.setSname(newName);
						}
						if (newAddress != "") {
							vo.setAddress(newAddress);
						}
						if (newPhone != "") {
							vo.setPhone(newPhone);
						}
					}
				}
				break;

			case "5": // 삭제
				System.out.print("삭제 할 학번을 입력하세용 : ");
				String delete = sc.nextLine();

				for (StudentVO vo : array) {
					if (vo.getSno() == Integer.parseInt(delete)) {
						array.remove(vo); // array에는 삭제를 했지만, vo에는 남이있음 그래서 sysout을 밑에서 써도 됨
						System.out.println(vo.getSname() + "학생을 삭제했어용");
						break;
					}
				}
				break;
			default:
				System.out.println("다시 선택하세용");
			} // switch
		} // while
	} // run
} // class
