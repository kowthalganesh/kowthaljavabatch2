package net.kowthal.struts.helloworld.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import net.kowthal.struts.helloworld.connect.DBConnect;
import net.kowthal.struts.helloworld.form.FundForm;

public class FundService {
	private PreparedStatement pst;
	private ResultSet rs;
	DBConnect dbcon;
	Connection con;

	public FundForm authenticate(FundForm user) throws SQLException {
		int fromAmount;
		int toAmount;

		dbcon = DBConnect.getInstance();
		con = dbcon.connection();
		try {
			// System.out.println("value" +user.getFromacc());

			pst = con
					.prepareStatement("SELECT balance FROM acctable WHERE accno='"
							+ user.getFromacc() + "'");
			// pst.setString(1, user.getFromacc());
			rs = pst.executeQuery();
			System.out.println("aft exec");
			rs.next();
			System.out.println("aft rs");
			fromAmount = rs.getInt("balance");
			System.out.println("aft bal");
			int wd = Integer.parseInt(user.getTxnamt());
			System.out.println("aft conv");
			fromAmount = fromAmount - wd;
			String fa = String.valueOf(fromAmount);
			System.out.println(fa);
			pst = con.prepareStatement("UPDATE acctable SET balance='" + fa
					+ "' WHERE accno='" + user.getFromacc() + "' ");
			// pst.setInt(1, fromAmount);
			// pst.setString(2, user.getFromacc());
			pst.executeUpdate();
			System.out.println("finished 1");

			pst = con
					.prepareStatement("SELECT balance FROM acctable WHERE accno='"
							+ user.getToacc() + "'");
			// pst.setString(1, user.getFromacc());
			rs = pst.executeQuery();
			System.out.println("aft exec1");
			rs.next();
			System.out.println("aft rs1");
			toAmount = rs.getInt("balance");
			int dep = Integer.parseInt(user.getTxnamt());
			System.out.println("aft conv1");
			toAmount = toAmount + dep;
			String aa = String.valueOf(toAmount);
			System.out.println(aa);
			pst = con.prepareStatement("UPDATE acctable SET balance='" + aa
					+ "' WHERE accno='" + user.getToacc() + "' ");
			// pst.setInt(1, fromAmount);
			// pst.setString(2, user.getFromacc());
			pst.executeUpdate();
			System.out.println("finished 1");

			user.setValid(true);

		} catch (Exception e) {

		}
		return user;
	}
}