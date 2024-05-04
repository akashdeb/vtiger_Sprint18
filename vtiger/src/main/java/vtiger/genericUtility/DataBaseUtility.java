package vtiger.genericUtility;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseUtility {
	
	public String toFetchDataFromDataBase(Connection connection, String querry) throws SQLException {
		
		ResultSet result = connection.createStatement().executeQuery("select * from lead;");
		
		if(result.next()) {
			return result.getString(1);
		}
		
		return "";
		
	}

}
