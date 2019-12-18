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
</head>

<body>
   <form action="fileUpload" method="post" enctype="multipart/form-data">
       请选择文件:<input type="file" name="file"/><br/>
       <input type="submit" value="上传">
   </form>



</body>
</html>
