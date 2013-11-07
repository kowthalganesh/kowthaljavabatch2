package net.kowthal.struts.helloworld.form;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegForm extends ActionForm {

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFpassword() {
		return fpassword;
	}
	public void setFpassword(String password) {
		fpassword = password;
	}
	public String getCpassword() {
		return cpassword;
	}
	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	private String userName;
    private String fpassword;
    private String cpassword;
    private String accno;
	private String firstName;
    private String lastName;
    private String sex;
    private String address;
    private String country;
    private String zip;
    private String mobile;
    private String email;
    
    public static boolean validateLetters(String txt) {

    	String regx = "^[\\p{L} .'-]+$";
        Pattern pattern = Pattern.compile(regx,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(txt);
        return matcher.find();
    }

public ActionErrors validate(ActionMapping mapping,HttpServletRequest request) {
        
ActionErrors actionErrors = new ActionErrors();
 if(userName == null || userName.trim().equals("")) {
     actionErrors.add("userName", new ActionMessage("errors.username"));
       }
      if(userName.length()<5 ||userName.length()>12)
      {
      	actionErrors.add("userName", new ActionMessage("errors.lusername"));
      }
  

      if(userName.length() > 5||userName.length() <12)
      {
    	  if(RegForm.validateLetters(userName)==false)
    	  {
    	  actionErrors.add("userName", new ActionMessage("errors.ausername"));
    	  }
      }
      
       System.out.print("Password " + fpassword != null ? fpassword : "");
      if(fpassword == null || fpassword.trim().equals(""))
       {
       	actionErrors.add("fpassword", new ActionMessage("errors.fpassword"));
       }
      if(cpassword == null || cpassword.trim().equals(""))
        {
        	actionErrors.add("cpassword", new ActionMessage("errors.cpassword"));
        }
      if(accno ==null || accno.trim().equals(""))
      {
    	actionErrors.add("accno", new ActionMessage("errors.accno"));  
      } 
      
      if(firstName == null || firstName.trim().equals(""))
       {
       	actionErrors.add("firstName", new ActionMessage("errors.fname"));
       }
      if(lastName == null || lastName.trim().equals(""))
       {
       	actionErrors.add("lastName", new ActionMessage("errors.lname"));
       }
        if(sex == null || sex.trim().equals(""))
        {
        	actionErrors.add("sex", new ActionMessage("errors.sex"));
        }
        if(address == null || address.trim().equals(""))
        {
        	actionErrors.add("address", new ActionMessage("errors.address"));
        }
        if(country.trim().equals("Default"))
        {
        	actionErrors.add("country", new ActionMessage("errors.country"));
        }
        if(zip == null || zip.trim().equals(""))
        {
        	actionErrors.add("zip", new ActionMessage("errors.zip"));
        }
        if(mobile == null || mobile.trim().equals(""))
        {
        	actionErrors.add("mobile", new ActionMessage("errors.mobile"));
        }
        if(email == null || email.trim().equals(""))
        {
        	actionErrors.add("email", new ActionMessage("errors.email"));
        }
    
    return actionErrors ;

}
}

