package ex11;

import java.sql.*; 
import java.util.*;

public class FacilDAO {
	Connection con = Database.connect();

	// 캠핑장에서 시설물 삭제
	public void delete(String cno, int fno) {
		try {
			String sql = "DELETE FROM CAMP_FACIL WHERE CNO=? AND FNO=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cno);
			ps.setInt(2, fno);
			ps.execute();
		} catch (Exception e) {
			System.err.println("캠핑장 시설물 삭제 오류 : " + e.toString());
		}

	}
	
	
	
	
	// 캠핑장에 시설물등록
	public void insert(String cno, int fno) {
		try {
			String sql = "INSERT INTO CAMP_FACIL(CNO,FNO) VALUES(?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cno);
			ps.setInt(2, fno);
			ps.execute();
		} catch (Exception e) {
			System.err.println("캠핑장 시설물 설치 오류 : " + e.toString());
		}

	}

	// 캠핑장별 시설물 목록
	public List<CampFacilVO> list(String cno) {
		List<CampFacilVO> array = new ArrayList<>();

		try {
			String sql = "SELECT * FROM VIEW_FACIL WHERE CNO=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, cno);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CampFacilVO vo = new CampFacilVO();
				vo.setFno(rs.getInt("fno"));
				vo.setFname(rs.getString("fname"));
				array.add(vo);

			}

		} catch (Exception e) {
			System.err.println("캠핑장별 시설물 목록 오류 : " + e.toString());
		}

		return array;
	}

	// 시설물 전체목록
	public List<FacilVO> list() { // 얘랑 위에 list는 오버로딩 한 것
									// 객체변수가 없고, 위는 있음

		List<FacilVO> array = new ArrayList<>();

		try {
			String sql = "SELECT * FROM FACIL ORDER BY FNO";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				FacilVO vo = new FacilVO();
				vo.setFno(rs.getInt("fno"));
				vo.setFname(rs.getString("fname"));
				array.add(vo);
			}

		} catch (Exception e) {
			System.err.println("시설물 목록오류 : " + e.toString());
		}

		return array;
	}

}
