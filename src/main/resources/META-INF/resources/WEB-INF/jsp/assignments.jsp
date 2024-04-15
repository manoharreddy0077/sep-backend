<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Assignments</title>
    <!-- Add your CSS stylesheets if needed -->
</head>
<body>
    <h1>Assignments</h1>

    <!-- Display Pending Assignments -->
    <h2>Pending Assignments</h2>
    <c:forEach var="assignment" items="${pendingAssignments}">
        <div>
            <h3>${assignment.title}</h3>
            <p>${assignment.description}</p>
            <p>Due Date: ${assignment.dueDate}</p>
            <form action="/submitAssignment" method="post" enctype="multipart/form-data">
                <input type="hidden" name="assignmentId" value="${assignment.assignmentId}">
                <input type="file" name="assignmentFile">
                <input type="submit" value="Submit">
            </form>
        </div>
    </c:forEach>

    <!-- Display Completed Assignments -->
    <h2>Completed Assignments</h2>
    <c:forEach var="assignment" items="${completedAssignments}">
        <div>
            <h3>${assignment.title}</h3>
            <p>${assignment.description}</p>
            <p>Due Date: ${assignment.dueDate}</p>
            <!-- Add more details or actions as needed -->
        </div>
    </c:forEach>

    <!-- Display Upcoming Assignments -->
    <h2>Upcoming Assignments</h2>
    <c:forEach var="assignment" items="${upcomingAssignments}">
        <div>
            <h3>${assignment.title}</h3>
            <p>${assignment.description}</p>
            <p>Due Date: ${assignment.dueDate}</p>
            <!-- Add more details or actions as needed -->
        </div>
    </c:forEach>
</body>
</html>
