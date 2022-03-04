# MySql
```syntax
CREATE DATABASE studentsInformation;```

```syntax
SHOW DATABASES;```

|---------------------|
| Database            |
|---------------------|
| Name                |
| indexing            |
| information_schema  |
| mysql               |
| normalization       |
| performance_schema  |
| sangeetha           |
| smileyWorldArt      |
| studentDetails      |
| studentsInformation |
| sys                 |
|---------------------|
11 rows in set (0.00 sec)
```syntax
USE studentsInformation;```

CREATE TABLE students (id int PRIMARY KEY AUTO_INCREMENT, name varchar(100) NOT NULL, email varchar(100) NOT NULL, mobile_no bigint NOT NULL, password varchar(100) NOT NULL, gender char(1) NOT NULL, dob date, created_date timestamp NOT NULL DEFAULT current_timestamp, UNIQUE (email), CHECK ( gender in ('M','F')));

```syntax
DESC students;```
+--------------+--------------+------+-----+-------------------+-------------------+
| Field        | Type         | Null | Key | Default           | Extra             |
+--------------+--------------+------+-----+-------------------+-------------------+
| id           | int          | NO   | PRI | NULL              | auto_increment    |
| name         | varchar(100) | NO   |     | NULL              |                   |
| email        | varchar(100) | NO   | UNI | NULL              |                   |
| mobile_no    | bigint       | NO   |     | NULL              |                   |
| password     | varchar(100) | NO   |     | NULL              |                   |
| gender       | char(1)      | NO   |     | NULL              |                   |
| dob          | date         | YES  |     | NULL              |                   |
| created_date | timestamp    | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |
+--------------+--------------+------+-----+-------------------+-------------------+

```syntax
CREATE TABLE student_class (id int PRIMARY KEY AUTO_INCREMENT, student_id int NOT NULL, class int NOT NULL, status varchar(20) NOT NULL, FOREIGN KEY (student_id) REFERENCES students(id), CHECK( class >= 1 and class <=12), CHECK (status in ('ACTIVE','INACTIVE')));
```
```syntax
DESC student_class;```
|------------|-------------|------|-----|---------|----------------|
| Field      | Type        | Null | Key | Default | Extra          |
|------------|-------------|------|-----|---------|----------------|
| id         | int         | NO   | PRI | NULL    | auto_increment |
| student_id | int         | NO   | MUL | NULL    |                |
| class      | int         | NO   |     | NULL    |                |
| status     | varchar(20) | NO   |     | NULL    |                |
|------------|-------------|------|-----|---------|----------------|

### Feature 1: Student Registration

```syntax
INSERT INTO students (name, email, mobile_no,password, gender,dob) VALUES ('Sangeetha', 'sangeetha@gmail.com', 9876543210,'Sangee123','F','2003-09-14');
```
```syntax
INSERT INTO students (name, email, mobile_no,password, gender,dob) VALUES ('Poorani', 'poorani12@gmail.com', 9823443210,'Poorni123','F','2004-02-27');
```
```syntax
INSERT INTO students (name, email, mobile_no,password, gender,dob) VALUES ('Kaushik', 'kaushik12@gmail.com', 9876541230,'Kaushik123','M','2003-07-16');
```
```syntax
INSERT INTO students (name, email, mobile_no,password, gender,dob) VALUES ('Ismail', 'smile@gmail.com', 9876542940,'Smile123','M','2002-02-27');
```

### Feature 2: List All Students
```syntax
SELECT * FROM students;```
|----|-----------|---------------------|------------|------------|--------|------------|---------------------|
| id | name      | email               | mobile_no  | password   | gender | dob        | created_date        |
|----|-----------|---------------------|------------|------------|--------|------------|---------------------|
|  1 | Sangeetha | sangeetha@gmail.com | 9876543210 | Sangee123  | F      | 2003-09-14 | 2022-03-02 12:22:26 |
|  2 | Poorani   | poorani12@gmail.com | 9823443210 | Poorni123  | F      | 2004-02-27 | 2022-03-02 12:24:54 |
|  3 | Kaushik   | kaushik12@gmail.com | 9876541230 | Kaushik123 | M      | 2003-07-16 | 2022-03-02 12:26:21 |
|  4 | Ismail    | smile@gmail.com     | 9876542940 | Smile123   | M      | 2002-02-27 | 2022-03-02 12:34:52 |
|----|-----------|---------------------|------------|------------|--------|------------|---------------------|

