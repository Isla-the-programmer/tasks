<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page pageEncoding="UTF-8"%>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>магаз</title>
</head>
<body>
<h2>Иванов И.&nbsp &nbsp баланс: <%
int balance = (Integer) request.getAttribute("balance");
out.println(balance);
%> тг.</h2>
<%
List<Integer> ids = (List<Integer>) request.getAttribute("ids");
List<Integer> prices = (List<Integer>) request.getAttribute("prices");
List<String> des = (List<String>) request.getAttribute("des");
%>
<table border="1">
    <%
    for(int i =0;i<ids.size();i++){
        String index  = Integer.toString(i);
        out.println("<tr>" + "<th>" + des.get(i) + "</th>" + "<th>" + Integer.toString(ids.get(i)) + "</th>" + "<th>" + Integer.toString(prices.get(i)) + "</th>" +
        "<th><form method = 'post'><button type = 'submit' name='ind' value=" + index + ">Убрать</button></form></th>" +"</tr>");
    }
    int sum = 0;
    for(int i:prices){
        sum+=i;
    }
    out.println("<tr>"+"<th>" + "</th>" +  "<th>" + "Всего: " + "</th>"+"<th>"+Integer.toString(sum) + "</th>" + "<th>тенге</th>" + "</tr>");
    %>
</table>
<button onclick="location.href='/'">Назад</button>
</body>
</html>