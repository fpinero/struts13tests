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
<title>welcome</title>
</head>
<body>
<logic:present name="UserLogged">
	<h3 align="center" style="color: blue;"><bean:message key="label.welcome.login"/>
		<bean:write name="UserLogged" property="name"/>&nbsp;con edad
		<bean:write name="UserLogged" property="edad"/> 
	</h3>
</logic:present>
<html:form action="welcome">

	<html:messages id="err_sexo" property="common.sexo.err">
		<div style="color: red;">
			<bean:write name="err_sexo"/>
		</div>
	</html:messages>
	
	<html:radio property="usersex" value="male"/> 
		<bean:message key="label.common.html.radio.sex.male"/>

	<html:radio property="usersex" value="female"/> 
		<bean:message key="label.common.html.radio.sex.female"/>

	<div style="padding:16px">
		<div style="float:left;padding-right:8px;">
			<html:submit>
                <bean:message key="label.common.html.radio.button.submit"/>
            </html:submit>
	</div>
	<html:reset>
        <bean:message key="label.common.html.radio.button.reset"/>
    </html:reset>
	</div>
	
</html:form>

</body>
</html>