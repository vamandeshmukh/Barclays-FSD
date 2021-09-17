package com.barclays.fsd.oop;

import java.sql.*;

public class FetchDataFromDB {
	public static void main(String[] args) {
		String className = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "HR";
		String passwsord = "hr";
		String sql = "SELECT * FROM employees";
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName(className);
			con = DriverManager.getConnection(url, user, passwsord);
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				int columnIndex = 1;
				for (int i = 1; i <= rs.getFetchSize(); i++) {
					System.out.print(rs.getString(columnIndex) + " ");
					columnIndex++;
				}
				System.out.println("\n");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
