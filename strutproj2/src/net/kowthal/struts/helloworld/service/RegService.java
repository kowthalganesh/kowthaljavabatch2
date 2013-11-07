package net.kowthal.struts.helloworld.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import net.kowthal.struts.helloworld.connect.DBConnect;
import net.kowthal.struts.helloworld.form.RegForm;


public class RegService {
	private PreparedStatement pst;
	private ResultSet rs;
	DBConnect dbcon;
	Connection con;
	Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
	
	public RegForm authenticate(RegForm nuser) throws SQLException {
		String uname=nuser.getUserName();
		String pwd=nuser.getFpassword();
		String cpwd=nuser.getCpassword();
		String acc=nuser.getAccno();
		String fn=nuser.getFirstName();
		String ln=nuser.getLastName();
		String sx=nuser.getSex();
		String add=nuser.getAddress();
		String co=nuser.getCountry();
		String zp=nuser.getZip();
		String mb=nuser.getMobile();
		String em=nuser.getEmail();
		//Date currentTime = localCalendar.getTime();
        int currentDay = localCalendar.get(Calendar.DATE);
        int currentMonth = localCalendar.get(Calendar.MONTH) + 1;
        int currentYear = localCalendar.get(Calendar.YEAR);
        String day=String.valueOf(currentDay);
        String mon=String.valueOf(currentMonth);
        String year=String.valueOf(currentYear);
        String date=day+"/"+mon+"/"+year;
        
        
		dbcon = DBConnect.getInstance();
		try {
			con = dbcon.connection();
			String oracle="insert into kowthalregistration values('"+uname+"','"+pwd+"','"+cpwd+"','"+fn+"','"+ln+"','"+sx+"','"+add+"','"+co+"','"+zp+"','"+mb+"','"+em+"','"+acc+"',sequ.nextval,'"+date+"')";
			pst = con.prepareStatement(oracle);
			System.out.println("bef rs");
			rs = pst.executeQuery();
			System.out.println("aftr rs");
			
		} 
		catch (SQLException e) {
			System.out.println(e);
		}
		return nuser;
	}
}