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
<title>Login</title>
</head>
<body>
	<html:form action="Login">
		<html:messages id="err_name" property="common.name.err">
			<div style="color: red;">
				<bean:write name="err_name"/>
			</div>
		</html:messages>
		<html:messages id="err_edad" property="common.edad.err">
			<div style="color: red;">
				<bean:write name="err_edad"/>
			</div>
		</html:messages>
		
		<div style="padding:16px">
			<div style="float:left;padding-right:8px;">
				<bean:message key="label.common.name"/>&nbsp;:
			</div>
			<html:text property="username" size="20" maxlength="20" />
		</div>
		<div style="padding:16px">
			<div style="float:left;padding-right:8px;">
				<bean:message key="label.common.edad"/>&nbsp;:
			</div>
			<html:text property="useredad" size="2" maxlength="2" />
		</div>
		
		<div style="padding:16px">
			<div style="float:left;padding-right:8px;">
				<html:submit>
					<bean:message key="label.common.button.submit"/>
				</html:submit>
			</div>
			<html:reset>
				<bean:message key="label.common.button.reset"/>
			</html:reset>
		</div>
		
	
	</html:form>
</body>
</html>