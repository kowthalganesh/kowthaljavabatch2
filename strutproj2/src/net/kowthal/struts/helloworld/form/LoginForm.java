package net.kowthal.struts.helloworld.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;


public class LoginForm extends ActionForm {

	private static final long serialVersionUID = 1L;
	public String userName;
	private String password;
	private String name;
	private boolean valid;
	private String accno;
	/*	private String balance;
	public String branch;*/

	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors actionErrors = new ActionErrors();
		//System.out.println(userName);
		if (userName == null || userName.trim().equals("")) {
			actionErrors.add("userName", new ActionMessage("errors.username"));
		}
		try {
			if (password == null || password.trim().equals("")) {
				actionErrors.add("password",new ActionMessage("errors.fpassword"));
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

		return actionErrors;

	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
/*	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	*/
	

public String getUN(){
	return userName;
}
public  String getPD(){
	return password;
}
public static String con(String name, String pwd)
{
	   
	   StringBuilder builder = new StringBuilder();
	    String	a=name;
	    builder.append(a);
	    builder.append(",");
	    String b=pwd;
	    builder.append(b);
	    return builder.toString();
}
}
