package day18_jdbc_gift;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class GiftInsert2 {
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
		
		// 3. 사용 (DML - Insert) - PreparedStatement
		System.out.println("Gift Table data input : 상품번호/상품명/최저가/최고가 = ");
		String sql = "INSERT INTO GIFT VALUES(?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sc.nextInt());
		pstmt.setString(2, sc.next());
		pstmt.setInt(3, sc.nextInt());
		pstmt.setInt(4, sc.nextInt());
		
		int result = pstmt.executeUpdate();
		
		System.out.println(result + " 개 데이터 추가 성공");
		conn.commit();
		
		pstmt.close();
		conn.close();
	}
}
