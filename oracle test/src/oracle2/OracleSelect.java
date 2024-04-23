package oracle2;

import java.sql.*;
public class OracleSelect {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##green";
		String password = "green1234";
		
		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user , password);
			System.out.println("oracle connection success.\n");
			
			Statement stmt = conn.createStatement();
			
			String sql = "SELECT * FROM emp";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getString("empno")+ " ");
				System.out.print(rs.getString("ename")+ " ");
				System.out.print(rs.getString("job")+ " ");
				System.out.print(rs.getString("mgr")+ " ");
				System.out.print(rs.getString("hiredate")+ " ");
				System.out.print(rs.getString("sal")+ " ");
				System.out.print(rs.getString("comm")+ " ");
				System.out.println(rs.getString("deptno")+ " ");
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("jdbc driver loading fail.");
		} catch (SQLException e) {
			System.out.println("oracle connection fail.");
			
			
		}
	}

}
