   <%@taglib uri="/tIds/struts-html" prefix="html"%>
<%@taglib uri="/tIds/struts-bean" prefix="bean" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fund Transfer</title>
</head>
<body>
<html:form action="fundlogin" >
<table border="1">
<tr>
<td>From Acc</td>
<td><html:text property="fromacc" size="20" maxlength="20" /></td>
<td><html:errors property="fromacc" /></td>

<td>Transaction Amount</td>
<td><html:text property="txnamt" size="20" maxlength="20" /></td>
<td><html:errors property="txnamt" /></td>
</tr>

<tr>
<td>To Acc</td>
<td><html:text property="toacc" size="20" maxlength="20" /></td>
<td><html:errors property="toacc" /></td>
</tr>
<tr>
<td>Profile password</td>
<td><html:text property="pp" size="20" maxlength="20" /></td>
<td><html:errors property="txnamt" /></td>
</tr>
<tr><td><html:submit/><html:reset/></td></tr> 
</table>
</html:form>
</body>
</html>