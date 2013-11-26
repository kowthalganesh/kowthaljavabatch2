<%@taglib uri="/tIds/struts-html" prefix="html"%>
<%@taglib uri="/tIds/struts-bean" prefix="bean" %>

<link rel="stylesheet" type="text/css" href="css/style.css">


 
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Login page</title>
    </head>
    
<body>

 <html:form action="login">
    <table border="1">
   
   <tr><td>UserName</td><td><html:text property="userName"></html:text></td>
   <td><html:errors property="userName" /></td> </tr>
   
   <tr><td> Password</td><td><html:password property="password"></html:password></td>
   <td><html:errors property="password"/></td></tr>
    
         
        
       <tr><td><html:submit/></td></tr>
        
        <tr>
        <td><a href="adminlog.jsp">admin action</a></td>
        <td><a href="reglog.jsp">Registration action</a></td>
     
        </tr>
        </table>
    </html:form>

   </body>
</html>