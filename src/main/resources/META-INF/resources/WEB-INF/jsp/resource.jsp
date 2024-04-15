<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resources</title>
</head>
<body>
    <h1>Resources</h1>
    <ul>
        <!-- Iterate over the list of resources -->
        <c:forEach items="${resources}" var="resource">
            <li>
                <h2>${resource.title}</h2>
                <!-- Display link to view/download the sub-resource -->
                <a href="/viewResource?id=${resource.content.id}">${resource.content.fileName}</a>
            </li>
        </c:forEach>
    </ul>
</body>
</html>
