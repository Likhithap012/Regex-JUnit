# Regex-JUnit

# User Registration Validator 

This project provides a complete **Java-based validation system** for user registration fields using **JUnit 5 parameterized tests**. It ensures that all inputs conform to the business requirements from the User Registration Problem (UC1 to UC9), including custom email test cases.

---

## 📌 Features Covered

### 🔹 Name Validation
- Starts with a **capital letter**
- Minimum **3 characters**

### 🔹 Email Validation
- Mandatory parts: username, domain, and TLD (e.g., `abc@bl.co`)
- Optional subdomains (e.g., `abc.xyz@bl.co.in`)
- Covers **valid** and **invalid** real-world email formats

### 🔹 Mobile Number Validation
- Accepts:
  - `9876543210` ✅
  - `91 9876543210` ✅
- Rejects:
  - `91-9876543210`, `12345`, `91 12345678901`, etc. ❌

### 🔹 Password Validation
- Minimum **8 characters**
- At least **1 uppercase**
- At least **1 digit**
- **Exactly 1 special character** from `@#$%^&+=`

---

## 🚀 Getting Started

### ✅ Prerequisites

- Java 8 or higher
- Maven or Gradle
- IDE (e.g., IntelliJ IDEA / Eclipse) or CLI

### 🔧 Maven Dependency

Add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>
````

### 📥 How to Clone the Repository

To get a copy of the project on your local machine, run the following command:

```bash
git clone https://github.com/Likhithap012/Regex-JUnit.git
```

