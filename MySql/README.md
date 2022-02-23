# MySql
### To create database
```query
CREATE DATABASE students; ```
### To show database
```query
SHOW DATABASES;```
|--------------------|
| Database 
|---|          
|--------------------|
| information_schema |
| mysql              |
| performance_schema |
| sangeetha          |
| students           |
| sys                |
|--------------------|
### To use database
```query
USE students```
###### Database changed
### To create table
```query
CREATE TABLE studentList (Id int(5) PRIMARY KEY, firstName varchar(25),lastName varchar(25) NOT NULL, EmailId varchar(255) UNIQUE, Title varchar(15) DEFAULT 'FWSA Student'); ```


