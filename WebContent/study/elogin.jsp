<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	pageContext.setAttribute("path", request.getContextPath());
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <title>背背+，英语学习小助手</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
</head>
<body>
	<div class="dowebok">
        <div class="container">
            <div class="left">
                <div class="login">登录</div>
                <div class="eula help-block">欢迎光临，请输入你的电子邮箱和密码以登录！</div>
				<span class="help-block eula"><s:actionerror/></span>
            </div>
            <div class="right">
                <svg viewBox="0 0 320 300">
                    <defs>
                        <linearGradient inkscape:collect="always" id="linearGradient" x1="13" y1="193.49992" x2="307"
                            y2="193.49992" gradientUnits="userSpaceOnUse">
                            <stop style="stop-color:#ff00ff;" offset="0" id="stop876" />
                            <stop style="stop-color:#ff0000;" offset="1" id="stop878" />
                        </linearGradient>
                    </defs>
                    <path d="m 40,120.00016 239.99984,-3.2e-4 c 0,0 24.99263,0.79932 25.00016,35.00016 0.008,34.20084 -25.00016,35 -25.00016,35 h -239.99984 c 0,-0.0205 -25,4.01348 -25,38.5 0,34.48652 25,38.5 25,38.5 h 215 c 0,0 20,-0.99604 20,-25 0,-24.00396 -20,-25 -20,-25 h -190 c 0,0 -20,1.71033 -20,25 0,24.00396 20,25 20,25 h 168.57143" />
                </svg>
                
                <form action="${pageContext.request.contextPath}/user_login.action" method="post">
                <div class="form">
                
                    <label for="email">电子邮箱</label>
                    <input type="email" id="email" name="email" >
                    <label for="password">密码</label>
                    <input type="password" id="password" name="password" >
                    <input type="submit" id="submit" value="登录">
                </div>
                </form>
            </div>
        </div>
    </div>
    <script src="../js/jquery-3.3.1.js"></script>
    <script src="../js/anime.min.js"></script>
    <script src="../js/index.js"></script>
    <script type="text/javascript">
    </script>
</body>
</html>