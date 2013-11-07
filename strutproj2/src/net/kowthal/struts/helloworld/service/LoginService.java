package net.kowthal.struts.helloworld.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.kowthal.struts.helloworld.connect.DBConnect;
import net.kowthal.struts.helloworld.form.LoginForm;

public class LoginService {
	private PreparedStatement pst;
	private ResultSet rs;
	DBConnect dbcon;
	Connection con;

	public LoginForm authenticate(LoginForm user) throws SQLException {

		dbcon = DBConnect.getInstance();
		try {
			con = dbcon.connection();
			pst = con.prepareStatement("SELECT * FROM kowthalregistration WHERE username=? AND orgpassword=?");
			pst.setString(1, user.getUserName());
			pst.setString(2, user.getPassword());
			rs = pst.executeQuery();
			if(rs.next()) {
				user.setName(rs.getString("username"));
				/*user.setName(rs.getString("accno"));*/
				user.setValid(true);
			}
			else{
				user.setValid(false);
			}
			
		} catch (SQLException e) {
			System.out.println(e);
		}

		return user;
	}
}
