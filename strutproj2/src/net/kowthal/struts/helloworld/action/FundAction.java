package net.kowthal.struts.helloworld.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import java.awt.Component;
import java.sql.Connection;

import net.kowthal.struts.helloworld.connect.DBConnect;
import net.kowthal.struts.helloworld.form.FundForm;
import net.kowthal.struts.helloworld.form.LoginForm;
import net.kowthal.struts.helloworld.service.FundService;


public class FundAction extends Action {
	private String result;
	private FundForm user;	
	private FundService userService;
	DBConnect dbcon;
	Connection con;
	
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		

		userService = new FundService();
		user=(FundForm) form;
		user = userService.authenticate(user);
		


		if (user.isValid()) 
		{
			HttpSession session = request.getSession(true);
			session.setAttribute("sess", user);
			/*Component frame = null;
			JOptionPane.showMessageDialog(frame, "Your Transaction has been success.");
		   */ 
			result = "success";
		}
		else
		{
			System.out.println("fail");
			result = "failure";
		}
		return mapping.findForward(result);
	}

}
