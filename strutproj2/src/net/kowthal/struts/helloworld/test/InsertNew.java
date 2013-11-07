package net.kowthal.struts.helloworld.test;
import java.io.File; 
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.InputStream; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement; 
import java.sql.SQLException;
public class InsertNew
{
	
	public Connection getConnection() 
	{ 
		Connection con=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 con=DriverManager.getConnection("jdbc:oracle:thin:@//192.168.8.166 :1521/orcl","training","training");
			}
	
		catch (Exception e)
			{ 
			System.out.println("Error Occured While Getting the Connection: - " + e);
			}
		
		return con;
		}
	/** * Insert Image */
	public void insertImage()
	{
Connection con = null;
PreparedStatement statement = null;
FileInputStream inputStream = null;
try 
{ 
	File image = new File("d:\\abt.jpeg"); 
	inputStream = new FileInputStream(image); 
	con = getConnection();
	statement = con .prepareStatement("insert into IMGTABLE(name, photo) " + "values(?,?)");
statement.setString(1, "Honda Car"); 
statement.setBinaryStream(2, (InputStream) inputStream, (int) (image.length())); 
statement.executeUpdate();
} catch (FileNotFoundException e) 
{ System.out.println("FileNotFoundException: - " + e); } 
catch (SQLException e)
{
	System.out.println("SQLException: - " + e); 
	} 
finally {
	try {
		con.close();
		statement.close(); } 
catch (SQLException e)
{
	System.out.println("SQLException Finally: - " + e); }
} } /*** * Execute Program * * @param args * @throws SQLException */
	public static void main(String[] args) throws SQLException {
		InsertNew imageTest = new InsertNew();
		imageTest.insertImage(); } 
	}
