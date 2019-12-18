<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/11/25
  Time: 22:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>演示请求参数的映射</h1>

    <a href="requestParamMapping/baseMapping?username=baobao&age=18">基本类型参数映射</a>

    <h3>bean类型参数映射</h3>
    <form action="requestParamMapping/beanMapping" method="post">
        用户名：<input type="text" name="name"> <br/>
        年龄：<input type="text" name="age"><br/>
        省份：<input type="text" name="address.province"><br/>
        街道：<input type="text" name="address.block"><br/>
        <input type="submit" value="提交"><br/>
    </form>

    <h3>bean中包含集合属性的参数映射</h3>
    <form action="requestParamMapping/beanWithListPropertyMapping" method="post">
        学生姓名：<input type="text" name="name"> <br/>
        学生年龄：<input type="text" name="age"><br/>
        地址List[0]省份：<input type="text" name="addressList[0].province"><br/>
        地址List[0]街道：<input type="text" name="addressList[0].block"><br/>
        地址List[1]省份：<input type="text" name="addressList[1].province"><br/>
        地址List[1]街道：<input type="text" name="addressList[1].block"><br/>
        地址Map[one]省份：<input type="text" name="addressMap['one'].province"><br/>
        地址Map[one]街道：<input type="text" name="addressMap['one'].block"><br/>
        地址Map[two]省份：<input type="text" name="addressMap['two'].province"><br/>
        地址Map[two]街道：<input type="text" name="addressMap['two'].block"><br/>
        <input type="submit" value="提交"><br/>
    </form>


    <a href="requestParamMapping/getServletAPI">演示获取Servlet对象</a>
</body>
</html>
