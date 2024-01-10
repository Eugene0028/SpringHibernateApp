<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>


<body>

<h2>Dear Employee, you are welcome!!!</h2>
<br>
<br>
Your name: ${employee.name}

<br>
<br>
Your surname: ${employee.surname}
<br>
<br>
Your salary: ${employee.salary}
<br>
<br>
Your Department: ${employee.department}
<br>
<br>
Your Company: ${employee.company}
<br>
<br>
Your languages:${employee.language}
<ul>
    <c:forEach var = "a" items="${employee.languages}">
        <li>${a}</li>
    </c:forEach>
</ul>
<br>
<br>
Your phone number:${employee.phoneNumber}
<br>
<br>
Your email:${employee.email}
</body>
</html>
