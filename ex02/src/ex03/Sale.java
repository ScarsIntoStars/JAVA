package ex03;

import java.util.*;

public class Sale {
	public static void run() {
		Scanner sc = new Scanner(System.in);
		// 샘플데이터
		List<SaleVO> array = new ArrayList<>();
		SaleVO sale = new SaleVO(100, "냉장고", 250, 10);
		array.add(sale);
		sale = new SaleVO(101, "세탁기", 220, 5);
		array.add(sale);
		sale = new SaleVO(102, "건조기", 230, 5);
		array.add(sale);
		int last = 103;
		boolean run = true;
		while (run) {

			System.out.println("\n\n======= 재고관리 ======");
			System.out.println("------------");
			System.out.println("1. 입력 \n2. 조회 \n3. 목록 \n4. 수정 \n5. 삭제 \n0. 종료");
			System.out.println("------------");
			System.out.print("메뉴 선택 : ");
			String menu = sc.nextLine();
			switch (menu) {

			case "5":
				System.out.print("삭제번호 : ");
				String delete = sc.nextLine();
				for (SaleVO vo : array) {
					if (Integer.parseInt(delete) == vo.getCode()) {
						array.remove(vo);
						System.out.println("삭제완료");
						break;
					}
				}

				break;

			case "4": // 수정
				System.out.print("수정 할 상품번호 : ");
				String update = sc.nextLine();
				for (SaleVO vo : array) {
					if (Integer.parseInt(update) == vo.getCode()) {
						System.out.print("상품이름 : " + vo.getName() + ">");
						String newName = sc.nextLine();
						if (newName != "")
							vo.setName(newName);
						System.out.print("상품가격 : " + vo.getPrice() + ">");
						String newPrice = sc.nextLine();
						if (newPrice != "")
							vo.setPrice(Integer.parseInt(newPrice));
						System.out.print("재고수량 : " + vo.getQnt() + ">");
						String newQnt = sc.nextLine();
						if (newQnt != "")
							vo.setQnt(Integer.parseInt(newQnt));
						System.out.println("수정완료!");
					}
				}
				break;
			case "2":
				System.out.print("조회번호 : ");
				String search = sc.nextLine(); // 넥라로 받으면 자동으로 스트링이 됨
				boolean find = false;
				for (SaleVO vo : array) {
					if (Integer.parseInt(search) == vo.getCode()) {
						System.out.println("상품이름 : " + vo.getName());
						System.out.println("상품가격 : " + vo.getPrice());
						System.out.println("재고수량 : " + vo.getQnt());
						vo.setSum(vo.getPrice() * vo.getQnt());
						System.out.println("상품금액 : " + vo.getSum());
						find = true;
					}
				}
				if (!find)
					System.out.println(search + "번 상품이 없습니다.");
				break;
			case "3":
				System.out.println("상품코드\t상품명\t단가\t수량\t금액");
				System.out.println("======================================");
				for (SaleVO vo : array) {
					vo.setSum(vo.getPrice() * vo.getQnt());
					vo.print_land();
				}
				System.out.println(array.size() + "개의 상품이 등록되었습니다.");
				break;
			case "1":
				sale = new SaleVO();
				sale.setCode(++last); // 증가하고 넣어줘야 됨 (last + 1와 같다.)
				System.out.println("상품코드 : " + sale.getCode());
				System.out.print("상품 이름 : ");
				sale.setName(sc.nextLine());
				System.out.print("상품가격 : ");
				sale.setPrice(Integer.parseInt(sc.nextLine()));
				System.out.print("재고수량 : ");
				sale.setQnt(Integer.parseInt(sc.nextLine()));
				array.add(sale);
//				last++; // 위에서 ++last를 했기 때문에 없어도 됨
				break;
			case "0":
				run = false;
				System.out.println("프로그램이 종료됩니다.");
				break;
			} // switch
		} // while
	} // run
} // class
