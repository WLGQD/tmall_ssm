<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="../include/admin/adminHeader.jsp"%>
<%@include file="../include/admin/adminNavigator.jsp"%>

<script>
    $(function(){

        $("#addForm").submit(function(){
            if(!checkEmpty("name","分类名称"))
                return false;
            if(!checkEmpty("categoryPic","分类图片"))
                return false;
            return true;
        });
    });

</script>

<title>属性管理</title>

<div>
    <table>
        <thead>
            <tr>
                <th>DI</th>
                <th>属性名称</th>
                <th>编辑</th>
                <th>删除</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${ps}" var="p">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.name}</td>
                    <td><a href="/admin_property_edit?id=${p.id}"><span
                            class="glyphicon glyphicon-edit"></span></a></td>
                    <td><a deletLike="true" href="/admin_property_delete?id=${p.id}"><span
                            class="     glyphicon glyphicon-trash"></span></a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
<div class="pageDiv">
    <%@ include file="../include/admin/adminPage.jsp"%>
</div>

<div class="panel panel-warning addDiv">
    <div class="panel-heading">新增属性</div>
    <div class="panel-body">
        <form method="post" id="addForm" action="/admin_property_add">
            <table>
                <tr>
                    <td>属性名称</td>
                    <td><input id="name" name="name" type="text"></td>
                </tr>
                <tr class="submitTR">
                    <td colspan="2" align="center">
                        <input type="hidden" name="cid" value="${c.id}">
                        <button type="submit" class="btn btn-success">提 交</button>
                    </td>
                </tr>
            </table>
        </form>
    </div>
</div>

<%@include file="../include/admin/adminFooter.jsp"%>