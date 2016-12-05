<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<script type="text/javascript"
    src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
<script type="text/javascript" src="http://www.technicalkeeda.com/js/javascripts/plugin/json2.js"></script>
    
    
<script type="text/javascript">
function myFunction() {
var username=$("#username").val();
var password=$("#password").val();
/* alert(username) */
    $.ajax({
        type:'GET',
        url:'/SpringMVCRoleBasedLogin/getEmpDetails',
        data: "Username=" + username + "&Password=" + password,
        contentType: 'application/json',
        mimeType: 'application/json',
        dataType: 'json',
        success:function(data){
            //alert(data.Role);
            for(var i =0;i < data.length;i++)
				{
				  var item = data[i];
				  //console.log(item);
				   for(var j =0;j < item.length ;j++){
					  console.log(item[j].username);
					  $("#role").val(item[j].role);
				  } 
				  
				}

        	//$("#role").val(data[0].role);
        	//console.log('success' + data.role );
          },
        error:function(xmlHttpRequest, textStatus, errorThrown){
            if(xmlHttpRequest.readyState=0 || xmlHttpRequest.status == 0)
                return;
        },
    });
}
</script>
<!-- 
<script type="text/javascript">
    var intervalId = 0;
    intervalId = setInterval(myFunction, 3000);
</script>
 -->

<body>
 
<h3>Message : ${message}</h3>
<h3>userdto : ${userdto}</h3>
<form action="/SpringMVCRoleBasedLogin/welcome" method="post">
<p>
Username: <input type="text" name= "Username" id="username"/>
</p>
<p>
Password: <input type="text" name= "Password" id ="password"  />
</p>
<p>
Role: <input type="text" name= "Role" id= "role" onfocus="myFunction()"/>
</p>
<input type="submit" value="Submit"></button>
</form>
</body>
</html>