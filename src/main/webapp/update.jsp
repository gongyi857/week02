<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css"/> 
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
</head>
<body>
		<form action="update" method="post">
			标题<input type="text" value="${li.bt }" name="bt">
		<  	博文分类<input type="text" value="${li.type }" name="type"><br>
			标签<c:forEach items="${list }" var="o">
				<select name="tid">
				<option value="${o.tid }">${o.bq}</option>
			</select>
			
			</c:forEach> 
				<input type="submit" value="提交">
		</form>
</body>

</html>