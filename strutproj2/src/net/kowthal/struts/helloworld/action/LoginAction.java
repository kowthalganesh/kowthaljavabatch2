package net.kowthal.struts.helloworld.action;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import java.sql.Connection;
import net.kowthal.struts.helloworld.connect.DBConnect;
import net.kowthal.struts.helloworld.form.LoginForm;
import net.kowthal.struts.helloworld.service.LoginService;



public class LoginAction extends Action {
	private String result;
	private LoginForm user;

	private LoginService userService;
	
	DBConnect dbcon;
	Connection con;
	LoginForm obj;

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		userService = new LoginService();

		user = (LoginForm) form;
		user = userService.authenticate(user);


		if (user.isValid()) 
		{
			HttpSession session = request.getSession(true);
			session.setAttribute("currentSession", user);

		    result = "success";
		}
		else
		{
			result = "failure";
		}
		return mapping.findForward(result);
	}

}
