CREATE DATABASE sepb;
USE sepb;

-- User Table
CREATE TABLE user (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(50)
);

-- Course Table
CREATE TABLE course (
    course_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    instructor VARCHAR(100)
);

-- Assignment Table
CREATE TABLE assignment (
    assignment_id INT AUTO_INCREMENT PRIMARY KEY,
    course_id INT,
    title VARCHAR(100),
    description TEXT,
    due_date DATE,
    user_id VARCHAR(50),  -- Assuming username as foreign key
    pdf_content BLOB, -- Store PDF content as BLOB
    FOREIGN KEY (course_id) REFERENCES course(course_id),
    FOREIGN KEY (user_id) REFERENCES user(username)
);
ALTER TABLE assignment MODIFY pdf_content LONGBLOB;
-- Resource Table
CREATE TABLE resource (
    resource_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    content BLOB -- Store PDF content as BLOB
);
ALTER TABLE resource MODIFY content LONGBLOB;

-- SubResource Table
CREATE TABLE sub_resource (
    sub_resource_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    content BLOB -- Store sub-resource content as BLOB
);

ALTER TABLE sub_resource MODIFY content LONGBLOB;
-- Profile Table
CREATE TABLE profile (
    user_id VARCHAR(50) PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    phone_no VARCHAR(20),
    age INT,
    FOREIGN KEY (user_id) REFERENCES user(username)
);

-- Altering the data type of the PhoneNo column to VARCHAR in the Profile table
ALTER TABLE profile
MODIFY phone_no VARCHAR(15); -- Adjust the length according to your requirements

-- Event Table
CREATE TABLE event (
    event_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    start_time DATETIME,
    end_time DATETIME,
    description TEXT
);

-- Feedback Table
CREATE TABLE feedback (
    feedback_id INT AUTO_INCREMENT PRIMARY KEY,
    user_id VARCHAR(50),  -- Assuming username as foreign key
    message TEXT,
    FOREIGN KEY (user_id) REFERENCES user(username)
);

-- Calendar Table
CREATE TABLE calendar (
    calendar_id INT AUTO_INCREMENT PRIMARY KEY,
    event_id INT,
    FOREIGN KEY (event_id) REFERENCES event(event_id)
);

-- Grade Table
CREATE TABLE grade (
    grade_id INT AUTO_INCREMENT PRIMARY KEY,
    course_id INT,
    user_id VARCHAR(50),  -- Assuming username as foreign key
    grade VARCHAR(10),
    FOREIGN KEY (course_id) REFERENCES course(course_id),
    FOREIGN KEY (user_id) REFERENCES user(username)
);

INSERT INTO user (username, password) VALUES
('john_doe', 'password123'),
('jane_smith', 'abc123'),
('bob_jackson', 'pass456'),
('emily_davis', 'secure789'),
('michael_wilson', '12345678');

INSERT INTO course (name, instructor) VALUES
('Mathematics', 'Prof. Smith'),
('History', 'Dr. Johnson'),
('Computer Science', 'Prof. Brown'),
('Literature', 'Dr. Martinez'),
('Physics', 'Prof. White');

INSERT INTO profile (user_id, name, email, phone_no, age) VALUES
('john_doe', 'John Doe', 'john@example.com', '1234567890', 35),
('jane_smith', 'Jane Smith', 'jane@example.com', '9876543210', 28),
('bob_jackson', 'Bob Jackson', 'bob@example.com', '5555555555', 42),
('emily_davis', 'Emily Davis', 'emily@example.com', '1111111111', 30),
('michael_wilson', 'Michael Wilson', 'michael@example.com', '9999999999', 25);

-- Inserting random values into the event table
INSERT INTO event (title, start_time, end_time, description) VALUES
('Event 1', '2024-04-10 09:00:00', '2024-04-10 12:00:00', 'An informative session on emerging technologies in the industry.'),
('Event 2', '2024-04-15 10:00:00', '2024-04-15 13:00:00', 'Panel discussion on environmental sustainability and its impact on the economy.'),
('Event 3', '2024-04-20 11:00:00', '2024-04-20 14:00:00', 'Workshop on effective communication strategies for remote teams.'),
('Event 4', '2024-04-25 12:00:00', '2024-04-25 15:00:00', 'Seminar on personal finance management and investment planning.'),
('Event 5', '2024-04-30 13:00:00', '2024-04-30 16:00:00', 'Networking event for entrepreneurs and startup enthusiasts.');

-- Inserting random values into the feedback table
INSERT INTO feedback (user_id, message) VALUES
('john_doe', 'Great job on the assignment! I really enjoyed it.'),
('jane_smith', 'The course material is very informative. Thank you!'),
('bob_jackson', 'I have a suggestion for improving the user interface.'),
('emily_davis', 'The event was well-organized and insightful.'),
('michael_wilson', 'I appreciate the quick response from the support team.');

INSERT INTO grade (course_id, user_id, grade) VALUES
(1, 'john_doe', 'A'),
(2, 'jane_smith', 'B'),
(3, 'bob_jackson', 'C'),
(4, 'emily_davis', 'B+'),
(5, 'michael_wilson', 'A-');

-- Inserting random values into the calendar table
INSERT INTO calendar (event_id) VALUES
(1),
(2),
(3),
(4),
(5);


-- Altering the data type of the phone_no column to VARCHAR in the Profile table
