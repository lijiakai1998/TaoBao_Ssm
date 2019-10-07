<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/9/9
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品上传</title>
</head>
<body bgcolor="#ffebcd">
<center>
    <form action="/goods/addGoods" method="post" enctype="multipart/form-data">
        <table border="0">
        <caption>商品添加</caption>
            <tr><td>商品名称:</td><td><input type="text" name="gName" placeholder="必填项"/></td></tr>
            <tr><td>商品价格:</td><td><input type="text" name="gPrice" placeholder="必填项"/></td></tr>
            <tr><td>商家名称:</td><td><input type="text" name="gStore" placeholder="必填项"/></td></tr>
            <tr><td>浏览次数:</td><td><input type="text" name="gPageView" placeholder="必填项"/></td></tr>
            <tr><td>商品照片:</td><td><input type="file" name="gImage" placeholder="必填项"></td></tr>
            <tr><td><input type="submit" value="添加"/></td>
                <td><input type="reset" value="重置"/></td></tr>
        </table>
    </form>
    <span>${meg}</span>
    <a href="/goods/showAllGoods">查看所有商品信息</a>
</center>
</body>
</html>
