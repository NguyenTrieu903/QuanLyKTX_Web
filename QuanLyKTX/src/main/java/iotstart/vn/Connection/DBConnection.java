package iotstart.vn.Connection;
import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
	private final String serverName = "LAPTOP-MB5F72F2\\\\SQLEXPRESS";
	private final String dbName = "KTX";
	private final String portNumber = "1433";
	private final String instance = "SQLEXPRESS"; // MSSQLSERVER LEAVE THIS ONE EMPTY IF YOUR SQL IS A SINGLE INSTANCE
	private final String userID = "sa";
	private final String password = "nhattrieu";


	public Connection getConnection() throws Exception {
		String url = "jdbc:sqlserver://" + serverName + "\\" + instance + ":" + portNumber + ";databaseName=" + dbName;
		if (instance == null || instance.trim().isEmpty())
			url = "jdbc:sqlserver://" + serverName + ":" + portNumber + ";databaseName=" + dbName;
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		return DriverManager.getConnection(url, userID, password);
	}

	public static void main(String[] args) {
		try {
			System.out.println(new DBConnection().getConnection());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
