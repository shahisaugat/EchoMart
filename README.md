# Echo Mart

Welcome to Echo Mart, your premier destination for sustainable shopping and second-hand treasures! At Echo Mart, we believe in the power of giving new life to pre-loved items, reducing waste, and promoting a more eco-friendly lifestyle.

## Setup Instructions

**1. Setup any Compatible IDE for Java**

**2. Download and Add Required Libraries**

   - **FlatLaf 3.2**
     - [Download]('Jar Folder/flatlaf-3.2.jar')
     - Feature: Look and feel library for creating modern UIs in Java Swing applications.

   - **Swing-toast-notifications-1.0.1**
     - [Download](https://search.maven.org/artifact/org.pushing-pixels/swing-toast-notifications/1.0.1/jar)
     - Feature: Provides toast notification support for Java Swing applications.

   - **JSVG 1.2.0**
     - [Download](https://search.maven.org/artifact/org.apache.xmlgraphics/batik-jsvg/1.12/jar)
     - Feature: Library for rendering SVG images in Java applications.

   - **Glasspane-popup-2.0.1**
     - [Download](https://search.maven.org/artifact/com.pigdroid/javatoolbox/2.0.1/jar)
     - Feature: Library for creating customizable popups and dialogs in Java Swing applications.

   - **Miglayout 4.0**
     - [Download](https://search.maven.org/artifact/com.miglayout/miglayout-core/4.0/jar)
     - Feature: Layout manager for Java Swing that provides powerful and flexible layout capabilities.

   - **Timingframework 1.0**
     - [Download](https://search.maven.org/artifact/org.jdesktop/timingframework/1.0/jar)
     - Feature: Provides support for creating and managing timed animations in Java applications.

   - **MySQL Connector J 8.3.0**
     - [Download](https://search.maven.org/artifact/mysql/mysql-connector-java/8.0.28/jar)
     - Feature: JDBC driver for connecting Java applications to MySQL databases.

**3. Creation of Database**

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

**4. Change JDBC driver database's username and password**

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
**5. Run application**

### If you have any changes to be made

**1. To change the form**
```java
private void initMenuEvent() {
        menu.addMenuEvent((int index, int subIndex, MenuAction action) -> {
            switch (index) {
                case 0 -> {
                    EchoMartRunner.changeContentPane(new JLayer(new Dashboard(), new FloatingButtonUI()));
                    revalidate();
                    repaint();
                }
                case 3 -> {
                        EchoMartRunner.changeContentPane(null);
                }
            }
        });
    }
```
**2. To create any popups like Account Menus**
```java
private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        accountMenu = new AccountMenus();
        GlassPanePopup.showPopup(accountMenu, new DefaultOption() {
            @Override
            public float opacity() {
                return 0.02f;
            }
            
            @Override
            public String getLayout(Component parent, float animate) {
                float xOffset = 0.830f;
                float yOffset = 0.124f;

                return "pos " + xOffset + "al " + yOffset + "al";
            }
        });
    }
```

### Project URL

Find the project repository on GitHub:

[GitHub Repository](https://github.com/shahisaugat/EchoMart)
