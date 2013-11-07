<%@taglib uri="/tIds/struts-html" prefix="html"%>
<%@taglib uri="/tIds/struts-bean" prefix="bean" %>
<link rel="stylesheet" type="text/css" href="css/style.css">


 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Login page</title>
     </head>
    
<body>
   <html:form action="alogin">
    Admin Login page
   <br/><br/>
   <label name="UserName" value= "UserName" />
   UserName<html:text property="userName"></html:text>
   <html:errors property="userName" />
   <br/><br/><br/>
  
    <label name="Password" value= "Password" />
    Password <html:password property="password"></html:password>
   <html:errors property="password"/>
   <br/><br/><br/>
         
        <a href="index.jsp">user action</a>
        <br/><a href="home.jsp">Homepage</a>
        <html:submit/>
        <html:reset/>
        <br/><br/>
        <br/>
    </html:form>





</div>
    </body>
</html>