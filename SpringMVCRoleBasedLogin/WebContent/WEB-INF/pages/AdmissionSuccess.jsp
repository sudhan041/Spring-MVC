<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- RequestParam Concept -->
<%-- <h1> Congratulations ! Engineering college processed your Application form successfully</h1>
<h2> ${msg}</h2> --%>

<!-- ModelAttribute Concept -->
<h1>${headerMessage}</h1>
<h3> Congratulations ! Engineering college processed your Application form successfully</h1>
<h2> Details submitted by you:</h2>
<table>
<tr>
	<td>Student Name : </td>
	<td>${studentobj.studentName} </td>
	
</tr>
<tr>
	<td>Student Hobby : </td>
	<td>${studentobj.studentHobby} </td>
	
</tr>
</table>

</body>
</html>