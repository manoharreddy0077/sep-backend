<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Profile</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <!-- Add any custom styles if needed -->
</head>
<body>
    <div class="container mt-4">
        <h2>Profile Information</h2>
        <table class="table table-striped">
            <tbody>
                <tr>
                    <th>Username:</th>
                    <td>${user.username}</td>
                </tr>
                <tr>
                    <th>Name:</th>
                    <td>${user.name}</td>
                </tr>
                <tr>
                    <th>Email:</th>
                    <td>${user.email}</td>
                </tr>
                <tr>
                    <th>Phone Number:</th>
                    <td>${user.phoneNo}</td>
                </tr>
                <tr>
                    <th>Age:</th>
                    <td>${user.age}</td>
                </tr>
            </tbody>
        </table>
    </div>
</body>
</html>
