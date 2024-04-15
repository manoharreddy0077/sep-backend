<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Grades</title>
    <!-- Include any necessary CSS files -->
</head>
<body>
    <h1>Grades</h1>
    <!-- Display grades here -->
    <table>
        <thead>
            <tr>
                <th>Course</th>
                <th>Grade</th>
            </tr>
        </thead>
        <tbody>
            <!-- Loop through grades and display them -->
            <% for (Grade grade : grades) { %>
                <tr>
                    <td><%= grade.getCourseName() %></td>
                    <td><%= grade.getGrade() %></td>
                </tr>
            <% } %>
        </tbody>
    </table>

    <!-- Add form to upload grades if needed -->

    <!-- Include any necessary JavaScript files -->
</body>
</html>
