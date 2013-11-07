package net.kowthal.struts.helloworld.test;


import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;




public class Fin{
	public static void main(String args[])
	{
 
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection(
	"jdbc:oracle:thin:@//192.168.8.166 :1521/orcl","training","training");
	System.out.println("over1");
		PreparedStatement pstmt ;
		System.out.println("over2");
            String query = ("insert into IMGTABLE VALUES(?,?)");
            pstmt = con.prepareStatement(query);
            System.out.println("over3");
        	pstmt.setString(1, "ganesh");
        	System.out.println("over3.5");
		 File file = new File("d:\\abt.jpeg");
	      FileInputStream fis = new FileInputStream(file);
	      System.out.println("over4");   
            pstmt.setBinaryStream(4, fis, fis.available()); 
            System.out.println("over5");
            pstmt.executeUpdate();
            System.out.println("over6");
            
		} 
		
		catch (ClassNotFoundException e) {
			
		} catch (SQLException ex) {
			
		} catch (Exception exe) {
			
		} 		
	}
	
}