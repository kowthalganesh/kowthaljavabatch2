<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>  
<%@ page import="net.kowthal.struts.helloworld.form.AdminRepForm" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<link rel="stylesheet" href="css/displaytag.css" type="text/css">  
<link rel="stylesheet" href="css/screen.css" type="text/css">  
<link rel="stylesheet" href="css/site.css" type="text/css">  

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
</head>  
<body>  
  
<display:table name="sessionScope.studentDetails" pagesize="2"  
    export="true" sort="list" >  
    <display:column property="userName" title="UserName"  
        sortable="true" headerClass="sortable" />  
    
         <display:column property="accNo" title="AccNo"  
        sortable="true" headerClass="sortable" />  
    
         <display:column property="deposit" title="Balance"  
        sortable="true" headerClass="sortable" />  
    
    <display:column property="acctype" title="acctype"  
        sortable="true" headerClass="sortable" />  
    
    <display:column property="mobile" title="mobile" sortable="true"  
        headerClass="sortable" />  
    
</display:table>  
  <a href="adminlog.jsp">Admin Login page</a>
</body>  
</html>