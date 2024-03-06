# Echo Mart

Welcome to Echo Mart, your premier destination for sustainable shopping and second-hand treasures! At Echo Mart, we believe in the power of giving new life to pre-loved items, reducing waste, and promoting a more eco-friendly lifestyle.

## Setup Instructions

1. **Setup any Compatible IDE for Java**
2. **Creation of Database**

 Execute the following SQL commands to create the required database and tables:

 ```sql
 CREATE DATABASE ECHOMART;
 USE ECHOMART;
 
 CREATE TABLE customers(
 FullName varchar(255),
 LastName varchar(255),
 EmailAddress varchar(255) PRIMARY KEY,
 Password varchar(255)
 );
  
 CREATE TABLE customers_profile(
   EmailAddress varchar(255),
   ProfilePicture longblob,
   DateOfBirth varchar(255),
   ContactNumber varchar(15) PRIMARY KEY,
   Province varchar(255),
   ShippingAddress varchar(255),
   FOREIGN KEY (EmailAddress)
   REFERENCES customers(EmailAddress)
 );
   
 SELECT c.FullName, c.LastName, c.EmailAddress, cp.ProfilePicture 
 FROM customers c 
 JOIN customers_profile cp ON c.EmailAddress = cp.EmailAddress
 WHERE c.EmailAddress = 'devops.shahi@email.com'
 ;

 CREATE TABLE RecoveryCodes (
   EmailAddress VARCHAR(255) NOT NULL,
   RecoveryCode1 VARCHAR(255),
   RecoveryCode2 VARCHAR(255),
   RecoveryCode3 VARCHAR(255),
   RecoveryCode4 VARCHAR(255),
   RecoveryCode5 VARCHAR(255),
   RecoveryCode6 VARCHAR(255),
   ExpirationTime DATETIME,
   Status ENUM('Unused', 'Used') DEFAULT 'Unused',
   CreationTime DATETIME DEFAULT CURRENT_TIMESTAMP,
   Attempts INT DEFAULT 0,
   PRIMARY KEY (EmailAddress),
   FOREIGN KEY (EmailAddress) REFERENCES customers(EmailAddress)
 );

 CREATE TABLE categories (
   category_id INT PRIMARY KEY AUTO_INCREMENT,
   category_name VARCHAR(100) NOT NULL
 );

 CREATE TABLE products (
   product_id INT PRIMARY KEY AUTO_INCREMENT,
   seller_email varchar(255),
   category_id INT,
   product_name VARCHAR(255) NOT NULL,
   description TEXT,
   price DECIMAL(10, 2),
   delivery_status_id INT,
   upload_date VARCHAR(255),
   pcondition VARCHAR(20),
   availability_status VARCHAR(20),
   location VARCHAR(255),
   FOREIGN KEY (seller_email) REFERENCES customers(EmailAddress),
   FOREIGN KEY (category_id) REFERENCES categories(category_id),
   FOREIGN KEY (delivery_status_id) REFERENCES delivery_status(delivery_status_id)
 );

 CREATE TABLE delivery_status (
   delivery_status_id INT PRIMARY KEY AUTO_INCREMENT,
   status_name VARCHAR(50) NOT NULL
 );

 CREATE TABLE images (
   image_id INT PRIMARY KEY AUTO_INCREMENT,
   product_id INT,
   primary_image LONGBLOB,
   secondary_image LONGBLOB,
   tertiary_image LONGBLOB,
   FOREIGN KEY (product_id) REFERENCES products(product_id)
 );

 CREATE TABLE messages (
   message_id INT PRIMARY KEY AUTO_INCREMENT,
   sender_email varchar(255),
   reciever_email varchar(255),
   product_id INT,
   message_text TEXT,
   send_date DATETIME,
   FOREIGN KEY (sender_email) REFERENCES customers(EmailAddress),
   FOREIGN KEY (reciever_email) REFERENCES customers(EmailAddress),
   FOREIGN KEY (product_id) REFERENCES products(product_id)
 );
  
CREATE TABLE favorites (
  favorite_id INT PRIMARY KEY AUTO_INCREMENT,
  customer_email VARCHAR(255),
  product_id INT,
  FOREIGN KEY (customer_email) REFERENCES customers(EmailAddress),
  FOREIGN KEY (product_id) REFERENCES products(product_id)
);
```

3. **Change JDBC driver database's username and password**

 ```java
@Override
    public Connection openConnection() { 
        try{
            String username = "root";
            String password = "SaugatSHELL196$!";
            String database = "echomart";
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection;
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/" + database, username, password
            );
            if(connection == null){
                System.out.println("Database connection fail");
            }else{
                System.out.println("Database connection success");
            }
            return connection;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
  ```

## Project URL

Find the project repository on GitHub:

[GitHub Repository](https://github.com/shahisaugat/EchoMart)
