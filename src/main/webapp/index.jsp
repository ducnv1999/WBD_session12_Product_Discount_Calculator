<%--
  Created by IntelliJ IDEA.
  User: anhduc
  Date: 16/04/2019
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>

<style type="text/css">
    .calculate {
        height: 200px;
        width: 400px;
        margin: 0;
        padding: 10px;
        border: 2px #000fff solid;
    }

    .calculate input {
        padding: 1px;
        margin: 1px;
    }
</style>
<body>
<form method="post" action="/calculator">
    <div class="calculate">
        <h1>Product Discount Calculator</h1>
        <table>
          <tr>
              <td>Product Description:</td>
              <td>
                  <input type="text" size="20" name="ProductDescription" placeholder="Description"/>
              </td>
          </tr>
            <tr>
                <td>List Price:</td>
                <td>
                    <input type="text" size="20" name="ListPrice" placeholder="Price"/>
                </td>
            </tr>
            <tr>
                <td> Discount Percent:</td>
                <td>
                    <input type="text" size="20" name="DiscountPercent" placeholder="DiscountPercent"/> (%)

                </td>
            </tr>
            <tr>
                <td><input type="submit" value="Calculate Discount"/></td>
            </tr>
        </table>

    </div>
</form>
</body>
</html>
