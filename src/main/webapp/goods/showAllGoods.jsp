<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/9/9
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%--<script src="${pageContext.request.contextPath}/jQuery/jquery-1.12.3.js"></script>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <%--<script type="text/javascript">--%>
        <%--function getNum(i) {--%>
            <%--console.log(i);--%>
            <%--$.ajax({--%>

                    <%--url:"${pageContext.request.contextPath}/goods/selectOneBygId?gId="+i,--%>
                    <%--type:"POST",--%>
                    <%--success:function (n) {--%>
                        <%--window.location.href="${pageContext.request.contextPath}/goods/dianJi"--%>
                    <%--}--%>
            <%--})--%>

        <%--}--%>
    <%--</script>--%>
    <style>
        th{
            text-align: center;
        }
        tr{
            text-align: center;
        }
        td{
            text-align: center;
        }
    </style>
    <title>商品展示</title>
</head>
<body bgcolor="#ffebcd">
<center>
    <table border="1" cellpadding="3" cellspacing="0">
        <caption>商品详情</caption>
        <tr><th>商品编号</th>
            <th>商品名称</th>
        <th>实图</th>
        <th>操作</th>
        </tr>
        <c:forEach items="${list}" var="goods">
            <tr>
                <td>${goods.gId}</td>
                <td>${goods.gName}</td>
                <td><a title="点击进入详情界面" href="/goods/selectOneBygId?gId=${goods.gId}">
                    <img src="${goods.gImage}" style="width:160px;height: 98px;" />
                    </a></td>
                <td><a href="/goods/showOneGoodsById?gId=${goods.gId}">修改</a> &nbsp;|&nbsp;<a href="/goods/delGoods?gId=${goods.gId}">删除</a></td>
            </tr>
        </c:forEach>
    </table>
</center>
</body>

</html>
