package utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
	// Prepare connection
	// String url ="jdbc:mysql://192.168.2.11:3306/sss_db1";
	String driver = "com.mysql.jdbc.Driver";
	String dbUrl = "jdbc:mysql://localhost:3306/testjava";

	// public Connection getDatabaseConnection(String userName, String password)
	// {
	// Connection con = null;
	// try {
	// Class.forName("com.mysql.jdbc.Driver");
	// con = DriverManager.getConnection(url, userName, password);
	// } catch (ClassNotFoundException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// } catch (SQLException e) {
	// // TODO Auto-generated catch block
	// e.printStackTrace();
	// }
	// return con;
	// }
	//
	public Connection getLocalDatabaseConnection(String userName,
			String password) {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(dbUrl, userName, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	/*public Connection getDatabaseConnectionOracle(String userName,
			String password) {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String dbUrlOracle = "jdbc:oracle:thin:@<hostname>:<port>:<dbname>";
			con = DriverManager.getConnection(dbUrlOracle, userName, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}

	public Connection getDatabaseConnectionSQLServer(String userName,
			String password) {
		Connection con = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String dbUrlSQLServer = "jdbc:sqlserver://<hostname>:<port>;DatabaseName=<dbname>";
			con = DriverManager.getConnection(dbUrlSQLServer, userName,
					password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}*/
}
