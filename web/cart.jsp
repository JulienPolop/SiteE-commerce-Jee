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
        <link rel="stylesheet" href="resources/css/cart.css" />
    </h:head>
    <h:body>
        <jsp:include page="jspf/header.jsp">
            <jsp:param name="bl" value="bl"/>
        </jsp:include>
        
        <div id="body">
            <div id="top">
                <h3>Votre panier</h3>
                <p id="nb-articles">[ ${cart.numberOfItems} ] articles = [ ${cart.total}€ ]</p>
                <button id="order">Passer la commande</button>
            </div>

            <div id="articles">
                <c:forEach var="cartItem" items="${cart.items}" varStatus="iter">
                    <c:set var="product" value="${cartItem.product}"/>
                    
                    <div class="article">
                        <img src="${initParam.productImagePath}${product.getImage()}" />
                        <a class="delete">(supprimer l'article)</a>
                        <div class="name-row">
                            <h3 class="nom-produit">${product.getNom()}</h3>
                            <p class="producer">de <a>${product.getIdCompte().getPrenom()} ${product.getIdCompte().getNom()}</a> </p>
                        </div>
                        <div class="price-row">
                            <p class="quantity"> ${cartItem.quantity} </p>
                            <p> x </p>
                            <p class="price">${product.getPrix()}€ par produit</p>
                        </div>
                    </div>
                </c:forEach>

            </div>
        </div>
            
        <jsp:include page="jspf/footer.jspf">
            <jsp:param name="bl" value="bl"/>
        </jsp:include>
    </h:body>
</html>
