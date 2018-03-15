<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste des joueurs</title>
</head>
<body>
Liste des joueurs<br /><br />
<table>
<tr>
	<th>Nom</th>
	<th>Pr&eacute;nom</th>
	<th>Sexe</th>
	<th>Nation</th>
	<th>Classement</th>
</tr>
<c:forEach items="${listeJoueurs}" var="joueur">
<tr>
	<td><a href="<c:url value="/joueur/" />${joueur.id}">${joueur.nom}</a></td>
	<td>${joueur.prenom}</td>
	<td>${joueur.sexe}</td>
	<td>${joueur.nation}</td>
	<td>${joueur.classement}</td>
</tr>
</c:forEach>
</table>

</body>
</html>