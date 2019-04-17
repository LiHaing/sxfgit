<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="<%=request.getContextPath() %>js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	$(function() {
		$.post("getDept.do", {}, function(obj) {
			console.log(obj)
			for (i in obj) {
				$("[name='dept']").append( "<option value='"+obj[i].did+"' >" + obj[i].dname 	+ "</option>");
			}
			$("[name='dept'] [value='${param.dept}']").attr("selected",true);
		}, "json")
		

		
	})

	function page(now) {
		$("[name='pageNow']").val(now);
		$("form").submit();
	}
</script>
</head>
<body>
	<h1>列表页面</h1>
	<table border="1">
		<tr>
			<form action="list.do" method="post">
				<input type="hidden" name="pageNow" />
				<td>员工姓名:</td>
				<td><input type="text" value="${param.likeName}" name="likeName" /></td>
				<td><input type="submit" value="搜索" /></td>
			</form>

		</tr>

		<tr>
			<td>员工编号</td>
			<td>员工姓名</td>
			<td>员工密码</td>
			<td><input type="button" value="添加" onclick="location='add.jsp'" /></td>
			<td><input type="button" value="注销" /></td>
		</tr>
		<c:forEach items="${list}" var="t" varStatus="sta">
			<tr>
				<td><input type="checkbox" value="${t.id}" name="id" />
					${sta.count}</td>
				<td>${t.username}</td>
				<td>${t.password}</td>
				<td><input type="button" value="查看" onclick="location='sel.jsp?id=${t.eid}'" /></td>
				<td><input type="button" value="删除" /></td>
			</tr>
		</c:forEach>
		<tr>${page.pageHTML}</tr>
	</table>
</body>
</html>