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
import net.kowthal.struts.helloworld.form.AdminRepForm;

  
public class AdminRepAction extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PreparedStatement pst;
	private ResultSet rs;
	DBConnect dbcon;
	Connection con;
	AdminRepForm user;
    /*private final static String SUCCESS = "success";*/
     
    protected void doPost(HttpServletRequest request,  
            HttpServletResponse response) throws ServletException, IOException {  
            /*throws Exception {*/
    	dbcon = DBConnect.getInstance();
        List list = new ArrayList();  
        HttpSession httpSession = request.getSession();  
        try {
			con = dbcon.connection();
			/*System.out.println("bef query");*/
			pst = con.prepareStatement("select kowthalregistration.username, kowthalregistration.mobile, acctable.accno, acctable.acctype, acctable.balance from kowthalregistration,acctable where kowthalregistration.accno=acctable.accno");
			rs = pst.executeQuery();
			
			while(rs.next()) {
				
				AdminRepForm user1 = new AdminRepForm();
				user1.setUserName(rs.getString("username"));
				user1.setAccNo(rs.getString("accno"));
				user1.setAcctype(rs.getString("acctype"));
				user1.setDeposit(rs.getString("balance"));
				user1.setMobile(rs.getString("mobile"));
				list.add(user1);
			
				}
        }
			catch(Exception e)
			{
				e.printStackTrace();
				System.out.println("am here");
			}
        
        httpSession.setAttribute("studentDetails", list);  
        RequestDispatcher dispatcher = request.getRequestDispatcher("reportUsingDisplayTag.jsp");  
        dispatcher.forward(request, response);
       /* return mapping.findForward(SUCCESS);*/
		/*return (ActionForward) list;*/
    }
  
  
       
}