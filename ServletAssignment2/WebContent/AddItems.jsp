<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<div class="container">
			<div class="header">Wlecome to Store</div>
			<div class="sidebar"></div>
			<div class="content">
				<form action="AddItemsToCart">
					<table>
						<tr>
							<td>Item</td>
							<td colspan="2"><select name="cart">
									<option value="pen drive" selected>Pen Drive</option>
									<option value="laptop">Laptop</option>
									<option value="cd rom">CD-ROM</option>
									<option value="sd card">SD card</option>
							</select></td>
						</tr>
						<tr>
							<td>Quantity</td>
							<td><input type="number" name="quantity" required="required"></td>
							<td><input type="submit" name="action" value="ADD"></td>
						</tr>
					</table>
				</form>
				<form action="AddItemsToCart">
					<table></table>
					<tr>
						<td><input type="submit" name="action" value="CONFIRM"></td>
					</tr>
					</table>
				</form>
	</center>

	<div class="footer"></div>

</body>
</html>