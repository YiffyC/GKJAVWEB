<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fiche de ${joueur.prenom} ${joueur.nom}</title>
</head>
<body>
Fiche de <b>${joueur.prenom} ${joueur.nom}</b><br /><br />
<table>
<tr>
	<td><b>Nom Pr&eacute;nom</b></td>
	<td>${joueur.prenom} ${joueur.nom}</td>
</tr>
<tr>
	<td><b>Sexe</b></td>
	<td>${joueur.sexe}</td>
</tr>
<tr>
	<td><b>Nation</b></td>
	<td>${joueur.nation}</td>
</tr>
<tr>
	<td><b>Classement</b></td>
	<td>${joueur.classement}</td>
</tr>	
</table>
</body>
</html>