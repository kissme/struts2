<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<s:head />
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<center>
	<s:form action="userUpdate_updateUser" method="post" cssStyle="background-color:#bbbbbb; padding-top: 4px; padding-bottom: 4px;">
		<s:hidden name="userID"></s:hidden>
		<s:textfield key="userName"></s:textfield>
		<s:password key="userPassword"></s:password> 
		<s:set name="male" value="%{getText('male')}"></s:set>
		<s:set name="female" value="%{getText('female')}"></s:set>
		<s:radio  key="sex" list='#{#male:#male ,#female:#female}'></s:radio>
		<s:checkboxlist  key="hobby" value="str" list="#attr.ho"></s:checkboxlist>
		<s:select key="nation"  list="#attr.na"></s:select> 
		<s:textfield key="birthday" ></s:textfield>
		<s:submit key="submit"/>
	</s:form>
	<a href="login.jsp"><s:text  name="return"/></a>
	</center>
</body>
</html>