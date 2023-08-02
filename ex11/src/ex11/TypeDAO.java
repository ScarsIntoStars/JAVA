package ex11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TypeDAO {

	Connection con = Database.connect();

	// 캠핑장의 타입을 건설하는
//	
//	public void make(String cno, int tno) {
//		try {
//			String sql = "INSERT INTO TYPE VALUES(?, ?)";
//			PreparedStatement ps = con.prepareStatement(sql);
//			ps.setString(1, cno);
//			ps.setInt(2, tno);
//			ps.execute();
	
	
	public void make(TypeVO vo) {
		try {
			String sql = "INSERT INTO TYPE VALUES(?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getCname());
			ps.setInt(2, vo.getcno());
			ps.execute();

		} catch (Exception e) {
			System.err.println("캠핑장 시설시공 에러 : " + e.toString());
		}
	}

	// 캠핑장의 타입을 찾는
	public TypeVO search(String cno) {
		TypeVO vo = new TypeVO();

		try {
			String sql = "SELECT * FROM CAMP_TYPE WHERE CNO=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cno);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				vo.setCno(rs.getString("cno"));
				vo.setTno(rs.getInt("tno"));
			}

		} catch (Exception e) {
			System.out.println("캠핑장 타입찾기 에러 " + e.toString());

		}

		return vo;
	}

}
