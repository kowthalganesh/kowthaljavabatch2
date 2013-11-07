package net.kowthal.struts.helloworld.test;
import java.sql.*;
import java.io.*;
public class BLOBFileExample {
public static void main(String[] args) throws SQLException {

Connection connection = null;
ResultSet rs = null;
PreparedStatement psmnt = null;
FileInputStream fis;
try {

	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@//192.168.8.166 :1521/orcl","training","training");
System.out.println("con");
File image = new File("d:\\abt.jpeg");
System.out.println("img load");
psmnt = con.prepareStatement("insert into IMGTABLE(name, photo) "+ "values(?,?)");
psmnt.setString(1,"mahendra");
fis = new FileInputStream(image);
System.out.println("img load");
psmnt.setBinaryStream(2, (InputStream)fis, (int)(image.length()));
int s = psmnt.executeUpdate();
System.out.println("aftr exec");
if(s>0) {
System.out.println("Uploaded successfully !");
}
else {
System.out.println("unsucessfull to upload image.");
}
}

catch (Exception ex) {
System.out.println("Found some error : "+ex);
}
finally {
connection.close();
psmnt.close();
}
}
}