<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/11/27
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#btn").click(function () {
                $.ajax({
                    type:"post",
                    url:"${pageContext.request.contextPath}/result/JsonResult",
                    contentType:"application/json;charset=utf-8",
                    data:'{"username":"baobao","age":18}',
                    dataType:"json",  //返回值期望的类型
                    success:function (data) {
                        alert(data);
                        alert(data.username);
                        alert(data.age);
                    }
                })
            })
        })
    </script>
</head>

<body>
    <a href="result/modelAndView">演示modelAndView</a> <br/>
    <a href="result/forward">演示forward</a> <br/>
    <a href="result/redirect">演示redirect</a> <br/>

    <button id="btn">测试ajax发送json数据</button><br/>
</body>
</html>