```syntax
SELECT name FROM students;```
|-----------|
| name      |
|-----------|
| Sangeetha |
| Poorani   |
| Kaushik   |
| Ismail    |
|-----------|

### Feature 3: Login with email and password
```syntax
SELECT * FROM students WHERE email = 'smile@gmail.com' AND password = 'Smile123';```
|----|--------|-----------------|------------|----------|--------|------------|---------------------|
| id | name   | email           | mobile_no  | password | gender | dob        | created_date        |
|----|--------|-----------------|------------|----------|--------|------------|---------------------|
|  4 | Ismail | smile@gmail.com | 9876542940 | Smile123 | M      | 2002-02-27 | 2022-03-02 12:34:52 |
|----|--------|-----------------|------------|----------|--------|------------|---------------------|

### Feature 4: Update Password
```syntax
UPDATE students SET password = 'Sangee123' WHERE password = 'Sangeetha123';```
```syntax
SELECT * FROM students;```
+----+-----------+---------------------+------------+--------------+--------+------------+---------------------+
| id | name      | email               | mobile_no  | password     | gender | dob        | created_date        |
+----+-----------+---------------------+------------+--------------+--------+------------+---------------------+
|  1 | Sangeetha | sangeetha@gmail.com | 9876543210 | Sangee123    | F      | 2003-09-14 | 2022-03-02 12:22:26 |
|  2 | Poorani   | poorani12@gmail.com | 9823443210 | Poorni123    | F      | 2004-02-27 | 2022-03-02 12:24:54 |
|  3 | Kaushik   | kaushik12@gmail.com | 9876541230 | Kaushik123   | M      | 2003-07-16 | 2022-03-02 12:26:21 |
|  4 | Ismail    | smile@gmail.com     | 9876542940 | Smile123     | M      | 2002-02-27 | 2022-03-02 12:34:52 |
+----+-----------+---------------------+------------+--------------+--------+------------+---------------------+

Feature 5: Enroll Student into Class

INSERT INTO student_class (student_id, class, status) VALUES (1,5,'ACTIVE');
INSERT INTO student_class (student_id, class, status) VALUES (2,3,'INACTIVE');
INSERT INTO student_class (student_id, class, status) VALUES (3,5,'ACTIVE');
INSERT INTO student_class (student_id, class, status) VALUES (4,6,'INACTIVE');

SELECT * FROM student_class;
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  1 |          1 |     5 | ACTIVE   |
|  2 |          2 |     3 | INACTIVE |
|  3 |          3 |     5 | ACTIVE   |
|  4 |          4 |     6 | INACTIVE |
+----+------------+-------+----------+

Feature 6: Find Students who are enrolled in the given class (class 5)
 
SELECT * FROM student_class WHERE class = 5;
+----+------------+-------+--------+
| id | student_id | class | status |
+----+------------+-------+--------+
|  1 |          1 |     5 | ACTIVE |
|  3 |          3 |     5 | ACTIVE |
+----+------------+-------+--------+

Feature 7: Update Student Class information(student from 5th standard to 6th standard)

UPDATE student_class SET class = 6 WHERE student_id = 3;

SELECT * FROM student_class;
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  1 |          1 |     5 | ACTIVE   |
|  2 |          2 |     3 | INACTIVE |
|  3 |          3 |     6 | ACTIVE   |
|  4 |          4 |     6 | INACTIVE |
+----+------------+-------+----------+

Feature 8: Student withdrawn from a Class

