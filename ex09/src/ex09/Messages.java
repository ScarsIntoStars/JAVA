package ex09;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Messages {
	public static void run(UserVO uvo) {
		Scanner s = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		MessageDAO ddao = new MessageDAO();
		boolean run = true;
		while (run) {

			uvo = udao.read(uvo.getId());
			System.out.println("\n\n******* 메세지관리 *****************************");
			System.out.printf("이름 : %s\t 포인트 : %d\n", uvo.getUname(), uvo.getPoint());
			System.out.println("--------------------------------------------------");
			System.out.println("1. 받은 메세지 |2. 보낸 메세지|3. 메세지 보내기|4. 메세지 삭제|0. 메인메뉴");
			System.out.println("--------------------------------------------------");
			System.out.print("메뉴선택 > ");
			String menu = s.nextLine();

			switch (menu) {
			case "0":
				System.out.println("메인메뉴로 돌아갑니다.");
				run = false;
				break;

			case "1": // 받은 메세지
				for (MessageVO vo : ddao.ReceiverList(uvo.getId())) {
					System.out.printf("%d\t%s(%s)\t%s\t%s\n", vo.getMid(), vo.getSender(), vo.getUname(),
							sdf.format(vo.getSdate()), vo.getMessage());
					System.out.println("-----------------------------------------");

				}
				while (true) {
					System.out.print("삭제할 번호 > ");
					String mid = s.nextLine();
					if (mid == "")
						break;
					System.out.print("정말 삭제하시겠습니까? (Y/y) > ");
					String sel = s.nextLine();
					if (sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
						ddao.receiveDel(Integer.parseInt(mid));
						System.out.println("보낸 메세지가 삭제되었습니다.");
						break;

					}

				}
				break;

			case "2": // 보낸 메세지
				for (MessageVO vo : ddao.sendList(uvo.getId())) {
					System.out.printf("%d\t%s(%s)\t%s\t%s\n", vo.getMid(), vo.getReceiver(), vo.getUname(),
							sdf.format(vo.getSdate()), vo.getMessage());
					System.out.println("-----------------------------------------");
				}
				while (true) {
					System.out.print("삭제할 번호 > ");
					String mid = s.nextLine();
					if (mid == "")
						break;
					System.out.print("정말 삭제하시겠습니까? (Y/y) > ");
					String sel = s.nextLine();
					if (sel.equals("Y") || sel.equals("y") || sel.equals("ㅛ")) {
						ddao.receiveDel(Integer.parseInt(mid));
						System.out.println("보낸 메세지가 삭제되었습니다.");
						break;

					}

				}
				break;

			case "3":
				while (true) {
					System.out.print("받을 아이디 > ");
					String receiver = s.nextLine();
					if (receiver == "") {
						System.out.println("전송을 취소합니다.");
						break;
					} else {
						UserVO vo = udao.read(receiver);
						if (vo.getUname() == null) {
							System.out.println("해당 아이디가 없습니다.");
						} else { // 메세지 입력
							MessageVO mvo = new MessageVO();
							mvo.setSender(uvo.getId());
							mvo.setReceiver(receiver);
							System.out.println("메세지");
							String message = s.nextLine();
							if (message == "") {
								System.out.println("메세지 전송을 취소합니다.");
							} else {
								mvo.setMessage(message);
								ddao.insert(mvo);
								udao.updatePoint(uvo.getId());
								System.out.println("메세지가 전송되었습니다.");
							}
							break;
						}
					}
				}
				break;

			case "4":
				break;

			default:
				System.out.println("메뉴를 다시 입력하세요.");
			}

		}
	}
}
