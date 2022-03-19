# Smiley World Art


``` syntax
CREATE DATABASE Smiley_world_art;
```
``` syntax
SHOW DATABASES;
```

| Database            |
|---------------------|
| Name                |
| Smiley_world_art    |
| employeeDetails     |
| indexing            |
| information_schema  |
| mysql               |
| performance_schema  |
| studentDetails      |
| studentsInformation |
| sys                 |

``` syntax
USE Smiey_world_art;
```

### User details (Registered User)

``` syntax
CREATE TABLE user_details (Id int(5) PRIMARY KEY AUTO_INCREMENT, Name varchar(30) NOT NULL, Email_id varchar(255) UNIQUE NOT NULL, Password varchar(20) UNIQUE NOT NULL, Confirm_password varchar(20) UNIQUE NOT NULL, CHECK(LENGTH(Password) > 8), CHECK(LENGTH(Confirm_password) > 8));
```
``` syntax
DESC user_details;
```
| Field            | Type         | Null | Key | Default | Extra          |
|------------------|--------------|------|-----|---------|----------------|
| Id               | int          | NO   | PRI | NULL    | auto_increment |
| Name             | varchar(30)  | NO   |     | NULL    |                |
| Email_id         | varchar(255) | NO   | UNI | NULL    |                |
| Password         | varchar(20)  | NO   | UNI | NULL    |                |
| Confirm_password | varchar(20)  | NO   | UNI | NULL    |                |

###  Artist_details
```syntax
CREATE TABLE Artist_details (Artist_id int(5) PRIMARY KEY AUTO_INCREMENT, Artist_name varchar(30) NOT NULL, Place varchar(20) NOT NULL);
```
``` syntax
DESC Artist_details;
```

| Field       | Type        | Null | Key | Default | Extra          |
|-------------|-------------|------|-----|---------|----------------|
| Artist_id   | int         | NO   | PRI | NULL    | auto_increment |
| Artist_name | varchar(30) | NO   |     | NULL    |                |
| Place       | varchar(20) | NO   |     | NULL    |                |


### Arts details
```syntax
CREATE TABLE Art_details (Art_id int(5) PRIMARY KEY AUTO_INCREMENT, Art_name varchar(50) NOT NULL, Art_image BLOB, Artist_id int(5), FOREIGN KEY(Artist_id) REFERENCES Artist_details(Artist_id), Type varchar(20) NOT NULL, CHECK (Type IN ('Pencil drawing', 'Color pencil drawing', 'Painting')), Price int(10) NOT NULL, CHECK(Price > 100));
```
``` syntax
DESC Art_details;
```

| Field     | Type        | Null | Key | Default | Extra          |
|-----------|-------------|------|-----|---------|----------------|
| Art_id    | int         | NO   | PRI | NULL    | auto_increment |
| Art_name  | varchar(50) | NO   |     | NULL    |                |
| Art_image | blob        | YES  |     | NULL    |                |
| Artist_id | int         | YES  | MUL | NULL    |                |
| Type      | varchar(20) | NO   |     | NULL    |                |
| Price     | int         | NO   |     | NULL    |                |


### Customer detaails
``` syntax
CREATE TABLE Customers_details (Customer_id tinyint(5) PRIMARY KEY AUTO_INCREMENT, Customer_name varchar(30) NOT NULL, Address varchar(255) NOT NULL, City varchar(30) NOT NULL, State varchar(50) NOT NULL,Country varchar(50) NOT NULL, Phone_number bigint(11) UNIQUE NOT NULL);
```
``` syntax
DESC Customers_details;
```

| Field         | Type         | Null | Key | Default | Extra          |
|---------------|--------------|------|-----|---------|----------------|
| Customer_id   | tinyint      | NO   | PRI | NULL    | auto_increment |
| Customer_name | varchar(30)  | NO   |     | NULL    |                |
| Address       | varchar(255) | NO   |     | NULL    |                |
| City          | varchar(30)  | NO   |     | NULL    |                |
| State         | varchar(50)  | NO   |     | NULL    |                |
| Country       | varchar(50)  | NO   |     | NULL    |                |
| Phone_number  | bigint       | NO   | UNI | NULL    |                |