DELETE FROM student_class WHERE id = 1;

DELETE FROM students WHERE id = 1;

SELECT * FROM student_class;
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  2 |          2 |     3 | INACTIVE |
|  3 |          3 |     6 | ACTIVE   |
|  4 |          4 |     6 | INACTIVE |
+----+------------+-------+----------+

SELECT * FROM students;
+----+---------+---------------------+------------+------------+--------+------------+---------------------+
| id | name    | email               | mobile_no  | password   | gender | dob        | created_date        |
+----+---------+---------------------+------------+------------+--------+------------+---------------------+
|  2 | Poorani | poorani12@gmail.com | 9823443210 | Poorni123  | F      | 2004-02-27 | 2022-03-02 12:24:54 |
|  3 | Kaushik | kaushik12@gmail.com | 9876541230 | Kaushik123 | M      | 2003-07-16 | 2022-03-02 12:26:21 |
|  4 | Ismail  | smile@gmail.com     | 9876542940 | Smile123   | M      | 2002-02-27 | 2022-03-02 12:34:52 |
+----+---------+---------------------+------------+------------+--------+------------+---------------------+

mysql> INSERT INTO students (id,name, email, mobile_no,password, gender) VALUES (5,'Vaishnavi', 'vaishnavi12@gmail.com', 9823443430,'Vaishu123','F');

mysql> SELECT * FROM students;
+----+-----------+-----------------------+------------+------------+--------+------------+---------------------+
| id | name      | email                 | mobile_no  | password   | gender | dob        | created_date        |
+----+-----------+-----------------------+------------+------------+--------+------------+---------------------+
|  2 | Poorani   | poorani12@gmail.com   | 9823443210 | Poorni123  | F      | 2004-02-27 | 2022-03-02 12:24:54 |
|  3 | Kaushik   | kaushik12@gmail.com   | 9876541230 | Kaushik123 | M      | 2003-07-16 | 2022-03-02 12:26:21 |
|  4 | Ismail    | smile@gmail.com       | 9876542940 | Smile123   | M      | 2002-02-27 | 2022-03-02 12:34:52 |
|  5 | Vaishnavi | vaishnavi12@gmail.com | 9823443430 | Vaishu123  | F      | NULL       | 2022-03-02 13:44:37 |
+----+-----------+-----------------------+------------+------------+--------+------------+---------------------+

Feature 9: Find student details who have not updated their Date Of Birth #

SELECT * FROM students WHERE dob is null;
+----+-----------+-----------------------+------------+-----------+--------+------+---------------------+
| id | name      | email                 | mobile_no  | password  | gender | dob  | created_date        |
+----+-----------+-----------------------+------------+-----------+--------+------+---------------------+
|  5 | Vaishnavi | vaishnavi12@gmail.com | 9823443430 | Vaishu123 | F      | NULL | 2022-03-02 13:44:37 |
+----+-----------+-----------------------+------------+-----------+--------+------+---------------------+

Insert into student_class (id,student_id,class,status) values (5,5,7,'ACTIVE');
Query OK, 1 row affected (0.01 sec)

mysql> SELECT * FROM student_class;
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  2 |          2 |     3 | INACTIVE |
|  3 |          3 |     6 | ACTIVE   |
|  4 |          4 |     6 | INACTIVE |
|  5 |          5 |     7 | ACTIVE   |
+----+------------+-------+----------+

Feature 10: Find Total no of students actively studying in this school

SELECT * FROM student_class WHERE status = 'ACTIVE';
+----+------------+-------+--------+
| id | student_id | class | status |
+----+------------+-------+--------+
|  3 |          3 |     6 | ACTIVE |
|  5 |          5 |     7 | ACTIVE |
+----+------------+-------+--------+

