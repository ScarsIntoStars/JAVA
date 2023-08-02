package ex10;

import java.sql.Connection;
import java.sql.DriverManager;

public class Databass {

	public static Connection connect() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe",
					"java",
					"pass");
//			System.out.println("접속성공");
		} catch (Exception e) {
			System.out.println("DB연걸 : " + e.toString());
		}
		return con;
	}

}