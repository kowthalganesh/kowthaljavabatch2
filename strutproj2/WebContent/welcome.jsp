<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/tIds/struts-html" prefix="html"%>
<%-- <%@taglib uri="/tIds/struts-bean" prefix="bean" %> --%>
<%@page import="net.kowthal.struts.helloworld.form.LoginForm"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Welcome to our Home Page</title>
    </head>
    <body >
    
    <table align="right">
    <tr><td></td><td align="right"><a href="index.jsp">Logout</a></td></tr>
    <tr><td><b>Welcome,</b></td><td><b>
 <%
if(session.getAttribute("currentSession") != null) {
LoginForm currentUser = (LoginForm) session
.getAttribute("currentSession");
out.println(currentUser.getUserName());
}%></b>
</td>
</tr>
</table>

<div id="menu">
<table border="0">
<tr><td>Jump to:</td></tr><br/>
<%-- <tr><td><html:select property="country">
<html:option value="Default">Select</html:option>
<html:option value="Accstmt">Account Statement</html:option>
<html:option value="epay">Add Biller(e-bay)</html:option>
<html:option value="view">View/Pay Bills</html:option>
<html:option value="fund">Fund Transfer</html:option>
<html:option value="tpt">Third Party Transfer</html:option>
</html:select>
 </td></tr>
 --%> 
 <tr><td><select name="country">  
<option selected="" value="Default">Select</option>  
<option value="Accstmt">Account Statement</option>  
<option value="epay">Add Biller(e-bay)</option>  
<option value="view">View/Pay Bills</option>  
<option value="fund">Fund Transfer</option>  
<option value="tpt">Third Party Transfer</option>  
</select></td>
<td><input type="submit" name="Go" value="Go"  /> </td>
</tr>
<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
<tr><td><a href="#">Account Summary</a></td></tr>
<tr><td><a href="#">Account Statement</a></td></tr>
<tr><td><a href="fund.jsp">Third Party Fund transfer</a></td></tr>
<tr><td><a href="#">Pending Statement</a></td></tr>
<tr><td><a href="#">View Income Tax Statement</a></td></tr>
<tr><td><a href="#">Reprint Challan</a></td></tr>
<tr><td><a href="#">Change Login Password</a></td></tr>
<tr><td><a href="#">Print e-Receipt for PPF</a></td></tr>
<tr><td>------- ---- -------</td></tr>
</table>
</div>
<div id=accdetails>
<table border="0">
<tr><td><b>Account Summary</b></td></tr>
<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>		
<tr><td><b>Transaction Accounts</b></td></tr><br/>
<tr><td>&nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
<tr><td><b>View Your balance and profile</b></td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Fund Transfer</b></td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<b>Transactions</b></td></tr>
<tr><td> 
<form method="post" action="BalanceAction"><input type="submit" value="Get Profile"></form>  
</td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="fund.jsp">
Fund transfer</a>
</td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#">Click here for last 10 transactions</a></td></tr>
</table>
</div>




</body>
</html>