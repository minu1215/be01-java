package day18_jdbc_mvc.dept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

public class DeptController {
	static private Scanner sc = new Scanner(System.in);
	static private Statement  stmt = null;
	static private ResultSet  rs = null;
	static private Connection conn = null;
	static private PreparedStatement  pstmt = null;
	
	public void connect() {
		conn = ConnectionHelper.getConnection("mariadb");
	}
	
	//SELECT ALL
	public void selectAll(String className) throws SQLException {
		rs = stmt.executeQuery("SELECT * FROM " + className);  // 반환값 있는 경우 
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int count = rsmd.getColumnCount();
		
		System.out.println("====================================");
		for(int i = 1; i <= count; i++) {
			System.out.print("\t"+rsmd.getColumnName(i));			
		}
		while( rs.next() ) {
			for (int i = 1; i <= count; i++) {  // 각 타입별로 출력하기
				switch (rsmd.getColumnType(i)) {
					case Types.NUMERIC :
					case Types.INTEGER :
						System.out.print("\t" + rs.getInt(i));
						break;
					case Types.FLOAT :
						System.out.print("\t" + rs.getFloat(i));
						break;
					case Types.DOUBLE :
						System.out.print("\t" + (int)rs.getDouble(i));
						break;
					case Types.CHAR :
						System.out.print("\t" +rs.getString(i));
						break;
					case Types.DATE :
						System.out.print("\t" +rs.getDate(i));
						break;
					default:
						System.out.print("\t" +rs.getString(i));
						break;
				} // switch end
			} // end for
			System.out.println();
		} // end while
		System.out.println("====================================");
		CloseHelper.close(rs);
	}
	
	//SELECT
	public void select(String className) throws SQLException {
		System.out.print("\nSELECT CONDITION (DEPTNO, DNAME, LOC) : ");
		
		String con = sc.next();
		String[] con_arr = {"DEPTNO", "DNAME", "LOC"};
		int flag = -1;
		if(con.equalsIgnoreCase("deptno")) {
			flag = 0;
		} else if(con.equalsIgnoreCase("dname")) {
			flag = 1;
		} else if(con.equalsIgnoreCase("LOC")) {
			flag = 2;
		} else {
			System.out.println("WRONG INPUT !!!");
			return;
		}
		System.out.print(con_arr[flag] + " = ");
		con = sc.next();
		rs = stmt.executeQuery("SELECT * FROM " + className + " WHERE " + con_arr[flag] + " = " + con);  // 반환값 있는 경우 
		
		ResultSetMetaData rsmd = rs.getMetaData();
		int count = rsmd.getColumnCount();
		
		System.out.println("====================================");
		for(int i = 1; i <= count; i++) {
			System.out.print("\t"+rsmd.getColumnName(i));			
		}
		while( rs.next() ) {
			for (int i = 1; i <= count; i++) {  // 각 타입별로 출력하기
				switch (rsmd.getColumnType(i)) {
					case Types.NUMERIC :
					case Types.INTEGER :
						System.out.print("\t" + rs.getInt(i));
						break;
					case Types.FLOAT :
						System.out.print("\t" + rs.getFloat(i));
						break;
					case Types.DOUBLE :
						System.out.print("\t" + (int)rs.getDouble(i));
						break;
					case Types.CHAR :
						System.out.print("\t" +rs.getString(i));
						break;
					case Types.DATE :
						System.out.print("\t" +rs.getDate(i));
						break;
					default:
						System.out.print("\t" +rs.getString(i));
						break;
				} // switch end
			} // end for
			System.out.println();
		} // end while
		System.out.println("====================================");
		CloseHelper.close(rs);
	}
	
	//INSERT
	//UPDATE
	
	public void update(String className) throws SQLException {
		selectAll(className);
		System.out.print("\nSELECT CONDITION (DEPTNO, DNAME, LOC, ALL) : ");
		
		String con = sc.next();
		String[] con_arr = {"DEPTNO", "DNAME", "LOC", "ALL"};
		int flag = -1;
		if(con.equalsIgnoreCase(con_arr[0])) {
			flag = 0;
		} else if(con.equalsIgnoreCase(con_arr[1])) {
			flag = 1;
		} else if(con.equalsIgnoreCase(con_arr[2])) {
			flag = 2;
		} else if(con.equalsIgnoreCase(con_arr[3])) {
			flag = 3;
		} else {
			System.out.println("WRONG INPUT !!!");
			return;
		}
		if(flag < 3) {
			System.out.print(con_arr[flag] + " = ");
			con = sc.next();
			System.out.println("CHANGE = ");
		}
		System.out.print(con_arr[flag] + " = ");
		con = sc.next();
		
		String change_con = sc.next();
	}
	//DELETE
	//ROLLBACK
	//COMMIT
	//QUIT
	public void menu() {
		System.out.println("\t>> MENU <<");
		System.out.println("1. SELECT ALL");
		System.out.println("2. SELECT");
		System.out.println("3. INSERT");
		System.out.println("4. UPDATE");
		System.out.println("5. DELETE");
		System.out.println("6. ROLLBACK");
		System.out.println("7. COMMIT");
		System.out.println("8. QUIT");
		System.out.print("CHOICE NUMBER > ");
	}
}
