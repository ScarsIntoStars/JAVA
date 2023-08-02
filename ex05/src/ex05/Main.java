package ex05;

import java.text.SimpleDateFormat;
import java.util.Scanner;

//	public static void main(String[] args) {
//		
//		StudentDAO dao = new StudentDAO();
//	
//		// DB연결 테스트
//		Databass.connect();
//	
//		// 학생 목록 출력
//		List<StudentVO> array = dao.list();
//		for (StudentVO vo : array) {
//			System.out.println(vo.toString());
//		}
//	}

public class Main {

	public static void main(String[] args) {
		StudentDAO dao = new StudentDAO();
//		SimpleDateFormat sdf = new SimpleDateFormat("YYYY년MM월dd일"); // 날짜 만들 때 많이 씀. date타입을 String으로 바꿈
		Scanner s = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("\n\n******* 학생관리 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.입력 |2.조회 |3.목록 |4.수정 |5.삭제 |0.종료");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			String menu = s.nextLine();
			switch (menu) {
			case "0":
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			case "1": // 입력
				StudentVO stu = new StudentVO();
				stu.setSno(dao.getNo());
				System.out.println("학번 : " + stu.getSno());
				System.out.print("이름 : ");
				stu.setSname(s.nextLine());
				stu.setDept("컴정");
				System.out.println("학과 : " + stu.getDept());
				stu.setBirthday("2000-01-02");
				System.out.println("생일 : " + stu.getBirthday());
//				System.out.println(stu.toString());
				dao.insert(stu);
				System.out.println(stu.getSname() + "학생이 등록되었습니다.");
				break;
			case "2": // 학생조회
				System.out.print("조회 할 학번입력 : ");
				String sno = s.nextLine();
				StudentVO stu2 = dao.read(sno);
				if (stu2.getSname() == null) {
					System.out.println(sno + "번 학생이 존재하지 않습니다.");
				} else {
					System.out.println("이름 : " + stu2.getSname());
					System.out.println("학과 : " + stu2.getDept());
					System.out.println("생일 : " + stu2.getBirthday());
					System.out.println("학년 : " + stu2.getYear());
				}

				break;
			case "3": // 목록

				for (StudentVO vo : dao.list()) {
//					String date = sdf.format(vo.getBirthday());
					System.out.printf("%s\t%s\t%s\t%s\t%d\n", vo.getSno(), vo.getSname(), vo.getDept(),
							vo.getBirthday(), vo.getYear());
				}
				break;
			case "4": // 수정
				System.out.print("수정 할 학생의 학번 : ");
				String uno = s.nextLine();
				StudentVO stu4 = dao.read(uno);
				if (stu4.getSname() == null) {
					System.out.println(uno + "번 학생이 존재하지 않습니다.");
				} else {
					System.out.print("이름 : " + stu4.getSname() + " => ");
					String newSname = s.nextLine();
					if (newSname != "")
						stu4.setSname(newSname);
					System.out.print("학과 : " + stu4.getDept() + " => ");
					String newDept = s.nextLine();
					if (newDept != "")
						stu4.setDept(newDept);
					System.out.print("생일 : " + stu4.getBirthday() + " => ");
					String newBirthday = s.nextLine();
					if (newBirthday != "")
						stu4.setBirthday(newBirthday);
					System.out.print("학년 : " + stu4.getYear() + " => ");
					String newYear = s.nextLine();
					if (newYear != "")
						stu4.setYear(Integer.parseInt(newYear));
					dao.update(stu4); // db에 넣기
					System.out.println("수정 완료!");
				}

				break;
			case "5": // 학생삭제
				System.out.print("삭제할 학번 : ");
				String dno = s.nextLine();
				StudentVO stu3 = dao.read(dno);
				if (stu3.getSname() == null) {
					System.out.println("학생이 존재하지 않습니다.");

				} else {
					System.out.println(stu3.toString());
					System.out.println("삭제하실래요? (Y/y)");
					String sel = s.nextLine();
					if (sel.equals("Y") || sel.equals("y")) {
						dao.delete(dno);
						System.out.println("삭제완료!");
					}
				}

				break;
			default:
				System.out.println("메뉴를 다시선택하세요!");
			}// switch
		} // while
	}// main
} // main
