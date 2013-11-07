<%@taglib uri="/tIds/struts-html" prefix="html"%>
<%@taglib uri="/tIds/struts-bean" prefix="bean" %>

<!DOCTYPE html>
<html>
<link rel="stylesheet" type="text/css" href="css/mystyle.css">
<!-- <link rel="stylesheet" type="text/css" href="css/popup.css"> -->
<head>
<!-- <style>
body
{
background-image:url("img/bodybac.jpeg");
}
</style>  -->
<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.4.min.js"></script>
 <script src="http://code.jquery.com/jquery-1.9.1.js"></script>
<script src="http://code.jquery.com/ui/1.10.3/jquery-ui.js"></script>

<script>
$(function() {
var availableTags = [
"Registration",
"UserLogin",
"Admin Login",
"Fund Transfer",
"Profile page",
"Properties"
];
$( "#tags" ).autocomplete({
source: availableTags
});
});
</script>
<script type="text/javascript">
$('a.login-window').click(function() {
    
    //Getting the variable's value from a link 
var loginBox = $(this).attr('href');

//Fade in the Popup
$(loginBox).fadeIn(300);

//Set the center alignment padding + border see css style
var popMargTop = ($(loginBox).height() + 24) / 2; 
var popMargLeft = ($(loginBox).width() + 24) / 2; 

$(loginBox).css({ 
'margin-top' : -popMargTop,
'margin-left' : -popMargLeft
});

// Add the mask to body
$('body').append('<div id="mask"></div>');
$('#mask').fadeIn(300);

return false;
});

//When clicking on the button close or the mask layer the popup closed
$('a.close, #mask').live('click', function() { 
$('#mask , .login-popup').fadeOut(300 , function() {
$('#mask').remove();  
}); 
return false;
});


</script>
<title>AML Bank Process Tool</title>
</head>
<body >
<div id="para1" align="right">
<b>
 &nbsp&nbsp<a href="index.jsp" target="center" >User Login</a>&nbsp&nbsp&nbsp&nbsp
     |
 &nbsp&nbsp<a href="adminlog.jsp" target="center">Admin Login</a>&nbsp&nbsp&nbsp&nbsp 
     | 
 &nbsp&nbsp<a href="reglog.jsp" target="center">Registration </a>&nbsp&nbsp&nbsp&nbsp
     | 
 &nbsp&nbsp<a href="#login-box" >Login</a>&nbsp&nbsp&nbsp&nbsp
     | 
 &nbsp&nbsp
</b>
</div>
 <div  align="right" ><!-- class="ui-widget" -->
<label> <!-- for="tags" -->Tags: </label>
<input id="tags" />
</div>
<table border="0">
<tr><td>
<img  src="img/aml.jpg" alt="aml-logo"  height="140px" width="450px">
</td>
<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</td>
<!-- <td><img  src="img/userid.jpg" alt="userlogo"  height="110px" width="650px"></td> -->
</tr>
</table>






<table border="0" >
<tr><td>
<ul id="list-nav">
  <li><a href="home.jsp">Home</a></li>
  <li><a href="index.jsp" target="center">User Login</a></li>
  <li><a href="reglog.jsp" target="center">Registration</a></li>
  <li><a href="">Bank Profile</a></li>
  <li><a href="#">Contact</a></li>
  <li><a href="#">24/7 support</a></li>
</ul></td></tr>
</table>
<div id="login-box" class="login-popup">
<a href="#" class="close"><img src="close_pop.png" class="btn_close" title="Close Window" alt="Close" /></a>
  <form method="post" class="signin" action="#">
        <fieldset class="textbox">
        <label class="username">
        <span> email Id</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input id="txt" name="txt" value="" type="text" autocomplete="on" placeholder="Username">
        </label></br></br></br>
        <label class="Enquiry Details">
        <span>EnQuiry Information</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <textarea id="textarea" name="textarea" value="" type="text" placeholder="textarea">
        </textarea>
        </label></br>
        <button class="submit button" type="button">Send</button>
        <p>
        <a class="forgot" href="#">Forgot your password?</a>
        </p>        
        </fieldset>
  </form>
</div>

</body>
</html>
