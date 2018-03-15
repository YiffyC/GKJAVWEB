<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cr&eacute;ation de court</title>
<style type="text/css">
.errors{
	color: #FF0000;
	font-family: Arial;
}
</style>
</head>
<body>
Cr&eacute;ation de court<br /><br />
<sf:form commandName="court">
<sf:errors path="*" cssClass="errors"/>
<table border="0">
	<tr>
		<td>Nom</td>
		<td><sf:input path="nom"/>
		<sf:errors path="nom" />
		</td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input type="submit" name="submit" value="Valider" /></td>
	</tr>
</table>
</sf:form>
</body>
</html>