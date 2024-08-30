package global;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBinit {
	private static final String url = "jdbc:mysql://localhost:3306/test";
	private static final String user = "root";
	private static final String password = "1234";
	public static Connection getConnection() throws SQLException {  // throws : method를 갖다 쓰는 놈이 알아서 처리해라.
		return DriverManager.getConnection(url, user, password);
	}
}
