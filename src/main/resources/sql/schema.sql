CREATE DATABASE sepb_final;
USE sepb_final;

-- User Table
CREATE TABLE user (
    
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(50)
);



-- Inserting the username and password into the user table
INSERT INTO user (username, password) VALUES ('PES1UG21CS503', '503@Manohar');


-- Course Table
CREATE TABLE course (
    course_id INT AUTO_INCREMENT PRIMARY KEY,
    course_name VARCHAR(100),
    instructor_name VARCHAR(100)
);

INSERT INTO course (course_id, course_name, instructor_name) VALUES
(1, 'Cloud Computing', 'PH'),
(2, 'OOAD', 'PB'),
(3, 'Compiler Design', 'PCO'),
(4, 'AIRW', 'NKS'),
(5, 'Database Tech', 'VJ');

CREATE TABLE assignment (
    assignment_id INT AUTO_INCREMENT PRIMARY KEY,
    course_id INT,
    title VARCHAR(100),
    description TEXT,
    due_date DATE,
    pdf_content BLOB, -- Store PDF content as BLOB
    FOREIGN KEY (course_id) REFERENCES course(course_id)
);
INSERT INTO assignment (course_id, title, description, due_date) VALUES
(1, 'Networking Lab', 'Amazon cloud service computing with networking lab ', '2024-04-30'),
(2, 'Lab week 5', 'design patterns lab GRASP and SOLID etc etc', '2024-04-27'),
(3, 'Compiler Design Assignment 1', 'Implement lexical analyzer', '2024-05-05'),
(4, 'AIRW Assignment 1', 'Research paper on AI applications in robotics', '2024-05-10'),
(5, 'Database Tech Assignment 1', 'Create ER diagram for given scenario', '2024-05-15');

-- Inserting additional assignments for the course "Networking Lab"
INSERT INTO assignment (course_id, title, description, due_date) VALUES
(1, 'Networking Lab - Assignment 2', 'Implement TCP/IP protocol stack', '2024-05-15'),
(1, 'Networking Lab - Assignment 3', 'Configure VLANs and implement inter-VLAN routing', '2024-05-30');

-- Inserting additional assignments for the course "Lab week 5"
INSERT INTO assignment (course_id, title, description, due_date) VALUES
(2, 'Lab week 5 - Assignment 2', 'Implement Factory Method pattern in Java', '2024-05-10'),
(2, 'Lab week 5 - Assignment 3', 'Design and implement Observer pattern in a GUI application', '2024-05-20');

ALTER TABLE assignment MODIFY pdf_content LONGBLOB;

CREATE TABLE resource (
    resource_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    content BLOB -- Store PDF content as BLOB
);
ALTER TABLE resource MODIFY content LONGBLOB;
INSERT INTO resource (title) VALUES
('Cloud Computing'),
('OOAD'),
('Compiler Design'),
('AIRW'),
('Database Tech');

CREATE TABLE sub_resource (
    sub_resource_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    content LONGBLOB, -- Store sub-resource content as BLOB
    resource_id INT,
    FOREIGN KEY (resource_id) REFERENCES resource(resource_id)
);

ALTER TABLE sub_resource MODIFY content LONGBLOB;

-- For Cloud Computing (Resource ID: 1)
INSERT INTO sub_resource (title, resource_id) VALUES
('Unit 1', 1),
('Unit 2', 1),
('Unit 3', 1),
('Unit 4', 1);

-- For OOAD (Resource ID: 2)
INSERT INTO sub_resource (title, resource_id) VALUES
('Unit 1', 2),
('Unit 2', 2),
('Unit 3', 2),
('Unit 4', 2);

-- For Compiler Design (Resource ID: 3)
INSERT INTO sub_resource (title, resource_id) VALUES
('Unit 1', 3),
('Unit 2', 3),
('Unit 3', 3),
('Unit 4', 3);

