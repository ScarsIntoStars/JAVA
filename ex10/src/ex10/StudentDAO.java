package ex10;

import java.sql.*;
import java.util.*;

public class StudentDAO {

	Connection con = Databass.connect();


	// 학생조회
	public StudentVO read(String scode) {
		StudentVO vo = new StudentVO();
		try {
			String sql = "SELECT * FROM STUDENTS WHERE SCODE=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, scode);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				vo.setScode(rs.getString("scode"));
				vo.setSname(rs.getString("sname"));
				vo.setDept(rs.getNString("dept"));

			}

		} catch (Exception e) {
			System.err.println("학생조회 오류 : " + e.toString());
		}

		return vo;
	}

	// 학생등록
	public void insert(StudentVO vo) {
		try {
			String sql = "INSERT INTO STUDENTS(SCODE, SNAME, DEPT) VALUES(?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getScode());
			ps.setString(2, vo.getSname());
			ps.setString(3, vo.getDept());
			ps.execute();

		} catch (Exception e) {
			System.err.println("학생등록오류 : " + e.toString());
		}
	}

	// 새로운 학번 구하기
	public String getCode() {
		String scode = "";
		try {
			String sql = "SELECT MAX(SCODE)+1 NCODE FROM STUDENTS";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				scode = rs.getString("NCODE");
			}

		} catch (Exception e) {
			System.err.println("새로운 학번 구하기 오류 : " + e.toString());
		}
		return scode;
	}

	// 학생목록
	public List<StudentVO> list() {
		List<StudentVO> array = new ArrayList<>();

		try {
			String sql = "SELECT * FROM STUDENTS ORDER BY SCODE DESC";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				StudentVO vo = new StudentVO();
				vo.setScode(rs.getString("scode"));
				vo.setSname(rs.getString("sname"));
				vo.setDept(rs.getNString("dept"));
				array.add(vo);
			}

		} catch (Exception e) {
			System.err.println("학생목록 오류 : " + e.toString());
		}
		return array;

	}

}
