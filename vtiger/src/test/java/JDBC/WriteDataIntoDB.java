package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

import vtiger.genericUtility.IPathConstant;

public class WriteDataIntoDB {

	public static void main(String[] args) throws SQLException {
		Driver dbDriver = new Driver();

		DriverManager.registerDriver(dbDriver);

		Connection connection = DriverManager.getConnection(IPathConstant.DB_URL, IPathConstant.DB_USERNAME,
				IPathConstant.DB_PASSWORD);

		int result = connection.createStatement().executeUpdate("insert into lead value('Abhishek', 'Gautam', 'QSP');");

		if (result == 1) {
			System.out.println("The data base has been updated");
		}

		else
			System.out.println("The data base has not been updated");

	}

}
