package day17_jdbc_jdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainEntry {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {	// 예외처리 위임ㅁ
		
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
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
		// excuteQuery() : 반환값 있는 경우 
		// excuteUpdate() : 반환값 없는 경우(insert, update, delete)

		
		System.out.printf("%10s%10s%10s%10s\n", "상품번호", "상품명", "최저가", "최고가");
		while(rs.next()) {
			int gno = rs.getInt(1);	// 인덱스, int gno = rs.getInt("gno");
			String gname = rs.getString(2);
			int g_start = rs.getInt(3);
			int g_end = rs.getInt("g_end");
			System.out.printf("%10d%10s%10d%10d\n", gno, gname, g_start, g_end);
		}
		// 4. 닫기 (자원 반환)
		rs.close();
		stmt.close();
		conn.close();
	}
}
