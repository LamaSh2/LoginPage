
# Login Page with Java Swing and MySQL

This is a simple login page implementation using Java Swing for the user interface and MySQL for the database. It demonstrates how to authenticate users by checking their credentials against a MySQL database.

<img width="941" alt="Screenshot 2024-01-29 at 4 47 42 PM" src="https://github.com/LamaSh2/LoginPage/assets/79080627/61b6c60c-1979-476d-bc0a-19ff2fad4ce5">

## Features

- User-friendly login interface with a username and password field
- Integration with MySQL database for user authentication
- Error handling for invalid credentials

## Prerequisites

- Java Development Kit (JDK) installed
- MySQL Server installed
- MySQL Connector/J library added to the project's classpath

## Getting Started

1. Clone the repository:
   ```shell
   git clone https://github.com/LamaSh2/LoginPage.git
   ```

2. Open the project in your preferred Java IDE.

3. Add the MySQL Connector/J library to the project's classpath.

4. Configure the MySQL database connection details in the `Login` class:
   - Update the `url` variable with the JDBC URL of your MySQL database. (e.g., `jdbc:mysql://localhost:0000/your-database-name`)
   - Update the `dbUsername` and `dbPassword` variables with your MySQL database credentials.

   ```java
   private boolean authenticateUser(String username, String password) {
       String url = "jdbc:mysql://your-hostname:your-port/your-database-name";
       String dbUsername = "your-username";
       String dbPassword = "your-password";

       // ...
   }
   ```

5. Build and run the project. The login page will appear.

6. Enter the username and password to authenticate against the MySQL database.


Make sure to replace the placeholders (`your-hostname`, `your-port`, `your-database-name`, `your-username`, `your-password`) with the appropriate information for your MySQL database.
