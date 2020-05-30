
<%@ page import="java.util.List" %>
<%@ page import="org.mybatis.class09.model.StudentHomework" %>


<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2020/4/4
  Time: 11:18
  To change this template use File | Settings | File Templates.
  老师查看作业展示
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>作业查看</title>

</head>

<body>


<h1 align="center">作业展示</h1>
<table align="center" width = "960" border="1"
       bgcolor="white" cellpadding="1" cellspacing="1">
    <tr align="center" bgcolor="#7fffd4" height = "50">

        <td>作业编号</td>
        <td>学生学号</td>
        <td>作业标题</td>
        <td>作业内容</td>
        <td>创建时间</td>
    </tr>
    <%
        List<StudentHomework> list = (List<StudentHomework>) request.getSession().getAttribute("homeworklist");

        if(null == list || list.size() <= 0){
            System.out.println("None data.");
        }
        else{
            for(StudentHomework sh : list){

    %>
    <tr align="center" bgcolor="white" height = "30">

        <td><%=sh.getHomework_id()%></td>
        <td><%=sh.getStudent_id()%></td>
        <td><%=sh.getHomework_title()%></td>
        <td><%=sh.getHomework_content()%></td>
        <td><%=sh.getCreate_time()%></td>
    </tr>
    <%
            }
        }
    %>
</table>

</body>
</html>
