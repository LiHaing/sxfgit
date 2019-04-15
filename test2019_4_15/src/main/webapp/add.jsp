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
	function add(){
		$.post("add.do",$("form").serialize(),function(obj){
			if(obj){
				alert("添加成功!")
				location="list.do";
			}else{
				alert("添加失败")
			}
		},"json");
	}
</script>
</head>
<body>
	<h1>添加页面</h1>
	 <form action="">
		 罪犯姓名 :<input type="text" name='cname'  />  <br />
		 身份证号 :<input type="text" name='card_no'   />  <br />
		 罪犯年龄 :<input type="text" name='age'   />  <br />
		 罪犯性别 :<input type="radio" name='sex' value="男"  />男 <input type="radio" name='sex' value="女"  />女 <br />
		 罪犯描述 :<input type="text" name='desc'   />  <br />
		  <input type="button"  onclick="add()" value="添加" /> 
</body>
</html>