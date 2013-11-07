<%@taglib uri="http://jakarta.apache.org/struts/tags-html" prefix="html"%>
<%@taglib uri="http://jakarta.apache.org/struts/tags-bean" prefix="bean" %>
<%@taglib uri="http://displaytag.sf.net" prefix="display" %>

<link rel="stylesheet" type="text/css" href="css/style.css">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Home Page</title>
    </head>
    <body>
    <%String message = (String)request.getAttribute("message");%>
    <h1>Welcome <%= message %></h1>
    <form method="post" action="AdminRepAction"><input type="submit"  
    value="Get Report"></form>  

  
</body>
</html>