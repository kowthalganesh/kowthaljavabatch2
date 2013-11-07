package net.kowthal.struts.helloworld.action;
 
import java.io.IOException;  
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;  
import java.util.List;  
 

import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;  

import net.kowthal.struts.helloworld.connect.DBConnect;
import net.kowthal.struts.helloworld.form.BalanceForm;
import net.kowthal.struts.helloworld.form.LoginForm;


  
public class BalanceAction extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PreparedStatement pst;
	private ResultSet rs;
	DBConnect dbcon;
	Connection con;
    LoginForm act;
    /*private final static String SUCCESS = "success";*/
     
    protected void doPost(HttpServletRequest request,  
            HttpServletResponse response) throws ServletException, IOException {  
            /*throws Exception {*/
    	dbcon = DBConnect.getInstance();
        List list = new ArrayList();  
        HttpSession httpSession = request.getSession();  
       /* String a= act.getUserName();*/
        /*System.out.println(a);*/
        try {
			con = dbcon.connection();
			/*System.out.println("bef query");*/
			
			pst = con.prepareStatement("select kowthalregistration.username,kowthalregistration.firstname,kowthalregistration.mobile,kowthalregistration.email,kowthalregistration.accno,kowthalregistration.custid,kowthalregistration.regdate,acctable.acctype,acctable.jointacc,acctable.balance,acctable.branch from kowthalregistration,acctable where kowthalregistration.accno=acctable.accno and kowthalregistration.username='kowthal'");
			rs = pst.executeQuery();
	
			while(rs.next()) {
				
				BalanceForm user1=new BalanceForm();
				user1.setUserName(rs.getString("username"));
				user1.setFirstName(rs.getString("firstName"));
				user1.setMobile(rs.getString("mobile"));
				user1.setEmail(rs.getString("email"));
				user1.setAccNo(rs.getString("accno"));
				user1.setCustid(rs.getString("custid"));
				user1.setRegdate(rs.getString("regdate"));
				user1.setAcctype(rs.getString("acctype"));
				user1.setJointacc(rs.getString("jointacc"));
				user1.setBalance(rs.getString("balance"));
				user1.setBranch(rs.getString("branch"));
				
					list.add(user1);
			
				}
        }
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("am here");
			}
        
        httpSession.setAttribute("Details", list);  
        RequestDispatcher dispatcher = request.getRequestDispatcher("bal.jsp");  
        dispatcher.forward(request, response);
       /* return mapping.findForward(SUCCESS);*/
		/*return (ActionForward) list;*/
    }
  
  
       
}