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
CREATE TABLE Ordered_details (Order_id tinyint(5) PRIMARY KEY AUTO_INCREMENT, Quantity tinyint(5) NOT NULL, Art_id int(5), FOREIGN KEY(Art_id) REFERENCES Art_details(Art_id), Customer_id tinyint(5), FOREI
GN KEY(Customer_id) REFERENCES Customers_details(Customer_id), created_date timestamp NOT NULL DEFAULT current_timestamp);
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
INSERT INTO user_details VALUES (null, 'Chithraj', 'chithu12@gmail.com', 'Chithu123','Chithu123');
``` 
``` syntax
INSERT INTO user_details VALUES (null, 'Ismail', 'smile27@gmail.com', 'Smile@123','Smile@123');
``` 
``` syntax
INSERT INTO user_details VALUES (null, 'Vaishnavi', 'vaishnavi12@gmail.com', 'Vaishu123','Vaishu123');
``` 

``` syntax
SELECT * FROM user_details;
```

| Id | Name        | Email_id                  | Password     | Confirm_password |
|----|-------------|---------------------------|--------------|------------------|
|  1 | Sangeetha   | sangeetha.r1409@gmail.com | Sangeetha123 | Sangeetha123     |
|  2 | Annapoorani | poorani27@gmail.com       | Poorani123   | Poorani123       |
|  3 | Chithraj    | chithu12@gmail.com        | Chithu123    | Chithu123        |
|  4 | Ismail      | smile27@gmail.com         | Smile@123    | Smile@123        |
|  5 | Vaishnavi   | vaishnavi12@gmail.com     | Vaishu123    | Vaishu123        |


### Artist sell their arts 

``` syntax
INSERT INTO Artist_details VALUES (null, 'Sangeetha', 'Chennai');
```
``` syntax
INSERT INTO Artist_details VALUES (null, 'Ismail', 'Thoothukudi');
```
``` syntax
INSERT INTO Artist_details VALUES (null, 'Annapoorani', 'Bodi');
```
``` syntax
INSERT INTO Artist_details VALUES (null, 'Vaishnavi', 'Erode');
```
``` syntax
INSERT INTO Artist_details VALUES (null, 'Keerthana', 'Coimbatore');
```

``` syntax
SELECT * FROM Artist_details;
```

| Artist_id | Artist_name | Place       |
|-----------|-------------|-------------|
|         1 | Sangeetha   | Chennai     |
|         2 | Ismail      | Thoothukudi |
|         3 | Annapoorani | Bodi        |
|         4 | Vaishnavi   | Erode       |
|         5 | Keerthana   | Coimbatore  |


``` syntax
INSERT INTO Art_details VALUES (null, 'Attractive eyes', 'file:///home/sangeetharamachanthiran/fwsa-batch2/smileyworldartapp-ui/assets/img/sangee_eyes.jpg', 1, 'Pencil drawing',1000);
```
``` syntax
INSERT INTO Art_details VALUES (null, 'Sisters goals', 'file:///home/sangeetharamachanthiran/fwsa-batch2/smileyworldartapp-ui/assets/img/Sangee_sistersLove.jpg', 1, 'Pencil drawing',500);
```
``` syntax
INSERT INTO Art_details VALUES (null, 'Girl sitting alone', 'https://i.pinimg.com/originals/51/5f/b0/515fb0ed223034f9c76c4a85365d4dd9.jpg', 5, 'Painting',1500);
```
``` syntax
INSERT INTO Art_details VALUES (null, 'Dog Love', 'https://www.mydavinci.com/slide/l849821-m/500/102/large.jpg', 4, 'Color pencil drawing',1500);
```
``` syntax
INSERT INTO Art_details VALUES (null, 'Cute baby', 'https://images.template.net/wp-content/uploads/2014/11/pencil-drawing-artwork.jpg', 3, 'Pencil drawing',1000);
```
``` syntax
INSERT INTO Art_details VALUES (null, 'Banana', 'file:///home/sangeetharamachanthiran/fwsa-batch2/smileyworldartapp-ui/assets/img/smile_banana.jpg', 2, 'Color Pencil drawing',1000);
```
``` syntax
SELECT * FROM Art_details;
```

| Art_id | Art_name|  Art_image | Artist_id | Type    | Price |
|--------|---------|-------------|-----------|---------|--------|
|      1 | Attractive eyes |0x66696C653A2F2F2F686F6D652F73616E67656574686172616D616368616E74686972616E2F667773612D6261746368322F736D696C6579776F726C646172746170702D75692F6173736574732F696D672F73616E6765655F657965732E6A7067| 1 | Pencil drawing |  1000 |
|      2 | Sisters goals   | 0x66696C653A2F2F2F686F6D652F73616E67656574686172616D616368616E74686972616E2F667773612D6261746368322F736D696C6579776F726C646172746170702D75692F6173736574732F696D672F53616E6765655F736973746572734C6F76652E6A7067 |         1 | Pencil drawing |   500 |
|      3 | Girl sitting alone | 0x68747470733A2F2F692E70696E696D672E636F6D2F6F726967696E616C732F35312F35662F62302F35313566623065643232333033346639633736633461383533363564346464392E6A7067                                                       |         5 | Painting             |  1500 |
|      4 | Dog Love           | 0x68747470733A2F2F7777772E6D79646176696E63692E636F6D2F736C6964652F6C3834393832312D6D2F3530302F3130322F6C617267652E6A7067                                                                                         |         4 | Color pencil drawing |  1500 |
|      5 | Cute baby          | 0x68747470733A2F2F696D616765732E74656D706C6174652E6E65742F77702D636F6E74656E742F75706C6F6164732F323031342F31312F70656E63696C2D64726177696E672D617274776F726B2E6A7067                                             |         3 | Pencil drawing       |  1000 |
|      6 | Banana             | 0x66696C653A2F2F2F686F6D652F73616E67656574686172616D616368616E74686972616E2F667773612D6261746368322F736D696C6579776F726C646172746170702D75692F6173736574732F696D672F736D696C655F62616E616E612E6A7067             |         2 | Color Pencil drawing |  1000 |



``` syntax
INSERT INTO Customers_details VALUES (null, 'Sangeetha', '203 Mahalakshmi nagar,Guduvancheri','Chennai','Tamil nadu','India','9876543210');
```
``` syntax
INSERT INTO Customers_details VALUES (null,'Annapoorani', '12 Mahalakshmi nagar,Bodi','Theni','Tamil nadu','India','9876343254');
```
``` syntax
INSERT INTO Customers_details VALUES (null,'Vaishnavi', '12, Gandhi street,Gobichettipalayam','Erode','Tamil nadu','India','8765432109');
```
``` syntax
INSERT INTO Customers_details VALUES (null,'Keerthana', '14, Nehru street','Coimbatore','Tamil nadu','India','8708432109');
```
``` syntax
SELECT * FROM Customers_details;
```
| Customer_id | Customer_name | Address                            | City    | State      | Country | Phone_number |
|-------------|---------------|------------------------------------|---------|------------|---------|--------------|
|           1 | Sangeetha     | 203 Mahalakshmi nagar,Guduvancheri | Chennai | Tamil nadu | India   |   9876543210 |
|           2 | Annapoorani   | 12 Mahalakshmi nagar,Bodi          | Theni   | Tamil nadu | India   |   9876343254 |
|           3 | Vaishnavi     | 12,Gandhi street,Gobichettipalayam | Erode   | Tamil nadu | India   |   8765432109 |
|           4 | Keerthana     | 14,Nehru street                    |Coimbatore | Tamil nadu | India   |   8708432109 |


``` syntax
INSERT INTO Ordered_details VALUES (null, 2, 2, 1, '2022-03-21');
```
``` syntax
INSERT INTO Ordered_details VALUES (null, 1, 3, 5, '2022-03-21 00:24:15');
```
``` syntax
INSERT INTO Ordered_details VALUES (null, 1, 3, 4, '2022-03-21 00:24:15');
```
``` syntax
INSERT INTO Ordered_details VALUES (4, 1, 3, 3, '2022-03-21 00:31:15');
```
``` syntax
INSERT INTO Ordered_details VALUES (null, 1, 1, 1, '2022-03-21 00:32:15');
```
``` syntax
SELECT * FROM Ordered_details;
```
| Order_id | Quantity | Art_id | Customer_id | created_date        |
|----------|----------|--------|-------------|---------------------|
|        1 |        2 |      2 |           1 | 2022-03-21 00:00:00 |
|        2 |        1 |      4 |           2 | 2022-03-21 00:24:15 |
|        3 |        1 |      3 |           4 | 2022-03-21 00:24:15 |
|        4 |        1 |      3 |           3 | 2022-03-21 00:31:15 |
|        5 |        1 |      1 |           1 | 2022-03-21 00:32:15 |








