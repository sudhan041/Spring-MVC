<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${headerMessage}</h1>
 
<h1> STUDENT ADMISSION FORM FOR ENGINEEERING COURSES</h1>

<form:errors path="studentobj.*"/>

<form action="/SpringMVCRoleBasedLogin/submitAdmissionForm.html" method="post">
<p>
Student Name: <input type="text" name= "studentName"/>
</p>
<p>
Student Hobby: <input type="text" name= "studentHobby"/>
</p>
<input type="submit" value="Submit"></button>
</form>
</body>
</html>