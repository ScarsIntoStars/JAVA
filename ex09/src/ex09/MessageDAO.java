package ex09;

import java.util.*;
import java.sql.*;

public class MessageDAO {
	Connection con = Databass.connect();
	
	// 보낸 메세지 삭제
	public void sendDel(int mid) {
		try {
			String sql ="UPDATE MESSAGES SET RDEL=1 WHERE MID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, mid);
			ps.execute();
			
		} catch (Exception e) {
			System.out.println("보낸메세지 삭제오류 : " + e.toString());
		}
	}
	
	// 받은 메세지 삭제
	public void receiveDel(int mid) {
		try {
			String sql ="UPDATE MESSAGES SET SDEL=1 WHERE MID=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, mid);
			ps.execute();
			
		} catch (Exception e) {
			System.out.println("받은메세지 삭제오류 : " + e.toString());
		}
	}

	// 메세지 전송
	public void insert(MessageVO vo) {
		try {
			String sql ="INSERT INTO MESSAGES(MID, SENDER, RECEIVER, SDATE, MESSAGE)";
			sql+=  "VALUES(SEQ_MID.NEXTVAL, ?, ?, SYSDATE, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getSender());
			ps.setString(2, vo.getReceiver());
			ps.setString(3, vo.getMessage());
			ps.execute();
			
		} catch (Exception e) {
			System.out.println("메세지전송오류 : " + e.toString());
		}
	}

	// 보낸 메세지
	public List<MessageVO> sendList(String id) {
		List<MessageVO> array = new ArrayList<>();

		try {
			String sql = "SELECT M.*, UNAME, PHONE FROM MESSAGES M, USERS U WHERE SENDER=? AND RECEIVER=ID";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				MessageVO vo = new MessageVO();
				vo.setMid(rs.getInt("mid"));
				vo.setReceiver(rs.getString("receiver"));
				vo.setUname(rs.getString("uname"));
				vo.setMessage(rs.getString("message"));
				vo.setSdate(rs.getTimestamp("sdate"));
				array.add(vo);
			}
		} catch (Exception e) {
			System.out.println("발신메세지 오류 : " + e.toString());
		}

		return array;
	}

	// 받은 메세지
	public List<MessageVO> ReceiverList(String id) {
		List<MessageVO> array = new ArrayList<>();

		try {
			String sql = "SELECT M.*, UNAME, PHONE FROM MESSAGES M, USERS U WHERE RECEIVER=? AND SENDER=ID AND SDEL=0";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				MessageVO vo = new MessageVO();
				vo.setMid(rs.getInt("mid"));
				vo.setSender(rs.getString("sender"));
				vo.setUname(rs.getString("uname"));
				vo.setMessage(rs.getString("message"));
				vo.setSdate(rs.getTimestamp("sdate"));
				array.add(vo);
			}
		} catch (Exception e) {
			System.out.println("수신메세지 오류 : " + e.toString());
		}

		return array;
	}

}
