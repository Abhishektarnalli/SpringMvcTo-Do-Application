<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false"%>
     <%@ page import="java.util.*,com.ty.Task" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="header">Task List</div>
<%
List<Task> t = (List<Task>) request.getAttribute("task");

for(Task t1 : t){
%>
<h1>Title : <%= t1.getTitle() %></h1>
<h2>Description : <%= t1.getDesc() %></h2>
<a class ="delete-btn" href="delete?title=<%= t1.getTitle() %>&desc=<%= t1.getDesc() %>">Delete Task</a>

<%
}
%>
</body>
</html>