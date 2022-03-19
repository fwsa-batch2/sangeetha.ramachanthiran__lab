CREATE DATABASE practicing_view;
Query OK, 1 row affected (0.01 sec)

mysql> SHOW DATABASES;
+---------------------+
| Database            |
+---------------------+
| Name                |
| employeeDetails     |
| indexing            |
| information_schema  |
| mysql               |
| normalization       |
| performance_schema  |
| practicing_view     |
| sangeetha           |
| smileyWorldArt      |
| studentDetails      |
| studentsInformation |
| sys                 |
+---------------------+
13 rows in set (0.02 sec) 

mysql> USE practicing_view;
Database changed
mysql> CREATE TABLE user (Id int PRIMARY KEY AUTO_INCREMENT, name varchar(30) NOT NULL);
Query OK, 0 rows affected (0.02 sec) 
mysql> CREATE TABLE batches (Id int AUTO_INCREMENT, batch_name varchar(30) NOT NULL, foreign key(Id) references user(Id));
Query OK, 0 rows affected (0.02 sec) 

mysql> CREATE TABLE courses (Id int AUTO_INCREMENT, coach_name varchar(30) NOT NULL, foreign key(Id) references user(Id));
Query OK, 0 rows affected (0.02 sec)

mysql> DESC user;
+-------+-------------+------+-----+---------+----------------+
| Field | Type        | Null | Key | Default | Extra          |
+-------+-------------+------+-----+---------+----------------+
| Id    | int         | NO   | PRI | NULL    | auto_increment |
| name  | varchar(30) | NO   |     | NULL    |                |
+-------+-------------+------+-----+---------+----------------+
2 rows in set (0.00 sec)

mysql> DESC batches;
+------------+-------------+------+-----+---------+----------------+
| Field      | Type        | Null | Key | Default | Extra          |
+------------+-------------+------+-----+---------+----------------+
| Id         | int         | NO   | MUL | NULL    | auto_increment |
| batch_name | varchar(30) | NO   |     | NULL    |                |
+------------+-------------+------+-----+---------+----------------+
2 rows in set (0.00 sec)

mysql> DESC courses;
+-------------+-------------+------+-----+---------+----------------+
| Field       | Type        | Null | Key | Default | Extra          |
+-------------+-------------+------+-----+---------+----------------+
| Id          | int         | NO   | MUL | NULL    | auto_increment |
| course_name | varchar(30) | NO   |     | NULL    |                |
+-------------+-------------+------+-----+---------+----------------+
2 rows in set (0.00 sec) 

CREATE TABLE batch_user(Id int PRIMARY KEY AUTO_INCREMENT, batch_id int, FOREIGN KEY(batch_id) REFERENCES batches(Id), user_id int, FOREIGN KEY(user_id) REFERENCES user(Id));
Query OK, 0 rows affected (0.02 sec)

mysql> DESC batch_user;
+----------+------+------+-----+---------+----------------+
| Field    | Type | Null | Key | Default | Extra          |
+----------+------+------+-----+---------+----------------+
| Id       | int  | NO   | PRI | NULL    | auto_increment |
| batch_id | int  | YES  | MUL | NULL    |                |
| user_id  | int  | YES  | MUL | NULL    |                |
+----------+------+------+-----+---------+----------------+
3 rows in set (0.01 sec)

mysql> CREATE TABLE batch_courses(Id int PRIMARY KEY AUTO_INCREMENT, batch_id int, FOREIGN KEY(batch_id) REFERENCES batches(Id), course_id int, FOREIGN KEY(course_id) REFERENCES courses(Id));
Query OK, 0 rows affected (0.04 sec)

mysql> DESC batch_courses;
+-----------+------+------+-----+---------+----------------+
| Field     | Type | Null | Key | Default | Extra          |
+-----------+------+------+-----+---------+----------------+
| Id        | int  | NO   | PRI | NULL    | auto_increment |
| batch_id  | int  | YES  | MUL | NULL    |                |
| course_id | int  | YES  | MUL | NULL    |                |
+-----------+------+------+-----+---------+----------------+
3 rows in set (0.00 sec)

mysql> INSERT INTO batch_user VALUES (null, 1,1);
Query OK, 1 row affected (0.00 sec)

mysql> INSERT INTO batch_user VALUES (null, 2,2);
Query OK, 1 row affected (0.00 sec)

mysql> INSERT INTO batch_courses VALUES (null, 1,1);
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO batch_courses VALUES (null, 2,2);
Query OK, 1 row affected (0.00 sec)

