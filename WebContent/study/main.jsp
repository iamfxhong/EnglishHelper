<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	pageContext.setAttribute("path", request.getContextPath());
	String email = null;
	email = request.getParameter("email");
	pageContext.setAttribute("email", email);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>背背+，英语学习小助手</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/font-awesome.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/main.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css">
</head>
<body>
<!-- 左侧导航栏 -->
	<nav class="menu-wrap" style="z-index: 9998">
		<div class="menu dowebok">
			<ul>
				<li><a> <i class="fa fa-home fa-lg"></i> <span
						class="nav-text">首页</span>
				</a></li>
				<li><a href="elogin.jsp"> <i class="fa fa-user fa-lg"></i>
						<span class="nav-text">登录</span>
				</a></li>
				<li><a href="http://www.dowebok.com/"> <i
						class="fa fa-registered"></i> <span class="nav-text">注册</span>
				</a></li>
				<li><a href="${path}/word_findAll.action?currPage=1" target="_blank">
						<i class="fa fa-book"></i> <span class="nav-text">词汇</span>
				</a></li>
				<li class="darkerli"><a href="${path}/word_getNewWord.action"  target="_blank"> <i
						class="fa fa-bookmark"></i> <span class="nav-text">生词</span>
				</a></li>
				<li class="darkerli"><a href="javascript:void(0);" onclick="getReadingTest()"> <i
						class="fa fa-pencil-square-o"></i> <span class="nav-text">阅读</span>
				</a></li>
				<li><a href="http://www.dowebok.com/"> <i
						class="fa fa-envelope-o fa-lg"></i> <span class="nav-text">写作</span>
				</a></li>
				<li><a href="help.jsp" target="_blank"> <i
						class="fa fa-question-circle fa-lg"></i> <span class="nav-text">帮助</span>
				</a></li>
			</ul>
		</div>
	</nav>
	<div class="container">
<!-- 	没有登录显示单词，生词页 -->
		<div class="jumbotron withoutEmailToVocabulary" style="display: none">
			<img src="../images/2572e41285902eeaa7bfcb84178829b5.jpg" alt="...">
			<h1>Make English Simpler</h1>
			<p>
				<a class="btn btn-primary btn-lg" href="elogin.jsp" role="button">start now</a>
			</p>
		</div>
	</div>
		</div>
		
		<div class="helper">
		</div>
		<script src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
		<script type="text/javascript">

		</script>
</body>
</html>