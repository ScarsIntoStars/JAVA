package ex10;

import java.util.List;
import java.util.Scanner;

public class Enrol {
	public static void run() {
		Scanner s = new Scanner(System.in);
		StudentDAO sdao = new StudentDAO();
		EnrolDAO edao = new EnrolDAO();
		CourseDAO cdao = new CourseDAO();
		boolean run = true;
		while (run) {
			System.out.println("\n\n******* 수강신청관리 *****************************");
			System.out.println("-------------------------------------------------");
			System.out.println("1.수강신청목록 |2.수강신청 |3.수강취소 |4.성적등록 |0.메인메뉴");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			String menu = s.nextLine();

			switch (menu) {

			case "0":
				run = false;
				System.out.println("메인메뉴로 돌아갑니다.");

				break;

			case "2":
				System.out.print("학번 > ");
				String scode = s.nextLine();
				if (scode == "") {
					System.out.println("수강신청을 취소합니다.");
				} else {
					StudentVO svo = sdao.read(scode);
					if (svo.getSname() == null) {
						System.out.println("존재하지 않는 학생입니다.");
					} else {
						System.out.printf("%s(%s)\n", svo.getSname(), svo.getDept());
						// 수강신청한 목록
						System.out.println("\n---------------------------------------------");
						List<EnrolVO> carray = edao.clist(scode);
						if (carray.size() == 0) {
							System.out.println("수강신청 내역이 없습니다.");
						
							for (EnrolVO v : carray) {
								System.out.printf("%s:%s|", v.getCcode(), v.getCname());
							}
							System.out.println("\n--------------------------------------------");
							while (true) {
								// 수강신청 할 목록
								List<CourseVO> aarray = cdao.list();
								for (CourseVO v : aarray) {
									System.out.printf("%s:%s|", v.getCcode(), v.getCname());
								}
								System.out.println("\n--------------------------------------------");
								System.out.print("수강신청을 원하는 과목코드 > ");
								String ccode = s.nextLine();
								if (ccode == "") {
									break;
								}
								EnrolVO vo = edao.read(scode, ccode);
								if (vo.getSname() != null) {
									System.out.println("이미 수강신청을 했습니다.");
								} else {
									CourseVO cvo = cdao.read(ccode);
									if (cvo.getCname() == null) {
										System.out.println("해당 강좌가 존재하지 않습니다.");
									} else {
										// 수강신청
										edao.insert(ccode, scode);
										System.out.println("수강신청을 완료하였습니다.");
										break;
									}
								}
							}
						}
					}
				}

				break;
			default:
				System.out.println("메뉴를 다시 선택하시오.");
			} // 스위치

		} // 와일
	}
}
