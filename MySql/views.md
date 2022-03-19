# Mysql Views
### Base
``` syntax
SHOW TABLES;
```
| Tables_in_studentsInformation |
|-------------------------------|
| employee                      |
| salary_detail                 |

```syntax
 SELECT * FROM employee;
 ```

| Id | First_name | Last_name | email_id                    | PhoneNumber |
|----|------------|-----------|-----------------------------|-------------|
|  1 | Prasanna   | Venkatesh | prasannavenkatesh@gmail.com | 9876543210  |
|  2 | Mohammad   | Hasan     | hasan@gmail.com             | 9876543212  |


### To create a view
``` syntax
CREATE VIEW employee_view AS SELECT Id,email,Salary FROM salary_detail WHERE Salary > 10000;
```
``` syntax
SHOW TABLES;
```
SHOW TABLES;

| Tables_in_employeeDetails |
|---------------------------|
| employee                  |
| employee_view             |
| salary_detail             |

 ### To show a base tables
 ``` syntax
  SHOW FULL TABLES WHERE TABLE_TYPE = 'BASE TABLE';
```

| Tables_in_employeeDetails | Table_type |
|---------------------------|------------|
| employee                  | BASE TABLE |
| salary_detail             | BASE TABLE |

### To show a view table
``` syntax
SHOW FULL TABLES WHERE TABLE_TYPE != 'BASE TABLE';
```

| Tables_in_employeeDetails | Table_type |
|---------------------------|------------|
| employee_view             | VIEW       |

``` syntax
 SHOW FULL TABLES WHERE TABLE_TYPE = 'VIEW';
 ```

| Tables_in_employeeDetails | Table_type |
|---------------------------|------------|
| employee_view             | VIEW       |


### To update a view
``` syntax
CREATE OR REPLACE VIEW salary_view AS SELECT id, email, Salary,Month FROM salary_detail WHERE Salary > 10000;
```
``` syntax
SELECT * FROM salary_view;
```

| id | email              | Salary | Month |
|----|--------------------|--------|-------|
|  1 | prasanna@gmail.com |  15000 | March |


### To rename a view table

``` syntax
RENAME TABLE salary_view TO salary_view_table;
```
``` syntax
SELECT * FROM salary_view_table;
```

| id | email              | Salary | Month |
|----|--------------------|--------|-------|
|  1 | prasanna@gmail.com |  15000 | March |

``` syntax
INSERT INTO salary_view_table VALUES (3, 'poorani@gmail.com',20000,'June');
```

``` syntax
SELECT * FROM salary_view_table;
```

| id | email              | Salary | Month |
|----|--------------------|--------|-------|
|  1 | prasanna@gmail.com |  15000 | March |
|  3 | poorani@gmail.com  |  20000 | June  |
``` syntax
DELETE FROM salary_view_table WHERE Month = 'June';
```
``` syntax
SELECT * FROM salary_view_table;
```

| id | email              | Salary | Month |
|----|--------------------|--------|-------|
|  1 | prasanna@gmail.com |  15000 | March |





