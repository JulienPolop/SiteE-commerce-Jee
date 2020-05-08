<?xml version="1.0" encoding="UTF-8"?>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:h="http://xmlns.jcp.org/jsf/html">
    <h:head>
        <title>La Boutique du Terroir - [nom du produit]</title>
        <link rel="icon" type="image/png" href="resources/pictures/Icone.png" />
        <link rel="stylesheet" href="resources/css/main.css" />
        <link rel="stylesheet" href="resources/css/confirmation.css" />
    </h:head>
    <h:body>
        <jsp:include page="jspf/header.jsp">
            <jsp:param name="bl" value="bl"/>
        </jsp:include>
        
        <div id="body">
            <h3 id="top">Votre commande</h3>
            <div id="articles">
                <div class="article">
                    <h3 class="nom-produit">Fromage de tÃªte</h3>
                    <p>*</p>
                    <p class="quantity">6</p>
                    <p class="price">6.66â¬</p>
                </div>
                <div class="article">
                    <h3 class="nom-produit">Fromage de tÃªte</h3>
                    <p>*</p>
                    <p class="quantity">6</p>
                    <p class="price">6.66â¬</p>
                </div>
                <div class="article">
                    <h3 class="nom-produit">Fromage de tÃªte</h3>
                    <p>*</p>
                    <p class="quantity">6</p>
                    <p class="price">6.66â¬</p>
                </div>
                <div class="article">
                    <h3 class="nom-produit">Fromage de tÃªte</h3>
                    <p>*</p>
                    <p class="quantity">6</p>
                    <p class="price">6.66â¬</p>
                </div>
                <div class="article">
                    <h3 class="nom-produit">Fromage de tÃªte</h3>
                    <p>*</p>
                    <p class="quantity">6</p>
                    <p class="price">6.66â¬</p>
                </div>
            </div>
            <p id="nb-articles">Total [X]â¬</p>
        </div>
            
        <jsp:include page="jspf/footer.jspf">
            <jsp:param name="bl" value="bl"/>
        </jsp:include>
    </h:body>
</html>
