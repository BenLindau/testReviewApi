<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
               <option value = "celsius">Celsius</option>
               <option value = "kelvin">Kelvin</option>
               <option value = "rankine">Rankine</option>
             </select>
  
        <p>Answer:</p>
           <input type="text" name="answerDegree" placeholder="Answer Degrees"/>
        	<select id = "answerUnit" name="answerUnit">
               <option value = "Fahrenheight">Fahrenheight </option>
               <option value = "celsius">Celsius</option>
               <option value = "kelvin">Kelvin</option>
               <option value = "rankine">Rankine</option>
             </select>
        <p>
        	<input type="submit" value="Review Input" />
        </p>
        </form>          
   <br>
   <c:forEach var="question" items="${qaModel}"> 
   		<tr>
   			<td><c:out value="${qaModel.questionDegree}"></c:out></td>
   			<td><c:out value="${qaModel.questionUnit}"></c:out></td>
   			<td><c:out value="${qaModel.answerDegree}"></c:out></td>
   			<td><c:out value="${qaModel.answerUnit}"></c:out></td>
   			<td><c:out value="${qaModel.isCorrect}"></c:out></td>
   		</tr>
   </c:forEach>
   
 
</body>
</html>