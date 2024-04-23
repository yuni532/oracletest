package JAVAprograming;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BoardUpdateExmple {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection(
		"jdbc:oracle:thin:@localhost:1521/xe",
		"c##green",
		"green1234"
		);
		
		String sql = new StringBuilder()
				.append("UPDATE boards SET ")
				.append("btitle=?,")
				.append("bcontent=?,")
				.append("bfilename=?,")
				.append("bfiledata=?")
				.append("WHERE bno=?")
				.toString();
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1,"�����");
		pstmt.setString(2,"������ ���� ���");
		pstmt.setString(3,"snowman.jpg");
		pstmt.setBlob(4,new FileInputStream("src/JAVAprograming/snowman.jpg"));
		pstmt.setInt(5,7);
		
		int rows = pstmt.executeUpdate();
		System.out.println("������ �� �� : " +rows);
		
		pstmt.close();	
		}catch (Exception e) {
			e.printStackTrace();
		
		}finally{
			if(conn != null) {
				try { 
					conn.close();
				}catch(SQLException e) {}
			}
		}

	}

}
