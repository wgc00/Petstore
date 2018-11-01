<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="margin: auto; border: black solid 1px; width: 980px">
   <%--<%@include file="nav.jsp"%>--%>
       <div style="width: 18%; height: 100%; float: left;border: red solid 1px">
           <ul>
               <li><a href="/user/query">用户管理</a></li>
               <li><a href="/petstore/query">商店管理</a></li>
               <li><a href="/pet/query">宠物管理</a></li>
           </ul>
       </div>

       <div style="width: 80%; height: 100%; border: blue solid 2px;float: right">
        <form:form action="/user/insert" method="post">
            <table align="center">

            </table>
        </form:form>
        <p>
        <table align="center">
            <tr>
                <td>名字</td>
                <td>状态</td>
                <td>标签</td>
                <td>类型</td>
                <td>数量</td>
                <td>日期</td>
                <td>价格</td>
                <td>操作</td>
                <td>操作</td>
            </tr>

            <c:forEach items="${order}" var="o">
            <tr>
                <td>${o.petName}</td>
                <td>${o.petStatus}</td>
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>
                <td>${}</td>
                <td><a href="">删除</a></td>
                <td><a href="">修改</a></td>
            </tr>
            </c:forEach>

        </p>

        </table>
    </div>
    <div style="clear: both"></div>
</div>
</body>
</html>
