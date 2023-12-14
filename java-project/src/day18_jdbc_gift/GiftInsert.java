package day18_jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. Driver load...... exception
		Class.forName("org.mariadb.jdbc.Driver");
		System.out.println("driver load success!!!");
		
		// 2. Connection & Open
			// driver:IP:portNumber/DBName
		String url = "jdbc:mariadb://localhost:3306/encore";
		String uid = "root";
		String pwd = "maria";
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		System.out.println("connection success!!!");
		
		// 3. 사용 (DML 명령어)
		Statement stmt = conn.createStatement();
		// INSERT INTO gift VALUES(11, "스팸", 900, 1300)
		String sql = "INSERT INTO gift VALUES(11, \"스팸\", 900, 1300)";
//		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");	
		int result = stmt.executeUpdate(sql);
		System.out.println(result + " 개 데이터 추가 성공함.");
//		conn.commit();
		
		stmt.close();
		conn.close();
	}
}
