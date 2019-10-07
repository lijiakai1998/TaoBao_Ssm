<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/9/9
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>详情页面</title>
</head>
<body>
<center>
    <table border="0">
        <caption>详情信息</caption>
        <tr>
            <th>商品照片</th>
            <th colspan="2">商品价格</th>
            <th colspan="2">商家名称</th>
            <th colspan="2">浏览数量</th>
        </tr>
            <tr>
                <td colspan="2"><img src="${goods.gImage}" style="width: 160px;height: 98px;"></td>
                <td colspan="2">${goods.gPrice}</td>
                <td colspan="2">${goods.gStore}</td>
                <td colspan="3">${goods.gPageView}次</td>
                <td colspan="3"><a href="/shoppingCart/addShoppingCart?id=${goods.gId}">添加购物车</a></td>
            </tr>
    </table>
    <div style="margin-top: 15px;">
        <a href="${pageContext.request.contextPath}/goods/showAllGoods">返回商品信息列表</a>
    </div>
    <div style="margin-top: 25px">
        <a href="/shoppingCart/showAllShoppingGoods">查看购物车</a>
    </div>

</center>

</body>
</html>
