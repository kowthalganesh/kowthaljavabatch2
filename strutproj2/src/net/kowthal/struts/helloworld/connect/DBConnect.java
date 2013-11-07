package net.kowthal.struts.helloworld.connect;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnect {

	private static String driverName;
	private static String url;
	private static String dbName;
	private static String dbUname;
	private static String dbPassword;
	private static Connection con;
	private static DBConnect dbcon = null;

	private DBConnect() {

	}

	synchronized public static DBConnect getInstance() {
		if (dbcon == null) {
			dbcon = new DBConnect();
			Properties prop = new Properties();
			try {
				prop.load(DBConnect.class.getClassLoader().getResourceAsStream(
						"com/ofs/resource/dbConfig.properties"));
				driverName = prop.getProperty("db.driverName");
				url = prop.getProperty("db.url");
				dbName = prop.getProperty("db.name");
				dbUname = prop.getProperty("db.uName");
				dbPassword = prop.getProperty("db.password");

			} catch (FileNotFoundException e) {
				System.out.println(e);
			} catch (IOException e) {
				System.out.println(e);
			}

			try {
				Class.forName(driverName).newInstance();

				try {
					con = DriverManager.getConnection(url + dbName, dbUname,
							dbPassword);
				} catch (SQLException e) {
					System.out.println(e);
				}
			} catch (InstantiationException e) {
				System.out.println(e);
			} catch (IllegalAccessException e) {
				System.out.println(e);
			} catch (ClassNotFoundException e) {
				System.out.println(e);
			}
			return dbcon;
		}
		return dbcon;
	}

	public static Connection connection() {
		return con;
	}

	public static void disconnect() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