SELECT * FROM students;
+----+-------------+-----------------------+------------+-------------+--------+------------+---------------------+
| id | name        | email                 | mobile_no  | password    | gender | dob        | created_date        |
+----+-------------+-----------------------+------------+-------------+--------+------------+---------------------+
|  2 | Poorani     | poorani12@gmail.com   | 9823443210 | Poorni123   | F      | 2004-02-27 | 2022-03-02 12:24:54 |
|  3 | Kaushik     | kaushik12@gmail.com   | 9876541230 | Kaushik123  | M      | 2003-07-16 | 2022-03-02 12:26:21 |
|  4 | Ismail      | smile@gmail.com       | 9876542940 | Smile123    | M      | 2002-02-27 | 2022-03-02 12:34:52 |
|  5 | Vaishnavi   | vaishnavi12@gmail.com | 9823443430 | Vaishu123   | F      | NULL       | 2022-03-02 13:44:37 |
|  8 | Prasanna    | prasanna@gmail.com    | 9876534340 | Prasanna123 | M      | 2002-02-27 | 2022-03-02 13:54:05 |
|  9 | Vimal       | vimal@gmail.com       | 9876532940 | Vimal123    | M      | 2002-04-27 | 2022-03-02 13:54:41 |
| 10 | Hasan       | hasan@gmail.com       | 9876512940 | Hasan123    | M      | 2002-04-27 | 2022-03-02 13:58:58 |
| 11 | Mahalakshmi | maha@gmail.com        | 9876554940 | Maha123     | F      | 2002-04-27 | 2022-03-02 13:59:35 |
| 12 | Chithraj    | chithu@gmail.com      | 9876559840 | chithu123   | M      | 2002-05-27 | 2022-03-02 14:13:59 |
| 13 | Aswath      | aswath@gmail.com      | 9876554940 | Aswath123   | M      | 2002-05-27 | 2022-03-02 14:15:13 |
+----+-------------+-----------------------+------------+-------------+--------+------------+---------------------+

SELECT * FROM student_class;
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  2 |          2 |     3 | INACTIVE |
|  3 |          3 |     6 | ACTIVE   |
|  4 |          4 |     6 | INACTIVE |
|  5 |          5 |     7 | ACTIVE   |
|  8 |          8 |     7 | ACTIVE   |
|  9 |          9 |     7 | ACTIVE   |
| 10 |         10 |     7 | ACTIVE   |
| 11 |         11 |     7 | ACTIVE   |
| 12 |         12 |    12 | ACTIVE   |
+----+------------+-------+----------+

Feature 11: Find Total no of students actively studying in each class

SELECT COUNT(*),class FROM student_class WHERE status = 'ACTIVE' GROUP BY class HAVING COUNT(status);
+----------+-------+
| COUNT(*) | class |
+----------+-------+
|        1 |     6 |
|        5 |     7 |
|        1 |     5 |
+----------+-------+

Feature 12: Find Total no of students actively studying each class which has less than 5 students.

SELECT COUNT(*),class FROM student_class WHERE status = 'ACTIVE' GROUP BY class HAVING COUNT(status) < 5;
+----------+-------+
| COUNT(*) | class |
+----------+-------+
|        1 |     6 |
|        1 |     5 |
+----------+-------+

Feature 13: Display student and class details Using Joins (Inner Join)
    * Using Subqueries ( Scalar SubQuery)
    
