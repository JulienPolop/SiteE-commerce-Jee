<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:h="http://xmlns.jcp.org/jsf/html">
    <h:head>
        <title>La Boutique du Terroir - Accueil</title>
        <link rel="icon" type="image/png" href="resources/pictures/Icone.png" />
        <link rel="stylesheet" href="resources/css/main.css" />
    </h:head>
    
    <h:body>

        <jsp:include page="jspf/header.jsp">
            <jsp:param name="bl" value="bl"/>
        </jsp:include> 

                        
        <div id="body">
            <div class="placeholder">
        
                <h2 class="placeholder-name">Catégories</h2>
                <ul class="articles">
                                     
                    <c:forEach var="categories" items="${categories}">
                        <li><a class="item" href="category?${categories.getIdCategorie()}">
                            <h3 class="nom-produit">${categories.getNom()}</h3>
                        </a></li>
                    </c:forEach>
 
                </ul>
            </div>
            <div class="placeholder">
                <h2 class="placeholder-name">Populaires</h2>
                <ul class="articles">
                    <c:forEach var="produit" items="${produitFamous}">
                        <li><a class="item" href="product?${produit.getIdProduit()}">
                            <h3 class="nom-produit">${produit.nom}</h3>
                            <img src="${initParam.productImagePath}${produit.image}" />
                            <div class="item-bottom">
                                <p class="price">${produit.prix}€</p>
                                <p class="rating">100%</p>
                            </div>
                        </a></li>
                    </c:forEach>
                    
                </ul>
            </div>
            
            <div class="placeholder">
                <h2 class="placeholder-name">Nouveaux articles</h2>
                <ul class="articles">
                    <c:forEach var="produit" items="${produitRecents}">
                        <li><a class="item" href="product?${produit.getIdProduit()}">
                            <h3 class="nom-produit">${produit.nom}</h3>
                            <img src="${initParam.productImagePath}${produit.image}" />
                            <div class="item-bottom">
                                <p class="price">${produit.prix}€</p>
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

