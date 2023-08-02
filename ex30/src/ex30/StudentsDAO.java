package ex30;

import java.sql.*;
import java.util.*;

public class StudentsDAO {
	Connection con = Database.connect();

	public List<StudentsVO> list() {
		List<StudentsVO> array = new ArrayList<>();
		try {
			String sql = "SELEC * FROM STUDENTS";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				StudentsVO vo= new StudentsVO();
				vo.setScode(rs.getString("SCODE"));
				vo.setSname(rs.getString("SNAME"));
				vo.setDept(rs.getString("DEPT"));
				array.add(vo);	
			}
		} catch (Exception e) {
			System.out.println("학생 리스트 출력 오류 : " + e.toString());
		}

		return array;
	}

}
