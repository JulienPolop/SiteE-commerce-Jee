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
        <title>La Boutique du Terroir - ${selectedProduct.getNom()}</title>
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
                    <img src="${initParam.productImagePath}${selectedProduct.getImage()}" />
                </div>
                <div id="description">
                    <div id="top-row">
                        <h2 class="nom-produit">${selectedProduct.getNom()}</h2>
                        <p class="producer">de <a href="compte?${producer.getIdCompte()}">${producer.getPrenom()} ${producer.getNom()}</a> </p>
                        <p class="rating">100%</p>
                    </div>
                    <div id="middle-row">
                        <p id="quantity">Quantité :</p>
                        
                            <form action="addToCart" method="post" id="form1">
                                <select id="select-quantity" name = "quantity" >
                                    <option value="1">1</option>
                                    <option value="2">2</option>
                                    <option value="5">5</option>
                                    <option value="10">10</option>
                                </select>
                                
                                <input type="hidden" name="productId" value="${selectedProduct.getIdProduit()}">
                            </form>
                        
                        
                        <button id="add-to-basket" type="submit" form="form1" value="Submit">Ajouter au panier</button>
                        

                        
                    </div>
                    <p id="bottom-row">
                        ${selectedProduct.getDescription()}
                    </p>
                </div>
            </div>
            
            <div class="placeholder">
                <h2 class="placeholder-name">Articles similaires</h2>
                <ul class="articles">
                                       
                    <c:forEach var="produit" items="${categoryProducts}" varStatus="iter">
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
            
            <div id="comment-section">
 
                
            <c:forEach var="avis" items="${hmAvis}" varStatus="iter">

                    <div class="commentaire">
                        <img src="${initParam.accountImagePath}${avis.value.getProfilePicture()}" class="profile-picture"/>
                        <div class="top-row">
                            <p class="pseudo"><a> ${avis.value.getPrenom()} ${avis.value.getNom()}</a></p>
                            <p class="date">le 06/06/2006 Ã  6h66</p>
                            <p class="rating">100%</p>
                        </div>
                        <p class="texte">
                            ${avis.key.getTexte()}
                        </p>
                    </div>
                </c:forEach>
                    
                
                

            </div>
        </div>
            
        <jsp:include page="jspf/footer.jspf">
            <jsp:param name="bl" value="bl"/>
        </jsp:include>
    </h:body>
</html>
