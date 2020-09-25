<%-- 
    Document   : ageCalculator
    Created on : Sep 24, 2020, 2:21:06 PM
    Author     : 816590
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    
        <h1>Age Calculator</h1>
        <form method="post" action="agecalc">
            <label>Enter your age:</label>
            <input type="text" name="age" value="${userAge}">
            <br>
            <input type="submit" value="Age next birthday ">
        </form>
        
        <p>${output}</p>
        <br>
        <a href="arithcalc">Arithmetic Calculator</a>
    
</html>
