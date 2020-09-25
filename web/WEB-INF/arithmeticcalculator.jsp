<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 25, 2020, 1:30:59 PM
    Author     : 816590
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithcalc">
            <label>First:</label>
            <input type="text" name="first" value="${firstInput}">
            <br>
            <label>Second:</label>
            <input type="text" name="second" value="${secondInput}">
            <br>
            <input type="submit" name="calc" value="+">
            <input type="submit" name="calc" value="-">
            <input type="submit" name="calc" value="*">
            <input type="submit" name="calc" value="%">
        </form>
        
        <p>Result: ${output}</p>
        <br>
        <a href="agecalc">Age Calculator</a>
    </body>
</html>
