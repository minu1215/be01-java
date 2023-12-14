package day18_jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GiftUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
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
		
		// 3. 사용 (DML - Update)
		System.out.print("Gift Table data update : 상품번호 = ");
		System.out.println("상품명/최저가/최고가");
		// UPDATE GIFT SET gname = 'bb', g_start = 90, g_end = 900 WHERE gno = 11;
		String sql = "UPDATE GIFT SET gname = ?, g_start = ?, g_end = ? WHERE gno = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(4, sc.nextInt());
		pstmt.setString(1, sc.next());
		pstmt.setInt(2, sc.nextInt());
		pstmt.setInt(3, sc.nextInt());
		
		int result = pstmt.executeUpdate();
		
		System.out.println(result + " 개 데이터 수정 성공");
		conn.commit();
		
		pstmt.close();
		conn.close();
	}
}
