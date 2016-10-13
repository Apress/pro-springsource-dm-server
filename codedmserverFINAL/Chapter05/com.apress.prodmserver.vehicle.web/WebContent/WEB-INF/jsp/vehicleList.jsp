<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<title>Vehicle List</title>
</head>

<body>
<table border="1">
  <tr>
    <th>Vehicle No</th>
    <th>Color</th>
    <th>Wheel</th>
    <th>Seat</th>
  </tr>
  <c:forEach items="${vehicles}" var="vehicle">
  <tr>
    <td>${vehicle.vehicleNo}</td>
    <td>${vehicle.color}</td>
    <td>${vehicle.wheel}</td>
    <td>${vehicle.seat}</td>
  </tr>
  </c:forEach>
</table>
<a href="vehicleRegister.htm">Register</a>
</body>
</html>