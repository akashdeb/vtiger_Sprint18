package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

import vtiger.genericUtility.IPathConstant;

public class FetchDataFromDataBase {

	public static void main(String[] args) throws SQLException {
		//Create an Object  of DataBAse Driver
		Driver dbDriver = new Driver();
		//Register Driver
		DriverManager.registerDriver(dbDriver);
		//Get Connection
		Connection connection = DriverManager.getConnection(IPathConstant.DB_URL, IPathConstant.DB_USERNAME, IPathConstant.DB_PASSWORD);
		//Write Querry
		ResultSet result = connection.createStatement().executeQuery("select * from lead;");
		//Print Result
		if(result.next()) {
			System.out.println(result.getString(2));
		}
		//CLose Data Base
		connection.close();
		System.out.println("Hello");
	}

	

}
