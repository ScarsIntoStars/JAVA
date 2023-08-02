package ex10;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

public class Course {
	public static void run() {
		Scanner s = new Scanner(System.in);
		CourseDAO cdao = new CourseDAO();
		EnrolDAO edao = new EnrolDAO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		boolean run = true;
		while (run) {

			System.out.println("\n\n******* 강좌메뉴 *****************************");
			System.out.println("-------------------------------------------------");
			System.out.println("1.강좌목록 |2.강좌조회 |3.강좌등록 |0.메인메뉴");
			System.out.println("-------------------------------------------------");
			System.out.print("선택> ");
			String menu = s.nextLine();

			switch (menu) {

			case "0":
				run = false;
				System.out.println("메인메뉴로 돌아갑니다.");
				break;

			case "1":
				List<CourseVO> array = cdao.list();
				for (CourseVO vo : array) {
					System.out.printf("%s\t%s\t\n", vo.getCcode(), vo.getCname());
					
				}

				break;

			case "2":
				while (true) {
					System.out.print("조회할 과목코드 > ");
					String ccode = s.nextLine();
					if (ccode == "") {
						System.out.println("조회를 취소합니다.");
						break;
					} else {
						CourseVO vo = cdao.read(ccode);
						if (vo.getCcode() == null) {
							System.out.println("과목이 존재하지 않습니다.");
						} else {
							System.out.println("과목 이름 : " + vo.getCname());
							System.out.println("과목 코드 : " + vo.getCcode());

							// 학생목록
							List<EnrolVO> sarray = edao.slist(ccode);
							if (sarray.size() == 0) {
								System.out.println("수강신청한 학생이 없습니다.");
							} else {
								for (EnrolVO v : sarray) {
									System.out.printf("%s\t%s\t%d\t%s\n", v.getScode(), v.getSname(), v.getGrade(),
											sdf.format(v.getEdate()));
								}
							}

							break;
						}
					}
				}

				break;

			case "3":
				CourseVO vo = new CourseVO();
				vo.setCcode(cdao.bigCode());
				System.out.println("강좌번호 > " + vo.getCcode());
				System.out.print("강좌명 > ");
				String cname = s.nextLine();
				if (cname == "") {
					System.out.println("등록을 취소합니다.");
					break;
				} else {
					vo.setCname(cname);

					cdao.insert(vo);
					System.out.println("새로운 강의가 등록되었습니다.");

				}

				break;

			default:
				System.out.println("메뉴를 다시 선택하시오.");
			} // 스위치

		} // 와일
	}
}
