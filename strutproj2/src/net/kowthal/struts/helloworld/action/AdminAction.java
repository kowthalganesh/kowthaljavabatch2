package net.kowthal.struts.helloworld.action;

import net.kowthal.struts.helloworld.form.AdminForm;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class AdminAction extends Action {

   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
           throws Exception {
    
       String target = null;
       AdminForm adminForm = (AdminForm)form;
       if(adminForm.getUserName().equals("ganesh")&& adminForm.getPassword().equals("ofs")) {
           target = "success";
           request.setAttribute("message", adminForm.getUserName());
       }
       else {
           target = "failure";
       }
        
       return mapping.findForward(target);
   }
}      