SELECT * FROM students INNER JOIN student_class ON students.id = student_class.id WHERE class IN(SELECT class FROM student_class);
+----+-------------+-----------------------+------------+-------------+--------+------------+---------------------+----+------------+-------+----------+
| id | name        | email                 | mobile_no  | password    | gender | dob        | created_date        | id | student_id | class | status   |
+----+-------------+-----------------------+------------+-------------+--------+------------+---------------------+----+------------+-------+----------+
|  2 | Poorani     | poorani12@gmail.com   | 9823443210 | Poorni123   | F      | 2004-02-27 | 2022-03-02 12:24:54 |  2 |          2 |     3 | INACTIVE |
|  3 | Kaushik     | kaushik12@gmail.com   | 9876541230 | Kaushik123  | M      | 2003-07-16 | 2022-03-02 12:26:21 |  3 |          3 |     6 | ACTIVE   |
|  4 | Ismail      | smile@gmail.com       | 9876542940 | Smile123    | M      | 2002-02-27 | 2022-03-02 12:34:52 |  4 |          4 |     6 | INACTIVE |
|  5 | Vaishnavi   | vaishnavi12@gmail.com | 9823443430 | Vaishu123   | F      | NULL       | 2022-03-02 13:44:37 |  5 |          5 |     7 | ACTIVE   |
|  8 | Prasanna    | prasanna@gmail.com    | 9876534340 | Prasanna123 | M      | 2002-02-27 | 2022-03-02 13:54:05 |  8 |          8 |     7 | ACTIVE   |
|  9 | Vimal       | vimal@gmail.com       | 9876532940 | Vimal123    | M      | 2002-04-27 | 2022-03-02 13:54:41 |  9 |          9 |     7 | ACTIVE   |
| 10 | Hasan       | hasan@gmail.com       | 9876512940 | Hasan123    | M      | 2002-04-27 | 2022-03-02 13:58:58 | 10 |         10 |     7 | ACTIVE   |
| 11 | Mahalakshmi | maha@gmail.com        | 9876554940 | Maha123     | F      | 2002-04-27 | 2022-03-02 13:59:35 | 11 |         11 |     7 | ACTIVE   |
| 12 | Chithraj    | chithu@gmail.com      | 9876559840 | chithu123   | M      | 2002-05-27 | 2022-03-02 14:13:59 | 12 |         12 |     5 | ACTIVE   |
+----+-------------+-----------------------+------------+-------------+--------+------------+---------------------+----+------------+-------+----------+


Feature 14: Display Student Details for the given input class(Class : 5th Standard) Using Joins

SELECT * FROM students LEFT JOIN student_class ON students.id = student_class.id WHERE student_class.class = 5;
+----+----------+------------------+------------+-----------+--------+------------+---------------------+------+------------+-------+----------+
| id | name     | email            | mobile_no  | password  | gender | dob        | created_date        | id   | student_id | class | status   |
+----+----------+------------------+------------+-----------+--------+------------+---------------------+------+------------+-------+----------+
| 12 | Chithraj | chithu@gmail.com | 9876559840 | chithu123 | M      | 2002-05-27 | 2022-03-02 14:13:59 |   12 |         12 |     5 | ACTIVE   |
| 13 | Aswath   | aswath@gmail.com | 9876554940 | Aswath123 | M      | 2002-05-27 | 2022-03-02 14:15:13 |   13 |         13 |     5 | INACTIVE |
+----+----------+------------------+------------+-----------+--------+------------+---------------------+------+------------+-------+----------+

Feature 15: Find Class for the given student email id Email: n@gmail.com    
    Using Subquery ( single row subquery )
    
SELECT * FROM student_class WHERE id IN (SELECT id  FROM students WHERE email = 'smile@gmail.com');
+----+------------+-------+----------+
| id | student_id | class | status   |
+----+------------+-------+----------+
|  4 |          4 |     6 | INACTIVE |
+----+------------+-------+----------+

Feature 16: Find Students who has not enrolled in a class Using Subquery ( multiple row subquery )

INSERT INTO students (name, email, mobile_no,password, gender,dob) VALUES ('Sangeetha', 'sangeetha@gmail.com', 9876554840,'sangeetha123','F','2002-05-28');

SELECT * FROM students LEFT JOIN student_class ON students.id = student_class.id WHERE class is null;
+----+-----------+---------------------+------------+--------------+--------+------------+---------------------+------+------------+-------+--------+
| id | name      | email               | mobile_no  | password     | gender | dob        | created_date        | id   | student_id | class | status |
+----+-----------+---------------------+------------+--------------+--------+------------+---------------------+------+------------+-------+--------+
| 13 | Aswath    | aswath@gmail.com    | 9876554940 | Aswath123    | M      | 2002-05-27 | 2022-03-02 14:15:13 | NULL |       NULL |  NULL | NULL   |
| 14 | Sangeetha | sangeetha@gmail.com | 9876554840 | sangeetha123 | F      | 2002-05-28 | 2022-03-02 15:49:02 | NULL |       NULL |  NULL | NULL   |
+----+-----------+---------------------+------------+--------------+--------+------------+---------------------+------+------------+-------+--------+

