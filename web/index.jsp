<%-- 
    Document   : index
    Created on : 3 oct. 2018, 16:49:25
    Author     : Max
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <p>[ welcome text ]</p>

        
        <!-- test to access context parameters -->
        <img src="${initParam.productImagePath}fromage-de-tete.jpg"/>
    </body>
</html>
