package ex10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EnrolDAO {

	Connection con = Databass.connect();

	// 수강신청
	public void insert(String ccode, String scode) {
		try {
			String sql = "INSERT INTO ENROLS(SCODE, CCODE) VALUES(?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, scode);
			ps.setString(2, ccode);
			ps.execute();
		} catch (Exception e) {
			System.err.println("수강신청 오류 : " + e.toString());
		}

	}

	// 특정 학생이 특정 강좌를 신청했는지 조회
	public EnrolVO read(String scode, String ccode) {
		EnrolVO vo = new EnrolVO();

		try {
			String sql = "SELECT * FROM VIEW_ENROLS WHERE SCODE=? AND CCODE=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, scode);
			ps.setString(2, ccode);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {

				vo.setScode(rs.getString("scode"));
				vo.setSname(rs.getString("sname"));
				vo.setCcode(rs.getString("ccode"));
				vo.setSname(rs.getString("cname"));
				vo.setEdate(rs.getTimestamp("edate"));
				vo.setGrade(rs.getInt("grade"));

			}

		} catch (Exception e) {
			System.err.println("특정 학생이 특정 강좌를 신청했는지 조회 오류 : " + e.toString());
		}

		return vo;
	}

	// 특정 강좌를 신청한 학생 목록
	public List<EnrolVO> slist(String ccode) {
		List<EnrolVO> array = new ArrayList<>();
		try {
			String sql = "SELECT * FROM VIEW_ENROLS WHERE CCODE=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, ccode);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				EnrolVO vo = new EnrolVO();
				vo.setScode(rs.getString("scode"));
				vo.setSname(rs.getString("sname"));
				vo.setEdate(rs.getTimestamp("edate"));
				vo.setGrade(rs.getInt("grade"));
				array.add(vo);
			}

		} catch (Exception e) {
			System.err.println("특정 강좌의 학생목록 오류 : " + e.toString());
		}

		return array;
	}

	// 특정 학생이 신청한 강좌 목록
	public List<EnrolVO> clist(String scode) {
		List<EnrolVO> array = new ArrayList<>();
		try {
			String sql = "SELECT * FROM VIEW_ENROLS WHERE SCODE=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, scode);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				EnrolVO vo = new EnrolVO();
				vo.setCcode(rs.getString("ccode"));
				vo.setCname(rs.getString("cname"));
				vo.setEdate(rs.getTimestamp("edate"));
				vo.setGrade(rs.getInt("grade"));
				array.add(vo);
			}

		} catch (Exception e) {
			System.err.println("특정 학생의 강의목록 오류 : " + e.toString());
		}

		return array;
	}

}
