<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
	<a href="login.action?request_locale=zh_CN"><s:text name="chinese"/></a>  
	<a href="login.action?request_locale=en_US"><s:text name="english"/></a>
	<center>
		<h2><s:text name="system" ></s:text></h2>
		<s:url action="userAdd" id="add"></s:url>
		<s:a href="%{add}"><s:text name="enrol"/></s:a>
		
		<s:url action="query" id="add"></s:url>
		<s:a href="%{add}"><s:text name="find"/></s:a>
	</center>
</body>
</html>