### Ordered products
``` syntax
CREATE TABLE Ordered_details (Order_id tinyint(5) PRIMARY KEY AUTO_INCREMENT, Price int(10) NOT NULL, Art_id int(5), FOREIGN KEY(Art_id) REFERENCES Art_details(Art_id), Customer_id tinyint(5), FOREIGN KEY(Customer_id) REFERENCES Customers_details(Customer_id), CHECK (Price > 100), created_date timestamp NOT NULL DEFAULT current_timestamp);
```
``` syntax
DESC Ordered_details;
```
| Field        | Type      | Null | Key | Default           | Extra             |
|--------------|-----------|------|-----|-------------------|-------------------|
| Order_id     | tinyint   | NO   | PRI | NULL              | auto_increment    |
| Price        | int       | NO   |     | NULL              |                   |
| Art_id       | int       | YES  | MUL | NULL              |                   |
| Customer_id  | tinyint   | YES  | MUL | NULL              |                   |
| created_date | timestamp | NO   |     | CURRENT_TIMESTAMP | DEFAULT_GENERATED |

### Registration
``` syntax
INSERT INTO user_details VALUES (null, 'Sangeetha', 'sangeetha.r1409@gmail.com', 'Sangeetha123','Sangeetha123');
``` 

``` syntax
INSERT INTO user_details VALUES (null, 'Annapoorani', 'poorani27@gmail.com', 'Poorani123','Poorani123');
``` 

``` syntax
SELECT * FROM user_details;
```

| Id | Name        | Email_id                  | Password     | Confirm_password |
|----|-------------|---------------------------|--------------|------------------|
|  1 | Sangeetha   | sangeetha.r1409@gmail.com | Sangeetha123 | Sangeetha123     |
|  2 | Annapoorani | poorani27@gmail.com       | Poorani123   | Poorani123       |

### Artist sell their arts 

``` syntax
INSERT INTO Artist_details VALUES (null, 'Sangeetha', 'Chennai');
```
``` syntax
INSERT INTO Artist_details VALUES (null, 'Ismail', 'Thoothukudi');
```
``` syntax
SELECT * FROM Artist_details;
```

| Artist_id | Artist_name | Place       |
|-----------|-------------|-------------|
|         1 | Sangeetha   | Chennai     |
|         2 | Ismail      | Thoothukudi |

``` syntax
INSERT INTO Art_details VALUES (null, 'Attractive eyes', 'file:///home/sangeetharamachanthiran/fwsa-batch2/smileyworldartapp-ui/assets/img/sangee_eyes.jpg', 1, 'Pencil drawing',1000);
```
``` syntax
INSERT INTO Art_details VALUES (null, 'Sisters goals', 'file:///home/sangeetharamachanthiran/fwsa-batch2/smileyworldartapp-ui/assets/img/Sangee_sistersLove.jpg', 1, 'Pencil drawing',500);
```
``` syntax
SELECT * FROM Art_details;
```

| Art_id | Art_name        | Art_image                                                                                                                                                                                                        | Artist_id | Type                 | Price |
|--------|-----------------|---------------------------------------------------------|-----------|----------------------|-------|
|      1 | Attractive eyes | 0x66696C653A2F2F2F686F6D652F73616E67656574686172616D616368616E74686972616E2F667773612D6261746368322F736D696C6579776F726C646172746170702D75692F6173736574732F696D672F73616E6765655F657965732E6A7067               |         1 | Pencil drawing       |  1000 |
|      2 | Sisters goals   | 0x66696C653A2F2F2F686F6D652F73616E67656574686172616D616368616E74686972616E2F667773612D6261746368322F736D696C6579776F726C646172746170702D75692F6173736574732F696D672F53616E6765655F736973746572734C6F76652E6A7067 |         1 | Pencil drawing       |   500 |
|      3 | Banana          | 0x66696C653A2F2F2F686F6D652F73616E67656574686172616D616368616E74686972616E2F667773612D6261746368322F736D696C6579776F726C646172746170702D75692F6173736574732F696D672F736D696C655F62616E616E612E6A7067             |         2 | Color Pencil drawing |  1000 |








