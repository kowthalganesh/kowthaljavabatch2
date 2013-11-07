<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>profile</title>
</head>
<body>

<display:table name="sessionScope.Details" pagesize="1"  
    export="true" sort="list" >  
    <display:column property="userName" title="UserName"  
        sortable="true" headerClass="sortable" />  
        
        <display:column property="firstName" title="firstName"  
        sortable="true" headerClass="sortable" />  

    <display:column property="mobile" title="mobile"  
        sortable="true" headerClass="sortable" />  
        
        <display:column property="custid" title="custid"  
        sortable="true" headerClass="sortable" />  
        
        <display:column property="accNo" title="accNo"  
        sortable="true" headerClass="sortable" />  
        
        <display:column property="regdate" title="regdate"  
        sortable="true" headerClass="sortable" />  
        
        <display:column property="acctype" title="acctype"  
        sortable="true" headerClass="sortable" />  
        
        <display:column property="jointacc" title="jointacc"  
        sortable="true" headerClass="sortable" />  
        
        <display:column property="balance" title="balance"  
        sortable="true" headerClass="sortable" />  
        
        <display:column property="branch" title="branch"  
        sortable="true" headerClass="sortable" />  
        
       
</display:table>  
</body>
</html>