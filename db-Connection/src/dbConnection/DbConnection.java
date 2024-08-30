package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConnection {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "1234";
		String testName = "김정렬";
		
		// select넣고 읽기
//		try (Connection connection = DriverManager.getConnection(url, user, password)){
//			connection.setAutoCommit(false);
//			String sql = "select * from user where name = ? or name like ?";
//			PreparedStatement ps = connection.prepareStatement(sql); // prepareStatement는 변수를 받음 
//			ps.setString(1,  "조진호"); // type 을 설정해주면 sql injection 공격을 피할 수 있다.
//			ps.setString(2, "홍%");
//			ResultSet rs = ps.executeQuery(); // executeQuery() 는 select만 받음
//			while (rs.next()) {
//				int id = rs.getInt("id");
//				String name = rs.getString("name");
//				System.out.println(id + "\t" + name);
//			}
//					
//		} catch (Exception e) {
//			System.out.println("실패");
//		}
		
		// insert 넣고 읽기
		try (Connection connection = DriverManager.getConnection(url, user, password)){
			connection.setAutoCommit(false);
			String sql = "insert into user values(null, ?)";
			try {
				PreparedStatement ps = connection.prepareStatement(sql); // prepareStatement는 변수를 받음 
				ps.setString(1,  testName); // type 을 설정해주면 sql injection 공격을 피할 수 있다.
				int rs = ps.executeUpdate(); // 실행하는 순간 commit이 된다.
				throw new IllegalArgumentException();
//				if (rs != 1) connection.rollback();
//				else connection.commit();
			} catch (Exception e) {
				connection.rollback();
			}					
		} catch (Exception e) {
			System.out.println("실패");
		}
		

	}

}
