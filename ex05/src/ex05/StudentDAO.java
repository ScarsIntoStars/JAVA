package ex05;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO { // 데이터베이스 억셉트 오브젝트
	// 학생 테이블의 데이터를 관리하는 클래스

	Connection con = Databass.connect();

	// C U R D 중 목록출력을 가장 먼저 만듦

	// 학생조회
	public StudentVO read(String sno) {
		StudentVO vo = new StudentVO();
		try {
			String sql = "select * from students where sno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, sno);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
//				StudentVO vo = new StudentVO(); // 위에서 만들어서 필요없음
				vo.setSno(rs.getString("sno"));
				vo.setSname(rs.getString("sname"));
				vo.setDept(rs.getString("dept"));
				vo.setBirthday(rs.getString("birthday"));
				vo.setYear(rs.getInt("year"));
			}
		} catch (Exception e) {
			System.out.println("학생조회 : " + e.toString());
		}
		return vo;
	}

	
	
	// 학생입력
	public void insert(StudentVO vo) {

		try {
			String sql = "insert into students (sno, sname, dept, birthday) values(?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(sql); //
			ps.setString(1, vo.getSno());
			ps.setString(2, vo.getSname());
			ps.setString(3, vo.getDept());
			ps.setString(4, vo.getBirthday());
			ps.execute(); // 실행

		} catch (Exception e) {
			System.out.println("학생입력 : " + e.toString());
		}
	}

	
	
	// 새로운 학번구하기
	// 리턴은 셀렉트만 있다. 리절트 셋에 넣음
	public String getNo() {
		String no = "";
		try {
			String sql = "select max(sno)+1 no from students";
			PreparedStatement ps = con.prepareStatement(sql); // sql문을 ps라는 공간에 넣어놓는 것
			ResultSet rs = ps.executeQuery(); // ps에 넣어둔 것 실행, ResultSet rs에 넣음
			if (rs.next())
				no = rs.getString("no");
		} catch (Exception e) {
			System.out.println("새로운 학번 구하기 : " + e.toString());
		}
		return no;
	}

	
	
	// 학생목록 (3)
	public List<StudentVO> list() { // 학생들의 정보(StudentVO에
		List<StudentVO> array = new ArrayList<>();
		try {
			String sql = "select * from students order by sno desc";
			PreparedStatement ps = con.prepareStatement(sql); // ps란 공간에 넣어놓는 것
			ResultSet rs = ps.executeQuery(); // ps에 넣어둔 것 실행, ResultSet rs에 넣음
			while (rs.next()) { // rs에 있는 next것을 하나씩 꺼내옴. 다 꺼내면 종료
				StudentVO vo = new StudentVO();
				vo.setSno(rs.getString("sno")); // 컬럼에서 지정한 sno와 같아야 함
				vo.setSname(rs.getString("sname")); // 순서는
				vo.setDept(rs.getString("dept")); // 상관이
				vo.setBirthday(rs.getString("birthday")); // 없습니
				vo.setYear(rs.getInt("year")); // 다아아
				array.add(vo);
			}
		} catch (Exception e) {
			System.out.println("학생목록 : " + e.toString());
		}
		return array;
	}

	
	
	// 학생삭제
	public void delete(String sno) {
		try {
			String sql = "delete from students where sno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, sno);
			ps.execute(); // 실행
		} catch (Exception e) {
			System.out.println("학생삭제 : " + e.toString());
		}
	}

	

	// 학생수정
	public void update(StudentVO vo) {

		try {
			String sql = "update students set sname=?, dept=?, birthday=?, year=? where sno=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getSname());
			ps.setString(2, vo.getDept());
			ps.setString(3, vo.getBirthday());
			ps.setInt(4, vo.getYear());
			ps.setString(5, vo.getSno());
			ps.execute(); // 실행

		} catch (Exception e) {
			System.out.println("학생수정 : " + e.toString());
		}

	}

}
