<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>login</title>
</head>
<body>

<form action="/processLogin" method="post">
 <h1><span>姓名：</span><input name="username"/></h1>
 <h1><span>密码：</span><input name="password"/></h1>
  <h2><input  type="submit" value="登录"/> </h2>
</form>
</body>
</html>