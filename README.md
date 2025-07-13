
# 🎓 Student Report Card Generator

A beginner-friendly Java console application that generates a student's report card using core Object-Oriented Programming (OOP) concepts. This project does **not use JDBC** or any external libraries—only **core Java**.

---

## 📌 Features

- Stores and displays student personal and academic details
- Calculates total marks, average, and grade
- Demonstrates OOP concepts: inheritance, encapsulation, and abstraction
- Console-based, clean output formatting

---

## 📁 Project Structure
```
Student-Report-Card-Generator/
├── src/
│ └── com/
│ └── Student/
│ ├── Main.java
│ ├── Person.java
│ ├── Student.java
│ ├── Subject.java
│ └── ReportCard.java
├── README.md
```


---

## 💡 OOP Concepts Used

- **Inheritance**: `Student` inherits from `Person`
- **Encapsulation**: Fields in `Subject` and `Student` are private with getters/setters
- **Abstraction**: Only relevant details are shown through `display` methods

---

## 📌 Sample Output

```
STUDENT DETAILS
Name : keerthana
Age : 20

DEPARTMENT DETAILS
Roll Number : 101
Department : Information Technology

ACADEMIC SCORES
Subject : English
Mark : 96
Subject : Tamil
Mark : 98
Subject : Maths
Mark : 90

Total Marks : 284
Average : 94
Grade : A
```
