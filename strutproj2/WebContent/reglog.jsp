<%@taglib uri="/tIds/struts-html" prefix="html"%>
<%@taglib uri="/tIds/struts-bean" prefix="bean" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
  
 <body>
 
<html:form action="reglogin" >
<table border="1">
<tr>
<td>User name</td>
<td><html:text property="userName" size="20" maxlength="20" /></td>
<td><html:errors property="userName" /></td>
</tr>
<tr>
<td>Password</td>
<td><html:password property="fpassword" size="20" maxlength="20" /></td>
<td><html:errors property="fpassword" /></td>
</tr>

<tr>
<td>Confirm Password</td>
<td><html:password property="cpassword" size="20" maxlength="20" />
<td><html:errors property="cpassword" /></td>
</tr>

<tr>
<td>Account Number</td>
<td><html:text property="accno" maxlength="25" /></td>
<td><html:errors property="accno" /></td>
</tr>
<tr>
<td>FirstName</td>
<td><html:text property="firstName" size="20" maxlength="20" /></td>
<td><html:errors property="firstName" /></td>
</tr>

<tr>
<td>LastName</td>
<td><html:text property="lastName" size="20" maxlength="20" /></td>
<td><html:errors property="lastName" /></td>
</tr>

<tr>
   <td>Sex</td>
   <td><html:radio property="sex" value="male" />Male                               
   <html:radio property="sex" value="female" />Female</td> 
<td><html:errors property="sex" /></td>
</tr>    

<tr>
<td>Address</td>
<td><html:textarea property="address" cols="20" rows="4" /></td>
<td><html:errors property="address" /></td>
</tr>

<tr>
<td>Country</td>
<td><html:select property="country">
<html:option value="Default">-- Select --</html:option>
<html:option value="Australia">Australia</html:option>
<html:option value="Europe">Europe</html:option>
<html:option value="India">India</html:option>
<html:option value="Russia">RSA</html:option>
<html:option value="Scotland">Scotland</html:option>
<html:option value="USA">USA</html:option>
</html:select></td>
<td><html:errors property="country" /></td>
</tr>

<tr>
<td>Zip</td>
<td><html:text property="zip" size="20" maxlength="20"/></td>
<td><html:errors property="zip" /></td>
</tr>

<tr>
<td>Mobile</td>
<td><html:text property="mobile" size="20" maxlength="20"/></td>
<td><html:errors property="mobile" /></td>
</tr>

<tr>
<td>Email</td>
<td><html:text property="email" size="20" maxlength="20"/></td>
<td><html:errors property="email" /></td>
</tr>
	
<tr><td><html:submit/><html:reset/></td></tr>      	  
<tr><td>Already registered!! <a href="index.jsp">Login Here</a></td></tr>
<tr><td><a href="home.jsp">Homepage</a></td></tr>
</table>

</html:form>
</body>
</html>