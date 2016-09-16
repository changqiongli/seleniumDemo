package utilities;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class testDB {

	public static void main(String[] args) throws SQLException {

		DbConnection dbcon = new DbConnection();

		Connection con = dbcon.getLocalDatabaseConnection("root", "");

		Statement stmt = (Statement) con.createStatement();

		ResultSet result = (ResultSet) stmt
				.executeQuery("select * from pageinfo");
		while (result.next()) {
			System.out.println(result.getString("pageTitle"));
			break;
		}
	}

}
