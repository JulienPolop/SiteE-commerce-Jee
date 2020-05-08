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
        <link rel="stylesheet" href="resources/css/checkout.css" />
    </h:head>
    <h:body>
        
        <jsp:include page="jspf/header.jsp">
            <jsp:param name="bl" value="bl"/>
        </jsp:include>
        
        <div id="body">
            <div id="paiement">
                <h2>Information de paiement</h2>
                <h3>CoordonnÃ©es du dÃ©tenteur</h3>
                <table>
                    <tr><th>Nom</th>            <th><input id="nom" value=""/></th></tr>
                    <tr><th>PrÃ©nom</th>         <th><input id="prenom" value=""/></th></tr>
                    <tr><th>Code Postal</th>    <th><input id="cp" value=""/></th></tr>
                    <tr><th>Rue</th>            <th><input id="rue" value=""/></th></tr>
                </table>
                <h3>CoodonnÃ©es bancaires</h3>
                <table>
                    <tr><th>NÂ° de carte</th>    <th><input id="carte" value=""/></th></tr>
                    <tr><th>CVV</th>            <th><input id="cvv" value=""/></th></tr>
                    <tr><th>Expiration</th>     <th><input id="expiration" value=""/></th></tr>
                </table>
            </div>
            <div id="livraison">
                <h2>Information de livraison</h2>
                <div id="checkbox">
                    <input type="checkbox" id="same" value="same"/>
                    <label for="same">MÃªme adresse que la facturation</label>
                </div>
                <h3>Adresse de livraison</h3>
                <table>
                    <tr><th>Nom</th>            <th><input id="nom" value=""/></th></tr>
                    <tr><th>PrÃ©nom</th>         <th><input id="prenom" value=""/></th></tr>
                    <tr><th>Code Postal</th>    <th><input id="cp" value=""/></th></tr>
                    <tr><th>Rue</th>            <th><input id="rue" value=""/></th></tr>
                </table>
            </div>
        </div>
            
        <jsp:include page="jspf/footer.jspf">
            <jsp:param name="bl" value="bl"/>
        </jsp:include>
        
    </h:body>
</html>
