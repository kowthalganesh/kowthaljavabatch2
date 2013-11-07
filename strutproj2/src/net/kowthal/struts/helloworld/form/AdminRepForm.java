 package net.kowthal.struts.helloworld.form;

import java.io.Serializable;
 

 
public class AdminRepForm implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getDeposit() {
		return deposit;
	}

	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}

	public String getAcctype() {
		return acctype;
	}

	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
	
	private String userName;   
	private String accNo;  
    private String deposit;  
    private String acctype;
    private String mobile;
    private boolean valid;
	
 
    public AdminRepForm() {
 
    }
     
    public AdminRepForm(String userName, String accNo, String deposit, String acctype,String mobile) 
    {

        this.userName = userName;  
        this.accNo = accNo;  
        this.deposit = deposit;  
        this.acctype = acctype;  
        this.mobile = mobile;  
    }
    

}