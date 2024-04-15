<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Courses</title>
    <!-- Include Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-4">
        <h2>Courses</h2>
        <table class="table">
            <thead>
                <tr>
                    <th>Course Name</th>
                    <th>Status</th>
                    <th>Credits</th>
                    <th>Teacher</th>
                </tr>
            </thead>
            <tbody>
                <!-- Replace the dummy data with dynamic data from the server -->
                <tr>
                    <td>Course 1</td>
                    <td>Enrolled</td>
                    <td>3</td>
                    <td>Teacher A</td>
                </tr>
                <tr>
                    <td>Course 2</td>
                    <td>Not Enrolled</td>
                    <td>4</td>
                    <td>Teacher B</td>
                </tr>
                <!-- Add more rows as needed -->
            </tbody>
        </table>
    </div>
    <!-- Include Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
