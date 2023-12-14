package day18_jdbc_mvc.connUtil;

import java.sql.Connection;
import java.sql.DriverManager;

/*
	DB 연결 정보 반복적으로 코딩 해결
	다른 클래스에서 아래 코드 구현을 하지 않도록 설계
	
		Class.forName("org.mariadb.jdbc.Driver");	// exception
		conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", "root", "maria");

	이런식으로 사용
	ConnectionHelper.getConnection("mariadb") or ("oracle"),......
 */
public class ConnectionHelper {
	// 함수( 접근자 : public, static )
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		try {
			if(dsn.equals("mysql")) {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", "root", "mysql");
			} else if(dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@hostname:port:orcl", "id", "pwd");				
			} else if(dsn.equals("mariadb")) {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", "root", "maria");				
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static Connection getConnection(String dsn, String userid, String pwd) {
		Connection conn = null;
		try {
			if(dsn.equals("mysql")) {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", userid, pwd);
			} else if(dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@hostname:port:orcl", userid, pwd);				
			} else if(dsn.equals("mariadb")) {
				Class.forName("org.mariadb.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/encore", userid, pwd);				
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			return conn;
		}
	}
	
	public static void menu() {
		System.out.println("-=-=-=-=-= JDBC Query =-=-=-=-=-");
		System.out.println("\t >> 원하는 메뉴 선택 하세요.");
		System.out.println("\t 0. rollback");
		System.out.println("\t 1. 레코드 삽입(추가)");
		System.out.println("\t 2. 레코드 수정");
		System.out.println("\t 3. 전체보기");
		System.out.println("\t 4. 조건에 의한 검색(ex>gno)");
		System.out.println("\t 5. 레코드 삭제");
		System.out.println("\t 6. 프로그램 종료");
		System.out.println("\t 9. commit");
	}
}
