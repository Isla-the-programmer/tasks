<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@ page pageEncoding="UTF-8"%>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Магаз</title>
</head>
<body>
<button onclick="location.href='/profile'">Профиль</button>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Название услуги</th>
        <th>Описание</th>
        <th>Цена</th>
        <th>Ед</th>
        <th>Действие</th>
    </tr>
    <tr>
        <th>1</th>
        <th>Баннер</th>
        <th>Ватман раскрасим гигантский</th>
        <th>1000</th>
        <th>тг./месяц</th>
        <th><form method= 'post'><button type="submit" name="id" value = 1 >Заказать</button></form></th>
    </tr>
    <tr>
        <th>2</th>
        <th>Call-центр</th>
        <th>10 таджиков на звонки отвечать будут</th>
        <th>50</th>
        <th>тг./звонок</th>
        <th><form method= 'post'><button type = "submit" name="id" value=2>Заказать</button></form></th>
    </tr>
    <tr>
        <th>3</th>
        <th>DSS Retail</th>
        <th>????</th>
        <th>бесплатно</th>
        <th></th>
        <th><form method = 'post'><button type = "submit" name="id" value=3>Заказать</button></form></th>
    </tr>
    <tr>
        <th>4</th>
        <th>Kompra</th>
        <th>????</th>
        <th>500</th>
        <th>тг./шт</th>
        <th><form method = 'post'><button type = "submit" name="id" value=4>Заказать</button></form></th>
    </tr>
</table>
</body>
</html>