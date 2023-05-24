<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
</head>
<body>

<h2>Update lead Demo</h2>
<form action="UpdateDemo" method="post">
<pre>
    <input type="hidden" value="${update.id}"/>
    First name<input type="text"  name="firstName" value="${update.firstName}"/>
    Last name<input type="text"  name="lastName" value="${update.lastName}"/>
    email<input type="text"  name="email" value="${update.email}"/>
    mobile<input type="text"  name="mobile" value="${update.mobile}"/>
    <input type="submit"  value="update"/>
</pre>
</form>
${msg}

</body>
</html>