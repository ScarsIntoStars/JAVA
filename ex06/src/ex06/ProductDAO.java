package ex06;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	Connection con = Databass.connect();

	// 판매된 상품 추가

	public void psell(ProductVO vo) {
		try {
			String sql = "insert into product(pcode,pprice) values(?,?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, vo.getPcode()); 
			ps.setInt(2, vo.getPprice());
			ps.execute();

		} catch (Exception error) {
			System.out.println("상품판매 : " + error.toString());
		}
	}

	// 상품삭제
	public void delete(int pcode) throws Exception {
		// 익셉션을 던져놓고, 딜리트를 실행시켰을 때 문제를 확인
		String sql = "delete from products where pcode=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, pcode);
		ps.execute();
	}

	// 상품조회
	public ProductVO read(int pcode) {
		ProductVO vo = new ProductVO();

		try {
			String sql = "select * from products where pcode=?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, pcode); // 이거랑 아래 리설트 순서 바뀌면 안됨
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				vo.setPcode(rs.getInt("pcode"));
				vo.setPname(rs.getString("pname"));
				vo.setPprice(rs.getInt("pprice"));
			}
		} catch (Exception error) {
			System.out.println("상품조회 : " + error.toString());
		}
		return vo;
	}

	// 상품등록
	public void insert(ProductVO vo) {
		try {
			String sql = "INSERT INTO PRODUCTS(PCODE, PNAME, PPRICE)";
			sql += "VALUES(pcode_seq.nextval, ?, ?)"; // pcode_SEQ는 디벨로퍼에서 만든 시퀀스
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, vo.getPname());
			ps.setInt(2, vo.getPprice());
			ps.execute();
		} catch (Exception error) {
			System.out.println("상품등록 : " + error.toString());
		}

	}

	// 상품목록
	public List<ProductVO> list() {
		List<ProductVO> array = new ArrayList<>();
		String sql = "select * from products order by pcode desc";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ProductVO vo = new ProductVO();
				vo.setPcode(rs.getInt("pcode"));
				vo.setPname(rs.getString("pname"));
				vo.setPprice(rs.getInt("pprice"));
				array.add(vo);
			}
		} catch (Exception error) {
			System.out.println("상품목록 : " + error.toString());
		}
		return array;
	}

}