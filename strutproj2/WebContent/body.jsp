<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<style>
body
{
background-color:#d0e4fe;
}
</style>
<script language="javascript" type="text/javascript">
function rotate()
{
    var speed=1000
    var t
    var imgArray=new Array("img/bank.jpg","img/dvb.jpg", "img/mbb.jpg");
    var aImg=Math.floor(Math.random()*imgArray.length);
    var img=imgArray[aImg];
    document.body.style.background = "url("+ img +") no-repeat";
    document.body.style.backgroundSize = "925px 450px";
    document.body.style.backgroundPosition="";
    t=setTimeout('rotate()' , speed) 
}
</script>
</head>
<body onload="rotate()">
</body>
</html>