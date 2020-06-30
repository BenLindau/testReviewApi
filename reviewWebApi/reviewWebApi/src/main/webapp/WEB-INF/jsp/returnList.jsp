<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Test Review API</title>
</head>
<body>
	<h1>Input Question Data</h1>
		 <p>
            Please enter Question Detail:
        </p>
       
        <form method="post" action="inputQuestion">
        <p>Question:</p>
            <input type="text" name="questionDegree" placeholder="Question Degrees"/>
            <select id = "questionUnit" name="questionUnit">
               <option value = "Fahrenheight">Fahrenheight </option>
               <option value = "Celsius">Celsius</option>
               <option value = "Kelvin">Kelvin</option>
               <option value = "Rankine">Rankine</option>
             </select>
  
        <p>Answer:</p>
           <input type="text" name="answerDegree" placeholder="Answer Degrees"/>
        	<select id = "answerUnit" name="answerUnit">
               <option value = "Fahrenheight">Fahrenheight </option>
               <option value = "Celsius">Celsius</option>
               <option value = "Kelvin">Kelvin</option>
               <option value = "Rankine">Rankine</option>
             </select>
        <p>
        	<input type="submit" value="Review Input" />
        </p>
        </form>          
   <br>
  <c:forEach var="qaModel" items="${questions}"> 
   		<tr>
   			<td><c:out value="${qaModel}"/></td>
   		</tr>
   		<br>
   </c:forEach>
 
</body>
</html>