<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Enquiry Form </title>
</head>
<body>
    <h2>Student Enquiry Form</h2>
    <p><font color="green">${success}</font></p>
	<form:form action="saveStudent" modelAttribute="student" method="POST">
	    <br></br>
	      <table >
	        <tr>
	           <td>Name : </td><td><form:input path="studentName"/></td>
	        </tr>
	        <tr>
	           <td>Email : </td><td><form:input path="studentEmail"/></td>
	        </tr>
	         <tr>
	           <td>Gender : </td>
	               <td><form:radiobutton path="studentGender" value="M"/>Male
	                   <form:radiobutton path="studentGender" value="F"/>Fe-Male
	               </td>
	        </tr>
	         <tr>
	           <td>Courses : </td>
	               <td><form:select path="studentCourse">
	                   <form:option value="">-Select-</form:option>
	                   <form:options items="${courseList}" />
	                   </form:select> 
	               </td>
	        </tr>
	         <tr>
	           <td>Timings : </td>
	               <td>
	                 <form:checkboxes items="${timingsList}" path="studentTimings"/>
	               </td>
	        </tr>
	        
	        <tr>
	           <td></td><td><input type="submit" value="Save"></td>
	        </tr>
	      </table>
	</form:form>      
</body>
</html>