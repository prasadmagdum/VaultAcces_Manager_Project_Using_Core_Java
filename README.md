VaultAccess Manager Project (Core Java)
It is a Core Java application designed to securely manage and control access to confidential information. It provides a command-line interface for storing, retrieving, updating, and deleting sensitive data while ensuring secure user authentication.
 Features
 User Registration – Users can register by providing details such as ID, Name, Age, and Email. The system auto-generates a unique username and a secure password.
 Secure Login – Users can log in using their username and password. Credentials are verified for authentication.
 Logout – Users can securely log out of the system.
 Secure Password Generation – Generates a strong password containing uppercase letters, lowercase letters, numbers, and special characters.
 OOP Concepts – Implements object-oriented programming principles such as encapsulation and abstraction.
 Project Structure
The project consists of three main classes:

1Test.java (Main Class)
 Provides a console-based menu to interact with the system.
 Allows users to Register, Login, or Logout.

2️ User.java (Model Class)
 Represents a user with attributes:
 Registration ID

Name

Age

Email

Username (Auto-generated)

Password (Securely generated)

3️ Logbook.java (Authentication & Management Class)
Handles user operations:
register() – Registers a new user & generates credentials.

login(User u) – Verifies username & password.

logout() – Logs the user out and exits the system.

passGen() – Generates a strong password.

How to Run the Project

 Step 1: Compile Java Files

javac Test.java User.java Logbook.java

Step 2: Run the Application

java Test

Step 3: Follow On-Screen Prompts

Register – Enter your details to create an account.

Login – Enter the generated credentials.

Logout – Exit the system.

 Example Usage

 Registration:

Enter Registration ID: 101
Enter Name: John Doe
Enter Age: 25
Enter Email: johndoe@example.com

 Generated Credentials:

Username: John@logbook
Password: A1b2C3d4

 Login:

Enter Username: John@logbook
Enter Password: A1b2C3d4
Login Successful!

 Logout:

Logging out... Goodbye!

