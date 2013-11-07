 package net.kowthal.struts.helloworld.form;

import java.io.Serializable;
 

 
public class BalanceForm implements Serializable {
	
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
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
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
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public String getJointacc() {
		return jointacc;
	}
	public void setJointacc(String jointacc) {
		this.jointacc = jointacc;
	}
	public String getBalance() {
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
	private String userName;   
	private String firstName;  
    private String mobile;  
    private String email;
    private String custid;
    private String accNo;   
	private String regdate;  
    private String acctype;  
    private String jointacc;
    private String balance;
    private String branch;

    
    public BalanceForm() {
 
    }
     
    public BalanceForm(String userName, String firstName, String mobile, String email,String custid,String accNo,String regdate,String acctype,String jointacc,String balance,String branch) 
    {
this.userName=userName;
this.firstName=firstName;
this.mobile=mobile;
this.email=email;
this.custid=custid;
this.accNo=accNo;
this.regdate=regdate;
this.acctype=acctype;
this.jointacc=jointacc;
this.balance=balance;
this.branch=branch;
    
    }
    
    
    
}
