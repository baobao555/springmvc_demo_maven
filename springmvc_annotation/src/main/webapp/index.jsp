<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/11/26
  Time: 0:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="annotationController/requestParam?name=baobao">演示@RequestParam</a><br/>

    <h3>演示@RequestBody</h3>
    <form action="annotationController/requestBody" method="post">
        姓名:<input type="text" name="name"><br/>
        年龄:<input type="text" name="age"><br/>
        <input type="submit" value="提交"><br/>
    </form>

<a href="annotationController/deleteUser/5">演示@PathVariable</a><br/>

<a href="annotationController/requestHeader">演示@RequestHeader</a><br/>

<a href="annotationController/cookieValue">演示@CookieValue</a><br/>

<a href="annotationController/modelAttributeMethod">演示@ModelAttribute修饰方法</a><br/>

<a href="annotationController/sessionAttribute">演示@SessionAttribute</a><br/>
</body>
</html>
