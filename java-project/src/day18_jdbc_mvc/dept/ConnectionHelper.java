package day18_jdbc_mvc.dept;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {

	// 하나의 프로세스에서 공통으로 사용할 수 있는 공용자원 (static)
	private static Connection conn;

	private ConnectionHelper() {};

	public static Connection getConnection(String dsn) {
		if (conn != null) {
			return conn;
		}
		try {
			if (dsn.equals("mysql")) {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", "root", "mysql");
			} else if (dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@hostname:port:orcl", "id", "pwd");
			} else if (dsn.equals("mariadb")) {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", "root", "maria");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
}
