# VaultAcces_Manager_Project_Using_Core_Java
VaultAccess Manager is a Core Java application that securely manages and controls access to confidential information through a command-line interface for storing, retrieving, updating, and deleting sensitive data.


Overview
The Vault Access Manager is a simple Java-based application that allows users to register, log in, and log out. The application is designed with basic functionalities to handle user registration, secure password generation, and authentication. This project is a demonstration of core Java concepts such as object-oriented programming, user input handling, and random number generation.

Features
User Registration: Allows a new user to register by providing basic information such as registration ID, name, age, and email. The username is auto-generated, and a secure random password is provided.

Login: Registered users can log in using their username and password. The login system verifies the credentials and allows access upon successful verification.

Logout: Users can log out of the system.

Project Structure
The project consists of three primary classes:

Test - The main class that provides a user interface to interact with the system.
User - A model class representing the user's details.
Logbook - Handles the registration, login, and logout processes.
Classes
Test.java
This class contains the main method and provides the console-based menu for the application. The user can select options to register, log in, or log out.

User.java
This is the model class that represents a user. It contains the user's registration ID, name, age, email, username, and password.

Logbook.java
This class contains methods for:

register() - Registers a new user and generates a username and password.
login(User u) - Authenticates the user based on username and password.
logout() - Logs the user out of the system and exits the application.
passGen() - Generates a secure random password consisting of uppercase letters, lowercase letters, numbers, and special characters.
How to Run
Compile the Java files:

sh
Copy code
javac Test.java User.java Logbook.java
Run the application:

sh
Copy code
java Test
Follow the on-screen prompts to register, log in, or log out.

Example Usage
Register a new user:

Input your registration ID, name, age, and email.
The system generates a username (based on the name) and a random password.
Example:
makefile
Copy code
Username: John@logbook
Password: A1b2C3d4
Login:

Enter the username and password provided during registration.
If credentials are correct, a success message is displayed.
Logout:

Exits the application.
Security Considerations
The password generation includes a mix of uppercase letters, lowercase letters, numbers, and special characters, ensuring a strong password.
The Scanner class is used for user input, and care is taken to manage newline characters after numeric inputs.
Future Enhancements
Implement password encryption for storage.
Add multi-user support by storing user data in a database or a file.
Enhance the user interface to include a graphical UI.
Implement additional security features like password reset and account lockout after multiple failed login attempts.
