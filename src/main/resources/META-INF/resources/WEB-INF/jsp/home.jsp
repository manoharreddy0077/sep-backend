<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Student Portal</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        /* Custom CSS */
        .navbar-dark .navbar-brand {
            color: #fff;
        }

        .navbar-dark .navbar-nav .nav-link {
            color: rgba(255,255,255,.5);
        }

        .navbar-dark .navbar-nav .nav-link:hover,
        .navbar-dark .navbar-nav .nav-link:focus {
            color: #fff;
        }

        .list-group-item {
            border-radius: 0;
        }

        .list-group-item:not(:hover) {
            background-color: initial;
            border-color: initial;
        }

        .list-group-item.active {
            background-color: #343a40;
            border-color: #343a40;
        }

        .list-group-item:hover {
            background-color: #007bff;
            color: #fff;
        }
    </style>
</head>
<body>
    <!-- Navigation bar -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#">Student Portal</a>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <!-- Add more navigation links if needed -->
            </ul>
            <ul class="navbar-nav ml-auto">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                        <img src="user_profile_icon.png" alt="User Profile" width="30" height="30" class="rounded-circle">
                    </a>
                    <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                        <a class="dropdown-item" href="/viewProfile">View Profile</a>
                        <a class="dropdown-item" href="/updateProfile">Update Profile</a>
                    </div>
                </li>
            </ul>
        </div>
    </nav>

    <!-- Main content -->
    <div class="container mt-4">
        <div class="row">
            <!-- Side navigation -->
            <div class="col-md-3">
                <div class="list-group">
                    <a href="courses" class="list-group-item list-group-item-action">Courses</a>
                    <a href="assignments" class="list-group-item list-group-item-action">Assignments</a>
                    <a href="resources" class="list-group-item list-group-item-action">Resources</a>
                    <a href="grades" class="list-group-item list-group-item-action">Grades</a>
                    <a href="calendar" class="list-group-item list-group-item-action">Calendar</a>
                </div>
            </div>
            <!-- Main content area -->
            <div class="col-md-9">
                <!-- Content will be dynamically loaded here -->
            </div>
        </div>
    </div>

    <!-- Bootstrap and jQuery JS files -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>