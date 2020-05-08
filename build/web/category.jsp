<?xml version="1.0" encoding="UTF-8"?>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
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
        <link rel="stylesheet" href="resources/css/category.css" />
    </h:head>
    <h:body>
        <jsp:include page="jspf/header.jsp">
            <jsp:param name="bl" value="bl"/>
        </jsp:include>
        
        <div id="body">
            
            <div id="left">
                <h2 class="title">Categories</h2>
                <ul id="categories">  
                    <c:forEach var="categorie" items="${categories}">
                        <c:choose>
                            <c:when test="${categorie.getIdCategorie() == pageContext.request.queryString}">
                                <li class ="selected"> <a href = "category?${categorie.getIdCategorie()}">${categorie.getNom() } </a> </li> 
                            </c:when>
                            
                            <c:otherwise>
                                <li> <a href = "category?${categorie.getIdCategorie()}">${categorie.getNom() } </a> </li> 
                            </c:otherwise>
                        </c:choose>
                    </c:forEach>  
                </ul>
            </div>
            

            
            <div id="right">
                <h2 class="title">${selectedCategory.getNom()}</h2>
                <ul id="articles">
                    <c:forEach var="produit" items="${categoryProducts}" varStatus="iter">
                        <li class="item"><a href="product?${produit.getIdProduit()}">
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

