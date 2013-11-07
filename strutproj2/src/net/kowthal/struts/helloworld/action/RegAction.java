package net.kowthal.struts.helloworld.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import net.kowthal.struts.helloworld.form.LoginForm;
import net.kowthal.struts.helloworld.form.RegForm;
import net.kowthal.struts.helloworld.service.LoginService;
import net.kowthal.struts.helloworld.service.RegService;

import java.io.*;

import com.lowagie.text.*;
import com.lowagie.text.pdf.*;

public class RegAction extends Action {
	
	private String result;
	private RegForm nuser;
	private RegService regService;
	   String target = null;
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		regService = new RegService();
		nuser = (RegForm) form;
		nuser = regService.authenticate(nuser);
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
		
	        RegForm regForm = (RegForm)form;
	        Rectangle pageSize = new Rectangle(400, 400);
			pageSize.setBackgroundColor(new java.awt.Color(0xDF, 0xFF, 0xDE));
	        Document document = new Document(pageSize);
	        PdfWriter.getInstance(document,new FileOutputStream("D:/kowthal training/java/31rep/Report.pdf"));
	        document.open();
	        PdfPTable table=new PdfPTable(2);
	        table.addCell("UserName");
	        table.addCell(uname);
	        table.addCell("Password");
	        table.addCell(pwd);
	        table.addCell("Confirm Password");
	        table.addCell(cpwd);
	        table.addCell("First Name");
	        table.addCell(fn);
	        table.addCell("Last Name");
	        table.addCell(ln);
	        table.addCell("Sex");
	        table.addCell(sx);
	        table.addCell("Address");
	        table.addCell(add);
	        table.addCell("Country");
	        table.addCell(co);
	        table.addCell("Zip Code");
	        table.addCell(zp);
	        table.addCell("Mobile");
	        table.addCell(mb);
	        table.addCell("E-mail id");
	        table.addCell(em);
	        System.out.println("before fetch");
	        document.add(table);
	        System.out.println("after fetch");
	        document.add(new Paragraph("Created by Kowthal(947)"));
	        document.close();
	        
	        
	        target="success";
	       return mapping.findForward(target);
	   }
	}