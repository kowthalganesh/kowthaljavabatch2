package net.kowthal.struts.helloworld.test;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
 
public class method1 {
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
    	
    	File file = new File("d:\\abt.jpeg");
 
        FileInputStream fis = new FileInputStream(file);
        
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] buf = new byte[1024];
        try {
            for (int readNum; (readNum = fis.read(buf)) != -1;) {
                //Writes to this byte array output stream
                bos.write(buf, 0, readNum); 
                System.out.println("read " + readNum + " bytes,");
            }
        } catch (IOException ex) {
            /*Logger.getLogger(ConvertImage.class.getName()).log(Level.SEVERE, null, ex);*/
        }
 
        byte[] bytes = bos.toByteArray();
 
        /*
         * 2. How to convert byte array back to an image file?
         */
 
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator<?> readers = ImageIO.getImageReadersByFormatName("jpg");
 
        ImageReader reader = (ImageReader) readers.next();
        Object source = bis; 
        ImageInputStream iis = ImageIO.createImageInputStream(source); 
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
 
        Image image = reader.read(0, param);
        //got an image file
 
        BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_RGB);
        //bufferedImage is the RenderedImage to be written
 
        Graphics2D g2 = bufferedImage.createGraphics();
        g2.drawImage(image, null, null);
         File imageFile = new File("d:\\g.jpeg");
        ImageIO.write(bufferedImage, "jpg", imageFile);
         System.out.println(imageFile.getPath());
        
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
    	Connection con=DriverManager.getConnection(
    	"jdbc:oracle:thin:@//192.168.8.166 :1521/orcl","training","training"); 
    	String query= ("insert into imgtable values('ganesh','"+bytes+"')");
        System.out.println("out1");
        PreparedStatement pstmt = con.prepareStatement(query);
        System.out.println("out2");
        /*System.out.println(pstmt.getMetaData().getColumnName(1) + " of type: " + pstmt.getMetaData().getColumnTypeName(1));*/
        System.out.println("out3");
        pstmt.execute();
        System.out.println("out4");
        pstmt.close();

        }
       
        catch(Exception e)
        {
        	
        }
        
        
    }
}