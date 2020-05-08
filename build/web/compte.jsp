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
        <title>La Boutique du Terroir - ${selectedAccount.getPrenom()} ${selectedAccount.getNom()}</title>
        <link rel="icon" type="image/png" href="resources/pictures/Icone.png" />
        <link rel="stylesheet" href="resources/css/main.css" />
        <link rel="stylesheet" href="resources/css/product.css" />
    </h:head>
    <h:body>
        <jsp:include page="jspf/header.jsp">
            <jsp:param name="bl" value="bl"/>
        </jsp:include>
        
        <div id="body">
            <div id="top">
                <div id="pictures">
                    <img src="${initParam.accountImagePath}${selectedAccount.getProfilePicture()}" />
                </div>
                <div id="description">
                    <div id="top-row">
                        <h2 class="nom-produit">${selectedAccount.getPrenom()} ${selectedAccount.getNom()}</h2>
                    </div>
                    <div id="middle-row">
                        <p id="bottom-row">
                            ${selectedAccount.getPresentation()}
                        </p>
                    </div>
                </div>              
            </div>
        
            <div class="placeholder">
                <h2 class="placeholder-name">Articles en vente</h2>
                <ul class="articles">                   
                    <c:forEach var="produit" items="${accountProducts}" varStatus="iter">
                    <li><a class="item" href="product?${produit.getIdProduit()}">
                        <h3 class="nom-produit">${produit.getNom()}</h3>
                        <img src="${initParam.productImagePath}${produit.getImage()}" />
                        <div class="item-bottom">
                            <p class="price">${produit.getPrix()}€</p>
                            <p class="rating">100%</p>
                        </div>
                    </a></li>
                    </c:forEach>  
                </ul>
            </div>
        </div>
            
        <jsp:include page="jspf/footer.jspf">
            <jsp:param name="bl" value="bl"/>
        </jsp:include>
    </h:body>
</html>