mysql> SELECT * FROM user;
+----+-----------+
| Id | name      |
+----+-----------+
|  1 | Sangeetha |
|  2 | Poorni    |
+----+-----------+
2 rows in set (0.00 sec)

mysql> SELECT * FROM batches;
+----+------------+
| Id | batch_name |
+----+------------+
|  1 | batch_1    |
|  2 | batch_2    |
+----+------------+
2 rows in set (0.00 sec)

mysql> SELECT * FROM courses;
+----+-------------+
| Id | course_name |
+----+-------------+
|  1 | Tech        |
|  2 | Els         |
+----+-------------+
2 rows in set (0.01 sec)

mysql> SELECT * FROM batch_user;
+----+----------+---------+
| Id | batch_id | user_id |
+----+----------+---------+
|  1 |        1 |       1 |
|  2 |        2 |       2 |
+----+----------+---------+
2 rows in set (0.00 sec)

mysql> SELECT * FROM batch_courses;
+----+----------+-----------+
| Id | batch_id | course_id |
+----+----------+-----------+
|  1 |        1 |         1 |
|  2 |        2 |         2 |
+----+----------+-----------+
2 rows in set (0.00 sec)

mysql> SELECT batch_user.Id, user.name, batches.batch_name FROM user INNER JOIN batches ON user.Id = batches.Id INNER JOIN batch_user ON batch_user.Id = batches.Id;
+----+-----------+------------+
| Id | name      | batch_name |
+----+-----------+------------+
|  1 | Sangeetha | batch_1    |
|  2 | Poorni    | batch_2    |
+----+-----------+------------+
2 rows in set (0.00 sec)

mysql> SELECT * FROM user INNER JOIN batches ON user.Id = batches.Id INNER JOIN batch_user ON batch_user.Id = batches.Id;
+----+-----------+----+------------+----+----------+---------+
| Id | name      | Id | batch_name | Id | batch_id | user_id |
+----+-----------+----+------------+----+----------+---------+
|  1 | Sangeetha |  1 | batch_1    |  1 |        1 |       1 |
|  2 | Poorni    |  2 | batch_2    |  2 |        2 |       2 |
+----+-----------+----+------------+----+----------+---------+
2 rows in set (0.00 sec)

mysql> SELECT * FROM user INNER JOIN batches ON user.Id = batches.Id INNER JOIN courses ON courses.Id = batches.Id;
+----+-----------+----+------------+----+-------------+
| Id | name      | Id | batch_name | Id | course_name |
+----+-----------+----+------------+----+-------------+
|  1 | Sangeetha |  1 | batch_1    |  1 | Tech        |
|  2 | Poorni    |  2 | batch_2    |  2 | Els         |
+----+-----------+----+------------+----+-------------+
2 rows in set (0.01 sec)

mysql> SELECT * FROM user INNER JOIN batches ON user.Id = batches.Id INNER JOIN courses ON courses.Id = batches.Id;
+----+-------------+----+------------+----+-------------+
| Id | name        | Id | batch_name | Id | course_name |
+----+-------------+----+------------+----+-------------+
|  1 | Sangeetha   |  1 | batch_1    |  1 | JS          |
|  2 | Poorni      |  2 | batch_2    |  2 | HTML        |
|  3 | Ismail      |  3 | batch_1    |  3 | HTML        |
|  4 | Vaishnavi   |  4 | batch_1    |  4 | CSS         |
|  5 | Mahalakshmi |  5 | batch_2    |  5 | HTML        |
+----+-------------+----+------------+----+-------------+
5 rows in set (0.00 sec) 

mysql> SELECT courses.course_name,user.name,batches.batch_name FROM user INNER JOIN batches ON user.Id = batches.Id INNER JOIN courses ON courses.Id = batches.Id WHERE courses.course_name =
'HTML';
+-------------+-------------+------------+
| course_name | name        | batch_name |
+-------------+-------------+------------+
| HTML        | Poorni      | batch_2    |
| HTML        | Ismail      | batch_1    |
| HTML        | Mahalakshmi | batch_2    |
+-------------+-------------+------------+
3 rows in set (0.00 sec)

mysql> SELECT courses.course_name,user.name,batches.batch_name FROM user INNER JOIN batches ON user.Id = batches.Id INNER JOIN courses ON courses.Id = batches.Id WHERE courses.course_name =
'HTML' AND batches.batch_name = 'batch_1';
+-------------+--------+------------+
| course_name | name   | batch_name |
+-------------+--------+------------+
| HTML        | Ismail | batch_1    |
+-------------+--------+------------+
1 row in set (0.00 sec)

