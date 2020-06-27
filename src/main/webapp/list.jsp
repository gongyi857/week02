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
<form action="list" method="post">
按关键字查询<input type="text" name="bt">
<input type="submit" value="查询">
<input type="button" value="发布文章" onclick="add()">
</form>
	<table>
		<tr>
			<td>分类</td>
			<td>标题</td>
			<td>标签</td>
			<td>操作</td>
		</tr>
		
			<c:forEach items="${list }" var="l">
			<tr>
				<td>${l.type }</td>
				<td>${l.bt }</td>
				<td>${l.bq }</td>
				<td>
					<input type="button" value="删除" onclick="del(${l.id})">
					<input type="button" value="编辑" onclick="up(${l.id})">
					
				</td>
				<td></td>
				
			</tr>	
			</c:forEach>
			<tr>
				<td colspan="11">
			<input type="button" value="首页" onclick="funye(1)">
			<input type="button" value="上一页" onclick="funye(${page.pageNum-1<1?1:page.pageNum-1})">
			<input type="button" value="下一页" onclick="funye(${page.pageNum+1>page.pages?page.pages:page.pageNum+1})">
			<input type="button" value="尾页" onclick="fupageNumnye(${page.pages})">
		</td>
			</tr>
	</table>
</body>
<script type="text/javascript">
	function funye(pageNum){
		location="list?pageNum="+pageNum;
	}
	function add(){
		location="selIt";
	}
	function del(id){
		location="del?id="+id;
	}
	function up(id){
		location="up?id="+id;
	}
</script>

</html>