Feature 17: Display all students name with class - include both enrolled and not enrolled Using Joins ( Left outer join)

SELECT * FROM students LEFT JOIN student_class ON students.id = student_class.id;
+----+-------------+-----------------------+------------+--------------+--------+------------+---------------------+------+------------+-------+----------+
| id | name        | email                 | mobile_no  | password     | gender | dob        | created_date        | id   | student_id | class | status   |
+----+-------------+-----------------------+------------+--------------+--------+------------+---------------------+------+------------+-------+----------+
|  2 | Poorani     | poorani12@gmail.com   | 9823443210 | Poorni123    | F      | 2004-02-27 | 2022-03-02 12:24:54 |    2 |          2 |     3 | INACTIVE |
|  3 | Kaushik     | kaushik12@gmail.com   | 9876541230 | Kaushik123   | M      | 2003-07-16 | 2022-03-02 12:26:21 |    3 |          3 |     6 | ACTIVE   |
|  4 | Ismail      | smile@gmail.com       | 9876542940 | Smile123     | M      | 2002-02-27 | 2022-03-02 12:34:52 |    4 |          4 |     6 | INACTIVE |
|  5 | Vaishnavi   | vaishnavi12@gmail.com | 9823443430 | Vaishu123    | F      | NULL       | 2022-03-02 13:44:37 |    5 |          5 |     7 | ACTIVE   |
|  8 | Prasanna    | prasanna@gmail.com    | 9876534340 | Prasanna123  | M      | 2002-02-27 | 2022-03-02 13:54:05 |    8 |          8 |     7 | ACTIVE   |
|  9 | Vimal       | vimal@gmail.com       | 9876532940 | Vimal123     | M      | 2002-04-27 | 2022-03-02 13:54:41 |    9 |          9 |     7 | ACTIVE   |
| 10 | Hasan       | hasan@gmail.com       | 9876512940 | Hasan123     | M      | 2002-04-27 | 2022-03-02 13:58:58 |   10 |         10 |     7 | ACTIVE   |
| 11 | Mahalakshmi | maha@gmail.com        | 9876554940 | Maha123      | F      | 2002-04-27 | 2022-03-02 13:59:35 |   11 |         11 |     7 | ACTIVE   |
| 12 | Chithraj    | chithu@gmail.com      | 9876559840 | chithu123    | M      | 2002-05-27 | 2022-03-02 14:13:59 |   12 |         12 |     5 | ACTIVE   |
| 13 | Aswath      | aswath@gmail.com      | 9876554940 | Aswath123    | M      | 2002-05-27 | 2022-03-02 14:15:13 |   13 |         13 |     5 | INACTIVE |
| 14 | Sangeetha   | sangeetha@gmail.com   | 9876554840 | sangeetha123 | F      | 2002-05-28 | 2022-03-02 15:49:02 | NULL |       NULL |  NULL | NULL     |
+----+-------------+-----------------------+------------+--------------+--------+------------+---------------------+------+------------+-------+----------+

SELECT name,class FROM students LEFT JOIN student_class ON students.id = student_class.id;
+-------------+-------+
| name        | class |
+-------------+-------+
| Poorani     |     3 |
| Kaushik     |     6 |
| Ismail      |     6 |
| Vaishnavi   |     7 |
| Prasanna    |     7 |
| Vimal       |     7 |
| Hasan       |     7 |
| Mahalakshmi |     7 |
| Chithraj    |     5 |
| Aswath      |  NULL |
| Sangeetha   |  NULL |
+-------------+-------+




