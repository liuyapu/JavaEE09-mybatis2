
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
        <td>作业分数</td>
        <td>分数批改</td>
    </tr>
    <%
        List<StudentHomework> list = (List<StudentHomework>) request.getSession().getAttribute("homeworklist");

        if(null == list || list.size() <= 0){
            System.out.println("None data.");
        }
        else{
            for(StudentHomework sh : list){

    %>
    <form method="post" action="/submit/review">
        <tr align="center" bgcolor="white" height = "30">

            <td><input name="homeworkid" value="<%=sh.getHomework_id()%>" readonly="readonly"></td>
            <td><input name="studentid" value="<%=sh.getStudent_id()%>" readonly="readonly"></td>
            <td><input name="homeworktitle" value="<%=sh.getHomework_title()%>" readonly="readonly"></td>
            <td><input name="homeworkcontent" value="<%=sh.getHomework_content()%>" readonly="readonly"></td>
            <td><input name="create_time" value="<%=sh.getCreate_time()%>" readonly="readonly"></td>
            <td><input name="score" type="number" min="0" max="100" value="<%=sh.getScore()%>"></td>
            <td><input name="submit" type="submit" value="提交分数" /></td>
        </tr>
    </form>
    <%
            }
        }
    %>
</table>

</body>
</html>
