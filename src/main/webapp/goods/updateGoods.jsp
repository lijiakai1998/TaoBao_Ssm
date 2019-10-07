<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/9/9
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>商品信息修改</title>
</head>
<body bgcolor="#f5f5dc">
<center>
    <form action="/goods/updateGoods" method="post" enctype="multipart/form-data">
        <table border="0">
            <caption>商品修改</caption>
            <tr><td>商品名称:</td><td><input type="text" name="gName" value="${good.gName}"/></td></tr>
            <tr><td>商品价格:</td><td><input type="text" name="gPrice" value="${good.gPrice}"/></td></tr>
            <tr><td>商家名称:</td><td><input type="text" name="gStore" value="${good.gStore}"/></td></tr>
            <tr><td>浏览次数:</td><td><input type="text" name="gPageView" value="${good.gPageView}"/></td></tr>
            <tr><td>商品照片:</td><td><input type="file" name="gImage"></td></tr>
            <tr><td><input type="submit" value="修改"/></td>
                <td><input type="reset" value="重置"/></td></tr>
        </table>
    </form>
    <span>${meg1}</span>
</center>
</body>
</html>
