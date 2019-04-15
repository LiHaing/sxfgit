<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-1.8.3.js" ></script>
<script type="text/javascript">
	$(function(){
		
	})
	function page(now){
		$("[name='pageNow']").val(now);
		$("form").submit();
	}
	function add(id){
		location="add.jsp?id="+id;
	}
	function upd(id){
		location="upd.jsp?id="+id;
	}
	function sel(id){
		location="sel.jsp?id="+id;
	}
	function del(id){
		if(confirm("确认删除编号为"+id+"的罪犯吗"))
		$.post("del.do",{cid:id},function(obj){
			if(obj){
				alert("删除成功!")
				location="list.do";
			}else{
				alert("删除失败")
			}
		},"json");
	}
</script>
</head>
<body>
	<h1>列表页面</h1>
	<table border="1">
	<tr>
	<form action="list.do" method="post">
		<input type="hidden" name='pageNow' />
		<td>姓名:<input type="text" name='likeName' value="${param.likeName}" /> </td>
		<td> <input type="submit"   value="搜索" /> </td>
	</form>
	</tr>
		<tr>
			<td>罪犯ID</td>
			<td>罪犯姓名</td>
			<td>身份证号</td>
			<td>罪犯年龄</td>
			<td>罪犯性别</td>
			<td><input type="button" value="添加" onclick="add(${c.cid})" /></td>
		</tr>
		<c:forEach items="${list}" var="c">
			<tr>
				<td>${c.cid}</td>
				<td>${c.cname}</td>
				<td>${c.card_no}</td>
				<td>${c.age}</td>
				<td>${c.sex}</td>
				<td>
					<input type="button" value="修改" onclick="upd(${c.cid})" />
					<input type="button" value="详情" onclick="sel(${c.cid})" />
					<input type="button" value="删除" onclick="del(${c.cid})" />
				</td>
			</tr>
		</c:forEach>
		<tr>${page.pageHTML}</tr>
	</table>

</body>
</html>