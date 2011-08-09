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
	<center>
	<table  style="background-color:#bbbbbb; padding-top: 4px; padding-bottom: 4px;" >
		<tr>
			<td><s:text name="userName"></s:text>  </td>
			<td><s:text name="sex"></s:text></td>
			<td><s:text name="hobby"></s:text></td>
			<td><s:text name="nation"></s:text></td>
			<td><s:text name="birthday"></s:text></td>
			<td><s:text name="update"></s:text></td>
			<td><s:text name="delete"></s:text></td>
		</tr>
		
			<s:iterator value="queryUser">
				<tr>
					<td>
						<s:property value="userName"/>
					</td>
					<td>
						<s:property value="sex"/>
					</td>
					<td>
						<s:property value="hobby"/>
					</td>
					<td>
						<s:property value="nation"/>
					</td>
					<td>
						<s:property value="birthday"/>
					</td>
					<td>
						<s:url action="update" id="updates">
							<s:param name="userID" value="userID"></s:param>
						</s:url>
						<s:a href="%{updates}"><s:text name="update"></s:text></s:a>
					</td>
					<td>
						<s:url action="delete" id="del">
							<s:param name="userID" value="userID"></s:param>
						</s:url>
						<s:a href="%{del}"><s:text name="delete"></s:text></s:a>
					</td>
				</tr>
			</s:iterator>
	</table>
	<a href="login.jsp"><s:text  name="return"/></a>
	
	</center>
</body>
</html>