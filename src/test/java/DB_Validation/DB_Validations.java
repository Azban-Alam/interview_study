package DB_Validation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DB_Validations {
	public static void main(String[] args) throws SQLException {

		String url = "";
		String user = "";
		String pass = "";

		String query = "SELECT * FROM employees";

		Connection conn = DriverManager.getConnection(url, user, pass);
		Statement stmt = conn.createStatement();

		ResultSet rs = stmt.executeQuery(query);

		while (rs.next()) {
			String name = rs.getString("name");
			int id = rs.getInt("id");
			System.out.println("ID: " + id + ", Name: " + name);
		}
	}
}