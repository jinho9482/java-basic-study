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
		String testName = "������";
		
		// select�ְ� �б�
//		try (Connection connection = DriverManager.getConnection(url, user, password)){
//			connection.setAutoCommit(false);
//			String sql = "select * from user where name = ? or name like ?";
//			PreparedStatement ps = connection.prepareStatement(sql); // prepareStatement�� ������ ���� 
//			ps.setString(1,  "����ȣ"); // type �� �������ָ� sql injection ������ ���� �� �ִ�.
//			ps.setString(2, "ȫ%");
//			ResultSet rs = ps.executeQuery(); // executeQuery() �� select�� ����
//			while (rs.next()) {
//				int id = rs.getInt("id");
//				String name = rs.getString("name");
//				System.out.println(id + "\t" + name);
//			}
//					
//		} catch (Exception e) {
//			System.out.println("����");
//		}
		
		// insert �ְ� �б�
		try (Connection connection = DriverManager.getConnection(url, user, password)){
			connection.setAutoCommit(false);
			String sql = "insert into user values(null, ?)";
			try {
				PreparedStatement ps = connection.prepareStatement(sql); // prepareStatement�� ������ ���� 
				ps.setString(1,  testName); // type �� �������ָ� sql injection ������ ���� �� �ִ�.
				int rs = ps.executeUpdate(); // �����ϴ� ���� commit�� �ȴ�.
				throw new IllegalArgumentException();
//				if (rs != 1) connection.rollback();
//				else connection.commit();
			} catch (Exception e) {
				connection.rollback();
			}					
		} catch (Exception e) {
			System.out.println("����");
		}
		

	}

}
