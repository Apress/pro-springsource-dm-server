<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<title>Vehicle Register</title>
<style>
.errors {
  color: #ff0000;
  font-weight: bold;
}
</style>
</head>

<body>
<form:form modelAttribute="vehicle">
<table>
  <tr>
    <td>Vehicle No</td>
    <td>
      <form:input path="vehicleNo" />
      <form:errors path="vehicleNo" cssClass="errors" />
    </td>
  </tr>
  <tr>
    <td>Color</td>
    <td>
      <form:input path="color" />
      <form:errors path="color" cssClass="errors" />
    </td>
  </tr>
  <tr>
    <td>Wheel</td>
    <td>
      <form:input path="wheel" />
      <form:errors path="wheel" cssClass="errors" />
    </td>
  </tr>
  <tr>
    <td>Seat</td>
    <td>
      <form:input path="seat" />
      <form:errors path="seat" cssClass="errors" />
    </td>
  </tr>
  <tr>
    <td colspan="2">
      <input type="submit" value="Register" />
    </td>
  </tr>
</table>
</form:form>
</body>
</html>
