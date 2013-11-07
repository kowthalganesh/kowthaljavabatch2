package net.kowthal.struts.helloworld.test;

import java.sql.*;
import java.io.*;
public class InsertImage {
public static void main(String[] args) {
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection(
"jdbc:oracle:thin:@//192.168.8.166 :1521/orcl","training","training");
			
PreparedStatement ps=con.prepareStatement("insert into imgtable values(?,?)");
		
FileInputStream fin=new FileInputStream("d:\\abt.jpeg");
		
ps.setString(1,"sonoo");
ps.setBlob(2,fin,fin.available());
System.out.println("after set");

ps.executeUpdate();
System.out.println("after set1");
System.out.println(" records affected");
		
con.close();
			
}catch (Exception e) {
	e.printStackTrace();
System.out.println("am here");	
}
}
}