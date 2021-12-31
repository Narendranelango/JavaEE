<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Hartford Insurance</title>
</head>
<body>
	<form action="CustomerDetails" method="post">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="username" placeholder="User Name"></td>
			</tr>
			<tr>
				<td>Type of Business based Location</td>
				<td><input type="text" name="location" placeholder="Location"></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address"
					placeholder="Enter the Address"></td>
			</tr>
			<tr>
				<td>Business</td>
				<td><input type="text" name="business"
					placeholder="Enter the type of Business"></td>
			</tr>
			<tr>
				<td>Number of Employees</td>
				<td><input type="text" name="noofemp"
					placeholder="Number of Employees"></td>
			</tr>
			<tr>
				<td>Submit</td>
				<td><input type="submit" value="Click to Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>