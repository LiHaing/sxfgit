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
		$.post("updBack.do",{cid:${param.id}},function(obj){
			console.log(obj)
			$("[name='cname']").html(obj.cname)
			$("[name='card_no']").html(obj.card_no)
			$("[name='age']").html(obj.age)
			$("[name='desc']").html(obj.desc)
			$("[name='sex']").html(obj.sex)
		},"json");
	});
	function upd(){
		location="list.do";	
	}
</script>
</head>
<body>
	<h1>详情页面</h1>
	 <form action="">
		 罪犯ID:<span name='cid'  > ${param.id}  </span><br />
		 罪犯姓名 :<span name='cname'  > ${param.id}  </span>  <br />
		 身份证号 :<span name='card_no'  > ${param.id}  </span>  <br />
		 罪犯年龄 <span name='age'  > ${param.id}  </span> <br />
		 罪犯性别 :<span name='sex'  > ${param.id}  </span> <br />
		 罪犯描述 :<span name='desc'  > ${param.id}  </span>  <br />
		  <input type="button"  onclick="upd()" value="列表" /> 
</body>
</html>