<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome2</title>
</head>
<body>
<logic:present name="UserLogged">
	<h3 align="center" style="color: blue;">
		Usuario:
		<bean:write name="UserLogged" property="name"/>
		<br/> edad:
		<bean:write name="UserLogged" property="edad"/> 
		<br/> sexo: 
		<bean:write name="UserLogged" property="sexo"/>
	</h3>
	<input type="text" value="${UserLogged.name}" readonly="readonly"><br/>
	<input type="text" value="${UserLogged.edad}" readonly="readonly"><br/>
	<input type="text" value="${UserLogged.sexo}" readonly="readonly"><br/>
</logic:present>

</body>
</html>