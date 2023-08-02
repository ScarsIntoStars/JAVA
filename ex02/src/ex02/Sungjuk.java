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
//				array.add(score); // add를 위해서 하고 아래 값을 넣어도 됨. new 하기 전에는 연결되어 있음
				score.setNo("2023-" + count + 1);
				System.out.println("학번 : " + score.getNo());
				System.out.print("이름 입력 : ");
				score.setName(sc.nextLine());
				System.out.print("국어 점수 : ");
				score.setKor(Integer.parseInt(sc.nextLine())); // sc.nextLine를 입력받아 pasreInt하여 Integer에 넣는 것
				System.out.print("영어 점수 : ");
				score.setEng(Integer.parseInt(sc.nextLine()));
				System.out.print("수학 점수 : ");
				score.setMat(Integer.parseInt(sc.nextLine()));
				System.out.print("이름 입력 : ");
				score.setName(sc.nextLine());

				array.add(score); // 여기서 score값이 초기화 되느 것이 아니라, 한 바퀴 돌고 new ScoreVO 됐을 때 초기화 됨
				count++;
				System.out.println(score.getName() + "님 입력완료");

				break;

			case "2": // 조회
//				System.out.print("조회 할 이름 : ");
//				String search = sc.nextLine();
//				for (ScoreVO vo : array) {
//					if (search.equals(vo.getName())) {
//						vo.setTot(vo.getKor() + vo.getEng() + vo.getMat());
//						vo.setAvg(vo.getTot() / 3.);
//						vo.setGrade(getGrade(vo.getAvg()));
//						vo.print_port();
//			}
//
//				score=search(array, search);
//				if(score.getName()==null) {
//					System.out.println(search +  "학생이 없습니다.");
//				}

				System.out.print("조회할이름>");
				String search = sc.nextLine();
				score = search(array, search);
				if (score.getName() == null) {
					System.out.println(search + "학생이 없습니다.");
				} else {
					score.print_port();
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

			case "4": // 성적수정
				
				
				
				
				
				
				break;

			case "5": // 삭제
				System.out.print("삭제할 이름 : ");
				String delete = sc.nextLine();
				score = search(array, delete);
				if (score.getName() == null) {
					System.out.println(delete + "학생이 없습니다.");
				} else {
					array.remove(score);
					System.out.println("삭제 완료");
				}
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

	// 조회(검색)
	public static ScoreVO search(List<ScoreVO> array, String name) { // search(어디에서 찾을 지, 찾고 싶은 이름)
		ScoreVO vo = new ScoreVO(); // 리턴 할 값을 vo에 넣을 꺼야
		for (ScoreVO score : array) { // score라는 바구니
			if (score.getName().equals(name)) { // name이 score바구니의 getName과 같아
				vo = score; // 그래서 리턴 할 vo에 찾은 값 getName을 넣는 것
			}
		}
		return vo;
	}

} // class
