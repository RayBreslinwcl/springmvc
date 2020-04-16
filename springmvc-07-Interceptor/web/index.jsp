<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/4/16
  Time: 8:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <h1>首页</h1>
  $END$
    <a href="${pageContext.request.contextPath}/interceptor">拦截器测试</a>

  以下是登陆测试
  <%--登录--%>
  <a href="${pageContext.request.contextPath}/user/jumplogin">登录</a>
  <a href="${pageContext.request.contextPath}/user/jumpSuccess">成功页面</a>
  </body>
</html>
