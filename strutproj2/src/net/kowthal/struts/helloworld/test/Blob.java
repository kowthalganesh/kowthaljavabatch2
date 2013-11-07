package net.kowthal.struts.helloworld.test;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class Blob{
	public static void main(String args[])
	{
             try
        {
        	Class.forName("oracle.jdbc.driver.OracleDriver");
        	Connection con=DriverManager.getConnection(
        	"jdbc:oracle:thin:@//192.168.8.166 :1521/orcl","training","training");
        				
        		File file = new File("d:\\abt.jpeg"); 
        		FileInputStream fis = new FileInputStream(file); 
                byte[] image = new byte[(int) file.length()];
                fis.read(image);
                System.out.println("image as sent " + image.length);
                String query= ("insert into imgtable values(?,?)");
                System.out.println("out1");
                PreparedStatement pstmt = con.prepareStatement(query);
                System.out.println("out2");
                /*System.out.println(pstmt.getMetaData().getColumnName(1) + " of type: " + pstmt.getMetaData().getColumnTypeName(1));*/
                pstmt.setString(1, "ganesh");
                System.out.println("out3");
                pstmt.setBytes(2,image);
                System.out.println("out4");
                pstmt.executeUpdate();
                pstmt.close();


        }
        catch (Exception e)
        {
            System.err.println(";"+e.getMessage());
            e.printStackTrace();

        }

}
}