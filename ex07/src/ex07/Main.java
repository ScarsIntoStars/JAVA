package ex07;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		ProductDAO dao = new ProductDAOImpl(); // 생성자가 없어서 임플리멘츠로 만듦
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SaleDAO sdao = new SaleDAO();
		DecimalFormat df = new DecimalFormat("#,###원"); // (#.###.00) 으로 쓸 수 있음(소수점 두 자리까지)
		Scanner s = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("\n\n******* 상품관리 *****************************");
			System.out.println("--------------------------------------------");
			System.out.println("1.입력 |2.조회 |3.목록 |4.수정 |5.삭제 |0.종료");
			System.out.println("6.상품별 매출조회 |7.판매등록 |8.매출현황 ");
			System.out.println("--------------------------------------------");
			System.out.print("선택>");
			String menu = s.nextLine();

			switch (menu) {
			case "0":
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;

			case "1":
				ProductVO pro = new ProductVO();
				System.out.print("상품이름 > ");
				pro.setPname(s.nextLine());
				pro.setPprice(input("상품가격"));

				try {
					dao.insert(pro);
					System.out.println("상품이 등록되었습니다.");
				} catch (Exception e) {
					System.out.println("상품등록오류");
				}
				break;

			case "2": // 제품 하나의 정보
				while (true) {
					System.out.print("\n상품코드 > ");
					String pcode = s.nextLine();

					if (pcode == "")
						break; // 엔터 누르면 조회작업 종료

					try {
						ProductVO vo = dao.read(Integer.parseInt(pcode));
						if (vo.getPname() == null) {
							System.out.println("해당 상품이 존재하지 않습니다.");
						} else {
							System.out.println("상품명 : " + vo.getPname());
							System.out.println("상품가격 : " + df.format(vo.getPprice()));
						}
					} catch (Exception e) {
						System.out.println("상품조회 오류");
					}
				}
				break;

			case "3":
				try {
					for (ProductVO vo : dao.list()) {
						System.out.printf("%d\t%-15s\t%s\n", vo.getPcode(), vo.getPname(), df.format(vo.getPprice()));
					}
					System.out.println(dao.list().size() + "개의 상품이 등록되었습니다.");
				} catch (Exception e) {
					System.out.println("목록출력 오류입니다."); // 사용자 프로그램이라 오류 이유를 안알려줘도 됨
				}
				break;

			case "4":

				System.out.print("수정할 상품코드 > ");
				String pcode = s.nextLine();
				if (pcode == "")
					break; // null을 Integer 할 수 없어서 오류가 발생함. 방지하기 위해 추가
				try {
					ProductVO pro3 = dao.read(Integer.parseInt(pcode));
					if (pro3.getPname() == null) {
						System.out.println("수정할 상품이 존재하지 않습니다.");
					} else {
						System.out.println("상품이름 : " + pro3.getPname());
						System.out.print("새로운 상품이름 > ");
						String pname = s.nextLine();
						if (pname != "")
							pro3.setPname(pname);

						System.out.println("상품가격 : " + pro3.getPprice());
						int price = input("새로운 상품가격");
						if (price != 0)
							pro3.setPprice(price);

						System.out.print("수정하실래요(y)?");
						String sel = s.nextLine();
						if (sel.equals("y") || sel.equals("Y") || sel.equals("ㅛ")) {
							dao.update(pro3);
							System.out.println("상품수정완료!");
						}
						System.out.println("상품가격 : " + df.format(pro3.getPprice()));
					}
				} catch (Exception e) {

					System.out.println("상품정보 수정실패!" + e.toString());
				}
				break;

			case "5":
				System.out.print("삭제할 상품코드 > ");
				pcode = s.nextLine();
				try {
					ProductVO pro2 = dao.read(Integer.parseInt(pcode));
					if (pro2.getPname() == null) {
						System.out.println("삭제할 상품이 존재하지 않습니다.");
					} else {
						System.out.println("상품명 : " + pro2.getPname());
						System.out.println("상품가격 : " + df.format(pro2.getPprice()));
						System.out.print("삭제하실래요(y)?");
						String sel = s.nextLine();
						if (sel.equals("y") || sel.equals("Y") || sel.equals("ㅛ")) {
							dao.delete(Integer.parseInt(pcode));
							System.out.println("상품삭제완료!"); // 팔린 상품(차일드)가 있으면 삭제불가
						}
					}
				} catch (Exception e) {
					System.out.println("상품삭제 오류");
				}
				break;

			case "6":
				int code = input("조회할 상품코드");
				if (code == 0) {
					System.out.println("조회를 종료합니다.");
					break;
				} else {
					try {
						ProductVO pro4 = dao.read(code);
						if (pro4.getPname() == null) {
							System.out.println("조회할 상품이 없습니다.");
						} else {
							System.out.println("상품이름 : " + pro4.getPname());
							System.out.println("상품가격 : " + df.format(pro4.getPprice()));
							System.out.println("----------------------------");
							for (SaleVO vo : sdao.list(code)) {
								System.out.printf("%d\t%d\t%s\t%s\t%s\n", vo.getScode(), vo.getQnt(),
										df.format(vo.getSprice()), df.format(vo.getQnt() * vo.getSprice()),
										sdf.format(vo.getSdate()));
							}
						}
					} catch (Exception e) {
						System.out.println("상품별 판매목록 오류입니다.");

					}

				}
				break;

			case "7": // 매출등록

				code = input("등록할 상품코드 ");
				if (code == 0)
					break;
				try {
					ProductVO pro4 = dao.read(code);

					if (pro4.getPname() == null) {
						System.out.println("등록할 상품이 존재하지 않습니다.");
					} else {
						System.out.println("상품이름 : " + pro4.getPname());
						System.out.println("상품가격 : " + df.format(pro4.getPprice()));
						int qnt = input("상품수량");
						SaleVO svo = new SaleVO();
						svo.setPcode(code);
						svo.setQnt(qnt);
						int sprice = input("판매가격");
						if (sprice == 0)
							svo.setSprice(pro4.getPprice());
						else
							svo.setSprice(sprice);
						sdao.insert(svo);
						System.out.println("판매등록완료!");
					}
				} catch (Exception e) {
					System.out.println("매출등록 오류" + e.toString());

				}

				break;
			case "8":
				int sum_price = 0;
				int sum_qnt = 0;
				for (SaleVO vo : sdao.sum_list()) {
					System.out.printf("%d\t%-10s\t%d\t%s\n", vo.getPcode(), vo.getPname(), vo.getQnt(),
							df.format(vo.getSprice()));

					sum_price += vo.getSprice();
					sum_qnt += vo.getQnt();
				}
				System.out.println("----------------------------------");
				System.out.printf("총 판매 수량 : %s\n총 판매 금액 :%s\n", sum_qnt, df.format(sum_price));

				break;
			default:
				System.out.println("메뉴를 다시 선택하세요");

			} // 스위치
		} // 와일
	} // 메인

	// 가격을 입력받는 매서드
	public static int input(String title) { // 가격을 받을꺼니 int
		Scanner s = new Scanner(System.in);
		int number = 0; // 초기값
		while (true) {
			System.out.print(title + "> "); // 타이틀을 입력받음

			try {
				String str = s.nextLine();
				if (str == "") {
					return 0;
//				number = Integer.parseInt(s.nextLine()); // 숫자를 입력받고
//				return number; // 그 숫자(number)를 리턴함
				} else {
					return Integer.parseInt(str);
				}
			} catch (Exception e) {
				System.out.println("숫자로 입력하세요"); // 이 때는 무한반복
			}
		} // 와일

	} // 메인

} // 메인
