package ex08;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		AccountDAO adao = new AccountDAO();
		DetailDAO ddao = new DetailDAO();
		DecimalFormat df = new DecimalFormat("#,###원");
		Scanner s = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("\n\n******* 계좌관리 *****************************");
			System.out.println("-------------------------------------------------");
			System.out.println("1.계좌생성 |2.계좌조회 |3.입금 |4.출금 |5.계좌목록 |6.계좌이체 |0.종료");
			System.out.println("-------------------------------------------------");
			System.out.print("선택>");
			String menu = s.nextLine();

			switch (menu) {
			case "0":
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			case "1":
				System.out.print("계좌주명 > ");
				String name = s.nextLine();
				if (name == "")
					break;

				AccountVO acc = new AccountVO();
				acc.setAname(name);

				int balance = input("초기입금액");
				if (balance == 0)
					break;

				acc.setBalance(balance);
//				System.out.println(acc.toString());
				System.out.print("새로운 계좌를 생성하실래요? (Y, y)");
				String sel = s.nextLine();
				if (sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
					int newAno = adao.insert(acc);
					// 거래내역
					DetailVO dvo = new DetailVO();
					dvo.setAno(newAno);
					dvo.setAmount(balance);
					dvo.setType("입금");
					ddao.insert(dvo);
					System.out.println(newAno + "번 계좌가 생성되었습니다.");
				}
				break;

			case "2":
				while (true) {
					int ano = input("\n조회할 계좌번호 입력 > ");
					if (ano == 0) {
						System.out.println("조회를 종료합니다.");
						break;
					} else {
						try {
							AccountVO vo = adao.read(ano);
							if (vo.getAname() == null) {
								System.out.println("해당계좌가 존재하지 않습니다.");
							} else {
//								System.out.println("계좌주 : " + vo.getAname());
//								System.out.println("잔액 : " + df.format(vo.getBalance()));

								System.out.println("계좌주 : " + vo.getAname());
								System.out.println("잔액 : " + vo.getBalance());
								System.out.println("거래번호\t계좌번호\t\t금액\t입출금\t\t날짜");
								System.out.println("-----------------------------");

								for (DetailVO v : ddao.list(ano)) {
									System.out.printf("%s\t%d\t%10s\t%s\t%s\n", v.getDno(), v.getAno(),
											df.format(v.getAmount()), v.getType(), sdf.format(v.getDdate()));
								}

							}

						} catch (Exception e) {
							System.out.println("계좌조회 오류" + e.toString());
						}
					}
				}
				break;

			case "3":

				int ano = input("입금계좌번호");
				if (ano == 0) {
					System.out.println("입금을 취소합니다.");
				} else {
					try {
						AccountVO acc1 = adao.read(ano);
						if (acc1.getAname() == null) {
							System.out.println("해당 계좌가 존재하지 않습니다.");
						} else {
							System.out.println("계좌주 : " + acc1.getAname());
							System.out.println("잔액 : " + df.format(acc1.getBalance()));

							int amount = input("입금금액 > ");
							if (amount == 0) {
								System.out.println("입금을 취소합니다.");
							} else {
								acc1.setBalance(acc1.getBalance() + amount);
								adao.update(acc1);

								DetailVO dvo = new DetailVO();
								dvo.setAno(ano);
								dvo.setType("입금");
								dvo.setAmount(amount);
								ddao.insert(dvo);
								System.out.println("입금이 완료되었습니다.");
							}
						}
					} catch (Exception e) {
						System.out.println("조회오류 : " + e.toString());
					}
				}

				break;

			case "4":
				ano = input("출금계좌번호 > ");
				if (ano == 0) {
					System.out.println("출금을 취소합니다");
				} else {
					try {
						AccountVO acc2 = adao.read(ano);
						if (acc2.getAname() == null) {
							System.out.println("해당 계좌번호가 존재하지 않습니다.");
						} else {
							System.out.println("계좌주 : " + acc2.getAname());
							System.out.println("잔액 : " + df.format(acc2.getBalance()));
							boolean reapeat = true;
							int amount = 0;
							while (reapeat) {
								amount = input("출금할 금액");
								if (amount == 0) {
									System.out.println("출금을 취소합니다.");
									reapeat = false;
								} else {
									if (acc2.getBalance() < amount) {
										System.out.println("잔액이 부족합니다");
									} else {
										// 출금
										acc2.setBalance(acc2.getBalance() - amount);
										adao.update(acc2);
										DetailVO dvo = new DetailVO();
										dvo.setAno(ano);
										dvo.setType("출금");
										dvo.setAmount(amount);
										ddao.insert(dvo);
										System.out.println("출금이 완료되었습니다.");
										reapeat = false;
									}
								}
							}
						}
					} catch (Exception e) {
						System.out.println("계좌조회오류 : " + e.toString());
					}
				}
				break;

			case "5":
				System.out.println("-----계좌목록-----");

				for (AccountVO vo : adao.list()) {
					System.out.printf("%d\t%s\t%s\n", vo.getAno(), vo.getAname(), df.format(vo.getBalance()));
					// 계좌번호 이름 금액 만든 날짜
				}
				break;

			case "6":

				System.out.println("========== 계좌이체 ==========");
				int outAcc;
				outAcc = input("출금계좌입력");

				try {

					if (outAcc == 0) {
						System.out.println("이체를 취소합니다.");
						break;
					}
					AccountVO acc4 = adao.read(outAcc);

					if (acc4.getAname() == null) {
						System.out.println("없는 계좌입니다.");
						break;

					} else {

						int inAcc;
						inAcc = input("입금계좌번호");

						if (inAcc == 0) {
							System.out.println("이체를 종료합니다");
							break;
						}

						AccountVO acc5 = adao.read(inAcc);
						if (acc5.getAname() == null) {
							System.out.println("없는 계좌번호입니다.");
							break;
						} else {
							int moveMoney;
							moveMoney = input("이체 할 금액을 입력하세요 > ");
							if (moveMoney == 0) {
								System.out.println("이체를 종료합니다.");
								break;
							}

							if (acc4.getBalance() < moveMoney) {
								System.out.println("잔액이 부족합니다.");
								break;
							} else { // 통장잔고 > 출금액

								acc4.setBalance(acc4.getBalance() - moveMoney);
								acc5.setBalance(acc4.getBalance() + moveMoney);

								adao.update(acc4);
								adao.update(acc5);

								DetailVO dao = new DetailVO();
								dao.setAno(outAcc);
								dao.setType("출금");
								dao.setAmount(moveMoney);
								ddao.insert(dao);

								DetailVO dao2 = new DetailVO();
								dao2.setAno(inAcc);
								dao2.setType("입금");
								dao2.setAmount(moveMoney);
								ddao.insert(dao2);

								System.out.println("이체가 완료되었습니다.");
							}
						}
					}

				} catch (Exception e) {
					System.out.println("이제 오류 : " + e.toString());
				}

				break;

			default:
				System.out.println("메뉴를 다시 선택하세요!");
			}// 스위치
		} // 와일
	} // 메인 매서드

	// 숫자인지 체크하는 매서드
	public static int input(String title) {// 스테틱 안에서 쓸꺼라 스테틱 넣음
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println(title + ">");
			String str = s.nextLine();
			try {
				if (str == "")
					return 0; // 브레이크가 없어도 리턴이 있어서 빠져나갈 수 있음
				else
					return Integer.parseInt(str);
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요!");
			}

		}
	}

} // 메인 클래스
