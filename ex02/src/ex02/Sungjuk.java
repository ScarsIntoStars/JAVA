package ex02;

// *은 모든 클래스를 다 사용하겠다는 뜻
import java.util.*;

public class Sungjuk {

	// 성적관리를 실행하는 메서드
	public static void run() {
		Scanner sc = new Scanner(System.in);
		List<ScoreVO> array = new ArrayList<ScoreVO>();
		ScoreVO score = new ScoreVO("20231-1", "홍길동", 65, 77, 80);
		array.add(score);
		score = new ScoreVO("20231-2", "박심청", 70, 88, 92);
		array.add(score);
		score = new ScoreVO("20231-3", "강감찬", 100, 90, 97);
		array.add(score);
		int count = 3;

		boolean run = true;
		while (run) {
			System.out.println("\n======= 성적관리 ======");
			System.out.println("------------");
			System.out.println("1. 성적입력 \n2. 성적조회 \n3. 성적목록 \n4. 성적수정 \n5. 성적삭제 \n0. 종료");
			System.out.println("------------");

			System.out.print("메뉴 선택 : ");
			String menu = sc.nextLine();

			switch (menu) {
			case "0":
				run = false;
				System.out.println("프로그램이 종료됩니다.");
				break;

			case "1":
				score = new ScoreVO();
				score.setNo("2023-" + count+1);;
				System.out.println("학번 : " + score.getNo());

				break;

			case "2": // 조회
				System.out.print("조회 할 이름 : ");
				String search = sc.nextLine();
				for (ScoreVO vo : array) {
					if (search.equals(vo.getName())) {
						vo.setTot(vo.getKor() + vo.getEng() + vo.getMat());
						vo.setAvg(vo.getTot() / 3.);
						vo.setGrade(getGrade(vo.getAvg()));
						vo.print_port();

					}
				}

				break;

			case "3": // 목록
				for (ScoreVO vo : array) {
					vo.setTot(vo.getKor() + vo.getEng() + vo.getMat());
					vo.setAvg(vo.getTot() / 3.);
//					String grade = getGrade(vo.getAvg());
//					vo.setGrade(grade);  // 를 사용하여 grade를 만들 수 있음
					vo.setGrade(getGrade(vo.getAvg()));
					vo.print_land();
				}
				break;

			case "4":
				break;

			case "5":
				break;

			default:
				System.out.println("메뉴를 다시 선택하세요!");
			} // switch
		} // while
	} // run

	// 학점 구하기
	public static String getGrade(double avg) {
		String grade = "";

		if (avg >= 90) {
			if (avg >= 95) {
				grade = "A+";
			} else {
				grade = "A0";
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				grade = "B+";
			} else {
				grade = "B0";
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				grade = "C+";
			} else {
				grade = "C0";
			}
		} else if (avg >= 60) {
			if (avg >= 65) {
				grade = "D+";
			} else {
				grade = "D0";
			}
		} else {
			grade = "F";
		}
		return grade;
	}
} // class
