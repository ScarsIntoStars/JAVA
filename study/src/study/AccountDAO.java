package study;

import java.sql.*;
import java.util.*;


public class AccountDAO {

	// 계좌정보 조회
	public AccountVO read(int ano) throws Exception {
		AccountVO vo = new AccountVO();
		String sql = "SELECT * FROM ACCOUNT WHERE ANO=?";
		PreparedStatement ps = con.

		
	}

}
