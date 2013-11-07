package net.kowthal.struts.helloworld.form;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class FundForm extends ActionForm {
	private static final long serialVersionUID = 1L;
	
	public String fromacc;
	private String txnamt;
	
	private String toacc;
	private String pp;
	private boolean valid;
	
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		ActionErrors actionErrors = new ActionErrors();
		
		if (txnamt == null || txnamt.trim().equals("")) {
			actionErrors.add("txtamt", new ActionMessage("errors.username"));
		}
		
			System.out.println(fromacc);
			System.out.println(txnamt);
			System.out.println(toacc);
			System.out.println(pp);
			return actionErrors;
	}
	
	public String getFromacc() {
		return fromacc;
	}
	public void setFromacc(String fromacc) {
		this.fromacc = fromacc;
	}
	public String getTxnamt() {
		return txnamt;
	}
	public void setTxnamt(String txnamt) {
		this.txnamt = txnamt;
	}
	public String getToacc() {
		return toacc;
	}
	public void setToacc(String toacc) {
		this.toacc = toacc;
	}
	public String getPp() {
		return pp;
	}
	public void setPp(String pp) {
		this.pp = pp;
	}
	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	
	
}
