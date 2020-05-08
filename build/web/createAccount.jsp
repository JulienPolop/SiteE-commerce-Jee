<?xml version="1.0" encoding="UTF-8"?>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:h="http://xmlns.jcp.org/jsf/html">
    <h:head>
        <title>La Boutique du Terroir - Accueil</title>
        <link rel="icon" type="image/png" href="../resources/pictures/Icone.png" />
        <link rel="stylesheet" href="resources/css/main.css" />
        <link rel="stylesheet" href="resources/css/connection.css" />
    </h:head>
    <h:body>
        <jsp:include page="jspf/header.jsp">
            <jsp:param name="bl" value="bl"/>
        </jsp:include>
        
        <div id="body">

            
                <div id="connection-dialog">
                    <h3>Création de compte</h3>
                    <form action="createAccount" method="post" id="form1">
                         <div class="field">
                            <p>Nom</p>
                            <input type="text" name="name"/>
                        </div>
                        <div class="field">
                            <p>Prénom</p>
                            <input type="text" name="firstName"/>
                        </div>
                        <div class="field">
                            <p>Adresse</p>
                            <input type="text" name="adress"/>
                        </div>
                        <div class="field">
                            <p>Email</p>
                            <input type="email" name="email"/>
                        </div>
                        <div class="field">
                            <p>Mot de passe</p>
                            <input type="password"  name="mdp"/>
                        </div>
                    </form>

                    <button id="connection_button" type="submit" form="form1" value="Submit">Créer un compte</button>
                    
                </div>
            
            
        </div>
            
        <jsp:include page="jspf/footer.jspf">
            <jsp:param name="bl" value="bl"/>
        </jsp:include>
    </h:body>
</html>

