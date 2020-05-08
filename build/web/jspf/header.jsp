 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
        <div id="header">
            <a href="/LaBoutiqueDuTerroir" id="logo"><h1>La Boutique du terroir</h1></a>
            <a href="category" id="categories">Parcourir les catégories</a>
            <c:choose>
                <c:when test="${isConnected == true}" >
                    
                    <div id="account-connected">
                        <img src="${initParam.accountImagePath}${connectedAccount.getProfilePicture()}" class="profile-picture" />
                        <div id="texte">
                            <a href="compte?${connectedAccount.getIdCompte()}">${connectedAccount.getPrenom()} ${connectedAccount.getNom()}</a>
                            <form action="deconnect" method="post">
                                <input type="submit" name="submit" value="Se Déconnecter">
                            </form>
                        </div>
                    </div>
                    
                </c:when>
                <c:otherwise>
                    <div id="account-connect">
                        <a href="connection">Connexion</a>
                        <p>ou</p>
                        <a href="createAccount">Créer un compte</a>
                    </div>
                </c:otherwise>
            </c:choose>
            

            <a id="basket" href="cart">
                <img src="resources/pictures/basket.png" />
                <p>( ${cart.numberOfItems} article(s) pour ${cart.total}&euro; )</p> 
            </a>
        </div>