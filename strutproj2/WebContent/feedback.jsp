<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.4.min.js"></script>
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
</head>
<body>
<div id="login-box" class="login-popup">
<a href="#" class="close"><img src="close_pop.png" class="btn_close" title="Close Window" alt="Close" /></a>
  <form method="post" class="signin" action="#">
        <fieldset class="textbox">
        <label class="username">
        <span>Username or email</span>
        <input id="username" name="username" value="" type="text" autocomplete="on" placeholder="Username">
        </label>
        <label class="password">
        <span>Password</span>
        <input id="password" name="password" value="" type="password" placeholder="Password">
        </label>
        <button class="submit button" type="button">Sign in</button>
        <p>
        <a class="forgot" href="#">Forgot your password?</a>
        </p>        
        </fieldset>
  </form>
</div>
</body>
</html>