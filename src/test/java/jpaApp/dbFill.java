package jpaApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.junit.Ignore;
import org.junit.Test;

public class dbFill {
	@Ignore
	@Test
	public void fillNumbersTable() {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "shaldnikita",
				"shaldnikita");) {
			Class.forName("com.mysql.jdbc.Driver");

			PreparedStatement stmt = con.prepareStatement("INSERT into numbers VALUES(?,?)");

			for (int i = 0; i < 100000; i++) {
				stmt.setInt(1, ((int) (Math.random() * 1000000 + 1)));
				stmt.setInt(2, ((int) (Math.random() * 1000000 + 1)));
				try {
					stmt.executeUpdate();
				} catch (Exception ex) {
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	@Test
	public void fillClientsAndBillsTables() {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "shaldnikita",
				"shaldnikita");) {
			Class.forName("com.mysql.jdbc.Driver");

			PreparedStatement stmt = con.prepareStatement("INSERT into clients VALUES(?,?)");
			PreparedStatement stmt1 = con.prepareStatement("INSERT into bills VALUES(?)");

			for (int i = 0; i < 100000; i++) {
				stmt.setInt(1, ((int) (Math.random() * 1000000 + 1)));
				stmt1.setInt(1, ((int) (Math.random() * 2000000 + 1)));
				stmt.setString(2, "name" + i);
				try {
					stmt1.executeUpdate();
					stmt.executeUpdate();
				} catch (Exception ex) {
				}
			}
			
			for (int i = 100001; i < 200000; i++) {
				stmt1.setInt(1, ((int) (Math.random() * 2000000 + 1)));
				try {
					stmt1.executeUpdate();
				} catch (Exception ex) {
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
