# 🔐 Password Complexity Validator

### Using Core Java and Object-Oriented Programming (OOP)

![Java](https://img.shields.io/badge/Java-17-orange)
![OOP](https://img.shields.io/badge/OOP-Concepts-blue)
![Status](https://img.shields.io/badge/Project-Completed-green)

---

# 📌 Project Overview

The **Password Complexity Validator** is a simple Java-based application developed using **Object-Oriented Programming (OOP)** concepts. The main purpose of this project is to check whether a user's password meets the minimum security requirements before it can be accepted.

In today's digital world, passwords are the first line of defense against unauthorized access. Weak passwords can easily be guessed or cracked by attackers. Therefore, this project helps users create stronger passwords by validating them according to predefined security rules.

This project demonstrates practical implementation of:

✅ Classes and Objects

✅ Encapsulation

✅ Constructors

✅ String Manipulation

✅ Validation Logic

✅ Separation of Concerns

---

# 🎯 Objectives

The main objectives of this project are:

🔹 To understand password security basics.

🔹 To implement Object-Oriented Programming concepts in Java.

🔹 To validate passwords using predefined rules.

🔹 To create a modular and reusable validation system.

🔹 To improve coding practices through proper class design.

🔹 To separate data storage from validation logic.

---

# ❓ Problem Statement

Many users choose weak passwords such as:

```text
123456
password
admin
welcome123
```

These passwords are vulnerable to:

🚨 Brute Force Attacks

🚨 Dictionary Attacks

🚨 Credential Theft

To reduce these security risks, a password validation system is required that checks whether a password satisfies minimum complexity requirements.

---

# ⚙️ Validation Rules

A password is considered **VALID** only if it satisfies all of the following conditions:

| Rule         | Requirement                 |
| ------------ | --------------------------- |
| 📏 Length    | Minimum 8 characters        |
| 🔢 Digit     | At least 1 numeric digit    |
| 🔠 Uppercase | At least 1 uppercase letter |

---

# 🏗️ Project Structure

```text
PasswordComplexityValidator
│
├── UserAccount.java
├── SecurityValidator.java
└── Main.java
```

---

# 🧩 Class Description

## 1️⃣ UserAccount Class

The **UserAccount** class is responsible for storing user information.

### Variables

```java
private String username;
private String password;
```

### Responsibilities

✅ Store username

✅ Store password

✅ Protect data using encapsulation

✅ Provide getter methods

### Methods

```java
getUsername()
getPassword()
```

---

## 2️⃣ SecurityValidator Class

The **SecurityValidator** class contains all password validation logic.

### Responsibilities

✅ Check password length

✅ Check numeric characters

✅ Check uppercase letters

✅ Return validation result

### Main Method

```java
public boolean isValid(UserAccount user)
```

The method receives a UserAccount object and checks whether the password follows all validation rules.

---

## 3️⃣ Main Class

The **Main** class acts as the entry point of the application.

### Responsibilities

✅ Take user input

✅ Create UserAccount object

✅ Call validation method

✅ Display result

---

# 🔄 Working Process

The system works in the following sequence:

### Step 1️⃣

User enters:

```text
Username
Password
```

⬇️

### Step 2️⃣

A UserAccount object is created.

⬇️

### Step 3️⃣

The object is passed to SecurityValidator.

⬇️

### Step 4️⃣

The validator checks:

✔ Password Length

✔ Numeric Digit

✔ Uppercase Letter

⬇️

### Step 5️⃣

Result is displayed:

```text
Password is VALID
```

OR

```text
Password is INVALID
```

---

# 🧠 Algorithm

### Step 1

Start Program

### Step 2

Accept Username

### Step 3

Accept Password

### Step 4

Create UserAccount Object

### Step 5

Pass Object to SecurityValidator

### Step 6

Check Password Length

### Step 7

Check Numeric Digit

### Step 8

Check Uppercase Letter

### Step 9

Return Result

### Step 10

Display Output

### Step 11

End Program

---


# 💻 Source Code Explanation

## UserAccount.java

This class stores user information.

### Constructor

```java
public UserAccount(String username, String password)
```

The constructor initializes username and password when an object is created.

Example:

```java
UserAccount user =
new UserAccount("gaurav","Gaurav123");
```

---

## SecurityValidator.java

This class validates the password.

### Password Length Check

```java
if(password.length() < 8)
```

This ensures the password contains at least 8 characters.

---

### Numeric Character Check

```java
Character.isDigit(ch)
```

Checks whether the character is a number.

Example:

```text
123
```

---

### Uppercase Character Check

```java
Character.isUpperCase(ch)
```

Checks whether the character is uppercase.

Example:

```text
A
B
C
```

---

### Final Validation

```java
return hasDigit && hasUppercase;
```

Password becomes valid only when all conditions are satisfied.

---

# 🧪 Test Cases

## Test Case 1

Input:

```text
Username: gaurav
Password: Gaurav123
```

Output:

```text
Password is VALID
```

✅ Passed

---

## Test Case 2

Input:

```text
Username: gaurav
Password: gaurav123
```

Output:

```text
Password is INVALID
```

❌ No uppercase letter

---

## Test Case 3

Input:

```text
Username: gaurav
Password: Gaurav
```

Output:

```text
Password is INVALID
```

❌ Length less than 8

---

## Test Case 4

Input:

```text
Username: gaurav
Password: PASSWORD
```

Output:

```text
Password is INVALID
```

❌ No numeric digit

---

# 🎓 OOP Concepts Used

## 🔒 Encapsulation

Data members are declared private.

```java
private String username;
private String password;
```

Benefits:

✅ Data Protection

✅ Controlled Access

✅ Better Security

---

## 📦 Class

A class acts as a blueprint.

Example:

```java
UserAccount
SecurityValidator
```

---

## 🎯 Object

Objects are instances of classes.

Example:

```java
UserAccount user =
new UserAccount("gaurav","Gaurav123");
```

---

## 🏗 Constructor

Used for initializing object data.

Example:

```java
UserAccount(String username,
String password)
```

---

## 🔄 Separation of Concerns

Each class performs only one responsibility.

### UserAccount

Stores data.

### SecurityValidator

Performs validation.

This makes the code cleaner and easier to maintain.

---

# ✅ Advantages

🎯 Easy to understand

🎯 Beginner friendly

🎯 Demonstrates OOP concepts

🎯 Improves password security

🎯 Modular design

🎯 Reusable code

🎯 Fast execution

🎯 Easy maintenance

---

# ⚠️ Limitations

❌ No special character validation

❌ No database integration

❌ No password encryption

❌ Console-based interface only

---

# 🚀 Future Enhancements

The project can be improved by adding:

### 🔐 Special Character Validation

Example:

```text
@
#
$
%
&
```

---

### 📊 Password Strength Meter

Show:

🟢 Strong

🟡 Medium

🔴 Weak

---

### 🗄 Database Integration

Store user information securely in MySQL.

---

### 🔑 Password Hashing

Encrypt passwords before storing them.

---

### 🖥 GUI Version

Develop using:

✅ Java Swing

✅ JavaFX

---

### 🤖 Smart Password Suggestions

Generate stronger password recommendations automatically.

---

# 🏁 Conclusion

The **Password Complexity Validator** successfully demonstrates the practical implementation of Java Object-Oriented Programming concepts while solving a real-world security problem.

The application validates passwords based on three important security criteria:

✔ Minimum Length

✔ Numeric Digit

✔ Uppercase Letter

The project improves programming skills, enhances understanding of OOP principles, and promotes secure password practices. The modular design ensures that the system can be easily expanded with additional security features in the future.

---

# 📚 References

📖 Herbert Schildt, *Java: The Complete Reference*, 12th Edition, McGraw-Hill.

📖 Oracle Java Documentation

🌐 https://docs.oracle.com

🌐 https://www.oracle.com/java/

🌐 Java SE Documentation

---

# 👨‍💻 Developed By

**Gaurav Gokhe**

B.Tech CSE (AI & ML)

Rungta International Skills University

Session: 2025–26

⭐ Project: Password Complexity Validator
