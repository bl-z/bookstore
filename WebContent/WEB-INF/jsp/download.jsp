<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
  <head>
    <base href="<%=basePath%>">
    <title>下载</title>
  </head>
  <body>
  
  		<a href="download/IO流.docx">IO流.docx</a><br>
  		<a href="download?filename=IO流.docx">IO流.docx</a>
  
  </body>
</html>
