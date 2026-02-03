# JFS TASK 4: JAVA ADVANCE - EXCEPTION & COLLECTION
## Execution, Problem Guide & Output

> **Note:** Implementation includes **HashMap** and **Stack** which was beyond current classwork.

---

## 🛠️ Task A: Student Validation System (Custom Exceptions)

**Description:** Implementation of a student management system that validates input data using user-defined exception classes.

### 🚀 Execution
1. **Compile:** `javac student/validation/system/*.java`
2. **Run:** `java student.validation.system.Main`

### 📝 Problem Statement
Ramesh is developing a student management system. You are asked to handle exceptions according to the following scenarios:
* **Attributes:** Create a class `Student` with `Roll No`, `Name`, `Age`, and `Course`. Initialize via parameterized constructors.
* **Age Validation:** If Age is not between 15 and 21, generate a user-defined exception `AgeNotWithinRangeException`.
* **Name Validation:** If Name contains numbers or special symbols, raise `NameNotValidException`.



---

## 🗳️ Task B: Voter Eligibility (Constructor Exceptions)

**Description:** A system to validate voter registration based on age criteria using exception handling within a constructor.

### 🚀 Execution
1. **Compile:** `javac voter/eligibility/*.java`
2. **Run:** `java voter.eligibility.Main`

### 📝 Problem Statement
Create a class `Voter(voterId, name, age)` with a parameterized constructor.
* **Logic:** The constructor should throw a checked/unchecked exception if age is less than 18.
* **Message:** `"invalid age for voter"`.



---

## 📅 Task C: Weekday Lookup (Array Bounds Handling)

**Description:** A program that maps integers to weekdays while protecting against invalid index inputs.

### 🚀 Execution
1. **Compile:** `javac weekday/lookup/*.java`
2. **Run:** `java weekday.lookup.Main`

### 📝 Problem Statement
* **Storage:** Store weekday names in an array (Sunday at index 0).
* **Logic:** Request a day position (0-6) from the user and print the name.
* **Exception:** Handle `ArrayIndexOutOfBoundsException` with a proper message if the user enters an index outside the 0-6 range.



---

## 🎓 Task D: Student Grade Tracker (HashMap Application)

**Description:** Management of student records using a Map collection for efficient data retrieval.

### 🚀 Execution
1. **Compile:** `javac student/grade/tracker/*.java`
2. **Run:** `java student.grade.tracker.Main`

### 📝 Problem Statement
Create a `HashMap` where Keys are Student Names (String) and Values are Grades (Integer).
* **Functionalities:** Create methods to add a new student, remove a student, and display a student's grade by name.



---

## 📚 Task E: Integer Stack Manager (Collection Classes)

**Description:** Implementation of a Stack data structure using Java's Collection Framework.

### 🚀 Execution
1. **Compile:** `javac integer/stack/manager/*.java`
2. **Run:** `java integer.stack.manager.Main`

### 📝 Problem Statement
Use Collection Classes to store Integers. Create methods for:
* **Pushing:** Elements onto the stack.
* **Popping:** Elements from the stack.
* **Empty Check:** Checking if the stack is empty.



---

## 🏁 Summary of Concepts Used
| Category | Concepts Applied |
| :--- | :--- |
| **Exceptions** | `try-catch`, `throw`, `throws`, Custom Exception Classes |
| **Collections** | `HashMap`, `LinkedList` (as a Stack), `Map.Entry` |
| **OOPs** | Encapsulation, Parameterized Constructors, `final` classes |
| **I/O** | `Scanner` Class, Try-with-resources |