-- For AIRW (Resource ID: 4)
INSERT INTO sub_resource (title, resource_id) VALUES
('Unit 1', 4),
('Unit 2', 4),
('Unit 3', 4),
('Unit 4', 4);

-- For Database Tech (Resource ID: 5)
INSERT INTO sub_resource (title, resource_id) VALUES
('Unit 1', 5),
('Unit 2', 5),
('Unit 3', 5),
('Unit 4', 5);

CREATE TABLE profile (
    username VARCHAR(50),
    name VARCHAR(100),
    email VARCHAR(100),
    phone_no VARCHAR(20),
    age INT,
    gender VARCHAR(10), -- Added gender field
    PRIMARY KEY (username),
    FOREIGN KEY (username) REFERENCES user(username)
);

INSERT INTO profile (username, name, email, phone_no, age, gender) 
VALUES ('PES1UG21CS503', 'S Manohar', 'manoharreddy77@gmail.com', '1234567890', 20, 'Male');

CREATE TABLE event (
    event_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(100),
    start_time DATETIME,
    end_time DATETIME,
    description TEXT
);

INSERT INTO event (title, start_time, end_time, description) VALUES
('Conference on Artificial Intelligence', '2024-04-20 09:00:00', '2024-04-21 18:00:00', 'Join us for a two-day conference on the latest advancements in AI technology.'),
('Workshop on Web Development', '2024-05-10 10:00:00', '2024-05-10 16:00:00', 'Learn the fundamentals of web development, including HTML, CSS, and JavaScript.'),
('Networking Event for Entrepreneurs', '2024-05-15 18:00:00', '2024-05-15 20:00:00', 'Connect with fellow entrepreneurs and investors at our networking event.'),
('Seminar on Digital Marketing', '2024-06-01 14:00:00', '2024-06-01 16:00:00', 'Discover the latest trends and strategies in digital marketing at our informative seminar.'),
('Tech Talk: Future of Robotics', '2024-06-15 11:00:00', '2024-06-15 13:00:00', 'Join industry experts as they discuss the future of robotics and automation.'),
('Panel Discussion on Climate Change', '2024-07-01 15:00:00', '2024-07-01 17:00:00', 'Engage in a thought-provoking discussion on the impact of climate change on our planet.'),
('Hackathon for Social Good', '2024-07-20 09:00:00', '2024-07-21 18:00:00', 'Participate in a hackathon to develop innovative solutions for pressing social issues.');


CREATE TABLE feedback (
    feedback_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50),  -- Assuming username as foreign key
    message TEXT,
    FOREIGN KEY (username) REFERENCES user(username)
);

INSERT INTO feedback (username, message) VALUES
('PES1UG21CS503', 'Great job on the assignment! I really enjoyed it.'),
('PES1UG21CS503', 'The course material is very informative. Thank you!'),
('PES1UG21CS503', 'I have a suggestion for improving the user interface.');

CREATE TABLE calendar (
    calendar_id INT AUTO_INCREMENT PRIMARY KEY,
    event_id INT,
    event_date DATE,
    FOREIGN KEY (event_id) REFERENCES event(event_id)
);

INSERT INTO calendar (event_id, event_date)
SELECT event_id, DATE(start_time) AS event_date FROM event;

CREATE TABLE grade (
    grade_id INT AUTO_INCREMENT PRIMARY KEY,
    course_id INT,
    username VARCHAR(50),  -- Foreign key referencing the username column in the user table
    grade VARCHAR(10),
    FOREIGN KEY (course_id) REFERENCES course(course_id),
    FOREIGN KEY (username) REFERENCES user(username)
);
INSERT INTO grade (course_id, username, grade) VALUES
(1, 'PES1UG21CS503', 'B'),
(2, 'PES1UG21CS503', 'B'),
(3, 'PES1UG21CS503', 'A'),
(4, 'PES1UG21CS503', 'B'),
(5, 'PES1UG21CS503', 'A');








