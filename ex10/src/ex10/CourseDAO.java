package ex10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CourseDAO {
	Connection con = Databass.connect();
	// +1
	public String bigCode() {
		String ccode = "";
		try {
			String sql = "SELECT MAX(CCODE)+1 NCODE FROM COURSES";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				ccode = rs.getString("NCODE");
			}

		} catch (Exception e) {
			System.err.println("새로운 학번 구하기 오류 : " + e.toString());
		}
		return ccode;
	}
	
	
	
	// 강좌생성
	public void insert(CourseVO vo) {
		try {
			String sql = "INSERT INTO COURSES(CCODE, CNAME) VALUES(?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getCcode());
			ps.setString(2, vo.getCname());
			
			ps.execute();

		} catch (Exception e) {
			System.err.println("강좌등록오류 : " + e.toString());
		}
	}
	

	// 강의리스트
	public List<CourseVO> list() {
		List<CourseVO> array = new ArrayList<>();
		try {
			String sql = "SELECT * FROM COURSES ORDER BY CCODE ";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				CourseVO vo = new CourseVO();
				vo.setCcode(rs.getString("ccode"));
				vo.setCname(rs.getString("cname"));
				array.add(vo);

			}

		} catch (Exception e) {
			System.err.println("강의리스트 오류 : " + e.toString());
		}
		return array;
	}

	// 강좌조회
	public CourseVO read(String ccode) {
		CourseVO vo = new CourseVO();
		try {
			String sql = "SELECT * FROM COURSES WHERE CCODE=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, ccode);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				vo.setCcode(rs.getString("ccode"));
				vo.setCname(rs.getString("cname"));
			}

		} catch (Exception e) {
			System.err.println("강좌조회 오류 : " + e.toString());
		}

		return vo;
	}

}
