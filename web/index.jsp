<%--
  Created by IntelliJ IDEA.
  User: Jame Moriarty
  Date: 10/19/2018
  Time: 7:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<style type="text/css">
  .login {
    height:280px; width:330px;
    margin:0;
    padding:10px;
    border:2px #CCC solid;
  }
  .login input {
    padding:5px; margin:5px
  }
</style>
<body>
<form method="post" action="/calculator">
  <div class="calculator">
    <h2>Banking deposit interest</h2>
    <b>Amount: </b>
    <input type="text" name="Amount" size="30"  placeholder="amount" /><br>
    <b>Rate: </b>
    <input type="text" name="Rate" size="30"  placeholder="rate" /><br>
    <b>Month:</b>
    <input type="text" name="Month" size="30"  placeholder="month" /><br>
    <input type="submit" value="Calculator"/>
  </div>
</form>
</body>
</html>
