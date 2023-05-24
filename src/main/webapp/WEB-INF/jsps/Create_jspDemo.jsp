<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create</title>
</head>
<body>

<h2>create lead Demo</h2>
<form action="saveLeadDemo" action="post">
<pre>
    First name<input type="text"  name="firstName"/>
    Last name<input type="text"  name="lastName"/>
    email<input type="text"  name="email"/>
    mobile<input type="text"  name="mobile"/>
<input type="submit"  value="save"/>
</pre>
</form>
${msg}

</body>
</html>